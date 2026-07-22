package com.yonsai.interfacetest.service;

public class ExceptionTest {

	public void 예외처리3() {
		System.out.println();
		System.out.println("프로그램 실행한다!");

		try {
			int[] nums = { 10, 20, 30 };
			System.out.println(nums[4]);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("데이터가 없습니다.");
		}

		System.out.println("정상실행");
	}

	public void 예외처리2() {

		System.out.println("프로그램 실행한다!");
		try {
// 에러가 발생할 수있는 문장들
// try 안에서 예외가 발생할 수있는 코드들
			int result = 10 / 0;
			System.out.println(result);

		} catch (ArithmeticException e) {
// 수학적 계산이 에러가 발생했을때 처리하는 
// 문장이다!
// catch(어떤 예외종류인지)
// try에서 에러가 발생하면 처리하는 
// 문장들;
			System.out.println("0으로 나눌수없다 다시 입력하세요!");
		}
		System.out.println("정상실행");

	}

	public void 예외처리() {
		System.out.println("예외처리란?");

// 예외처리(Exception)
//  -프로그램을 실행하다가 예상하지 못한 문제를
//   해결하는 것!
//  - 비정상적인 종료를 막기위해서!
//  - 문제가 생겼을 때 프로그램이 죽지 않게 
//    하는 기술

// 정상실행이라는거는 코드가 4줄이면 4줄이
// 모두 실행되야된다. 이게 정상실행!

		System.out.println("프로그램 실행한다!");

// 프로그램이 그냥 죽어버린것! 그래서 아래 실행이
// 안된다.
		int result = 10 / 2;
		System.out.println(result);

		System.out.println("정상실행");

		int[] arr = { 1, 2, 3 };

// 자바가 어 문법맞네? 
// 틀린 문장 없고 배열명도 맞고 공간의 번호도 
// 숫자 맞네? 어 그럼 틀린거 없어 실행가능!
// 컴파일(내가 작성한 코드를 컴퓨터 이해하는 0,1로
//      바꾸는 작업 문법적)
		System.out.println(arr[5]);

// 프로그램이 실행(런타임)하고 나서 arr[5]접근해서 
// 데이터가 가지고 올래!하는 순간 배열의 5번방은
// 존재하지 않습니다.
// 문법은 맞지만 실행중에 터지는 문제들!

	}
}