<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<body>
<h1>로그인 성공</h1>
<h2>
아이디 :   <%= request.getAttribute("id") %> <br>
비밀번호 :   <%= request.getAttribute("pw") %>
</h2>
</body>
</html>