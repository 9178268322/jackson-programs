package com.ip.handlingsubtypes;


public class MemberAdult extends Member {

    private String memberID;

    public MemberAdult(String name, String dob, String memberID) {
        super(name, dob);
        this.setMemberID(memberID);
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
}
