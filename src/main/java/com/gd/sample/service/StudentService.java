package com.gd.sample.service;

import com.gd.sample.dto.Student;
import com.gd.sample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentrepo;

    public List<Student> getAllStudent(){
        return studentrepo.findAll();
    }

    public Optional<Student> getSingleStudent(int id){
        return studentrepo.findById(id);
    }

    public Student postStudent(Student student){
        return studentrepo.save(student);
    }

    public void deleteStudent(int id){
        studentrepo.deleteById(id);
    }

    public Student updateStudent(int id, Student student){
        studentrepo.deleteById(id);
        return studentrepo.save(student);
    }
}
