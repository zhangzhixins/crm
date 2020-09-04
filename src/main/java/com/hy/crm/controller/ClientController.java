package com.hy.crm.controller;

import com.hy.crm.pojo.Client;
import com.hy.crm.pojo.Finance;
import com.hy.crm.service.IClientService;
import com.hy.crm.service.IFinanceService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
public class ClientController {
    @Autowired
    private IClientService iClientService;

    @Autowired
    private IFinanceService iFinanceService;

    @GetMapping(value = "/queryadd.do")
    @ResponseBody
    public MsgUtils queryAdd(Client client, Finance finance) {
        iClientService.save(client);
        iFinanceService.save(finance);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("添加成功");
        return msgUtils;
    }
}
