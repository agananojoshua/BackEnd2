package com.example.demo.repo;

import com.example.demo.entity.Register;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RegisterRepo extends MongoRepository <Register, String> {

    List<Register> findBySeverity(String severity);

}
