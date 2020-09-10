package com.hy.crm.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.pojo.Documentary;
import com.hy.crm.pojo.vo.AftersaleExt;
import com.hy.crm.pojo.vo.TypeExt;
import org.apache.ibatis.annotations.Param;

public class SqlUtils {
    public String select1(Page<AftersaleExt> page, @Param("val") String val, @Param("keyWord") String keyWord, @Param("typeExt") TypeExt typeExt){
        StringBuffer sql = new StringBuffer("select * from aftersale where 1=1");
        if(val !=null && !val.equals("")){
            sql.append(" and ${val} like '%${keyWord}%'");
        }
        if(typeExt.getHand() !=null && !typeExt.getHand().equals("")){
            sql.append(" and state=1001");
        }
        if(typeExt.getEnd() !=null && !typeExt.getEnd().equals("")){
            sql.append(" and state=1002");
        }
        if(typeExt.getWithdraw() != null && !typeExt.getWithdraw().equals("")){
            sql.append(" and state=1003");
        }
        if(typeExt.getThisweek()!=null && !typeExt.getThisweek().equals("")){
            sql.append(" and YEARWEEK( date_format(starttime,'%Y-%m-%d' ) ) = YEARWEEK( now() )");
        }
        if(typeExt.getPreweek() !=null && !typeExt.getPreweek().equals("")){
            sql.append(" and yearweek(date_format(starttime, '%Y-%m-%d'),1) = yearweek(now(),1)-1");
        }
        if(typeExt.getThismonth() !=null && !typeExt.getThismonth().equals("")){
            sql.append(" and DATE_FORMAT(starttime, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m')");
        }
        if(typeExt.getPremonth() != null && !typeExt.getPremonth().equals("")){
            sql.append(" and date_format(starttime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m')");
        }
        if(typeExt.getThisseason() != null && !typeExt.getThisseason().equals("")){
            sql.append(" and QUARTER(starttime)=QUARTER(now())");
        }
        if(typeExt.getPreseason() !=null && !typeExt.getPreseason().equals("")){
            sql.append(" and QUARTER(starttime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER))");
        }
        return sql.toString();
    }



    public String select2(Page<Documentary> page,Documentary documentary){
        StringBuffer sql=new StringBuffer("select * from documentary where 1=1");
        if (documentary.getDocify()!=null && !documentary.getDocify().equals("")){
            if (documentary.getDocify()!="0"){
                sql.append("and ${documentary.getDocify()} like '%${documentary.getdoccontent()}%'");
            }
        }
        return  sql.toString();
    }
}
