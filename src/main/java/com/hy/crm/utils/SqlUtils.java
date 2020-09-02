package com.hy.crm.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.pojo.vo.AftersaleExt;
import org.apache.ibatis.annotations.Param;

public class SqlUtils {

    public String select1(Page<AftersaleExt> page, @Param("val") String val,@Param("keyWord") String keyWord){
        StringBuffer sql = new StringBuffer("select * from aftersale where 1=1");
        if(val !=null && !val.equals("")){
            sql.append(" and ${val} like '%${keyWord}%'");
        }
        return sql.toString();
    }
}
