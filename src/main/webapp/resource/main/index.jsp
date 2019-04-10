<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!-- saved from url=(0036)http://inc.xmu.edu.cn/17102/list.htm -->
<html lang="zh-CN">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<meta name="renderer" content="webkit">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>电子商城实训教学门户</title>

		<link rel="stylesheet" href="../files/bootstrap.min.css" >
		<link rel="stylesheet" href="../files/font-awesome.min.css" >
		<link rel="stylesheet" href="../files/index.css" >
		<link rel="stylesheet" href="../files/content.css"  type="text/css">
		<style>
			tr{
          		display: inline-block;
          		width: 430px;
          		float: left;
        	}
		</style>
	</head>

	<body>
		<header class="header">
			<div class="container">
				<div class="row">
					<div class="logo col-md-4 col-sm-5 col-xs-11">
						<a href="#">
							<img src="../files/logo.png" alt="">
						</a>
					</div>
				</div>
			</div>
		</header>
		<nav class="headerMenu">
			<div class="container">
				<div class="row">
					<div>
						<div>
							<ul>
								<li class="li1 first">
									<a href="./index.html">首页</a>
								</li>
								<!-- <li class="li1 dropdown">
									<a class="dropdown-toggle" href="#">各类服务</a>
								
									<ul class="dropdown-menu">
								
										<li class="li2">
											<a href="#">学术服务</a>
								
										</li>
								
										<li class="li2">
											<a href="#">应用系统</a>
								
										</li>
								
										<li class="li2">
											<a href="#">网络接入</a>
								
										</li>
								
										<li class="li2">
											<a href="#">基础设施</a>
								
										</li>
								
									</ul>
								
								</li> -->

								<!-- <li class="li1 dropdown">
									<a class="dropdown-toggle" href="#">帮助手册</a>
								</li> -->

								<li class="li1 dropdown">
									<a class="dropdown-toggle" href="./index.html">常用下载</a>
								</li>

								<li class="li1 dropdown">
									<a class="dropdown-toggle" href="#">后台登陆</a>
								</li>

								<li class="li1 dropdown">
									<a class="dropdown-toggle" href="./Video.html">配套视频资源</a>
								</li>

								<li class="li1 dropdown">
									<a class="dropdown-toggle" href="./Table.html">实训项目单</a>
								</li>

								<li class="li1 dropdown">
									<a class="dropdown-toggle" href="./Document.html">实训项目文档</a>
								</li>

								<li class="li1 dropdown">
									<a class="dropdown-toggle" href="./SourceCode.html">源码</a>
								</li>

								<li class="li1 dropdown">
									<a class="dropdown-toggle" href="./Knowledge.html">知识体系学习</a>
								</li>


							</ul>

						</div>
					</div>
				</div>
			</div>
		</nav>
		
		<div class="centers" style="background-color: #ededed;">

		<!--栏目图片结束-->
		<div class="main" style="width: 1200px;	">
			<div class="container">
				<div class="row">
					<!--右侧子栏目导航开始-->
					<div class="col-md-3 col-sm-4 col-xs-12" id="big">
						<div class="leftMenu">
							<div class="leftMenuTitle">
								<div frag="面板4">
									<div frag="窗口4">
										常用下载
									</div>
								</div>
							</div>
							<div frag="面板5">
								<div frag="窗口5">

									<ul class="leftMenuContent">

										 <li class="selected">
                      <a href="./index.html">PPT</a>
                    </li>

                    <li class="">
                      <a href="./InstEnvi.html">安装环境</a>
                    </li>

                    <li class="">
                      <a href="./Video.html">配套视频资源</a>
                    </li>

                    <li class="">
                      <a href="./Table.html">实训项目单</a>
                    </li>

                    <li class="">
                      <a href="./Document.html">实训项目文档(源)</a>
                    </li>

                    <li class="">
                      <a href="./SourceCode.html">源码</a>
                    </li>

                  

									</ul>

								</div>
							</div>
						</div>
					</div>
					<!--右侧子栏目导航结束-->
					<!--左侧文章列表开始-->
					<div class="col-md-9 col-sm-8 col-xs-12">
						<!--当前位置开始-->
						<div class="local">
							<div frag="面板6">
								<div frag="窗口6">
									<a href="#" target="_self"></a>
									<span class="possplit">&nbsp;&nbsp;</span>
									<a href="#" target="_self"></a>
									<span class="possplit">&nbsp;&nbsp;</span>
									<a href="#" target="_self"></a>
								</div>
							</div>
						</div>
						<!--当前位置结束-->
						<div class="nr">
							<div class="workNewsTitle">
								<div frag="面板7">
									<div frag="窗口7">
										<span><i class="fa  fa-lg"></i>PPT</span>
									</div>
								</div>
							</div>
							<!--三级导航开始-->
							<div frag="面板11">
								<div frag="窗口11">
									<!-- No Data -->
								</div>
							</div>
							<!--三级导航结束-->
							<!--文字列表开始-->
							<div class="workNewsContent">
								<div class="container-fluid">
									<div frag="面板8">
										<div frag="窗口8">

											<div class="wp_single wp_column_article" id="wp_column_article">
												<div class="wp_entry">
													<div class="wp_articlecontent">
														<div id="wp_content_w8_0" class="paging_content" style="display:">
															<p class="author" style="text-align: center;">PPT (2018年05月16日)</p>
															<p style="text-indent: 2em;">PC版</p>

															
                                							<form id="myForm" action="/ppt/pptlist" class="form-inline" method="post" onclick="check()" style="width:900px;text-indent: 2.8em; " >
								                                <table style="border-collapse:separate; border-spacing:0px 10px;">
								                                <c:forEach items="${fileNameMap }" var="me">
								                                <c:url value="pptpc/download" var="downurl">
            													<c:param name="filename" value="${me.key}"></c:param>
        														</c:url>
								                                <tr>
								                                	<td><a href="${downurl}">${me.value}</a></td>
								                                </tr>
								                                </c:forEach>
								                                
								                                <!-- <tr>
								                                    <td><a href="#">1.跟我学电商项目开发-数据库的分析与设计.pptx</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">2.跟我学电商项目开发-核心JavaBean技术讲解.pptx</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">3跟我学电商项目开发-网站前台首页的设计与实现.pptx</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">4跟我学电商项目开发-登录注册模块的实现.pptx</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">5跟我学电商项目开发-购物车模块的实现.pptx</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">6跟我学电商项目开发-收银台模块的实现.pptx</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">7跟我学电商项目开发-商品管理模块的实现.pptx</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">8跟我学电商项目开发-会员订单公告管理模块的实现.pptx</a></td>
								                                </tr>
								                                </table>
								                                <p style="text-indent: 2em;">移动版</p>
								                                <table style="border-collapse:separate; border-spacing:0px 10px;">
								                                <tr>
								                                    <td><a href="#">电子商城移动端开发（一）.ppt</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">电子商城移动端开发（二）.ppt</a></td>
								                                </tr>
								                                <tr>
								                                    <td><a href="#">电子商城移动端开发（三）.ppt</a></td>
								                                </tr> -->
								                                </table>     
							                                </form>
                                    </div>
                                    <div>       
															
															<p style="text-indent: 2em;">移动版</p>
															<p style="text-indent: 2em;">
																<a href="./Data/PPT/Phone/电子商城移动端开发（一）.swf">电子商城移动端开发（一）.swf</a>
															</p>
															<p style="text-indent: 2em;">
																<a href="./Data/PPT/Phone/电子商城移动端开发（二）.swf">电子商城移动端开发（二）.swf</a>
															</p>
															<p style="text-indent: 2em;">
																<a href="./Data/PPT/Phone/电子商城移动端开发（三）.swf">电子商城移动端开发（三）.swf</a>
															</p>

															<p style="text-indent: 2em;">知识体系学习SWF</p>
															<p style="text-indent: 2em;">
																<a href="./Data/PPT/KnowledgePPT/JSP概述.swf">JSP概述.swf</a> &nbsp;&nbsp;&nbsp;
																<a href="./Data/PPT/KnowledgePPT/JSP数据库访问技术.swf">JSP数据库访问技术.swf</a>
															</p>
															<p style="text-indent: 2em;">
																<a href="./Data/PPT/KnowledgePPT/JSP文件操作.swf">JSP文件操作.swf</a>&nbsp;&nbsp;
																<a href="./Data/PPT/KnowledgePPT/JSP与JavaBean.swf">JSP与JavaBean.swf</a>
															</p>
															<p style="text-indent: 2em;">
																<a href="./Data/PPT/KnowledgePPT/JSP与Servlet.swf">JSP与Servlet.swf</a> &nbsp;
																<a href="./Data/PPT/KnowledgePPT/JSP语法与内置对象.swf">JSP语法与内置对象.swf</a>
															</p>
															<p>&nbsp;</p>
														</div>
													</div>
												</div>
											</div>

										</div>
									</div>
								</div>
							</div>
							<!--文字列表结束-->
						</div>
					</div>
					<!--左侧文章列表结束-->
					<!--小屏子栏目导航开始-->
					<div class="col-xs-12" id="small">
						<div class="leftMenu">
							<div class="leftMenuTitle">
								<div frag="面板9">
									<div frag="窗口9">

									</div>
								</div>
							</div>
							<div frag="面板10">
								<div frag="窗口10">

								</div>
							</div>
						</div>
					</div>
					<!--小屏子栏目导航结束-->
				</div>
			</div>
		</div>
		</div>
		<!--Footer开始-->
		<div class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-sm-6 col-xs-6 footerLeft">
						<ul class="address">
							<li>
								<a href="#">电子商城实训门户</a>
							</li>
							<li>力争打造一流实训门户</li>
						</ul>
					</div>

				</div>
			</div>
		</div>
		<!--Footer结束-->

	</body>

</html>
 