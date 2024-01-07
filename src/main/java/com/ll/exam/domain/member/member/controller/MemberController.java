package com.ll.exam.domain.member.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/login")
    public String showLogin() {
        return "domain/member/member/login";
    }

    @PostMapping("/login")
    public String login(
            String username,
            String password
    ) {
        return "redirect:/";
    }
}
