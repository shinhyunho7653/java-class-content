import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LayoutTest {
	
	public LayoutTest() {
		// 화면의 배치를 하는 기본적인 화면 구성
		// Layout 화면에 버튼이나 글자를 어디에
		// 놓을지 정하는 규칙
		JFrame 윈도우창 = new JFrame();
		
		// 화면 설정
		윈도우창.setSize(400,300);
		// 화면 배치도 같이 설정한다
		// 왼쪽에서 오른쪽으로 정렬
		// display : flex 비슷하다
		// 가로정렬
		윈도우창.setLayout(new FlowLayout());
		
		JLabel 아이디라벨 = new JLabel("아이디:");
		
		// 버튼
		JButton 확인버튼 = new JButton("확인");
		JButton 로그인버튼 = new JButton("로그인");
		JButton 회원가입버튼 = new JButton("회원가입");
		
		윈도우창.add(아이디라벨);
		윈도우창.add(확인버튼);
		윈도우창.add(로그인버튼);
		윈도우창.add(회원가입버튼);
		
		// 엑스 버튼을 누르면 완전 종료!
		윈도우창.setDefaultCloseOperation(3); 

		// 보이기
		윈도우창.setVisible(true);
	}

}
