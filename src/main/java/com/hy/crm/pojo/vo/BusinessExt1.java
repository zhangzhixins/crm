package com.hy.crm.pojo.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class BusinessExt1 implements Serializable {
    private int busid;
    private String busname;//商机名称
    private  String busstage;//商机阶段
    private BigDecimal makemoney;//预计成交金额
    private String busprincipal;//商机负责人
    private String doctime;//最后跟单
    private Integer discussion;//讨论版

    public int getBusid() {
        return busid;
    }

    public void setBusid(int busid) {
        this.busid = busid;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getBusstage() {
        return busstage;
    }

    public void setBusstage(String busstage) {
        this.busstage = busstage;
    }

    public BigDecimal getMakemoney() {
        return makemoney;
    }

    public void setMakemoney(BigDecimal makemoney) {
        this.makemoney = makemoney;
    }

    public String getBusprincipal() {
        return busprincipal;
    }

    public void setBusprincipal(String busprincipal) {
        this.busprincipal = busprincipal;
    }

    public String getDoctime() {
        return doctime;
    }

    public void setDoctime(String doctime) {
        this.doctime = doctime;
    }

    public Integer getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Integer discussion) {
        this.discussion = discussion;
    }

    @Override
    public String toString() {
        return "BusinessExt1{" +
                "busid=" + busid +
                ", busname='" + busname + '\'' +
                ", busstage='" + busstage + '\'' +
                ", makemoney='" + makemoney + '\'' +
                ", busprincipal='" + busprincipal + '\'' +
                ", doctime='" + doctime + '\'' +
                ", discussion=" + discussion +
                '}';
    }
}
