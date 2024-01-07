<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div>
        <div>번호</div>
        <div>${loginedMemberVo.id}</div>
    </div>

    <div>
        <div>사용자명</div>
        <div>${loginedMemberVo.username}</div>
    </div>
</div>