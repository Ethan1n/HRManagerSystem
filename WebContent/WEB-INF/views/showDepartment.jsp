<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门和职位</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
			$("#position").hide();
			$("a[name='department']").click(function(){
				var id=$(this).next().val();
				$.ajax({
				url:"${pageContext.request.contextPath}/admin/showPosition",
				type:"post",
				dataType:"json",
				data:{departmentId:id},
				success:function(result){
					$("#position").empty();
					if(result.length!=0){
						$("#position").append("<tr><td><h2>职位</h2></td><td align='center'>操作</td></tr>");
						for(var i=0; i<result.length; i++){
							$("#position").append("<tr><td align='center'><b>"+result[i].positionName+"</b></td><td><input type='hidden' name='positionId' value='"+result[i].positionId+
									"'><a name='deletePosi' href='#'><i>删除</i></a>&nbsp;<a href='${pageContext.request.contextPath}/admin/toModifyPosi?positionId="+result[i].positionId+"'><i>修改</i></a></td></tr>");
		                }
					}else{
						$("#position").append("<tr><td><h3>该部门暂无职位</h3></td></tr>");
					}
					$("#position").append("<tr><td colspan='2'><a id='addPosi' href='#'><i>添加职位</i></a></td></tr>");
				}
			})
			$("#position").show();
		})
	})
	$(function(){
		$("a[name='deleteDept']").click(function(){
			var id=$(this).prev().val();
			alert(id);
				$.ajax({
				url:"${pageContext.request.contextPath}/admin/deleteDept",
				type:"post",
				dataType:"text",
				data:{departmentId:id},
				success:function(result){
					if(result=="true"){
						$(this).parent().parent().remove();
					}else{
						alert("该部门下有职位无法删除");
					}
				},
			})
		})
	})
	$(function(){
		$(document).on("click","a[name='deletePosi']",function(){
			var id=$("input[name='positionId']").val();
				$.ajax({
				url:"${pageContext.request.contextPath}/admin/deletePosi",
				type:"post",
				dataType:"text",
				data:{positionId:id},
				success:function(result){
					if(result=="true"){
						$(this).parent().parent().remove();
					}else{
						alert("该职位下有员工无法删除");
					}
				},
			})
		})
	})
	$(function(){
		$("#insertDept").hide();
		$("#addDept").click(function(){
			$("#insertDept").show();
		})
	})
	$(function(){
		$("#insertPosi").hide();
		$(document).on("click","#addPosi",function(){
			$("#insertPosi").show();
		})
	})
</script>
</head>
<body>
	<div align="center" id="deptAndPosi">
		<table border="2" cellpadding="10" cellspacing="0">
			<tr>
				<td align="center"><h2>部门</h2></td>
				<td align="center">操作</td>
			</tr>
			<c:forEach items="${departments}" var="department">
				<tr>
					<td><a name="department" href="#"><b>${department.departmentName}</b></a><input type="hidden" name="departmentId" value="${department.departmentId}"></td>
					<td><input type="hidden" name="departmentId" value="${department.departmentId}"><a name="deleteDept" href="#"><i>删除</i></a>
						&nbsp;<a href="${pageContext.request.contextPath}/admin/toModifyDept?departmentId=${department.departmentId}"><i>修改</i></a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="2"><a id="addDept" href="#"><i>添加部门</i></a></td>
			</tr>
		</table>
		<table border="2" cellpadding="10" cellspacing="0" id="position">
		</table>
	</div>
	<div id="insertDept">
		<form action="${pageContext.request.contextPath}/admin/addDept" method="POST">
			<table border="2" cellpadding="10" cellspacing="0">
				<tr>
					<td colspan="2"><h3>添加部门</h3></td>
				</tr>
				<tr>
					<td>部门名称</td>
					<td><input type="text" name="departmentName"></td>
				</tr>
				<tr>
					<td>创建时间</td>
					<td><input type="date" name="deptcreateTime"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交">&nbsp;<button onclick="javascript:history.back(-1)">返回上一页</button></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="insertPosi">
		<form action="${pageContext.request.contextPath}/admin/addPosi" method="POST">
			<table border="2" cellpadding="10" cellspacing="0">
				<tr>
					<td colspan="2"><h3>添加职位</h3></td>
				</tr>
				<tr>
					<td>职位名称</td>
					<td><input type="text" name="positionName"></td>
				</tr>
				<tr>
					<td>创建时间</td>
					<td><input type="date" name="positcreateTime"></td>
				</tr>
				<tr>
					<td>所属部门</td>
					<td><select name="departmentId">
						<c:forEach items="${departments}" var="department">
							<option value="${department.departmentId}">${department.departmentName}</option>
						</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交">&nbsp;<button onclick="javascript:history.back(-1)">返回上一页</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>