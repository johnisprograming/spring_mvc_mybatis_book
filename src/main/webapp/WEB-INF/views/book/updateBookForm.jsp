<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 수정</title>
</head>
	<body>
		<h3>도서 정보 수정</h3>
			<form method="post" action="/mybatis/book/updateBook">
			<table>
				<tr><td>도서 번호</td><td><input type="text" name="bookNo" value="${book.bookNo}" readonly></td></tr>
				<tr><td>도서명</td><td><input type="text" name="bookName" value="${book.bookName}"></td></tr>
				<tr><td>가격</td><td><input type="text" name="bookPrice" value="${book.bookPrice}"></td></tr>
				<tr><td>출판사</td><td><input type="text" name="bookCompany" value="${book.bookCompany}"></td></tr>
				<tr><td>재고</td><td><input type="text" name="bookStock" value="${book.bookStock}"></td></tr>
			</table>
		</form>
	</body>
</html>