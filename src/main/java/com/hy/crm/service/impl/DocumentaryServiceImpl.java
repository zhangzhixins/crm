package com.hy.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.pojo.Documentary;
import com.hy.crm.mapper.DocumentaryMapper;
import com.hy.crm.pojo.vo.MyStatistic;
import com.hy.crm.service.IBusinessService;
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

    @Autowired
    IBusinessService businessService;

    @Override
    public IPage<Documentary> selectdoc(Integer page, Integer limit, Documentary documentary) {
        if (page==null || page.equals("")){
            page=1;
        }
        if (limit==null || limit.equals("")){
            limit=10;
        }
        Page page1=new Page(page,limit);
        IPage doclist=documentaryMapper.selectdoc(page1, documentary);
        return  doclist;

    }

    @Override
    public ArrayList<Documentary> selectdocbus(Integer busid) {
       return documentaryMapper.iddocbus(busid);
    }


    /**
     * 查询全部的跟单数  根据时间阶段
     * @return
     */
    @Override
    public MyStatistic selectCount(){
        List<String> lis=businessService.listDate();
        MyStatistic myStatistic1 = new MyStatistic();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < lis.size()-1; i++) {
            list.add(documentaryMapper.selectCount(lis.get(i)));
        }
        return businessService.test(myStatistic1,list);
    }

}
