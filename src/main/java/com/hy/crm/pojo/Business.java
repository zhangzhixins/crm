package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
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

    private String allname;

    private String busname;

    private String clisources;

    private BigDecimal makemoney;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date statementdate;

    private String linkname;

    private String linkdept;

    private String linkduty;

    private String linkphone;

    private String phone;

    private String email;

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


    public String getClisources() {
        return clisources;
    }

    public void setClisources(String clisources) {
        this.clisources = clisources;
    }

    public String getAllname() {
        return allname;
    }

    public void setAllname(String allname) {
        this.allname = allname;
    }

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

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname;
    }

    public String getLinkdept() {
        return linkdept;
    }

    public void setLinkdept(String linkdept) {
        this.linkdept = linkdept;
    }

    public String getLinkduty() {
        return linkduty;
    }

    public void setLinkduty(String linkduty) {
        this.linkduty = linkduty;
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Business{" +
                "busid=" + busid +
                ", cliid=" + cliid +
                ", allname='" + allname + '\'' +
                ", busname='" + busname + '\'' +
                ", clisources='" + clisources + '\'' +
                ", makemoney=" + makemoney +
                ", statementdate=" + statementdate +
                ", linkname='" + linkname + '\'' +
                ", linkdept='" + linkdept + '\'' +
                ", linkduty='" + linkduty + '\'' +
                ", linkphone='" + linkphone + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", busdemand='" + busdemand + '\'' +
                ", busaccessory='" + busaccessory + '\'' +
                ", busdept='" + busdept + '\'' +
                ", busprincipal='" + busprincipal + '\'' +
                ", busparticipant='" + busparticipant + '\'' +
                ", busfollower='" + busfollower + '\'' +
                ", buspriority=" + buspriority +
                ", busstage='" + busstage + '\'' +
                ", state=" + state +
                ", newtime=" + newtime +
                ", updtime=" + updtime +
                '}';
    }
}
