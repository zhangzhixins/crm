package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "deptid", type = IdType.AUTO)
    private Integer deptid;

    private String deptname;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Dept{" +
            "deptid=" + deptid +
            ", deptname=" + deptname +
        "}";
    }
}
