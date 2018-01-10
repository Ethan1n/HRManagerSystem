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
     	-webkit-margin-before: 1em;
		-webkit-margin-after: 1em;
		-webkit-margin-start: 0px;
		-webkit-margin-end: 0px;
     } 
 </style>
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
 <script type="text/javascript">
 	$(function(){
 		$("a").eq(3).click(function(){
 			var flag = confirm("确定要退出吗?");
 			if(flag){
 				$(this).attr("href", "${pageContext.request.contextPath}/vistor/toLogin");
 			}
 		})
 	})
 	$(function(){
 		$("a").eq(2).click(function(){
 			
 		})
 	})
 </script>
</head>
<body>
	<div style="margin-top: 50px;margin-left: 100px">
		<h1>欢迎登录:${vistor.vistorName}</h1>
	</div>
	<div style="margin-top: 50px;margin-left: 100px">
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/2_1.png"></a><br/><br/>
		<a href="${pageContext.request.contextPath}/vistor/showResume?vistorId=${vistor.vistorId}"><img src="${pageContext.request.contextPath}/pictures/2_2.png"></a><br/><br/>
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/2_3.png"></a><br/><br/>
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/2_4.png"></a><br/><br/>
	</div>
	<div style="background-color: red;width: 200px;height: 200px;">
		
	</div>
</body>
</html>