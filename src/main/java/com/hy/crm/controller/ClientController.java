package com.hy.crm.controller;

import com.hy.crm.pojo.Client;
import com.hy.crm.pojo.Finance;
import com.hy.crm.service.IClientService;
import com.hy.crm.service.IFinanceService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


    @GetMapping(value = "/queryadd.do")
    @ResponseBody
    public MsgUtils queryAdd(Client client, Finance finance) {
        clientService.save(client);
        iFinanceService.save(finance);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("添加成功");
        return msgUtils;
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

    @RequestMapping("idcli.do")
    @ResponseBody
    public MsgUtils idcli(String cliid){
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("添加成功");
        msgUtils.setData(clientService.getById(cliid));
        return msgUtils;
    }
}
