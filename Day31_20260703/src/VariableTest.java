
public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바는 공간의 이름을 주는건 똑같다
		
		// 숫자 두가지
		// 소수점이 없는 숫자 = 정수 (Integer)
		int 숫자 = 10;
		
		System.out.println(숫자);
		
		// 소수점이 있는 숫자 = 실수
		double 숫자2 = 3.14;
		
		System.out.println(숫자2);
		
		// 문자 여러개
		String 이름 = "에리나";
		
		System.out.println(이름);
		
		// 문자 한개
		char 한개 = '*';
		
		System.out.println(한개);
		
		// 문제 4
		// 현재 수량 : 1
		// 변경된 수량 : 2
		
		int 수량 = 1;
		System.out.println("현재 수량 : " + 수량);
		
		수량 = 수량 + 1;
		System.out.println("변경된 수량 : " + 수량);
		
		// 공간의 이름을 지을때 
		// 색상이 변하는 검정색,파란색,자두색
		// 변수명으로 쓰지말기! (예약어 키워드)
		// 특수문자 전부 안된다! 공백허용 X
	 
		// ------------------------------------
		
		// 무조건 소문자 시작해야된다.
		// 단어 두개이상 되면 두번째 단어의 첫 글자는 
		// 대문자 (카멜표기법)
		// helloWorld
		// 숫자로 변수명을 시작하면 안된다.

	}

}
