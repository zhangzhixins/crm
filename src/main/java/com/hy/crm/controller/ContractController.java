package com.hy.crm.controller;


import com.hy.crm.pojo.Contract;
import com.hy.crm.service.IContractService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 合同表 前端控制器
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Controller
@RequestMapping("//contract")
public class ContractController {

    @Autowired
    IContractService contractService;

    @RequestMapping("/query.do")
    @ResponseBody
    public MsgUtils query(Integer cliid){
        List<Contract> list = contractService.queryContract(cliid);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("查询成功");
        msgUtils.setData(list);
        return msgUtils;
    }

    @RequestMapping("/queryById.do")
    @ResponseBody
    public MsgUtils queryById(Integer conid){
        Contract contract=contractService.getById(conid);
        System.out.println("============================"+contract.getConserial());
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("查询成功");
        msgUtils.setData(contract);
        return msgUtils;
    }

}
