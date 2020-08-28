package com.hy.crm.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 收入登记表（订单明细)
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Income implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "incid", type = IdType.AUTO)
    private Integer incid;

    private Integer conid;

    private Date inctime;

    private String incclassify;

    private BigDecimal incmoney;

    private String capital;

    private String payment;

    private Integer userid;

    private String affliated;

    private String incdept;

    private String incomeinfo;

    private Date newtime;

    public Integer getIncid() {
        return incid;
    }

    public void setIncid(Integer incid) {
        this.incid = incid;
    }
    public Integer getConid() {
        return conid;
    }

    public void setConid(Integer conid) {
        this.conid = conid;
    }
    public Date getInctime() {
        return inctime;
    }

    public void setInctime(Date inctime) {
        this.inctime = inctime;
    }
    public String getIncclassify() {
        return incclassify;
    }

    public void setIncclassify(String incclassify) {
        this.incclassify = incclassify;
    }
    public BigDecimal getIncmoney() {
        return incmoney;
    }

    public void setIncmoney(BigDecimal incmoney) {
        this.incmoney = incmoney;
    }
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getAffliated() {
        return affliated;
    }

    public void setAffliated(String affliated) {
        this.affliated = affliated;
    }
    public String getIncdept() {
        return incdept;
    }

    public void setIncdept(String incdept) {
        this.incdept = incdept;
    }
    public String getIncomeinfo() {
        return incomeinfo;
    }

    public void setIncomeinfo(String incomeinfo) {
        this.incomeinfo = incomeinfo;
    }
    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }

    @Override
    public String toString() {
        return "Income{" +
            "incid=" + incid +
            ", conid=" + conid +
            ", inctime=" + inctime +
            ", incclassify=" + incclassify +
            ", incmoney=" + incmoney +
            ", capital=" + capital +
            ", payment=" + payment +
            ", userid=" + userid +
            ", affliated=" + affliated +
            ", incdept=" + incdept +
            ", incomeinfo=" + incomeinfo +
            ", newtime=" + newtime +
        "}";
    }
}
