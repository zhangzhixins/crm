package com.hy.crm.mapper;

import com.hy.crm.pojo.Reply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 回复表 Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface ReplyMapper extends BaseMapper<Reply> {
    @Select("select count(*) from reply where postid=#{value}")
    Integer countreply(Integer replyid);
    @Select("select * from reply where postid=#{value}")
    List<Reply> queryid(Integer replyid);

}
