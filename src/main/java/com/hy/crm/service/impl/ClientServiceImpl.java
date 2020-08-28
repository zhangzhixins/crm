package com.hy.crm.service.impl;

import com.hy.crm.pojo.Client;
import com.hy.crm.mapper.ClientMapper;
import com.hy.crm.service.IClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
