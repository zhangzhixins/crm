package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.crm.mapper.BusinessMapper;
import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.vo.MyStatistic;
import com.hy.crm.pojo.vo.TypeExt;
import com.hy.crm.service.IBusinessService;
import com.hy.crm.utils.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 商机表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements IBusinessService {

    @Autowired
    private BusinessMapper businessMapper;
    @Override
    public List<Business> verifyBusiness(String busname) {
        QueryWrapper<Business> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("busname",busname);
        return businessMapper.selectList(queryWrapper);
    }

    @Override
    public IPage<Business> QueryBusiness(Integer limit, Integer page,Business business) {
        Layui layui = new Layui();
        if(limit==null){
            limit=10;
        }
        if(page==null){
            page=1;
        }
        IPage iPage = new Page<Business>(page,limit);
        QueryWrapper<Business> queryWrapper = new QueryWrapper<>();
        if(business.getAllname()!=null && !business.getAllname().equals("")){
            queryWrapper.like("allname",business.getAllname());
        }
        if(business.getBusstage()!=null && !business.getBusstage().equals("")){
            queryWrapper.like("busstage",business.getBusstage());
        }
        if(business.getBusprincipal()!=null && !business.getBusprincipal().equals("")){
            queryWrapper.like("busprincipal",business.getBusprincipal());
        }
        if(business.getMakemoney()!=null && !business.getMakemoney().equals("")){
            queryWrapper.like("makemoney",business.getMakemoney());
        }
        if(business.getStatementdate()!=null && !business.getStatementdate().equals("")){
            queryWrapper.like("statementdate",business.getStatementdate());
        }

        IPage iPage1 = businessMapper.selectPage(iPage,queryWrapper);
        return iPage1;
    }


    @Override
    public IPage<Business> queryAll(Integer limit, Integer page1){
        Page<Business> page = new Page<>(page1,limit);
        return businessMapper.selectPage(page,null);
    }


    /**
     * 查询商机每个时间段的总数量
     */
    @Override
    public MyStatistic selectCount(){
        List<String> lis=this.listDate();
        MyStatistic myStatistic1 = new MyStatistic();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lis.size()-1; i++) {
            list.add(businessMapper.selectCount(lis.get(i)));
        }
        return this.test(myStatistic1,list);
    }

    /**
     * 查询每个阶段商机成交的数量
     * 已成交的状态 1008
     * @return
     */
    @Override
    public MyStatistic selectMake(){
        List<String> lis = this.listDate();
        MyStatistic myStatistic1 = new MyStatistic();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lis.size()-1; i++) {
            list.add(businessMapper.selectMake(lis.get(i)));
        }
        return this.test(myStatistic1,list);
    }



    /**
     * 封装各个阶段的时间
     * @return
     */
    @Override
    public List<String> listDate(){
        ArrayList<String> lis = new ArrayList<>();
        lis.add(" and YEARWEEK(date_format(newtime,'%Y-%m-%d'),-1) = YEARWEEK(date_format(NOW(),'%Y-%m-%d'))");
        lis.add(" and YEARWEEK(date_format(newtime,'%Y-%m-%d'),1) = YEARWEEK(date_format(NOW(),'%Y-%m-%d'))");
        lis.add(" and DATE_FORMAT(newtime, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' )");
        lis.add(" and PERIOD_DIFF( date_format( now( ) , '%Y%m' ) , date_format(newtime, '%Y%m' ) ) =1");
        lis.add(" and QUARTER(newtime)=QUARTER(now()) and  year(newtime)=year(now())");
        lis.add(" and QUARTER(newtime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER)) and  YEAR (newtime)=YEAR(DATE_SUB(now(),interval 1 QUARTER))");
        lis.add(" and YEAR(newtime)=YEAR(NOW())");
        lis.add(" and year(newtime)=year(date_sub(now(),interval 1 year))");
        lis.add("1");
        return lis;
    }


    /*封装数据*/
    @Override
    public MyStatistic test(MyStatistic myStatistic1,List<Integer> list){
        myStatistic1.setThisWeek(list.get(0));
        myStatistic1.setPreWeek(list.get(1));
        myStatistic1.setThisMonth(list.get(2));
        myStatistic1.setPreMonth(list.get(3));
        myStatistic1.setThisSeason(list.get(4));
        myStatistic1.setPreSeason(list.get(5));
        myStatistic1.setThisYear(list.get(6));
        myStatistic1.setPreYear(list.get(7));
        return myStatistic1;
    }
}
