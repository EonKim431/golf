package com.example.golf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class MemberDto {
    private String id;
    private String name;
    private String grade;

    public MemberDto(Object[] result) {
        id = (String) result[0];
        name = (String) result[1];
        grade = (String) result[2];
    }
}
