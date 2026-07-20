import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiTest {

	public GuiTest() {
		System.out.println("객체 자동으로 만들기");
		
		// 화면을 만들려면 메인창을 하나 만들어야된다.
		JFrame 윈도우창 = new JFrame();
		
		// 버튼을 윈도우창에 올리기
		JButton 첫번째버튼 = new JButton("로그인");
		
		// 화면에 버튼을 추가
		윈도우창.add(첫번째버튼);
		
		// 화면에 보이기
		윈도우창.setVisible(true);
		
	}
	
}
