package com.example.golf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesDto {
    private String id;
    private String className;
    private String teacherName;
    private Long sum;

    public SalesDto(Object[] result) {
        id = (String) result[0];
        className = (String) result[1];
        teacherName = (String) result[2];
        sum = (Long) result[3];

    }
}
