
public class LoopEx4 {

	public static void main(String[] args) {

		//
		String[] 학생명단 = { "김철수", "이영희", "이결석", "박민수", "최지은" };

		int 번호 = 0;

		while (번호 <= 4) {

			// 영희는 건너뛰기
			if (학생명단[번호].equals("이영희")) {
				번호 += 1;
				continue;
			}
			System.out.println("출석 부르기:" + 학생명단[번호]);
			번호 += 1;
		}

		// 1. 회원 데이터 유효성 검사(이메일 형식 오류 건너뛰기)
		// @없거나 비어있거나
		String[] 이메일목록 = { "kim@test.com", "잘못된이메일", "lee@test.com", "", "park@test.com" };

		// 실무에서는 어떻게 코드 작성?
		// 문자가 비어있는지 물어보는 기능 isEmpty()
		// 비어있다면 true, 비어있지 않다면 false
		int 번호2 = 0;

		while (번호2 <= 4) {
			if (이메일목록[번호2].equals("") || 이메일목록[번호2].equals("잘못된이메일")) {
				번호2 += 1;
				continue;
			} else {
				System.out.println(이메일목록[번호2] + " 발송 가능한 이메일입니다.");
				번호2 += 1;
			}
		}
		
		String[] 게시글제목 = {"공지사항", "삭제된 글", "자유게시판 글", "삭제된 글", "질문있어요"};
		
		int 번호3 = 0;
		
		while(번호3 <= 4) {
			if(게시글제목[번호3].equals("삭제된 글")) {
				System.out.println();
				번호3 += 1;
				continue;
			}else {
				System.out.println(게시글제목[번호3]);
				번호3 += 1;
				
			}
		}

	}

}
