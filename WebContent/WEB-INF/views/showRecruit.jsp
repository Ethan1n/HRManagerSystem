<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>招聘信息</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
 	$(function(){
 		$("#add").hide();
 		$("#insert").click(function(){
 			$("#add").show();
 		})
 	})
</script>
</head>
<body>
	<table border="2" cellpadding="10" cellspacing="0">
		<tr>
			<td>招聘信息ID</td>
			<td>公司名称</td>
			<td>招聘部门</td>
			<td>招聘职位</td>
			<td>公司地址</td>
			<td>删除</td>
			<td>修改</td>
		</tr>
		<c:forEach items="${recruits}" var="recruit">
			<tr>
				<td>${recruit.recruitId}</td>
				<td>${recruit.companyName}</td>
				<td>${recruit.department.departmentName}</td>
				<td>${recruit.position.positionName}</td>
				<td>${recruit.companyAdd}</td>
				<td><a href="${pageContext.request.contextPath}/admin/deleteRecruit?recruitId=${recruit.recruitId}">删除</a></td>
				<td><a href="${pageContext.request.contextPath}/admin/toModifyRecruit?recruitId=${recruit.recruitId}" name="modify">修改</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="6"><input id="insert" type="button" value="添加招聘信息">&nbsp;<button onclick="javascript:history.back(-1)">返回上一页</button></td>
		</tr>
	</table>
	<div id="add" style="width: 200px;height: 100px;">
		<form action="${pageContext.request.contextPath}/admin/insertRecruit" method="POST">
			<table border="2" cellpadding="10" cellspacing="0">
				<tr>
					<td colspan="2"><h3>添加招聘信息</h3></td>
				</tr>
				<tr>
					<td>公司名称</td>
					<td><input type="text" name="companyName" placeholder="请输入公司名称"></td>
				</tr>
				<tr>
					<td>招聘部门</td>
					<td><select name="departmentId">
						<option>-请选择-</option>
						<c:forEach items="${departments}" var="department">
							<option value="${department.departmentId}">${department.departmentName}</option>
						</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>招聘职位</td>
					<td><select name="positionId">
						<option>-请选择-</option>
						<c:forEach items="${positions}" var="position">
							<option value="${position.positionId}">${position.positionName}</option>
						</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>公司地址</td>
					<td><input type="text" name="companyAdd" placeholder="请输入公司地址"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>