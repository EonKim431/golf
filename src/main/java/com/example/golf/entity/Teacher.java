package com.example.golf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Teacher {
    @Id @Column(name = "teacher_code",length = 3,nullable = false)
    private String id;
    @Column(name = "teacher_name",length = 15)
    private String name;
    @Column(name = "class_name",length = 20)
    private String className;
    private int price;
    @Column(name = "teacher_gegist_date",length = 8)
    private String date;

}
