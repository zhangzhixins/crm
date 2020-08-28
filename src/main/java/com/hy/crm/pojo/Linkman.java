package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 联系人表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Linkman implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "linkid", type = IdType.AUTO)
    private Integer linkid;

    private String linkname;

    private String linkdept;

    private String linkduty;

    private Integer linkphone;

    private String linkmail;

    private Integer identify;

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
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
    public Integer getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(Integer linkphone) {
        this.linkphone = linkphone;
    }
    public String getLinkmail() {
        return linkmail;
    }

    public void setLinkmail(String linkmail) {
        this.linkmail = linkmail;
    }
    public Integer getIdentify() {
        return identify;
    }

    public void setIdentify(Integer identify) {
        this.identify = identify;
    }

    @Override
    public String toString() {
        return "Linkman{" +
            "linkid=" + linkid +
            ", linkname=" + linkname +
            ", linkdept=" + linkdept +
            ", linkduty=" + linkduty +
            ", linkphone=" + linkphone +
            ", linkmail=" + linkmail +
            ", identify=" + identify +
        "}";
    }
}
