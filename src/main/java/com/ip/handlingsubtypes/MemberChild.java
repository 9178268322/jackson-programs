package com.ip.handlingsubtypes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"dob", "age"})
public class MemberChild extends Member {

    private int age;

    //@JsonIgnore
    private String parentName;

    public MemberChild(String name, String dob, int age, String parentName) {
        super(name, dob);
        this.setAge(age);
        this.setParentName(parentName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}
