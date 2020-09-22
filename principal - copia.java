package reto_0;

import java.awt.Container;
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
	private final JPanel panel_piso = new JPanel();
	private JPanel panel_alarmas_p0;
	private JPanel panel_calefaccion_p0;
	private JPanel panel_alarmas_p1;
	private JPanel panel_calefaccion_p1;
	private JPanel panel_alarmas_p2;
	private JPanel panel_calefaccion_p2;
	private JButton btn_calefaccion;
	private JButton btn_alarmas;
	private JLabel lbl_piso;
	private int cont_piso=0;
	private JButton btn_subir;
	private JButton btn_bajar;
	private JButton btn_llamada_de_emergencia;
	private JLabel lbl_plano_piso_0;
	
	//botones de alarmas
	
	/*LABELS PISO 0*/
	
		/*ALARMAS*/
	
	private JLabel lbl_cl_026_a;
	private JLabel lbl_cl_025_a;
	private JLabel lbl_cl_023_a;
	private JLabel lbl_cl_024_a;
	private JLabel lbl_cl_022_a;
	private JLabel lbl_cl_021_a;
	private JLabel lbl_cl_020_a;
	private JLabel lbl_cl_019_a;
	private JLabel lbl_cl_007_a;
	private JLabel lbl_cl_009_a;
	private JLabel lbl_cl_011_a;
	private JLabel lbl_cl_012_a;
	private JLabel lbl_cl_014_a;
	private JLabel lbl_cl_016_a;
	private JLabel lbl_cl_017_a;
	private JLabel lbl_cl_015_a;
	private JLabel lbl_cl_013_a;
	private JLabel lbl_cl_010_a;
	private JLabel lbl_cl_008_a;
	private JLabel lbl_cl_006_a;
	private JLabel lbl_cl_001_a;
	private JLabel lbl_cl_003_a;
	private JLabel lbl_cl_002_a;
	private JLabel lbl_cl_004_a;
	private JLabel lbl_cl_005_a;
	
		/*CALEFACCION*/
	
	private JLabel lbl_cl_026_c;
	private JLabel lbl_cl_025_c;
	private JLabel lbl_cl_023_c;
	private JLabel lbl_cl_024_c;
	private JLabel lbl_cl_022_c;
	private JLabel lbl_cl_021_c;
	private JLabel lbl_cl_020_c;
	private JLabel lbl_cl_019_c;
	private JLabel lbl_cl_007_c;
	private JLabel lbl_cl_009_c;
	private JLabel lbl_cl_011_c;
	private JLabel lbl_cl_012_c;
	private JLabel lbl_cl_014_c;
	private JLabel lbl_cl_016_c;
	private JLabel lbl_cl_017_c;
	private JLabel lbl_cl_015_c;
	private JLabel lbl_cl_013_c;
	private JLabel lbl_cl_010_c;
	private JLabel lbl_cl_008_c;
	private JLabel lbl_cl_006_c;
	private JLabel lbl_cl_001_c;
	private JLabel lbl_cl_003_c;
	private JLabel lbl_cl_002_c;
	private JLabel lbl_cl_004_c;
	private JLabel lbl_cl_005_c;
	
	/*PISO 1*/
	
		/*ALARMAS*/
	
	private JLabel lbl_cl_120_c;
	private JLabel lbl_cl_116_c;
	private JLabel lbl_cl_115_c;
	private JLabel lbl_cl_114_c;
	private JLabel lbl_cl_117_c;
	private JLabel lbl_cl_113_c;
	private JLabel lbl_cl_118_c;
	private JLabel lbl_cl_106_c;
	private JLabel lbl_cl_108_c;
	private JLabel lbl_cl_110_c;
	private JLabel lbl_cl_112_c;
	private JLabel lbl_cl_119_c;
	private JLabel lbl_cl_111_c;
	private JLabel lbl_cl_109_c;
	private JLabel lbl_cl_107_c;
	private JLabel lbl_cl_105_c;
	private JLabel lbl_cl_101_c;
	private JLabel lbl_cl_103_c;
	private JLabel lbl_cl_102_c;
	private JLabel lbl_cl_104_c;
	
		/*CALEFACCION*/
	
	private JLabel lbl_cl_120_a;
	private JLabel lbl_cl_116_a;
	private JLabel lbl_cl_115_a;
	private JLabel lbl_cl_114_a;
	private JLabel lbl_cl_117_a;
	private JLabel lbl_cl_113_a;
	private JLabel lbl_cl_118_a;
	private JLabel lbl_cl_106_a;
	private JLabel lbl_cl_108_a;
	private JLabel lbl_cl_110_a;
	private JLabel lbl_cl_112_a;
	private JLabel lbl_cl_119_a;
	private JLabel lbl_cl_111_a;
	private JLabel lbl_cl_109_a;
	private JLabel lbl_cl_107_a;
	private JLabel lbl_cl_105_a;
	private JLabel lbl_cl_101_a;
	private JLabel lbl_cl_103_a;
	private JLabel lbl_cl_102_a;
	private JLabel lbl_cl_104_a;	
	
		/*PLANOS*/
	private JLabel lbl_img_piso0_a;
	private JLabel lbl_img_piso0_c;
	private JLabel lbl_img_piso1_a;
	private JLabel lbl_img_piso1_c;
	private JLabel lbl_img_piso2_a;
	private JLabel lbl_img_piso2_c;



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
		panel_piso.setBounds(10, 10, 800, 600);
		frame.getContentPane().add(panel_piso);
		panel_piso.setLayout(null);
		
		
		//ARRAYLIST PISO 0
		ArrayList<JLabel> label_p0_a = new ArrayList<JLabel>(); 
		
		ArrayList<JLabel> label_p0_c = new ArrayList<JLabel>(); 
		
		ArrayList<Boolean> estado_p0 = new ArrayList<Boolean>(); 
		
		//ARRAYLIST PISO 1
		ArrayList<JLabel> label_p1_a = new ArrayList<JLabel>(); 
				
		ArrayList<JLabel> label_p1_c = new ArrayList<JLabel>(); 
				
		ArrayList<Boolean> estado_p1 = new ArrayList<Boolean>(); 
		
		//ARRAYLIST PISO 2
		ArrayList<JLabel> label_p2_a = new ArrayList<JLabel>(); 
				
		ArrayList<JLabel> label_p2_c = new ArrayList<JLabel>(); 
				
		ArrayList<Boolean> estado_p2 = new ArrayList<Boolean>(); 

		
		/*IMAGENES PISOS*/
		Image img = new ImageIcon(("../reto_0/imagenes/Planta0.png")).getImage();
	   	Image newimg = img.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano0 = new ImageIcon(newimg);
	   	
	   	Image img_p1 = new ImageIcon(("../reto_0/imagenes/Planta1.png")).getImage();
	   	Image newimg_p1 = img_p1.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano1 = new ImageIcon(newimg_p1);
	   	
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
	   	
		
		lbl_piso = new JLabel("Piso "+cont_piso);
		lbl_piso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_piso.setBounds(20, 121, 52, 24);
		panel_piso.add(lbl_piso);
				
		btn_alarmas = new JButton("Alarmas\r\n");
		btn_alarmas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_alarmas.setBounds(616, 389, 116, 62);
		panel_piso.add(btn_alarmas);
		btn_alarmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrar_alarmas();
			}


		});
		
		btn_calefaccion = new JButton("Calefacci\u00F3n");
		btn_calefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrar_calefaccion();
			}


		});
		
		btn_calefaccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_calefaccion.setBounds(616, 461, 116, 62);
		panel_piso.add(btn_calefaccion);
		
		
		btn_bajar = new JButton("New button");
		btn_bajar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont_piso>0) {
					cont_piso--;
					poner_piso();
					mostrar_alarmas();
			}
		}});
		btn_bajar.setBounds(0, 172, 50, 85);
		panel_piso.add(btn_bajar);
		btn_bajar.setIcon(new ImageIcon("../reto_0/imagenes/flecha_abajo.png"));
		
		btn_subir = new JButton("New button");
		btn_subir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont_piso<2) {
				cont_piso++;
				poner_piso();
				mostrar_alarmas();
				}
			}

		
		});
		btn_subir.setBounds(0, 10, 50, 85);
		panel_piso.add(btn_subir);
		btn_subir.setIcon(new ImageIcon("../reto_0/imagenes/flecha_arriba.png")); 
		
		panel_alarmas_p0 = new JPanel();
		panel_alarmas_p0.setBounds(60, 0, 710, 431);
		panel_piso.add(panel_alarmas_p0);
		
		panel_calefaccion_p0 = new JPanel();
	   	panel_calefaccion_p0.setBounds(60, 0, 710, 431);
		panel_piso.add(panel_calefaccion_p0);
	   	panel_calefaccion_p0.setVisible(false);
	   	
		panel_alarmas_p1 = new JPanel();
	   	panel_alarmas_p1.setBounds(60, 0, 710, 431);
		panel_alarmas_p1.setLayout(null);
	   	panel_piso.add(panel_alarmas_p1);
	   	
	   	panel_calefaccion_p1 = new JPanel();
	   	panel_calefaccion_p1.setBounds(60, 0, 710, 431);
	   	panel_piso.add(panel_calefaccion_p1);
	   	
	   	panel_alarmas_p2 = new JPanel();
	   	panel_alarmas_p2.setBounds(60, 0, 710, 431);
	   	panel_piso.add(panel_alarmas_p2);
	   	
	   	panel_calefaccion_p2 = new JPanel();
	   	panel_calefaccion_p2.setBounds(60, 0, 710, 431);
	   	panel_piso.add(panel_calefaccion_p2);
		
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 189, 50);
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 172, 50);

		/*PANELES DE PISOS*/
		
			/*PISO 0*/
		
		/*ALARMAS*/
		lbl_plano_piso_0 = new JLabel("New label");
		panel_alarmas_p0.setLayout(null);
		panel_calefaccion_p0.setLayout(null);

		lbl_cl_025_a = new JLabel("");
		lbl_cl_025_a.setBounds(191, 197, 39, 13);
		panel_alarmas_p0.add(lbl_cl_025_a);
		
		lbl_cl_023_a = new JLabel("");
		lbl_cl_023_a.setBounds(191, 250, 39, 13);
		panel_alarmas_p0.add(lbl_cl_023_a);
		
	   	
	   	lbl_cl_024_a = new JLabel("");
	   	lbl_cl_024_a.setBounds(142, 250, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_024_a);
	   			
	   	lbl_cl_022_a = new JLabel("");
	   	lbl_cl_022_a.setBounds(234, 250, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_022_a);
	   			
	   	lbl_cl_021_a = new JLabel("");
	   	lbl_cl_021_a.setBounds(283, 250, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_021_a);
	   			
	   	lbl_cl_020_a = new JLabel("");
	   	lbl_cl_020_a.setBounds(340, 250, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_020_a);
	   					
	   	lbl_cl_019_a = new JLabel("");
	   	lbl_cl_019_a.setBounds(379, 197, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_019_a);
	   					
	   	lbl_cl_007_a = new JLabel("");
	   	lbl_cl_007_a.setBounds(423, 159, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_007_a);
	   							
	   	lbl_cl_009_a = new JLabel("");
	   	lbl_cl_009_a.setBounds(423, 136, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_009_a);
	   							
	   	lbl_cl_011_a = new JLabel("");
	   	lbl_cl_011_a.setBounds(423, 113, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_011_a);
	   							
	   	lbl_cl_012_a = new JLabel("");
	   	lbl_cl_012_a.setBounds(423, 90, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_012_a);
	   							
	   	lbl_cl_014_a = new JLabel("");
	   	lbl_cl_014_a.setBounds(423, 67, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_014_a);
	   							
	   	lbl_cl_016_a = new JLabel("");
	   	lbl_cl_016_a.setBounds(423, 44, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_016_a);
	   									
	   	lbl_cl_017_a = new JLabel("");
	   	lbl_cl_017_a.setBounds(501, 28, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_017_a);
	   									
	   	lbl_cl_015_a = new JLabel("");
	   	lbl_cl_015_a.setBounds(561, 46, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_015_a);
	   	
	   	lbl_cl_026_a = new JLabel("");
	   	lbl_cl_026_a.setBounds(92, 210, 62, 13);
	   	panel_alarmas_p0.add(lbl_cl_026_a);
	   											
	   	lbl_cl_013_a = new JLabel("");
	   	lbl_cl_013_a.setBounds(561, 67, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_013_a);
	   	
	   											
	   	lbl_cl_010_a = new JLabel("");
	   	lbl_cl_010_a.setBounds(561, 90, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_010_a);
	   													
	   	lbl_cl_008_a = new JLabel("");
	   	lbl_cl_008_a.setBounds(561, 147, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_008_a);
	   													
	   	lbl_cl_006_a = new JLabel("");
	   	lbl_cl_006_a.setBounds(561, 170, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_006_a);
	   															
	   	lbl_cl_001_a = new JLabel("");
	   	lbl_cl_001_a.setBounds(423, 387, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_001_a);
	   																	
	   	lbl_cl_003_a = new JLabel("");
	   	lbl_cl_003_a.setBounds(423, 334, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_003_a);
	   																	
	   	lbl_cl_002_a = new JLabel("");
	   	lbl_cl_002_a.setBounds(561, 334, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_002_a);
	   																			
	   	lbl_cl_004_a = new JLabel("");
	   	lbl_cl_004_a.setBounds(423, 313, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_004_a);
	   																			
	   	lbl_cl_005_a = new JLabel("");
	   	lbl_cl_005_a.setBounds(561, 298, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_005_a);
	   	
	   	label_p0_a.add(lbl_cl_001_a);
	   	label_p0_a.add(lbl_cl_002_a);
	   	label_p0_a.add(lbl_cl_003_a);
	   	label_p0_a.add(lbl_cl_004_a);
	   	label_p0_a.add(lbl_cl_005_a);
	   	label_p0_a.add(lbl_cl_006_a);
	   	label_p0_a.add(lbl_cl_007_a);
	   	label_p0_a.add(lbl_cl_008_a);
	   	label_p0_a.add(lbl_cl_009_a);
	   	label_p0_a.add(lbl_cl_010_a);
	   	label_p0_a.add(lbl_cl_011_a);
	   	label_p0_a.add(lbl_cl_012_a);
	   	label_p0_a.add(lbl_cl_013_a);
	   	label_p0_a.add(lbl_cl_014_a);
	   	label_p0_a.add(lbl_cl_015_a);
	   	label_p0_a.add(lbl_cl_016_a);
	   	label_p0_a.add(lbl_cl_017_a);
	   	label_p0_a.add(lbl_cl_019_a);
	   	label_p0_a.add(lbl_cl_020_a);
	   	label_p0_a.add(lbl_cl_021_a);
	   	label_p0_a.add(lbl_cl_022_a);
	   	label_p0_a.add(lbl_cl_023_a);
	   	label_p0_a.add(lbl_cl_024_a);
	   	label_p0_a.add(lbl_cl_025_a);
		
		/*CALEFACCION*/
		
		lbl_cl_025_c = new JLabel("");		
		lbl_cl_025_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(23).booleanValue()) {
					
					label_p0_c.get(23).setIcon(termometro_vacio_escalado);
					estado_p0.set(23,false);
				}else {
					label_p0_c.get(23).setIcon(termometro_escalado);
					estado_p0.set(23,true);

				}
			}
		});
		lbl_cl_025_c.setBounds(170, 170, 39, 25);
		panel_calefaccion_p0.add(lbl_cl_025_c);

		lbl_cl_023_c = new JLabel("");
		lbl_cl_023_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(21).booleanValue()) {
					
					label_p0_c.get(21).setIcon(termometro_vacio_escalado);
					estado_p0.set(21,false);
				}else {
					label_p0_c.get(21).setIcon(termometro_escalado);
					estado_p0.set(21,true);

				}
			}
		});
		lbl_cl_023_c.setBounds(191, 250, 39, 25);
		panel_calefaccion_p0.add(lbl_cl_023_c);
		
	   	
	   	lbl_cl_024_c = new JLabel("");
	   	lbl_cl_024_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(22).booleanValue()) {
					
					label_p0_c.get(22).setIcon(termometro_vacio_escalado);
					estado_p0.set(22,false);
				}else {
					label_p0_c.get(22).setIcon(termometro_escalado);
					estado_p0.set(22,true);

				}
			}
		});
	   	lbl_cl_024_c.setBounds(142, 245, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_024_c);
	   			
	   	lbl_cl_022_c = new JLabel("");
	   	lbl_cl_022_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(20).booleanValue()) {
					
					label_p0_c.get(20).setIcon(termometro_vacio_escalado);
					estado_p0.set(20,false);
				}else {
					label_p0_c.get(20).setIcon(termometro_escalado);
					estado_p0.set(20,true);

				}
			}
		});
	   	lbl_cl_022_c.setBounds(234, 245, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_022_c);
	   			
	   	lbl_cl_021_c = new JLabel("");
	   	lbl_cl_021_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(19).booleanValue()) {
					
					label_p0_c.get(19).setIcon(termometro_vacio_escalado);
					estado_p0.set(19,false);
				}else {
					label_p0_c.get(19).setIcon(termometro_escalado);
					estado_p0.set(19,true);

				}
			}
		});
	   	lbl_cl_021_c.setBounds(283, 250, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_021_c);
	   			
	   	lbl_cl_020_c = new JLabel("");
	   	lbl_cl_020_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(18).booleanValue()) {
					
					label_p0_c.get(18).setIcon(termometro_vacio_escalado);
					estado_p0.set(18,false);
				}else {
					label_p0_c.get(18).setIcon(termometro_escalado);
					estado_p0.set(18,true);

				}
			}
		});
	   	lbl_cl_020_c.setBounds(340, 250, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_020_c);
	   					
	   	lbl_cl_019_c = new JLabel("");
	   	lbl_cl_019_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(17).booleanValue()) {
					
					label_p0_c.get(17).setIcon(termometro_vacio_escalado);
					estado_p0.set(17,false);
				}else {
					label_p0_c.get(17).setIcon(termometro_escalado);
					estado_p0.set(17,true);

				}
			}
		});
	   	lbl_cl_019_c.setBounds(379, 170, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_019_c);
	   					
	   	lbl_cl_007_c = new JLabel("");
	   	lbl_cl_007_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(6).booleanValue()) {
					
					label_p0_c.get(6).setIcon(termometro_vacio_escalado);
					estado_p0.set(6,false);
				}else {
					label_p0_c.get(6).setIcon(termometro_escalado);
					estado_p0.set(6,true);

				}
			}
		});
	   	lbl_cl_007_c.setBounds(423, 159, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_007_c);
	   							
	   	lbl_cl_009_c = new JLabel("");
	   	lbl_cl_009_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(8).booleanValue()) {
					
					label_p0_c.get(8).setIcon(termometro_vacio_escalado);
					estado_p0.set(8,false);
				}else {
					label_p0_c.get(8).setIcon(termometro_escalado);
					estado_p0.set(8,true);

				}
			}
		});
	   	lbl_cl_009_c.setBounds(423, 136, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_009_c);
	   							
	   	lbl_cl_011_c = new JLabel("");
	   	lbl_cl_011_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(10).booleanValue()) {
					
					label_p0_c.get(10).setIcon(termometro_vacio_escalado);
					estado_p0.set(10,false);
				}else {
					label_p0_c.get(10).setIcon(termometro_escalado);
					estado_p0.set(10,true);

				}
			}
		});
	   	lbl_cl_011_c.setBounds(423, 113, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_011_c);
	   							
	   	lbl_cl_012_c = new JLabel("");
	   	lbl_cl_012_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(11).booleanValue()) {
					
					label_p0_c.get(11).setIcon(termometro_vacio_escalado);
					estado_p0.set(11,false);
				}else {
					label_p0_c.get(11).setIcon(termometro_escalado);
					estado_p0.set(11,true);

				}
			}
		});
	   	lbl_cl_012_c.setBounds(423, 90, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_012_c);
	   							
	   	lbl_cl_014_c = new JLabel("");
	   	lbl_cl_014_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(13).booleanValue()) {
					
					label_p0_c.get(13).setIcon(termometro_vacio_escalado);
					estado_p0.set(13,false);
				}else {
					label_p0_c.get(13).setIcon(termometro_escalado);
					estado_p0.set(13,true);

				}
			}
		});
	   	lbl_cl_014_c.setBounds(423, 67, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_014_c);
	   							
	   	lbl_cl_016_c = new JLabel("");
	   	lbl_cl_016_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(15).booleanValue()) {
					
					label_p0_c.get(15).setIcon(termometro_vacio_escalado);
					estado_p0.set(15,false);
				}else {
					label_p0_c.get(15).setIcon(termometro_escalado);
					estado_p0.set(15,true);

				}
			}
		});
	   	lbl_cl_016_c.setBounds(423, 44, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_016_c);
	   									
	   	lbl_cl_017_c = new JLabel("");
	   	lbl_cl_017_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(16).booleanValue()) {
					
					label_p0_c.get(16).setIcon(termometro_vacio_escalado);
					estado_p0.set(16,false);
				}else {
					label_p0_c.get(16).setIcon(termometro_escalado);
					estado_p0.set(16,true);

				}
			}
		});
	   	lbl_cl_017_c.setBounds(501, 28, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_017_c);
	   									
	   	lbl_cl_015_c = new JLabel("");
	   	lbl_cl_015_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(14).booleanValue()) {
					
					label_p0_c.get(14).setIcon(termometro_vacio_escalado);
					estado_p0.set(14,false);
				}else {
					label_p0_c.get(14).setIcon(termometro_escalado);
					estado_p0.set(14,true);

				}
			}
		});
	   	lbl_cl_015_c.setBounds(561, 46, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_015_c);
	   	
	   	lbl_cl_026_c = new JLabel("");
	   	lbl_cl_026_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(24).booleanValue()) {
					
					label_p0_c.get(24).setIcon(termometro_vacio_escalado);
					estado_p0.set(24,false);
				}else {
					label_p0_c.get(24).setIcon(termometro_escalado);
					estado_p0.set(24,true);

				}
			}
		});
	   	lbl_cl_026_c.setBounds(92, 210, 62, 25);
	   	panel_calefaccion_p0.add(lbl_cl_026_c);
	   											
	   	lbl_cl_013_c = new JLabel("");
	   	lbl_cl_013_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(12).booleanValue()) {
					
					label_p0_c.get(12).setIcon(termometro_vacio_escalado);
					estado_p0.set(12,false);
				}else {
					label_p0_c.get(12).setIcon(termometro_escalado);
					estado_p0.set(12,true);

				}
			}
		});
	   	lbl_cl_013_c.setBounds(561, 67, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_013_c);
	   	
	   											
	   	lbl_cl_010_c = new JLabel("");
	   	lbl_cl_010_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(9).booleanValue()) {
					
					label_p0_c.get(9).setIcon(termometro_vacio_escalado);
					estado_p0.set(9,false);
				}else {
					label_p0_c.get(9).setIcon(termometro_escalado);
					estado_p0.set(9,true);

				}
			}
		});
	   	lbl_cl_010_c.setBounds(561, 90, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_010_c);
	   													
	   	lbl_cl_008_c = new JLabel("");
	   	lbl_cl_008_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(7).booleanValue()) {
					
					label_p0_c.get(7).setIcon(termometro_vacio_escalado);
					estado_p0.set(7,false);
				}else {
					label_p0_c.get(7).setIcon(termometro_escalado);
					estado_p0.set(7,true);

				}
			}
		});
	   	lbl_cl_008_c.setBounds(561, 147, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_008_c);
	   													
	   	lbl_cl_006_c = new JLabel("");
	   	lbl_cl_006_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(5).booleanValue()) {
					
					label_p0_c.get(5).setIcon(termometro_vacio_escalado);
					estado_p0.set(5,false);
				}else {
					label_p0_c.get(5).setIcon(termometro_escalado);
					estado_p0.set(5,true);

				}
			}
		});
	   	lbl_cl_006_c.setBounds(561, 170, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_006_c);
	   															
	   	lbl_cl_001_c = new JLabel("");
	   	lbl_cl_001_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(0).booleanValue()) {
					
					label_p0_c.get(0).setIcon(termometro_vacio_escalado);
					estado_p0.set(0,false);
				}else {
					label_p0_c.get(0).setIcon(termometro_escalado);
					estado_p0.set(0,true);

				}
			}
		});
	   	lbl_cl_001_c.setBounds(423, 387, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_001_c);
	   																	
	   	lbl_cl_003_c = new JLabel("");
	   	lbl_cl_003_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(2).booleanValue()) {
					
					label_p0_c.get(2).setIcon(termometro_vacio_escalado);
					estado_p0.set(2,false);
				}else {
					label_p0_c.get(2).setIcon(termometro_escalado);
					estado_p0.set(2,true);

				}
			}
		});
	   	lbl_cl_003_c.setBounds(423, 334, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_003_c);
	   																	
	   	lbl_cl_002_c = new JLabel("");
	   	lbl_cl_002_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(1).booleanValue()) {
					
					label_p0_c.get(1).setIcon(termometro_vacio_escalado);
					estado_p0.set(1,false);
				}else {
					label_p0_c.get(1).setIcon(termometro_escalado);
					estado_p0.set(1,true);

				}
			}
		});
	   	lbl_cl_002_c.setBounds(561, 334, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_002_c);
	   																			
	   	lbl_cl_004_c = new JLabel("");
	   	lbl_cl_004_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(3).booleanValue()) {
					
					label_p0_c.get(3).setIcon(termometro_vacio_escalado);
					estado_p0.set(3,false);
				}else {
					label_p0_c.get(3).setIcon(termometro_escalado);
					estado_p0.set(3,true);

				}
			}
		});
	   	lbl_cl_004_c.setBounds(423, 313, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_004_c);
	   																			
	   	lbl_cl_005_c = new JLabel("");
	   	lbl_cl_005_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p0.get(4).booleanValue()) {
					
					label_p0_c.get(4).setIcon(termometro_vacio_escalado);
					estado_p0.set(4,false);
				}else {
					label_p0_c.get(4).setIcon(termometro_escalado);
					estado_p0.set(4,true);

				}
			}
		});
	   	lbl_cl_005_c.setBounds(561, 298, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_005_c);
	   	
	   	label_p0_c.add(lbl_cl_001_c);
	   	label_p0_c.add(lbl_cl_002_c);
	   	label_p0_c.add(lbl_cl_003_c);
	   	label_p0_c.add(lbl_cl_004_c);
	   	label_p0_c.add(lbl_cl_005_c);
	   	label_p0_c.add(lbl_cl_006_c);
	   	label_p0_c.add(lbl_cl_007_c);
	   	label_p0_c.add(lbl_cl_008_c);
	   	label_p0_c.add(lbl_cl_009_c);
	   	label_p0_c.add(lbl_cl_010_c);
	   	label_p0_c.add(lbl_cl_011_c);
	   	label_p0_c.add(lbl_cl_012_c);
	   	label_p0_c.add(lbl_cl_013_c);
	   	label_p0_c.add(lbl_cl_014_c);
	   	label_p0_c.add(lbl_cl_015_c);
	   	label_p0_c.add(lbl_cl_016_c);
	   	label_p0_c.add(lbl_cl_017_c);
	   	label_p0_c.add(lbl_cl_019_c);
	   	label_p0_c.add(lbl_cl_020_c);
	   	label_p0_c.add(lbl_cl_021_c);
	   	label_p0_c.add(lbl_cl_022_c);
	   	label_p0_c.add(lbl_cl_023_c);
	   	label_p0_c.add(lbl_cl_024_c);
	   	label_p0_c.add(lbl_cl_025_c);
	   	label_p0_c.add(lbl_cl_026_c);
		
				
	   	lbl_img_piso0_a = new JLabel("");
	   	lbl_img_piso0_a.setBounds(0, -80, 600, 600);
	   	panel_alarmas_p0.add(lbl_img_piso0_a);
	   	lbl_img_piso0_a.setIcon(plano0);
	   	
	   	lbl_img_piso0_c = new JLabel("");
	   	lbl_img_piso0_c.setBounds(0, -80, 600, 600);
	   	panel_calefaccion_p0.add(lbl_img_piso0_c);
	   	lbl_img_piso0_c.setIcon(plano0);
	   	
	   
	   	
	   /*RANDOMIZADOR PISO 0*/
	   
		Random r = new Random();
		int result;
		
		
		for(int i=0;i<label_p0_c.size();i++) {
			result = r.nextInt(100-1) + 1;
			if(result>30) {
				estado_p0.add(true);
				label_p0_c.get(i).setIcon(termometro_escalado);
			}else {
				estado_p0.add(false);
				label_p0_c.get(i).setIcon(termometro_vacio_escalado);

			}

		}
		for(int i=0;i<estado_p0.size();i++) {
			System.out.println(estado_p0.get(i).toString());
		}
		
		for(int i=0;i<label_p0_a.size();i++) {
			result = r.nextInt(100-1) + 1;
			if (result>15) {
				label_p0_a.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			label_p0_a.get(i).setIcon(luz_roja_escalada);

		}
	}
		
		/*PISO 1*/
		
		/*ALARMAS*/
		
		lbl_cl_120_a = new JLabel("");
		lbl_cl_120_a.setBounds(85, 272, 39, 13);
		panel_alarmas_p1.add(lbl_cl_120_a);
		
		lbl_cl_116_a = new JLabel("");
		lbl_cl_116_a.setBounds(191, 197, 39, 13);
		panel_alarmas_p1.add(lbl_cl_116_a);
		
	   	
	   	lbl_cl_115_a = new JLabel("");
	   	lbl_cl_115_a.setBounds(147, 272, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_115_a);
	   			
	   	lbl_cl_114_a = new JLabel("");
	   	lbl_cl_114_a.setBounds(218, 272, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_114_a);
	   			
	   	lbl_cl_117_a = new JLabel("");
	   	lbl_cl_117_a.setBounds(283, 197, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_117_a);
	   			
	   	lbl_cl_113_a = new JLabel("");
	   	lbl_cl_113_a.setBounds(317, 272, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_113_a);
	   					
	   	lbl_cl_118_a = new JLabel("");
	   	lbl_cl_118_a.setBounds(379, 197, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_118_a);
	   					
	   	lbl_cl_106_a = new JLabel("");
	   	lbl_cl_106_a.setBounds(423, 159, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_106_a);
	   							
	   	lbl_cl_108_a = new JLabel("");
	   	lbl_cl_108_a.setBounds(423, 113, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_108_a);
	   							
	   	lbl_cl_110_a = new JLabel("");
	   	lbl_cl_110_a.setBounds(423, 67, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_110_a);
	   									
	   	lbl_cl_112_a = new JLabel("");
	   	lbl_cl_112_a.setBounds(501, 28, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_112_a);
	   									
	   	lbl_cl_119_a = new JLabel("");
	   	lbl_cl_119_a.setBounds(109, 334, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_119_a);
	   											
	   	lbl_cl_111_a = new JLabel("");
	   	lbl_cl_111_a.setBounds(561, 77, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_111_a);
	   	
	   											
	   	lbl_cl_109_a = new JLabel("");
	   	lbl_cl_109_a.setBounds(561, 100, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_109_a);
	   													
	   	lbl_cl_107_a = new JLabel("");
	   	lbl_cl_107_a.setBounds(561, 147, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_107_a);
	   													
	   	lbl_cl_105_a = new JLabel("");
	   	lbl_cl_105_a.setBounds(561, 170, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_105_a);
	   															
	   	lbl_cl_101_a = new JLabel("");
	   	lbl_cl_101_a.setBounds(423, 387, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_101_a);
	   																	
	   	lbl_cl_103_a = new JLabel("");
	   	lbl_cl_103_a.setBounds(423, 334, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_103_a);
	   																	
	   	lbl_cl_102_a = new JLabel("");
	   	lbl_cl_102_a.setBounds(423, 357, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_102_a);
	   																			
	   	lbl_cl_104_a = new JLabel("");
	   	lbl_cl_104_a.setBounds(423, 313, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_104_a);
	   	
	   	label_p1_a.add(lbl_cl_101_a);
	   	label_p1_a.add(lbl_cl_102_a);
	   	label_p1_a.add(lbl_cl_103_a);
	   	label_p1_a.add(lbl_cl_104_a);
	   	label_p1_a.add(lbl_cl_105_a);
	   	label_p1_a.add(lbl_cl_106_a);
	   	label_p1_a.add(lbl_cl_107_a);
	   	label_p1_a.add(lbl_cl_109_a);
	   	label_p1_a.add(lbl_cl_108_a);
	   	label_p1_a.add(lbl_cl_111_a);
	   	label_p1_a.add(lbl_cl_110_a);
	   	label_p1_a.add(lbl_cl_119_a);
	   	label_p1_a.add(lbl_cl_112_a);
	   	label_p1_a.add(lbl_cl_118_a);
	   	label_p1_a.add(lbl_cl_113_a);
	   	label_p1_a.add(lbl_cl_117_a);
	   	label_p1_a.add(lbl_cl_114_a);
	   	label_p1_a.add(lbl_cl_116_a);
	   	label_p1_a.add(lbl_cl_115_a);
	   	label_p1_a.add(lbl_cl_120_a);
	   	
	   	panel_alarmas_p1.setVisible(false);
	   	panel_alarmas_p2.setVisible(false);
	   	panel_calefaccion_p0.setVisible(false);
	   	panel_calefaccion_p1.setVisible(false);
	   	panel_calefaccion_p2.setVisible(false);
	   	
	   	/*CALEFACCION*/
	   	
	   	lbl_cl_116_c = new JLabel("");
		lbl_cl_116_c.setBounds(191, 197, 39, 13);
		panel_calefaccion_p1.add(lbl_cl_116_c);
		
	   	
	   	lbl_cl_115_c = new JLabel("");
	   	lbl_cl_115_c.setBounds(147, 272, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_115_c);
	   			
	   	lbl_cl_114_c = new JLabel("");
	   	lbl_cl_114_c.setBounds(218, 272, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_114_c);
	   			
	   	lbl_cl_117_c = new JLabel("");
	   	lbl_cl_117_c.setBounds(283, 197, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_117_c);
	   			
	   	lbl_cl_113_c = new JLabel("");
	   	lbl_cl_113_c.setBounds(317, 272, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_113_c);
	   					
	   	lbl_cl_118_c = new JLabel("");
	   	lbl_cl_118_c.setBounds(379, 197, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_118_c);
	   					
	   	lbl_cl_106_c = new JLabel("");
	   	lbl_cl_106_c.setBounds(423, 159, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_106_c);
	   							
	   	lbl_cl_108_c = new JLabel("");
	   	lbl_cl_108_c.setBounds(423, 113, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_108_c);
	   							
	   	lbl_cl_110_c = new JLabel("");
	   	lbl_cl_110_c.setBounds(423, 67, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_110_c);
	   									
	   	lbl_cl_112_c = new JLabel("");
	   	lbl_cl_112_c.setBounds(501, 28, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_112_c);
	   									
	   	lbl_cl_119_c = new JLabel("");
	   	lbl_cl_119_c.setBounds(109, 334, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_119_c);
	   											
	   	lbl_cl_111_c = new JLabel("");
	   	lbl_cl_111_c.setBounds(561, 77, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_111_c);
	   	
	   											
	   	lbl_cl_109_c = new JLabel("");
	   	lbl_cl_109_c.setBounds(561, 100, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_109_c);
	   													
	   	lbl_cl_107_c = new JLabel("");
	   	lbl_cl_107_c.setBounds(561, 147, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_107_c);
	   													
	   	lbl_cl_105_c = new JLabel("");
	   	lbl_cl_105_c.setBounds(561, 170, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_105_c);
	   															
	   	lbl_cl_101_c = new JLabel("");
	   	lbl_cl_101_c.setBounds(423, 387, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_101_c);
	   																	
	   	lbl_cl_103_c = new JLabel("");
	   	lbl_cl_103_c.setBounds(423, 334, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_103_c);
	   																	
	   	lbl_cl_102_c = new JLabel("");
	   	lbl_cl_102_c.setBounds(423, 357, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_102_c);
	   																			
	   	lbl_cl_104_c = new JLabel("");
	   	lbl_cl_104_c.setBounds(423, 313, 39, 13);
	   	panel_calefaccion_p1.add(lbl_cl_104_c);
	   	
	   	label_p1_c.add(lbl_cl_101_c);
	   	label_p1_c.add(lbl_cl_102_c);
	   	label_p1_c.add(lbl_cl_103_c);
	   	label_p1_c.add(lbl_cl_104_c);
	   	label_p1_c.add(lbl_cl_105_c);
	   	label_p1_c.add(lbl_cl_106_c);
	   	label_p1_c.add(lbl_cl_107_c);
	   	label_p1_c.add(lbl_cl_109_c);
	   	label_p1_c.add(lbl_cl_108_c);
	   	label_p1_c.add(lbl_cl_111_c);
	   	label_p1_c.add(lbl_cl_110_c);
	   	label_p1_c.add(lbl_cl_119_c);
	   	label_p1_c.add(lbl_cl_112_c);
	   	label_p1_c.add(lbl_cl_118_c);
	   	label_p1_c.add(lbl_cl_113_c);
	   	label_p1_c.add(lbl_cl_117_c);
	   	label_p1_c.add(lbl_cl_114_c);
	   	label_p1_c.add(lbl_cl_116_c);
	   	label_p1_c.add(lbl_cl_115_c);
	   	label_p1_c.add(lbl_cl_120_c);
	   	
	    
	   	/*RANDOMIZADOR PISO 1*/
		   
		for(int i=0;i<label_p1_c.size();i++) {
			result = r.nextInt(100-1) + 1;
			if(result>30) {
				estado_p1.add(true);
				label_p1_c.get(i).setIcon(termometro_escalado);
			}else {
				estado_p1.add(false);
				label_p1_c.get(i).setIcon(termometro_vacio_escalado);

			}

		}
		
		
		for(int i=0;i<label_p1_a.size();i++) {
			result = r.nextInt(100-1) + 1;
			if (result>15) {
				label_p1_a.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			label_p1_a.get(i).setIcon(luz_roja_escalada);

		}
	}
	   	
	   	
	   	/*PLANOS*/
	   	
		lbl_img_piso1_a = new JLabel("");
	   	lbl_img_piso1_a.setBounds(0, -80, 600, 600);
	   	panel_alarmas_p1.add(lbl_img_piso1_a);
	   	lbl_img_piso1_a.setIcon(plano1);
	   	
		lbl_img_piso1_c = new JLabel("");
	   	lbl_img_piso1_c.setBounds(0, -80, 600, 600);
	   	panel_calefaccion_p1.add(lbl_img_piso1_c);
	   	lbl_img_piso1_c.setIcon(plano1);
	   	
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
	
	private void mostrar_alarmas() {
		if(cont_piso==0) {
			panel_alarmas_p0.setVisible(true);
			panel_calefaccion_p0.setVisible(false);
			panel_alarmas_p1.setVisible(false);
			panel_alarmas_p2.setVisible(false);
			panel_calefaccion_p1.setVisible(false);
			panel_calefaccion_p2.setVisible(false);
		}
		
		else if(cont_piso==1) {
			panel_alarmas_p0.setVisible(false);
			panel_calefaccion_p0.setVisible(false);
			panel_alarmas_p1.setVisible(true);
			panel_alarmas_p2.setVisible(false);
			panel_calefaccion_p1.setVisible(false);
			panel_calefaccion_p2.setVisible(false);
		}
		
		else {
			panel_alarmas_p0.setVisible(false);
			panel_calefaccion_p0.setVisible(false);
			panel_alarmas_p1.setVisible(false);
			panel_alarmas_p2.setVisible(true);
			panel_calefaccion_p1.setVisible(false);
			panel_calefaccion_p2.setVisible(false);
		}
		
	}
	
	private void mostrar_calefaccion() {
		
		if(cont_piso==0) {
			panel_alarmas_p0.setVisible(false);
			panel_calefaccion_p0.setVisible(true);
			panel_alarmas_p1.setVisible(false);
			panel_alarmas_p2.setVisible(false);
			panel_calefaccion_p1.setVisible(false);
			panel_calefaccion_p2.setVisible(false);
		}
		
		else if(cont_piso==1) {
			panel_alarmas_p0.setVisible(false);
			panel_calefaccion_p0.setVisible(false);
			panel_alarmas_p1.setVisible(false);
			panel_alarmas_p2.setVisible(false);
			panel_calefaccion_p1.setVisible(true);
			panel_calefaccion_p2.setVisible(false);
		}
		
		else {
			panel_alarmas_p0.setVisible(false);
			panel_calefaccion_p0.setVisible(false);
			panel_alarmas_p1.setVisible(false);
			panel_alarmas_p2.setVisible(false);
			panel_calefaccion_p1.setVisible(false);
			panel_calefaccion_p2.setVisible(true);
		}
		
	}
	
	private void poner_piso() {
		// TODO Auto-generated method stub
		lbl_piso.setText("Piso "+cont_piso);
	}
	
}