package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.mapper.ContractMapper;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.vo.MyStatistic;
import com.hy.crm.pojo.vo.TypeExt;
import com.hy.crm.pojo.vo.TypeExt1;
import com.hy.crm.service.IBusinessService;
import com.hy.crm.service.IContractService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 合同表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class ContractServiceImpl extends ServiceImpl<ContractMapper, Contract> implements IContractService {

    @Autowired
    ContractMapper contractMapper;

    @Autowired
    IBusinessService businessService;

    @Override
    public List<Contract> queryContract(Integer cliid){
        if(null !=cliid){
            QueryWrapper<Contract> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("cliid",cliid);
            return contractMapper.selectList(queryWrapper);
        }else{
            System.out.println("============值为空=========");
        }
        return null;
    }

    @Override
    public IPage<Contract> querycon(Integer page, Integer limit, Contract contract,TypeExt1 typeExt1) {

        if (page==null || page.equals("")){
            page=1;
        }
        Page page1=new Page(page,limit);
        IPage<Contract> querycon =contractMapper.querycon(page1,contract,typeExt1);
        return  querycon;
    }
    @Override
    public TypeExt1 queryCount(){
        ArrayList<String> lis = new ArrayList<>();
        lis.add(" state=1001");
        lis.add(" state=1002");
        lis.add(" state=1003");
        lis.add(" state=1004");
        lis.add(" YEARWEEK( date_format(contime,'%Y-%m-%d' ) ) = YEARWEEK( now() )");
        lis.add(" yearweek(date_format(contime, '%Y-%m-%d'),1) = yearweek(now(),1)-1");
        lis.add(" DATE_FORMAT(contime, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m')");
        lis.add(" date_format(contime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m')");
        lis.add(" QUARTER(contime)=QUARTER(now())");
        lis.add(" QUARTER(contime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER))");
        TypeExt1 typeExt = new TypeExt1();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lis.size(); i++) {
            //传入日期函数 string
            list.add(contractMapper.queryCount(lis.get(i)));
            System.out.println(contractMapper.queryCount(lis.get(i)));
        }
        typeExt.setHand(String.valueOf(list.get(0)));
        typeExt.setEnd(String.valueOf(list.get(1)));
        typeExt.setWithdraw(String.valueOf(list.get(2)));
        typeExt.setWithw(String.valueOf(list.get(3)));
        typeExt.setThisweek(String.valueOf(list.get(4)));
        typeExt.setPreweek(String.valueOf(list.get(5)));
        typeExt.setThismonth(String.valueOf(list.get(6)));
        typeExt.setPremonth(String.valueOf(list.get(7)));
        typeExt.setThisseason(String.valueOf(list.get(8)));
        typeExt.setPreseason(String.valueOf(list.get(9)));
        return typeExt;
    }


    /*查询时间段内的合同数量*/
    @Override
    public MyStatistic selectCount(){
        List<String> lis=businessService.listDate();
        MyStatistic myStatistic1 = new MyStatistic();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lis.size()-1; i++) {
            list.add(contractMapper.selectCount(lis.get(i)));
        }
        return businessService.test(myStatistic1,list);
    }
}
