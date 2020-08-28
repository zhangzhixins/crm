package com.hy.crm.service.impl;

import com.hy.crm.pojo.Income;
import com.hy.crm.mapper.IncomeMapper;
import com.hy.crm.service.IIncomeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 收入登记表（订单明细) 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class IncomeServiceImpl extends ServiceImpl<IncomeMapper, Income> implements IIncomeService {

}
