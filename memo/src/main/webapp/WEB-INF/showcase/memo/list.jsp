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
<title>memo list</title>
</head>
<body>
	<div class="container">
		<div class="page-header text-center lead text-capitalize">memo management</div>
		
		<div class="text-primary">
			<a href="add">add memo</a>
		</div>
		
		<!-- 768px下出现滚动条 -->
		<div class="table-responsive">
			<table class="table table-bordered table-striped table-hover table-condensed">
				<thead>
					<tr>
						<th>title</th>
						<th>content</th>
						<th class="col-md-6">operations</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="memo" items="${memos}">
					<tr>
						<td>${memo.title}</td>
						<td>${memo.content}</td>
						<td>
							<span><a href="modify?id=${memo.id}">modify</a></span> 
							<span><a href="delete?id=${memo.id}">delete</a></span> 
							<span><a href="view?id=${memo.id}">view</a></span>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<script src="${ctx}/resources/react/build/react.js"></script>
	<script src="${ctx}/resources/react/build/JSXTransformer.js"></script>
	<script src="${ctx}/resources/jquery/jquery-1.11.3.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>