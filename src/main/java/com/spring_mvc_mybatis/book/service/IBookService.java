package com.spring_mvc_mybatis.book.service;

import java.util.ArrayList;

import com.spring_mvc_mybatis.book.model.BookVO;

public interface IBookService {
	ArrayList<BookVO> listAllBook();		// 전체 도서 조히
	void insertBook(BookVO bookVo);			// 도서 정보 등록 
	void updateBook(BookVO bookVo);			// 도서 정보 수정
	void deleteBook(String bookNo);			// 도서 정보 삭제
	BookVO detailViewBook(String bookNo);	// 상세 도서 조회
}
