package com.example.golf.dto;

import com.example.golf.entity.GolfClass;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class GolfClassDto {
    private Long id;
    @Size(min = 1 , message = "수강월을 입력해주세요")
    private String registMonth;
    @Size(min = 1,message = "회원명 골라주세요")
    private String classNo;
    @Size(min = 1,message = "장소를 입력해주세요")
    private String classArea;
    private String teacherCode;
    @NotNull(message = "강의를 골라주세요")
    private Integer tuition;

    public GolfClass fromEntity(GolfClassDto dto) {
        return new GolfClass(id,registMonth,classNo,classArea,teacherCode,tuition);
    }
}
