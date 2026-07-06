package loop;

public class LoopTest {

	public static void main(String[] args) {
		
		// package?
		// - 자바에서 관련있는 파일들을 하나의 폴더(디렉토리)단위로
		//   묶어서 관리하는 것
		// - 패키지 문장은 파일 가장 윗쪽에 있어야 된다
		
		// 컴파일(Compile)
		// - 내가 작성한 파일을 컴퓨터가 알아들을 수 있는 0, 1로 번역
		
		// 도메인(Domain)
		// naver.com, google.com
		// package 구조를 이용해서 실제 도메인을 만든다
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		// 1~10까지 출력하는 for문
		
		for(int num = 1; num <= 10; ++num) {
			System.out.println(num);
		}
		
		// 1~100까지 출력하는 for문
		
		for(int num2 = 1; num2 <= 100; ++num2) {
			System.out.println(num2);
		}
		
		// 1~10까지 짝수만 출력하는 for문
		
		for(int num3 = 2; num3 <= 10; num3 += 2) {
				System.out.println(num3);
		}

	}

}
