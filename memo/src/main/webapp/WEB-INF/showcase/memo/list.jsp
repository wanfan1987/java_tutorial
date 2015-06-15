<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>memo list</title>
</head>
<body>
	<div><a href="addForm">add memo</a></div>
	<c:forEach var="memo" items="${memos}">  
 		<span>${memo.title}</span>
 		<span>${memo.content }</span>
 		<span><a href="modifyForm?id=${memo.id}">modify</a></span>
 		<span><a href="delete?id=${memo.id}">delete</a></span>
	</c:forEach>  
</body>
</html>