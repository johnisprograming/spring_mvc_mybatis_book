package com.spring_mvc_mybatis.book.model;

public class BookVO {
	private String bookNo;
	private String bookName;
	private int bookPrice;
	private String bookCompany;
	private int bookStock;
	
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookCompany() {
		return bookCompany;
	}
	public void setBookCompany(String bookCompany) {
		this.bookCompany = bookCompany;
	}
	public int getBookStock() {
		return bookStock;
	}
	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}
	
	
}
