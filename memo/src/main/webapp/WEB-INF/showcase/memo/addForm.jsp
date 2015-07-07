<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>add memo</title>
</head>
<body>
	<div class="container">
		 <div class="page-header text-center lead">
		 	<p>Add Memo</p>
		 </div>
		<form role="form" class="form-horizontal" action="add" method="post">
			
			<div class="form-group">
				<label for="title" class="col-md-2 control-label">title:</label> 
				<div class="col-md-10">
					<input id="title" name="title" class="form-control" type="text" placeholder="Input title here!"/>
				</div>
			</div>
			<div class="form-group ">
				<label for="content" class="col-md-2 control-label">content:</label> 
				<div class="col-md-10">
					<textarea rows="3"  id="content"	name="content" class="form-control col-md-10" >
					</textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-12  text-center">
					<button class="btn btn-default" type="submit">submit</button>
					<button class="btn btn-default" type="reset">reset</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>