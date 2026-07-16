package com.yonsei.project;

import java.util.Scanner;

import com.yonsei.project.service.TotalService;

public class Main {

	public static void main(String[] args) {
		
		// public - 누구나 전체공개
		// 기본폴더에서는 파일경로를 제대로 못잡아서 에러를 유발한다
		// 프로그램의 시작점은 항상 Main 클래스 안에 main 함수다
		
		// 키보드 만들고 입력 받아오기
		Scanner 키보드 = new Scanner(System.in);
		
		// 프로그램이 시작할떄 딱 한번 TotalService객체를 생성하면
		// 프로그램이 꺼질 떄까지는 계속 사용할 수 있다
		TotalService service = new TotalService();
		
		// 코드 정렬 - 실무에서 한 몫한다
		while (true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			int menu = 키보드.nextInt();

			if (menu == 1) {
				// TotalService 클래스 안에 myInfo()를 부른다
				service.myInfo();
			} else if (menu == 2) {
				// TotalService 클래스 안에 selectAll()을 부른다
				service.selectAll();
			} else if (menu == 3) {
				service.searchBook();
			} else if (menu == 4) {
			} else if (menu == 9) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
