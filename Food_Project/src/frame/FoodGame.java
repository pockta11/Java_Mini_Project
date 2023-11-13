package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import foodVO.FoodDAO;

import static frame.Constants.BACKGROUND_ALL;
import static frame.Constants.BTN_PERSON2;
import static frame.Constants.BTN_PERSON3;
import static frame.Constants.BTN_PERSON4;
import static frame.Constants.BTN_PERSON5;
import static frame.Constants.BTN_PERSON6;
import static frame.Constants.BTN_PERSON7;

public class FoodGame extends JPanel {

   public FoodGame() {
      // JPanel 구조
      setBackground(new Color(245, 245, 220));
      setLayout(null);
      setSize(585, 765);
      
      JLabel gameInfo = new JLabel("<html><body style='text-align:center;'>★ 총 인원수를 선택하세요 ★"
      		+ "<br/> </body></html>",JLabel.CENTER);
      gameInfo.setSize(530, 100);
      gameInfo.setLocation(20, 50);
      gameInfo.setBackground(Color.black);
      gameInfo.setFont(new Font("여기어때 잘난체", Font.BOLD, 28));
      add(gameInfo);
      
      

      // -------------------------------------------------------------------------------------


         ImageIcon person2 = new ImageIcon(BTN_PERSON2);
         ImageIcon person3 = new ImageIcon(BTN_PERSON3);
         ImageIcon person4 = new ImageIcon(BTN_PERSON4);
         ImageIcon person5 = new ImageIcon(BTN_PERSON5);
         ImageIcon person6 = new ImageIcon(BTN_PERSON6);
         ImageIcon person7 = new ImageIcon(BTN_PERSON7);
        

         JButton btnPerson2 = new JButton(person2);
         JButton btnPerson3 = new JButton(person3);
         JButton btnPerson4 = new JButton(person4);
         JButton btnPerson5 = new JButton(person5);
         JButton btnPerson6 = new JButton(person6);
         JButton btnPerson7 = new JButton(person7);
         
         
         

         btnPerson2.setSize(120, 100);
         btnPerson3.setSize(120, 100);
         btnPerson4.setSize(120, 100);
         btnPerson5.setSize(120, 100);
         btnPerson6.setSize(120, 100);
         btnPerson7.setSize(120, 100);
         
         btnPerson2.setLocation(((int) getSize().getWidth() / 2 - 170), (int) getLocation().getY() / 2 + 150);

         btnPerson3.setLocation((int) btnPerson2.getLocation().getX() + 220, (int) btnPerson2.getLocation().getY());

         btnPerson4.setLocation(((int) btnPerson2.getLocation().getX()), (int) btnPerson2.getLocation().getY() + 160);
        
         btnPerson5.setLocation((int) btnPerson4.getLocation().getX() + 220, (int) btnPerson4.getLocation().getY());

         btnPerson6.setLocation(((int) btnPerson4.getLocation().getX()), (int) btnPerson4.getLocation().getY() + 160);

         btnPerson7.setLocation((int) btnPerson6.getLocation().getX() + 220, (int) btnPerson6.getLocation().getY());
         
         JLabel label2 = new JLabel("2명",JLabel.CENTER);
         JLabel label3 = new JLabel("3명",JLabel.CENTER);
         JLabel label4 = new JLabel("4명",JLabel.CENTER);
         JLabel label5 = new JLabel("5명",JLabel.CENTER);
         JLabel label6 = new JLabel("6명",JLabel.CENTER);
         JLabel label7 = new JLabel("7명",JLabel.CENTER);

         label2.setSize(120, 30);
         label3.setSize(120, 30);
         label4.setSize(120, 30);
         label5.setSize(120, 30);
         label6.setSize(120, 30);
         label7.setSize(120, 30);
         
         label2.setFont(new Font("굴림", Font.BOLD, 26));
         label3.setFont(new Font("굴림", Font.BOLD, 26));
         label4.setFont(new Font("굴림", Font.BOLD, 26));
         label5.setFont(new Font("굴림", Font.BOLD, 26));
         label6.setFont(new Font("굴림", Font.BOLD, 26));
         label7.setFont(new Font("굴림", Font.BOLD, 26));
         
         label2.setLocation((int) btnPerson2.getLocation().getX(),(int) btnPerson2.getLocation().getY()+100);
         
         label3.setLocation((int) btnPerson3.getLocation().getX(),(int) btnPerson2.getLocation().getY()+100);
         
         label4.setLocation((int) btnPerson2.getLocation().getX(),(int) btnPerson4.getLocation().getY()+100);
         
         label5.setLocation((int) btnPerson3.getLocation().getX(),(int) btnPerson4.getLocation().getY()+100);
         
         label6.setLocation((int) btnPerson2.getLocation().getX(),(int) btnPerson6.getLocation().getY()+100);
         
         label7.setLocation((int) btnPerson3.getLocation().getX(),(int) btnPerson6.getLocation().getY()+100);
         
         add(btnPerson2);
         add(btnPerson3);
         add(btnPerson4);
         add(btnPerson5);
         add(btnPerson6);
         add(btnPerson7);
         
         add(label2);
         add(label3);
         add(label4);
         add(label5);
         add(label6);
         add(label7);
         
         // 게임 구현
         
         btnPerson2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               FoodBase.getDispose();
               FoodBase.getInstance(new FoodGameIn(2));
            }
         });
         
         btnPerson3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	FoodBase.getDispose();
                FoodBase.getInstance(new FoodGameIn(3));
            }
         });
         
         btnPerson4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	FoodBase.getDispose();
                FoodBase.getInstance(new FoodGameIn(4));
            }
         });
         
         btnPerson5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	FoodBase.getDispose();
                FoodBase.getInstance(new FoodGameIn(5));
            }
         });
         
         btnPerson6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	FoodBase.getDispose();
                FoodBase.getInstance(new FoodGameIn(6));
            }
         });
         
         btnPerson7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	FoodBase.getDispose();
                FoodBase.getInstance(new FoodGameIn(7));
            }
         });
         
         btnPerson2.setBorderPainted(false);
         btnPerson2.setContentAreaFilled(false);
         btnPerson2.setFocusPainted(false);
         
         btnPerson3.setBorderPainted(false);
         btnPerson3.setContentAreaFilled(false);
         btnPerson3.setFocusPainted(false);
         
         btnPerson4.setBorderPainted(false);
         btnPerson4.setContentAreaFilled(false);
         btnPerson4.setFocusPainted(false);
         
         btnPerson5.setBorderPainted(false);
         btnPerson5.setContentAreaFilled(false);
         btnPerson5.setFocusPainted(false);
         
         btnPerson6.setBorderPainted(false);
         btnPerson6.setContentAreaFilled(false);
         btnPerson6.setFocusPainted(false);
         
         btnPerson7.setBorderPainted(false);
         btnPerson7.setContentAreaFilled(false);
         btnPerson7.setFocusPainted(false);
   

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
         
         
      }// 생성자

   }