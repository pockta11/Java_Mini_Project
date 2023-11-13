package frame;

import static frame.Constants.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import foodVO.FoodDAO;

public class FoodGameIn extends JPanel {

	public String[] imgs = { NUMBER_1, NUMBER_3, NUMBER_7, NUMBER_4, NUMBER_5, NUMBER_9, NUMBER_2, NUMBER_6, NUMBER_8 };
	static int imgsCount;
	static int count = ((int) Math.random() * 9) + 10;
	static int n = 0;
	JLabel rerollImage;

	public FoodGameIn(int personNum) {

		// JPanel 구조
		setBackground(new Color(245, 245, 220));
		setLayout(null);
		setSize(585, 765);

		ImageIcon Stop = new ImageIcon(BTN_STOP);
		JButton stopButton = new JButton(Stop);
		stopButton.setSize(128, 128);
		stopButton.setLocation(((int) getSize().getWidth() / 2 - 64), 500);
		stopButton.setVisible(true);
		add(stopButton);

		stopButton.setBorderPainted(false);
		stopButton.setContentAreaFilled(false);
		stopButton.setFocusPainted(false);
		
		stopButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FoodBase.getDispose();
				FoodBase.getInstance(new FoodGameInput(personNum));

			}
		});

		ImageIcon person2 = new ImageIcon(BTN_PERSON2); // 처음 보여지는 이미지 넣을 공간
		rerollImage = new JLabel(person2);
		rerollImage.setSize(300, 300);
		rerollImage.setLocation((int) getWidth() / 2 - 150, (int) getHeight() / 2 - 200);
		add(rerollImage);

		switch (personNum) {
		case 1:
			imgsCount = 1;
			(new RerollImg()).start();
		case 2:
			imgsCount = 2;
			(new RerollImg()).start();
		case 3:
			imgsCount = 3;
			(new RerollImg()).start();
		case 4:
			imgsCount = 4;
			(new RerollImg()).start();
		case 5:
			imgsCount = 5;
			(new RerollImg()).start();
		case 6:
			imgsCount = 6;
			(new RerollImg()).start();
		case 7:
			imgsCount = 7;
			(new RerollImg()).start();
		case 8:
			imgsCount = 8;
			(new RerollImg()).start();
		case 9:
			imgsCount = 9;
			(new RerollImg()).start();
		}

		// -------------------------------하단 메뉴-----------------------------------------

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

	} // 생성자

	class RerollImg extends Thread {
		public void run() {
			while (true) {
				for (int i = 0; i < imgsCount; i++) {
					try {
						Thread.sleep(75);
						ImageIcon icon = new ImageIcon(imgs[i]);
						rerollImage.setIcon(icon);
//						n++;
//						if (n == count) {
//							Thread.interrupted();
//						}

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} // while
		}
	} // inner class

}// class