
class 동물 {
	String 이름;
	int 나이;
	String 품종;
}

class 강아지 extends 동물 {}

class 고양이 extends 동물 {}

class 도마뱀 extends 동물 {}

class 토끼 extends 동물 {}

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		강아지 초코 = new 강아지();
		초코.이름 = "초코";
		초코.나이 = 3;
		초코.품종 = "말티즈";
		
		System.out.println("이름 : " + 초코.이름);
		System.out.println("나이 : " + 초코.나이);
		System.out.println("품종 : " + 초코.품종);
		
		고양이 나비 = new 고양이();
		나비.이름 = "나비";
		나비.나이 = 2;
		나비.품종 = "페르시안";
		
		System.out.println("이름 : " + 나비.이름);
		System.out.println("나이 : " + 나비.나이);
		System.out.println("품종 : " + 나비.품종);
		
		도마뱀 레오 = new 도마뱀();
		레오.이름 = "레오";
		레오.나이 = 1;
		레오.품종 = "레오파드게코";
		
		System.out.println("이름 : " + 레오.이름);
		System.out.println("나이 : " + 레오.나이);
		System.out.println("품종 : " + 레오.품종);
		
		토끼 토순이 = new 토끼();
		토순이.이름 = "토순이";
		토순이.나이 = 2;
		토순이.품종 = "앙고라";
		
		System.out.println("이름 : " + 토순이.이름);
		System.out.println("나이 : " + 토순이.나이);
		System.out.println("품종 : " + 토순이.품종);
				
	}

}
