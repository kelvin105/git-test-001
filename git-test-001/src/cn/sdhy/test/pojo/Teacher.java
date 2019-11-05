package cn.sdhy.test.pojo;

import java.io.Serializable;

public class Teacher implements Serializable {

    private String name;
    private String qualifications;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
