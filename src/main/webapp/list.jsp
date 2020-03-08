<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<td>部门编号</td>
			<td>部门名称</td>
			<td>部门地址</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${deptList }" var="d" >
			<tr>
				<td>${d.deptno }</td>
				<td>${d.dname }</td>
				<td>${d.loc }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>