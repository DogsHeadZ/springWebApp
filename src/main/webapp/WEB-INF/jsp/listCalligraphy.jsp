<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<meta name="viewport" content="width=device-width,initial-scale=1" />
<link href="jquery.mobile/jquery.mobile-1.4.5.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="jquery.mobile/jquery-1.12.2.min.js"></script>
<script type="text/javascript" src="jquery.mobile/jquery.mobile-1.4.5.js"></script>
<script>
</script>
<style type="text/css">
</style>
</head>
<body>
<div data-role="page" data-theme="a">
    <div data-role="header" data-position="fixed">
        <a href="javascript:" onClick="javascript:history.back(-1);">返回上一页</a>
        <h1>书法字部首选择</h1>
        <a href="/shufaWebApp/radicalSearch?label=${calligraphyCharacters[0].label}&topId=${calligraphyCharacters[0].topId}&leftId=${calligraphyCharacters[0].leftId}&centerId=${calligraphyCharacters[0].centerId}&rightId=${calligraphyCharacters[0].rightId}&bottomId=${calligraphyCharacters[0].bottomId}">选择部首</a>
    </div>
    <div data-role="content">    
    <ul data-role="listview">         
        <c:forEach var="calligraphyCharacter" items="${calligraphyCharacters}">
		<li><a href="<c:url value="/board/listBoardTopics.html"/>">
			<img src="${calligraphyCharacter.filePath}" />
			<h2>望君歌</h2>
            <p>阿睿凌霓剑裳</p></a>
		</li>
		<li><a href="<c:url value="/board/listBoardTopics.html"/>">
			<img src="${calligraphyCharacter.filePath}" />
			<h2>望君歌</h2>
            <p>阿睿凌霓剑裳</p></a>
		</li>
		<li><a href="<c:url value="/board/listBoardTopics.html"/>">
			<img src="${calligraphyCharacter.filePath}" />
			<h2>望君歌</h2>
            <p>阿睿凌霓剑裳</p></a>
		</li>
		</c:forEach>
    </ul>
    </div>
</div>
</body>
</html>
