<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>서명/이메일 입력 폼</h1>
	<%
		if(session.getAttribute("email") == null) {
	%>
    <form action="result" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="Hong" ><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="hong@gmail.com"><br><br>
        <input type="submit" value="Send">
    </form>
    <%
		} else {
    %>
    	<p>이미 session에 이메일이 들어 있습니다!</p>
    	<a href="result">세션 비우기 (doGet에서 처리)</a>
    <%
		}
    %>
</body>
</html>