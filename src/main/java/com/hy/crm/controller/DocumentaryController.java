package com.hy.crm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.Documentary;
import com.hy.crm.service.IBusinessService;
import com.hy.crm.service.IDocumentaryService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Date;

/**
 * <p>
 * 跟单表（跟单不能修改） 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
@RequestMapping("/documentary")
public class DocumentaryController {
    @Autowired
    private IDocumentaryService iDocumentaryService;
    @Autowired
    private IBusinessService iBusinessService;


    /*添加跟单*/
    @RequestMapping("/adddoc.do")
    @ResponseBody
    public void adddocumentary(Documentary documentary,String theme){
        documentary.setState("初期沟通");
        documentary.setNewtime(new Date());
        documentary.setDocname(theme+"-"+documentary.getDocify());
        iDocumentaryService.save(documentary);
    }


    /*跟单查询*/
    @RequestMapping("/selectdoc.do")
    @ResponseBody
    public MsgUtils selectDocumentary(Integer page, Integer limit, Documentary documentary){
        IPage<Documentary> doclist =iDocumentaryService.selectdoc(page,limit,documentary);
        MsgUtils msg=new MsgUtils();
        msg.setCode("0");
        msg.setMsg("doc");
        msg.setCount(Integer.parseInt(String.valueOf(doclist.getTotal())));
        msg.setData(doclist.getRecords());
        return msg;
    }


    /*商机查询*/
    @RequestMapping("/selectbusiness.do")
    @ResponseBody
    public MsgUtils selectBusiness(){
        ArrayList<Business> buslist= (ArrayList<Business>) iBusinessService.list();
        MsgUtils msg=new MsgUtils();
        msg.setCode("0");
        msg.setMsg("doc");
        msg.setCount(buslist.size());
        msg.setData(buslist);
        return msg;
    }

    //根据id查询跟单记录
    @PostMapping("/idselectdoc.do")
    @ResponseBody
    public MsgUtils idselectdoc(Integer busid){
        System.out.println(busid);
        ArrayList<Documentary> docbus=iDocumentaryService.selectdocbus(busid);
        MsgUtils msg=new MsgUtils();
        msg.setCode("0");
        msg.setMsg("docbus");
        msg.setCount(docbus.size());
        msg.setData(docbus);
        return msg;
    }


}
