<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	/* From Uiverse.io by Yaya12085 */ 
.card {
  background-color: #fff;
  border-radius: 10px;
  padding: 20px;
  width: 350px;
  display: flex;
  flex-direction: column;
}

.title {
  font-size: 24px;
  font-weight: 600;
  text-align: center;
}

.form {
  margin-top: 20px;
  display: flex;
  flex-direction: column;
}

.group {
  position: relative;
}

.form .group label {
  font-size: 14px;
  color: rgb(99, 102, 102);
  position: absolute;
  top: -10px;
  left: 10px;
  background-color: #fff;
  transition: all .3s ease;
}

.form .group input,
.form .group textarea {
  padding: 10px;
  border-radius: 5px;
  border: 1px solid rgba(0, 0, 0, 0.2);
  margin-bottom: 20px;
  outline: 0;
  width: 100%;
  background-color: transparent;
}

.form .group input:placeholder-shown+ label, .form .group textarea:placeholder-shown +label {
  top: 10px;
  background-color: transparent;
}

.form .group input:focus,
.form .group textarea:focus {
  border-color: #3366cc;
}

.form .group input:focus+ label, .form .group textarea:focus +label {
  top: -10px;
  left: 10px;
  background-color: #fff;
  color: #3366cc;
  font-weight: 600;
  font-size: 14px;
}

.form .group textarea {
  resize: none;
  height: 100px;
}

.form button {
  background-color: #3366cc;
  color: #fff;
  border: none;
  border-radius: 5px;
  padding: 10px;
  font-size: 16px;
  cursor: pointer;
  transition: all 0.3s ease;
}

.form button:hover {
  background-color: #27408b;
}

	
</style>
</head>
<body>
	<h1>새 할일 입력</h1>
	<a href="list">할 일 목록</a>
	<div class="card">
	  <span class="title">할일 추가</span>
	  <form class="form" method="post" action="input">
		<div class="group">
		    <input type="text" id="title" name="title" value="" />
		    <label for="title">TITLE</label>
	    </div>
	    <div class="group">
		    <input type="text" id="description" name="description" value="" />
		    <label for="description">설명</label>
	    </div>
	    <button type="submit">추가하기</button>
	  </form>
	</div>
</body>
</html>