<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
</head>
<body>
	<form method="post" action="/ServletPrj/LoginMVC">
		<p> 아이디 : <input type="text" name="id"/> </p>
		<p> 비밀번호 : <input type="password" name="pw"/> </p>
		<button type="submit">로그인</button>
	</form>
</body>
</html>