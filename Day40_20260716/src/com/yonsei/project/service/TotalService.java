package com.yonsei.project.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.yonsei.project.domain.AniBook;
import com.yonsei.project.domain.Book;
import com.yonsei.project.domain.CookBook;

// 책에 대한 기능과 멤버에 대한 기능들을 처리하는 클래스
// 나이를 판단, 요리쿠폰의 유무를 판단해서 이기는 선택가능 블가능
// 추가하거나 삭제하거나 검색하거나 하는 코드들을 묶어놓은 서비스클래스!

public class TotalService {
	
	// TotalService 안에서 어떠 ㄴ함수든 사용할 수 있게 변수
	// 기본적으로 5개의 책을 저장(프로그램이 시작하자마자)
	// 요리책도 저장이 되야하고 만화책도 저장이 되야되는데 어떤게 올지 모른다
	// 폴더와 폴더를 이동해서 객체를 생성할 수 있는 타입들은 public이 무조건
	// 붙어있어야 된다. 다른 폴더에서 Book 클래스를 부를때 어떤 경로를 가지고
	// 있는지 포함해야된다
	ArrayList<Book> bList = new ArrayList<>();
	Scanner 키보드 = new Scanner(System.in);

	// 객체가 처음 생성할 떄 딱 한번 초기화해라
	public TotalService() {
		bList.add(new AniBook("원피스", "오다 에이이치로", "대원씨아이", 15));
		bList.add(new AniBook("진격의거인", "이사야마 하지메", "학산문화사", 19));
		bList.add(new CookBook("백종원의 요리비책", "백종원", "biz.book", true));
		bList.add(new CookBook("초보자를 위한 집밥", "김수미", "그린쿡", false));
		bList.add(new Book("자바의 정석", "남궁성", "도우출판"));
	}
	
	// 서비스클래스가 실제 처리할 코드들을 작성한다.

	// 1. 마이페이지 - 내 정보를 보여주기(화면)
	//	  고객들이 마이페이지 보여줘! 100명고객이 들어오면 100명다 
	//	  보여줘야된다. myInfo 함수를 만들어서 고객이 마이페이지 보여줘
	//	  부탁하면 myInfo함수를 재사용하면 된다.
	public void myInfo() {
		System.out.println("정보를 보여준다.");
	}
	
	// 2. 도서 전체 조회
	//    ArrayList 안에 있는 모든 책들을 화면에 보여주기
	public void selectAll() {
		// ArrayList에서 저장된 책들을 모두 출력하는 코드를 작성
		
		// 1. bList 하나씩 꺼내기
		System.out.println();
		// ArrayList에서 자동으로 하나씩 꺼내온다.
		for (Book b : bList) {

			// 2. bList에서 하나 꺼내온 객체 안에 각각의 내용 출력
			// Book 클래스야 다른 폴더라서 변수에 접근이 불가능하니
			// showBook함술르 이용해서 Book클래스 안에 변수들을 출력해 줄래?
			b.showBook();
		}
		System.out.println();
	}
	
	// 3. 도서 검색하기
	//    - 제목을 입력하면 제목이 포홤된 책만 모두 찾아서 보여주기
	public void searchBook() {
		
		// 1. 제목 입력받기
		System.out.println("책 제목을 입력:");
		String 책제목 = 키보드.nextLine();
		
		// 2. bList에서 하나씩 꺼내서 제목이 포함되어 있는지 확인하는 코드
		// 힌트 contains() 참고해서 작성해보기
		for(Book b : bList) {
			boolean 결과 = b.getTitle().contains(책제목);
			
			if(결과) {
				b.showBook();
			}
		}
		
		// 3. 찾으면 showBook()을 이용해서 출력하기
		//    없으면 아무것도 출력 안함
	}
	
}
