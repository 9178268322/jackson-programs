package com.ip.handlingsubtypes;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/*@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = MemberChild.class, name = "MemberChild"),
        @JsonSubTypes.Type(value = MemberAdult.class, name = "MemberAdult")})*/
public abstract class Member {

    private String name;
    private String dob;

    protected Member(String name, String dob) {
        this.setName(name);
        this.setDob(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
