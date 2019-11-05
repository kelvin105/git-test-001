package cn.sdhy.test.pojo;

import java.io.Serializable;

public class StudentA implements Serializable {
    private String b_name;
    private String age;
    private Boolean sex;

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
}
