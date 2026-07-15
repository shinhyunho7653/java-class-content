
class 부모 {
	int 나이;
	
	void 먹는다() {
		System.out.println("먹는다");
	}
}

class 자식 extends 부모 {
	@Override
	void 먹는다() {
		System.out.println("자식이 먹는다");
	}
}

public class MethodOverrideTest5 {

	public static void main(String[] args) {
		
		// Override
		// - 덮어쓰다
		자식 첫번째 = new 자식();
		첫번째.먹는다();

	}

}
