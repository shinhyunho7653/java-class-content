import java.util.Scanner;

public class Cafe {
	
	static Scanner 키보드 = new Scanner(System.in);
	
	static int 총금액 = 0;
	
	public static void 메뉴() {
		System.out.println("Choose 1");
		System.out.println("1. Americano");
		System.out.println("2. Cafe mocha");
		System.out.println("3. Cafe Latte");
		System.out.println("4. Green Tea Latte");
		System.out.print(" : ");
		
		int 메뉴선택 = 키보드.nextInt();
		
		System.out.println();

		if (메뉴선택 == 1) {
			총금액 += 3900;
		} else if (메뉴선택 == 2) {
			총금액 += 4500;
		} else if (메뉴선택 == 3) {
			총금액 += 5000;
		} else if (메뉴선택 == 4) {
			총금액 += 5500;
		}
	}
	
	public static void 사이즈() {
		System.out.println("Choose size");
		System.out.println("1. G(grande)");
		System.out.println("2. R(regular");
		System.out.println("3. S(short)");
		System.out.print(" : ");
		
		int 사이즈선택 = 키보드.nextInt();

		System.out.println();

		if (사이즈선택 == 1) {
			총금액 += 1000;
		} else if (사이즈선택 == 2) {
			총금액 += 500;
		} else if (사이즈선택 == 3) {
			총금액 += 0;
		}
	}
	
	public static void 계산() {
		System.out.println("총 금액은 " + 총금액 + " 원 입니다.");
	}

	public static void main(String[] args) {
		
		System.out.println("- Welcome to Harry Cafe -");
		System.out.println();
		
		메뉴();
		사이즈();
		계산();

	}

}
