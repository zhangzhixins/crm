package com.hy.crm.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hy.crm.pojo.Aftersale;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.vo.AftersaleExt;
import com.hy.crm.pojo.vo.TypeExt;
import com.hy.crm.utils.SqlUtils;
import org.apache.ibatis.annotations.*;

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
    public IPage<AftersaleExt> queryAll(Page<AftersaleExt> page, @Param("val") String val, @Param("keyWord") String keyWord,@Param("typeExt") TypeExt typeExt);

    @Select("select * from contract where conid=#{value}")
    public Contract queryById();

    @Select("select count(1) from aftersale where ${val}")
    public int queryCount(String val);


    /**
     * 根据aftersale的id去查询一个对应的对象
     * @param aftid
     * @return
     */
    @Results({
        @Result(column = "conid",property = "contract",one = @One(select = "queryById"))
    })
    @Select("select * from aftersale where aftid=#{value}")
    public AftersaleExt queryId(Integer aftid);
}
