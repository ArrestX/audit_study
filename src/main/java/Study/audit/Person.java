package org.audit;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String name;
    private String sex;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}