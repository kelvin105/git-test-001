package cn.sdhy.test.pojo;

import java.io.Serializable;

public class StudentA implements Serializable {
    private String c_name;
    private String age;
    private int[] cards;

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

    public int[] getCards() {
        return cards;
    }

    public void setCards(int[] cards) {
        this.cards = cards;
    }
}
