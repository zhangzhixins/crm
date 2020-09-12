package com.hy.crm.pojo.vo;

import com.hy.crm.pojo.User;

import javax.jws.soap.SOAPBinding;

public class StatisticsByTime {
    //用户id
    private Integer userId;
    //用户名称
    private String userName;
    //商机本周
    private Integer businessThis;
    //商机上周
    private Integer businessLast;
    //成交本周
    private Integer accomplishThis;
    //成交上周
    private Integer accomplishLast;
    //跟单本
    private Integer documentaryThis;
    //跟单上
    private Integer documentaryLast;
    //合同本
    private Integer contractThis;
    //合同上
    private Integer contractLast;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getBusinessThis() {
        return businessThis;
    }

    public void setBusinessThis(Integer businessThis) {
        this.businessThis = businessThis;
    }

    public Integer getBusinessLast() {
        return businessLast;
    }

    public void setBusinessLast(Integer businessLast) {
        this.businessLast = businessLast;
    }

    public Integer getAccomplishThis() {
        return accomplishThis;
    }

    public void setAccomplishThis(Integer accomplishThis) {
        this.accomplishThis = accomplishThis;
    }

    public Integer getAccomplishLast() {
        return accomplishLast;
    }

    public void setAccomplishLast(Integer accomplishLast) {
        this.accomplishLast = accomplishLast;
    }

    public Integer getDocumentaryThis() {
        return documentaryThis;
    }

    public void setDocumentaryThis(Integer documentaryThis) {
        this.documentaryThis = documentaryThis;
    }

    public Integer getDocumentaryLast() {
        return documentaryLast;
    }

    public void setDocumentaryLast(Integer documentaryLast) {
        this.documentaryLast = documentaryLast;
    }

    public Integer getContractThis() {
        return contractThis;
    }

    public void setContractThis(Integer contractThis) {
        this.contractThis = contractThis;
    }

    public Integer getContractLast() {
        return contractLast;
    }

    public void setContractLast(Integer contractLast) {
        this.contractLast = contractLast;
    }
}
