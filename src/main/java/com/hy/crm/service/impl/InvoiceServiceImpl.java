package com.hy.crm.service.impl;

import com.hy.crm.pojo.Invoice;
import com.hy.crm.mapper.InvoiceMapper;
import com.hy.crm.service.IInvoiceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 开票表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class InvoiceServiceImpl extends ServiceImpl<InvoiceMapper, Invoice> implements IInvoiceService {

}
