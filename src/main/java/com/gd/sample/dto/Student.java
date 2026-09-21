package com.gd.sample.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
    private String email;
    private String course;
}
