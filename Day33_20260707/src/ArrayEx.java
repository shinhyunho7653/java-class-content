import java.util.ArrayList;

public class ArrayEx {

	public static void main(String[] args) {
		
		// 배열
		// 장점 - 여러개의 데이터를 순서대로 저장하는 것
		// 단점 - 처음 한번 데이터를 저장하면 늘릴수도 없고 삭제도 못한다
		int[] nums = {10, 20, 30, 40, 50, 60};
		
		// 리스트
		// - 배열처럼 여러개의 데이터를 저장할 수 있다.
		// - 추가도 가능하고 삭제도 가능하다
		// ArrayList
		// - 미리 많이 만들지 말고 그때그때 필요한 만큼
		// new 새롭게 만들어라
		// ArrayList라는 타입을
		// new ArrayList<>(); = 자바스크립트 [] 와 똑같다
		// ArrayList<String> = 자바스크립트 let 과 똑같다
		// String 문자
		
		ArrayList<String> 리스트 = new ArrayList<>();
		
		// 리스트 사이즈 확인
		System.out.println("리스트 사이즈:" + 리스트.size());
		
		// 추가
		리스트.add("에리나");
		리스트.add("그레이스");
		리스트.add("알렉스");
		
		System.out.println("리스트 사이즈:" + 리스트.size());
		
		// 출력
		System.out.println(리스트);
		
		// 삭제
		리스트.remove("그레이스");
		System.out.println(리스트);
		
		// 데이터 찾기
		// indexOF() 공간의 번호를 찾아준다
		// 공간의 번호가 있으면 공간번호를 돌려주고
		// 공간의 번호를 못찾으면 -1 을 준다
		int 공간번호 = 리스트.indexOf("알렉스");
		System.out.println(공간번호);
		
		// ----------------------------------------------------------
		
		ArrayList<String> 장바구니 = new ArrayList<>();
		
		장바구니.add("사과");
		장바구니.add("바나나");
		장바구니.add("우유");
		
		System.out.println(장바구니);
		
		// ----------------------------------------------------------
		
		ArrayList<String> 캐릭터 = new ArrayList<>();

		캐릭터.add("짱구");
		캐릭터.add("훈이");
		캐릭터.add("철수");
		캐릭터.add("맹구");

		System.out.println(캐릭터);
		
		// 숫자 저장 - Integer 정수
		
		ArrayList<Integer> 숫자들 = new ArrayList<>();
		
		숫자들.add(1);
		숫자들.add(2);
		숫자들.add(3);
		숫자들.add(4);
		
		System.out.println(숫자들);
		
	}

}
