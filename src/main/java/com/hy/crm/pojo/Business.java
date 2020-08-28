package com.hy.crm.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 商机表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Business implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = " busid", type = IdType.AUTO)
    private Integer  busid;

    private Integer cliid;

    private Integer linkid;

    private String busname;

    private BigDecimal makemoney;

    private Date statementdate;

    private String busdemand;

    private String busaccessory;

    private String busdept;

    private String busprincipal;

    private String busparticipant;

    private String busfollower;

    private Integer buspriority;

    private String busstage;

    private Integer state;

    private Date newtime;

    private Date updtime;

    public Integer getBusid() {
        return  busid;
    }

    public void setBusid(Integer  busid) {
        this. busid =  busid;
    }
    public Integer getCliid() {
        return cliid;
    }

    public void setCliid(Integer cliid) {
        this.cliid = cliid;
    }
    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }
    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }
    public BigDecimal getMakemoney() {
        return makemoney;
    }

    public void setMakemoney(BigDecimal makemoney) {
        this.makemoney = makemoney;
    }
    public Date getStatementdate() {
        return statementdate;
    }

    public void setStatementdate(Date statementdate) {
        this.statementdate = statementdate;
    }
    public String getBusdemand() {
        return busdemand;
    }

    public void setBusdemand(String busdemand) {
        this.busdemand = busdemand;
    }
    public String getBusaccessory() {
        return busaccessory;
    }

    public void setBusaccessory(String busaccessory) {
        this.busaccessory = busaccessory;
    }
    public String getBusdept() {
        return busdept;
    }

    public void setBusdept(String busdept) {
        this.busdept = busdept;
    }
    public String getBusprincipal() {
        return busprincipal;
    }

    public void setBusprincipal(String busprincipal) {
        this.busprincipal = busprincipal;
    }
    public String getBusparticipant() {
        return busparticipant;
    }

    public void setBusparticipant(String busparticipant) {
        this.busparticipant = busparticipant;
    }
    public String getBusfollower() {
        return busfollower;
    }

    public void setBusfollower(String busfollower) {
        this.busfollower = busfollower;
    }
    public Integer getBuspriority() {
        return buspriority;
    }

    public void setBuspriority(Integer buspriority) {
        this.buspriority = buspriority;
    }
    public String getBusstage() {
        return busstage;
    }

    public void setBusstage(String busstage) {
        this.busstage = busstage;
    }
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }
    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }

    @Override
    public String toString() {
        return "Business{" +
            " busid=" +  busid +
            ", cliid=" + cliid +
            ", linkid=" + linkid +
            ", busname=" + busname +
            ", makemoney=" + makemoney +
            ", statementdate=" + statementdate +
            ", busdemand=" + busdemand +
            ", busaccessory=" + busaccessory +
            ", busdept=" + busdept +
            ", busprincipal=" + busprincipal +
            ", busparticipant=" + busparticipant +
            ", busfollower=" + busfollower +
            ", buspriority=" + buspriority +
            ", busstage=" + busstage +
            ", state=" + state +
            ", newtime=" + newtime +
            ", updtime=" + updtime +
        "}";
    }
}
