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
}
