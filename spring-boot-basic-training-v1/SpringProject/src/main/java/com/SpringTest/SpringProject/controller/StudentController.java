package com.SpringTest.SpringProject.controller;

import com.SpringTest.SpringProject.model.Student;
import com.SpringTest.SpringProject.payload.request.StudentRequest;
import com.SpringTest.SpringProject.payload.response.StudentCreateResponse;
import com.SpringTest.SpringProject.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("apis/students")
public class StudentController {
    Logger logger = LoggerFactory.getLogger(StudentController.class);


    @Autowired
    private StudentService studentService;
    @PostMapping("/")
    public ResponseEntity<StudentCreateResponse> addStudent(@RequestBody StudentRequest student){

        try {
            logger.info(" Student add function Success");
            return new ResponseEntity<>(studentService.addMethod(student), HttpStatus.CREATED);

        } catch (Exception e){
            logger.error("Error happend in Student add function");
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }


    @GetMapping("/")
    public ResponseEntity  <List<Student>> getAllStudents(){

        try {
            logger.info(" Student list getting controller called Success");
            return new ResponseEntity<>(studentService.getStudentsList(), HttpStatus.OK);
        } catch (Exception e){
            logger.error("Student list getting controller error happended");
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Student>> getStudentById(@PathVariable String id){

        try {

            logger.info(" Student get by id controller called Success");

        return new ResponseEntity<>(studentService.getstudent(id), HttpStatus.OK);
    } catch (Exception e){
            logger.error("Student get by id controller error happended");
        return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable String id){
        try {

            logger.info(" Student delete controller called Success");
            return new ResponseEntity<>(studentService.deleteStudentById(id), HttpStatus.OK);
        } catch (Exception e){
            logger.error("Student delete controller error happended");
            return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }




}
