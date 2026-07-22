package com.yonsai.interfacetest.service;

//삼성 휴대폰을 이용해서 무선이어폰을 연결 
//버즈,에어팟,소니 등등등등  어떤 무선 이어폰이든 음악재생,유튜브생성
//음성재생이 정상적으로 연결되서 되야된다.
interface 무선이어폰 {
	void 음악재생();
}

class 버즈 implements 무선이어폰 {

	@Override
	public void 음악재생() {
		System.out.println("버즈 연결을 할때 소프트웨어를 자동으로설치");
		System.out.println("자동으로 뮤직을 재생한다.");
	}
}

class 에어팟 implements 무선이어폰 {

	@Override
	public void 음악재생() {
		System.out.println("에어팟 연결을 할때 애플 소프트웨어를 자동으로설치");
		System.out.println("자동으로 테스트음악 재생한다.");
	}
}

class 소니이어폰 implements 무선이어폰 {

	@Override
	public void 음악재생() {
		System.out.println("소니이어폰 연결을 할때 소니 소프트웨어를 자동으로설치");
		System.out.println("자동으로 실행되지 재생 않는다.");
	}
}

class 삼성휴대폰 {

//어떤 이어폰이 연결되는 음악만 재생하면 된다. 
	public void 음악듣기(무선이어폰 이어폰) {
		이어폰.음악재생();
		System.out.println("이어폰 연결 완료!");
	}
}

public class InterfaceTest3 {

	// main연결해서 실행하기
	public void 실습() {
		System.out.println("실습 함수 실행됨!");
		
		// 실제 핸드폰 
		삼성휴대폰 서희 = new 삼성휴대폰();

		// 버즈 이어폰 
		버즈 버즈이어폰 = new 버즈();
	}

}
