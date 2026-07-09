
public class LoopEx2 {

	public static void main(String[] args) {
		
		// 로켓발사 카운트 다운
		// 5,4,3,2,1
		
		int count = 5;
		
		while(count >= 1) {
			System.out.println(count--);
		}
		
		// 구구단 2단
		
		int count2 = 1;
		
		while(count2 <= 9) {
			System.out.println(2 * count2++);
		}
		
		// 1번 학생 부터 20번 학생 호출 
		// 3명씩 건너뛰며 번호를 부른다. 
		// 1 4 7 10 ....

		int 번호 = 1;

		while(번호 != 20) {
		System.out.println(번호 + " 학생");
		번호 += 1;
		}

	}

}
