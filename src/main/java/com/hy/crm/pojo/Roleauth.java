package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 角色权限表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Roleauth implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "raid", type = IdType.AUTO)
    private Integer raid;

    private Integer roleid;

    private Integer authid;

    public Integer getRaid() {
        return raid;
    }

    public void setRaid(Integer raid) {
        this.raid = raid;
    }
    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
    public Integer getAuthid() {
        return authid;
    }

    public void setAuthid(Integer authid) {
        this.authid = authid;
    }

    @Override
    public String toString() {
        return "Roleauth{" +
            "raid=" + raid +
            ", roleid=" + roleid +
            ", authid=" + authid +
        "}";
    }
}
