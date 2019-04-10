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
    <title>用户管理-用户查询</title>
    <link href="resource/css/bootstrap.min.css" rel="stylesheet" />
    <script type="text/javascript" src="resource/js/jquery.min.js"></script>
    <script type="text/javascript" src="resource/js/bootstrap.min.js"></script>

</head>
<body>
<div>
    <ul class="breadcrumb" style="margin: 0px;">
        <li>系统管理</li>
        <li>用户管理</li>
        <li>用户查询</li>
    </ul>
</div>
<form action="user/select" class="form-inline" method="post">
    <div class="row alert alert-info" style="margin: 0px; padding: 5px;">
        <div class="form-group">
            <label>账号:</label>
            <input type="text" name="username" value="${user.username }" class="form-control" placeholder="请输入账号" />

        </div>
        <input type="submit" class="btn btn-danger" value="查询"> <a
            href="user/insert" class="btn btn-success">添加用户</a>
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
        <d:table name="${list }" pagesize="5" requestURI="user/select" class="table table-hover table-condensed table-bordered">
            <d:column property="userid" title="用户编号"></d:column>
            <d:column property="username" title="用户账号"></d:column>
            <d:column property="userpassword" title="用户密码"></d:column>

            <d:column property="userrole" title="用户角色"></d:column>


            <%-- <d:column href="" paramId="userId" paramProperty="userId" title="详情" value="详情"></d:column>
             --%>
            <d:column href="user/update" paramId="userid" paramProperty="userid" title="修改" value="修改"></d:column>
            <d:column href="user/delete" paramId="userid" paramProperty="userid" title="删除" value="删除"></d:column>
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