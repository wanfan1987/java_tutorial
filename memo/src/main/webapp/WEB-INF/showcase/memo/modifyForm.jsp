<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>modify memo</title>
</head>
<body>
	<form action="modify" method="post">
		<input type="hidden" name="id" value="${memo.id}"/>
		<div>
			<label for="title">title:</label>
			<input id="title" name="title" type="text" value="${memo.title}"/>
		</div>
		<div>
			<label for="content">content:</label>
			<input id="content" name="content" type="text" value="${memo.content}"/>
		</div>
		<div>
			<button type="submit">submit</button>
			<button type="reset">reset</button>
		</div>
	</form>
</body>
</html>