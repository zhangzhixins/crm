package com.hy.crm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.vo.BusinessExt;
import com.hy.crm.pojo.vo.BusinessExt1;
import com.hy.crm.pojo.vo.MyStatistic;

import java.util.List;

/**
 * <p>
 * 商机表 服务类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface IBusinessService extends IService<Business> {
    public List<Business> verifyBusiness(String busname);
    public IPage<Business> queryAll(Integer limit, Integer page1);


    /*根据id查询商机信息和客户信息*/
    public BusinessExt queryById(Integer busid);
    public List<BusinessExt1> QueryBusiness(Integer limit, Integer page, Business business);
    public MyStatistic selectCount();
    public MyStatistic selectMake();
    public List<String> listDate();
    public MyStatistic test(MyStatistic myStatistic1,List<Integer> list);

}
