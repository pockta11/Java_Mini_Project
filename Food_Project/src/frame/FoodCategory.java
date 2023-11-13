package frame;

import static frame.Constants.BACKGROUND_ALL;
import static frame.Constants.BTN_SELECT_ALLFOOD;
import static frame.Constants.BTN_SELECT_AMERICAN;
import static frame.Constants.BTN_SELECT_CHINESE;
import static frame.Constants.BTN_SELECT_JAPANESE;
import static frame.Constants.BTN_SELECT_KOREAN;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import categoryFrame.CategoryChoiceAllFood1;
import categoryFrame.CategoryChoiceAmerican1;
import categoryFrame.CategoryChoiceChinese1;
import categoryFrame.CategoryChoiceJapanese1;
import categoryFrame.CategoryChoiceKorean1;
import foodVO.FoodDAO;

public class FoodCategory extends JPanel {

	public FoodCategory() {

	}

	public FoodCategory(FoodDAO foodDao) {
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(585, 765);
		
//		// 배경 이미지
//		ImageIcon food = new ImageIcon(BACKGROUND_ALL);
//		JLabel lblfood = new JLabel(food);
//		lblfood.setSize(585, 675);
//		lblfood.setLocation(0, 0);
//		add(lblfood);

		ImageIcon buttonImageKorean = new ImageIcon(BTN_SELECT_KOREAN);
		ImageIcon buttonImageChinese = new ImageIcon(BTN_SELECT_CHINESE);
		ImageIcon buttonImageJapanese = new ImageIcon(BTN_SELECT_JAPANESE);
		ImageIcon buttonImageAmerican = new ImageIcon(BTN_SELECT_AMERICAN);
		ImageIcon buttonImageAllfood = new ImageIcon(BTN_SELECT_ALLFOOD);

		JButton btnKorean = new JButton(buttonImageKorean);
		JButton btnChinese = new JButton(buttonImageChinese);
		JButton btnJapanese = new JButton(buttonImageJapanese);
		JButton btnAmerican = new JButton(buttonImageAmerican);
		JButton btnAllFood = new JButton(buttonImageAllfood);

		btnKorean.setSize(200, 200);
		btnKorean.setLocation(((int) getSize().getWidth() / 2 - 210), (int) getLocation().getY() / 2 + 50);
		

		btnChinese.setSize(200, 200);
		btnChinese.setLocation((int) btnKorean.getLocation().getX() + 230,
	            (int) btnKorean.getLocation().getY());
		

		btnJapanese.setSize(200, 200);
		btnJapanese.setLocation(((int) btnKorean.getLocation().getX()),
	            (int) btnKorean.getLocation().getY() + 220);
		

		btnAmerican.setSize(200, 200);
		btnAmerican.setLocation((int) btnJapanese.getLocation().getX() + 230,
	            (int) btnJapanese.getLocation().getY());
		

		btnAllFood.setSize(430, 150);
		btnAllFood.setLocation((int) btnKorean.getLocation().getX(),
	            (int) btnAmerican.getLocation().getY() + 220);
		

		// 버튼에서 이미지만 남기고 다 안보이게 함
		btnKorean.setBorderPainted(false);
		btnKorean.setContentAreaFilled(false);
		btnKorean.setFocusPainted(false);
		
		btnChinese.setBorderPainted(false);
		btnChinese.setContentAreaFilled(false);
		btnChinese.setFocusPainted(false);
		
		btnJapanese.setBorderPainted(false);
		btnJapanese.setContentAreaFilled(false);
		btnJapanese.setFocusPainted(false);
		
		btnAmerican.setBorderPainted(false);
		btnAmerican.setContentAreaFilled(false);
		btnAmerican.setFocusPainted(false);
		
		btnAllFood.setBorderPainted(false);
		btnAllFood.setContentAreaFilled(false);
		btnAllFood.setFocusPainted(false);

		add(btnKorean);
		add(btnChinese);
		add(btnJapanese);
		add(btnAmerican);
		add(btnAllFood);

		btnKorean.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new CategoryChoiceKorean1(new FoodDAO()));
			}
		});

		btnChinese.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new CategoryChoiceChinese1(new FoodDAO()));
			}
		});

		btnJapanese.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new CategoryChoiceJapanese1(new FoodDAO()));
			}
		});

		btnAmerican.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new CategoryChoiceAmerican1(new FoodDAO()));
			}
		});

		btnAllFood.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new CategoryChoiceAllFood1(new FoodDAO()));
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
