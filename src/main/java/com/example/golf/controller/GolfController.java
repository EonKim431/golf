package com.example.golf.controller;

import com.example.golf.dto.*;
import com.example.golf.repo.service.GolfClassService;
import com.example.golf.repo.service.MemberService;
import com.example.golf.repo.service.TeacherService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller @Slf4j
public class GolfController {
    private final TeacherService teacherService;
    private final MemberService memberService;
    private final GolfClassService golfClassService;


    public GolfController(TeacherService teacherService, MemberService memberService, GolfClassService golfClassService) {
        this.teacherService = teacherService;
        this.memberService = memberService;
        this.golfClassService = golfClassService;
    }

    @GetMapping("/")
    public String main(){
        return "golf/main";
    }
    @GetMapping("/teacher")
    public String teacher(Model model){
        List<TeacherDto> dtos = teacherService.findAll();
        model.addAttribute("list",dtos);
        log.info(dtos.toString());
        return "golf/teacher";
    }
    @GetMapping("/submit")
    public String submit(Model model){
        List<MemberDto> dto1 = memberService.findName();
        model.addAttribute("member",dto1);
        List<TeachDto> dto2 = teacherService.findClass();
        model.addAttribute("teacher",dto2);
        GolfClassDto dto = new GolfClassDto();
        model.addAttribute("dto",dto);
        return "golf/submit";
    }
    @GetMapping("/member")
    public String member(Model model){
        List<MembersDto> dtos = memberService.findAll();
        model.addAttribute("list",dtos);
        log.info(dtos.toString());
        return "golf/member";
    }
    @GetMapping("/sales")
    public String sales(Model model){
        List<SalesDto> dtos = golfClassService.fildAll();
        model.addAttribute("list",dtos);
        log.info(dtos.toString());
        return "golf/sales";
    }
    @PostMapping("/submit")
    public String submit(@Valid @ModelAttribute("dto") GolfClassDto dto,
                         BindingResult result,
                         Model model) {
        log.info(dto.toString());
        if (result.hasErrors()) {
            List<MemberDto> members = memberService.findName();
            List<TeachDto> teachers = teacherService.findClass();
            model.addAttribute("member", members);
            model.addAttribute("teacher", teachers);
            return "golf/submit";
        }
        golfClassService.save(dto);
        return "redirect:/";
    }

}
