package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.pojo.Documentary;
import com.hy.crm.mapper.DocumentaryMapper;
import com.hy.crm.service.IDocumentaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 跟单表（跟单不能修改） 服务实现类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
@Service
public class DocumentaryServiceImpl extends ServiceImpl<DocumentaryMapper, Documentary> implements IDocumentaryService {
    @Autowired
    private DocumentaryMapper documentaryMapper;

    @Override
    public ArrayList<Documentary> selectdoc(Integer page, Integer limit, Documentary documentary) {
        if (page==null || page.equals("")){
            page=1;
        }
        if (limit==null || limit.equals("")){
            limit=10;
        }
        Page page1=new Page(page,limit);
        QueryWrapper<Documentary> wrapper=new QueryWrapper<>();
        if (documentary.equals('1')){
            wrapper.eq("doctime",documentary.getDoctime());
        }else if (documentary.equals('2')){
            wrapper.eq("busid",documentary.getBusid());
        }else if (documentary.equals('3')){
            wrapper.eq("docpeople",documentary.getDocpeople());
        }
        IPage doclist=documentaryMapper.selectPage(page1,wrapper);
        List<Documentary> listdoc=doclist.getRecords();
        return (ArrayList<Documentary>) listdoc;

    }
}
