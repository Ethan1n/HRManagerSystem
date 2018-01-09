<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简历页面</title>
<style type="text/css">      
     body{      
        background-image: url(${pageContext.request.contextPath}/pictures/3.jpg);      
        background-size:cover;    
     }    
 </style>
</head>
<body>
	<div align="center" style="margin-top: 100px">
		<c:if test="${resume==null}">
			<form action="" method="POST">
				<table border="2" cellpadding="10" cellspacing="0">
					<tr>
						<td colspan="4" align="center">简历</td>
					</tr>
					<tr>
						<td>真实姓名:</td>
						<td><input type="text" name="realName" placeholder="请输入真实姓名"></td>
						<td>性别:</td>
						<td><input type="radio" name="gender" value="男">男&nbsp;<input type="radio" name="gender" value="女">女</td>
					</tr>
					<tr>
						<td>年龄:</td>
						<td><input type="text" name="age" placeholder="请输入年龄"></td>
						<td>学历:</td>
						<td><select name="education">
							<option>-请选择-</option>
							<option value="博士">博士</option>
							<option value="硕士">硕士</option>
							<option value="本科">本科</option>
							<option value="专科">专科</option>
						</select></td>
					</tr>
					<tr>
						<td>手机号:</td>
						<td><input type="text" name="tel" placeholder="请输入联系方式"></td>
						<td>E-mail:</td>
						<td><input type="text" name="email" placeholder="请输入邮箱地址"></td>
					</tr>
					<tr>
						<td>应聘职位:</td>
						<td><select name="departmentId">
							<option>-请选择-</option>
							<c:forEach items="${departments}" var="department">
								<option value="${department.departmentId}">${department.departmentName}</option>
							</c:forEach>
						</select>
						<select name="positionId">
							<option>-请选择-</option>
							<c:forEach items="${positions}" var="position">
								<option value="${position.positionId}">${position.positionName}</option>
							</c:forEach>
						</select></td>
						<td>政治面貌:</td>
						<td><select name="politicalStatus">
							<option>-请选择-</option>
							<option value="中共党员">中共党员</option>
							<option value="共青团员">共青团员</option>
							<option value="群众">群众</option>
						</select></td>
					</tr>
					<tr>
						<td>上份工作:</td>
						<td><input type="text" name="lastJob" placeholder="请输入工作名称"></td>
						<td>工作经验:</td>
						<td><input type="text" name="workExperience" placeholder="请输入工作年限"></td>
					</tr>
					<tr>
						<td>期望薪资:</td>
						<td><select name="expectedSalary">
							<option>-请选择-</option>
							<option value="4000-6000">¥4000-6000</option>
							<option value="6000-8000">¥6000-8000</option>
							<option value="8000-10000">¥8000-10000</option>
						</select></td>
						<td>兴趣爱好:</td>
						<td><input type="text" name="hobby" placeholder="请输入兴趣爱好"></td>
					</tr>
					<tr>
						<td colspan="4" align="center"><input type="submit" value="保存">&nbsp;<button onclick="javascript:history.back(-1);">返回</button> </td>
					</tr>
				</table>
			</form>
		</c:if>
		<c:if test="${resume!=null}">
			<form action="" method="POST">
				<table border="2" cellpadding="10" cellspacing="0">
					<tr>
						<td colspan="4" align="center">简历</td>
					</tr>
					<tr>
						<td>真实姓名:</td>
						<td><input type="text" name="realName" value="${resume.realName}"></td>
						<td>性别:</td>
						<td><input type="radio" name="gender" value="男">男&nbsp;<input type="radio" name="gender" value="女">女</td>
					</tr>
					<tr>
						<td>年龄:</td>
						<td><input type="text" name="age" value="${resume.age}"></td>
						<td>学历:</td>
						<td><select name="education">
							<option value="${resume.education}">${resume.education}</option>
							<option value="博士">博士</option>
							<option value="硕士">硕士</option>
							<option value="本科">本科</option>
							<option value="专科">专科</option>
						</select></td>
					</tr>
					<tr>
						<td>手机号:</td>
						<td><input type="text" name="tel" placeholder="请输入联系方式"></td>
						<td>E-mail:</td>
						<td><input type="text" name="email" placeholder="请输入邮箱地址"></td>
					</tr>
					<tr>
						<td>应聘职位:</td>
						<td><select name="departmentId">
							<option>-请选择-</option>
							<c:forEach items="${departments}" var="department">
								<option value="${department.departmentId}">${department.departmentName}</option>
							</c:forEach>
						</select>
						<select name="positionId">
							<option>-请选择-</option>
							<c:forEach items="${positions}" var="position">
								<option value="${position.positionId}">${position.positionName}</option>
							</c:forEach>
						</select></td>
						<td>政治面貌:</td>
						<td><select name="politicalStatus">
							<option>-请选择-</option>
							<option value="中共党员">中共党员</option>
							<option value="共青团员">共青团员</option>
							<option value="群众">群众</option>
						</select></td>
					</tr>
					<tr>
						<td>上份工作:</td>
						<td><input type="text" name="lastJob" placeholder="请输入工作名称"></td>
						<td>工作经验:</td>
						<td><input type="text" name="workExperience" placeholder="请输入工作年限"></td>
					</tr>
					<tr>
						<td>期望薪资:</td>
						<td><select name="expectedSalary">
							<option>-请选择-</option>
							<option value="4000-6000">¥4000-6000</option>
							<option value="6000-8000">¥6000-8000</option>
							<option value="8000-10000">¥8000-10000</option>
						</select></td>
						<td>兴趣爱好:</td>
						<td><input type="text" name="hobby" placeholder="请输入兴趣爱好"></td>
					</tr>
					<tr>
						<td colspan="4" align="center"><input type="submit" value="保存">&nbsp;<button onclick="javascript:history.back(-1);">返回</button> </td>
					</tr>
				</table>
			</form>
		</c:if>
	</div>
</body>
</html>