package com.gd.sample.service;

import com.gd.sample.dto.Employee;
import com.gd.sample.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    EmployeeRepository emprepo;

    public EmployeeService(EmployeeRepository emprepo){
        this.emprepo = emprepo;
    }

    public List<Employee> getEmployee(){
        return emprepo.findAll();
    }

    public Employee getSingleEmployee(int id){
        Optional<Employee> emp = emprepo.findById(id);
        if(emp.isPresent()){
            return emp.get();
        }
        return null;
    }

    public Employee postEmployee(Employee emp){
        return emprepo.save(emp);
    }

    public Employee putEmployee(int id, Employee emp){
        emprepo.deleteById(id);
        return emprepo.save(emp);
    }

    public String deleteEmployee(int id){
        emprepo.deleteById(id);
        return "Emp id:" + id + " deleted Successfully.";
    }
}
