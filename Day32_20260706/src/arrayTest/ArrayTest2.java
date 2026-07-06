package arrayTest;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		// 실제 웹 개발할 떄 쇼핑몰 상품목록 페이지
		// 데이터들만 따로 저장하는 공간 (DB)
		
		String[] products = {"티셔츠", "청바지", "운동화"};
		
		for(int i = 0; i < products.length; ++i) {
			System.out.println(products[i]);
		}
		
		String[] titles = {
			"공지사항입니다",
			"질문있어요",
			"환영합니다",
			"오늘 수업 재미있어요",
			"점심 뭐 먹을까요?",
			"숙제 제출했습니다",
			"회원가입이 안돼요",
			"감사합니다",
			"이벤트 참여하세요",
			"게시판 첫 글입니다"
		};
		
		// 게시판의 타이틀 출력하기
		
		for(int start = 0; start < titles.length; ++start) {
			System.out.println(titles[start]);
		} 
		
		// 
		
		int[] prices = {
			15000,
			32000,
			8000,
			45000,
			12000,
			28000,
			9900,
			55000,
			18000,
			25000
		};
		
		// 위에 총 합계를 누적 구하기
		int totalPrice = 0;
		
		for(int start2 = 0; start2 < prices.length; ++start2) {
			totalPrice = prices[start2] + totalPrice;
		}
		// 총 합계
		System.out.println("총 합계 : " + totalPrice + "원");
		
		// 학생들의 시험 점수
		int[] scores = {
		    90,
		    80,
		    100,
		    70,
		    95,
		    85,
		    60,
		    75,
		    88,
		    92
		};
		
		// 1. 총점(반복문)
		
		int totalScores = 0;
		
		for(int start3 = 0; start3 < scores.length; ++start3) {
			totalScores = scores[start3] + totalScores;
		}
		
		System.out.println("총점 : " + totalScores + "점");
		
		// 2. 최고 점수
		
	 	int maxScore = scores[0];
	 	
	 	for(int s2 = 0; s2 < scores.length; ++s2) {
	 		if(scores[s2] > maxScore) {
	 			maxScore = scores[s2];
	 		}
	 	}
	 	System.out.println("최고 점수 : " + maxScore);

	}

}
