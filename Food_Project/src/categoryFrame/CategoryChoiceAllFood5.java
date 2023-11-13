package categoryFrame;

import static frame.Constants.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import foodVO.FoodDAO;
import frame.FoodBase;
import frame.FoodCategory;
import frame.FoodReservation2;
import frame.FoodStart;

public class CategoryChoiceAllFood5 extends JPanel {

	public CategoryChoiceAllFood5() {

	}

	public CategoryChoiceAllFood5(FoodDAO foodDao) {
		setBackground(new Color(255, 250, 190));
		setLayout(null);
		setSize(585, 765);
		
		ImageIcon buttonImagefood1 = new ImageIcon(JAPANESE_01);
		ImageIcon buttonImagefood2 = new ImageIcon(JAPANESE_02);
		ImageIcon buttonImagefood3 = new ImageIcon(JAPANESE_03);
		ImageIcon buttonImagefood4 = new ImageIcon(JAPANESE_04);
		ImageIcon buttonImagefood5 = new ImageIcon(JAPANESE_05);
		ImageIcon buttonImagefood6 = new ImageIcon(JAPANESE_06);

		JButton btnFood1 = new JButton(buttonImagefood1);
		JButton btnFood2 = new JButton(buttonImagefood2);
		JButton btnFood3 = new JButton(buttonImagefood3);
		JButton btnFood4 = new JButton(buttonImagefood4);
		JButton btnFood5 = new JButton(buttonImagefood5);
		JButton btnFood6 = new JButton(buttonImagefood6);

		btnFood1.setSize(200, 140);
		btnFood2.setSize(200, 140);
		btnFood3.setSize(200, 140);
		btnFood4.setSize(200, 140);
		btnFood5.setSize(200, 140);
		btnFood6.setSize(200, 140);
		
		btnFood1.setLocation(60, 30);

		btnFood2.setLocation(325, (int) btnFood1.getLocation().getY());

		btnFood3.setLocation(((int) btnFood1.getLocation().getX()), (int) btnFood1.getLocation().getY() + 200);

		btnFood4.setLocation((int) btnFood2.getLocation().getX(), (int) btnFood3.getLocation().getY());

		btnFood5.setLocation(((int) btnFood3.getLocation().getX()), (int) btnFood3.getLocation().getY() + 200);

		btnFood6.setLocation((int) btnFood2.getLocation().getX(), (int) btnFood5.getLocation().getY());
		
		//사진 테두리 자바에서 설정
		btnFood1.setBorder(new LineBorder(Color.black, 2));
		btnFood2.setBorder(new LineBorder(Color.black, 2));
		btnFood3.setBorder(new LineBorder(Color.black, 2));
		btnFood4.setBorder(new LineBorder(Color.black, 2));
		btnFood5.setBorder(new LineBorder(Color.black, 2));
		btnFood6.setBorder(new LineBorder(Color.black, 2));
		
		
		// 장소
		JLabel FoodPlace1 = new JLabel("▶ 음식: " + foodDao.Info().get(20).getFoodName());
		JLabel FoodPlace2 = new JLabel("▶ 음식: " + foodDao.Info().get(21).getFoodName());
		JLabel FoodPlace3 = new JLabel("▶ 음식: " + foodDao.Info().get(22).getFoodName());
		JLabel FoodPlace4 = new JLabel("▶ 음식: " + foodDao.Info().get(23).getFoodName());
		JLabel FoodPlace5 = new JLabel("▶ 음식: " + foodDao.Info().get(24).getFoodName());
		JLabel FoodPlace6 = new JLabel("▶ 음식: " + foodDao.Info().get(25).getFoodName());

		FoodPlace1.setSize(200, 40);
		FoodPlace2.setSize(200, 40);
		FoodPlace3.setSize(200, 40);
		FoodPlace4.setSize(200, 40);
		FoodPlace5.setSize(200, 40);
		FoodPlace6.setSize(200, 40);

		FoodPlace1.setLocation(60, 170);
		FoodPlace2.setLocation(325, 170);
		FoodPlace3.setLocation(60, 370);
		FoodPlace4.setLocation(325, 370);
		FoodPlace5.setLocation(60, 570);
		FoodPlace6.setLocation(325, 570);

		FoodPlace1.setBackground(Color.BLACK);
		FoodPlace1.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 18));
		FoodPlace2.setBackground(Color.BLACK);
		FoodPlace2.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 18));
		FoodPlace3.setBackground(Color.BLACK);
		FoodPlace3.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 18));
		FoodPlace4.setBackground(Color.BLACK);
		FoodPlace4.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 18));
		FoodPlace5.setBackground(Color.BLACK);
		FoodPlace5.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 18));
		FoodPlace6.setBackground(Color.BLACK);
		FoodPlace6.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 18));
		
		add(FoodPlace1);
		add(FoodPlace2);
		add(FoodPlace3);
		add(FoodPlace4);
		add(FoodPlace5);
		add(FoodPlace6);
		
		
