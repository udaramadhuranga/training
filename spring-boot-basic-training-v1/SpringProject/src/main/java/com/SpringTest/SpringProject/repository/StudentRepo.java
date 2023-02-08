package com.SpringTest.SpringProject.repository;


import com.SpringTest.SpringProject.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String>
{
}
