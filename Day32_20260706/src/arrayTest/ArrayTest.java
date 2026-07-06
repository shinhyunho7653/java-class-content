package arrayTest;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열(Array)
		// - 여러개의 값을 한번에 저장하는 공간
		// 학생 이름 5개 저장
		// 민지, 민수, 지수, 영의, 철수
		
		String stu1 = "민지";
		String stu2 = "민수";
		String stu3 = "지수";
		String stu4 = "영희";
		String stu5 = "철수";
		
		// 자바스크립트에서는 []
		// 자바에서는 {}
		
		String[] students = {"민지", "민수", "지수", "영희", "철수"};
		
		// 민지만 출력
		
		System.out.println(students[0]);
		
		// 정수 5개 저장하는 배열
		
		int[] nums = {1, 2, 3, 4, 5};
		
		System.out.println(nums[0]);
		System.out.println(nums[0] + nums[1]);
		System.out.println(nums[0] + nums[1] + nums[2]);
		
		System.out.println();
		
		// 실수 3개 저장하하는 배열
		
		double[] num2 = {1.1, 2.2, 3.3};
		
		

	}

}
