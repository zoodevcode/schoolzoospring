package com.example.schoolzoo.services;


import com.example.schoolzoo.Entities.Student;
import com.example.schoolzoo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public Student create(Student student){
        return studentRepository.save(student);
    }
}
