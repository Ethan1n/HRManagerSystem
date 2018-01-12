<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改招聘信息</title>
</head>
<body>
	<div style="width: 200px;height: 100px;">
		<form action="${pageContext.request.contextPath}/admin/modifyRecruit?recruitId=${recruitId}" method="POST">
			<table border="2" cellpadding="10" cellspacing="0">
				<tr>
					<td colspan="2"><h3>输入要修改的信息</h3></td>
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