//		btnFood1.setBorderPainted(false);
//		btnFood1.setContentAreaFilled(false);
//		btnFood1.setFocusPainted(false);
//		
//		btnFood2.setBorderPainted(false);
//		btnFood2.setContentAreaFilled(false);
//		btnFood2.setFocusPainted(false);
//		
//		btnFood3.setBorderPainted(false);
//		btnFood3.setContentAreaFilled(true);
//		btnFood3.setFocusPainted(false);
//		
//		btnFood4.setBorderPainted(false);
//		btnFood4.setContentAreaFilled(false);
//		btnFood4.setFocusPainted(false);
//		
//		btnFood5.setBorderPainted(false);
//		btnFood5.setContentAreaFilled(false);
//		btnFood5.setFocusPainted(false);
//		
//		btnFood6.setBorderPainted(true);
//		btnFood6.setContentAreaFilled(true);
//		btnFood6.setFocusPainted(true);

		add(btnFood1);
		add(btnFood2);
		add(btnFood3);
		add(btnFood4);
		add(btnFood5);
		add(btnFood6);

		// 이전페이지, 다음페이지 버튼
		ImageIcon buttonBackPage = new ImageIcon(BTN_GO_BACKPAGE);
		ImageIcon buttonNextPage = new ImageIcon(BTN_GO_NEXTPAGE);

		JButton btnBackPage = new JButton(buttonBackPage);
		JButton btnNextPage = new JButton(buttonNextPage);

		btnBackPage.setSize(100, 30);
		btnNextPage.setSize(100, 30);

		btnBackPage.setLocation(50, (int) getLocation().getY() / 2 + 630);

		btnNextPage.setLocation(422, (int) getLocation().getY() / 2 + 630);

		btnBackPage.setBorderPainted(false);
		btnBackPage.setContentAreaFilled(false);
		btnBackPage.setFocusPainted(false);
		
		btnNextPage.setBorderPainted(false);
		btnNextPage.setContentAreaFilled(false);
		btnNextPage.setFocusPainted(false);

		add(btnBackPage);
		add(btnNextPage);
		

		// -----------------------------하단 메뉴-------------------------------------
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
				FoodBase.getInstance(new FoodCategory(foodDao));
			}
		});

		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodStart());
			}
		});
		
		btnFood1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodReservation2(new FoodDAO(), "일식", 20));
			}
		});
		
		btnFood2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodReservation2(new FoodDAO(), "일식", 21));
			}
		});
		
		btnFood3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodReservation2(new FoodDAO(), "일식", 22));
			}
		});
		
		btnFood4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodReservation2(new FoodDAO(), "일식", 23));
			}
		});
		
		btnFood5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodReservation2(new FoodDAO(), "일식", 24));
			}
		});
		
		btnFood6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodReservation2(new FoodDAO(), "일식", 25));
			}
		});
		
		btnNextPage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new CategoryChoiceAllFood6(new FoodDAO()));
			}
		});
		
		btnBackPage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new CategoryChoiceAllFood4(new FoodDAO()));
			}
		});
	}
}