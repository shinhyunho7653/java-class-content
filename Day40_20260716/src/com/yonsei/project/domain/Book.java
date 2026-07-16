package com.yonsei.project.domain;

// 책 한권에 대한 정보를 한꺼번에 묶었다

public class Book {
	
	String title;       // 도서명
	String author;      // 저자명
	String publisher;   // 출판사명
	
	public Book(String title, String author, String publisher) {

		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	// 책의 정보를 출력하는 함수
	public void showBook() {
		System.out.println("책이름:" + title);
		System.out.println("저자:" + author);
		System.out.println("출판사:" + publisher);
		System.out.println();
	}
	
	// 책의 이름 가져가서 보내주기
	public String getTitle() {
		return title;
	}

}
