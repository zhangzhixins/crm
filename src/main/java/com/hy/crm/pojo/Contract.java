package com.hy.crm.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 合同表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "conid", type = IdType.AUTO)
    private Integer conid;

    private Integer busid;

    private Integer cliid;

    private String conname;

    private String conserial;

    private BigDecimal conmoney;

    private Date contime;

    private Date entrytime;

    private Date endtime;

    private String linkname;

    private Integer linkphone;

    private Integer phone;

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

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname;
    }

    public Integer getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(Integer linkphone) {
        this.linkphone = linkphone;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
