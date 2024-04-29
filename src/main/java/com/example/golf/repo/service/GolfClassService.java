package com.example.golf.repo.service;

import com.example.golf.dto.GolfClassDto;
import com.example.golf.dto.SalesDto;
import com.example.golf.repo.GolfClassRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GolfClassService {
    private final GolfClassRepo golfClassRepo;

    public GolfClassService(GolfClassRepo golfClassRepo) {
        this.golfClassRepo = golfClassRepo;
    }

    public List<SalesDto> fildAll() {
        return golfClassRepo.sales()
                .stream()
                .map(x-> new SalesDto(x))
                .toList();
    }

    public void save(GolfClassDto dto) {
        golfClassRepo.save(dto.fromEntity(dto));
    }
}
