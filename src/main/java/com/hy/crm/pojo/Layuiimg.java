package com.hy.crm.pojo;

public class Layuiimg {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Layuiimg{" +
            "code='" + code + '\'' +
            ", msg='" + msg + '\'' +
            ", data='" + data + '\'' +
            '}';
    }

    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String msg;
    private String data;
}
