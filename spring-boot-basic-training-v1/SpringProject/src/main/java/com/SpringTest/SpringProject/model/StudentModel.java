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
@Builder
@Document(collection = "students")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentModel {

    @Id
   @Getter @Setter private String id;
    @Getter @Setter private String name;

    @Getter @Setter private String dob;

    @Getter @Setter private int average;



}
