package com.ll.exam.domain.member.member.mapper;

import com.ll.exam.domain.member.member.vo.MemberVo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberMapper {
    public static long lastId;
    private List<MemberVo> items;

    static {
        lastId = 0;
    }

    public MemberMapper() {
        items = new ArrayList<>();
        items.add(new MemberVo("admin", "1234"));
        items.add(new MemberVo("user1", "1234"));
        items.add(new MemberVo("user2", "1234"));
        items.add(new MemberVo("user3", "1234"));
        items.add(new MemberVo("user4", "1234"));

    }

    public MemberVo findByUsername(String username) {
        return items
                .stream()
                .filter(memberVo -> memberVo.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public MemberVo findById(long id) {
        return items
                .stream()
                .filter(memberVo -> memberVo.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
