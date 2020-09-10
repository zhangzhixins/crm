package com.hy.crm.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.Client;
import com.hy.crm.service.IBusinessService;
import com.hy.crm.service.IClientService;
import com.hy.crm.service.IStateService;
import com.hy.crm.utils.Layui;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 商机表 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    private IClientService iClientService;

    @Autowired
    private IBusinessService iBusinessService;


    @Autowired
    private IStateService iStateService;


    @GetMapping(value = "/queryadd.do")
    @ResponseBody
    public MsgUtils queryAdd(Client client, Business business) {
        iClientService.save(client);
        iBusinessService.save(business);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("添加成功");
        return msgUtils;
    }

    @RequestMapping("ver.do")
    @ResponseBody
    public MsgUtils ver(String busname){
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("添加成功");
        msgUtils.setData(iBusinessService.verifyBusiness(busname));
        return msgUtils;
    }

    @RequestMapping("/queryAll.do")
    @ResponseBody
    public Layui queryAll(Layui layui,int limit, int page) {
        IPage<Business> page1 =iBusinessService.queryAll(limit,page);
        layui.setCode(0);
        layui.setMsg(":");
        layui.setCount(Integer.parseInt(String.valueOf(page1.getTotal())));
        layui.setData(page1.getRecords());
        return layui;
    }

    @GetMapping("/querylist.do")
    public String queryList(Model model,int cliid){
         QueryWrapper queryWrapper=new QueryWrapper<>();
         queryWrapper.eq("cliid",cliid);
         Client client=iClientService.getOne(queryWrapper);
         Business business=iBusinessService.getOne(queryWrapper);
         model.addAttribute("client",client);
         model.addAttribute("business",business);
         return "/html/editbusiness.html";
    }


}
