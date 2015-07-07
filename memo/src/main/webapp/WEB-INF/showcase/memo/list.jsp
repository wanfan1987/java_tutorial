<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
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
	<mySiteMesh3Tag>mySiteMesh3Tag</mySiteMesh3Tag>
</body>
</html>