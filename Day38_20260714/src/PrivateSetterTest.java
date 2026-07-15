
class 카카오계좌 {
	
	// 계좌를 만들면 기본적으로 잔액은 0원
	private int 잔액;
	
	// 입금
	void set입금(int 이체할금액) {
		this.잔액 += 이체할금액;
		System.out.println("현재 잔액 : " + this.잔액);
	}
	
	// 출금
	// 숨겨진 변수에서 안전하게 값을 꺼내겠다
	int get출금(int 출금금액) {
		잔액 -= 출금금액;
		return 출금금액;
	}
}

public class PrivateSetterTest {

	public static void main(String[] args) {
		
		// 카카오계좌에 월급받은 금액 이체
		
		카카오계좌 나 = new 카카오계좌();
		
		나.set입금(10000);
		나.set입금(100000);
		나.set입금(1000000);
		
		int 지갑 = 나.get출금(200000);
		System.out.println("내 지갑 : " + 지갑);

	}

}
