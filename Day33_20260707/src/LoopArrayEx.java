import java.util.Scanner;

public class LoopArrayEx {

	public static void main(String[] args) {
		
		String[] cust = {
			"얼음공주","집에가고싶다","1234","까칠한민수",
			"눈뜨니 회사네","여왕님"
		};
		
		// while을 이용해서 현재 주문이 들어온 고객들의 닉네임을
		// 가지고 와서 메뉴 나왔습니다. 출력
		int 공간번호 = 0;
		
		while(공간번호 < 6) {
			System.out.println(cust[공간번호++]);
//			공간번호 += 1;
		}
		
		// 쇼핑몰에서 현재 멤버들한테 15% 할인쿠폰이 도착했습니다.
		// 출력
		String[] members = { "김철수", "이영희", "박민수", "최지은", "홍길동" };
		
		int 번호 = 0;
		while(번호 < members.length) {
			System.out.println(members[번호] + "15% 할인쿠폰이 도착했습니다");
			번호 += 1;
		}
		
		// 회원가입할 떄 아이디 중복검사하는 로직
		
		Scanner 키보드 = new Scanner(System.in);
		// 1. 기존 아이디
		String[] 기존아이디 = {"apple", "banana", "cherry"};
		
		// 2. 사용자로부터 키보드로 입력받기
		String 새로가입하는아이디 = "";
		
		// 3. 혹시 새로가입하는 아이디 값이 기존 아이디 배열에 있다면
		//    아이디 중복입니다
		//    없으면 사용가능한 아이디입니다.

	}

}
