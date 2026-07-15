
class 포켓몬 {
	int no;
	String 이름;
	String 타입;
	String 싸움특성;
	double 몸무게;
}

class 꼬부기 extends 포켓몬 {
	
}

class 피카츄 extends 포켓몬 {
	
}

public class InheritanceTest {

	public static void main(String[] args) {
		
		꼬부기 내꼬부기 = new 꼬부기();
		내꼬부기.이름 = "꼬부기";
		System.out.println(내꼬부기.이름);
		
		피카츄 내피카츄 = new 피카츄();
		내피카츄.이름 = "피카츄";
		System.out.println(내피카츄.이름);
		
	}

}
