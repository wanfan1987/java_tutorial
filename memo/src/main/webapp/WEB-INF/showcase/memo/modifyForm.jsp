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
<title>modify memo</title>
</head>
<body>
	<div class="container">
		<div class="page-header text-center lead">
		 	<p>Modify Memo</p>
		 </div>
		<form role="form" class="form-horizontal" action="modify" method="post">
			<input type="hidden" name="id" value="${memo.id}"/>
			<div class="form-group">
				<label for="title"  class="col-md-2 control-label">title:</label>
				<div class="col-md-10">
					<input id="title" name="title" class="form-control"  type="text" value="${memo.title}"/>
				</div>
			</div>
			<div class="form-group">
				<label for="content" class="col-md-2 control-label">content:</label>
				<div class="col-md-10">
					<textarea id="content" name="content" class="form-control">
					${memo.content}
					</textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-12  text-center">
					<button  class="btn btn-default" type="submit">submit</button>
					<button  class="btn btn-default" type="reset">reset</button>
				</div>
			</div>
		</form>
	</div>
	<script src="${ctx}/resources/react/build/react.js"></script>
	<script src="${ctx}/resources/react/build/JSXTransformer.js"></script>
	<script src="${ctx}/resources/jquery/jquery-1.11.3.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>	
</body>
</html>