package com.hy.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.crm.pojo.Contract;

import java.util.List;

/**
 * <p>
 * 合同表 服务类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface IContractService extends IService<Contract> {
    public List<Contract> queryContract(Integer cliid);
}
