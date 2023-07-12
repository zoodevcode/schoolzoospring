package com.example.schoolzoo.controller;


import com.example.schoolzoo.Entities.Student;
import com.example.schoolzoo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/students")
    void addStudent(@RequestBody Student student) {
       studentService.create(student);
    }
}


