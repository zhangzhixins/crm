package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hy.crm.mapper.BusinessMapper;
import com.hy.crm.pojo.Business;
import com.hy.crm.service.IBusinessService;
import com.hy.crm.utils.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商机表 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements IBusinessService {

    @Autowired
    private BusinessMapper businessMapper;
    @Override
    public List<Business> verifyBusiness(String busname) {
        QueryWrapper<Business> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("busname",busname);
        return businessMapper.selectList(queryWrapper);
    }

    @Override
    public IPage<Business> queryAll(Integer limit, Integer page1){
        Page<Business> page = new Page<>(page1,limit);
        return businessMapper.selectPage(page,null);
    }

    @Override
    public IPage<Business> QueryBusiness(Integer limit, Integer page,Business business) {
        Layui layui = new Layui();
        if(limit==null){
            limit=10;
        }
        if(page==null){
            page=1;
        }
        IPage iPage = new Page<Business>(page,limit);
        QueryWrapper<Business> queryWrapper = new QueryWrapper<>();
        if(business.getAllname()!=null && !business.getAllname().equals("")){
            queryWrapper.like("allname",business.getAllname());
        }
        if(business.getBusstage()!=null && !business.getBusstage().equals("")){
            queryWrapper.like("busstage",business.getBusstage());
        }
        if(business.getBusprincipal()!=null && !business.getBusprincipal().equals("")){
            queryWrapper.like("busprincipal",business.getBusprincipal());
        }
        if(business.getMakemoney()!=null && !business.getMakemoney().equals("")){
            queryWrapper.like("makemoney",business.getMakemoney());
        }
        if(business.getStatementdate()!=null && !business.getStatementdate().equals("")){
            queryWrapper.like("statementdate",business.getStatementdate());
        }

        IPage iPage1 = businessMapper.selectPage(iPage,queryWrapper);
        return iPage1;
    }

}
