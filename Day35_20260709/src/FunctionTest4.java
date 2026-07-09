import java.util.ArrayList;

public class FunctionTest4 {

	// ArrayList로 여러명을 저장하는 배열 만들면 되자나요!
	//  단점 각각의 사람들이 이름이 어떤 공간에 저장되었는지 내가 
	//  알고 있어야된다. 
	//  String 문자만 저장을 하니깐 계좌번호를 저장하는 배열을 또 만들어야된다.
	static ArrayList<String> 사람들계좌이름 = new ArrayList<>();
	static ArrayList<String> 사람들계좌 = new ArrayList<>();
	static ArrayList<String> 사람들비밀번호 = new ArrayList<>();
	static ArrayList<String> 사람들핸드폰번호 = new ArrayList<>();

	static int 서희잔액 = 100000;
	static int 철수잔액 = 0;

	public static void 출금(int 인출금액, String 계좌주인) {
		if (계좌주인.equals("서희")) {
			서희잔액 -= 인출금액;
		} else if (계좌주인.equals("철수")) {
			철수잔액 -= 인출금액;
		}
	}

	public static void 입금(int 입금금액, String 계좌주인) {
		서희잔액 += 입금금액;
	}

	public static void 계좌이체(int 계좌이체금액, String 상대방계좌번호, String 계좌주인) {
		// 상대방은 금액이 플러스!
		// 나는 잔액에 마이너스!
	}

	public static void main(String[] args) {
		// static의 한계!
		// 은행 계좌 출금!
		// 서희의 계좌에서 출금도 하고 입금도 하고 계좌이체도 보낼것!
		// 철수도 입금을 하고 , 출금, 계좌이체도 하고싶다.
		// 사람이 많아지면 함수안에 코드들이 길어져요! static변수도 많아져요!
		// 동명이인 처리?
		// 입금(500000);
		// 출금(20000);

	}
}