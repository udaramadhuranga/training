package com.SpringTest.SpringProject.services;

import com.SpringTest.SpringProject.model.StudentModel;
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
    public StudentCreateResponse addMethod(StudentModel s) {
        StudentModel studentModel;

        studentModel = studentRepo.save(s);

         StudentCreateResponse response = new StudentCreateResponse(studentModel,"Student create success ");

         return response;
    }

    @Override
    public List<StudentModel> getStudentsList() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<StudentModel> getstudent(String id) {
        return studentRepo.findById(id);
    }

    @Override
    public String deleteStudentById(String id) {
        studentRepo.deleteById(id);
        return id;
    }
}
