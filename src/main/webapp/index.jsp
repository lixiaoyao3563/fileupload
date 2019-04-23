<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file" />
    <input type="submit" value="上 传" />
</form>
</body>
</html>