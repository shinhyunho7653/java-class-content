package com.yonsai.project;

import com.yonsai.project.service.DogService;
//import com.yonsai.project.service.MapTest;
import com.yonsai.project.service.MapTest2;
import com.yonsai.project.service.Test;

// java 패키지명 관례는 회사/조직의 도메인 주소를 거꾸로 뒤집어서 짓는다.
// - 이름 충돌 방지 
// - 소유권/출처 구분 (어느 조직이 만든 코드인지 명확)
// - 도메인
// 사람이 외우기 쉽게 만든 인터넷 주소
// - 자바에서 기본 폴더(default package) 경로 설정을 못잡는다.
// 다른 폴더에서 파일을 가져가서 객체 생성이 불가능하다
// 다른 import 안된다! 
// 프로젝트가 커지면 클래스가 수백 개인데 전부 폴더 구분없이
// 한곳에 몰리면 관리 불가!(협업불가)

public class Main {

	public static void main(String[] args) {
		
		DogService test3 = new DogService();
		
		test3.강아지입양테스트();
		
//		Test map실습 = new Test();
//		
//		map실습.실습1();
		
//		MapTest2 test2 = new MapTest2();
//		
//		test2.테스트();
		
//		MapTest map = new MapTest();
//		
//		map.mapEx();
//		
//		// mapTest안에 회원정보조회해!
//		map.회원정보조회();

	}

}
