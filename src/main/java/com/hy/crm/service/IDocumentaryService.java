package com.hy.crm.service;

import com.hy.crm.pojo.Documentary;
import com.baomidou.mybatisplus.extension.service.IService;

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
    ArrayList<Documentary> selectdoc(Integer page, Integer limit, Documentary documentary);
}
