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
<div data-role="page" id="page">
    <div data-role="header">
        <h1>aaa</h1>
    </div>
    <div data-role="content">
        <form>
            <ul data-role="listview" data-inset="true" id="listViewForm">
                <li data-role="fieldcontain">
                    <label for="name">ç»å½å:</label>
                    <input type="text" name="name" id="name" value=""/>
                </li>
                <li data-role="fieldcontain">
                    <label for="name">å¯ç :</label>
                    <input type="password" name="password" id="password" value="" />
                </li>
                <li data-role="fieldcontain">
                    <fieldset class="ui-grid-a">
                        <div class="ui-block-a">
                            <button type="submit" data-theme="d">åæ¶</button>
                        </div>
                        <div class="ui-block-b">
                            <button type="submit" data-theme="a">æäº¤</button>
                        </div>
                    </fieldset>
                </li>
            </ul>
        </form>
    </div>
</div>
</body>
</html>
