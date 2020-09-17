package reto_0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class alarmas_calefaccion {

	private JFrame frame;
	private final JPanel panel_piso1 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alarmas_calefaccion window = new alarmas_calefaccion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public alarmas_calefaccion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel_piso1.setBounds(10, 10, 800, 600);
		frame.getContentPane().add(panel_piso1);
		panel_piso1.setLayout(null);
		
		JButton btn_calefaccion = new JButton("Calefacci\u00F3n");
		btn_calefaccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_calefaccion.setBounds(616, 461, 116, 62);
		panel_piso1.add(btn_calefaccion);
		
		JButton btn_alarmas = new JButton("Alarmas\r\n");
		btn_alarmas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_alarmas.setBounds(616, 389, 116, 62);
		panel_piso1.add(btn_alarmas);
		
		JLabel lbl_piso1 = new JLabel("Piso 1");
		lbl_piso1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_piso1.setBounds(20, 121, 52, 24);
		panel_piso1.add(lbl_piso1);
		
		JButton btn_subir_p1 = new JButton("New button");
		btn_subir_p1.setBounds(0, 10, 50, 85);
		panel_piso1.add(btn_subir_p1);
		btn_subir_p1.setIcon(new ImageIcon("../reto_0/imagenes/flecha_arriba.png")); 

		
		
		JButton btn_bajar_p1 = new JButton("New button");
		btn_bajar_p1.setBounds(0, 172, 50, 85);
		panel_piso1.add(btn_bajar_p1);
		btn_bajar_p1.setIcon(new ImageIcon("../reto_0/imagenes/flecha_abajo.png"));
		
		JButton btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 164, 50);
		panel_piso1.add(btn_llamada_de_emergencia);
	}
}
