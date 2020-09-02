package com.hy.crm.pojo.vo;

import com.hy.crm.pojo.Aftersale;
import com.hy.crm.pojo.Contract;

import java.util.Date;

public class AftersaleExt extends Aftersale {
    private Contract contract;
    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
