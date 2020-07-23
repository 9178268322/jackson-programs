package com.ip.dateformat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ip.conversion.Patient;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsing {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            Patient patient = mapper.readValue(new File("writePatient.JSON"), Patient.class);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            Date date = dateFormat.parse(patient.getDateOfBirth());
            mapper.setDateFormat(dateFormat);
            System.out.println("Patient birthdate: "+mapper.writeValueAsString(date));

        } catch (IOException | ParseException exception) {
            System.out.println(exception);
        }

    }
}
