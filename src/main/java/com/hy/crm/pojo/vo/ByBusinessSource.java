package com.hy.crm.pojo.vo;

public class ByBusinessSource {
    //客户来源(就是商机的来源)
    private String busfrom;
    //商机数
    private String bcount;
    //金额
    private String bmoney;

    public ByBusinessSource() {
    }

    public ByBusinessSource(String busfrom, String bcount, String bmoney) {
        this.busfrom = busfrom;
        this.bcount = bcount;
        this.bmoney = bmoney;
    }

    public String getBusfrom() {
        return busfrom;
    }

    public void setBusfrom(String busfrom) {
        this.busfrom = busfrom;
    }

    public String getBcount() {
        return bcount;
    }

    public void setBcount(String bcount) {
        this.bcount = bcount;
    }

    public String getBmoney() {
        return bmoney;
    }

    public void setBmoney(String bmoney) {
        this.bmoney = bmoney;
    }
}
