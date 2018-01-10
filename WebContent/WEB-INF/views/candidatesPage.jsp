<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>应聘管理</title>
<style type="text/css">
	body{      
        background-image: url(${pageContext.request.contextPath}/pictures/4.jpg);      
        background-size:cover;    
     }
</style>
</head>
<body>
	<c:choose>
		<c:when test="${not empty candidateses}">
			<div align="center" style="margin-top: 100px;">
				<form action="" method="POST">
					<table border="2" cellpadding="10" cellspacing="0">
						<tr>
							<td>序号</td>
							<td>应聘者ID</td>
							<td>投递时间</td>
							<td>是否处理</td>
							<td>操作</td>
						</tr>
						<c:forEach items="${candidateses}" var="candidates">
							<tr>
								<td>${candidates.candidatesId}</td>
								<td>${candidates.vistorId}</td>
								<td><f:formatDate value="${candidates.deliveryTime}"/></td>
								<c:choose>
									<c:when test="${candidates.status!=0}">
										<td>已处理</td>
									</c:when>
									<c:otherwise>
										<td>未处理</td>
									</c:otherwise>
								</c:choose>
								<td><a href="${pageContext.request.contextPath}/admin/showResume?vistorId=${candidates.vistorId}&candidatesId=${candidates.candidatesId}">查看简历</a></td>
							</tr>
						</c:forEach>
					</table>
				</form><br/><br/>
				<button onclick="javascript:history.back(-1)">返回上一页</button>
			</div>
		</c:when>
		<c:otherwise>
			<h3>无应聘信息</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>