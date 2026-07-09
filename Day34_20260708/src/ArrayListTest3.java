import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {

	public static void main(String[] args) {
		
		Scanner 키보드 = new Scanner(System.in);
		
		ArrayList<String> 할일목록 = new ArrayList<>();
		
		while (true) {
			System.out.println("===== TODO 관리 =====");
			System.out.println("1. 할 일 추가");
			System.out.println("2. 할 일 목록 보기");
			System.out.println("3. 할 일 삭제");
			System.out.println("4. 종료");

			System.out.print("번호 입력 : ");
			int 메뉴선택 = 키보드.nextInt();
			System.out.println();

			if (메뉴선택 == 1) {
				System.out.println("===== 할일 추가 =====");
				System.out.println(" 1. HTML ");
				System.out.println(" 2. CSS ");
				System.out.println(" 3. JS ");
				System.out.println(" 4. REACT ");
				System.out.println(" 추가할 할 일 선택:");
				int 선택번호 = 키보드.nextInt();

				if (선택번호 == 1) {
					할일목록.add("HTMl");
				} else if (선택번호 == 2) {
					할일목록.add("CSS");
				} else if (선택번호 == 3) {
					할일목록.add("REACT");
				} else if (선택번호 == 4) {
					할일목록.add("JS");
				}
			} // if 메뉴선택 == 1
			
			if (메뉴선택 == 2) {
				System.out.println(할일목록);
			} // if 메뉴선택 == 2
			
			if (메뉴선택 == 3) {
				System.out.println(할일목록);
				System.out.println("삭제할 할 일:");
				int 삭제선택번호 = 키보드.nextInt();
				
				할일목록.remove(삭제선택번호);
			} // if 메뉴선택 == 3
			
			if (메뉴선택 == 4) {
				System.out.println("종료");
				break;
			} // if 메뉴선택 == 4
		} //while

	}

}
