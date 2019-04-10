<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>报销管理-报销单</title>
<link href="resource/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript" src="resource/js/bootstrap.min.js"></script>

</head>
<body>
	<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>系统管理</li>
			<li>我的薪资</li>
			
		</ul>
	</div>
<form action="#" id="f1" method="post" class="form-horizontal">
		<!-- 使用隐藏文本框设置默认值,设置默认值是1即保存并且提交*** -->
		<input type="hidden" name="userId" value="${userLogin.userId }"/>	
		
		
		<h5 class="page-header alert-info" style="margin: 0px; padding: 10px; margin-bottom: 10px;">
			用户的基本信息
		</h5>
		<!-- 开始1 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户姓名</label>
					<div class="col-xs-9 ">
						<p class="form-control-static">${userLogin.userName }</p>
						
					</div>
				</div>
			</div>
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户薪资</label>
					<div class="col-xs-9 ">
						<p class="form-control-static">${userLogin.userSalary }</p>
						
					</div>
				</div>
			</div>
		</div>
		<!--结束1 -->

		
	</form>
</body>
</html>