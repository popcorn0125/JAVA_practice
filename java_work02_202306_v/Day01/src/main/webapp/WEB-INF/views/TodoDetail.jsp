<%@page import="org.comstudy.myweb.model.TodoVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
    margin-top:20px;
    color: #1a202c;
    text-align: left;
    background-color: #e2e8f0;    
}
.main-body {
    padding: 15px;
}
.card {
    box-shadow: 0 1px 3px 0 rgba(0,0,0,.1), 0 1px 2px 0 rgba(0,0,0,.06);
}

.card {
    position: relative;
    display: flex;
    flex-direction: column;
    min-width: 0;
    word-wrap: break-word;
    background-color: #fff;
    background-clip: border-box;
    border: 0 solid rgba(0,0,0,.125);
    border-radius: .25rem;
}

.card-body {
    flex: 1 1 auto;
    min-height: 1px;
    padding: 1rem;
}

.gutters-sm {
    margin-right: -8px;
    margin-left: -8px;
}

.gutters-sm>.col, .gutters-sm>[class*=col-] {
    padding-right: 8px;
    padding-left: 8px;
}
.mb-3, .my-3 {
    margin-bottom: 1rem!important;
}

.bg-gray-300 {
    background-color: #e2e8f0;
}
.h-100 {
    height: 100%!important;
}
.shadow-none {
    box-shadow: none!important;
}

</style>
</head>
<body>
	<h1>할일 상세보기</h1>
	<a href="list" id="goList">할 일 목록</a>
	<div class="container">
		<div class="col-md-8">
	        <div class="card mb-3">
	        <%
	        	TodoVo todoList = (TodoVo)request.getAttribute("todoList");
             %>
	          <div class="card-body">
	            <div class="row">
	              <div class="col-sm-3">
	                <h6 class="mb-0">NO.</h6>
	              </div>
	              <div class="col-sm-9 text-secondary">
	                <%= todoList.getNo() %>
	              </div>
	            </div>
	            <hr>
	            <div class="row">
	              <div class="col-sm-3">
	                <h6 class="mb-0">TITLE</h6>
	              </div>
	              <div class="col-sm-9 text-secondary">
	                <%= todoList.getTitle() %>
	              </div>
	            </div>
	            <hr>
	            <div class="row">
	              <div class="col-sm-3">
	                <h6 class="mb-0">설명</h6>
	              </div>
	              <div class="col-sm-9 text-secondary">
	                <%= todoList.getDescription() %>
	              </div>
	            </div>
	            <hr>
	            <div class="row">
	              <div class="col-sm-3">
	                <h6 class="mb-0">상태</h6>
	              </div>
	              <div class="col-sm-9 text-secondary">
	                <%= todoList.isDone() %>
	              </div>
	            </div>
	            <hr>
        	</div>
    	</div>
	</div>
</body>
</html>