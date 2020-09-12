package com.hy.crm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Documentary;
import com.hy.crm.pojo.Post;
import com.hy.crm.pojo.Reply;
import com.hy.crm.pojo.vo.PostExt;
import com.hy.crm.pojo.vo.PostExt1;
import com.hy.crm.service.IPostService;
import com.hy.crm.service.IReplyService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 帖子表（针对哪一个商机发布的帖子） 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
@RequestMapping("/post")
public class PostController {
    @Autowired
    private IPostService iPostService;
    @Autowired
    private IReplyService iReplyService;

    @RequestMapping("/addpost.do")
    @ResponseBody
    public  String addpost(Post post){
        post.setNewtime(new Date());
        post.setNum(1);
        post.setSendid(2);
        post.setUpdtime(new Date());
        iPostService.save(post);
        return "redirect:/html/post.html";
    }
    @RequestMapping("/post.do")
    @ResponseBody
    public  MsgUtils addpost(Integer page, Integer limit,Post post){
        List<PostExt> postlist =iPostService.querypost(page,limit,post);
        MsgUtils msg=new MsgUtils();
        msg.setCode("0");
        msg.setMsg("post");
        msg.setCount(postlist.size());
        msg.setData(postlist);
        return msg;
    }


    @RequestMapping("/updatepost.do")
    public  String  updatepost(Model model, Post post ){
        PostExt1 listpost=iPostService.updpost(post);
        model.addAttribute("p",listpost);
        return "/html/updpost.html";

    }
    @RequestMapping("/addreply.do")
    public  String  addreply(Reply reply){
        reply.setReplytime(new Date());
         iReplyService.save(reply);
        return "/post/updatepost.do?postid="+reply.getPostid();

    }
    @RequestMapping("/delpost.do")
    public  String  delpost(Integer postid){
        iPostService.removeById(postid);
        return "/html/updpost.html";

    }


}
