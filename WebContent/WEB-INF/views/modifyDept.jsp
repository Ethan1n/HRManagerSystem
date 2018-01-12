<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改部门信息</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/admin/modifyDept" method="POST">
		<table border="2" cellpadding="10" cellspacing="0">
			<tr>
				<td colspan="2"><h3>修改部门信息</h3></td>
			</tr>
			<tr>
				<td>新的部门名字</td>
				<td><input type="hidden" name="departmentId" value="${departmentId}"><input type="text" name="departmentName"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交">&nbsp;<button onclick="javascript:history.back(-1)">返回上一页</button></td>
			</tr>
		</table>
	</form>
</body>
</html>