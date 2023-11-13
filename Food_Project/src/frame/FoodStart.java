package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static frame.Constants.BACKGROUND_START;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FoodStart extends JPanel {

	public FoodStart() {
		// JPanel 구조
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(585, 765);

		// 시작화면 이미지
		ImageIcon food = new ImageIcon(BACKGROUND_START);
		JLabel lblfood = new JLabel(food);
		lblfood.setSize(585, 680);
		lblfood.setLocation(0, 0);
		add(lblfood);

		// Start 버튼 설정

		JButton btnStart = new JButton((new ImageIcon()));
		btnStart.setBackground(new Color(255, 255, 255));
		btnStart.setSize(200, 140);
		btnStart.setLocation(((int) getSize().getWidth() / 2) - 100, (int) getLocation().getY() / 2 + 520);

		btnStart.setBorderPainted(false); // 버튼 외각선 지우기
		btnStart.setContentAreaFilled(false); // 버튼 투명하게 지우기 (이미지 남김)
		btnStart.setFocusPainted(false);

		add(btnStart);

		// --------------------------하단 메뉴-----------------------------------------

		JButton btnBack = new JButton(new ImageIcon("Back.png"));
		JButton btnHome = new JButton(new ImageIcon("Home.png"));
		JButton btnClose = new JButton(new ImageIcon("Close.png"));

		btnBack.setSize(80, 80);
		btnBack.setLocation(((int) btnHome.getLocation().getX() + 50), (int) getLocation().getY() / 2 + 675);

		btnHome.setSize(80, 80);
		btnHome.setLocation(((int) getSize().getWidth() / 2) - 50, (int) getLocation().getY() / 2 + 675);

		btnClose.setSize(80, 80);
		btnClose.setLocation(((int) btnHome.getLocation().getX() + 200), (int) getLocation().getY() / 2 + 675);

		add(btnClose);
		add(btnBack);
		add(btnHome);

		btnBack.setBorderPainted(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setFocusPainted(false);

		btnHome.setBorderPainted(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setFocusPainted(false);

		btnClose.setBorderPainted(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setFocusPainted(false);

		// start 버튼 클릭 -> Begin으로 넘어감
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodBegin());
			}
		});

		// 종료 버튼 클릭 -> 종료
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// 뒤로가기 버튼 클릭 -> 뒤로가기 / Start 화면으로 가기
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodStart());
			}
		});

		// 홈 버튼 클릭 -> Begin화면으로 가기
		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodStart());
			}
		});

	} // 생성자

}