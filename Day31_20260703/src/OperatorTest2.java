
public class OperatorTest2 {

	public static void main(String[] args) {
		// 실제 웹에서 사용하는 기법
		
		int 좋아요 = 100;
		System.out.println("현재 좋아요 : " + 좋아요);
		
		++좋아요;
		
		System.out.println("좋아요버튼 클릭");
		System.out.println("현재 좋아요 : " + 좋아요);
		
		// 좋아요가 100개 이상이면 "인기게시글"
		// 미만이면 "아직 인기 게시글 아님"
		
		System.out.println(좋아요 >= 100 ? "인기게시글" : "아직 인기 게시글 아님");

	}

}
