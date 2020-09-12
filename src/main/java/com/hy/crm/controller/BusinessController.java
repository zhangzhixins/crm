package com.hy.crm.controller;

import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.Client;
import com.hy.crm.pojo.vo.BusinessExt;
import com.hy.crm.pojo.vo.BusinessExt1;
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

import java.text.SimpleDateFormat;
import java.util.Date;
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
    public MsgUtils queryAdd(Client client, Business business) throws Exception {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = sdf.format(date);
        Date time=sdf.parse(nowTime);

            client.setNewtime(time);
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
    public Layui queryAll(Integer limit, Integer page, Business business) {
        List<BusinessExt1> iPage=iBusinessService.QueryBusiness(limit,page,business);
        Layui layui = new Layui();
        layui.setCode(0);
        layui.setMsg(":");
        layui.setCount(iPage.size());
        layui.setData(iPage);
        return layui;
    }

   /* @GetMapping("/querylist.do")
    public String queryList(Model model,int busid){
         QueryWrapper queryWrapper=new QueryWrapper<>();
         queryWrapper.eq("busid",busid);
         Client client=iClientService.getOne(queryWrapper);
         Business business=iBusinessService.getOne(queryWrapper);
         model.addAttribute("client",client);
         model.addAttribute("business",business);
         return "/html/editbusiness.html";
    }*/
   @RequestMapping("/queryById.do")
   public String queryById(Model model,Integer busid){
       BusinessExt business = iBusinessService.queryById(busid);
       model.addAttribute("business",business);
       return "/html/editbusiness.html";
   }


    @GetMapping("/queryupdate.do")
    public String queryUpdate( Business business){
        iBusinessService.updateById(business);
        return "redirect:/html/business.html";
    }

}
