package com.ip.dateformat;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Event {

    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd hh:mm")
    private Date birthDate;

    public Event(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

}
