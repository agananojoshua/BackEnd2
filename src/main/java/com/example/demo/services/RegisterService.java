package com.example.demo.services;

import com.example.demo.entity.Register;
import com.example.demo.repo.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    public void saveorUpdate(Register register) {
        registerRepo.save(register);
    }

    public Iterable<Register> litAll() {
        return this.registerRepo.findAll();
    }

    public List<Register> getTaskBySeverity(String severity){
        return registerRepo.findBySeverity(severity);
    }

    public void deleteStudent(String id) {
        registerRepo.deleteById(id);
    }

    public Register getStudentByID(String studentid) {
        return registerRepo.findById(studentid).get();
    }

}
