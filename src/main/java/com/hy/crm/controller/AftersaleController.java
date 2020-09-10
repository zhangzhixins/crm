package com.hy.crm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Aftersale;
import com.hy.crm.pojo.vo.AftersaleExt;
import com.hy.crm.pojo.vo.AftersaleExt1;
import com.hy.crm.pojo.vo.TypeExt;
import com.hy.crm.service.IAftersaleService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 售后服务表 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
@RequestMapping("/aftersale")
public class AftersaleController {

    @Autowired
    IAftersaleService aftersaleService;

    @RequestMapping("/queryAll.do")
    @ResponseBody
    public MsgUtils queryAll(TypeExt typeExt,String val,String keyWord,Integer page,Integer limit){
        IPage<AftersaleExt> iPage=aftersaleService.queryAll(val,keyWord,page,limit,typeExt);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("查询成功");
        msgUtils.setCount(Integer.parseInt(String.valueOf(iPage.getTotal())));
        msgUtils.setData(iPage.getRecords());
        return msgUtils;
    }


    @RequestMapping("/insert.do")
    @ResponseBody
    public MsgUtils insert(AftersaleExt1 aftersale){
        System.out.println("=========="+aftersale.getCliid());
        aftersale.setState("1001");
        boolean bol=aftersaleService.save(aftersale);
        MsgUtils msgUtils = new MsgUtils();
        if(bol==false){
            msgUtils.setCode("1");
            msgUtils.setMsg("查询失败");
        }else {
            msgUtils.setCode("0");
            msgUtils.setMsg("查询成功");
        }
        return msgUtils;
    }

    @RequestMapping("/conut.do")
    @ResponseBody
    public MsgUtils queryCount(){
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("查询成功");
        msgUtils.setData(aftersaleService.queryCount());
        return msgUtils;
    }

    @RequestMapping("/queryById.do")
    public String queryById(Integer aftid, Model model){
        System.out.println("=======进入查询准备跳转页面");
        model.addAttribute("aftersale",aftersaleService.queryById(aftid));
        return "html/aftersalesprt";
    }
}
