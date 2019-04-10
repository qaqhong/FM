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
<title>用户管理-用户添加</title>
<link href="resource/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript" src="resource/js/bootstrap.min.js"></script>
<!-- validate验证 -->
<script type="text/javascript" src="resource/validate/jquery.validate.js"></script>
<style type="text/css">
	.error{color:red;}
</style>
<script type="text/javascript">
	$(document).ready(function(){
		$("#f1").validate({
			rules:{
				username:{
					required:true,
				},userpassword:{
					required:true,
				}
			},messages:{
				username:{
					required:'用户的姓名不能为空~~~',
				},userpassword:{
					required:'用户的密码不能为空~~~',
				}
			}
		});
		
		$("#username").blur(function(){
			//首先获取账号的信息
			var account = $(this).val();
			//然后判断账号的信息长度是否大于0，进行非空验证
			if(account.length > 0){
				//使用ajax的post进行异步请求验证
				//第一个参数:url;第二个参数:获取的账号值;第三个参数返回的结果
				$.post("user/ajax",{username:$(this).val()},
						function(data){
					//将账号注册或者未注册的信息显示在账号的旁边
					$("#userNameError").html(data);
				});
			}
		});
	});
</script>

</head>
<body>
	<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>系统管理</li>
			<li>用户管理</li>
			<li>用户添加</li>
		</ul>
	</div>
<form action="user/insertSubmit" id="f1" method="post" class="form-horizontal">
		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px;">基本信息</h5>
		<!-- 开始1 -->
		<div class="row">
			<div class="col-xs-5">
				
			</div>
			
		</div>
		<!--结束1 -->
		
		
		<!-- 开始2 -->
		<div class="row">
			<div class="col-xs-5">
				
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
						<select class="form-control" name="userrole">
							
							<option>超级管理员</option>
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
						<input type="text" name="username" id="username" class="form-control" placeholder="请输入用户账号" />
					</div>
				</div>
			</div>
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label"></label>
					<div class="col-xs-9 ">
						<span style="color:red;font-size:24px;" id="userNameError"></span>
					</div>
				</div>
			</div>
		</div>
		<!--结束5 -->

		<!-- 开始6 -->
		<div class="row">
			<div class="col-xs-5">
				<div class="form-group ">
					<label class="col-xs-3 control-label">用户密码</label>
					<div class="col-xs-9 ">
						<input type="text" name="userpassword" class="form-control" placeholder="请输入用户密码" />
					</div>
				</div>
			</div>
		</div>
		<!--结束6 -->

		<div class="row">
			<div class="col-xs-3 col-xs-offset-4">
				<input type="submit" class="btn btn-success" value="保存用户" /> 
				<input type="reset" class="btn btn-danger" value="重置信息" />
				<a href="javascript:window.history.go(-1)" class="btn btn-warning">返回上一级</a>
			
			</div>
		</div>
	</form>
</body>
</html>