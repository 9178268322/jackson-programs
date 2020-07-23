package com.ip.handlingsubtypes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class MemberChildMixIn {

    @JsonIgnore
    public String name;
    @JsonIgnore
    public String age;
}
