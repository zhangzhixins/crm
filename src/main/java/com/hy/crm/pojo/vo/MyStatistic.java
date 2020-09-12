package com.hy.crm.pojo.vo;

public class MyStatistic {
    private Integer thisWeek;
    private Integer preWeek;
    private Integer thisMonth;
    private Integer preMonth;
    private Integer thisSeason;
    private Integer preSeason;
    private Integer thisYear;
    private Integer preYear;


    public Integer getThisWeek() {
        return thisWeek;
    }

    public void setThisWeek(Integer thisWeek) {
        this.thisWeek = thisWeek;
    }

    public Integer getPreWeek() {
        return preWeek;
    }

    public void setPreWeek(Integer preWeek) {
        this.preWeek = preWeek;
    }

    public Integer getThisMonth() {
        return thisMonth;
    }

    public void setThisMonth(Integer thisMonth) {
        this.thisMonth = thisMonth;
    }

    public Integer getPreMonth() {
        return preMonth;
    }

    public void setPreMonth(Integer preMonth) {
        this.preMonth = preMonth;
    }

    public Integer getThisSeason() {
        return thisSeason;
    }

    public void setThisSeason(Integer thisSeason) {
        this.thisSeason = thisSeason;
    }

    public Integer getPreSeason() {
        return preSeason;
    }

    public void setPreSeason(Integer preSeason) {
        this.preSeason = preSeason;
    }

    public Integer getThisYear() {
        return thisYear;
    }

    public void setThisYear(Integer thisYear) {
        this.thisYear = thisYear;
    }

    public Integer getPreYear() {
        return preYear;
    }

    public void setPreYear(Integer preYear) {
        this.preYear = preYear;
    }


    @Override
    public String toString() {
        return "MyStatistic{" +
            "thisWeek=" + thisWeek +
            ", preWeek=" + preWeek +
            ", thisMonth=" + thisMonth +
            ", preMonth=" + preMonth +
            ", thisSeason=" + thisSeason +
            ", preSeason=" + preSeason +
            ", thisYear=" + thisYear +
            ", preYear=" + preYear +
            '}';
    }
}
