package com.hy.crm.utils;

import com.hy.crm.pojo.vo.MyStatistic;

public class Tong {
    private String code;
    private MyStatistic bus;
    private MyStatistic makeBus;
    private MyStatistic doc;
    private MyStatistic con;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MyStatistic getBus() {
        return bus;
    }

    public void setBus(MyStatistic bus) {
        this.bus = bus;
    }

    public MyStatistic getMakeBus() {
        return makeBus;
    }

    public void setMakeBus(MyStatistic makeBus) {
        this.makeBus = makeBus;
    }

    public MyStatistic getDoc() {
        return doc;
    }

    public void setDoc(MyStatistic doc) {
        this.doc = doc;
    }

    public MyStatistic getCon() {
        return con;
    }

    public void setCon(MyStatistic con) {
        this.con = con;
    }
}
