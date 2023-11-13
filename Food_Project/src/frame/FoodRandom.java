package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static frame.Constants.BACKGROUND_ALL;
import static frame.Constants.BTN_RANDOM_KOREAN;
import static frame.Constants.BTN_RANDOM_CHINESE;
import static frame.Constants.BTN_RANDOM_JAPANESE;
import static frame.Constants.BTN_RANDOM_AMERICAN;
import static frame.Constants.BTN_RANDOM_ALLFOOD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import foodVO.FoodDAO;

public class FoodRandom extends JPanel {

	public FoodRandom() {

	}

	public FoodRandom(FoodDAO foodDao) {
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(585, 765);

		ImageIcon buttonImageKoreanRandom = new ImageIcon(BTN_RANDOM_KOREAN);
		ImageIcon buttonImageChineseRandom = new ImageIcon(BTN_RANDOM_CHINESE);
		ImageIcon buttonImageJapaneseRandom = new ImageIcon(BTN_RANDOM_JAPANESE);
		ImageIcon buttonImageAmericanRandom = new ImageIcon(BTN_RANDOM_AMERICAN);
		ImageIcon buttonImageAllfoodRandom = new ImageIcon(BTN_RANDOM_ALLFOOD);

		JButton btnKoreanRandom = new JButton(buttonImageKoreanRandom);
		JButton btnChineseRandom = new JButton(buttonImageChineseRandom);
		JButton btnJapaneseRandom = new JButton(buttonImageJapaneseRandom);
		JButton btnAmericanRandom = new JButton(buttonImageAmericanRandom);
		JButton btnAllFoodRandom = new JButton(buttonImageAllfoodRandom);

		btnKoreanRandom.setSize(200, 200);
		btnKoreanRandom.setLocation(((int) getSize().getWidth() / 2 - 210), (int) getLocation().getY() / 2 + 50);

		btnChineseRandom.setSize(200, 200);
		btnChineseRandom.setLocation((int) btnKoreanRandom.getLocation().getX() + 230,
				(int) btnKoreanRandom.getLocation().getY());

		btnJapaneseRandom.setSize(200, 200);
		btnJapaneseRandom.setLocation(((int) btnKoreanRandom.getLocation().getX()),
				(int) btnKoreanRandom.getLocation().getY() + 220);

		btnAmericanRandom.setSize(200, 200);
		btnAmericanRandom.setLocation((int) btnJapaneseRandom.getLocation().getX() + 230,
				(int) btnJapaneseRandom.getLocation().getY());

		btnAllFoodRandom.setSize(430, 150);
		btnAllFoodRandom.setLocation((int) btnKoreanRandom.getLocation().getX(),
				(int) btnAmericanRandom.getLocation().getY() + 220);

		btnKoreanRandom.setBorderPainted(false);
		btnKoreanRandom.setContentAreaFilled(false);
		btnKoreanRandom.setFocusPainted(false);

		btnChineseRandom.setBorderPainted(false);
		btnChineseRandom.setContentAreaFilled(false);
		btnChineseRandom.setFocusPainted(false);

		btnJapaneseRandom.setBorderPainted(false);
		btnJapaneseRandom.setContentAreaFilled(false);
		btnJapaneseRandom.setFocusPainted(false);

		btnAmericanRandom.setBorderPainted(false);
		btnAmericanRandom.setContentAreaFilled(false);
		btnAmericanRandom.setFocusPainted(false);

		btnAllFoodRandom.setBorderPainted(false);
		btnAllFoodRandom.setContentAreaFilled(false);
		btnAllFoodRandom.setFocusPainted(false);

		add(btnKoreanRandom);
		add(btnChineseRandom);
		add(btnJapaneseRandom);
		add(btnAmericanRandom);
		add(btnAllFoodRandom);

		btnKoreanRandom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodRandomChoice(new FoodDAO(), "한식"));
			}
		});

		btnJapaneseRandom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodRandomChoice(new FoodDAO(), "일식"));
			}
		});

		btnChineseRandom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodRandomChoice(new FoodDAO(), "중식"));
			}
		});

		btnAmericanRandom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodRandomChoice(new FoodDAO(), "양식"));
			}
		});

		btnAllFoodRandom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodRandomChoice(new FoodDAO(), "전체"));
			}
		});

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
				FoodBase.getInstance(new FoodBegin());
			}
		});

		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodStart());
			}
		});

	}

}