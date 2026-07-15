
class 로그인 {
	String 아이디;
	
	void 로그인처리() {
		System.out.println("로그인을 처리합니다.");
	}
}

class 이메일로그인 extends 로그인 {
	이메일로그인(String 이름){
		아이디 = 이름;
	}
	void 로그인처리() {
		System.out.println(아이디 + " 님, 이메일과 비밀번호를 확인합니다.");
	}
}

class 카카오로그인 extends 로그인 {
	카카오로그인(String 이름){
		아이디 = 이름;
	}
	void 로그인처리() {
		System.out.println(아이디 + " 님, 카카오톡 인증을 요청합니다.");
	}
}

class 지문로그인 extends 로그인 {
	지문로그인(String 이름){
		아이디 = 이름;
	}
	void 로그인처리() {
		System.out.println(아이디 + " 님, 지문 인식을 시작합니다.");
	}
}

public class Override실습 {

	public static void main(String[] args) {
		
		로그인 방법 = new 로그인();
		이메일로그인 방법1 = new 이메일로그인("minsu01");
		카카오로그인 방법2 = new 카카오로그인("minsu01");
		지문로그인 방법3 = new 지문로그인("minsu01");
		
		방법.로그인처리();
		방법1.로그인처리();
		방법2.로그인처리();
		방법3.로그인처리();

	}

}
