package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
/**
 * <p>
 * 权限表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Auth implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "authid", type = IdType.AUTO)
    private Integer authid;

    private String authname;

    private String authstr;

    private String authurl;

    public Integer getAuthid() {
        return authid;
    }

    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
    public String getAuthname() {
        return authname;
    }

    public void setAuthname(String authname) {
        this.authname = authname;
    }
    public String getAuthstr() {
        return authstr;
    }

    public void setAuthstr(String authstr) {
        this.authstr = authstr;
    }
    public String getAuthurl() {
        return authurl;
    }

    public void setAuthurl(String authurl) {
        this.authurl = authurl;
    }

    @Override
    public String toString() {
        return "Auth{" +
            "authid=" + authid +
            ", authname=" + authname +
            ", authstr=" + authstr +
            ", authurl=" + authurl +
        "}";
    }
}
