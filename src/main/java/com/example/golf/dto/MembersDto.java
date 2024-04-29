package com.example.golf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembersDto {
    private String date;
    private String id;
    private String name;
    private String className;
    private String classArea;
    private Integer tuition;
    private String grade;

    public MembersDto(Object[] result) {
        MembersDto memberDto = new MembersDto();
        date = (String) result[0];
        id = (String) result[1];
        name = (String) result[2];
        className = (String) result[3];
        classArea = (String) result[4];
        tuition = (Integer) result[5];
        grade =(String) result[6];
    }
}
