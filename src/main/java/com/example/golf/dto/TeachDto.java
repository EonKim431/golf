package com.example.golf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TeachDto {
    private String className;
    private Integer price;
    private String teacher;

    public TeachDto(Object[] result) {
        className = (String) result[0];
        price = (Integer) result[1];
        teacher = (String) result[2];
    }
}
