package reto_0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal3 {

	private JFrame frame;
	private final JPanel panel_piso2 = new JPanel();
	private JPanel panel_alarmas;
	private JButton btn_calefaccion;
	private JButton btn_alarmas;
	private JLabel lbl_piso3;
	private JButton btn_subir_p1;
	private JButton btn_bajar_p1;
	private JButton btn_llamada_de_emergencia;
	private JLabel lbl_plano_piso_0;
	private JLabel lbl_cl_026;
	private JLabel lbl_cl_202_a;
	private JLabel lbl_cl_218_a;
	private JLabel lbl_cl_207_a;
	private JLabel lbl_cl_217_a;
	private JLabel lbl_cl_216_a;
	private JLabel lbl_cl_215_a;
	private JLabel lbl_cl_209_a;
	private JLabel lbl_cl_211_a;
	private JLabel lbl_cl_203_a;
	private JLabel lbl_cl_213_a;
	private JLabel lbl_cl_220_a;
	private JLabel lbl_cl_214_a;
	private JLabel lbl_cl_212_a;
	private JLabel lbl_cl_210_a;
	private JLabel lbl_cl_208_a;
	private JLabel lbl_cl_201_a;
	private JLabel lbl_cl_204_a;
	private JLabel lbl_cl_205_a;
	private JLabel lbl_cl_206_a;
	private JLabel lbl_img_piso0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal3 window = new principal3();
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
	public principal3() {
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
		panel_piso2.setBounds(10, 10, 800, 600);
		frame.getContentPane().add(panel_piso2);
		panel_piso2.setLayout(null);
		ArrayList<JLabel> label = new ArrayList<JLabel>(); 

		
		
		Image img_plano2 = new ImageIcon(("../reto_0/imagenes/Planta2.png")).getImage();
	   	Image newimg_plano2 = img_plano2.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano2 = new ImageIcon(newimg_plano2);
	   	
	   	
	   	Image luz_verde=new ImageIcon(("../reto_0/imagenes/verde.jpg")).getImage();
	   	Image tamañoLV=luz_verde.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon luz_verde_escalada=new ImageIcon(tamañoLV);
	   	
	   	Image luz_roja=new ImageIcon(("../reto_0/imagenes/señal_roja.jpg")).getImage();
	   	Image tamañoLR=luz_roja.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon luz_roja_escalada=new ImageIcon(tamañoLR);
				
		lbl_piso3 = new JLabel("Piso 1");
		lbl_piso3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_piso3.setBounds(20, 121, 52, 24);
		panel_piso2.add(lbl_piso3);
				
		btn_alarmas = new JButton("Alarmas\r\n");
		btn_alarmas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_alarmas.setBounds(616, 389, 116, 62);
		panel_piso2.add(btn_alarmas);
				
		btn_calefaccion = new JButton("Calefacci\u00F3n");
		btn_calefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas.setVisible(false);
			}
		});
		btn_calefaccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_calefaccion.setBounds(616, 461, 116, 62);
		panel_piso2.add(btn_calefaccion);
		
		
		btn_bajar_p1 = new JButton("New button");
		btn_bajar_p1.setBounds(0, 172, 50, 85);
		panel_piso2.add(btn_bajar_p1);
		btn_bajar_p1.setIcon(new ImageIcon("../reto_0/imagenes/flecha_abajo.png"));
		
		btn_subir_p1 = new JButton("New button");
		btn_subir_p1.setBounds(0, 10, 50, 85);
		panel_piso2.add(btn_subir_p1);
		btn_subir_p1.setIcon(new ImageIcon("../reto_0/imagenes/flecha_arriba.png")); 
		
		panel_alarmas = new JPanel();
		panel_alarmas.setBounds(60, 0, 710, 431);
		panel_piso2.add(panel_alarmas);
		
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 189, 50);
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 172, 50);

		
		lbl_plano_piso_0 = new JLabel("New label");
		panel_alarmas.setLayout(null);

		lbl_cl_202_a = new JLabel("");
		lbl_cl_202_a.setBounds(482, 387, 39, 13);
		panel_alarmas.add(lbl_cl_202_a);
		
		lbl_cl_218_a = new JLabel("");
		lbl_cl_218_a.setBounds(167, 250, 39, 13);
		panel_alarmas.add(lbl_cl_218_a);
	   			
	   	lbl_cl_207_a = new JLabel("");
	   	lbl_cl_207_a.setBounds(561, 279, 39, 13);
	   	panel_alarmas.add(lbl_cl_207_a);
	   			
	   	lbl_cl_217_a = new JLabel("");
	   	lbl_cl_217_a.setBounds(283, 250, 39, 13);
	   	panel_alarmas.add(lbl_cl_217_a);
	   			
	   	lbl_cl_216_a = new JLabel("");
	   	lbl_cl_216_a.setBounds(340, 250, 39, 13);
	   	panel_alarmas.add(lbl_cl_216_a);
	   					
	   	lbl_cl_215_a = new JLabel("");
	   	lbl_cl_215_a.setBounds(379, 197, 39, 13);
	   	panel_alarmas.add(lbl_cl_215_a);
	   					
	   	lbl_cl_209_a = new JLabel("");
	   	lbl_cl_209_a.setBounds(423, 159, 39, 13);
	   	panel_alarmas.add(lbl_cl_209_a);
	   							
	   	lbl_cl_211_a = new JLabel("");
	   	lbl_cl_211_a.setBounds(423, 136, 39, 13);
	   	panel_alarmas.add(lbl_cl_211_a);
	   							
	   	lbl_cl_203_a = new JLabel("");
	   	lbl_cl_203_a.setBounds(561, 368, 39, 13);
	   	panel_alarmas.add(lbl_cl_203_a);
	   							
	   	lbl_cl_213_a = new JLabel("");
	   	lbl_cl_213_a.setBounds(423, 90, 39, 13);
	   	panel_alarmas.add(lbl_cl_213_a);
	   							
	   	lbl_cl_220_a = new JLabel("");
	   	lbl_cl_220_a.setBounds(80, 169, 39, 13);
	   	panel_alarmas.add(lbl_cl_220_a);
	   							
	   	lbl_cl_214_a = new JLabel("");
	   	lbl_cl_214_a.setBounds(471, 30, 39, 13);
	   	panel_alarmas.add(lbl_cl_214_a);
	   	
	   	lbl_cl_026 = new JLabel("");
	   	lbl_cl_026.setBounds(100, 334, 62, 13);
	   	panel_alarmas.add(lbl_cl_026);
	   	label.add(lbl_cl_026);
	   	
	   											
	   	lbl_cl_212_a = new JLabel("");
	   	lbl_cl_212_a.setBounds(561, 90, 39, 13);
	   	panel_alarmas.add(lbl_cl_212_a);
	   													
	   	lbl_cl_210_a = new JLabel("");
	   	lbl_cl_210_a.setBounds(561, 147, 39, 13);
	   	panel_alarmas.add(lbl_cl_210_a);
	   													
	   	lbl_cl_208_a = new JLabel("");
	   	lbl_cl_208_a.setBounds(561, 181, 39, 13);
	   	panel_alarmas.add(lbl_cl_208_a);
	   															
	   	lbl_cl_201_a = new JLabel("");
	   	lbl_cl_201_a.setBounds(423, 387, 39, 13);
	   	panel_alarmas.add(lbl_cl_201_a);
	   																	
	   	lbl_cl_204_a = new JLabel("");
	   	lbl_cl_204_a.setBounds(561, 344, 39, 13);
	   	panel_alarmas.add(lbl_cl_204_a);
	   																			
	   	lbl_cl_205_a = new JLabel("");
	   	lbl_cl_205_a.setBounds(423, 313, 39, 13);
	   	panel_alarmas.add(lbl_cl_205_a);
	   																			
	   	lbl_cl_206_a = new JLabel("");
	   	lbl_cl_206_a.setBounds(561, 313, 39, 13);
	   	panel_alarmas.add(lbl_cl_206_a);
	   	
		label.add(lbl_cl_201_a);
		label.add(lbl_cl_202_a);
		label.add(lbl_cl_203_a);
		label.add(lbl_cl_204_a);
		label.add(lbl_cl_205_a);
		label.add(lbl_cl_206_a);
		label.add(lbl_cl_207_a);
		label.add(lbl_cl_208_a);
		label.add(lbl_cl_209_a);
		label.add(lbl_cl_210_a);
		label.add(lbl_cl_211_a);
		label.add(lbl_cl_212_a);
		label.add(lbl_cl_213_a);
		label.add(lbl_cl_214_a);
		label.add(lbl_cl_215_a);
		label.add(lbl_cl_216_a);
		label.add(lbl_cl_217_a);
		label.add(lbl_cl_218_a);
		label.add(lbl_cl_220_a);

		
		//Piso 0 colocación
				
	   	lbl_img_piso0 = new JLabel("");
	   	lbl_img_piso0.setBounds(0, -80, 600, 600);
	   	panel_alarmas.add(lbl_img_piso0);
	   	lbl_img_piso0.setIcon(plano2);
		Random r = new Random();
		int result;
		
		for(int i=0;i<label.size();i++) {
			result = r.nextInt(100-1) + 1;
			System.out.println(result);
			if (result>15) {
				label.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			 label.get(i).setIcon(luz_roja_escalada);

		}
	}
}
}