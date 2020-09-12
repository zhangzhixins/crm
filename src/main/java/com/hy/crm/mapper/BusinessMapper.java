package com.hy.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.Client;
import com.hy.crm.pojo.vo.BusinessExt;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 商机表 Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface BusinessMapper extends BaseMapper<Business> {


    @Results({
            @Result(column = "cliid",property = "client",one = @One(select ="queryClient" ))
    })
    @Select("select * from business where busid=#{busid}")
    public BusinessExt queryById(Integer busid);

    @Select("select * from client where cliid=#{value}")
    public Client queryClient(Integer cliid);
}
