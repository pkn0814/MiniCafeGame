import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CafeGameIntro extends JFrame implements ActionListener{
	ImageIcon icon;
   JButton start, exp, c1, c2, c3, c4;
   JLabel label;
   JPanel p;
   public CafeGameIntro(){
      setTitle("카페 게임");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      getContentPane().setBackground(new Color(0xE6E0F8));
      
      JLabel jtitle = new JLabel("Apple Tree Cafe");
      jtitle.setFont(new Font("휴먼편지체", Font.BOLD, 25));

      start = new JButton("게임시작");
      start.addActionListener(this);
      exp = new JButton("게임설명");
      exp.addActionListener(this);
      
      setLayout(null);
      jtitle.setBounds(330,25,400,30);
      
      icon = new ImageIcon("start.png");

      p = new JPanel();
      p.setOpaque(false);
      p.add(new JLabel(icon));
      p.setBounds(180,70,500,400);

      start.setBounds(250,510,150,40);
      exp.setBounds(450,510,150,40);
      start.setFont(new Font("돋움체", Font.BOLD, 20));
      start.setBackground(new Color(0xF5A9F2));
      start.setForeground(Color.WHITE);
      exp.setFont(new Font("돋움체", Font.BOLD, 20));
      exp.setBackground(new Color(0xA9BCF5));
      exp.setForeground(Color.WHITE);

      add(p);
      add(jtitle);
      add(start);
      add(exp);

      setVisible(true);
      setResizable(false);
      setSize(900, 650);
   }
   
   public void actionPerformed(ActionEvent e){
      
      if (e.getSource() == start) {
         new KCafeOrder();
         this.setVisible(false);
         this.dispose();
      }
      else if (e.getSource() == exp) {
         new KCafeExp();
         this.setVisible(false);
         this.dispose();
      }
   }

   public static void main(String[] args){
      new CafeGameIntro();
   }
}