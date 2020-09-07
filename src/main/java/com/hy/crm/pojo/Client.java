package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 客户表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cliid", type = IdType.AUTO)
    private Integer cliid;

    private String cliname;

    private String clistr;

    private Integer ifyid;

    private String clisource;

    private String industry;

    private String website;

    private String regions;

    private String city;

    private String address;

    private Integer postalcode;

    private String clifax;

    private String linkname;

    private String linkdept;

    private String linkduty;

    private String linkphone;

    private String climail;

    private String cliphone;

    private String legalperson;

    private String capital;

    private String explains;

    private Integer state;

    private Date newtime;


    public Integer getCliid() {
        return cliid;
    }

    public void setCliid(Integer cliid) {
        this.cliid = cliid;
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname;
    }

    public String getClistr() {
        return clistr;
    }

    public void setClistr(String clistr) {
        this.clistr = clistr;
    }

    public Integer getIfyid() {
        return ifyid;
    }

    public void setIfyid(Integer ifyid) {
        this.ifyid = ifyid;
    }

    public String getClisource() {
        return clisource;
    }

    public void setClisource(String clisource) {
        this.clisource = clisource;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    public String getClifax() {
        return clifax;
    }

    public void setClifax(String clifax) {
        this.clifax = clifax;
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

    public String getClimail() {
        return climail;
    }

    public void setClimail(String climail) {
        this.climail = climail;
    }

    public String getCliphone() {
        return cliphone;
    }

    public void setCliphone(String cliphone) {
        this.cliphone = cliphone;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
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
}
