package com.hy.crm.controller;

import com.hy.crm.utils.MsgUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @PostMapping("/upload.do")
    @ResponseBody
    public MsgUtils upload(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request){
        MsgUtils msgUtils=new MsgUtils();
        try {
            String str=load(multipartFile,request);
            System.out.println(str);
            msgUtils.setCode("0");
            msgUtils.setMsg("图片上传成功");
            msgUtils.setData(str);
        } catch (Exception e) {
            msgUtils.setCode("1");
            msgUtils.setMsg("图片上传失败");
            e.printStackTrace();
        }
        return msgUtils;
    }


    public String load(MultipartFile multipartFile, HttpServletRequest req) throws IOException {
        //图片名称
        String img = multipartFile.getOriginalFilename();
        //拿到后缀
        String end = img.substring(img.lastIndexOf("."));
        //读入服务器的地址
        File file = new File(new File(req.getServletContext().getRealPath("/")).getParent()+ "\\" + "image");
        System.out.println("========"+file.getAbsolutePath());
        //创建文件夹
        if (!file.exists()) {
            file.mkdir();
        }
        //避免名字重复
        String str = UUID.randomUUID().toString() + end;
        String filename = file + "\\" + str;
        //读入
        multipartFile.transferTo(new File(filename));
        return str;
    }
}
