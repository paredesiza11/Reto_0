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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class principal implements ActionListener, MouseListener{

	private JFrame frame;
	private final JPanel panel_piso1 = new JPanel();
	private JPanel panel_alarmas;
	private JPanel panel_calefaccion;
	private JButton btn_calefaccion;
	private JButton btn_alarmas;
	private JLabel lbl_piso1;
	private JButton btn_subir_p1;
	private JButton btn_bajar_p1;
	private JButton btn_llamada_de_emergencia;
	private JLabel lbl_plano_piso_0;
	
	//botones de alarmas
	
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
	
	//botones de calefaccion
	
	private JLabel lbl_cl_026_C;
	private JLabel lbl_cl_025_C;
	private JLabel lbl_cl_023_C;
	private JLabel lbl_cl_024_C;
	private JLabel lbl_cl_022_C;
	private JLabel lbl_cl_021_C;
	private JLabel lbl_cl_020_C;
	private JLabel lbl_cl_019_C;
	private JLabel lbl_cl_007_C;
	private JLabel lbl_cl_009_C;
	private JLabel lbl_cl_011_C;
	private JLabel lbl_cl_012_C;
	private JLabel lbl_cl_014_C;
	private JLabel lbl_cl_016_C;
	private JLabel lbl_cl_017_C;
	private JLabel lbl_cl_015_C;
	private JLabel lbl_cl_013_C;
	private JLabel lbl_cl_010_C;
	private JLabel lbl_cl_008_C;
	private JLabel lbl_cl_006_C;
	private JLabel lbl_cl_001_C;
	private JLabel lbl_cl_003_C;
	private JLabel lbl_cl_002_C;
	private JLabel lbl_cl_004_C;
	private JLabel lbl_cl_005_C;
	
	private JLabel lbl_img_piso0;
	private JLabel lbl_img_piso0_C;

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
		
		//arraylist de labels de alarmas
		
		ArrayList<JLabel> label = new ArrayList<JLabel>(); 
		
		//arraylist de labels de calefaccion
		
		ArrayList<JLabel> labelC = new ArrayList<JLabel>(); 

		//arraylist de estado de calefaccion
		
		ArrayList<Boolean> estado = new ArrayList<Boolean>(); 

		
		
		Image img = new ImageIcon(("../reto_0/imagenes/Planta0.png")).getImage();
	   	Image newimg = img.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano0 = new ImageIcon(newimg);
	   	
	   	//iconos alarma
	   	
	   	Image luz_verde=new ImageIcon(("../reto_0/imagenes/verde.jpg")).getImage();
	   	Image tamañoLV=luz_verde.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon luz_verde_escalada=new ImageIcon(tamañoLV);
	   	
	   	Image luz_roja=new ImageIcon(("../reto_0/imagenes/señal_roja.jpg")).getImage();
	   	Image tamañoLR=luz_roja.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon luz_roja_escalada=new ImageIcon(tamañoLR);
	   	
	   	//iconos termometro
	   	
	   	Image termometro=new ImageIcon(("../reto_0/imagenes/termometro.png")).getImage();
	   	Image tamañoTr=termometro.getScaledInstance(22,22, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon termometro_escalado=new ImageIcon(tamañoTr);
	   	
	   	Image termometro_vacio=new ImageIcon(("../reto_0/imagenes/termometro_vacio.png")).getImage();
	   	Image tamañoTrC=termometro_vacio.getScaledInstance(22,22, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon termometro_vacio_escalado=new ImageIcon(tamañoTrC);
				
		lbl_piso1 = new JLabel("Piso 1");
		lbl_piso1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_piso1.setBounds(20, 121, 52, 24);
		panel_piso1.add(lbl_piso1);
				
		btn_alarmas = new JButton("Alarmas\r\n");
		btn_alarmas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_alarmas.setBounds(616, 389, 116, 62);
		panel_piso1.add(btn_alarmas);
		btn_alarmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas.setVisible(true);
				panel_calefaccion.setVisible(false);
			}
		});
		
		btn_calefaccion = new JButton("Calefacci\u00F3n");
		btn_calefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas.setVisible(false);
				panel_calefaccion.setVisible(true);
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
		
		panel_calefaccion = new JPanel();
	   	panel_calefaccion.setBounds(60, 0, 710, 431);
		panel_piso1.add(panel_calefaccion);
	   	panel_calefaccion.setVisible(false);
		
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 189, 50);
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 172, 50);

		
		lbl_plano_piso_0 = new JLabel("New label");
		panel_alarmas.setLayout(null);
		panel_calefaccion.setLayout(null);

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
		
		//label calefaccion
		
		lbl_cl_025_C = new JLabel("");		
		lbl_cl_025_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(23).booleanValue()) {
					
					labelC.get(23).setIcon(termometro_vacio_escalado);
					estado.set(23,false);
				}else {
					labelC.get(23).setIcon(termometro_escalado);
					estado.set(23,true);

				}
			}
		});
		lbl_cl_025_C.setBounds(170, 170, 39, 25);
		panel_calefaccion.add(lbl_cl_025_C);

		lbl_cl_023_C = new JLabel("");
		lbl_cl_023_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(21).booleanValue()) {
					
					labelC.get(21).setIcon(termometro_vacio_escalado);
					estado.set(21,false);
				}else {
					labelC.get(21).setIcon(termometro_escalado);
					estado.set(21,true);

				}
			}
		});
		lbl_cl_023_C.setBounds(191, 250, 39, 25);
		panel_calefaccion.add(lbl_cl_023_C);
		
	   	
	   	lbl_cl_024_C = new JLabel("");
	   	lbl_cl_024_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(22).booleanValue()) {
					
					labelC.get(22).setIcon(termometro_vacio_escalado);
					estado.set(22,false);
				}else {
					labelC.get(22).setIcon(termometro_escalado);
					estado.set(22,true);

				}
			}
		});
	   	lbl_cl_024_C.setBounds(142, 245, 39, 25);
	   	panel_calefaccion.add(lbl_cl_024_C);
	   			
	   	lbl_cl_022_C = new JLabel("");
	   	lbl_cl_022_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(20).booleanValue()) {
					
					labelC.get(20).setIcon(termometro_vacio_escalado);
					estado.set(20,false);
				}else {
					labelC.get(20).setIcon(termometro_escalado);
					estado.set(20,true);

				}
			}
		});
	   	lbl_cl_022_C.setBounds(234, 245, 39, 25);
	   	panel_calefaccion.add(lbl_cl_022_C);
	   			
	   	lbl_cl_021_C = new JLabel("");
	   	lbl_cl_021_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(19).booleanValue()) {
					
					labelC.get(19).setIcon(termometro_vacio_escalado);
					estado.set(19,false);
				}else {
					labelC.get(19).setIcon(termometro_escalado);
					estado.set(19,true);

				}
			}
		});
	   	lbl_cl_021_C.setBounds(283, 250, 39, 25);
	   	panel_calefaccion.add(lbl_cl_021_C);
	   			
	   	lbl_cl_020_C = new JLabel("");
	   	lbl_cl_020_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(18).booleanValue()) {
					
					labelC.get(18).setIcon(termometro_vacio_escalado);
					estado.set(18,false);
				}else {
					labelC.get(18).setIcon(termometro_escalado);
					estado.set(18,true);

				}
			}
		});
	   	lbl_cl_020_C.setBounds(340, 250, 39, 25);
	   	panel_calefaccion.add(lbl_cl_020_C);
	   					
	   	lbl_cl_019_C = new JLabel("");
	   	lbl_cl_019_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(17).booleanValue()) {
					
					labelC.get(17).setIcon(termometro_vacio_escalado);
					estado.set(17,false);
				}else {
					labelC.get(17).setIcon(termometro_escalado);
					estado.set(17,true);

				}
			}
		});
	   	lbl_cl_019_C.setBounds(379, 170, 39, 25);
	   	panel_calefaccion.add(lbl_cl_019_C);
	   					
	   	lbl_cl_007_C = new JLabel("");
	   	lbl_cl_007_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(6).booleanValue()) {
					
					labelC.get(6).setIcon(termometro_vacio_escalado);
					estado.set(6,false);
				}else {
					labelC.get(6).setIcon(termometro_escalado);
					estado.set(6,true);

				}
			}
		});
	   	lbl_cl_007_C.setBounds(423, 159, 39, 25);
	   	panel_calefaccion.add(lbl_cl_007_C);
	   							
	   	lbl_cl_009_C = new JLabel("");
	   	lbl_cl_009_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(8).booleanValue()) {
					
					labelC.get(8).setIcon(termometro_vacio_escalado);
					estado.set(8,false);
				}else {
					labelC.get(8).setIcon(termometro_escalado);
					estado.set(8,true);

				}
			}
		});
	   	lbl_cl_009_C.setBounds(423, 136, 39, 25);
	   	panel_calefaccion.add(lbl_cl_009_C);
	   							
	   	lbl_cl_011_C = new JLabel("");
	   	lbl_cl_011_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(10).booleanValue()) {
					
					labelC.get(10).setIcon(termometro_vacio_escalado);
					estado.set(10,false);
				}else {
					labelC.get(10).setIcon(termometro_escalado);
					estado.set(10,true);

				}
			}
		});
	   	lbl_cl_011_C.setBounds(423, 113, 39, 25);
	   	panel_calefaccion.add(lbl_cl_011_C);
	   							
	   	lbl_cl_012_C = new JLabel("");
	   	lbl_cl_012_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(11).booleanValue()) {
					
					labelC.get(11).setIcon(termometro_vacio_escalado);
					estado.set(11,false);
				}else {
					labelC.get(11).setIcon(termometro_escalado);
					estado.set(11,true);

				}
			}
		});
	   	lbl_cl_012_C.setBounds(423, 90, 39, 25);
	   	panel_calefaccion.add(lbl_cl_012_C);
	   							
	   	lbl_cl_014_C = new JLabel("");
	   	lbl_cl_014_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(13).booleanValue()) {
					
					labelC.get(13).setIcon(termometro_vacio_escalado);
					estado.set(13,false);
				}else {
					labelC.get(13).setIcon(termometro_escalado);
					estado.set(13,true);

				}
			}
		});
	   	lbl_cl_014_C.setBounds(423, 67, 39, 25);
	   	panel_calefaccion.add(lbl_cl_014_C);
	   							
	   	lbl_cl_016_C = new JLabel("");
	   	lbl_cl_016_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(15).booleanValue()) {
					
					labelC.get(15).setIcon(termometro_vacio_escalado);
					estado.set(15,false);
				}else {
					labelC.get(15).setIcon(termometro_escalado);
					estado.set(15,true);

				}
			}
		});
	   	lbl_cl_016_C.setBounds(423, 44, 39, 25);
	   	panel_calefaccion.add(lbl_cl_016_C);
	   									
	   	lbl_cl_017_C = new JLabel("");
	   	lbl_cl_017_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(16).booleanValue()) {
					
					labelC.get(16).setIcon(termometro_vacio_escalado);
					estado.set(16,false);
				}else {
					labelC.get(16).setIcon(termometro_escalado);
					estado.set(16,true);

				}
			}
		});
	   	lbl_cl_017_C.setBounds(501, 28, 39, 25);
	   	panel_calefaccion.add(lbl_cl_017_C);
	   									
	   	lbl_cl_015_C = new JLabel("");
	   	lbl_cl_015_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(14).booleanValue()) {
					
					labelC.get(14).setIcon(termometro_vacio_escalado);
					estado.set(14,false);
				}else {
					labelC.get(14).setIcon(termometro_escalado);
					estado.set(14,true);

				}
			}
		});
	   	lbl_cl_015_C.setBounds(561, 46, 39, 25);
	   	panel_calefaccion.add(lbl_cl_015_C);
	   	
	   	lbl_cl_026_C = new JLabel("");
	   	lbl_cl_026_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(24).booleanValue()) {
					
					labelC.get(24).setIcon(termometro_vacio_escalado);
					estado.set(24,false);
				}else {
					labelC.get(24).setIcon(termometro_escalado);
					estado.set(24,true);

				}
			}
		});
	   	lbl_cl_026_C.setBounds(92, 210, 62, 25);
	   	panel_calefaccion.add(lbl_cl_026_C);
	   											
	   	lbl_cl_013_C = new JLabel("");
	   	lbl_cl_013_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(12).booleanValue()) {
					
					labelC.get(12).setIcon(termometro_vacio_escalado);
					estado.set(12,false);
				}else {
					labelC.get(12).setIcon(termometro_escalado);
					estado.set(12,true);

				}
			}
		});
	   	lbl_cl_013_C.setBounds(561, 67, 39, 25);
	   	panel_calefaccion.add(lbl_cl_013_C);
	   	
	   											
	   	lbl_cl_010_C = new JLabel("");
	   	lbl_cl_010_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(9).booleanValue()) {
					
					labelC.get(9).setIcon(termometro_vacio_escalado);
					estado.set(9,false);
				}else {
					labelC.get(9).setIcon(termometro_escalado);
					estado.set(9,true);

				}
			}
		});
	   	lbl_cl_010_C.setBounds(561, 90, 39, 25);
	   	panel_calefaccion.add(lbl_cl_010_C);
	   													
	   	lbl_cl_008_C = new JLabel("");
	   	lbl_cl_008_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(7).booleanValue()) {
					
					labelC.get(7).setIcon(termometro_vacio_escalado);
					estado.set(7,false);
				}else {
					labelC.get(7).setIcon(termometro_escalado);
					estado.set(7,true);

				}
			}
		});
	   	lbl_cl_008_C.setBounds(561, 147, 39, 25);
	   	panel_calefaccion.add(lbl_cl_008_C);
	   													
	   	lbl_cl_006_C = new JLabel("");
	   	lbl_cl_006_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(5).booleanValue()) {
					
					labelC.get(5).setIcon(termometro_vacio_escalado);
					estado.set(5,false);
				}else {
					labelC.get(5).setIcon(termometro_escalado);
					estado.set(5,true);

				}
			}
		});
	   	lbl_cl_006_C.setBounds(561, 170, 39, 25);
	   	panel_calefaccion.add(lbl_cl_006_C);
	   															
	   	lbl_cl_001_C = new JLabel("");
	   	lbl_cl_001_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(0).booleanValue()) {
					
					labelC.get(0).setIcon(termometro_vacio_escalado);
					estado.set(0,false);
				}else {
					labelC.get(0).setIcon(termometro_escalado);
					estado.set(0,true);

				}
			}
		});
	   	lbl_cl_001_C.setBounds(423, 387, 39, 25);
	   	panel_calefaccion.add(lbl_cl_001_C);
	   																	
	   	lbl_cl_003_C = new JLabel("");
	   	lbl_cl_003_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(2).booleanValue()) {
					
					labelC.get(2).setIcon(termometro_vacio_escalado);
					estado.set(2,false);
				}else {
					labelC.get(2).setIcon(termometro_escalado);
					estado.set(2,true);

				}
			}
		});
	   	lbl_cl_003_C.setBounds(423, 334, 39, 25);
	   	panel_calefaccion.add(lbl_cl_003_C);
	   																	
	   	lbl_cl_002_C = new JLabel("");
	   	lbl_cl_002_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(1).booleanValue()) {
					
					labelC.get(1).setIcon(termometro_vacio_escalado);
					estado.set(1,false);
				}else {
					labelC.get(1).setIcon(termometro_escalado);
					estado.set(1,true);

				}
			}
		});
	   	lbl_cl_002_C.setBounds(561, 334, 39, 25);
	   	panel_calefaccion.add(lbl_cl_002_C);
	   																			
	   	lbl_cl_004_C = new JLabel("");
	   	lbl_cl_004_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(3).booleanValue()) {
					
					labelC.get(3).setIcon(termometro_vacio_escalado);
					estado.set(3,false);
				}else {
					labelC.get(3).setIcon(termometro_escalado);
					estado.set(3,true);

				}
			}
		});
	   	lbl_cl_004_C.setBounds(423, 313, 39, 25);
	   	panel_calefaccion.add(lbl_cl_004_C);
	   																			
	   	lbl_cl_005_C = new JLabel("");
	   	lbl_cl_005_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(4).booleanValue()) {
					
					labelC.get(4).setIcon(termometro_vacio_escalado);
					estado.set(4,false);
				}else {
					labelC.get(4).setIcon(termometro_escalado);
					estado.set(4,true);

				}
			}
		});
	   	lbl_cl_005_C.setBounds(561, 298, 39, 25);
	   	panel_calefaccion.add(lbl_cl_005_C);
	   	
		labelC.add(lbl_cl_001_C);
		labelC.add(lbl_cl_002_C);
		labelC.add(lbl_cl_003_C);
		labelC.add(lbl_cl_004_C);
		labelC.add(lbl_cl_005_C);
		labelC.add(lbl_cl_006_C);
		labelC.add(lbl_cl_007_C);
		labelC.add(lbl_cl_008_C);
		labelC.add(lbl_cl_009_C);
		labelC.add(lbl_cl_010_C);
		labelC.add(lbl_cl_011_C);
		labelC.add(lbl_cl_012_C);
		labelC.add(lbl_cl_013_C);
		labelC.add(lbl_cl_014_C);
		labelC.add(lbl_cl_015_C);
		labelC.add(lbl_cl_016_C);
		labelC.add(lbl_cl_017_C);
		labelC.add(lbl_cl_019_C);
		labelC.add(lbl_cl_020_C);
		labelC.add(lbl_cl_021_C);
		labelC.add(lbl_cl_022_C);
		labelC.add(lbl_cl_023_C);
		labelC.add(lbl_cl_024_C);
		labelC.add(lbl_cl_025_C);
		labelC.add(lbl_cl_026_C);
		
		
		//Piso 0 colocación
				
	   	lbl_img_piso0 = new JLabel("");
	   	lbl_img_piso0.setBounds(0, -80, 600, 600);
	   	panel_alarmas.add(lbl_img_piso0);
	   	lbl_img_piso0.setIcon(plano0);
	   	
	   	lbl_img_piso0_C = new JLabel("");
	   	lbl_img_piso0_C.setBounds(0, -80, 600, 600);
	   	panel_calefaccion.add(lbl_img_piso0_C);
	   	lbl_img_piso0_C.setIcon(plano0);
	   
		Random r = new Random();
		int result;
		
		
		for(int i=0;i<labelC.size();i++) {
			result = r.nextInt(100-1) + 1;
			System.out.println(result);
			if(result>30) {
				estado.add(true);
			labelC.get(i).setIcon(termometro_escalado);
			}else {
				estado.add(false);
				labelC.get(i).setIcon(termometro_vacio_escalado);

			}

		}
		for(int i=0;i<estado.size();i++) {
			System.out.println(estado.get(i).toString());
		}
		
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}