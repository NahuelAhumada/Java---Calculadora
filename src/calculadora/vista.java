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
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
		this.setTitle("Calculadora");
		this.setLocationRelativeTo(null);
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
		
		JButton botonC = new JButton("C");
		botonC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(botonC);
		
		JButton botonRaiz = new JButton("\u221A");
		botonRaiz.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonRaiz);
		
		JButton botonDivision = new JButton("/");
		botonDivision.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(botonDivision);
		
		JButton botonCE = new JButton("CE");
		botonCE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonCE);
		
		JButton boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton9);
		
		JButton botonMultiplicacion = new JButton("X");
		botonMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonMultiplicacion);
		
		JButton boton4 = new JButton("4");
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton6);
		
		JButton botonResta = new JButton("-");
		botonResta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonResta);
		
		JButton boton1 = new JButton("1");
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton3);
		
		JButton botonSuma = new JButton("+");
		botonSuma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonSuma);
		
		JButton botonMasMenos = new JButton("+/-");
		botonMasMenos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonMasMenos);
		
		JButton boton0 = new JButton("0");
		boton0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(boton0);
		
		JButton botonPunto = new JButton(".");
		botonPunto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonPunto);
		
		JButton botonIgual = new JButton("=");
		botonIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(botonIgual);
		
		JLabel labelNumero = new JLabel("0");
		labelNumero.setFont(new Font("Tahoma", Font.PLAIN, 36));
		labelNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNumero.setBounds(0, 35, 296, 70);
		contentPane.add(labelNumero);
		
		JLabel labelCuentaRealizada = new JLabel("");
		labelCuentaRealizada.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCuentaRealizada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelCuentaRealizada.setBounds(0, 0, 296, 40);
		contentPane.add(labelCuentaRealizada);
		
		
	}
}
