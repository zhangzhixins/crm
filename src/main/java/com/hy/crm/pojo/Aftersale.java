package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 售后服务表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Aftersale implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "aftid", type = IdType.AUTO)
    private Integer aftid;

    private String afttheme;

    private String step;

    private String duty;

    private String participant;

    private String cliname;

    private String conid;

    private String afttype;

    private String aftmode;

    private Date starttime;

    private Date endtime;

    private String aftcontent;

    private String aftback;

    private String aftpeo;

    private Integer aftgrade;

    private String accessoryim;

    private String state;

    public Integer getAftid() {
        return aftid;
    }

    public void setAftid(Integer aftid) {
        this.aftid = aftid;
    }
    public String getAfttheme() {
        return afttheme;
    }

    public void setAfttheme(String afttheme) {
        this.afttheme = afttheme;
    }
    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }
    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname;
    }
    public String getConid() {
        return conid;
    }

    public void setConid(String conid) {
        this.conid = conid;
    }
    public String getAfttype() {
        return afttype;
    }

    public void setAfttype(String afttype) {
        this.afttype = afttype;
    }
    public String getAftmode() {
        return aftmode;
    }

    public void setAftmode(String aftmode) {
        this.aftmode = aftmode;
    }
    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }
    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
    public String getAftcontent() {
        return aftcontent;
    }

    public void setAftcontent(String aftcontent) {
        this.aftcontent = aftcontent;
    }
    public String getAftback() {
        return aftback;
    }

    public void setAftback(String aftback) {
        this.aftback = aftback;
    }
    public String getAftpeo() {
        return aftpeo;
    }

    public void setAftpeo(String aftpeo) {
        this.aftpeo = aftpeo;
    }
    public Integer getAftgrade() {
        return aftgrade;
    }

    public void setAftgrade(Integer aftgrade) {
        this.aftgrade = aftgrade;
    }
    public String getAccessoryim() {
        return accessoryim;
    }

    public void setAccessoryim(String accessoryim) {
        this.accessoryim = accessoryim;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Aftersale{" +
            "aftid=" + aftid +
            ", afttheme=" + afttheme +
            ", step=" + step +
            ", duty=" + duty +
            ", participant=" + participant +
            ", cliname=" + cliname +
            ", conid=" + conid +
            ", afttype=" + afttype +
            ", aftmode=" + aftmode +
            ", starttime=" + starttime +
            ", endtime=" + endtime +
            ", aftcontent=" + aftcontent +
            ", aftback=" + aftback +
            ", aftpeo=" + aftpeo +
            ", aftgrade=" + aftgrade +
            ", accessoryim=" + accessoryim +
            ", state=" + state +
        "}";
    }
}
