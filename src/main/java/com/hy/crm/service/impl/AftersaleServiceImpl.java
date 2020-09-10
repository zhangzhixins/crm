package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.mapper.AftersaleMapper;
import com.hy.crm.pojo.Aftersale;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.vo.AftersaleExt;
import com.hy.crm.pojo.vo.ContractExt;
import com.hy.crm.pojo.vo.TypeExt;
import com.hy.crm.service.IAftersaleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * <p>
 * 售后服务表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
@Transactional
public class AftersaleServiceImpl extends ServiceImpl<AftersaleMapper, Aftersale> implements IAftersaleService {

    @Autowired
    AftersaleMapper aftersaleMapper;

    /**
     * 查询全部的售后服务
     */
    @Override
    public IPage<AftersaleExt> queryAll(String val, String keyWord, Integer page, Integer limit,TypeExt typeExt){
        if(null ==page){
            page=1;
        }
        Page<AftersaleExt> page1 = new Page<>(page,limit);
        IPage<AftersaleExt> iPage =aftersaleMapper.queryAll(page1,val,keyWord,typeExt);
        return iPage;
    }


    /**
     * 获取左边菜单栏的数量
     * @return
     */
    @Override
    public TypeExt queryCount(){
        ArrayList<String> lis = new ArrayList<>();
        lis.add(" state=1001");
        lis.add(" state=1002");
        lis.add(" state=1003");
        lis.add(" YEARWEEK( date_format(starttime,'%Y-%m-%d' ) ) = YEARWEEK( now() )");
        lis.add(" yearweek(date_format(starttime, '%Y-%m-%d'),1) = yearweek(now(),1)-1");
        lis.add(" DATE_FORMAT(starttime, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m')");
        lis.add(" date_format(starttime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m')");
        lis.add(" QUARTER(starttime)=QUARTER(now())");
        lis.add(" QUARTER(starttime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER))");
        TypeExt typeExt = new TypeExt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lis.size(); i++) {
            //传入日期函数 string
            list.add(aftersaleMapper.queryCount(lis.get(i)));
        }
        typeExt.setHand(String.valueOf(list.get(0)));
        typeExt.setEnd(String.valueOf(list.get(1)));
        typeExt.setWithdraw(String.valueOf(list.get(2)));
        typeExt.setThisweek(String.valueOf(list.get(3)));
        typeExt.setPreweek(String.valueOf(list.get(4)));
        typeExt.setThismonth(String.valueOf(list.get(5)));
        typeExt.setPremonth(String.valueOf(list.get(6)));
        typeExt.setThisseason(String.valueOf(list.get(7)));
        typeExt.setPreseason(String.valueOf(list.get(8)));
        return typeExt;
    }


    @Override
    public AftersaleExt queryById(Integer aftid){
       /* AftersaleExt aftersaleExt=aftersaleMapper.queryId(aftid);
        *//*Contract contract=aftersaleMapper.queryById(aftersaleExt.getConid());
        aftersaleExt.setContract(contract);
        System.out.println("-=pp=-=-=-"+contract);*//*
        System.out.println("-----------------"+aftersaleExt.getContract().toString());
        System.out.println("==============="+aftersaleExt.getContract().getConserial());*/
        System.out.println("=================================");
        AftersaleExt aftersaleExt=aftersaleMapper.queryId(aftid);
        System.out.println(aftersaleExt.getContract().getConserial());
        return aftersaleExt;
    }
}
