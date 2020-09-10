package com.hy.crm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Post;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.crm.pojo.vo.PostExt;
import com.hy.crm.pojo.vo.PostExt1;

import java.util.List;

/**
 * <p>
 * 帖子表（针对哪一个商机发布的帖子） 服务类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface IPostService extends IService<Post> {
    public List<PostExt> querypost(Integer page, Integer limit,Post post);
    public PostExt1 updpost(Post post);
}
