package com.ll.exam.domain.home.home.controller;

import com.ll.exam.domain.member.member.service.MemberService;
import com.ll.exam.domain.member.member.vo.MemberVo;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class HomeController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public String showMain(HttpServletRequest req, Model model) {
        Cookie cookie = Arrays.stream(req
                        .getCookies())
                .filter(cookie_ -> cookie_.getName().equals("loginedMemberId"))
                .findFirst()
                .orElse(null);

        if ( cookie != null ) {
            long loginedMemberId = Long.parseLong(cookie.getValue());

            MemberVo loginedMemberVo = memberService.findById(loginedMemberId);

            model.addAttribute("loginedMemberVo", loginedMemberVo);
        }

        return "domain/home/home/main";
    }
}
