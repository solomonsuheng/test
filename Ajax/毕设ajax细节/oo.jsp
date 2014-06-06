<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Test</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- import JQuery -->
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				//加载完毕后调用ajax获取信息
				$.getJSON("infoServlet", function(data, success) {
					$("#columns").text("");
					for ( var i = 0; i < data.length; i++) {

						$("#columns").append(
								"<div class='pin'><img src='' /><p>"
										+ data[i].ncontent + "</p><p>"
										+ data[i].nweb + "</p></div>");
					}
				});

				$("#pa").click(
						function() {
							$.getJSON("infoServlet", function(data, success) {
								$("#columns").text("");
								for ( var i = 0; i < data.length; i++) {

									$("#columns").append(
											"<div class='pin'><img src='' /><p>"
													+ data[i].ncontent
													+ "</p><p>" + data[i].nweb
													+ "</p></div>");
								}
							});
						});

				$("#prefer").click(
						function() {

							$.getJSON("infoServlet", {
								type : "prefer"
							}, function(data2, success2) {
								$("#columns").text("");
								for ( var i = 0; i < data2.length; i++) {
									$("#columns").append(
											"<div class='pin'><img src='' /><p>"
													+ data2[i].ncontent
													+ "</p><p>" + data2[i].nweb
													+ "</p></div>");
								}

							});
						});

			});
</script>
<style type="text/css">
body {
	background: url(http://subtlepatterns.com/patterns/scribble_light.png);
}

#wrapper {
	width: 90%;
	max-width: 1100px;
	min-width: 800px;
	margin: 50px auto;
}

#columns {
	-webkit-column-count: 3;
	-webkit-column-gap: 10px;
	-webkit-column-fill: auto;
	-moz-column-count: 3;
	-moz-column-gap: 10px;
	-moz-column-fill: auto;
	column-count: 3;
	column-gap: 15px;
	column-fill: auto;
}

.pin {
	display: inline-block;
	background: #FEFEFE;
	border: 2px solid #FAFAFA;
	box-shadow: 0 1px 2px rgba(34, 25, 25, 0.4);
	margin: 0 2px 15px;
	-webkit-column-break-inside: avoid;
	-moz-column-break-inside: avoid;
	column-break-inside: avoid;
	padding: 15px;
	padding-bottom: 5px;
	background: -webkit-linear-gradient(45deg, #FFF, #F9F9F9);
	opacity: 1;
	-webkit-transition: all .2s ease;
	-moz-transition: all .2s ease;
	-o-transition: all .2s ease;
	transition: all .2s ease;
}

.pin img {
	width: 100%;
	border-bottom: 1px solid #ccc;
	padding-bottom: 15px;
	margin-bottom: 5px;
}

.pin p {
	font: 12px/18px Arial, sans-serif;
	color: #333;
	margin: 0;
}

@media ( min-width : 960px) {
	#columns {
		-webkit-column-count: 4;
		-moz-column-count: 4;
		column-count: 4;
	}
}

@media ( min-width : 1100px) {
	#columns {
		-webkit-column-count: 5;
		-moz-column-count: 5;
		column-count: 5;
	}
}
#columns










:hover





 





.pin










:not





 





(
:hover





 





)
{
opacity










:





 





0
.4










;
}
</style>
</head>

<body>
	<p id="content"></p>
	<button id="prefer" type="button">偏好</button>
	<button id="pa" type="button">所有聚读</button>
	<div id="wrapper">
		<div id="columns"></div>
	</div>
</body>
</html>
