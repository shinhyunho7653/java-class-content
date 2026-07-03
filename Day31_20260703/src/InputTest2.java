import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		
		// 1. 키보드 생성
		Scanner a = new Scanner(System.in);
		
		// 2. 숫자 입력
		System.out.println("나이 :");
		int 나이 = a.nextInt();
		
		// 3. 처리
		if (나이 >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("청소년");
		}

	}

}
