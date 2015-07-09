<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head lang="en">
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<!-- 设置页面大小为设备的宽度 -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="${ctx}/resources/bootstrap/css/bootstrap.min.css">
	<!-- Optional theme -->
	<link rel="stylesheet" href="${ctx}/resources/bootstrap/css/bootstrap-theme.min.css">
<title>showcase</title>
</head>
<body >
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">Wanfan</a>
		</div>
		<div>
		    <ul class="nav navbar-nav">
		    	<li class="active"><a href="${ctx}/memo/list">memo</a></li>
		    	<li><a href="#">user management</a></li>
		      	<li><a href="#">blog</a></li>
		      	<li><a href="#">book store</a></li>
		    </ul>
		</div>
	</div>
</nav>

<div class="container">
	<div class="jumbotron">
      <h1>欢迎我的Showcase的首页！</h1>
      <p>这是展示一些Java web技术</p>
    </div>
	<div id="content"></div>
	
	<script src="${ctx}/resources/react/build/react.js"></script>
    <script src="${ctx}/resources/react/build/JSXTransformer.js"></script>
	<script src="${ctx}/resources/jquery/jquery-1.11.3.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script> 
	<!-- 
    <script type="text/jsx">
		var MemoEntry = React.createClass({
  			render: function() {
    			return (
<ul className="nav nav-pills">
  <li role="presentation" className="active"><a href="${ctx}/memo/list">memo</a></li>
  <li role="presentation"><a href="#">blank</a></li>
</ul>
					
    			);
  			}
		});
		/** @jsx React.DOM */
		React.render(
  			<MemoEntry />,
  			document.getElementById('content')
		);
    </script>
     -->   
</div>    
</body>

</html>