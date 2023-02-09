package com.SpringTest.SpringProject.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(pattern="yyyy-MM-dd")
    @Getter @Setter private Date dob;

    @Getter @Setter private int average;

    public Student(String name, Date dob, int average) {
        this.name = name;
        this.dob = dob;
        this.average = average;
    }
}
