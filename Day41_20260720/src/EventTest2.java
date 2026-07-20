import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyMouse extends MouseAdapter {
	
	// 도화지 저장
	JPanel 도화지;
	
	// 색을 번갈아 바꾸기
	boolean 빨강;
	
	public MyMouse(JPanel 도화지) {
		this.도화지 = 도화지;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		// 랜덤으로 색 바꾸기
		Random 랜덤 = new Random();
		
		int r = 랜덤.nextInt(256);
		int g = 랜덤.nextInt(256);
		int b = 랜덤.nextInt(256);
		
		Color 랜덤색 = new Color(r,g,b);
		
		도화지.setBackground(랜덤색);
		
		// 클릭을 하면 배경색 바꾸기
//		if (빨강) {
//			도화지.setBackground(Color.ORANGE);
//		} else {
//			도화지.setBackground(Color.red);
//		}
//
//		빨강 = !빨강; // ! 빨강이면 오렌지로 바꾸고 오렌지면 빨강으로 바꾸는
				   // 코드 !true -> false
				   // !false -> true
		
//		System.out.println("클릭!");
		// 마우스 위치
//		System.out.println("마우스 위치 가로(좌우):" + e.getX());
//		System.out.println("마우스 위치 세로(위아래):" + e.getY());
	}
}

public class EventTest2 {

	public EventTest2() {
		// Mouse Event
		// - 사용자가 마우스를 움직이거나 클릭했을 때
		// 프로그램이 반응하는 기능!
		// 3. 창만들기
		JFrame 윈도우창 = new JFrame();

		// 4. 설정
		윈도우창.setSize(400, 300);

		// 5. 도화지 생성
		JPanel 도화지 = new JPanel();
		
		// 6. 도화지 배경
		도화지.setBackground(Color.orange);
		
		// 7. 도화지에 이벤트를 추가한다
		도화지.addMouseListener(new MyMouse(도화지));
		
		// 8. 윈도우에 도화지를 붙인다
		
		윈도우창.add(도화지);
		윈도우창.setDefaultCloseOperation(3);

		// 9. 보이기
		윈도우창.setVisible(true);
	}

}

/*
프로그램 시작
      │
      ▼
main()
      │
      ▼
new EventTest2()
      │
      ▼
EventTest2() 생성자 실행
      │
      ▼
JFrame 생성
      │
      ▼
창 크기 설정
      │
      ▼
JPanel(도화지) 생성
      │
      ▼
도화지 배경색(주황) 설정
      │
      ▼
MyMouse 객체 생성
      │
      ▼
도화지에 MouseListener 등록
      │
      ▼
도화지를 창에 추가
      │
      ▼
창 화면에 출력(setVisible)
      │
────────────── 프로그램 대기 ──────────────
      │
      ▼
사용자가 도화지 클릭
      │
      ▼
mouseClicked() 자동 실행
      │
      ▼
Random 객체 생성
      │
      ▼
r, g, b 랜덤값 생성
      │
      ▼
Color 객체 생성
      │
      ▼
도화지.setBackground(랜덤색)
      │
      ▼
배경색 변경 완료
 */
