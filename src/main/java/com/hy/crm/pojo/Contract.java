package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: crm
 * @Package: com.hy.crm.pojo
 * @ClassName: Contract
 * @Author: Xiaobai
 * @Description:
 * @Date: 2020/9/3 8:57
 * @Version: 1.0
 */
@TableName("contract")
public class Contract implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "conid", type = IdType.AUTO)
    private Integer conid;

    private Integer busid;

    private Integer cliid;

    private String allname;

    private String conname;

    private String conserial;

    private BigDecimal conmoney;

    private Date contime;

    private Date entrytime;

    private Date endtime;

    private String linkname;

    private String linkphone;

    private String phone;

    private String email;

    private String technicalterm;

    private String commerceterm;

    private String conaccessory;

    private String condept;

    private String affiliated;

    private Integer state;

    private Integer conpriority;

    private Date newtime;

    private Date updtime;


    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }

    public Integer getBusid() {
        return busid;
    }

    public void setBusid(Integer busid) {
        this.busid = busid;
    }

    public Integer getCliid() {
        return cliid;
    }

    public void setCliid(Integer cliid) {
        this.cliid = cliid;
    }

    public String getAllname() {
        return allname;
    }

    public void setAllname(String allname) {
        this.allname = allname;
    }

    public String getConname() {
        return conname;
    }

    public void setConname(String conname) {
        this.conname = conname;
    }

    public String getConserial() {
        return conserial;
    }

    public void setConserial(String conserial) {
        this.conserial = conserial;
    }

    public BigDecimal getConmoney() {
        return conmoney;
    }

    public void setConmoney(BigDecimal conmoney) {
        this.conmoney = conmoney;
    }

    public Date getContime() {
        return contime;
    }

    public void setContime(Date contime) {
        this.contime = contime;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname;
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

    public String getTechnicalterm() {
        return technicalterm;
    }

    public void setTechnicalterm(String technicalterm) {
        this.technicalterm = technicalterm;
    }

    public String getCommerceterm() {
        return commerceterm;
    }

    public void setCommerceterm(String commerceterm) {
        this.commerceterm = commerceterm;
    }

    public String getConaccessory() {
        return conaccessory;
    }

    public void setConaccessory(String conaccessory) {
        this.conaccessory = conaccessory;
    }

    public String getCondept() {
        return condept;
    }

    public void setCondept(String condept) {
        this.condept = condept;
    }

    public String getAffiliated() {
        return affiliated;
    }

    public void setAffiliated(String affiliated) {
        this.affiliated = affiliated;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getConpriority() {
        return conpriority;
    }

    public void setConpriority(Integer conpriority) {
        this.conpriority = conpriority;
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
        return "Contract{" +
            "conid=" + conid +
            ", busid=" + busid +
            ", cliid=" + cliid +
            ", allname='" + allname + '\'' +
            ", conname='" + conname + '\'' +
            ", conserial='" + conserial + '\'' +
            ", conmoney=" + conmoney +
            ", contime=" + contime +
            ", entrytime=" + entrytime +
            ", endtime=" + endtime +
            ", linkname='" + linkname + '\'' +
            ", linkphone='" + linkphone + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", technicalterm='" + technicalterm + '\'' +
            ", commerceterm='" + commerceterm + '\'' +
            ", conaccessory='" + conaccessory + '\'' +
            ", condept='" + condept + '\'' +
            ", affiliated='" + affiliated + '\'' +
            ", state=" + state +
            ", conpriority=" + conpriority +
            ", newtime=" + newtime +
            ", updtime=" + updtime +
            '}';
    }
}
