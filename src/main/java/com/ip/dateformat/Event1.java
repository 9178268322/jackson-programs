package com.ip.dateformat;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

public class Event1 {

    private String name;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date birthDate;

    public Event1(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
