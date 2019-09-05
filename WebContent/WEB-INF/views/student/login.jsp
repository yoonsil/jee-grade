<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 관리</title>
</head>
<body>
<div>
   <h2>로그인</h2>
   <form id ="login_form" action="<%=request.getContextPath()%>/student.do">
      	아이디 <input type="text" />  <br/>
      	비밀번호 <input type="text" />  <br/>
      <input type="hidden" name ="action" value="login" />
      <input type="hidden" name ="action" value="grade"  />
      <input type="submit"  value="전송">
   </form>
</div>
</body>
</html>
