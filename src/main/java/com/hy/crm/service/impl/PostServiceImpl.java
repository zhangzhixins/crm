package com.hy.crm.service.impl;

import com.hy.crm.pojo.Post;
import com.hy.crm.mapper.PostMapper;
import com.hy.crm.service.IPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 帖子表（针对哪一个商机发布的帖子） 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
