<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		
		<link href="/resources/css/bootstrap.min.css" rel="stylesheet">	
		<link href="/resources/css/image.css" rel="stylesheet">
	</head>
	
	<body class="container-fluid">
	
		<div class="row title">
			<label for="exampleInputName2">이미지 업로드</label>
		</div>
		
		<form class="form-inline" method="POST" enctype="multipart/form-data" action="/gallery/upload/img">
		<div class="row">
			<div class="form-groups">
				<div class="col-sm-8 col-md-8 col-sm-offset-2 col-md-offset-2">
					<label for="exampleInputName2">사진 이름 (*)</label>
				</div>
				<div class="col-sm-8 col-md-8 col-sm-offset-2 col-md-offset-2">			
				    <input type="text" name="file_nm"/>
				</div>
		    </div>
	    </div>
	    <div class="row">
		    <div class="form-groups">
		    	<div class="col-sm-8 col-md-8 col-sm-offset-2 col-md-offset-2">
					<label for="exampleInputName2">저작권</label>
				</div>
				<div class="col-sm-8 col-md-8 col-sm-offset-2 col-md-offset-2">
					<input type="text" name="lcs"/>
				</div>
		    </div>
	    </div>
	    <div class="row">
		    <div class="form-groups">
		    	<div class="col-sm-8 col-md-8 col-sm-offset-2 col-md-offset-2">
	    			<label for="exampleInputName2" >이미지 파일(한글 지원x) (*)</label>
		    	</div>
		    	<div class="col-sm-12">
			    	<input type="file" name="img_file" class="file"/>
		    	</div>
		    </div>
	    </div>
	    <br>
		    <div class="form-groups row">
		    	<div class="col-sm-8 col-md-8 col-sm-offset-2 col-md-offset-2">
			    	<input type="submit" value="Submit" id="btnSubmit" class="btn btn-default"/>
			    </div>
			</div>
		</form>
	</body>
	
	<script src="/resources/js/bootstrap.min.js"></script>
	<script src="/resources/js/jquery-1.9.1.min.js"></script>
	<script src="/resources/js/image.js"></script>
</html>