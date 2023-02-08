package com.SpringTest.SpringProject.payload.response;

import com.SpringTest.SpringProject.model.StudentModel;
import lombok.Builder;
import lombok.Data;

@Data
public class StudentCreateResponse {

    private Object java ;

    private String Message;


    public StudentCreateResponse(Object java, String message) {
        this.java = java;
        Message = message;
    }
}
