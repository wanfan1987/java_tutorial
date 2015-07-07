<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
</body>
</html>