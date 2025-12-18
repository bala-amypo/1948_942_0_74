package com.example.demo.Serviceimpl;


import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.Stuentity;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    public StudentServiceImpl (StudentRepository studentRepository){
        this.studentRepository=studentRepository;

    }
    public Stuentity saveStudent(Stuentity student){
        return studentRepository.save(student);
    }
}