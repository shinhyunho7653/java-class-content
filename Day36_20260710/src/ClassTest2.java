
// 클래스
class 내가원하는타입 {
	int a;
	double b;
	String c;
	char d;
}

//상품의 정보를 하나로 묶었다.
//다른 타입들끼리 변수를 묶었다.
class 상품 {

	String 이름;
	int 가격;
	int 재고;
}

class 게임캐릭터 {
	String 이름;
	int 체력;
	int 공격력;
}

public class ClassTest2 {

	public static void main(String[] args) {
//여러개의 데이터를 저장할 때 사용
//배열 
//배열의 단점은 같은 타입만 저장 가능하다. 
		int[] 배열1 = { 10, 20, 30 };
		double[] 배열2 = { 1.1, 2.2, 3.3 };

		String[] 상품명 = { "사과", "바나나", "포도" };
		int[] 가격 = { 1000, 2000, 3000 };
		int[] 재고 = { 10, 5, 20 };

//게임 캐릭터 
		String[] 이름 = { "전사", "궁수", "마법사" };
		int[] 체력 = { 500, 300, 200 };
		int[] 공격력 = { 80, 60, 100 };

//나는 각각 다른타입들도 여러개 저장하고 싶다.
//클래스는 다르다!

	}

}
