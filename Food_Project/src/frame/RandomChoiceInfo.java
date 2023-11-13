package frame;

import static frame.Constants.BACKGROUND_START;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import foodVO.FoodDAO;

public class RandomChoiceInfo extends JPanel {

	// 데이터베이스 객체, 인트 i 값, 음식 종류 가져옴
	public RandomChoiceInfo(FoodDAO foodDao, String categoryName, int i) {
		// 기본 프레임 세팅
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(585, 765);

		// 시작화면 이미지
		ImageIcon food = new ImageIcon(BACKGROUND_START);
		JLabel lblfood = new JLabel(food);
		lblfood.setSize(585, 675);
		lblfood.setLocation(0, 0);
		add(lblfood);

		// JLabel 공간에 데이터 베이스의 이미지 URL을 가져와 출력
		// 음식 설명 이미지
		JLabel imgFood = new JLabel(FoodHtmlUtils.imgHtmlParser(foodDao.Info().get(i).getImageUrl()));
		imgFood.setSize(545, 350);
		imgFood.setLocation(20, 20);
		add(imgFood);

		// JLabel로 만든 음식 설명란에 HTML로 작성하여 출력
		JLabel story = new JLabel("<HTML><body>" + "☆ 장소 : " + foodDao.Info().get(i).getPlaceName() + "<br>"
				+ "☆ 음식 종류 : " + foodDao.Info().get(i).getCategoryName() + "<br>" + "☆ 음식 이름 : "
				+ foodDao.Info().get(i).getFoodName() + "<br>" + "☆ 주소 : " + foodDao.Info().get(i).getAddressName()
				+ "<br>" + "☆ 매장 번호 : " + foodDao.Info().get(i).getPhone() + "</body></HTML>");
		story.setSize(580, 185);
		story.setLocation(20, 350);
		story.setBackground(new Color(255, 255, 255));
		story.setFont(new Font("고딕체", Font.BOLD, 20));
		add(story);

		// 예약 버튼
		JButton btnReservation = new JButton("예약하기");
		btnReservation.setBackground(new Color(100, 255, 255));
		btnReservation.setSize(150, 80);
		btnReservation.setLocation((int) imgFood.getLocation().getX(), (int) getLocation().getY() / 2 + 570);
		add(btnReservation);

		// 다시하기 버튼
		JButton btnRerolling = new JButton("다시하기");
		btnRerolling.setBackground(new Color(100, 255, 255));
		btnRerolling.setSize(150, 80);
		btnRerolling.setLocation(((int) getSize().getWidth() / 2) + 123, (int) getLocation().getY() / 2 + 570);
		add(btnRerolling);

		/// -----------------------------하단 메뉴-------------------------------------
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
				FoodBase.getInstance(new FoodRandom(foodDao));
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
