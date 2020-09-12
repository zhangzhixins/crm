package com.hy.crm.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Documentary;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.crm.utils.SqlUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 跟单表（跟单不能修改） Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface DocumentaryMapper extends BaseMapper<Documentary> {

    @SelectProvider(type = SqlUtils.class,method = "select2")
    IPage<Documentary> selectdoc(IPage iPage, @Param("doc") Documentary documentary);

    @Select("select * from documentary where busid=#{value}")
    ArrayList<Documentary> iddocbus(Integer busid);

    /*查询时间段内的跟单总数量*/
    @Select("select count(1) from documentary where 1=1  ${value}")
    public Integer selectCount(String val);


    /**
     * 根据id查询跟单数
     */
    @Select("select count(1) from documentary where docpeople=#{name} ${date}")
    public Integer queryThis(@Param("name") String name,@Param("date") String date);

}
