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

public class principal {

	private JFrame frame;
	private final JPanel panel_piso1 = new JPanel();
	private JPanel panel_alarmas;
	private JButton btn_calefaccion;
	private JButton btn_alarmas;
	private JLabel lbl_piso1;
	private JButton btn_subir_p1;
	private JButton btn_bajar_p1;
	private JButton btn_llamada_de_emergencia;
	private JLabel lbl_plano_piso_0;
	private JLabel lbl_cl_026;
	private JLabel lbl_cl_025;
	private JLabel lbl_cl_023;
	private JLabel lbl_cl_024;
	private JLabel lbl_cl_022;
	private JLabel lbl_cl_021;
	private JLabel lbl_cl_020;
	private JLabel lbl_cl_019;
	private JLabel lbl_cl_007;
	private JLabel lbl_cl_009;
	private JLabel lbl_cl_011;
	private JLabel lbl_cl_012;
	private JLabel lbl_cl_014;
	private JLabel lbl_cl_016;
	private JLabel lbl_cl_017;
	private JLabel lbl_cl_015;
	private JLabel lbl_cl_013;
	private JLabel lbl_cl_010;
	private JLabel lbl_cl_008;
	private JLabel lbl_cl_006;
	private JLabel lbl_cl_001;
	private JLabel lbl_cl_003;
	private JLabel lbl_cl_002;
	private JLabel lbl_cl_004;
	private JLabel lbl_cl_005;
	private JLabel lbl_img_piso0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
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
	public principal() {
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
		ArrayList<JLabel> label = new ArrayList<JLabel>(); 

		
		
		Image img = new ImageIcon(("../reto_0/imagenes/Planta0.png")).getImage();
	   	Image newimg = img.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano0 = new ImageIcon(newimg);
	   	
	   	
	   	Image luz_verde=new ImageIcon(("../reto_0/imagenes/verde.jpg")).getImage();
	   	Image tamañoLV=luz_verde.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon luz_verde_escalada=new ImageIcon(tamañoLV);
	   	
	   	Image luz_roja=new ImageIcon(("../reto_0/imagenes/señal_roja.jpg")).getImage();
	   	Image tamañoLR=luz_roja.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon luz_roja_escalada=new ImageIcon(tamañoLR);
				
		lbl_piso1 = new JLabel("Piso 1");
		lbl_piso1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_piso1.setBounds(20, 121, 52, 24);
		panel_piso1.add(lbl_piso1);
				
		btn_alarmas = new JButton("Alarmas\r\n");
		btn_alarmas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_alarmas.setBounds(616, 389, 116, 62);
		panel_piso1.add(btn_alarmas);
				
		btn_calefaccion = new JButton("Calefacci\u00F3n");
		btn_calefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas.setVisible(false);
			}
		});
		btn_calefaccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_calefaccion.setBounds(616, 461, 116, 62);
		panel_piso1.add(btn_calefaccion);
		
		
		btn_bajar_p1 = new JButton("New button");
		btn_bajar_p1.setBounds(0, 172, 50, 85);
		panel_piso1.add(btn_bajar_p1);
		btn_bajar_p1.setIcon(new ImageIcon("../reto_0/imagenes/flecha_abajo.png"));
		
		btn_subir_p1 = new JButton("New button");
		btn_subir_p1.setBounds(0, 10, 50, 85);
		panel_piso1.add(btn_subir_p1);
		btn_subir_p1.setIcon(new ImageIcon("../reto_0/imagenes/flecha_arriba.png")); 
		
		panel_alarmas = new JPanel();
		panel_alarmas.setBounds(60, 0, 710, 431);
		panel_piso1.add(panel_alarmas);
		
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 189, 50);
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 172, 50);

		
		lbl_plano_piso_0 = new JLabel("New label");
		panel_alarmas.setLayout(null);

		lbl_cl_025 = new JLabel("");
		lbl_cl_025.setBounds(191, 197, 39, 13);
		panel_alarmas.add(lbl_cl_025);
		
		lbl_cl_023 = new JLabel("");
		lbl_cl_023.setBounds(191, 250, 39, 13);
		panel_alarmas.add(lbl_cl_023);
		
	   	
	   	lbl_cl_024 = new JLabel("");
	   	lbl_cl_024.setBounds(142, 250, 39, 13);
	   	panel_alarmas.add(lbl_cl_024);
	   			
	   	lbl_cl_022 = new JLabel("");
	   	lbl_cl_022.setBounds(234, 250, 39, 13);
	   	panel_alarmas.add(lbl_cl_022);
	   			
	   	lbl_cl_021 = new JLabel("");
	   	lbl_cl_021.setBounds(283, 250, 39, 13);
	   	panel_alarmas.add(lbl_cl_021);
	   			
	   	lbl_cl_020 = new JLabel("");
	   	lbl_cl_020.setBounds(340, 250, 39, 13);
	   	panel_alarmas.add(lbl_cl_020);
	   					
	   	lbl_cl_019 = new JLabel("");
	   	lbl_cl_019.setBounds(379, 197, 39, 13);
	   	panel_alarmas.add(lbl_cl_019);
	   					
	   	lbl_cl_007 = new JLabel("");
	   	lbl_cl_007.setBounds(423, 159, 39, 13);
	   	panel_alarmas.add(lbl_cl_007);
	   							
	   	lbl_cl_009 = new JLabel("");
	   	lbl_cl_009.setBounds(423, 136, 39, 13);
	   	panel_alarmas.add(lbl_cl_009);
	   							
	   	lbl_cl_011 = new JLabel("");
	   	lbl_cl_011.setBounds(423, 113, 39, 13);
	   	panel_alarmas.add(lbl_cl_011);
	   							
	   	lbl_cl_012 = new JLabel("");
	   	lbl_cl_012.setBounds(423, 90, 39, 13);
	   	panel_alarmas.add(lbl_cl_012);
	   							
	   	lbl_cl_014 = new JLabel("");
	   	lbl_cl_014.setBounds(423, 67, 39, 13);
	   	panel_alarmas.add(lbl_cl_014);
	   							
	   	lbl_cl_016 = new JLabel("");
	   	lbl_cl_016.setBounds(423, 44, 39, 13);
	   	panel_alarmas.add(lbl_cl_016);
	   									
	   	lbl_cl_017 = new JLabel("");
	   	lbl_cl_017.setBounds(501, 28, 39, 13);
	   	panel_alarmas.add(lbl_cl_017);
	   									
	   	lbl_cl_015 = new JLabel("");
	   	lbl_cl_015.setBounds(561, 46, 39, 13);
	   	panel_alarmas.add(lbl_cl_015);
	   	
	   	lbl_cl_026 = new JLabel("");
	   	lbl_cl_026.setBounds(92, 210, 62, 13);
	   	panel_alarmas.add(lbl_cl_026);
	   	label.add(lbl_cl_026);
	   											
	   	lbl_cl_013 = new JLabel("");
	   	lbl_cl_013.setBounds(561, 67, 39, 13);
	   	panel_alarmas.add(lbl_cl_013);
	   	
	   											
	   	lbl_cl_010 = new JLabel("");
	   	lbl_cl_010.setBounds(561, 90, 39, 13);
	   	panel_alarmas.add(lbl_cl_010);
	   													
	   	lbl_cl_008 = new JLabel("");
	   	lbl_cl_008.setBounds(561, 147, 39, 13);
	   	panel_alarmas.add(lbl_cl_008);
	   													
	   	lbl_cl_006 = new JLabel("");
	   	lbl_cl_006.setBounds(561, 170, 39, 13);
	   	panel_alarmas.add(lbl_cl_006);
	   															
	   	lbl_cl_001 = new JLabel("");
	   	lbl_cl_001.setBounds(423, 387, 39, 13);
	   	panel_alarmas.add(lbl_cl_001);
	   																	
	   	lbl_cl_003 = new JLabel("");
	   	lbl_cl_003.setBounds(423, 334, 39, 13);
	   	panel_alarmas.add(lbl_cl_003);
	   																	
	   	lbl_cl_002 = new JLabel("");
	   	lbl_cl_002.setBounds(561, 334, 39, 13);
	   	panel_alarmas.add(lbl_cl_002);
	   																			
	   	lbl_cl_004 = new JLabel("");
	   	lbl_cl_004.setBounds(423, 313, 39, 13);
	   	panel_alarmas.add(lbl_cl_004);
	   																			
	   	lbl_cl_005 = new JLabel("");
	   	lbl_cl_005.setBounds(561, 298, 39, 13);
	   	panel_alarmas.add(lbl_cl_005);
	   	
		label.add(lbl_cl_001);
		label.add(lbl_cl_002);
		label.add(lbl_cl_003);
		label.add(lbl_cl_004);
		label.add(lbl_cl_005);
		label.add(lbl_cl_006);
		label.add(lbl_cl_007);
		label.add(lbl_cl_008);
		label.add(lbl_cl_009);
		label.add(lbl_cl_010);
		label.add(lbl_cl_011);
		label.add(lbl_cl_012);
		label.add(lbl_cl_013);
		label.add(lbl_cl_014);
		label.add(lbl_cl_015);
		label.add(lbl_cl_016);
		label.add(lbl_cl_017);
		label.add(lbl_cl_019);
		label.add(lbl_cl_020);
		label.add(lbl_cl_021);
		label.add(lbl_cl_022);
		label.add(lbl_cl_023);
		label.add(lbl_cl_024);
		label.add(lbl_cl_025);
		
		//Piso 0 colocación
				
	   	lbl_img_piso0 = new JLabel("");
	   	lbl_img_piso0.setBounds(0, -80, 600, 600);
	   	panel_alarmas.add(lbl_img_piso0);
	   	lbl_img_piso0.setIcon(plano0);
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
