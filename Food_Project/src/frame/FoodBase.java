package frame;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import static frame.Constants.*;

//1-1
public class FoodBase extends JFrame {

	private static FoodBase instance;

	private FoodBase(JPanel e) {
		// 시스템 정보(화면 크기를 얻기 위한 Toolkit)
		Toolkit tk = Toolkit.getDefaultToolkit();// 해상도

		// 기본 JFrame 구조
		setTitle("음식 추천 프로그램");
		setLayout(null);
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, // 화면 중앙
				((int) tk.getScreenSize().getHeight()) / 2 - 400, 600, 800); // 크기
		getImage(e);// 기본 배경 이미지
		add(e); // 첫화면에 패널 붙여놓음
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 //JFrame이라 Default
	}// 생성자

	// 싱글톤 기법을 사용하려고 한다
	public static void getInstance(JPanel e) { // 데이터 영역
		// static으로 선언했으므로 해당 메서드가 생성자보다도 먼저 호출된다
		instance = new FoodBase(e);// 생성자를 통해 기본 프레임 정의

		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);

		instance.revalidate(); // 레이아웃 관리자에게 레이아웃정보를 다시 계산하도록 지시
		instance.repaint(); // 레이아웃을 새로 그린다
	}// getInstance()

	// 기본 프레임 이미지를 저장하기 위한 메소드
	public static void getImage(JPanel e) {
		ImageIcon backGround = new ImageIcon(BACKGROUND_ALL);
		JLabel lblBackGround = new JLabel(backGround);
		lblBackGround.setSize(585, 680);
		lblBackGround.setLocation(0, 0);
		e.add(lblBackGround);

		ImageIcon bottomGround = new ImageIcon(BACKGROUND_BOTTOM);
		JLabel lblBottomGround = new JLabel(bottomGround);
		lblBottomGround.setSize(585, 95);
		lblBottomGround.setLocation(0, 680);
		e.add(lblBottomGround);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	public static void getDispose() {
		instance.dispose();
	}

}