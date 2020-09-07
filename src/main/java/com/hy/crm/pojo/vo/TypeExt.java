package com.hy.crm.pojo.vo;

import java.io.Serializable;

public class TypeExt implements Serializable {
    private String hand;//处理中
    private String end;//已结束
    private String withdraw;//已撤除
    private String thisweek;//本周
    private String preweek;//上周
    private String thismonth;//本月
    private String premonth;//上月
    private String thisseason;//本季度
    private String preseason;//上季度

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    public String getThisweek() {
        return thisweek;
    }

    public void setThisweek(String thisweek) {
        this.thisweek = thisweek;
    }

    public String getPreweek() {
        return preweek;
    }

    public void setPreweek(String preweek) {
        this.preweek = preweek;
    }

    public String getThismonth() {
        return thismonth;
    }

    public void setThismonth(String thismonth) {
        this.thismonth = thismonth;
    }

    public String getPremonth() {
        return premonth;
    }

    public void setPremonth(String premonth) {
        this.premonth = premonth;
    }

    public String getThisseason() {
        return thisseason;
    }

    public void setThisseason(String thisseason) {
        this.thisseason = thisseason;
    }

    public String getPreseason() {
        return preseason;
    }

    public void setPreseason(String preseason) {
        this.preseason = preseason;
    }


    @Override
    public String toString() {
        return "TypeExt{" +
            "hand='" + hand + '\'' +
            ", end='" + end + '\'' +
            ", withdraw='" + withdraw + '\'' +
            ", thisweek='" + thisweek + '\'' +
            ", preweek='" + preweek + '\'' +
            ", thismonth='" + thismonth + '\'' +
            ", premonth='" + premonth + '\'' +
            ", thisseason='" + thisseason + '\'' +
            ", preseason='" + preseason + '\'' +
            '}';
    }
}
