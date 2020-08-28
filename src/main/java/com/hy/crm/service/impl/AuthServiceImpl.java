package com.hy.crm.service.impl;

import com.hy.crm.pojo.Auth;
import com.hy.crm.mapper.AuthMapper;
import com.hy.crm.service.IAuthService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class AuthServiceImpl extends ServiceImpl<AuthMapper, Auth> implements IAuthService {

}
