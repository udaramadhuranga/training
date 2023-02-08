package com.SpringTest.SpringProject.controller;

import com.SpringTest.SpringProject.model.StudentModel;
import com.SpringTest.SpringProject.payload.response.StudentCreateResponse;
import com.SpringTest.SpringProject.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity<StudentCreateResponse> addStudent(@RequestBody StudentModel studentModel){

        try {
            return new ResponseEntity<>(studentService.addMethod(studentModel), HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
        }



    }


    @GetMapping("/getAll")
    public ResponseEntity <List<StudentModel>> getAllStudents(){

        try {
            return new ResponseEntity<>(studentService.getStudentsList(), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity <Optional<StudentModel>> getStudentById(@PathVariable String id){

        try {

        return new ResponseEntity<>(studentService.getstudent(id), HttpStatus.OK);
    } catch (Exception e){
        return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable String id){
        try {

            return new ResponseEntity<>(studentService.deleteStudentById(id), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }




}
