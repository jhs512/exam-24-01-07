<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form method="POST">
    <div>
        <div>아이디</div>
        <div>
            <input type="text" name="username" placeholder="아이디" required />
        </div>
    </div>

    <div>
        <div>비밀번호</div>
        <div>
            <input type="password" name="password" placeholder="비밀번호"  required />
        </div>
    </div>

    <div>
        <div>로그인</div>
        <div>
            <input type="submit" value="로그인">
        </div>
    </div>
</form>
