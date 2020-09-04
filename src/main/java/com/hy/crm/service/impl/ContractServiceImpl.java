package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hy.crm.mapper.ContractMapper;
import com.hy.crm.pojo.Contract;
import com.hy.crm.service.IContractService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
