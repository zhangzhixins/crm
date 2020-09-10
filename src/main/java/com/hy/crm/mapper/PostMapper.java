package com.hy.crm.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Documentary;
import com.hy.crm.pojo.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.crm.utils.SqlUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * 帖子表（针对哪一个商机发布的帖子） Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface PostMapper extends BaseMapper<Post> {
    @SelectProvider(type = SqlUtils.class,method = "select4")
    IPage<Post> querypost(IPage iPage, @Param("post") Post post);

    @Update("update post set num=#{post.num} where postid=#{post.postid} ")
    boolean updpost(@Param("post") Post post);
}
