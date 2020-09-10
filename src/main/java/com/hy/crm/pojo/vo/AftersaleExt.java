package com.hy.crm.pojo.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.hy.crm.pojo.Aftersale;
import com.hy.crm.pojo.Contract;

/**
 * @ProjectName: crm
 * @Package: com.hy.crm.pojo.vo
 * @ClassName: AftersaleExt
 * @Author: Xiaobai
 * @Description:
 * @Date: 2020/9/3 8:55
 * @Version: 1.0
 */
public class AftersaleExt extends Aftersale {

    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "AftersaleExt{" +
            "contract=" + contract +
            '}';
    }
}
