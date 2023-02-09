package com.SpringTest.SpringProject.payload.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Builder
@Data
public class StudentRequest {

    private String name;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dob;


     private int average;
}
