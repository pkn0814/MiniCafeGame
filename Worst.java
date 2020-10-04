import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Worst extends JFrame {
	JLabel bad, wmsg;
	public Worst() {
		setTitle("두근 두근 점수는~?");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    getContentPane().setBackground(new Color(0xA9BCF5));
	      
		setLayout(null);
		
		bad = new JLabel(new ImageIcon("girlsad.png"));
		bad.setBounds(150, 100, 300, 300);
		add(bad);
		wmsg = new JLabel(new ImageIcon("worstmsg.png"));
		wmsg.setBounds(400, 70, 600, 400);
		add(wmsg);
		
		JButton bt1 = new JButton("다시하기");
		bt1.setBounds(300,510,150,40);
		bt1.setFont(new Font("돋움체", Font.BOLD, 20));
	    bt1.setBackground(new Color(0xF5A9F2));
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

		JButton bt2 = new JButton("종료하기");
		bt2.setBounds(500,510,150,40);
		bt2.setFont(new Font("돋움체", Font.BOLD, 20));
	    bt2.setBackground(new Color(0xA9A9F5));
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == bt2) {
					System.exit(0);
				}
			}
		});
		add(bt2);
		
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Worst();
	}

}
