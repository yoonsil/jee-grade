<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적페이지</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<form id="grade_form" action="<%=request.getContextPath()%>/grade.do">
	국어: <input type="text" name = "kor"/><br>
	영어:	 <input type="text" name = "eng"/><br>
	수학:	 <input type="text" name = "math"/><br>
	사회:	 <input type="text" name = "society"/><br>
	<input type="hidden" name ="action" value ="grade"/>
	<input type="hidden" name ="action" value ="index"/>
	<input type="submit" id = "btn" value ="확인" />
</form>
</body>
</html>