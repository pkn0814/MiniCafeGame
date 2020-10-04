import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Best extends JFrame {
	JLabel best, bmsg;
	public Best() {
		setTitle("두근 두근 점수는~?");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    getContentPane().setBackground(new Color(0xECCEF5));
	      
		setLayout(null);
		
		best = new JLabel(new ImageIcon("girl.png"));
		best.setBounds(150, 100, 300, 300);
		add(best);
		bmsg = new JLabel(new ImageIcon("bestmsg.png"));
		bmsg.setBounds(400, 70, 600, 400);
		add(bmsg);
		
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
		new Best();
	}

}
