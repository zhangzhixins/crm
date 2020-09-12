package com.hy.crm.pojo.vo;

public class ClassifyExt {
    private String classifeExt1;//客户分类1
    private String classifext2;//客户分类2
    private String classifext3;//客户分类3


    public String getClassifeExt1() {
        return classifeExt1;
    }

    public void setClassifeExt1(String classifeExt1) {
        this.classifeExt1 = classifeExt1;
    }

    public String getClassifext2() {
        return classifext2;
    }

    public void setClassifext2(String classifext2) {
        this.classifext2 = classifext2;
    }

    public String getClassifext3() {
        return classifext3;
    }

    public void setClassifext3(String classifext3) {
        this.classifext3 = classifext3;
    }
    @Override
    public String toString() {
        return "classifyExt{" +
                "classifeExt1='" + classifeExt1 + '\'' +
                ", classifext2='" + classifext2 + '\'' +
                ", classifext3='" + classifext3 + '\'' +
                '}';
    }
}
