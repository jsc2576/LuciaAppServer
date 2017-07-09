<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		
		<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
	</head>
	
	<body>
		<div>동영상</div><br/>
		<form method="POST" enctype="multipart/form-data" action="/video/upload">
		    비디오 이름 *: <input type="text" name="video_nm"/><br/>
		    비디오 url(https://youtu.be/w6HYy4RWOkg) *: <input type="text" name="video_url"/><br/>
		    저작권: <input type="text" name="lcs"/><br/>
		    콘서트 날짜(yyyy/mm) *: <input type="text" name="con_ym"/><br/>
		    <input type="submit" value="Submit" id="btnSubmit"/>
		</form>
	</body>
	
	<script src="/resources/js/bootstrap.min.js"></script>
	<script src="/resources/js/jquery-1.9.1.min.js"></script>
</html>