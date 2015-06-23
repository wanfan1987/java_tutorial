<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>view memo</title>
</head>
<body>
	<div>
		<input type="hidden" name="id" value="${memo.id}"/>
		<div>
			<label for="title">title:</label>
			<input id="title" name="title" type="text" value="${memo.title}" disabled="disabled"/>
		</div>
		<div>
			<label for="content">content:</label>
			<input id="content" name="content" type="text" value="${memo.content}" disabled="disabled"/>
		</div>
		<div>
			<label for="createDate">create date:</label>
			<input id="createDate" name="createDate" type="text" value="${memo.createDate}" disabled="disabled"/>
		</div>
		<div>
			<label for="createPerson">create person:</label>
			<input id="createPerson" name="createPerson" type="text" value="${memo.createPerson}" disabled="disabled"/>
		</div>
		<div>
			<label for="modifyDate">modify date:</label>
			<input id="modifyDate" name="modifyDate" type="text" value="${memo.modifyDate}" disabled="disabled"/>
		</div>
		<div>
			<label for="modifyPerson">modify person:</label>
			<input id="modifyPerson" name="modifyPerson" type="text" value="${memo.modifyPerson}" disabled="disabled"/>
		</div>
		<a href="list">back to list</a>				
	</div>
</body>
</html>