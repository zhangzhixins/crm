package com.hy.crm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zzx
 * @since 2020-08-28
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;

    private String username;

    private String pwd;

    private String usermotto;

    private String image;

    private Integer deptid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getUsermotto() {
        return usermotto;
    }

    public void setUsermotto(String usermotto) {
        this.usermotto = usermotto;
    }
    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "User{" +
            "userid=" + userid +
            ", username='" + username + '\'' +
            ", pwd='" + pwd + '\'' +
            ", usermotto='" + usermotto + '\'' +
            ", image='" + image + '\'' +
            ", deptid=" + deptid +
            '}';
    }
}
