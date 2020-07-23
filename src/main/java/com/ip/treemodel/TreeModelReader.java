package com.ip.treemodel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TreeModelReader {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = mapper.readTree(new File("TreeRead.JSON"));

        String firstNameNode = root.get("firstName").asText();
        System.out.println("First Name: " + firstNameNode);

        JsonNode arrayOfBp = root.get("recentBp");
        if (arrayOfBp.isArray()) {
            for (JsonNode jsonNode : arrayOfBp) {
                System.out.println("Value :" + jsonNode.asText());
            }
        }

        JsonNode primaryDoctor = root.get("primaryDoctor");
        System.out.println("Primary Doctor is Object? :" + primaryDoctor.isObject());
        System.out.println("Id :" + primaryDoctor.get("id").asText());
        System.out.println("First Name :" + primaryDoctor.get("firstName").asText());
        System.out.println("Last Name :" + primaryDoctor.get("lastName").asText());

        JsonNode arrayOfDoctors = root.get("specialistDoctors");
        for (JsonNode jsonNode : arrayOfDoctors) {
            System.out.println("id : " + jsonNode.get("id").asText()
                    + " firstName : " + jsonNode.get("firstName").asText()
                    + " lastName : " + jsonNode.get("lastName").asText());
        }
    }
}
