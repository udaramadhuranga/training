package com.SpringTest.SpringProject.services;


import com.SpringTest.SpringProject.model.Student;
import com.SpringTest.SpringProject.payload.request.StudentRequest;
import com.SpringTest.SpringProject.payload.response.StudentCreateResponse;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentCreateResponse addMethod(StudentRequest s);

    List<Student> getStudentsList();

    Optional<Student> getstudent(String id);

    String deleteStudentById(String id);
}
