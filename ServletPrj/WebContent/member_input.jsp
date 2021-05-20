<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<body>
	<form method="post" action="/ServletPrj/register">
		<p> 아이디 : <input type="text" name="id"/> </p>
		<p> 비밀번호 : <input type="password" name="pw"/> </p>
		<p> 이름 : <input type="text" name="name"/> </p>
		<p> 나이 : <input type="text" name="age"/> </p>
		<button type="submit">Login</button>
	</form>
</body>
</html>