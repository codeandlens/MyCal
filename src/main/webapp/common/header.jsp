<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Mycal</title>
	<script src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>


<body>
	<nav class="navbar navbar-inverse " >
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" class="active" href="${pageContext.request.contextPath}/">Mycal</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<!-- 					<li ><a href="#">Link <span class="sr-only">(current)</span></a></li> -->
					<li><a href="${pageContext.request.contextPath}/boards">Boards</a></li>
					<li><a href="${pageContext.request.contextPath}/blog">Blog</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">knowledge<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">book</a></li>
							<li><a href="#">sport</a></li>
							<li><a href="#">inspiration</a></li>
						</ul></li>
				</ul>
				<form class="navbar-form navbar-left">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<!-- 					<button type="submit" class="btn btn-default">Submit</button> -->
				</form>
				<ul class="nav navbar-nav navbar-right">
<%-- 					<li><a href="${pageContext.request.contextPath}/users"><span class="glyphicon glyphicon-user"></span> users</a></li> --%>
					<li>
					<% if (session.getAttribute("user") == null) { %>
					    <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
					<% } else {%>
					    <li><a href="${pageContext.request.contextPath}/user-setting"> welcome : <span class="glyphicon glyphicon-user"></span> ${user}</a></li>
						<li><a href="${pageContext.request.contextPath}/logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
					<% } %>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	
	
	