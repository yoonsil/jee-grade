<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생정보</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<form id="student_form" 
	action="<%=request.getContextPath()%>/student.do">
		이름: <input type="text" name = "name"/><br>
		주민번호: <input type="text" name ="ssn" /><br>
		<input type="hidden" name="action" value="register"/>
		<input type="hidden" name="action" value="login"/>
		<input type="submit" id="btn" value ="확인" />
	</form>
</body>
</html>