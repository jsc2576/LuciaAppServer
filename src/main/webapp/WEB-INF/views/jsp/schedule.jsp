<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		
		<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
	</head>
	
	<body>
		<form method="POST" enctype="multipart/form-data" action="/sch/insert">
		    스케줄 이름 : <input type="text" name="sch_nm"/><br>
		    시작 날짜 : <input type="text" name="sch_sta_year"/><input type="text" name="sch_sta_month"/> <input type="text" name="sch_sta_date"/><br>
		    종료 날짜 : <input type="text" name="sch_end_year"/><input type="text" name="sch_end_month"/> <input type="text" name="sch_end_date"/><br>
		  <input type="submit" value="Submit" id="btnSubmit"/>
		</form>
	</body>

	<script src="/resources/js/bootstrap.min.js"></script>
	<script src="/resources/js/jquery-1.9.1.min.js"></script>
</html>
	