package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 跟单表（跟单不能修改）
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Documentary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "docid", type = IdType.AUTO)
    private Integer docid;

    private  String docname;

    private Integer busid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String doctime;

    private String docify;

    private String docpeople;

    private String doccontent;

    private String docaccessory;

    private String state;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Date newtime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Date updtime;

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }
    public Integer getBusid() {
        return busid;
    }

    public void setBusid(Integer busid) {
        this.busid = busid;
    }
    public String getDoctime() {
        return doctime;
    }

    public void setDoctime(String doctime) {
        this.doctime = doctime;
    }
    public String getDocify() {
        return docify;
    }

    public void setDocify(String docify) {
        this.docify = docify;
    }
    public String getDocpeople() {
        return docpeople;
    }

    public void setDocpeople(String docpeople) {
        this.docpeople = docpeople;
    }
    public String getDoccontent() {
        return doccontent;
    }

    public void setDoccontent(String doccontent) {
        this.doccontent = doccontent;
    }
    public String getDocaccessory() {
        return docaccessory;
    }

    public void setDocaccessory(String docaccessory) {
        this.docaccessory = docaccessory;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
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

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    @Override
    public String toString() {
        return "Documentary{" +
            "docid=" + docid +
            ", busid=" + busid +
            ", doctime=" + doctime +
            ", docify=" + docify +
            ", docpeople=" + docpeople +
            ", doccontent=" + doccontent +
            ", docaccessory=" + docaccessory +
            ", state=" + state +
            ", newtime=" + newtime +
            ", updtime=" + updtime +
        "}";
    }
}
