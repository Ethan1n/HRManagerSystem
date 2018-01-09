<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<style type="text/css">      
     body{      
        background-image: url(${pageContext.request.contextPath}/pictures/1.jpg);      
        background-size:cover;    
     }      
 </style>
</head>
<body>
	<h1 style="color:red;text-align:center;margin-top: 100px">人力资源管理系统</h1>
	<div style="margin-top: 50px;">
		<form action="${pageContext.request.contextPath}/vistor/login" method="POST">
			<table cellpadding="10" cellspacing="0" align="center">
				<tr>
					<td colspan="2"><h2 style="text-align:center;color:white">用户登录</h2></td>
				</tr>
				<tr>
					<td style="text-align:center;color:white;font-size:large;">登录用户:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td style="text-align:center;color:white;font-size:large;">登录密码:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td style="text-align:center;color:white;font-size:large;">登录方式:</td>
					<td colspan="2"><select name="loginType">
						<option value="1">游客登录</option>
						<option value="2">员工登录</option>
						<option value="3">管理员登录</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="登录">&nbsp;<button onclick="window.open('${pageContext.request.contextPath}/vistor/toRegister')">注册</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>