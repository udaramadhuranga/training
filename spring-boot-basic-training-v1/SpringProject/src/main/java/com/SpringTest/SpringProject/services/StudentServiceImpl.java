package com.SpringTest.SpringProject.services;


import com.SpringTest.SpringProject.model.Student;
import com.SpringTest.SpringProject.payload.request.StudentRequest;
import com.SpringTest.SpringProject.payload.response.StudentCreateResponse;
import com.SpringTest.SpringProject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl  implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public StudentCreateResponse addMethod(StudentRequest studentRequest) {
        Student student = new Student(studentRequest.getName(),studentRequest.getDob(),studentRequest.getAverage()) ;



        student = studentRepo.save(student);

         StudentCreateResponse response = new StudentCreateResponse(student,"Student create success ");

         return response;
    }

    @Override
    public List<Student> getStudentsList() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> getstudent(String id) {
        return studentRepo.findById(id);
    }

    @Override
    public String deleteStudentById(String id) {
        studentRepo.deleteById(id);
        return id;
    }
}
