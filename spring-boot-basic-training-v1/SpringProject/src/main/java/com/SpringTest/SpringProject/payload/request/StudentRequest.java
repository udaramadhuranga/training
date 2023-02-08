package com.SpringTest.SpringProject.payload.request;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Builder
@Data
public class StudentRequest {

    private String name;

    private String dob;

     private int average;
}
