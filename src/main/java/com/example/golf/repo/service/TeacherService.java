package com.example.golf.repo.service;

import com.example.golf.dto.TeachDto;
import com.example.golf.dto.TeacherDto;
import com.example.golf.repo.TeacherRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Slf4j
public class TeacherService {
    private final TeacherRepo repo;

    public TeacherService(TeacherRepo repo) {
        this.repo = repo;
    }

    public List<TeacherDto> findAll() {
        List<TeacherDto> dtos = repo.findAll().stream()
                .map(x->TeacherDto.fromEntity(x))
                .toList();
        log.info(dtos.toString());
        return dtos;
    }

    public List<TeachDto> findClass() {
        return repo.teachQuery().stream()
                .map(x -> new TeachDto(x))
                .toList();
    }
}
