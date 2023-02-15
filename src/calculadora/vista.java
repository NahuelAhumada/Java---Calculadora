package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class vista extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 464);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 104, 296, 323);
		contentPane.add(panel);
		
		panel.setLayout(new GridLayout(5, 4, 0, 0));
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u221A");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_7_3 = new JButton("/");
		btnNewButton_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_7_3);
		
		JButton btnNewButton_7_8 = new JButton("CE");
		panel.add(btnNewButton_7_8);
		
		JButton btnNewButton_3 = new JButton("7");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("9");
		panel.add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("X");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7_1 = new JButton("4");
		panel.add(btnNewButton_7_1);
		
		JButton btnNewButton_5 = new JButton("5");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("6");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_7_2 = new JButton("-");
		panel.add(btnNewButton_7_2);
		
		JButton btnNewButton_7_5 = new JButton("1");
		panel.add(btnNewButton_7_5);
		
		JButton btnNewButton_7_9 = new JButton("2");
		panel.add(btnNewButton_7_9);
		
		JButton btnNewButton_7_4 = new JButton("3");
		panel.add(btnNewButton_7_4);
		
		JButton btnNewButton_7_6 = new JButton("+");
		panel.add(btnNewButton_7_6);
		
		JButton btnNewButton_7_7 = new JButton("+/-");
		panel.add(btnNewButton_7_7);
		
		JButton btnNewButton_7_10 = new JButton("0");
		panel.add(btnNewButton_7_10);
		
		JButton btnNewButton_7_11 = new JButton(".");
		panel.add(btnNewButton_7_11);
		
		JButton btnNewButton_7_12 = new JButton("=");
		btnNewButton_7_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_7_12);
		
		
	}
}
