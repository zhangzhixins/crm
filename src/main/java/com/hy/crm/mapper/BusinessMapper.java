package com.hy.crm.mapper;

import com.hy.crm.pojo.Business;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.crm.pojo.vo.BusFunnel;
import com.hy.crm.pojo.vo.ByBusinessSource;
import com.hy.crm.pojo.vo.ByIndustryStatistics;
import com.hy.crm.pojo.vo.Sta;
import com.hy.crm.utils.SqlUtils;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商机表 Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface BusinessMapper extends BaseMapper<Business> {

    /**
     * 查询全部的数量
     * @param val
     * @return
     */
    @Select("select count(1) from business where state!=1015 ${value}")
    public Integer selectCount(String val);


    /**
     * 查询已成交的全部数量
     * @param val
     * @return
     */
    @Select("select count(1) from business where state=1008 ${value}")
    public Integer selectMake(String val);


    /**
     * 根据id查询商机数量
     */
    @Select("select count(1) from business where state!=1015 and busprincipal=#{name} ${date}")
    public Integer queryThis(@Param("name") String name,@Param("date") String date);


    /**
     * 根据id查询商机成交数
     */
    @Select("select count(1) from business where state=1008 and busprincipal=#{name} ${date}")
    public Integer queryPre(@Param("name") String name, @Param("date") String date);

    //统计里面按行业分布查询
    @Select("select cli.industry as cliindustry, count(cli.industry) as bcount,sum(bus.makemoney) as bmoney from client cli  right join business bus on bus.cliid=cli.cliid group by cli.industry")
    List<ByIndustryStatistics> queryBcountBmoney();


    //统计里面按来源分布查询
    @Select("select bus.clisource busfrom,count(bus.clisource) as bcount ,sum(bus.makemoney) as bmoney  from business bus group by bus.clisource ")
    List<ByBusinessSource> queryBcountBmoneyByFrom();


    //查询商机全部数量
    @Select("select count(1) from business where state!=1015")
    public Integer allCount();


    //查询商机已成交的预计金额
    //查询已丢单的
    //查询已搁置的
    //查询进行中的

    @Select("select bus.state as state,sum(makemoney) as sta from business bus where state!= 1015 group by bus.state ")
    public List<Sta> busState();


    /**
     * 全部的 商机数   金额    状态
     */
    @Select("select count(1) as count,sum(makemoney) as money from business where state!=1015")
    public BusFunnel allBusFunner();

    /**
     * 指定状态的 商机数   金额    状态
     */

    @SelectProvider(type= SqlUtils.class,method="select7")
    public BusFunnel busFunner(@Param("state") Integer state,@Param("date") String date);

}
