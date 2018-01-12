<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员查看简历</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$("#date").hide();
		$("#interview").click(function(){
			$("#date").show();
		})
	})
	$(function(){
		$("#sure").click(function(){
			var date=$("input[name='interviewDate']").val();
			var id=$("input[name='candidatesId']").val();
			alert(id);
			var setDate=new Date(date).getTime();
			var sysDate=new Date().getTime();
			if(setDate<sysDate){
				alert("面试时间错误，重新输入");
				return false;
			}else{
				$.ajax({
					url:"${pageContext.request.contextPath}/admin/notifyInterview",
					type:"post",
					dataType:"text",
					data:{interviewDate:date,candidatesId:id},
					success:function(result){
						if(result=="true"){
							alert("发送面试邀请成功");
						}else{
							alert("发送面试邀请失败");
						}
					},
				})
			}
		})
	})
</script>
</head>
<body>
	<div align="center">
		<table border="2" cellpadding="10" cellspacing="0">
			<tr>
				<td colspan="4" align="center">简历<input type="hidden" name="resumeId" value="${resume.resumeId}">
				<input type="hidden" name="vistorId" value="${resume.vistorId}"></td>
			</tr>
			<tr>
				<td>真实姓名:</td>
				<td><input type="text" name="realName" value="${resume.realName}" disabled="disabled"></td>
				<td>性别:</td>
				<c:if test="${resume.gender=='男'}">
					<td><input type="radio" name="gender" value="男" checked="checked">男&nbsp;<input type="radio" name="gender" value="女" disabled="disabled">女</td>
				</c:if>
				<c:if test="${resume.gender=='女'}">
					<td><input type="radio" name="gender" value="男"  disabled="disabled">男&nbsp;<input type="radio" name="gender" value="女" checked="checked">女</td>
				</c:if>
			</tr>
			<tr>
				<td>年龄:</td>
				<td><input type="text" name="age" value="${resume.age}" disabled="disabled"></td>
				<td>学历:</td>
				<td><select name="education" disabled="disabled">
					<option>${resume.education}</option>
				</select></td>
			</tr>
			<tr>
				<td>手机号:</td>
				<td><input type="text" name="tel" value="${resume.tel}" disabled="disabled"></td>
				<td>E-mail:</td>
				<td><input type="text" name="email" value="${resume.email}" disabled="disabled"></td>
			</tr>
			<tr>
				<td>应聘职位:</td>
				<td><select name="departmentId" disabled="disabled" disabled="disabled">
					<option>${resume.applyDepartment.departmentName}</option>
				</select>
				<select name="positionId" disabled="disabled" disabled="disabled">
					<option>${resume.applyPosition.positionName}</option>
				</select></td>
				<td>政治面貌:</td>
				<td><select name="politicalStatus" disabled="disabled">
					<option>${resume.politicalStatus}</option>
				</select></td>
			</tr>
			<tr>
				<td>上份工作:</td>
				<td><input type="text" name="lastJob" value="${resume.lastJob}" disabled="disabled"></td>
				<td>工作经验:</td>
				<td><input type="text" name="workExperience" value="${resume.workExperience}" disabled="disabled"></td>
			</tr>
			<tr>
				<td>期望薪资:</td>
				<td><select name="expectedSalary" disabled="disabled">
					<option>${resume.expectedSalary}</option>
				</select></td>
				<td>兴趣爱好:</td>
				<td><input type="text" name="hobby" value="${resume.hobby}" disabled="disabled"></td>
			</tr>
			<tr>
				<td colspan="4" align="center"><button id="interview">发送面试邀请</button>&nbsp;<button onclick="javascript:history.back(-1)">返回上一页</button></td>
			</tr>
		</table>
		<div id="date">
			<table border="1" cellpadding="10" cellspacing="0">
				<tr>
					<td>请输入邀请面试的时间</td>
					<td><input type="date" name="interviewDate"><input type="hidden" name="candidatesId" value="${candidatesId}"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input id="sure" type="submit" value="确定"></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>