package StringTest;

public class StringTest {

	public static void main(String[] args) {
		
		// String 타입
		// - 문자 여러개로 이어진 타입이다(문자열)
		
		String name = "홍길돌";
		String message = "안녕하세요";
		
		// 길이 확인 length()
		System.out.println(message.length());
		
		// 문자를 자르는 함수
		String prog = "HTML CSS JAVASCRIPT JAVA REACT";
		
		// 실무에서 개인정보를 보여줄 떄 많이 사용한다
		// 1. HTML CSS 만 출력
		String text = prog.substring(0, 8);
		System.out.println(text);
		
		// 2. URL 뒤에 주소 확인
		String url = "https://naver.com/blog";
		// 뒤에 들어오는 url을 확인해서 /blog 확인해서 
		// 필요한 정보들을 각각 가져갈 수있도록 처리할 때 
		// substring(시작번호);
		// 시작번호 부터 끝까지 알아서 다 짜른다.
		String text2 = url.substring(17);
		System.out.println(text2);

		// 3. 파일 확장자 
		// .jpg .png .gif 
		String fileName = "photo.jpg";
		
		String text3 = fileName.substring(6);
		System.out.println(text3);
		
		// 4. 이메일에서 아이디만 뽑기 
		String email = "eryna.fairway@gmail.com";

		// 5. 문자 여러개 안에서 특정 문자를 찾는 기능!
		// indexOf(문자)
		// - 문자가 몇 번째 위치에 있는지 찾는 기능!
		// - 공간의 번호를 반환한다.
		int 공간번호 = email.indexOf("@");
		System.out.println(공간번호);
		String text4 = email.substring(0, 공간번호);
		System.out.println(text4);
		
		// 자바스크립트
		// 문자끼리 비교를 할 때는 "ABC" == "ABC" 됨
		// 자바는 안된다!
		// 문자끼리 비교할 때는 비교하는 기능!
		// 문자변수.equals("비교할문자");
		//  결과를 true , false 
		//  문자를 비교했을 때 같으면 true, 틀리면 false
		String name2 = "에리나";
		String name3 = "에리나";

		boolean result = name2.equals(name3);
		System.out.println(result);

		// 실무에서 사용하는 비교 
		// 1. 아이디 중복확인 
		String id = "qwer";
		String 회원가입시id = "qwer";

		if(id.equals(회원가입시id)) {
			System.out.println("아이디가 있습니다");
		}else {
			System.out.println("아이디 또는 비밀번호 확인");
		}
		
		// -----------------------------------------------------
		
		String userEmail = "student99@naver.com";

		int 골뱅이위치 = userEmail.indexOf("@");
		String text6 = userEmail.substring(골뱅이위치 +1);

		System.out.println(text6);

		if(text6.equals("naver.com")) {
		System.out.println("가입 가능한 이메일입니다.");
		}else {
		System.out.println("네이버 이메일만 가입 가능합니다.");
		}
		
		// -----------------------------------------------------
		
		String postUrl = "board.com/view?id=1024";

		int 위치 = postUrl.indexOf("=");
		String text7 = postUrl.substring(위치 +1);

		System.out.println(text7);

		if(text7.equals("1024")) {
		System.out.println("해당 게시글입니다.");
		}else {
		System.out.println("게시글을 찾을 수 없습니다");
		}

	}

}
