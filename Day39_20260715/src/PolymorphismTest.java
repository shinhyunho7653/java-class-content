import java.util.ArrayList;

class 종합병원	{
	ArrayList<의사> 의사들;
}

class 의사 {
	String 이름;
	String 진료과;
	String 진료과목;
}

class 내과의사 extends 의사 {
	
}

class 외과의사 extends 의사 {
	
}

class 소아과의사 extends 의사 {
	
}

class 치과의사 extends 의사 {
	
}

public class PolymorphismTest {

	public static void main(String[] args) {
		
		// 다형성
		// - 같은 명령을 내려도 객체마다 다르게 동작하는것
		// - 서로 다른 자식들을 부모라는 이름의 공통상자
		//   하나에 몽땅 집어넣고 한꺼번에 다루는것!
		
		// 하나의 타입으로 여러개 자식을 저장할 수 있다
		// 
		
	}

}
