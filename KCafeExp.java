import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class KCafeExp extends JFrame {
	JLabel exp;
	public KCafeExp() {
		setTitle("설명");
		setLayout(null);
		getContentPane().setBackground(new Color(0xF6DE53));
		
		exp = new JLabel(new ImageIcon("cafeexp.png"));
		exp.setSize(800, 400);
		exp.setLocation(0, 0);
		add(exp);
		
		JButton bt1 = new JButton("게임 시작");
		bt1.setFont(new Font("돋움체", Font.BOLD, 20));
		bt1.setBackground(new Color(0x8181F7));
		bt1.setForeground(Color.WHITE);
		bt1.setBounds(330,400,150,40);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == bt1) {
					new KCafeOrder();
					setVisible(false);
			        dispose();
				}
			}
		});
		add(bt1);
		
		setSize(800, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new KCafeExp();
	}

}
