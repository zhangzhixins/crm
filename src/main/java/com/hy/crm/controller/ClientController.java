package com.hy.crm.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hy.crm.pojo.Client;
import com.hy.crm.pojo.Finance;
import com.hy.crm.pojo.vo.ClientExt2;
import com.hy.crm.service.IClientService;
import com.hy.crm.service.IFinanceService;
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
 * 客户表 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
@RequestMapping("//client")
public class ClientController {

    @Autowired
    IClientService clientService;

    @Autowired
    private IFinanceService iFinanceService;


    @RequestMapping("/query.do")
    @ResponseBody
    public MsgUtils query(){
        MsgUtils msgUtils = new MsgUtils();
        List<Client> list=clientService.list();
        msgUtils.setCode("0");
        msgUtils.setMsg("查询成功");
        msgUtils.setData(list);
        return msgUtils;
    }

    @RequestMapping("/queryAll.do")
    @ResponseBody
    public Layui queryAllClinet(Integer limit, Integer page,ClientExt2 clientExt2) {
        List<ClientExt2> iPage=clientService.QueryBusinesss(limit,page,clientExt2);
        Layui layui = new Layui();
        layui.setCode(0);
        layui.setMsg(":");
        layui.setCount(iPage.size());
        layui.setData(iPage);
        return layui;
    }


    @GetMapping(value = "/queryadd.do")
    @ResponseBody
    public String queryAdd(Client client, Finance finance) {
        clientService.save(client);
        QueryWrapper queryWrapper=new  QueryWrapper<>();
        queryWrapper.eq("cliname",client.getCliname());
        Client client1=clientService.getOne(queryWrapper);
        int cli=client1.getCliid();
        finance.setCliid(cli);
        iFinanceService.save(finance);

        return "redirect:client.html";
    }


    @RequestMapping("verify.do")
    @ResponseBody
    public MsgUtils verify(String cliname){
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("添加成功");
        msgUtils.setData(clientService.verifyClient(cliname));
        return msgUtils;
    }

    @GetMapping("/querylist.do")
    public String queryList(Model model, int cliid){
        QueryWrapper queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cliid",cliid);
        Client client=clientService.getOne(queryWrapper);
        Finance finance=iFinanceService.getOne(queryWrapper);
        model.addAttribute("client",client);
        model.addAttribute("finance",finance);
        return "/html/editclient.html";
    }

    @GetMapping("/queryupdate.do")
    public String queryUpdate( Client client,Finance finance){
        clientService.updateById(client);
        iFinanceService.updateById(finance);
        return "redirect:client.html";
    }


    @RequestMapping("idcli.do")
    @ResponseBody
    public MsgUtils idcli(Integer cliid){
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("添加成功");
        msgUtils.setData(clientService.getById(cliid));
        return msgUtils;
    }

    @GetMapping("/querylist.do")
    public String queryList(Model model, int cliid){
        QueryWrapper queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("cliid",cliid);
        Client client=clientService.getOne(queryWrapper);
        Finance finance=iFinanceService.getOne(queryWrapper);
        model.addAttribute("client",client);
        model.addAttribute("finance",finance);
        return "/html/editclient.html";
    }

    @GetMapping("/queryupdate.do")
    public String queryUpdate( Client client,Finance finance){
        clientService.updateById(client);
        iFinanceService.updateById(finance);
        return "redirect:client.html";
    }

    @RequestMapping("queryById.do")
    @ResponseBody
    public MsgUtils queryById(Integer cliid){
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("添加成功");
        msgUtils.setData(clientService.getById(cliid));
        return msgUtils;
    }
}
