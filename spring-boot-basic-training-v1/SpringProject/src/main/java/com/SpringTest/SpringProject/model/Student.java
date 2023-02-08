package com.SpringTest.SpringProject.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "students")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    @Id
   @Getter @Setter private String id;
    @Getter @Setter private String name;

    @Getter @Setter private String dob;

    @Getter @Setter private int average;

    public Student(String name, String dob, int average) {
        this.name = name;
        this.dob = dob;
        this.average = average;
    }
}
