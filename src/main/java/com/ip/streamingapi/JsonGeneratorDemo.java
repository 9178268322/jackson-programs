package com.ip.streamingapi;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ip.conversion.Patient;

import java.io.IOException;

public class JsonGeneratorDemo {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator jsonGenerator = jsonFactory.createGenerator(System.out);

        jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
        jsonGenerator.setCodec(mapper);

        jsonGenerator.writeStartObject();

        jsonGenerator.writeFieldName("first_name");
        jsonGenerator.writeString("Jean-Marc");
        jsonGenerator.writeFieldName("last_name");
        jsonGenerator.writeString("Jullien");

        jsonGenerator.writeStringField("dob", "3/4/2019");


        Patient patient = new Patient();
        patient.setFirstName("Jean-Marc");
        patient.setLastName("Julien");
        patient.setDateOfBirth("5/12/1983");

        jsonGenerator.writeFieldName("patient_object");
        jsonGenerator.writeObject(patient);

        jsonGenerator.writeFieldName("recent_visits_array");
        jsonGenerator.writeStartArray();
        jsonGenerator.writeString("5/1/2019");
        jsonGenerator.writeString("5/2/3576");
        jsonGenerator.writeString("5/3/2019");
        jsonGenerator.writeEndArray();

        jsonGenerator.writeEndObject();
        jsonGenerator.close();
    }
}
