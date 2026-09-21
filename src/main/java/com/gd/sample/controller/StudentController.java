package com.gd.sample.controller;

import com.gd.sample.dto.Student;
import com.gd.sample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("student/{id}")
    public Optional<Student> getSingleStudent(@PathVariable int id){
        return studentService.getSingleStudent(id);
    }

    @PostMapping("/student")
    public Student postStudent(@RequestBody Student student){
        return studentService.postStudent(student);
    }
}
