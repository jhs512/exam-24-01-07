package com.ll.exam.domain.member.member.service;

import com.ll.exam.domain.member.member.mapper.MemberMapper;
import com.ll.exam.domain.member.member.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public MemberVo findByUsername(String username) {
        return memberMapper.findByUsername(username);
    }

    @Override
    public MemberVo findById(long id) {
        return memberMapper.findById(id);
    }
}
