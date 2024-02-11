package com.example.demo.controller;

import com.example.demo.entity.Register;
import com.example.demo.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody Register register)
    {
        registerService.saveorUpdate(register);
        return register.getId();
    }

    @GetMapping(value = "/getAll")
    private Iterable<Register>getStudent()
    {
        return registerService.litAll();
    }

    @GetMapping("/severity/{severity}")
    public List<Register> findTaskUsingSeverity(@PathVariable String severity){
        return registerService.getTaskBySeverity(severity);
    }

    @PutMapping(value = "/edit/{id}")
    private Register update(@RequestBody Register register, @PathVariable(name = "id")String id)
    {
        register.setId(id);
        registerService.saveorUpdate(register);
        return register;

    }

    @DeleteMapping("delete/{id}")
    private void deleteStudent(@PathVariable("id")String id)
    {
        registerService.deleteStudent(id);

    }

    @RequestMapping("/search/{id}")
    private Register getStudent(@PathVariable(name = "id")String studentid)
    {
        return registerService.getStudentByID(studentid);
    }

}
