package com.hy.crm.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.pojo.Aftersale;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.vo.AftersaleExt;
import com.hy.crm.utils.SqlUtils;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * <p>
 * 售后服务表 Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface AftersaleMapper extends BaseMapper<Aftersale> {

    @Results({
        @Result(column = "conid",property = "contract",one = @One(select = "queryById"))
    })
    @SelectProvider(type= SqlUtils.class,method="select1")
    public IPage<AftersaleExt> queryAll(Page<AftersaleExt> page, @Param("val") String val, @Param("keyWord") String keyWord);

    @Select("select * from contract where conid=#{value}")
    public Contract queryById();
}
