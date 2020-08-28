package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 回复表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Reply implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "replyid", type = IdType.AUTO)
    private Integer replyid;

    private Integer postid;

    private Integer userid;

    private String replyinfo;

    private Date replytime;

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }
    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getReplyinfo() {
        return replyinfo;
    }

    public void setReplyinfo(String replyinfo) {
        this.replyinfo = replyinfo;
    }
    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    @Override
    public String toString() {
        return "Reply{" +
            "replyid=" + replyid +
            ", postid=" + postid +
            ", userid=" + userid +
            ", replyinfo=" + replyinfo +
            ", replytime=" + replytime +
        "}";
    }
}
