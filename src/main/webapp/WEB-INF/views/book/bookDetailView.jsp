<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세 정보 조회</title>
</head>
<body>
	<h3>상품 상세 정보 조회</h3>
	<table border="1" width="300">
		<tr><td>도서번호</td><td>${book.bookNo }</td></tr>
		<tr><td>도서명</td><td>${book.bookName }</td></tr>
		<tr><td>가격</td><td>${book.bookPrice }</td></tr>
		<tr><td>출판사</td><td>${book.bookCompany }</td></tr>
		<tr><td>재고</td><td>${book.bookStock }</td></tr>
	</table><br>
	
	<!-- 도서 정보 수정 화면으로 이동 -->
	<a href="/mybatis/book/updateBookForm/${book.bookNo}">도서 정보 수정</a><br><br>
	또는 <br>
	<a href="<c:url value='/book/updateBookForm/${book.bookNo}'/>">도서 정보 수정</a><br><br>
	
	<!-- 도서 정보 삭제 : 삭제 여부 확인 처리 (자바스크립트로) -->
	<a href="javascript:deleteCheck();">도서 정보 삭제</a><br><br>
	<script type="text/javascript">
		function deleteCheck(){
			var answer = confirm("선택한 상품을 삭제하시겠습니까?");
			if(answer == true){
				location.href="/mybatis/book/deleteBoook/${book.bookNo}";
			}
		}
	</script>
	
	<a href="<c:url value='/'/>">메인 화면으로 이동</a>
	</body>
</html>









