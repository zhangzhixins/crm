package com.hy.crm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.crm.pojo.Aftersale;
import com.hy.crm.pojo.vo.AftersaleExt;

/**
 * <p>
 * 售后服务表 服务类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface IAftersaleService extends IService<Aftersale> {
    public IPage<AftersaleExt> queryAll(String val, String keyWord, Integer page, Integer limit);
}
