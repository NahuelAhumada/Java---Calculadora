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
import javax.swing.UIManager;

public class vista extends JFrame {
	//Variables de label para mostrar la operación matematica
	private String cadenaNumeros = "";
	private String operacion = "nula";
	private double primerNumero, resultado;
	private boolean activado = true;
	private boolean punto = true; 
	//Variables Label
	JLabel labelNumero;
	JLabel labelCuentaRealizada;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//Modelo de vista
		try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
 
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
		
		
		//JPanel para los numeros
		JPanel panel = new JPanel();
		panel.setBounds(0, 104, 296, 323);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 4, 0, 0));
		
		//label para mostrar los numeros que se van escribiendo y el resultado de la cuenta
		labelNumero = new JLabel("0");
		labelNumero.setFont(new Font("Tahoma", Font.PLAIN, 36));
		labelNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNumero.setBounds(0, 35, 296, 70);
		contentPane.add(labelNumero);
		//label para mostra la cuenta una vez que se realiza
		labelCuentaRealizada = new JLabel("");
		labelCuentaRealizada.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCuentaRealizada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelCuentaRealizada.setBounds(0, 0, 296, 40);
		contentPane.add(labelCuentaRealizada);
		
		//Boton de cleaner (C)
		JButton botonC = new JButton("C");
		botonC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelCuentaRealizada.setText("");
				labelNumero.setText("0");
				cadenaNumeros = "";
				operacion = "nula";
				activado = true;
				punto = true;
			}
		});
		panel.add(botonC);
		
		//Boton de raiz
		JButton botonRaiz = new JButton("\u221A");
		botonRaiz.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					labelCuentaRealizada.setText("sqrt("+cadenaNumeros+")");
					resultado = Math.sqrt(primerNumero);
					labelNumero.setText(String.format("%.2f", resultado));
					cadenaNumeros = String.valueOf(resultado);
					punto=true;
				}
			}
		});
		panel.add(botonRaiz);
		
		//Boton de division '/'
		JButton botonDivision = new JButton("\u00F7");
		botonDivision.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					labelCuentaRealizada.setText(cadenaNumeros + " \u00F7 ");
					cadenaNumeros = "";
					operacion = "division";
					activado=false;
					punto=true;
				}
			}
		});
		panel.add(botonDivision);
		
		//Boton de borrado a la izquierda (<-)
		JButton botonCE = new JButton("<-");
		botonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamanio = cadenaNumeros.length(); 
				if(tamanio > 0) {
					if (tamanio == 1) {
						cadenaNumeros = "0";
					}else {
						cadenaNumeros=cadenaNumeros.substring(0, tamanio -1);
					}
				}
				labelNumero.setText(cadenaNumeros);
			}
		});
		botonCE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonCE);
		
		//Boton numero 7
		JButton boton7 = new JButton("7");
		boton7.setBackground(new Color(221, 221, 221));
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 7);
			}
		});
		panel.add(boton7);
		
		//Boton 8
		JButton boton8 = new JButton("8");
		boton8.setBackground(new Color(221, 221, 221));
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 8);
			}
		});
		panel.add(boton8);
		//Boton 9
		JButton boton9 = new JButton("9");
		boton9.setBackground(new Color(221, 221, 221));
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 9);
			}
		});
		panel.add(boton9);
		
		//Boton de multiplicar X
		JButton botonMultiplicacion = new JButton("X");
		botonMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					labelCuentaRealizada.setText(cadenaNumeros + " X ");
					cadenaNumeros = "";
					operacion = "multiplicacion";
					activado=false;
					punto=true;
				}
			}
		});
		panel.add(botonMultiplicacion);
		
		//Boton 4
		JButton boton4 = new JButton("4");
		boton4.setBackground(new Color(221, 221, 221));
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 4);
			}
		});
		panel.add(boton4);
		
		//Boton 5
		JButton boton5 = new JButton("5");
		boton5.setBackground(new Color(221, 221, 221));
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 5);
			}
		});
		panel.add(boton5);
		
		//Boton 6
		JButton boton6 = new JButton("6");
		boton6.setBackground(new Color(221, 221, 221));
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 6);
			}
		});
		panel.add(boton6);
		
		//Boton de resta
		JButton botonResta = new JButton("-");
		botonResta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					labelCuentaRealizada.setText(cadenaNumeros + " - ");
					cadenaNumeros = "";
					operacion = "resta";
					activado=false;
					punto=true;
				}
			}
		});
		panel.add(botonResta);
		
		//Boton 1
		JButton boton1 = new JButton("1");
		boton1.setBackground(new Color(221, 221, 221));
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 1);
			}
		});
		panel.add(boton1);
		
		//Boton 2
		JButton boton2 = new JButton("2");
		boton2.setBackground(new Color(221, 221, 221));
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 2);
			}
		});
		panel.add(boton2);
		
		//Boton 3
		JButton boton3 = new JButton("3");
		boton3.setBackground(new Color(221, 221, 221));
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 3);
			}
		});
		panel.add(boton3);
		
		//Boton de Suma (+)
		JButton botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(activado) {
					primerNumero = Double.parseDouble(cadenaNumeros);
					labelCuentaRealizada.setText(cadenaNumeros + " + ");
					cadenaNumeros = "";
					operacion = "suma";
					activado=false;
					punto=true;
				}
			}
		});
		botonSuma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonSuma);
		
		//Boton mas menos +/- para cambio de signo
		JButton botonMasMenos = new JButton("+/-");
		botonMasMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cadenaNumeros.charAt(0) != '-') {
					cadenaNumeros = "-" + cadenaNumeros;
				}else {
					cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
				}
				labelNumero.setText(cadenaNumeros);
			}
		});
		botonMasMenos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonMasMenos);
		
		//Boton 0
		JButton boton0 = new JButton("0");
		boton0.setBackground(new Color(221, 221, 221));
		boton0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarNumero(labelNumero, 0);
			}
		});
		panel.add(boton0);
		
		//Boton de punto (.)
		JButton botonPunto = new JButton(".");
		botonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(punto) {
					if(cadenaNumeros.equals("")) {
						cadenaNumeros = "0.";
					}else {
						cadenaNumeros += ".";
					}
					labelNumero.setText(cadenaNumeros);
					punto=false;
				}
			}
		});
		botonPunto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(botonPunto);
		
		//Boton de igual
		JButton botonIgual = new JButton("=");
		botonIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonIgualActionPerformed(labelNumero,labelCuentaRealizada);
			}
		});
		panel.add(botonIgual);
		
		
	}
	private void agregarNumero(JLabel labelNumero, Integer numero) {
		if(labelNumero.getText().equals("0")) {
			cadenaNumeros = numero.toString();
		}else {
			cadenaNumeros += numero.toString();
		}
		labelNumero.setText(cadenaNumeros);
		activado=true;
	}
	private void botonIgualActionPerformed(JLabel labelNumero, JLabel labelCuentaRealizada) {
		double segundoNumero;
		if(operacion.equals("nula")) {
			labelNumero.setText(cadenaNumeros);
		}else if(operacion.equals("suma")) {
			labelCuentaRealizada.setText(labelCuentaRealizada.getText() + cadenaNumeros);
			segundoNumero = Double.parseDouble(cadenaNumeros);
			resultado= primerNumero + segundoNumero;
			labelNumero.setText(String.format("% .2f",resultado));
			cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
		}else if(operacion.equals("resta")) {
			labelCuentaRealizada.setText(labelCuentaRealizada.getText() + cadenaNumeros);
			segundoNumero = Double.parseDouble(cadenaNumeros);
			resultado= primerNumero - segundoNumero;
			labelNumero.setText(String.format("% .2f",resultado));
			cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
		}else if(operacion.equals("multiplicacion")) {
			labelCuentaRealizada.setText(labelCuentaRealizada.getText() + cadenaNumeros);
			segundoNumero = Double.parseDouble(cadenaNumeros);
			resultado= primerNumero * segundoNumero;
			labelNumero.setText(String.format("% .2f",resultado));
			cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
		}
		else if(operacion.equals("division")) {
			labelCuentaRealizada.setText(labelCuentaRealizada.getText() + cadenaNumeros);
			segundoNumero = Double.parseDouble(cadenaNumeros);
			if(segundoNumero == 0) {
				labelNumero.setText("No divida por 0");
			}else {
				resultado= primerNumero / segundoNumero;
				labelNumero.setText(String.format("% .2f",resultado));
				cadenaNumeros = String.valueOf(resultado);
	            operacion = "nula";
			}
			
		}
		activado=true;
		punto=true;
	}
	
}
