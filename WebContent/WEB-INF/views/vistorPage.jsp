<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>游客页面</title>
<style type="text/css">      
     body{      
        background-image: url(${pageContext.request.contextPath}/pictures/2.jpg);      
        background-size:cover;    
     }  
     div{
     	-webkit-margin-before: -20em;
		-webkit-margin-after: 0em;
		-webkit-margin-start: 500px;
		-webkit-margin-end: 10px;
     } 
 </style>
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
 <script type="text/javascript">
 	$(function(){
 		$("a").eq(4).click(function(){
 			var flag = confirm("确定要退出吗?");
 			if(flag){
 				$(this).attr("href", "${pageContext.request.contextPath}/vistor/toLogin");
 			}
 		})
 	})
 	$(function(){
 		$("#input").hide();
 		$("a").eq(2).click(function(){
 			$("#input").show();
 		})
 	})
 </script>
</head>
<body>
	<div style="margin-top: 50px;margin-left: 100px">
		<h3>欢迎登录:${vistor.vistorName}</h3>
	</div>
	<div style="margin-top: 50px;margin-left: 100px">
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/2_1.png"></a><br/><br/>
		<a href="${pageContext.request.contextPath}/vistor/showResume?vistorId=${vistor.vistorId}"><img src="${pageContext.request.contextPath}/pictures/2_2.png"></a><br/><br/>
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/2_3.png"></a><br/><br/>
		<a href="${pageContext.request.contextPath}/vistor/showRecruit?vistorId=${vistor.vistorId}"><img src="${pageContext.request.contextPath}/pictures/2_4.png"></a><br/><br/>
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/2_5.png"></a><br/><br/>
	</div>
	<div id="input" style="border: 2px;">
		<form action="${pageContext.request.contextPath}/vistor/modifyPwd?vistorId=${vistor.vistorId}" method="POST">
			<table border="2" cellpadding="10" cellspacing="0">
				<tr>
					<td colspan="2" align="center"><h3>修改密码</h3></td>
				</tr>
				<tr>
					<td>新密码:</td>
					<td><input type="password" name="vistorPassword"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="修改"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>