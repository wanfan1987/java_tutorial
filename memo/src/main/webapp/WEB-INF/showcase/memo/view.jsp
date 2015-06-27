<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="${ctx}/resources/bootstrap/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet"
	href="${ctx}/resources/bootstrap/css/bootstrap-theme.min.css">
<title>view memo</title>
</head>
<body>
	<div class="container text-center">
		<div class="page-header text-center lead">
		 	<p>View Memo</p>
		</div>
		<dl class="dl-horizontal">
			<dt>id</dt>
			<dd>${memo.id}</dd>
			<dt>title</dt>
			<dd>${memo.title}</dd>
			<dt>content</dt>
			<dd>${memo.content}</dd>	
			<dt>create date</dt>
			<dd>${memo.createDate}</dd>
			<dt>create person</dt>
			<dd>${memo.createPerson}</dd>	
			<dt>modify date</dt>
			<dd>${memo.modifyDate}</dd>
			<dt>modify person</dt>
			<dd>${memo.modifyPerson}</dd>													
		</dl>

		<a href="list" class="btn btn-default">back to list</a>				
	</div>
	<script src="${ctx}/resources/react/build/react.js"></script>
	<script src="${ctx}/resources/react/build/JSXTransformer.js"></script>
	<script src="${ctx}/resources/jquery/jquery-1.11.3.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>