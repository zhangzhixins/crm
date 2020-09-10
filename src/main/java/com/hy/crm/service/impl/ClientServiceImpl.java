package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.crm.mapper.*;
import com.hy.crm.pojo.*;
import com.hy.crm.pojo.vo.ClientExt2;
import com.hy.crm.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements IClientService {
    @Autowired
    ClientMapper clientMapper;

    @Autowired
    BusinessMapper businessMapper;

    @Autowired
    ContractMapper contractMapper;

    @Autowired
    IncomeMapper incomeMapper;

    @Autowired
    AftersaleMapper aftersaleMapper;
    @Override
    public List<Client> queryClient(){
       return clientMapper.queryClient();
    }

    @Override
    public List<Client> verifyClient(String cliname) {
        QueryWrapper<Client> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cliname",cliname);
        return clientMapper.selectList(queryWrapper);
    }

    @Override
    public List<ClientExt2> QueryBusinesss(Integer limit, Integer page,ClientExt2 clientExt2) {
        if(limit==null){
            limit=10;
        }
        if(page==null){
            page=1;
        }
        List<ClientExt2> list1=new ArrayList<>();

        IPage iPage = new Page<>(page,limit);
        IPage iPage1 = clientMapper.selectPage(iPage,null);
        List<Client> list2= iPage.getRecords();
        for(Client lid:list2){
            ClientExt2 clientExt21=new ClientExt2();

            //根据客户id去查询当前客户下的商机
            QueryWrapper queryWrapper1=new QueryWrapper<>();
            queryWrapper1.eq("cliid",lid.getCliid());
            List<Business> businesses=businessMapper.selectList(queryWrapper1);
            int sjsize=0;//当前的商机数
            BigDecimal yjcj=new BigDecimal(0);//当前的预计成交金额
            for (Business bu:businesses){
                yjcj=yjcj.add(bu.getMakemoney());
            }

            //拿到客户id，根据客户id去合同表查询有几条合同   拿合同金额
            QueryWrapper queryWrapper2=new QueryWrapper<>();
            queryWrapper2.eq("cliid",lid.getCliid());
            List<Contract> contractList=contractMapper.selectList(queryWrapper2);
            BigDecimal htje=new BigDecimal(0);
            for(Contract contract:contractList){
                htje=htje.add(contract.getConmoney());
            }

            //当前的回款金额
            BigDecimal hkje=new BigDecimal(0);
            for(Contract con:contractList){
                Integer cis=con.getCliid();
                QueryWrapper queryWrapper3=new QueryWrapper<>();
                queryWrapper3.eq("conid",cis);
                List<Income> incomeList=incomeMapper.selectList(queryWrapper3);
                for(Income income:incomeList){
                    hkje=hkje.add(income.getIncmoney());
                }
            }
            /**
             * 查询售后服务数
             */
            //拿到客户id,根据客户id去售后服务表查询售后服务数
            QueryWrapper queryWrapper4=new QueryWrapper<>();
            queryWrapper4.eq("cliid",lid.getCliid());
            List<Aftersale> aftersaleList= aftersaleMapper.selectList(queryWrapper4);
            Integer aff=aftersaleList.size();
            Integer fwjk=0;//当前每一次的服务分
            Float fwjkfj=0.0f;//算出的均分
            for (Aftersale aftersales:aftersaleList){
                fwjk+=aftersales.getAftgrade();//拿到售后服务均分
                System.out.println(fwjk/aff);
                fwjkfj=Float.parseFloat(String.valueOf(fwjk/aff));
            }


            clientExt21.setCliname(lid.getCliname());//客户名称
            clientExt21.setCliid(lid.getCliid());//客户id
            clientExt21.setOpportunities(businesses.size());//商机数量
            clientExt21.setMakemoney(yjcj);//预计成交金额
            clientExt21.setContract(contractList.size());//合同数量
            clientExt21.setConmoney(htje);//合同金额
            clientExt21.setReturned(hkje);//回款金额
            clientExt21.setNumber(aff);//售后服务数
            clientExt21.setAftgrade(fwjkfj);//服务平均分
            list1.add(clientExt21);
        }
        return list1;
    }

}
