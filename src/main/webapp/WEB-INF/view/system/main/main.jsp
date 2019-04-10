<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="d" uri="http://displaytag.sf.net"%>    
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
<meta charset="utf-8">
<title>工作台</title>

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="resource/css/bootstrap.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="resource/js/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="resource/js/bootstrap.min.js"></script>

<script src="resource/js/highcharts.js"></script>
<script src="resource/js/jquery.highchartTable.js"></script>


<script type="text/javascript">
	$(document).ready(function(){
		//我的报销单
		$("#data").load("<%=basePath %>/reim/myworkbench");
		//图形报表
		$('table.highchart').highchartTable();
	});

</script>
</head>
<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style=" padding:0px; padding-left:20px;" >
  <li>首页</li>
  <li>工作台</li>
</ul>
</div>
<div class="row">
	<!-- 开始1 -->
	<div class="col-xs-6" >
    	 <div class="panel panel-default" >
          <div class="panel-heading"  >
            <span class="glyphicon glyphicon-refresh"></span>报销费用统计
          </div>
          <div class="panel-body">
          	<!-- <img src="resource/img/test.png" height="200" width="100%"> -->
          	<table class="highchart" data-graph-container-before="1" data-graph-type="line" style="display:none">
				<caption>个人报销费用图形报表</caption>
				  <thead>
				      <tr>
				          <th>费用名称</th>
				          <th>费用金额</th>
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach items="${ccList }" var="work">
				      <tr>
				          <td>${work.costName }</td>
				          <td>${work.total }</td>
							
				      </tr>
				  </c:forEach>   
				  </tbody>
				</table>	
          </div>
        </div>
    </div>
    <!-- 结束1 -->

    <!-- 开始2 -->
    <div class="col-xs-6" >
 	 <div class="panel panel-default" >
          <div class="panel-heading"  >
            <span class="glyphicon glyphicon-refresh"></span>报销费用统计
          </div>
          <div class="panel-body">
          	<!-- <img src="resource/img/test.png" height="200" width="100%"> -->
          	<table class="highchart" data-graph-container-before="1" data-graph-type="column" style="display:none">
				<caption>个人报销费用图形报表</caption>
				  <thead>
				      <tr>
				          <th>费用名称</th>
				          <th>费用金额</th>
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach items="${ccList }" var="work">
				      <tr>
				          <td>${work.costName }</td>
				          <td>${work.total }</td>
							
				      </tr>
				  </c:forEach>   
				  </tbody>
				</table>	
          
          </div>
        </div>
    </div>
 	<!-- 结束2 -->

	<!-- 开始3 -->
 	<c:if test="${userLogin.userRole=='经理' }">
    <div class="col-xs-6" >
 	 <div class="panel panel-default" >
          <div class="panel-heading"  >
            <span class="glyphicon glyphicon-refresh"></span>经理审批
          </div>
          <div class="panel-body">
          	<d:table name="${list }" class="table table-hover table-condensed table-bordered">
				<%-- <d:column property="reimId" title="报销编号"></d:column> --%>
				<d:column property="userName" title="报销人"></d:column>
				<%-- <d:column property="reimName" title="报销原因"></d:column> --%>
				<d:column property="reimMoney" title="报销金额"></d:column>
				<%-- <d:column property="reimTime" title="报销时间"></d:column> --%>
				<d:column property="reimState" title="报销状态"></d:column>
				
				<d:column href="reim/reimManage/reimreview" paramId="reimId" paramProperty="reimId" title="经理审批" value="经理审批"></d:column>
				
			</d:table>
          	
          	
          </div>
        </div>
    </div>
    </c:if>
 	<!-- 结束3 -->
	
	
	<!-- 开始4 -->
	<c:if test="${userLogin.userRole=='财务人员' }">
	<div class="col-xs-6" >
 	 <div class="panel panel-default" >
          <div class="panel-heading"  >
            <span class="glyphicon glyphicon-refresh"></span>财务审批
          </div>
          <div class="panel-body">
          	<d:table name="${financeList }" class="table table-hover table-condensed table-bordered">
				<%-- <d:column property="reimId" title="报销编号"></d:column> --%>
				<d:column property="userName" title="报销人"></d:column>
				<%-- <d:column property="reimName" title="报销原因"></d:column> --%>
				<d:column property="reimMoney" title="报销金额"></d:column>
				<%-- <d:column property="reimTime" title="报销时间"></d:column> --%>
				<d:column property="reimState" title="报销状态"></d:column>
				
				<d:column href="reim/reimfinance/reimreview" paramId="reimId" paramProperty="reimId" title="财务审批" value="财务审批"></d:column>
				
			</d:table>
          	
          </div>
        </div>
    </div>
    </c:if>
   
 	<!-- 结束4 -->
 	
 	
 	<!-- 开始5 -->
 	<c:if test="${userLogin.userRole=='超级管理员' }">
    <div class="col-xs-6" >
 	 <div class="panel panel-default" >
          <div class="panel-heading"  >
            <span class="glyphicon glyphicon-refresh"></span>超级管理员查看:&nbsp;&nbsp;经理审批
          </div>
          <div class="panel-body">
          	<d:table name="${list }" class="table table-hover table-condensed table-bordered">
				<%-- <d:column property="reimId" title="报销编号"></d:column> --%>
				<d:column property="userName" title="报销人"></d:column>
				<%-- <d:column property="reimName" title="报销原因"></d:column> --%>
				<d:column property="reimMoney" title="报销金额"></d:column>
				<%-- <d:column property="reimTime" title="报销时间"></d:column> --%>
				<d:column property="reimState" title="报销状态"></d:column>
				
				<d:column href="reim/reimManage/reimreview" paramId="reimId" paramProperty="reimId" title="经理审批" value="经理审批"></d:column>
				
			</d:table>
          	
          	
          </div>
        </div>
    </div>
    </c:if>
 	<!-- 结束5 -->
	
	
	<!-- 开始6 -->
	<c:if test="${userLogin.userRole=='超级管理员' }">
	<div class="col-xs-6" >
 	 <div class="panel panel-default" >
          <div class="panel-heading"  >
            <span class="glyphicon glyphicon-refresh"></span>超级管理员查看:&nbsp;&nbsp;财务审批
          </div>
          <div class="panel-body">
          	<d:table name="${financeList }" class="table table-hover table-condensed table-bordered">
				<%-- <d:column property="reimId" title="报销编号"></d:column> --%>
				<d:column property="userName" title="报销人"></d:column>
				<%-- <d:column property="reimName" title="报销原因"></d:column> --%>
				<d:column property="reimMoney" title="报销金额"></d:column>
				<%-- <d:column property="reimTime" title="报销时间"></d:column> --%>
				<d:column property="reimState" title="报销状态"></d:column>
				
				<d:column href="reim/reimfinance/reimreview" paramId="reimId" paramProperty="reimId" title="财务审批" value="财务审批"></d:column>
				
			</d:table>
          	
          </div>
        </div>
    </div>
    </c:if>
   
 	<!-- 结束6 -->
 	
 	
 	<!-- 开始7 -->
	<div class="col-xs-6" >
 	 <div class="panel panel-default" >
          <div class="panel-heading"  >
            <span class="glyphicon glyphicon-refresh"></span>超级管理员查看:&nbsp;&nbsp;我的报销
          </div>
          <div class="panel-body">
          	<div id="data"></div>
          	
          </div>
        </div>
    </div>
 
   
 	<!-- 结束7 -->
</div>


</body>
</html>
