<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//获取绝对路径路径 
	String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
				+ request.getServerName() + ":" + request.getServerPort()
				+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath %>" />
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>实训项目单管理</title>
<link href="resource/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript" src="resource/js/bootstrap.min.js"></script>
<!-- validate验证 -->
<script type="text/javascript" src="resource/validate/jquery.validate.js"></script>
<style type="text/css">
	.error{color:red;}
</style>


</head>
<body>
	<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>实训项目单（PCkn）管理</li>
			
		</ul>
	</div>
<form action="${pageContext.request.contextPath }/video/videopckninsert" id="f1" enctype="multipart/form-data" method="post" class="form-horizontal">
		

		
		


		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px;">上传文件</h5>
		<!-- 开始5 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">上传文件</label>
					<div class="col-xs-9">
						<input type="file" name="file1"  class="form-control" />
					</div>
				</div>
			</div>
			
		</div>
		
		<!-- <h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px;">上传文件</h5>
		开始5
		<div class="row">
			<div class="col-xs-6">
				<div class="form-group ">
					<label class="col-xs-3 control-label">上传文件</label>
					<div class="col-xs-9">
						<input type="file" name="file2"  class="form-control" />
					</div>
				</div>
			</div>
			
		</div> -->
		<!--结束5 -->

		<!-- 开始6 -->
		<div class="row">
			
		</div>
		<!--结束6 -->

		<div class="row">
			<div class="col-xs-3 col-xs-offset-4">
				<input type="submit" class="btn btn-success" value="保存" /> 
				
				
			
			</div>
		</div>
	</form>
</body>
</html>