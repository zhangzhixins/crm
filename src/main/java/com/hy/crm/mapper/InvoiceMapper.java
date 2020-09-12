package com.hy.crm.mapper;

import com.hy.crm.pojo.Income;
import com.hy.crm.pojo.Invoice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 开票表 Mapper 接口
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface InvoiceMapper extends BaseMapper<Invoice> {
    @Select("select * from invoice where conid=${value}")
    public List<Invoice> invoiceid(Integer conid);
}
