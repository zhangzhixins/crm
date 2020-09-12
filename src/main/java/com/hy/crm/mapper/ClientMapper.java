package com.hy.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.crm.pojo.Client;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 客户表 Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface ClientMapper extends BaseMapper<Client> {

    @Select("select * from client")
    public List<Client> queryClient();



}
