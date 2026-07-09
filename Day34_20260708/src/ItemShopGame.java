import java.util.ArrayList;
import java.util.Scanner;

public class ItemShopGame {

	public static void main(String[] args) {

		// 게임에서 아이템을 구매하는 프로그램
		// - 실무에서는 결제 가능 여부 확인 로직
		// - 결제 시스템, 재고 관리, 장바구니의 시스템 축소판

		Scanner 키보드 = new Scanner(System.in);

		// 구매한 아이템들을 담는 가방
		ArrayList<String> 가방 = new ArrayList<>();

		// 내가 가진 돈 (소지금)
		int 소지금 = 100;

		// 상점창이 닫히지 않도록 계속 코드를 실행한다
		while (true) {
			System.out.println("====== 용사의 상점 ======");
			System.out.println("소지금: " + 소지금 + "원");
			System.out.println("1. 아이템 구매하기");
			System.out.println("2. 내 가방 보기");
			System.out.println("3. 종료");
			System.out.print("번호 입력:");
			int 메뉴선택 = 키보드.nextInt();

			if (메뉴선택 == 1) {
				System.out.println("--- 아이템 상점 ---");
				System.out.println(" 1. 검 (30원) ");
				System.out.println(" 2. 방패 (25원) ");
				System.out.println(" 3. 물약 (10원) ");
				System.out.println(" 4. 갑옷 (50원) ");
				System.out.print("구매할 아이템 번호를 선택: ");

				// 1. 구매할 아이템 번호를 입력받는다.
				int 구매아이템 = 키보드.nextInt();
				// 2. 소지금에서 검을 살수있는지 비교한다
				String 아이템이름 = "";
				int 가격 = 0;

				if (구매아이템 == 1) {
					아이템이름 = "검";
					가격 = 30;
				} else if (구매아이템 == 2) {
					아이템이름 = "방패";
					가격 = 25;
				} else if (구매아이템 == 3) {
					아이템이름 = "물약";
					가격 = 10;
				}
				// 3. 구매가능합니다. 출력 가방에 담기(add)
				// 소지금이 부족하면 구매 불가합니다.
				if (소지금 >= 가격) {
					소지금 = 소지금 - 가격; // 잔액
					가방.add(아이템이름);
					System.out.println(아이템이름 + "구매완료!");
				} else {
					System.out.println("돈이 부족합니다! 현재 소지금: " + 소지금 + "원");

				}

			} else if (메뉴선택 == 2) {

			} else if (메뉴선택 == 3) {
				System.out.println("상점 닫음");
				break;
			}

		} // while

	}

}
