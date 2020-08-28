package com.hy.crm.service.impl;

import com.hy.crm.pojo.State;
import com.hy.crm.mapper.StateMapper;
import com.hy.crm.service.IStateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 状态表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class StateServiceImpl extends ServiceImpl<StateMapper, State> implements IStateService {

}
