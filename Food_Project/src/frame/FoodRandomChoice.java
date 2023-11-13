package frame;

import static frame.Constants.BACKGROUND_ALL; 
import static frame.Constants.BTN_RESERVATION;
import static frame.Constants.BTN_REROLL;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import foodVO.FoodDAO;

public class FoodRandomChoice extends JPanel {

   // 랜덤 값 넣을 변수 ChoiceNum = cNUm 선언
   private static int cNum;
   static String menuCategory ;
   public FoodRandomChoice() {

   }

   public FoodRandomChoice(FoodDAO foodDao, String categoryName) {
      setBackground(new Color(255, 192, 203));
      setLayout(null);
      setSize(585, 765);


      int i = 0;

      switch (categoryName) {
      case "한식": {
         i = (int) new Random().nextInt(10);
         makePlaceInfo(foodDao, i);
         break;
      }
      case "중식": {
         i = (int) new Random().nextInt(10) + 10;
         makePlaceInfo(foodDao, i);
         break;
      }
      case "일식": {
         i = (int) new Random().nextInt(10) + 20;
         makePlaceInfo(foodDao, i);
         break;
      }
      case "양식": {
         i = (int) new Random().nextInt(10) + 30;
         makePlaceInfo(foodDao, i);
         break;
      }
      case "전체": {
         i = (int) new Random().nextInt(40);
         makePlaceInfo(foodDao, i);
         break;
      }
      }

      cNum = i;
      menuCategory = foodDao.Info().get(cNum).getCategoryName();
      
      
      // 예약 버튼
      JButton btnReservation = new JButton(new ImageIcon(BTN_RESERVATION));
      btnReservation.setBackground(new Color(100, 255, 255));
      btnReservation.setSize(150, 80);
      btnReservation.setLocation(20, (int) getLocation().getY() / 2 + 570);
      add(btnReservation);

      // 다시하기 버튼
      JButton btnRerolling = new JButton(new ImageIcon(BTN_REROLL));
      btnRerolling.setBackground(new Color(100, 255, 255));
      btnRerolling.setSize(150, 80);
      btnRerolling.setLocation(((int) getSize().getWidth() / 2) + 123, (int) getLocation().getY() / 2 + 570);
      add(btnRerolling);

      btnReservation.setBorderPainted(false);
      btnReservation.setContentAreaFilled(false);
      btnReservation.setFocusPainted(false);
      btnRerolling.setBorderPainted(false);
      btnRerolling.setContentAreaFilled(false);
      btnRerolling.setFocusPainted(false);
      
      btnReservation.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            FoodBase.getDispose();
            FoodBase.getInstance(new FoodReservation(foodDao, menuCategory, cNum));
         }
      });

      btnRerolling.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            FoodBase.getDispose();
            FoodBase.getInstance(new FoodRandomChoice(foodDao, menuCategory));
         }
      });

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

   } // 생성자1 (매개변수 = foodDao, categoryName)

//--------------------------------------------------------------------------
   
   
   

   // 생성자2 시작 (매개변수 = foodDao, categoryName, cNum)
   public FoodRandomChoice(FoodDAO foodDao, String categoryName, int i) {

      // JPanel 구조
      setBackground(new Color(255, 241, 54));
      setLayout(null);
      setSize(585, 765);


      foodDao.Info().get(cNum).getFoodContents();

      while (true) {
         // 0 ~ DB 객체 갯수 사이의 랜덤 값 대입
         cNum = i;

         // 객체의 cNum 번째의 음식 종류가 생성자에서 받은 음식종류와 같다면
         if (foodDao.Info().get(cNum).getCategoryName().equals(categoryName)) {
            makePlaceInfo(foodDao, cNum);
            break;
         } else
            continue;
      }

      JButton btnReservation = new JButton(new ImageIcon(BTN_RESERVATION));
      btnReservation.setBackground(new Color(100, 255, 255));
      btnReservation.setSize(150, 80);
      btnReservation.setLocation(20, (int) getLocation().getY() / 2 + 570);

      add(btnReservation);

      JButton btnRerolling = new JButton(new ImageIcon(BTN_REROLL));
      btnRerolling.setBackground(new Color(100, 255, 255));
      btnRerolling.setSize(150, 80);
      btnRerolling.setLocation(((int) getSize().getWidth() / 2) + 123, (int) getLocation().getY() / 2 + 570);

      add(btnRerolling);

      btnReservation.setBorderPainted(false);
      btnReservation.setContentAreaFilled(false);
      btnReservation.setFocusPainted(false);
      btnRerolling.setBorderPainted(false);
      btnRerolling.setContentAreaFilled(false);
      btnRerolling.setFocusPainted(false);
      
      btnReservation.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            FoodBase.getDispose();
            FoodBase.getInstance(new FoodReservation(foodDao, categoryName, cNum));
         }
      });

      btnRerolling.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            FoodBase.getDispose();
            FoodBase.getInstance(new FoodRandomChoice(foodDao, categoryName));
         }
      });

//---------------------------------- 하단 버튼------------------------------

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
   

   // 데이터베이스, 랜덤 범위 값 i를 받아 i번째 이미지와 설명 출력
   public void makePlaceInfo(FoodDAO foodDao, int i) {

      // JLabel 공간에 데이터 베이스의 i번째 이미지 URL을 가져와 이미지 띄움
      JLabel imgFood = new JLabel(FoodHtmlUtils.imgHtmlParser(foodDao.Info().get(i).getImageUrl()));
      imgFood.setSize(545, 350);
      imgFood.setLocation(20, 20);
      add(imgFood);

      // JLabel로 만든 음식 설명란에 html 이용해 i번째 객체의 내용들 출력
      JLabel story = new JLabel("<HTML><body>" + "☆ 장소 : " + foodDao.Info().get(i).getPlaceName() + "<br>"
            + "☆ 음식 종류 : " + foodDao.Info().get(i).getCategoryName() + "<br>" + "☆ 음식 이름 : "
            + foodDao.Info().get(i).getFoodName() + "<br>" + "☆ 주소 : " + foodDao.Info().get(i).getAddressName()
            + "<br>" + "☆ 번호 : " + foodDao.Info().get(i).getPhone() + "</body></HTML>");
      story.setSize(580, 185);
      story.setLocation(20, 370);
      story.setBackground(new Color(255, 255, 255));
      story.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 20));
      add(story);
   }

}