package arrayTest;

public class ArrayTest5 {

	public static void main(String[] args) {
		
		// 기존 for문이 조금 어려워서 쉽게 변경된 for~each
		// 자바스크립트 for in, for of랑 똑같다
		
		int[] nums = {10, 20, 30, 40, 50};
		
		// 배열의 모든 값을 처음부터 끝까지 사용할 떄 가장 간단한 반복문
		
		for(int num : nums) {
			System.out.println(num);
		}
		
	    String[] fruits = {
	            "사과",
	            "바나나",
	            "포도",
	            "딸기",
	            "수박"
	        };
	    
	    for(String f : fruits) {
	    	System.out.println(f);
	    }
	    
	    int[] prices = {
	            35000,
	            120000,
	            18000,
	            95000,
	            150000
	        };
	    
	    // 합계 누적(금액)
	    int 누적금액 = 0;
	    
	    for(int pr : prices) {
	    	누적금액 = 누적금액 + pr;
	    	// 10만원 이상만 출력하기
	    	if(pr >= 100000) {
	    		System.out.println("현재금액 : " + pr);
	    	}
	    }
	    System.out.println("누적 금액 : " + 누적금액);

	}

}
