import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KCafeOrder extends JFrame implements ActionListener {
	JButton c1, c2, c3, c4;
	JLabel comment;
	Dialog d;
	String text;
	public KCafeOrder() {
		setTitle("카페 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255,255, 255));
		setLayout(null);
		
		d = new Dialog();
		d.start();
		
		JLabel empl = new JLabel(new ImageIcon("man.png"));
		empl.setBounds(600, 50, 300, 400);
		add(empl);
		
		c1 = new JButton(new ImageIcon("coffee.png"));
		c1.addActionListener(this);
	    c1.setBounds(0, 0, 300, 230);
	    c1.setBorderPainted(false);
	    c1.setContentAreaFilled(false);
	    c1.setFocusPainted(false);
	    
	    c2 = new JButton(new ImageIcon("choco.png"));
	    c2.setBounds(200, 0, 300, 250);
	    c2.setBorderPainted(false);
	    c2.setContentAreaFilled(false);
	    c2.setFocusPainted(false);
	    c2.addActionListener(this);
	    c3 = new JButton(new ImageIcon("greentee.png"));
	    c3.setBounds(0, 215, 300, 300);
	    c3.setBorderPainted(false);
	    c3.setContentAreaFilled(false);
	    c3.setFocusPainted(false);
	    c3.addActionListener(this);
	    c4 = new JButton(new ImageIcon("berry.png"));
	    c4.setBounds(200, 200, 300, 330);
	    c4.setBorderPainted(false);
	    c4.setContentAreaFilled(false);
	    c4.setFocusPainted(false);
	    c4.addActionListener(this);
		
	    add(c1);
	    add(c2);
	    add(c3);
	    add(c4);
	    
		setVisible(true);
		setSize(1000, 600);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == c1) {
			new KCafeMain();
	        this.setVisible(false);
	        this.dispose();
		}
		else if (e.getSource() == c2) {
			new KCafeMain2();
	        this.setVisible(false);
	        this.dispose();
		}
		else if (e.getSource() == c3) {
			new KCafeMain2();
	        this.setVisible(false);
	        this.dispose();
		}
		else if (e.getSource() == c4) {
			new KCafeMain2();
	        this.setVisible(false);
	        this.dispose();
		}
	    	  
	}
	
	class Dialog extends Thread{
		public Dialog() {
			comment = new JLabel();
		    comment.setOpaque(true);
		    comment.setBackground(new Color(0xF7F2AB));
		    comment.setBounds(20, 500, 940, 50);
		    comment.setFont(new Font("휴먼편지체", Font.BOLD, 25));
		    comment.setHorizontalAlignment(JLabel.CENTER);
		    comment.setText(text);
		    add(comment);
		}
		
		@Override
		public void run() {
			try {
				text = "경나 카페에 오신 걸 환영합니다!";
				comment.setText(text);
				sleep(2500);
				text = "어떤 메뉴를 주문하시겠어요?";
				comment.setText(text);
				sleep(2500);
				text = "참고로 전 프라푸치노 좋아해요~ 달달하니까요!";
				comment.setText(text);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new KCafeOrder();
	}
}

