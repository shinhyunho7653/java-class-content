
public class LoopEx {

	public static void main(String[] args) {
		
		// 시작값
		// 얼마동안 반복할지
		// 다음으로 이동할때 몇씩 이동
		
		// while(참인동안반복){
		//  실행할 내용;
		// }
		
		// 10부터 20까지 출력하는 반복문
		// 1. 시작값을 정한다
		// 반복을 하려면 시작하는 값을 기억해야된다
		
		int start = 10;
		int end = 20;
		
		// 2. 반복 실행
		// start가 end보다 작거나 같을때 계속 반복
		
		while(start <= end) {
			System.out.println(start);
			
			// 3. 다음으로 이동
			start = start + 1;
		}
		
		//
		
		int count = 1;
		
		while(count <= 10) {
			System.out.println(count++ + "번 찍었다");
//			count = count + 1;
		}
		
		System.out.println("나무가 넘어갔다");
		
		// 증가하거나 감소하는 ++
		// ++num - 1 증가시킨 후 출력
		// num++ - 출력 후 그다음 출력에서 1증가
		int num = 10; 

		System.out.println("초기값: "+ num);
		System.out.println("변경 num++ : "+ num++);
		System.out.println("변경된 후 값 : "+ num);

	}

}
