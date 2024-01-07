package com.ll.exam.domain.member.member.vo;

import com.ll.exam.domain.member.member.mapper.MemberMapper;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MemberVo {
    private long id;
    private String username;
    private String password;

    public MemberVo(String username, String password) {
        this.id = ++MemberMapper.lastId;
        this.username = username;
        this.password = password;
    }
}
