<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<!-- 将每个页面公共的部分抽到模板里面来 -->
<!-- sitemesh3默认只提供了title head body三种标签，需要其他标签需要通过实现TagRuleBundle进行扩展  -->
<title><sitemesh:write property='title' /></title>
<sitemesh:write property='head' />
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="${ctx}/resources/bootstrap/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet"
	href="${ctx}/resources/bootstrap/css/bootstrap-theme.min.css">
</head>
<body>
	<sitemesh:write property='body' />
	<sitemesh:write property='mySiteMesh3Tag' />
	<script src="${ctx}/resources/react/build/react.js"></script>
	<script src="${ctx}/resources/react/build/JSXTransformer.js"></script>
	<script src="${ctx}/resources/jquery/jquery-1.11.3.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>	
</body>
</html>