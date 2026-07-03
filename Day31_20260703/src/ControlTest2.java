
public class ControlTest2 {

	public static void main(String[] args) {
		
		/*
		 * 여러 줄을 메모할 수 있다
		 * 
		 * 문제 1. 쇼핑몰 할인 쇼핑몰에서 구매금액에 따라 
		 * 할인율이 달라집니다. 조건은 다음과 같습니다.
		 * 
		 * 100000원 이상 → 20% 할인 50000원 이상 → 
		 * 10% 할인 30000원 이상 → 5% 할인 그 외 → 할인 없음
		 * 
		 * 구매금액이 70000원일 때 결과를 출력하세요. 출력 결과
		 * 
		 * 10% 할인
		 */
		int 구매금액 = 70000;
		
		if(구매금액 >= 100000) {
			System.out.println("20% 할인");
		}else if(구매금액 >= 50000) {
			System.out.println("10% 할인");
		}else if(구매금액 >= 30000) {
			System.out.println("5% 할인");
		}else {
			System.out.println("할인 없음");
		}
		
		
		
		/*
		 * 문제 2. 택배 배송 상태 배송단계 숫자에 따라 상태를 출력하세요.
		 * 
		 * 1 → 상품 준비중 2 → 배송중 3 → 배송 완료 그 외 → 주문 정보 없음
		 * 
		 * 배송단계가 2일 때 결과를 출력하세요. 출력 결과
		 * 
		 * 배송중
		 */
		int 배송단계 = 2;
		
		if(배송단계 == 3) {
			System.out.println("배송 완료");
		}else if(배송단계 == 2) {
			System.out.println("배송중");
		}else if(배송단계 == 1) {
			System.out.println("상품 준비중");
		}else {
			System.out.println("주문 정보 없음");
		}

	}

}
