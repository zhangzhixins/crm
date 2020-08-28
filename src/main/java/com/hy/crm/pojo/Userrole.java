package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Userrole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "urid", type = IdType.AUTO)
    private Integer urid;

    private Integer userid;

    private Integer roleid;

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "Userrole{" +
            "urid=" + urid +
            ", userid=" + userid +
            ", roleid=" + roleid +
        "}";
    }
}
