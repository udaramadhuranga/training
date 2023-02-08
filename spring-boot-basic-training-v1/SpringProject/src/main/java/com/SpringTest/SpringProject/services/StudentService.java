package com.SpringTest.SpringProject.services;

import com.SpringTest.SpringProject.model.StudentModel;
import com.SpringTest.SpringProject.payload.response.StudentCreateResponse;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentCreateResponse addMethod(StudentModel s);

    List<StudentModel> getStudentsList();

    Optional<StudentModel> getstudent(String id);

    String deleteStudentById(String id);
}
