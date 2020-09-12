package com.hy.crm.controller;

import com.hy.crm.mapper.BusinessMapper;
import com.hy.crm.pojo.vo.*;
import com.hy.crm.service.IBusinessService;
import com.hy.crm.service.IContractService;
import com.hy.crm.service.IDocumentaryService;
import com.hy.crm.service.impl.StatisticService;
import com.hy.crm.utils.MsgUtils;
import com.hy.crm.utils.Tong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/statistic")
public class StatisticController {

    @Autowired
    IBusinessService businessService;

    @Autowired
    IDocumentaryService documentaryService;

    @Autowired
    IContractService contractService;

    @Autowired
    StatisticService statisticService;

    /**
     * 我的统计
     */
    @RequestMapping("/myStatistic.do")
    @ResponseBody
    public Tong myStatistic(){
        //商机数
        MyStatistic bus = businessService.selectCount();
        //商机成交数
        MyStatistic makeBus = businessService.selectMake();
        //跟单数
        MyStatistic doc = documentaryService.selectCount();
        //合同数
        MyStatistic con = contractService.selectCount();
        Tong tong = new Tong();
        tong.setCode("0");
        tong.setBus(bus);
        tong.setMakeBus(makeBus);
        tong.setDoc(doc);
        tong.setCon(con);
        return tong;
    }

    /**
     * 本周统计
     */
    @RequestMapping("/thisWeek.do")
    @ResponseBody
    public MsgUtils thisWeek(Integer page,Integer limit,Integer key){
        List<StatisticsByTime> list=statisticService.thisWeek(page,limit,key);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("成功");
        msgUtils.setCount(list.size());
        msgUtils.setData(list);
        return msgUtils;
    }


    /**
     * 按行业
     */
    @RequestMapping("/industry.do")
    @ResponseBody
    public MsgUtils byindustry(){
        List<ByIndustryStatistics> byIndustryStatistics = statisticService.queryBcountBmoney();
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("成功");
        msgUtils.setCount(byIndustryStatistics.size());
        msgUtils.setData(byIndustryStatistics);
        return msgUtils;
    }

    /**
     * 按来源分
     * @return
     */
    @RequestMapping("/source.do")
    @ResponseBody
    public MsgUtils bysource(){
        List<ByBusinessSource> byBusinessSources = statisticService.queryBcountBmoneyByFrom();
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("成功");
        msgUtils.setCount(byBusinessSources.size());
        msgUtils.setData(byBusinessSources);
        return msgUtils;
    }

    /**
     * 我的桌面统计
     * 全部客户数量
     * 全部商机数量
     * 全部合同数量
     */
    @RequestMapping("/allCount.do")
    @ResponseBody
    public MsgUtils allCount(){
        List<Integer> lis = statisticService.allCount();
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setMsg("成功");
        msgUtils.setCode("0");
        msgUtils.setCount(lis.size());
        msgUtils.setData(lis);
        return msgUtils;
    }


    /**
     * 我的桌面饼状图
     */
    @RequestMapping("/busState.do")
    @ResponseBody
    public MsgUtils busState(){
        List<Sta> list=statisticService.busState();
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("成功");
        msgUtils.setCount(list.size());
        msgUtils.setData(list);
        return  msgUtils;
    }


    /*商机销售漏斗*/
    @RequestMapping("/busFunnel.do")
    @ResponseBody
    public MsgUtils busFunnel(Integer key){
        System.out.println("keykeykeykey"+key);
        List<BusFunnel> list = statisticService.busFunnel(key);
        MsgUtils msgUtils = new MsgUtils();
        msgUtils.setCode("0");
        msgUtils.setMsg("成功");
        msgUtils.setCount(list.size());
        msgUtils.setData(list);
        return msgUtils;
    }

}
