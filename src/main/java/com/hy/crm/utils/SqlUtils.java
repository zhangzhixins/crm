package com.hy.crm.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hy.crm.pojo.Contract;
import com.hy.crm.pojo.Documentary;
import com.hy.crm.pojo.Post;
import com.hy.crm.pojo.vo.AftersaleExt;
import com.hy.crm.pojo.vo.TypeExt;
import com.hy.crm.pojo.vo.TypeExt1;
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



    public String select2(Page<Documentary> page, @Param("doc") Documentary documentary){
        StringBuffer sql=new StringBuffer("select * from documentary where 1=1");
        if (documentary.getDocify()!=null && !documentary.getDocify().equals("")) {
            if (documentary.getDocify() != "0") {
                sql.append("and ${doc.docify()} like %${doc.doccontent()}%");
            }
        }

        return  sql.toString();
    }
    public String select3(Page<Contract> page, @Param("con") Contract contract,@Param("type")TypeExt1 typeExt1){
        StringBuffer sql=new StringBuffer("select * from contract where 1=1");
        if (contract.getConname()!=null && !contract.getConname().equals("")){
            if (contract.getConname()!="0"){
                sql.append("and ${con.conname()} like %${con.allname()}%");
            }
        }
        if(typeExt1.getHand() !=null && !typeExt1.getHand().equals("")){
            sql.append(" and state=1001");
        }
        if(typeExt1.getEnd() !=null && !typeExt1.getEnd().equals("")){
            sql.append(" and state=1002");
        }
        if(typeExt1.getWithdraw() != null && !typeExt1.getWithdraw().equals("")){
            sql.append(" and state=1003");
        }
        if(typeExt1.getWithw()!= null && !typeExt1.getWithw().equals("")){
            sql.append(" and state=1004");
        }
        if(typeExt1.getThisweek()!=null && !typeExt1.getThisweek().equals("")){
            sql.append(" and YEARWEEK( date_format(contime,'%Y-%m-%d' ) ) = YEARWEEK( now() )");
        }
        if(typeExt1.getPreweek() !=null && !typeExt1.getPreweek().equals("")){
            sql.append(" and yearweek(date_format(contime, '%Y-%m-%d'),1) = yearweek(now(),1)-1");
        }
        if(typeExt1.getThismonth() !=null && !typeExt1.getThismonth().equals("")){
            sql.append(" and DATE_FORMAT(contime, '%Y%m') = DATE_FORMAT(CURDATE(), '%Y%m')");
        }
        if(typeExt1.getPremonth() != null && !typeExt1.getPremonth().equals("")){
            sql.append(" and date_format(contime,'%Y-%m')=date_format(DATE_SUB(curdate(), INTERVAL 1 MONTH),'%Y-%m')");
        }
        if(typeExt1.getThisseason() != null && !typeExt1.getThisseason().equals("")){
            sql.append(" and QUARTER(contime)=QUARTER(now())");
        }
        if(typeExt1.getPreseason() !=null && !typeExt1.getPreseason().equals("")){
            sql.append(" and QUARTER(contime)=QUARTER(DATE_SUB(now(),interval 1 QUARTER))");
        }
        return  sql.toString();
    }
    public String select4(Page<Documentary> page, @Param("post") Post post){
        StringBuffer sql=new StringBuffer("select * from post where 1=1");
        if (post.getLabel()!=null && !post.getLabel().equals("")) {
            if (post.getLabel() != "0") {
                sql.append("and ${post.label()} like %${post.theme()}%");
            }
        }
        return  sql.toString();
    }



    public String select7(@Param("state") Integer state,@Param("date") String date){
        StringBuffer sql=new StringBuffer("select count(1) as count,sum(makemoney) as money from business ");
        if(date=="1" ||date.equals("1")){
            sql.append(" where state=#{state}");
        }else {
            sql.append(" where state=#{state} ${date}");
        }
        System.out.println("11111111111111111111111111111"+sql);
        return sql.toString();
    }
}
