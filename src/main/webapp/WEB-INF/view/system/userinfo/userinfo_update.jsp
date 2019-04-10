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
<title>用户管理-用户修改</title>
<link href="resource/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript"
	src="resource/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>系统管理</li>
			<li>用户管理</li>
			<li>用户修改</li>
		</ul>
	</div>
<form action="user/updateSubmit" class="form-horizontal" method="post">
	<input type="hidden" name="userid" value="${user.userid }"/>
		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px;">基本信息</h5>
		<!-- 开始1 -->
		<div class="row">
			<div class="col-xs-5">
				<%--<div class="form-group ">
					<label class="col-xs-3 control-label">用户姓名</label>
					<div class="col-xs-9 ">
						<input type="text" value="${user.username }" name="username" class="form-control" placeholder="请输入用户姓名" />
					</div>
				</div>--%>
			</div>
			<div class="col-xs-5">
				
			</div>
		</div>
		<!--结束1 -->
		
		
		<!-- 开始2 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					
				</div>
			</div>
			<div class="col-xs-5">
				
			</div>
		</div>
		<!--结束2 -->

		<!-- 开始3 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户角色</label>
					<div class="col-xs-9 ">
						<select class="form-control" name="userRole">
							<!-- 注意这里是==等于号，不是赋值号 -->
						
							<option ${user.userrole=='超级管理员'?'selected':'' }>超级管理员</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-xs-5">
				
			</div>
		</div>
		<!--结束3-->
		


		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px;">账号信息</h5>
		<!-- 开始5 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户账号</label>
					<div class="col-xs-9">
						<input type="text" readonly="readonly" value="${user.username }" name="username" class="form-control" placeholder="请输入用户账号" />
					</div>
				</div>
			</div>
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户密码</label>
					<div class="col-xs-9 ">
						<input type="text" value="${user.userpassword }" name="userpassword" class="form-control" placeholder="请输入用户密码" />
					</div>
				</div>
			</div>
		</div>
		<!--结束5 -->

		<div class="row">
			<div class="col-xs-3 col-xs-offset-4">
				<input type="submit" class="btn btn-success" value="保存用户" /> 
				<a href="javascript:window.history.go(-1)" class="btn btn-warning">返回上一级</a>
			
			</div>

		</div>

	</form>
</body>
</html>