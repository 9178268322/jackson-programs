package com.ip.treemodel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class TreeModelWriter {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode root = mapper.readTree(new File("TreeRead.JSON"));

        // Here am removing one property
        ((ObjectNode)root).remove("middleName");
        // Here am adding one property
        ((ObjectNode)root).put("nickName", "Jane");

        // Here am adding an array
        ((ObjectNode)root).putArray("recentWeight");
        ((ObjectNode)root).withArray("recentWeight").add("180");
        ((ObjectNode)root).withArray("recentWeight").add("184");
        ((ObjectNode)root).withArray("recentWeight").add("182");

        // Here am removing array
        ((ObjectNode)root).withArray("recentWeight").removeAll();


        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root));
    }
}
