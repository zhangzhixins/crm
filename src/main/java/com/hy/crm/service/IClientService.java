package com.hy.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hy.crm.pojo.Client;
import com.hy.crm.pojo.vo.ClientExt2;

import java.util.List;

/**
 * <p>
 * 客户表 服务类
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public interface IClientService extends IService<Client> {
    public List<Client> queryClient();
    public List<Client> verifyClient(String cliname);

    public List<ClientExt2> QueryBusinesss(Integer limit, Integer page,ClientExt2 clientExt2,Client client,String val,String keyWord,Integer ifyid);




}
