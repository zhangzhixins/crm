package com.hy.crm.mapper;

import com.hy.crm.pojo.Income;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 收入登记表（订单明细) Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface IncomeMapper extends BaseMapper<Income> {

    @Select("select * from income where conid=${value}")
    public List<Income> incomeid(Integer conid);
}
