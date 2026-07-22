package com.yonsai.interfacetest.service;

//무조건 지켜야되는 규칙!
//오버라이딩을 무조건 해야되는 규칙을 만들 때는 {}로를 생략한다.
//인터페이스를 가져가는 클래스가 무조건 오버라이딩해서 쓸 수있게!
interface 규칙 {
	void 전진();
	void 후진();
	void 브레이크();
	void 주차();
}

// implements - 반드시 지켜야되는 규칙

class A자동차 implements 규칙 {

	@Override
	public void 전진() {
		
	}

	@Override
	public void 후진() {
		
	}

	@Override
	public void 브레이크() {
		
	}

	@Override
	public void 주차() {
		
	}
}

class B자동차 implements 규칙 {

	@Override
	public void 전진() {
		
	}

	@Override
	public void 후진() {
		
	}

	@Override
	public void 브레이크() {
		
	}

	@Override
	public void 주차() {
		
	}
}

// 회사 시준 전직원이 무조건 지켜야되는 규칙
interface 직원규칙 {
	void 출근하기();
	void 퇴근하기();
}

class 개발자 implements 직원규칙 {

	@Override
	public void 출근하기() {
		
	}

	@Override
	public void 퇴근하기() {
		
	}
}

interface 캐릭터 {
	void 공격하기();
	void 이동하기();
}

class 전사 implements 캐릭터 {

	@Override
	public void 공격하기() {
		System.out.println("칼 공격");
	}

	@Override
	public void 이동하기() {
		System.out.println("달려간다");
	}
	
}

public class InterfaceTest {
	
	public void 테스트1() {
		
		// main이 없기 때문에 InterfaceTest 파일이 실행되지 않는다!
		// main을 각각 만들면 프로젝트를 실행했을 때 어디서 부터 시작을
		// 해야되는지 헷갈린다. 무조건 main은 하나만 있어야된다.
		
		System.out.println("테스트 1번");
		
		// 인터페이스
		// - 클래스가 반드시 구현해야될 함수 목록
		// - 약속!
		// - 규칙!
		// - 개발자들끼리 약속! 무엇을 해야하는지 규칙!
		// 상속과 인터페이스의 차이는 딱 하나!
		// 상속은 부모한테 받은 내용을 오버라이드 해도 되고 안해도 된다.
		// 부모 내용을 변경안하고 쓰고 싶으면 그냥 써도 된다.
		// 자식 내용에 맞게 변경하고 싶다 재정의
		
	}

}
