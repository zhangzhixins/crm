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

    @TableId(value = "cliids", type = IdType.AUTO)
    private Integer cliids;

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

    private Integer linkid;

    private String climail;

    private Integer cliphone;

    private String legalperson;

    private String capital;

    private String explain;

    private Integer state;

    private Date newtime;

    public Integer getCliids() {
        return cliids;
    }

    public void setCliids(Integer cliids) {
        this.cliids = cliids;
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
    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }
    public String getClimail() {
        return climail;
    }

    public void setClimail(String climail) {
        this.climail = climail;
    }
    public Integer getCliphone() {
        return cliphone;
    }

    public void setCliphone(Integer cliphone) {
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
    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
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

    @Override
    public String toString() {
        return "Client{" +
            "cliids=" + cliids +
            ", cliname=" + cliname +
            ", clistr=" + clistr +
            ", ifyid=" + ifyid +
            ", clisource=" + clisource +
            ", industry=" + industry +
            ", website=" + website +
            ", regions=" + regions +
            ", city=" + city +
            ", address=" + address +
            ", postalcode=" + postalcode +
            ", clifax=" + clifax +
            ", linkid=" + linkid +
            ", climail=" + climail +
            ", cliphone=" + cliphone +
            ", legalperson=" + legalperson +
            ", capital=" + capital +
            ", explain=" + explain +
            ", state=" + state +
            ", newtime=" + newtime +
        "}";
    }
}
