package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import static frame.Constants.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FoodGameInput extends JPanel {

   public FoodGameInput(int personNum) {
      // JPanel 구조
      setBackground(new Color(245, 245, 220));
      setLayout(null);
      setSize(585, 765);
      ImageIcon img = new ImageIcon(PICK_1);
      JLabel label = new JLabel((int)(Math.random() * personNum) + 1 + "번 당첨 !!",JLabel.CENTER);
      JLabel label1 = new JLabel(img,JLabel.CENTER);
      
      
      
      label.setLocation(150, 150); // 랜덤위치에 label 붙이기
      label.setSize(300, 300); // label 크기 설정
      label.setFont(new Font("한컴 고딕 Bold", Font.BOLD, 40));
      add(label);
      
      label1.setLocation(150, 150); // 랜덤위치에 label 붙이기
      label1.setSize(300, 300); // label 크기 설정
      add(label1);
      
//---------------------------------------------------------------------------------하단메뉴
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
      
      
      
   
   private BufferedImage Image(String string) {
      // TODO Auto-generated method stub
      return null;
   }
}