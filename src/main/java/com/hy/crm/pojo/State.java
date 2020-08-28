package com.hy.crm.pojo;

import java.io.Serializable;

/**
 * <p>
 * 状态表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class State implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer stateid;

    private String module;

    private String statename;

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    @Override
    public String toString() {
        return "State{" +
            "stateid=" + stateid +
            ", module=" + module +
            ", statename=" + statename +
        "}";
    }
}
