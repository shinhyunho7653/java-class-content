package com.yonsai.interfacetest.service;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

interface 아빠 {
	void 인사();
}

interface 엄마 {
	void 인사();
}

class 나 implements 아빠, 엄마 {

// 상속해서 물려받는게 아니라 그냥 규칙만 
// 가져오는것!
// 인터페이스는 규칙만 가져온다.
// 아빠 인사(), 엄마 인사() 인사라는 함수를 
// 오버라이딩 무조건 해야되! 규칙!
// 이 함수를 반드시 만들어!규칙 전달!
	@Override
	public void 인사() {
		System.out.println("안녕하세요!");
	}
}

// 결제 부분을 인터페이스로 개선
// 규칙: 모든 결제 수단은 "결제하기(금액)"를 반드시 가지고 있어야된다.

interface 결제수단 {
	void 결제하기(int 금액);
}

// implement (구현)
// - 내용을 만든다.
//   결제수단 규칙을 가져가서 내용을 만들어라!
// - 다형성 클래스도 상속하든 인터페이스로 규칙을 가져오던
//   하나의 타입으로 여러개의 타입을 저장할 수있다.
class 카카오결제 implements 결제수단 {
	@Override
	public void 결제하기(int 금액) {
		System.out.println("카카오 결제" + 금액);
	}
}

class 애플페이 implements 결제수단 {

	@Override
	public void 결제하기(int 금액) {
		System.out.println("애플페이 결제" + 금액);
	}
}

// 토스페이 추가
class 토스페이 implements 결제수단 {

	@Override
	public void 결제하기(int 금액) {
		System.out.println("토스페이 결제" + 금액);
	}
}

// 새 결제 수단이 추가돼도 이 클래스는 절대 안 바뀐다.
class 주문처리 {
	public void 주문하기(결제수단 방법, int 금액) {
		방법.결제하기(금액);
		System.out.println("주문이 완료! 대기시간 30분");
	}
}

public class InterfaceTest2 {

	public void 주문화면() {

		// 웹(UI) 화면
		JFrame 결제창 = new JFrame();

		// 화면 설정
		결제창.setSize(350, 250);

		// 화면배치를 flex처럼 가로정렬
		결제창.setLayout(new FlowLayout());

		// 내용추가
		JLabel 결제안내 = new JLabel("결제 방법을 선택하세요");
		JRadioButton kakao = new JRadioButton("카카오페이");
		JRadioButton apple = new JRadioButton("애플페이");
		JRadioButton toss = new JRadioButton("토스페이");

		// 하나만 선택 가능
		ButtonGroup group = new ButtonGroup();

		group.add(kakao);
		group.add(apple);
		group.add(toss);

		// 결제하기 버튼
		JButton btn = new JButton("결제하기");
		
		// 결제하기 버튼을 클릭했을때 이벤트 실행
		btn.addActionListener(e->{
			결제수단 선택한결제수단 = null;
			
			// 라디오버튼에서 체크가 되었는지 안됬는지 확인
			System.out.println(kakao.isSelected());
			System.out.println(apple.isSelected());
			System.out.println(toss.isSelected());
		});
		
		// 결제창에 내가 만든 라벨, 버튼, 라디오버튼 추가
		결제창.add(결제안내);
		결제창.add(kakao);
		결제창.add(apple);
		결제창.add(toss);
		결제창.add(btn);
		
		결제창.setDefaultCloseOperation(3);
		결제창.setVisible(true);
		
	}

	// 클래스는 다중(여러클래스) 상속 못한다.
	public void 테스트2() {
		주문처리 주문 = new 주문처리();
		주문.주문하기(new 카카오결제(), 10000);
		주문.주문하기(new 애플페이(), 20000);
		주문.주문하기(new 토스페이(), 25000);

		// 인터페이스도 클래스도 규칙을 가져오던(함수이름만)
		// 클래스는 변수랑 함수를 물려받는다.
		결제수단 첫번째수단 = new 카카오결제();
		결제수단 두번째수단 = new 애플페이();
	}

}
