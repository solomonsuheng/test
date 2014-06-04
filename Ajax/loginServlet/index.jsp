<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Ajax测试</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<!-- 加入jquery -->
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#send").click(function() {
			//从页面获取数据
			var name = $("#uname").val();
			var pwd = $("#upwd").val();
			//使用ajax进行请求post
			$.post("loginServlet", {
				name : $("#uname").val(),
				pwd : $("#upwd").val()
			}, function(data, success) {
				if ('Ok' == data) {
					window.location.href = "ok.jsp";
				} else {
					$("#hehea").append("密码错误");
				}
			});

		});
	});
</script>
</head>

<body>
	<input type="text" id="uname" name="username">
	<input type="password" id="upwd" name="userpassword">
	<button type="button" id="send">提交</button>
	<p id="hehea"></p>

</body>
</html>
