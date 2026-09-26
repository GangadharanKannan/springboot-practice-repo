package com.gd.sample.controller;

import com.gd.sample.dto.Employee;
import com.gd.sample.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
    EmployeeService empService;

    public EmployeeController(EmployeeService empService){
        this.empService = empService;
    }

    @GetMapping("/all-employee")
    public List<Employee> getEmployee(){
        return empService.getEmployee();
    }

    @GetMapping("/{id}")
    public Employee getSingleOne(@PathVariable int id){
        return empService.getSingleEmployee(id);
    }

    @PostMapping("/add-employee")
    public Employee addEmployee(@RequestBody Employee emp){
        return empService.postEmployee(emp);
    }

    @PutMapping("/{id}")
    public Employee editEmployee(@PathVariable int id, @RequestBody Employee emp){
        return empService.putEmployee(id, emp);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
        return empService.deleteEmployee(id);
    }
}
