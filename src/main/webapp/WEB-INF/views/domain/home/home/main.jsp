<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${loginedMemberVo != null}">
    <div>
        <a href="/member/me">${loginedMemberVo.username}님의 정보</a>
        <a href="/member/logout">로그아웃</a>
    </div>
</c:if>
<c:if test="${loginedMemberVo == null}">
    <div>
        <a href="/member/login">로그인</a>
    </div>
</c:if>
