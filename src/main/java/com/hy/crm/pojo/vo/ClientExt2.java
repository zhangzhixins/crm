package com.hy.crm.pojo.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClientExt2 implements Serializable {

    private  int cliid;//客户id
    private Integer ifyid;//客户分类
    private String cliname; //客户名称
    private Integer opportunities; //商机数
    private BigDecimal makemoney; //预计成交金额
    private Integer contract;//合同数
    private BigDecimal conmoney;//合同金额
    private BigDecimal returned;//回款额
    private Integer number;//售后服务数
    private Float aftgrade;//服务均分

    public int getCliid() {
        return cliid;
    }

    public void setCliid(int cliid) {
        this.cliid = cliid;
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname;
    }

    public Integer getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(Integer opportunities) {
        this.opportunities = opportunities;
    }

    public BigDecimal getMakemoney() {
        return makemoney;
    }

    public void setMakemoney(BigDecimal makemoney) {
        this.makemoney = makemoney;
    }

    public Integer getContract() {
        return contract;
    }

    public void setContract(Integer contract) {
        this.contract = contract;
    }

    public BigDecimal getConmoney() {
        return conmoney;
    }

    public void setConmoney(BigDecimal conmoney) {
        this.conmoney = conmoney;
    }

    public BigDecimal getReturned() {
        return returned;
    }

    public void setReturned(BigDecimal returned) {
        this.returned = returned;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getAftgrade() {
        return aftgrade;
    }

    public void setAftgrade(Float aftgrade) {
        this.aftgrade = aftgrade;
    }

    public Integer getIfyid() {
        return ifyid;
    }

    public void setIfyid(Integer ifyid) {
        this.ifyid = ifyid;
    }
}
