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
	<form action="video/videoselect" class="form-inline" method="post">
		<div class="row alert alert-info" style="margin: 0px; padding: 5px;">
			<div class="form-group">
			<a href="view/system/videoinfo/videopcfminfo_add.jsp" class="btn btn-danger">添加文件（PCfm）</a> 	
			</div>
			
			<a href="view/system/videoinfo/videopckninfo_add.jsp" class="btn btn-success">添加文件（PCkn）</a>
			
			
			<a href="view/system/videoinfo/videophoneinfo_add.jsp" class="btn btn-success">添加文件（Phone）</a>
				
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
			<d:table name="${listpcfm }" pagesize="5" requestURI="video/videoselect" class="table table-hover table-condensed table-bordered">
				<d:column property="videoPCfmid" title="编号"></d:column>
				<d:column property="videoPCfmname" title="名称"></d:column>
				<d:column property="videoPCfmaddress" title="地址"></d:column>
				
				
				<%-- <d:column href="" paramId="userId" paramProperty="userId" title="详情" value="详情"></d:column>
				 --%>
				<c:forEach var="me" items="${fileNameMap}">
        		<c:url value="videopcfm/videopcfmdelete" var="deleteurl">
            	<c:param name="filename" value="${me.key}"></c:param>
       			 </c:url>
   				 </c:forEach>
				<d:column href="${deleteurl}" paramId="videoPCfmid" paramProperty="videoPCfmid" title="删除" value="删除"></d:column>
			</d:table>
			
			<d:table name="${listpckn }" pagesize="5" requestURI="video/videoselect" class="table table-hover table-condensed table-bordered">
				<d:column property="videoPCknid" title="编号"></d:column>
				<d:column property="videoPCknname" title="名称"></d:column>
				<d:column property="videoPCknaddress" title="地址"></d:column>
				<c:forEach var="me1" items="${fileNameMap1}">
        		<c:url value="videopckn/videopckndelete" var="deleteurl1">
            	<c:param name="filename1" value="${me1.key}"></c:param>
       			 </c:url>
   				 </c:forEach>
				
				<%-- <d:column href="" paramId="userId" paramProperty="userId" title="详情" value="详情"></d:column>
				 --%>
				
				<d:column href="${deleteurl1}" paramId="videoPCknid" paramProperty="videoPCknid" title="删除" value="删除"></d:column>
				
			</d:table>
			
			<d:table name="${listphone }" pagesize="5" requestURI="video/videoselect" class="table table-hover table-condensed table-bordered">
				<d:column property="videoPhoneid" title="编号"></d:column>
				<d:column property="videoPhonename" title="名称"></d:column>
				<d:column property="videoPhoneaddress" title="地址"></d:column>
				<c:forEach var="me2" items="${fileNameMap2}">
        		<c:url value="videophone/videophonedelete" var="deleteurl1">
            	<c:param name="filename2" value="${me2.key}"></c:param>
       			 </c:url>
   				 </c:forEach>
				
				<%-- <d:column href="" paramId="userId" paramProperty="userId" title="详情" value="详情"></d:column>
				 --%>
				
				<d:column href="${deleteurl1}" paramId="videoPhoneid" paramProperty="videoPhoneid" title="删除" value="删除"></d:column>
				
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