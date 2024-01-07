package com.ll.exam.domain.member.member.controller;

import com.ll.exam.domain.member.member.service.MemberService;
import com.ll.exam.domain.member.member.vo.MemberVo;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String showLogin() {
        return "domain/member/member/login";
    }

    @PostMapping("/login")
    public String login(
            String username,
            String password,
            HttpServletResponse resp
    ) {
        if (username == null || username.trim().length() == 0)
            throw new RuntimeException("username 을 입력해주세요.");

        if (password == null || password.trim().length() == 0)
            throw new RuntimeException("password 을 입력해주세요.");

        MemberVo memberVo = memberService.findByUsername(username);

        if (memberVo == null)
            throw new RuntimeException("입력하신 username 에 해당하는 회원이 존재하지 않습니다.");

        if (!password.equals(memberVo.getPassword()))
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");

        resp.addCookie(new Cookie("loginedMemberId", memberVo.getId() + ""));

        return "redirect:/";
    }
}
