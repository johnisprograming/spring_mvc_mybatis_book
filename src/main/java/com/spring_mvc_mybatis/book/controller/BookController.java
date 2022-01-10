package com.spring_mvc_mybatis.book.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_mvc_mybatis.book.model.BookVO;
import com.spring_mvc_mybatis.book.service.BookService;

@Controller
public class BookController {
	// DI 설정 
	@Autowired
	BookService service;
	
	// 실행 시 index page 
	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}
	
	// 전체 도서 조회
	@RequestMapping("/book/listAllBook")
	public String listAllBook(Model model) {
		ArrayList<BookVO> bookList = service.listAllBook();
		model.addAttribute("bookList", bookList);
		return "book/bookListView";
	}
	
	// 도서 등록
	@RequestMapping("/book/insertBook")
	public String insertBook(BookVO book) {
		return "redirect:./listAllBook";
	}
	
	// 도서 상세 정보 페이지로 이동 
	@RequestMapping("/book/detailViewBook/{bookNo}")
	public String detailViewBook(@PathVariable String bookNo, Model model) {
		// 도서번호 전달하고, 해당 도서 정보 받아오기 
		BookVO book = service.detailViewBook(bookNo);
		model.addAttribute("book", book);
		
		return "book/bookDetailView"; // 도서 상세 정보 뷰 페이지 
	}
	
	// 도서 정보 수정 화면으로 이동 (수정하기 위해 먼저 도서 상세 정보를 화면(입력 폼)에 출력)
	@RequestMapping("/book/updateBookForm/{bookNo}")
	public String updateBookForm(@PathVariable String bookNo, Model model) {
		// 도서번호 전달하고, 해당 도서 정보 받아오기 
		BookVO book = service.detailViewBook(bookNo); // 상세 도서 조회 메소드 그대로 사용 
		model.addAttribute("book", book);
		return "book/updateBookForm";
	}
	
	// 도서 정보 수정 : 수정된 도서 정보 DB에 저장 
	@RequestMapping("/book/updateBook")
	public String detailViewBook(BookVO book) {
		service.updateBook(book);
		return "redirect:./listAllBook";	// 전체 도서 조회 페이지로 포워딩 
	}
	
	// 도서 상품 삭제 
	@RequestMapping("/book/deleteBook/{bookNo}")
	public String deleteBook(@PathVariable String bookNo) {
		service.deleteBook(bookNo);
		return "redirect:../listAllBook";
	}
}

















