package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;


/**
 * <p>
 * 财务表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class Finance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "find", type = IdType.AUTO)
    private Integer find;

    private String bankaccount;

    private Integer cliid;

    private String finname;

    private String finbank;

    private String finaddress;

    private String findpara;

    private String finphone;

    private Date newtime;

    public Integer getFind() {
        return find;
    }

    public void setFind(Integer find) {
        this.find = find;
    }
    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }
    public Integer getCliid() {
        return cliid;
    }

    public void setCliid(Integer cliid) {
        this.cliid = cliid;
    }
    public String getFinname() {
        return finname;
    }

    public void setFinname(String finname) {
        this.finname = finname;
    }
    public String getFinbank() {
        return finbank;
    }

    public void setFinbank(String finbank) {
        this.finbank = finbank;
    }
    public String getFinaddress() {
        return finaddress;
    }

    public void setFinaddress(String finaddress) {
        this.finaddress = finaddress;
    }
    public String getFindpara() {
        return findpara;
    }

    public void setFindpara(String findpara) {
        this.findpara = findpara;
    }
    public String getFinphone() {
        return finphone;
    }

    public void setFinphone(String finphone) {
        this.finphone = finphone;
    }
    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }

    @Override
    public String toString() {
        return "Finance{" +
            "find=" + find +
            ", bankaccount=" + bankaccount +
            ", cliid=" + cliid +
            ", finname=" + finname +
            ", finbank=" + finbank +
            ", finaddress=" + finaddress +
            ", findpara=" + findpara +
            ", finphone=" + finphone +
            ", newtime=" + newtime +
        "}";
    }
}
