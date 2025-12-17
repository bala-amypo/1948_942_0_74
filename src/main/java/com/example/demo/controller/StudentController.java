package com.example.demo.controller;


@RestController
public class StudentController{
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Stuentity student){
        return studentService.saveStudent(student);
    }
}