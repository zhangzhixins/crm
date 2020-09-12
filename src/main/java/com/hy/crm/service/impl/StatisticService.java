package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.mapper.*;
import com.hy.crm.pojo.User;
import com.hy.crm.pojo.vo.*;
import com.hy.crm.service.IBusinessService;
import com.hy.crm.service.IClientService;
import com.hy.crm.service.IContractService;
import com.hy.crm.service.IDocumentaryService;
import com.mysql.jdbc.StringUtils;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.ObjectUtils;

import java.text.NumberFormat;
import java.util.*;

@Service
@Transactional
public class StatisticService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    BusinessMapper businessMapper;

    @Autowired
    DocumentaryMapper documentaryMapper;

    @Autowired
    ContractMapper contractMapper;

    @Autowired
    IBusinessService businessService;

    @Autowired
    ClientMapper clientMapper;


    /**
     * 本周 本月  本季度  本年度
     * @param page
     * @param limit
     * @param key
     * @return
     */
    public List<StatisticsByTime> thisWeek(Integer page,Integer limit,Integer key){
            if(page==null){
                page=1;
            }
            if(limit==null){
                limit=4;
            }
            Page<Integer> page1 = new Page<>(page,limit);
            Integer key1=0;
            Integer key2=0;
            if(key==1){
                key1=0;
                key2=1;
            }else if(key==2){
                key1=2;
                key2=3;
            }else if(key==3){
                key1=4;
                key2=5;
            }else if(key==4){
                key1=6;
                key2=7;
            }
            //获取所有的时间
            List<String> list = businessService.listDate();
            //查询所有用户信息
            IPage<User> users = userMapper.queryCount(page1);
            List<StatisticsByTime> all = new ArrayList<>();
            for (User user : users.getRecords()) {
                StatisticsByTime sbt = new StatisticsByTime();
                //循环获取用户id
                sbt.setUserName(user.getUsername());
                //数据封装
                StatisticsByTime sbts = this.test(sbt,businessMapper,documentaryMapper,contractMapper,user.getUsername(),list.get(key1),list.get(key2));
                all.add(sbts);
            }
            return all;
    }

    /**
     * 封装的时间
     * @param sbt
     * @param businessMapper
     * @param documentaryMapper
     * @param contractMapper
     * @param name
     * @param thiss
     * @param pree
     * @return
     */
    public StatisticsByTime test(StatisticsByTime sbt,BusinessMapper businessMapper,DocumentaryMapper documentaryMapper,ContractMapper contractMapper,String name,String thiss,String pree){
        //查询商机数（本周）
        sbt.setBusinessThis(businessMapper.queryThis(name,thiss));
        //查询商机数（上周）
        sbt.setBusinessLast(businessMapper.queryThis(name,pree));
        //查询成交数（本周）
        sbt.setAccomplishThis(businessMapper.queryPre(name,thiss));
        //查询成交数（上周）
        sbt.setAccomplishLast(businessMapper.queryPre(name,pree));
        //查询跟单数（本周）
        sbt.setDocumentaryThis(documentaryMapper.queryThis(name,thiss));
        //查询跟单数（上周）
        sbt.setDocumentaryLast(documentaryMapper.queryThis(name,pree));
        //查询合同数（本周）
        sbt.setContractThis(contractMapper.queryThis(name,thiss));
        //查询合同数（上周）
        sbt.setContractLast(contractMapper.queryThis(name,thiss));
        return sbt;
    }


    /**
     * 按行业
     */
    public List<ByIndustryStatistics> queryBcountBmoney() {
        String[] str = new String[]{
            "IT|互联网|通信|电子",
            "房产|建筑建设|物业",
            "管理咨询|教育科研|中介服务",
            "加工制造|仪表设备",
            "金融|银行|保险",
            "酒店旅游",
            "能源矿产|石油化工",
            "消费零售|贸易|交通物流",
            "医药生物|医疗保健",
            "政府|非赢利机构|科研",
            "其他"};
        List<ByIndustryStatistics> list = businessMapper.queryBcountBmoney();
        List list1 = new ArrayList<>();
        if(list.size()>0){
            for(ByIndustryStatistics b:list){
                list1.add(b.getCliindustry());
            }
            for(int i=0;i<str.length;i++){
                if(!list1.contains(str[i])){
                    list.add(new ByIndustryStatistics(str[i],"0","0"));
                }
            }
        }else{
            for (int i = 0; i < str.length; i++) {
                list.add(new ByIndustryStatistics(str[i],"0","0"));
            }
        }
        return list;
    }

    /**
     * 按来源
     */
    public List<ByBusinessSource> queryBcountBmoneyByFrom() {
        String[] str = new String[]{
            "电话访问",
            "独立开发",
            "二次销售",
            "合作伙伴",
            "互联网",
            "客户介绍",
            "客户来电",
            "老客户",
            "媒体宣传"};
        List<ByBusinessSource> list = businessMapper.queryBcountBmoneyByFrom();
        List list1 = new ArrayList<>();
        if(list.size()>0){
            for(ByBusinessSource b:list){
                list1.add(b.getBusfrom());
            }
            if(!list1.contains(str[0])){
                list.add(new ByBusinessSource(str[0],"0","0.00"));
            }
            if(!list1.contains(str[1])){
                list.add(new ByBusinessSource(str[1],"0","0.00"));
            }
            if(!list1.contains(str[2])){
                list.add(new ByBusinessSource(str[2],"0","0.00"));
            }
            if(!list1.contains(str[3])){
                list.add(new ByBusinessSource(str[3],"0","0.00"));
            }
            if(!list1.contains(str[4])){
                list.add(new ByBusinessSource(str[4],"0","0.00"));
            }
            if(!list1.contains(str[5])){
                list.add(new ByBusinessSource(str[5],"0","0.00"));
            }
            if(!list1.contains(str[6])){
                list.add(new ByBusinessSource(str[6],"0","0.00"));
            }
            if(!list1.contains(str[7])){
                list.add(new ByBusinessSource(str[7],"0","0.00"));
            }
            if(!list1.contains(str[8])){
                list.add(new ByBusinessSource(str[8],"0","0.00"));
            }
        }
        return list;
    }


    /**
     * 我的桌面查询数量
     */
    public List<Integer> allCount(){
        //客户的数量
        Integer cliCount = clientMapper.allCount();
        //商机的数量
        Integer busCount = businessMapper.allCount();
        //合同的数量
        Integer conCount = contractMapper.allCount();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(cliCount);
        list.add(busCount);
        list.add(conCount);
        return list;
    }


    /**
     * 查询我的桌面的状态的预计成交金额
     */
    public List<Sta> busState(){
        String[] str = new String[]{"已丢单","已成交","已搁置","进行中"};
        List<Sta> list= businessMapper.busState();
        List<Sta> list1 = new ArrayList<>();
        Sta sta = new Sta();
        sta.setState("进行中");
        Integer val=0;
        for (Sta s:list) {
            if(s.getState().equals("1009") || s.getState().equals("1008") || s.getState().equals("1010") ){
                if(s.getState().equals("1009")){
                    s.setState("已丢单");
                    list1.add(s);
                }
                if(s.getState().equals("1008")){
                    s.setState("已成交");
                    list1.add(s);
                }
                if(s.getState().equals("1010")){
                    s.setState("已搁置");
                    list1.add(s);
                }
            }else{
                val=s.getSta()+val;
            }
        }
        sta.setSta(val);
        list1.add(sta);
        ArrayList<String> list2 = new ArrayList<>();
        for (Sta ss:list1) {
            list2.add(ss.getState());
        }
        for (int i = 0; i <str.length; i++) {
            if(!list2.contains(str[i])){
                Sta sta1 = new Sta();
                sta1.setState(str[i]);
                sta1.setSta(0);
                list1.add(sta1);
            }
        }
        return  list1;
    }


    /*商机销售漏斗*/
    public List<BusFunnel> busFunnel(Integer key){
        //时间
        List<String> list = businessService.listDate();
        //存数据
        ArrayList<BusFunnel> list1 = new ArrayList<>();
        //全部的数据 数量  金额
        BusFunnel busFunnel = businessMapper.allBusFunner();

        //本年度6上年度7本季度4上季度5   状态
        BusFunnel busFunnel1 = businessMapper.busFunner(1004,list.get(key) );
        if(busFunnel1.getCount()==null || busFunnel1.getCount()==0){
            busFunnel1.setCount(0);
            busFunnel1.setMoney(0);
            busFunnel1.setBaiFenJin("0%");
            busFunnel1.setBaiFenShu("0%");
        }else{
            busFunnel1.setBaiFenShu(baiFenShu(busFunnel1,busFunnel));//数量
            busFunnel1.setBaiFenJin(baiFenJin(busFunnel1,busFunnel));//金额
        }
        list1.add(busFunnel1);


        BusFunnel busFunnel2 = businessMapper.busFunner(1005,list.get(key) );
        if(busFunnel2.getCount()==null || busFunnel2.getCount()==0){
            busFunnel2.setCount(0);
            busFunnel2.setMoney(0);
            busFunnel2.setBaiFenJin("0%");
            busFunnel2.setBaiFenShu("0%");
        }else{
            busFunnel2.setBaiFenShu(baiFenShu(busFunnel2,busFunnel));//数量
            busFunnel2.setBaiFenJin(baiFenJin(busFunnel2,busFunnel));//金额
        }
        list1.add(busFunnel2);


        BusFunnel busFunnel3 = businessMapper.busFunner(1006,list.get(key) );
        if(busFunnel3.getCount()==null || busFunnel3.getCount()==0){
            busFunnel3.setCount(0);
            busFunnel3.setMoney(0);
            busFunnel3.setBaiFenJin("0%");
            busFunnel3.setBaiFenShu("0%");
        }else{
            busFunnel3.setBaiFenShu(baiFenShu(busFunnel3,busFunnel));//数量
            busFunnel3.setBaiFenJin(baiFenJin(busFunnel3,busFunnel));//金额
        }
        list1.add(busFunnel3);


        BusFunnel busFunnel4 = businessMapper.busFunner(1007,list.get(key) );
        if(busFunnel4.getCount()==null || busFunnel4.getCount()==0){
            busFunnel4.setCount(0);
            busFunnel4.setMoney(0);
            busFunnel4.setBaiFenJin("0%");
            busFunnel4.setBaiFenShu("0%");
        }else{
            busFunnel4.setBaiFenShu(baiFenShu(busFunnel4,busFunnel));//数量
            busFunnel4.setBaiFenJin(baiFenJin(busFunnel4,busFunnel));//金额
        }
        list1.add(busFunnel4);


        BusFunnel busFunnel5 = businessMapper.busFunner(1008,list.get(key) );
        if(busFunnel5.getCount()==null || busFunnel5.getCount()==0){
            busFunnel5.setCount(0);
            busFunnel5.setMoney(0);
            busFunnel5.setBaiFenJin("0%");
            busFunnel5.setBaiFenShu("0%");
        }else{
            busFunnel5.setBaiFenShu(baiFenShu(busFunnel5,busFunnel));//数量
            busFunnel5.setBaiFenJin(baiFenJin(busFunnel5,busFunnel));//金额
        }
        list1.add(busFunnel5);

        System.out.println("=-=-=-=-=-="+list1.size());
        return list1;
    }

    public String baiFenShu(BusFunnel b1,BusFunnel b2){
        //转百分比
        NumberFormat nf  =  NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits( 2 );
        double b=Double.parseDouble(String.valueOf(b1.getCount()))/Double.parseDouble(String.valueOf(b2.getCount()));
        String st  =  nf.format(b);
        return st;
    }

    public String baiFenJin(BusFunnel b1,BusFunnel b2){
        //转百分比
        NumberFormat nf  =  NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits( 2 );
        double b=Double.parseDouble(String.valueOf(b1.getMoney()))/Double.parseDouble(String.valueOf(b2.getMoney()));
        String st  =  nf.format(b);
        return st;
    }
}
