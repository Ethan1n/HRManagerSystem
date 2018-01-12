<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
 		$("#modifyPwd").hide();
 		$("a").eq(2).click(function(){
 			$("#modifyPwd").show();
 		})
 	})
 	$(function(){
 		var id=$("#notice").val();
 		$.ajax({
			url:"${pageContext.request.contextPath}/vistor/receiveInterview",
			type:"post",
			dataType:"text",
			data:{vistorId:id},
			success:function(result){
				if(result=="true"){
					alert("您有新的面试邀请请在反馈中查看");
				}
			},
		})
 	})
 	$(function(){
 		$("#feedback").hide();
 		$("a").eq(0).click(function(){
 			$("#feedback").show();
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
	<div id="feedback" align="center">
		<table border="2" cellpadding="10" cellspacing="0">
			<tr>
				<td colspan="4" align="center"><h3>反馈详情</h3></td>
			</tr>
			<tr>
				<td>游客ID</td>
				<td>投递时间</td>
				<td>是否查看</td>
				<td>面试时间</td>
			</tr>
			<tr>
				<td><input id="notice" type="text" value="${vistor.vistorId}" disabled="disabled" size="2"></td>
				<td><f:formatDate value="${candidates.deliveryTime}"/></td>
					<c:if test="${candidates.status==0}">
						<td>未查看</td>
					</c:if>
					<c:if test="${candidates.status==1}">
						<td>已查看</td>
					</c:if>
				<td><f:formatDate value="${interview.interviewDate}"/></td>
			</tr>
		</table>		
	</div>
	<div id="modifyPwd">
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