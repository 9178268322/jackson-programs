package com.ip.handlingsubtypes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SubtypeDemoTest {

    @Test
    public void subtypeDemoTest() {

        try {
            ObjectMapper mapper = new ObjectMapper();
            //mapper.enableDefaultTyping();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.addMixIn(MemberChild.class, MemberChildMixIn.class);
            MemberAdult adult = new MemberAdult("John Smith", "5/29/83", "IX10B2914");
            MemberChild child = new MemberChild("Tommy Smith", "3/4/2014", 5, "John Smith");

            List<Member> members = new ArrayList<>();
            members.add(adult);
            members.add(child);

            Patient serializedPatients = new Patient();
            serializedPatients.setMembers(members);

            String jsonDataStrinbg = mapper.writeValueAsString(serializedPatients);
            System.out.println(jsonDataStrinbg);

        } catch (JsonProcessingException exception) {
            System.out.println(exception);
        }
    }
}
