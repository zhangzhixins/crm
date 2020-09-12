package com.hy.crm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.vo.ContractExt;
import com.hy.crm.pojo.vo.TypeExt1;
import com.hy.crm.service.IContractService;
import com.hy.crm.service.IDocumentaryService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
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
    @RequestMapping("/querycon.do")
    @ResponseBody
    public MsgUtils querycon(Integer page, Integer limit, Contract contract, TypeExt1 typeExt1){
        List<ContractExt> con=contractService.querycon(page,limit,contract,typeExt1);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("查询成功");
        msgUtils.setCount(con.size());
        msgUtils.setData(con);
        return msgUtils;
    }


    @RequestMapping("/addcon.do")
    public String addcon(Contract contract){
        contract.setNewtime(new Date());
        contract.setState(1001);
        contractService.save(contract);
        return "html/contract.html";
    }

    @RequestMapping("/conut.do")
    @ResponseBody
    public MsgUtils queryCount(){
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("查询成功");
        msgUtils.setData(contractService.queryCount());
        return msgUtils;
    }

    @RequestMapping("/updcontract.do")
    public String updcontract(Model model,Contract contract){
        contract =contractService.getById(contract.getConid());
        model.addAttribute("con",contract);
        return  "/html/updcontract.html";
    }

    @RequestMapping("/updcon.do")
    public String updatecon(Contract contract){
        contractService.updateById(contract);
        return "html/contract.html";
    }




}
