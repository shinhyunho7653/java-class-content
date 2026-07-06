package arrayTest;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// 배열을 쓰는 이유?
		// - 여러개의 값을 한번에 저장하기 위해
		String[] 상품들 = {"나키이운동화", "티셔츠", "첨바지", "일자바지"};
		
		System.out.println(상품들[0]);
		System.out.println(상품들[1]);
		System.out.println(상품들[2]);
		System.out.println(상품들[3]);
		
		int 손가락 = 0;
		System.out.println(상품들[손가락]);
		
		손가락 = 1;
		System.out.println(상품들[손가락]);
		
		int[] 숫자들 = {10, 20, 30, 40, 50, 60};
		
		if(숫자들[0] == 40) {
			System.out.println("찾았다.");
		}else {
			System.out.println("다음 칸으로 이동!");
		}
		if(숫자들[1] == 40) {
			System.out.println("찾았다.");
		}else {
			System.out.println("다음 칸으로 이동!");
		}
		if(숫자들[2] == 40) {
			System.out.println("찾았다.");
		}else {
			System.out.println("다음 칸으로 이동!");
		}
		if(숫자들[3] == 40) {
			System.out.println("찾았다.");
		}else {
			System.out.println("다음 칸으로 이동!");
		}
		
		// -----------------------------------------------------------
		
		double[] heights = {
			165.3,
			172.8,
			180.5,
			158.7,
			169.4,
			175.2,
			182.1,
			160.9,
			167.6,
			171.0
		};
		
		if(heights[0] >= 180) {
			System.out.println("180이상");
		}
		if(heights[1] >= 180) {
			System.out.println("180이상");
		}
		if(heights[2] >= 180) {
			System.out.println("180이상");
		}
		if(heights[3] >= 180) {
			System.out.println("180이상");
		}
		if(heights[4] >= 180) {
			System.out.println("180이상");
		}
		if(heights[5] >= 180) {
			System.out.println("180이상");
		}
		if(heights[6] >= 180) {
			System.out.println("180이상");
		}
		if(heights[7] >= 180) {
			System.out.println("180이상");
		}
		if(heights[8] >= 180) {
			System.out.println("찾았다.");
		}
		if(heights[9] >= 180) {
			System.out.println("180이상");
		}
		
		// 숫자는 기억하려면 변수를 쓰면 된다
		int i = 0;
		if (heights[i] >= 180) {
			System.out.println(heights[i]);
		}
		
		i = 1;
		if (heights[i] >= 180) {
			System.out.println(heights[i]);
		}

	}

}
