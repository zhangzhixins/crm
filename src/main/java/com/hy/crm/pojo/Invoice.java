package com.hy.crm.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 开票表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "invid", type = IdType.AUTO)
    private Integer invid;

    private Integer conid;

    private Integer finid;

    private Integer userid;

    private String invotheme;

    private Date endtime;

    private String step;

    private String duty;

    private String participant;

    private String address;

    private Date applytime;

    private String clause;

    private String conimage;

    private String identify;

    private BigDecimal invoice;

    private String capital;

    private Date maketime;

    private Integer invonum;

    private String accessoryim;

    public Integer getInvid() {
        return invid;
    }

    public void setInvid(Integer invid) {
        this.invid = invid;
    }
    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }
    public Integer getFinid() {
        return finid;
    }

    public void setFinid(Integer finid) {
        this.finid = finid;
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getInvotheme() {
        return invotheme;
    }

    public void setInvotheme(String invotheme) {
        this.invotheme = invotheme;
    }
    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }
    public String getClause() {
        return clause;
    }

    public void setClause(String clause) {
        this.clause = clause;
    }
    public String getConimage() {
        return conimage;
    }

    public void setConimage(String conimage) {
        this.conimage = conimage;
    }
    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
    public BigDecimal getInvoice() {
        return invoice;
    }

    public void setInvoice(BigDecimal invoice) {
        this.invoice = invoice;
    }
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    public Date getMaketime() {
        return maketime;
    }

    public void setMaketime(Date maketime) {
        this.maketime = maketime;
    }
    public Integer getInvonum() {
        return invonum;
    }

    public void setInvonum(Integer invonum) {
        this.invonum = invonum;
    }
    public String getAccessoryim() {
        return accessoryim;
    }

    public void setAccessoryim(String accessoryim) {
        this.accessoryim = accessoryim;
    }

    @Override
    public String toString() {
        return "Invoice{" +
            "invid=" + invid +
            ", conid=" + conid +
            ", finid=" + finid +
            ", userid=" + userid +
            ", invotheme=" + invotheme +
            ", endtime=" + endtime +
            ", step=" + step +
            ", duty=" + duty +
            ", participant=" + participant +
            ", address=" + address +
            ", applytime=" + applytime +
            ", clause=" + clause +
            ", conimage=" + conimage +
            ", identify=" + identify +
            ", invoice=" + invoice +
            ", capital=" + capital +
            ", maketime=" + maketime +
            ", invonum=" + invonum +
            ", accessoryim=" + accessoryim +
        "}";
    }
}
