
<%@page import="org.comstudy.myweb.model.TodoVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
// service 함수 외부에 들어가는 내용
// 선언문 : 멤버필드, 멤버메서드 등
	private String name = "홍길동";
	public String sayHello() {
		return name + "님 안녕하세요!";
	}
%>

<%
// 스크립트릿: 이 부분에서 자바 소스코드 사용 가능
// JSP 파일을 Tomcat에서 실행 하면 JAVA 소스코드로 변경 되고
// 변경된 소스코드를 컴파일해서 .class 파일로 만들어 짐.
// Tomcat이 .class 파일을 브라우저에 실행 하도록 만들어 줌(HTML로 바뀜)

// src영역에 선언된 JAVA 객체 바로 사용가능.(사용할 클랙스 import 필수)
TodoVo todo = new TodoVo(100, "집안 정리하기", false);

// jsp에는 out, request, response, session, applciation 등의 내장 객체가 미리 준비되어 있다.
out.println("<h3>오신 것을 환영합니다.</h3>");
%>	
	<p><%= sayHello() %></p>
	<p>결과 : <%= todo %></p>
	<h1>Hello World!!!!!</h1>
	<li><a href="app">app 실행</a></li>
	<li><a href="todo/list">TodoList</a></li>
</body>
</html>