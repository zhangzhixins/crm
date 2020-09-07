package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hy.crm.pojo.Client;
import com.hy.crm.mapper.ClientMapper;
import com.hy.crm.service.IClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.Cleaner;

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

    @Override
    public List<Client> verifyClient(String cliname){
        QueryWrapper<Client> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("cliname",cliname);
        return clientMapper.selectList(queryWrapper);
    }
}
