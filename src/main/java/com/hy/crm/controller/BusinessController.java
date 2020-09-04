package com.hy.crm.controller;

import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.Client;
import com.hy.crm.service.IBusinessService;
import com.hy.crm.service.IClientService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
