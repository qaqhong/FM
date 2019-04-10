<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="d" uri="http://displaytag.sf.net"%>
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
<title></title>
<link href="resource/css/bootstrap.min.css" rel="stylesheet" />
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript" src="resource/js/bootstrap.min.js"></script>

</head>
<body>
	<div>
		<ul class="breadcrumb" style="margin: 0px;">
			<li>系统管理</li>
		
		</ul>
	</div>
	<form action="inen/inenselect" class="form-inline" method="post">
		<div class="row alert alert-info" style="margin: 0px; padding: 5px;">
			<div class="form-group">
			<a href="view/system/Ineninfo/inenpcinfo_add.jsp" class="btn btn-danger">添加文件（PC）</a> 	
			</div>
			
			<a href="view/system/Ineninfo/inenphoneinfo_add.jsp" class="btn btn-success">添加文件（Phone）</a>
				
		</div>
		
		<!-- 进行提示，看看结果是否正确或者失败 -->
		<div role="alert" align="center" style="display:${mark eq null?'none':'block'}" class="alert alert-success alert-dismissible">
			<button type="button" class="close" data-dismiss="alert" aria-label="Close">
				<span aria-hidden="true" style="color:red;">&times;</span>
			</button>
			<marquee>
				${mark == 'true'?"~~~操作成功~~~":"" }
				${mark == 'false'?"~~~操作失败~~~":"" }
			</marquee>	
		</div>
		<div class="row" style="padding:15px;" align="right">
			<d:table name="${listpc }" pagesize="5" requestURI="inen/inenselect" class="table table-hover table-condensed table-bordered">
				<d:column property="inenPCid" title="编号"></d:column>
				<d:column property="inenPCname" title="名称"></d:column>
				<d:column property="inenPCaddress" title="地址"></d:column>
				
				
				<%-- <d:column href="" paramId="userId" paramProperty="userId" title="详情" value="详情"></d:column>
				 --%>
				<c:forEach var="me" items="${fileNameMap}">
        		<c:url value="inenpc/inenpcdelete" var="deleteurl">
            	<c:param name="filename" value="${me.key}"></c:param>
       			 </c:url>
   				 </c:forEach>
				<d:column href="${deleteurl}" paramId="inenPCid" paramProperty="inenPCid" title="删除" value="删除"></d:column>
			</d:table>
			
			<d:table name="${listphone }" pagesize="5" requestURI="inen/inenselect" class="table table-hover table-condensed table-bordered">
				<d:column property="inenPhoneid" title="编号"></d:column>
				<d:column property="inenPhonename" title="名称"></d:column>
				<d:column property="inenPhoneaddress" title="地址"></d:column>
				<c:forEach var="me1" items="${fileNameMap1}">
        		<c:url value="inenphone/inenphonedelete" var="deleteurl1">
            	<c:param name="filename1" value="${me1.key}"></c:param>
       			 </c:url>
   				 </c:forEach>
				
				<%-- <d:column href="" paramId="userId" paramProperty="userId" title="详情" value="详情"></d:column>
				 --%>
				
				<d:column href="${deleteurl1}" paramId="inenPhoneid" paramProperty="inenPhoneid" title="删除" value="删除"></d:column>
				
			</d:table>
			
			<%-- <table class="table table-hover table-condensed">
				<tr>
					<th>用户编号</th>
					<th>用户账号</th>
					
					<th>用户角色</th>
					
					<td>操作</td>
				</tr>
				
				<c:forEach items="${list }" var="user">
				<tr>
					<td>${user.userId }</td>
					<td>${user.userName }</td>
					
					<td>${user.userRole }</td>
					
					<td><a href="view/system/userinfo/userinfo_update.jsp">修改</a> 删除</td>
				</tr>
				</c:forEach>
			</table> --%>
		</div>
	</form>
</body>
</html>