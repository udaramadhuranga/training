package com.SpringTest.SpringProject.repository;

import com.SpringTest.SpringProject.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<StudentModel,String>
{
}
