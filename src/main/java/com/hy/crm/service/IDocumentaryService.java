package com.hy.crm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hy.crm.pojo.Documentary;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.crm.pojo.vo.MyStatistic;

import java.util.ArrayList;

/**
 * <p>
 * 跟单表（跟单不能修改） 服务类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface IDocumentaryService extends IService<Documentary> {
    IPage<Documentary> selectdoc(Integer page, Integer limit, Documentary documentary);
    ArrayList<Documentary> selectdocbus(Integer busid);
    public MyStatistic selectCount();
}
