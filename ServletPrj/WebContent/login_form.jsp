<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α���</title>
</head>
<body>
	<form method="post" action="/ServletPrj/login">
		<p> ���̵� : <input type="text" name="id"/> </p>
		<p> ��й�ȣ : <input type="password" name="pass"/> </p>
		<p> �̸� : <input type="text" name="name"/> </p>
		<p> ��� :
		<input type="checkbox" name="hobby" value="climbing"/>���
		<input type="checkbox" name="hobby" value="swim"/>����
		<input type="checkbox" name="hobby" value="reading"/>����
		<input type="checkbox" name="hobby" value="music"/>����
		 </p>
		<p> ���� :
		<input type="radio" name="gender" value="male"/> ����
		<input type="radio" name="gender" value="female"/> ����
		 </p>
		<p>
		<select name="job" id="job">
			<option value="student">�л�</option>
			<option value="teacher">������</option>
			<option value="no">����</option>
		</select>
		 </p>
		<p>�ڱ�Ұ� :
		<input type="textarea" name="txt"/>
		 </p>
		<button type="submit">Login</button>
	</form>
</body>
</html>