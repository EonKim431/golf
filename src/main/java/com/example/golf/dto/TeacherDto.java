package com.example.golf.dto;

import com.example.golf.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TeacherDto {
    private String id;
    private String name;
    private String className;
    private int price;
    private String date;

    public static TeacherDto fromEntity(Teacher teacher) {
        return new TeacherDto(
                teacher.getId(), teacher.getName(), teacher.getClassName(), teacher.getPrice(), teacher.getDate()
        );
    }
}
