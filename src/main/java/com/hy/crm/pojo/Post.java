package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 帖子表（针对哪一个商机发布的帖子）
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "postid", type = IdType.AUTO)
    private Integer postid;

    private String postify;

    private String label;

    private String theme;

    private Integer sendid;

    private String postaccessory;

    private String postcontent;

    private Integer num;

    private String stick;

    private Date newtime;

    private Date updtime;

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }
    public String getPostify() {
        return postify;
    }

    public void setPostify(String postify) {
        this.postify = postify;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    public Integer getSendid() {
        return sendid;
    }

    public void setSendid(Integer sendid) {
        this.sendid = sendid;
    }
    public String getPostaccessory() {
        return postaccessory;
    }

    public void setPostaccessory(String postaccessory) {
        this.postaccessory = postaccessory;
    }
    public String getPostcontent() {
        return postcontent;
    }

    public void setPostcontent(String postcontent) {
        this.postcontent = postcontent;
    }
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
    public String getStick() {
        return stick;
    }

    public void setStick(String stick) {
        this.stick = stick;
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
        return "Post{" +
            "postid=" + postid +
            ", postify=" + postify +
            ", label=" + label +
            ", theme=" + theme +
            ", sendid=" + sendid +
            ", postaccessory=" + postaccessory +
            ", postcontent=" + postcontent +
            ", num=" + num +
            ", stick=" + stick +
            ", newtime=" + newtime +
            ", updtime=" + updtime +
        "}";
    }
}
