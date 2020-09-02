package com.hy.crm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.vo.AftersaleExt;
import com.hy.crm.service.IAftersaleService;
import com.hy.crm.utils.MsgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public MsgUtils queryAll(String val,String keyWord,Integer page,Integer limit){
        IPage<AftersaleExt> iPage=aftersaleService.queryAll(val,keyWord,page,limit);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("查询成功");
        msgUtils.setCount(Integer.parseInt(String.valueOf(iPage.getTotal())));
        msgUtils.setData(iPage.getRecords());
        return msgUtils;
    }
}
