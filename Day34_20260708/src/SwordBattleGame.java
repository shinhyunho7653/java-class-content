import java.util.ArrayList;
import java.util.Scanner;

public class SwordBattleGame {

	public static void main(String[] args) {

		Scanner 키보드 = new Scanner(System.in);

		ArrayList<String> 가방 = new ArrayList<>();
		가방.add("검");

		ArrayList<String> 물리친몬스터목록 = new ArrayList<>();

		while (true) {
			System.out.println("====== 용사의 모험 ======");
			System.out.println("내 가방: " + 가방);
			System.out.println("1. 몬스터와 싸우기");
			System.out.println("2. 가방 보기");
			System.out.println("3. 종료");
			System.out.print("번호 입력 : ");
			int 메뉴선택 = 키보드.nextInt();

			if (메뉴선택 == 1) {
				System.out.println(" 1. 슬라임 ");
				System.out.println(" 2. 고블린 ");
				System.out.println(" 3. 드래곤 ");
				System.out.print("물리칠 몬스터 번호를 선택: ");
				int 몬스터선택 = 키보드.nextInt();

				String 몬스터이름 = "";

				if (몬스터선택 == 1) {
					몬스터이름 = "슬라임";
				} else if (몬스터선택 == 2) {
					몬스터이름 = "고블린";
				} else if (몬스터선택 == 3) {
					몬스터이름 = "드래곤";
				}

				// 가방 안에 "검"이 있는지 직접 하나씩 비교해서 확인
				boolean 검있음 = false;

				for (String 아이템 : 가방) {
					if (아이템.equals("검")) {
						검있음 = true;
					}
				}

				if (검있음) {
					System.out.println("검으로 " + 몬스터이름 + "을(를) 물리쳤습니다!");
					물리친몬스터목록.add(몬스터이름);
				} else {
					System.out.println("무기가 없어서 싸울 수 없습니다!");
				}

			} else if (메뉴선택 == 2) {
				System.out.println("--- 내 가방 ---");
				System.out.println(가방);
				System.out.println("--- 물리친 몬스터 ---");
				System.out.println(물리친몬스터목록);

			} else if (메뉴선택 == 3) {
				System.out.println("모험을 종료합니다.");
				break;
			}
		}
	}
}