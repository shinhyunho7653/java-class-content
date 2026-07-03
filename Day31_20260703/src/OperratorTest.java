
public class OperratorTest {

	public static void main(String[] args) {
		
		// 조건 ? true/false 실행
		// 삼향연산자
		// 조건에 따라 두 가지 결과 중 하나를 선택하는 연산자
		// 조건이 맞으면 앞에 있는 값,
		// 조건이 맞지 않으면 뒤에 있는 값을 보여준다
		// 비교했을 때 true, false 결과를 주는 기호들
		
		System.out.println(10 >= 5 ? "맞음" : "틀림");
		
		// 택배 무료베송 확인
		int 내가구매한금액 = 80000;
		
		// 무료 배송의 기준은 10000원 이상 구매
		
		System.out.println(내가구매한금액 >= 10000 ? "무료배송" : "배송비 3000원");
		
		// 코드를 자동으로 정령하는 단축키
		// 1. 전체 선택 ctrl + a
		// 2. ctrl + shift + f
		
		
		
		System.out.println(); // 값을 쓰지 않으면 줄바꿈처럼 사용 가능
		
		// 값을 무조건 1씩만 증가하거나 감소하는 연산자(기호)
		int 숫자 = 10;
		
		System.out.println("초기값 : " + 숫자);
		System.out.println("1증가하기 : " + (++숫자));
		
		int 숫자2 = 10;
		
		System.out.println("초기값 : " + 숫자2);
		System.out.println("1감소하기 : " + (--숫자2));
		
		// F11 - 디버그모드
		// 	   - 프로그램이 어떻게 실행되는지 한 줄씩 확인하는 기능

	}

}
