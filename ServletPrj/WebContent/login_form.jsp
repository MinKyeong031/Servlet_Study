<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
</head>
<body>
	<form method="post" action="/ServletPrj/login">
		<p> 아이디 : <input type="text" name="id"/> </p>
		<p> 비밀번호 : <input type="password" name="pass"/> </p>
		<p> 이름 : <input type="text" name="name"/> </p>
		<p> 취미 :
		<input type="checkbox" name="hobby" value="climbing"/>등산
		<input type="checkbox" name="hobby" value="swim"/>수영
		<input type="checkbox" name="hobby" value="reading"/>독서
		<input type="checkbox" name="hobby" value="music"/>음악
		 </p>
		<p> 성별 :
		<input type="radio" name="gender" value="male"/> 남성
		<input type="radio" name="gender" value="female"/> 여성
		 </p>
		<p>
		<select name="job" id="job">
			<option value="student">학생</option>
			<option value="teacher">선생님</option>
			<option value="no">무직</option>
		</select>
		 </p>
		<p>자기소개 :
		<input type="textarea" name="txt"/>
		 </p>
		<button type="submit">Login</button>
	</form>
</body>
</html>