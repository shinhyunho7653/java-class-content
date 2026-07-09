
public class FunctionTest2 {
	
	public static void 등급(int 점수, String 과목명) {
		if (점수 >= 90 && 점수 <= 100) {
			System.out.println(과목명 + ": A등급");
		} else if (점수 >= 80) {
			System.out.println(과목명 + ": B등급");
		} else if (점수 >= 70) {
			System.out.println(과목명 + ": C등급");
		} else if (점수 >= 60) {
			System.out.println(과목명 + ": D등급");
		} else if (점수 >= 50) {
			System.out.println(과목명 + ": E등급");
		} else {
			System.out.println(과목명 + ": F등급");
		}
	}
	
	// ---------------------------------------------------------------------
	
	public static void 건강검진(double 지수, String 사람) {
		if(지수 >= 30) {
			System.out.println(사람 + ": 비만");
		}else if(지수 >= 25) {
			System.out.println(사람 + ": 과체중");
		}else if(지수 >= 18.5) {
			System.out.println(사람 + ": 정상");
		}else {
			System.out.println(사람 + ": 저체중");
		}
	}

	public static void main(String[] args) {
		
		// 국어, 영어, 수학 각각 점수 100, 80, 90
		int 국어 = 100, 영어 = 80, 수학 = 90;
		
		// 각각의 등급 90점 이상 A, 80점 이상 B, 70점 이상 C, 나머지 F
		
		// 국어 등급 A 등급
		// 영어 등급 B 등급
		// 수학 등급 A 등급
		
		// 국어 등급
		등급(국어, "국어");

		// 영어 등급
		등급(영어, "영어");
		
		// 수학 등급
		등급(수학, "수학");

		// 뒤에 10명이 더 있다!
		// 10명 모두 각각 국어,수학, 영어 등급 출력!
		
		// -----------------------------------------------------------------
		
		System.out.println();
		
		// 병원에서 건강검진
		// BMI 지수 100번 판단!
		// 비만,과체중 , 정상 , 저체중
		String 이름 = "철수";
		double bmi = 22.5;

		String 이름2 = "영희";
		double bmi2 = 18.3;

		String 이름3 = "민수";
		double bmi3 = 25;

		// 30이상 비만
		// 25이상 ~ 30미만 과체중
		// 18.5이상 ~ 25미만 정상
		// 18.5미만 저체중 

		// 1. 함수 쓰지마시고! if문
		
//		// 철수
//		if(bmi >= 30) {
//			System.out.println(이름 + ": 비만");
//		}else if(bmi >= 25) {
//			System.out.println(이름 + ": 과체중");
//		}else if(bmi >= 18.5) {
//			System.out.println(이름 + ": 정상");
//		}else {
//			System.out.println(이름 + ": 저체중");
//		}
//		
//		// 영희
//		if(bmi2 >= 30) {
//			System.out.println(이름2 + ": 비만");
//		}else if(bmi2 >= 25) {
//			System.out.println(이름2 + ": 과체중");
//		}else if(bmi2 >= 18.5) {
//			System.out.println(이름2 + ": 정상");
//		}else {
//			System.out.println(이름2 + ": 저체중");
//		}
//		
//		// 민수
//		if (bmi3 >= 30) {
//			System.out.println(이름3 + ": 비만");
//		} else if (bmi3 >= 25) {
//			System.out.println(이름3 + ": 과체중");
//		} else if (bmi3 >= 18.5) {
//			System.out.println(이름3 + ": 정상");
//		} else {
//			System.out.println(이름3 + ": 저체중");
//		}

		// 2. 함수로 변경해서 장점 파악!
		건강검진(bmi, "철수");
		
		건강검진(bmi2, "영희");
		
		건강검진(bmi3, "민수");

	}

}
