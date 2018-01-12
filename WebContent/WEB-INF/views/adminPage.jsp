<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员页面</title>
<style type="text/css">
	body{      
        background-image: url(${pageContext.request.contextPath}/pictures/4.jpg);      
        background-size:cover;    
     } 
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$("a").eq(8).click(function(){
			var flag = confirm("确定要退出吗?");
			if(flag){
				$(this).attr("href", "${pageContext.request.contextPath}/vistor/toLogin");
			}
		})
	})
</script>
</head>
<body>
	<div style="margin-left: 50px">
		<h3>欢迎登录:${admin.adminName}</h3>
	</div>
	<div style="margin-left: 250px">
		<a href="${pageContext.request.contextPath}/admin/showCandidates"><img src="${pageContext.request.contextPath}/pictures/3_1.png"></a>&nbsp;
		<a href="${pageContext.request.contextPath}/admin/showRecruit"><img src="${pageContext.request.contextPath}/pictures/3_2.png"></a>&nbsp;
		<a href="${pageContext.request.contextPath}/admin/toShowDept"><img src="${pageContext.request.contextPath}/pictures/3_8.png"></a>&nbsp;
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/3_3.png"></a>&nbsp;
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/3_4.png"></a>&nbsp;
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/3_5.png"></a>&nbsp;
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/3_6.png"></a>&nbsp;
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/3_7.png"></a>&nbsp;
		<a href="#"><img src="${pageContext.request.contextPath}/pictures/2_5.png"></a>&nbsp;
	</div>
	<hr>
</body>
</html>