package com.gd.sample.controller;

import com.gd.sample.dto.EmployeeDto;
import com.gd.sample.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
    @GetMapping("/")
    public String getInfo(){
        return "Hello Employee";
    }
    @GetMapping("/names")
    public ArrayList<EmployeeDto> getEmp(){
        ArrayList<EmployeeDto> res = new ArrayList<>();
        EmployeeDto s1 = new EmployeeDto(1, "Arun", 23);
        EmployeeDto s2 = new EmployeeDto(2, "Ganga", 24);
        EmployeeDto s3 = new EmployeeDto(3, "Aadhi", 24);

        res.add(s1);
        res.add(s2);
        res.add(s3);

        return res;
    }
}
