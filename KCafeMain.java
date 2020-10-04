import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//���� ȭ��
public class KCafeMain extends JFrame{
	JLabel msg, hint;
	String text;
	Container con = getContentPane();
	KCafeTimer t;
	Hint h;
	int f1, f2, f3, f4, f5 = 0;
	public KCafeMain() {
		super("���� ȭ��");
		con.setBackground(Color.white);
		con.setLayout(null);
		
		t = new KCafeTimer();
		t.start();
		
		JButton j1 = new JButton(new ImageIcon("coffeemachine.png"));
		j1.setBounds(0, 100, 300, 300);
		j1.setBorderPainted(false);
		j1.setContentAreaFilled(false);
		j1.setFocusPainted(false);
		JButton j7 = new JButton(new ImageIcon("milk.png"));
		j7.setBounds(350, 200, 200, 200);
		j7.setBorderPainted(false);
		j7.setContentAreaFilled(false);
		j7.setFocusPainted(false);
		JButton j2 = new JButton(new ImageIcon("sweet.png"));
		j2.setBounds(500, 210, 200, 200);
		j2.setBorderPainted(false);
		j2.setContentAreaFilled(false);
		j2.setFocusPainted(false);
		JButton j3 = new JButton(new ImageIcon("cream.png"));
		j3.setBounds(650, 200, 200, 200);
		j3.setBorderPainted(false);
		j3.setContentAreaFilled(false);
		j3.setFocusPainted(false);
		JButton j4 = new JButton(new ImageIcon("mix.png"));
		j4.setBounds(820, 180, 200, 200);
		j4.setBorderPainted(false);
		j4.setContentAreaFilled(false);
		j4.setFocusPainted(false);
		
		JLabel j5 = new JLabel(new ImageIcon("desk2.png"));
		j5.setBounds(0, 350, 1000, 300);
		JLabel j6 = new JLabel();
		j6.setOpaque(true);
		j6.setBackground(new Color(0xF7F2AB));
		j6.setBounds(500, 30, 450, 150);
		j6.setFont(new Font("�޸�����ü", Font.BOLD, 30));
		j6.setHorizontalAlignment(JLabel.CENTER);
		
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == j1) {
					j6.setText("Ŀ�� 1���� �߰��Ǿ����ϴ�.");
					f1 = 1;
				}
			}
		});
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == j2) {
					j6.setText("�÷��� �߰��Ǿ����ϴ�.");
					f2 = 1;
				}
			}
		});
		j3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == j3) {
					j6.setText("ũ���� �߰��Ǿ����ϴ�.");
					f3 = 1;
				}
			}
		});
		j4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == j4) {
					j6.setText("������ ����մϴ�.");
					f4 = 1;
				}
			}
		});
		j7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == j7) {
					j6.setText("������ �ֽ��ϴ�.");
					f5 = 1;
				}
			}
		});

		JButton key = new JButton("��Ʈ");
		key.setBounds(400, 30, 100, 40);
		key.setFont(new Font("����ü", Font.BOLD, 15));
	    key.setBackground(new Color(0xF5A9F2));
	    key.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == key) {
					key.setVisible(false);
					h = new Hint();
					h.start();
				}
			}
		});
		
		con.add(j1);
		con.add(j2);
		con.add(j3);
		con.add(j4);
		con.add(j5);
		con.add(j6);
		con.add(j7);
		con.add(key);
		
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public class KCafeTimer extends Thread{
		private int i = 7;
		public void run() {
			msg = new JLabel();
		    msg.setOpaque(true);
		    msg.setBackground(new Color(0xFE2E2E));
		    msg.setBounds(900, 500, 80, 50);
		    msg.setFont(new Font("����ü", Font.BOLD, 25));
		    msg.setForeground(Color.white);
		    msg.setHorizontalAlignment(JLabel.CENTER);
		    add(msg);
			while(true) {
				try {
					showSec();
					sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		public void check() {
			if(f1==1 && f2==0 && f3==0 && f4==0 && f5==0) {
				new Best();
				setVisible(false);
		        dispose();
			}
			else {
				new Worst();
				setVisible(false);
		        dispose();
			}
		}
		private void showSec() {
			msg.setText((i--) + "��");
			if(i==0) {
				check();
			}
		}

	}
	public class Hint extends Thread {
		public Hint() {
			hint = new JLabel();
			hint.setOpaque(true);
			hint.setBackground(new Color(255, 255, 255));
			hint.setBounds(400, 30, 100, 40);
			hint.setFont(new Font("�޸�����ü", Font.BOLD, 25));
			hint.setHorizontalAlignment(JLabel.CENTER);
			hint.setText(text);
		    add(hint);
		}
		
		@Override
		public void run() {
			try {
				text = "Ŀ�Ǽ� 1";
				hint.setText(text);
				sleep(200);
				text = " ";
				hint.setText(text);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new KCafeMain();
	}

}
