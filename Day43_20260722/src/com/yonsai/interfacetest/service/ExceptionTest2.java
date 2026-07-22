package com.yonsai.interfacetest.service;

import java.util.Scanner;

public class ExceptionTest2 {
	
	Scanner 키보드 = new Scanner(System.in);
	
	public void 예제1() {
		
		// 나이 계산
		String 나이 = "abc";
		
		// if를 쓴 이유
		// 나이변수에 값이 비었는지(isEmpty)는 실행전에 눈으로 바로 확인이 가능한 조건
		if(나이.isEmpty()) {
			System.out.println("값을 입력하세요");
			return;
		}
		
		try {
			int 숫자나이 = Integer.parseInt(나이);
			System.out.println("나이: " + 숫자나이);

		} catch (Exception e) {
			System.out.println("어떤 예외든 모두 처리하겠다");
		}
	}

}
