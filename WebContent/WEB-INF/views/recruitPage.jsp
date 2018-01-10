<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>招聘页面</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
 <script type="text/javascript">
 	$(function(){
 		 $("#send").click(function(){
 			var id=$("input[name='vistorId']").val();
 			$.ajax({
				url:"${pageContext.request.contextPath}/vistor/sendResume",
				type:"post",
				dataType:"text",
				data:{vistorId:id},
				success:function(result){
					if(result=="true"){
						alert("投递简历成功");
					}else{
						alert("投递简历失败");
					}
				},
			})
 		 })
 	})
 </script>
</head>
<body>
	<table border="2" cellpadding="10" cellspacing="0">
		<tr>
			<td>公司名称</td>
			<td>招聘部门</td>
			<td>招聘职位</td>
			<td>公司地址</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${recruits}" var="recruit">
			<tr>
				<td>${recruit.companyName}</td>
				<td>${recruit.department.departmentName}</td>
				<td>${recruit.position.positionName}</td>
				<td>${recruit.companyAdd}</td>
				<td><button id="send">投递简历</button><input type="hidden" name="vistorId" value="${vistorId}"></td>
			</tr>
		</c:forEach>
	</table><br/><br/>
	<span><button onclick="javascript:history.back(-1)">返回上一页</button></span>
</body>
</html>