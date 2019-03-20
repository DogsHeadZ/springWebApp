<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<meta name="viewport" content="width=device-width,initial-scale=1" />
<style type="text/css">
img {
    position: absolute;
}
#top{
	left: 40%;
	top: 22%;
	width: 100px;
}
#left {
    left: 10%;
    top: 40%;
    width: 100px;
}
#center {
    left: 40%;
    top: 40%;
    width: 100px;
}
#right {
    left: 70%;
    top: 40%;
    width: 100px;
}
#bottom{
	left: 40%;
	top: 58%;
	width: 100px;
}
</style>
<link href="jquery.mobile/jquery.mobile-1.4.5.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="jquery.mobile/jquery-1.12.2.min.js"></script>
<script type="text/javascript" src="jquery.mobile/jquery.mobile-1.4.5.js"></script>
</head>

</head>

<body>
<div data-role="page">
    <div data-role="header" data-position="fixed">
        <a href="javascript:" onClick="javascript:history.back(-1);">返回上一页</a>
        <h1>书法字部首选择aaa</h1>
        <a href="#">设置</a>
    </div>
    <div data-role="content">
        <img src="images/2.png" id="top"/>
        <c:if test="${not empty chineseRadicalTop}">
        	<a href="listRadical?topId=${character.topId}"><img src="${chineseRadicalLeft.filePath}" style="left: 40%;top: 22%;width: 100px"/></a>
		</c:if>
        <img src="images/2.png" id="left"/>
        <c:if test="${not empty chineseRadicalLeft}">
        	<a href="listRadical?topId=${character.topId}"><img src="${chineseRadicalLeft.filePath}" style="left: 10%;top: 40%;height: 100px"/></a>
        </c:if>
        <img src="images/2.png" id="center"/>
        <c:if test="${not empty chineseRadicalCenter}">
        	<a href="listRadical?topId=${character.topId}"><img src="${chineseRadicalCenter.filePath}" style="left: 40%;top: 40%;width: 100px"/></a>
        </c:if>
        <img src="images/2.png" id="right"/>
        <c:if test="${not empty chineseRadicalRight}">
        	<a href="listRadical?topId=${character.topId}"><img src="${chineseRadicalRight.filePath}" style="left: 70%;top: 40%;height: 100px"/></a>
        </c:if>
        <img src="images/2.png" id="bottom"/>
        <c:if test="${not empty chineseRadicalBottom}">
        	<a href="listRadical?topId=${character.topId}"><img src="${chineseRadicalBottom.filePath}" style="left: 40%;top: 58%;width: 100px"/></a>
        </c:if>
    </div>
</div>

</body>
</html>
