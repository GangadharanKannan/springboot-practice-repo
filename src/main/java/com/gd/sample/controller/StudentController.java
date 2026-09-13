package com.gd.sample.controller;

import com.gd.sample.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id){
        return "hello " + id;
    }

    @GetMapping("/details")
    public ArrayList<StudentDto> getDetail(){
        ArrayList<StudentDto> res = new ArrayList<>();
        StudentDto s1 = new StudentDto(1, "Arun", 23);
        StudentDto s2 = new StudentDto(2, "Ganga", 24);
        StudentDto s3 = new StudentDto(3, "Aadhi", 24);

        res.add(s1);
        res.add(s2);
        res.add(s3);

        return res;
    }
}
