<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>

<form action="/shufaWebApp/listCalligraphy" method="get">
<table border="1px">
	<tr>
		<td width="20%">书法字</td>
		<td width="80%"><input type="text" name="label"/></td>
	</tr>
	<tr>
		<td width="20%">书法家</td>
		<td width="80%"><input type="text" name="author"/></td>
	</tr>
	<tr>
		<td colspan="2">
		   <input type="submit" value="查找">
		   <input type="reset" value="重置">
		</td>
	</tr>
</table>
</form>
</body>
</html>
