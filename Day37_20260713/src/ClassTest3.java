
class A{
	int num;
}

class B{
	int num2;
	
	B(int 원하는값){
		num2 = 원하는값;
	}
}

public class ClassTest3 {

	public static void main(String[] args) {
		
		//생성자!
		A a1 = new A();
		System.out.println(a1.num);

		// 10으로 값을 변경 
		a1.num = 10;
		System.out.println(a1.num);

		// A객체를 만들때 자동으로 원하는 값을 저장!
		
		// B객체 만들기
		B t1 = new B(1000);
		B t2 = new B(-100);
		
		System.out.println("t1 : " + t1.num2);
		System.out.println("t2 : " + t2.num2);

	}

}

/*
 
class 환자 {
	String 이름;
	int 나이;
	double 몸무게;
	double 키;
	double 체온;
	String 증상;
	String[] 처방전;
}

public class ClassTest3 {
	
	public static 환자 환자만들기(
			String 이름, 
			int 나이, 
			double 몸무게, 
			double 키, 
			double 체온, 
			String 증상) {
		환자 새환자 = new 환자();
		새환자.이름 = 이름;
		새환자.나이 = 나이;
		새환자.몸무게 = 몸무게;
		새환자.키 = 키;
		새환자.체온 = 체온;
		새환자.증상 = 증상;

		return 새환자;
	}

	public static void main(String[] args) {
		
		환자 첫번째 = 환자만들기("홍길동", 20, 60.5, 176.5, 37.5, "머리가 아프고 으슬으슬추워요");
		환자 두번째 = 환자만들기("김민수", 35, 72.3, 178.0, 38.2, "배가 아프고 소화가 안돼요");
		환자 세번째 = 환자만들기("이영희", 28, 55.0, 162.5, 39.1, "열이 나고 목이 아파요");

		System.out.println("1. " + 첫번째.이름);
		System.out.println("2. " + 두번째.이름);
		System.out.println("3. " + 세번째.이름);
		
//		환자 첫번째 = new 환자();
//		첫번째.이름 = "홍길동";
//		첫번째.나이 = 20;
//		첫번째.몸무게 = 60.5;
//		첫번째.키 = 176.5;
//		첫번째.체온 = 37.5;
//		첫번째.증상 = "머리가 아프고 으슬으슬추워요";
//
//		환자 두번째 = new 환자();
//		두번째.이름 = "김민수";
//		두번째.나이 = 35;
//		두번째.몸무게 = 72.3;
//		두번째.키 = 178.0;
//		두번째.체온 = 38.2;
//		두번째.증상 = "배가 아프고 소화가 안돼요";
//
//		환자 세번째 = new 환자();
//		세번째.이름 = "이영희";
//		세번째.나이 = 28;
//		세번째.몸무게 = 55.0;
//		세번째.키 = 162.5;
//		세번째.체온 = 39.1;
//		세번째.증상 = "열이 나고 목이 아파요";

	}

}
 */

