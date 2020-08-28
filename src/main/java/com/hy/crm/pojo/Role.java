package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "roleid", type = IdType.AUTO)
    private Integer roleid;

    private String rolename;

    private String rolestr;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    public String getRolestr() {
        return rolestr;
    }

    public void setRolestr(String rolestr) {
        this.rolestr = rolestr;
    }

    @Override
    public String toString() {
        return "Role{" +
            "roleid=" + roleid +
            ", rolename=" + rolename +
            ", rolestr=" + rolestr +
        "}";
    }
}
