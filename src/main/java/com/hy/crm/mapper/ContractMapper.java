package com.hy.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.Documentary;
import com.hy.crm.pojo.vo.TypeExt1;
import com.hy.crm.utils.SqlUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * <p>
 * 合同表 Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface ContractMapper extends BaseMapper<Contract> {
    @SelectProvider(type = SqlUtils.class,method = "select3")
    IPage<Contract> querycon(IPage iPage, @Param("con") Contract contract, @Param("type") TypeExt1 typeExt1);
    @Select("select count(1) from contract where ${val}")
    public int queryCount(String val);


    /*查询总数量*/
    @Select("select count(1) from contract where state!=1015 ${value} ")
    public Integer selectCount(String val);


    /**
     * 根据id查询合同数量
     */
    @Select("select count(1) from contract where affiliated=#{name} ${date}")
    public Integer queryThis(@Param("name") String name,@Param("date") String date);


    /*查数量*/
    @Select("select count(1) from contract where state!=1015")
    public Integer allCount();

}
