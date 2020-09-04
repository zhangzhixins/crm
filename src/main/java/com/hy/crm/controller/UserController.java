package com.hy.crm.controller;

import com.hy.crm.pojo.Layuiimg;
import com.hy.crm.pojo.User;
import com.hy.crm.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping(value = "/login.do")
    public  String sub(User user, Model model) throws UnsupportedEncodingException {
        System.out.println("他来了");
        System.out.println(user.getUsername()+user.getPwd()+"===");
        Subject subject= SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(new String(user.getUsername().getBytes("ISO-8859-1"),"utf-8"),user.getPwd());
        int count=0;
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            count++;
            model.addAttribute("msg","请检查您的名字是否符合要求");
        }catch (IncorrectCredentialsException ice){
            count++;
            model.addAttribute("msg","您的密码输入错误");
        }catch (ExcessiveAttemptsException eae){
            count ++;
            model.addAttribute("msg","您的登录已过时请重新登录");
        }
        if(count>0){
            return "html/abnormal.html";
        }

        return "redirect:/html/2.html";
    }

    @GetMapping(value = "/add.do")
    public String ss(User user, @RequestParam("filename") String card) {
        user.setImage(card);
        iUserService.save(user);
        return "redirect:/html/1.html";
    }

    @PostMapping("/imgag.do")
    @ResponseBody
    public Layuiimg img(@RequestParam("file") MultipartFile pictureFile, HttpServletRequest request, Model model) {
        Layuiimg layuiimg = new Layuiimg();
        try {
            // 图片上传设置图片名称，不能重复，可以使用uuid
            String picName = UUID.randomUUID().toString();
            // 获取文件名
            String oriName = pictureFile.getOriginalFilename();
            // 获取图片后缀
            String extName = oriName.substring(oriName.lastIndexOf("."));

            String webpath = request.getServletContext().getRealPath("/");
            webpath = webpath.substring(0, webpath.lastIndexOf("\\"));
            webpath = webpath.substring(0, webpath.lastIndexOf("\\"));
            File rootFile = new File(webpath);
            File uploadFile = new File(rootFile, "image");
            if (!uploadFile.exists()) {
                uploadFile.mkdir();
            }
            // 开始上传
            pictureFile.transferTo(new File(webpath + File.separator + "image" + File.separator + picName + extName));
            layuiimg.setCode("200");
            layuiimg.setData(File.separator + picName + extName);
            layuiimg.setMsg("成功");
            return layuiimg;
        } catch (IOException e) {
            layuiimg.setCode("405");
            layuiimg.setMsg("失败");
            e.printStackTrace();
        }
        return layuiimg;
    }
}
