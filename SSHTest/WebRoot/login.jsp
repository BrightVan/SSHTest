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

<title>登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

	<body>
		<!-- <script type="text/javascript">
		function sub(){
		}
		</script> -->
		<form action="mylogin.action" method="post">
		<input type="hidden" name="action"/>
		姓名：<input type="text" name="user.username"/><br>
		密码：<input type="password" name="user.password"/><br>
		<input type="submit" value="登录"/>
		<input type="button" value="注册" onclick="javascript:document.location.href='register.jsp';"/>
		</form>
		
	</body>

</html>
