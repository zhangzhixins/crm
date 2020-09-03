package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.mapper.AftersaleMapper;
import com.hy.crm.pojo.Aftersale;
import com.hy.crm.pojo.vo.AftersaleExt;
import com.hy.crm.service.IAftersaleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 售后服务表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
@Transactional
public class AftersaleServiceImpl extends ServiceImpl<AftersaleMapper, Aftersale> implements IAftersaleService {

    @Autowired
    AftersaleMapper aftersaleMapper;

    /**
     * 查询全部的售后服务
     */
    @Override
    public IPage<AftersaleExt> queryAll(String val, String keyWord, Integer page, Integer limit){
        if(null ==page){
            page=1;
        }
        Page<AftersaleExt> page1 = new Page<>(page,limit);
        IPage<AftersaleExt> iPage =aftersaleMapper.queryAll(page1,val,keyWord);
        return iPage;
    }
}
