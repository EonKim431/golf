package com.example.golf.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GolfClass {
    @Id
    @Column(name = "class_id",nullable = false) @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "regist_month",length = 6) @NotNull
    private String registMonth;
    @Column(name = "class_no",length = 5) @NotNull
    private String classNo;
    @Column(name = "class_area",length = 5) @NotNull
    private String classArea;
    @Column(name = "teacher_code",length = 3) @NotNull
    private String teacherCode;
    @NotNull
    private Integer tuition;
}
