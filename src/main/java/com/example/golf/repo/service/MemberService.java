package com.example.golf.repo.service;

import com.example.golf.dto.MemberDto;
import com.example.golf.dto.MembersDto;
import com.example.golf.repo.MemberRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberService {
    private final MemberRepo repo;

    public MemberService(MemberRepo repo) {
        this.repo = repo;
    }

    public List<MembersDto> findAll() {
        return repo.memberQuery().stream()
                .map(x-> new MembersDto(x))
                .toList();
    }

    public List<MemberDto> findName() {
        return  repo.memberNameQuery().stream()
                .map(x-> new MemberDto(x))
                .toList();
    }
}
