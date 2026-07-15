
class 부모 {
	private int 자산;
	
	부모(int 빌려주는돈){
		System.out.println("빌려주는돈 : " + 빌려주는돈);
	}
}

class 자녀 extends 부모 {
	자녀(){
		super(100);
	}
}

class 계좌 {
	private int 잔액;
	
	계좌(int 전달받은입금액) {
		this.잔액 = 전달받은입금액;
	}
}

class 카카오계좌 extends 계좌 {
	카카오계좌() {
		super(10000);
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		
		

	}

}
