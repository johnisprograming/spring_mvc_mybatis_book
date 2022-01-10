<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록 폼</title>
</head>
<body>
	<h3>도서 등록</h3>
	
	<form method="post" action="/mybatis/book/insertBook">
		<table>
			<tr><td>도서 번호</td><td><input type="text" name="bookNo"></td></tr>
			<tr><td>도서명</td><td><input type="text" name="bookName"></td></tr>
			<tr><td>가격</td><td><input type="text" name="bookPrice"></td></tr>
			<tr><td>출판사</td><td><input type="text" name="bookCompany"></td></tr>
			<tr><td>재고</td><td><input type="text" name="bookStock"></td></tr>
			<tr><td colspan="2"><input type="submit" value="등록"><input type="reset" value="취소"></td></tr>
		</table>
	</form>
</body>
</html>