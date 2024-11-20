package com.example.HarshakProject.Repo;

import com.example.HarshakProject.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {

}
