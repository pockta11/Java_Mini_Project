package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static frame.Constants.BACKGROUND_ALL;
import static frame.Constants.BTN_GO_CATEGORY;
import static frame.Constants.BTN_GO_RANDOM;
import static frame.Constants.BTN_GO_GAME;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FoodBegin extends JPanel {

	public FoodBegin() {

		// JPanel 구조
//		setBackground(new Color(255, 241, 54));
		setLayout(null);
		setSize(585, 765);

//		// 배경 이미지
//		ImageIcon food = new ImageIcon(BACKGROUND_ALL);
//		JLabel lblfood = new JLabel(food);
//		lblfood.setSize(585, 675);
//		lblfood.setLocation(0, 0);
//		add(lblfood);

		// 하단의 버튼 설정
		ImageIcon select = new ImageIcon(BTN_GO_CATEGORY);
		ImageIcon random = new ImageIcon(BTN_GO_RANDOM);
		ImageIcon game = new ImageIcon(BTN_GO_GAME);
		
		JButton btnMenuInfo = new JButton(select);
		JButton btnRandomInfo = new JButton(random);
		JButton btnGame = new JButton(game);

		btnMenuInfo.setBackground(new Color(183, 240, 117));
		btnRandomInfo.setBackground(new Color(183, 240, 117));
		btnGame.setBackground(new Color(183, 240, 117));

		btnMenuInfo.setSize(280, 100);
		btnMenuInfo.setLocation(((int) getSize().getWidth() / 2) - 150, (int) getLocation().getY() / 2 + 150);
		btnMenuInfo.setFont(new Font("굴림", Font.BOLD, 26));

		btnRandomInfo.setSize(280, 100);
		btnRandomInfo.setLocation((int) btnMenuInfo.getLocation().getX(),
				(int) btnMenuInfo.getLocation().getY() / 2 + 240);
		btnRandomInfo.setFont(new Font("굴림", Font.BOLD, 26));

		btnGame.setSize(280, 100);
		btnGame.setLocation((int) btnMenuInfo.getLocation().getX(), (int) btnMenuInfo.getLocation().getY() / 2 + 400);
		btnGame.setFont(new Font("굴림", Font.BOLD, 26));

		add(btnMenuInfo);
		add(btnRandomInfo);
		add(btnGame);

		// 버튼 이벤트(메뉴보기 / 랜덤 추천 받기 / 점심 비용 게임)
		btnMenuInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodCategory(null));
			}
		});

		btnRandomInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodRandom(null));
			}
		});

		btnGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodGame()); 	// 미완성
			}
		});
		
		btnMenuInfo.setBorderPainted(false);
		btnMenuInfo.setContentAreaFilled(false);
		btnMenuInfo.setFocusPainted(false);
		
		btnRandomInfo.setBorderPainted(false);
		btnRandomInfo.setContentAreaFilled(false);
		btnRandomInfo.setFocusPainted(false);
		
		btnGame.setBorderPainted(false);
		btnGame.setContentAreaFilled(false);
		btnGame.setFocusPainted(false);

		
		// -------------------------------하단 메뉴-----------------------------------------
		JButton btnBack = new JButton(new ImageIcon("Back.png"));
		JButton btnHome = new JButton(new ImageIcon("Home.png"));
		JButton btnClose = new JButton(new ImageIcon("Close.png"));

		
		btnBack.setSize(80, 80);
		btnBack.setLocation(((int) btnHome.getLocation().getX() + 50 ), (int) getLocation().getY() / 2 + 675);
		
		
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

		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodStart());
			}
		});

		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodStart());
			}
		});
		
		
	}// 생성자

}