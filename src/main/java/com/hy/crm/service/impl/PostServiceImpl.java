package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.crm.mapper.BusinessMapper;
import com.hy.crm.mapper.PostMapper;
import com.hy.crm.mapper.ReplyMapper;
import com.hy.crm.mapper.UserMapper;
import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.Post;
import com.hy.crm.pojo.Reply;
import com.hy.crm.pojo.User;
import com.hy.crm.pojo.vo.PostExt;
import com.hy.crm.pojo.vo.PostExt1;
import com.hy.crm.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 帖子表（针对哪一个商机发布的帖子） 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {
     @Autowired
     private PostMapper postMapper;
     @Autowired
     private BusinessMapper businessMapper;
     @Autowired
     private UserMapper userMapper;
     @Autowired
     private ReplyMapper replyMapper;

    @Override
    public List<PostExt> querypost(Integer page, Integer limit, Post post) {
        if(page==null && page.equals("")){
            page=1;
        }
        Page page1=new Page(page,limit);
        IPage<Post>  iPage=postMapper.querypost(page1,post);
        List<PostExt> listpostExt=new ArrayList<>();
        for(Post pos:iPage.getRecords()){
           Business bus =businessMapper.selectById(pos.getBusid());
           User use =userMapper.selectById(pos.getSendid());
           Integer replyes=replyMapper.countreply(pos.getPostid());
           PostExt postExt1=new PostExt(pos,bus,use,replyes);
           listpostExt.add(postExt1);
        }
       return listpostExt;
    }

    @Override
    public PostExt1 updpost(Post post) {
        List<User> use=new ArrayList();
        List<Reply> reply= new ArrayList();
        Integer replylis=0;
        if (post.getNum()!=null && !post.getNum().equals("")){
            post.setNum(post.getNum()+1);
            boolean uppost =postMapper.updpost(post);
            if (uppost){
                post=postMapper.selectById(post.getPostid());
                use=userMapper.selectList(null);
                reply=replyMapper.queryid(post.getPostid());
                replylis=replyMapper.countreply(post.getPostid());

            }
        }else {
            if (post.getPostid()!=null && !post.getPostid().equals("")){
                post=postMapper.selectById(post.getPostid());
                use=userMapper.selectList(null);
                reply=replyMapper.queryid(post.getPostid());
                replylis=replyMapper.countreply(post.getPostid());
            }
        }
        PostExt1 postExt1=new PostExt1(post,use,reply,replylis);
        return postExt1;
    }
}
