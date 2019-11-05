package cn.sdhy.test.pojo;

import java.io.Serializable;
import java.util.Date;

public class StudentA implements Serializable {
    private String a_name;
    private String age;
    private Date expire_time;

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    private String b_name;
    private Boolean sex;

    private String c_name;
    private int[] cards;

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }


    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(Date expire_time) {
        this.expire_time = expire_time;
    }
    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex){
        this.sex = sex;
    }
    public int[] getCards() {
        return cards;
    }

    public void setCards(int[] cards) {
        this.cards = cards;
    }
}
