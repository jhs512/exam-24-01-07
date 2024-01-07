package com.ll.exam.domain.member.member.service;

import com.ll.exam.domain.member.member.vo.MemberVo;

public interface MemberService {
    public MemberVo findByUsername(String username);
}
