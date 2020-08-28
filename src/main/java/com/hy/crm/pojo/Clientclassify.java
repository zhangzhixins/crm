package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 客户分类表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Clientclassify implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "clicid", type = IdType.AUTO)
    private Integer clicid;

    private String ifyname;

    public Integer getClicid() {
        return clicid;
    }

    public void setClicid(Integer clicid) {
        this.clicid = clicid;
    }
    public String getIfyname() {
        return ifyname;
    }

    public void setIfyname(String ifyname) {
        this.ifyname = ifyname;
    }

    @Override
    public String toString() {
        return "Clientclassify{" +
            "clicid=" + clicid +
            ", ifyname=" + ifyname +
        "}";
    }
}
