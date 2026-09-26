package com.gd.sample.controller;

import com.gd.sample.dto.Student;
import com.gd.sample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/std")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/all-Students")
    public List<Student> getStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public Optional<Student> getSingleStudent(@PathVariable int id){
        return studentService.getSingleStudent(id);
    }

    @PostMapping("/add-student")
    public Student postStudent(@RequestBody Student student){
        return studentService.postStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Student " + id + " deleted";
    }
}
