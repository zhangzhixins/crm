package com.hy.crm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.vo.ContractExt;
import com.hy.crm.pojo.vo.TypeExt;
import com.hy.crm.pojo.vo.TypeExt1;

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
    public List<ContractExt> querycon(Integer page, Integer limit, Contract contract, TypeExt1 typeExt1);
    public TypeExt1 queryCount();
}
