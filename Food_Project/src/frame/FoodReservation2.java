package frame;

import static frame.Constants.BACKGROUND_START;
import static frame.Constants.BTN_RESERVATION_COMPLETE;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import foodVO.FoodDAO;

public class FoodReservation2 extends JPanel {

	public FoodReservation2(FoodDAO foodDao, String categoryName, int i) {
		// 기본 프레임 세팅
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(585, 765);

		// JLabel 공간에 데이터 베이스의 이미지 URL을 가져와 출력
		// 음식 설명 이미지
		JLabel imgFood = new JLabel(FoodHtmlUtils.imgHtmlParser(foodDao.Info().get(i).getImageUrl()));
		imgFood.setSize(545, 350);
		imgFood.setLocation(20, 20);
		add(imgFood);

		JLabel choiceName = new JLabel("<HTML><body>" + "☆ 장소 : " + foodDao.Info().get(i).getPlaceName() + "<br>"
				+ "☆ 음식 이름 : "
				+ foodDao.Info().get(i).getFoodName() + "<br>" + "☆ 주소 : " + foodDao.Info().get(i).getAddressName()
				+ "<br>" + "☆ 번호 : " + foodDao.Info().get(i).getPhone() + "</body></HTML>");
		choiceName.setSize(545, 100);
		choiceName.setLocation(20, 380);
		choiceName.setBackground(Color.BLACK);
		choiceName.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 18));
		add(choiceName);

		// 현재시간을 밀리
		long time = System.currentTimeMillis();

		SimpleDateFormat dayTime = new SimpleDateFormat("MM월 dd일(EE)");
		String str = dayTime.format(new Date(time));

		Choice reserTime = new Choice();
		String[] timeSlot = { "시간대 선택", str + "09:00AM", str + "10:00AM", str + "11:00AM", str + "12:00PM",
				str + "13:00PM", str + "14:00PM", str + "15:00PM", str + "16:00PM", str + "17:00PM", str + "18:00PM",
				str + "19:00PM", str + "20:00PM" };// 스트링 배열(에약시간)

		for (int j = 0; j < timeSlot.length; j++) {
			reserTime.add(timeSlot[j]);
		}

		Choice NOpeople = new Choice();
		String[] NOpeopleList = { "인원수 선택", "1명", "2명", "3명", "4명", "5명", "6명", };// 스트링 배열(인원수)

		for (int j = 0; j < NOpeopleList.length; j++) {
			NOpeople.add(NOpeopleList[j]);
		}

		NOpeople.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 16));
		NOpeople.setSize(545, 30);
		NOpeople.setLocation(20, 490);
		add(NOpeople);

		reserTime.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 16));
		reserTime.setSize(545, 30);
		reserTime.setLocation(20, 530);
		add(reserTime);

		// 에약버튼
		ImageIcon imageReservation = new ImageIcon(BTN_RESERVATION_COMPLETE);
		JButton reserButton = new JButton(imageReservation);

		reserButton.setSize(250, 70);
		reserButton.setLocation((int) getSize().getWidth() / 2 - 130, 580);
		add(reserButton);

		reserButton.setBorderPainted(false);
		reserButton.setContentAreaFilled(false);
		reserButton.setFocusPainted(false);

		// 버튼액션
		reserButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (reserTime.getSelectedItem().equals("시간대 선택"))
					JOptionPane.showMessageDialog(null, "시간대를 선택해 주세요");
				else {
					if (NOpeople.getSelectedItem().equals("인원수 선택")) {
						JOptionPane.showMessageDialog(null, "인원수를 선택해 주세요");
					} else {
						JOptionPane.showMessageDialog(null,
								reserTime.getSelectedItem() + "\n" + NOpeople.getSelectedItem() + "\n" + "예약되었습니다.");
						FoodBase.getDispose();
						FoodBase.getInstance(new FoodBegin());
					}
				}
			}
		});

		// 하단 버튼
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
				FoodBase.getInstance(new FoodCategory(new FoodDAO()));
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
