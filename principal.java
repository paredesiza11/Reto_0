package reto_0;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
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
	private JLabel lblAlarmaCalefaccion;
	
	
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
	
	/*PISO 2*/
	
		/*ALARMAS*/
	
	private JLabel lbl_cl_220_a;
	private JLabel lbl_cl_216_a;
	private JLabel lbl_cl_215_a;
	private JLabel lbl_cl_214_a;
	private JLabel lbl_cl_217_a;
	private JLabel lbl_cl_213_a;
	private JLabel lbl_cl_218_a;
	private JLabel lbl_cl_206_a;
	private JLabel lbl_cl_208_a;
	private JLabel lbl_cl_210_a;
	private JLabel lbl_cl_212_a;
	private JLabel lbl_cl_219_a;
	private JLabel lbl_cl_211_a;
	private JLabel lbl_cl_209_a;
	private JLabel lbl_cl_207_a;
	private JLabel lbl_cl_205_a;
	private JLabel lbl_cl_201_a;
	private JLabel lbl_cl_203_a;
	private JLabel lbl_cl_202_a;
	private JLabel lbl_cl_204_a;
	
		/*CALEFACCION*/
	
	private JLabel lbl_cl_220_c;
	private JLabel lbl_cl_216_c;
	private JLabel lbl_cl_215_c;
	private JLabel lbl_cl_214_c;
	private JLabel lbl_cl_217_c;
	private JLabel lbl_cl_213_c;
	private JLabel lbl_cl_218_c;
	private JLabel lbl_cl_206_c;
	private JLabel lbl_cl_208_c;
	private JLabel lbl_cl_210_c;
	private JLabel lbl_cl_212_c;
	private JLabel lbl_cl_219_c;
	private JLabel lbl_cl_211_c;
	private JLabel lbl_cl_209_c;
	private JLabel lbl_cl_207_c;
	private JLabel lbl_cl_205_c;
	private JLabel lbl_cl_201_c;
	private JLabel lbl_cl_203_c;
	private JLabel lbl_cl_202_c;
	private JLabel lbl_cl_204_c;
	
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
		ArrayList<JLabel>arraylistalarmas=new ArrayList<JLabel>();
		
		ArrayList<JLabel>arraylistcalefaccion=new ArrayList<JLabel>();
		
		ArrayList<Boolean> estado=new ArrayList<Boolean>();
		
	
		
		/*IMAGENES PISOS*/
		Image img = new ImageIcon(("../reto_0/imagenes/Planta0.png")).getImage();
	   	Image newimg = img.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano0 = new ImageIcon(newimg);
	   	
	   	Image img_p1 = new ImageIcon(("../reto_0/imagenes/Planta1.png")).getImage();
	   	Image newimg_p1 = img_p1.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano1 = new ImageIcon(newimg_p1);
	   	
	   	Image img_p2 = new ImageIcon(("../reto_0/imagenes/Planta2.png")).getImage();
	   	Image newimg_p2 = img_p2.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano2 = new ImageIcon(newimg_p2);

	   	
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
	   	panel_calefaccion_p1.setLayout(null);
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
		lbl_cl_025_a.setName("aula025");
		panel_alarmas_p0.add(lbl_cl_025_a);
		
		lbl_cl_023_a = new JLabel("");
		lbl_cl_023_a.setBounds(191, 250, 39, 13);
		lbl_cl_023_a.setName("aula023");
		panel_alarmas_p0.add(lbl_cl_023_a);
		
	   	
	   	lbl_cl_024_a = new JLabel("");
	   	lbl_cl_024_a.setBounds(142, 250, 39, 13);
		lbl_cl_024_a.setName("aula024");
	   	panel_alarmas_p0.add(lbl_cl_024_a);
	   			
	   	lbl_cl_022_a = new JLabel("");
	   	lbl_cl_022_a.setBounds(234, 250, 39, 13);
		lbl_cl_022_a.setName("aula022");
	   	panel_alarmas_p0.add(lbl_cl_022_a);
	   			
	   	lbl_cl_021_a = new JLabel("");
	   	lbl_cl_021_a.setBounds(283, 250, 39, 13);
		lbl_cl_021_a.setName("aula021");
	   	panel_alarmas_p0.add(lbl_cl_021_a);
	   			
	   	lbl_cl_020_a = new JLabel("");
	   	lbl_cl_020_a.setBounds(340, 250, 39, 13);
		lbl_cl_020_a.setName("aula020");
	   	panel_alarmas_p0.add(lbl_cl_020_a);
	   					
	   	lbl_cl_019_a = new JLabel("");
	   	lbl_cl_019_a.setBounds(379, 197, 39, 13);
		lbl_cl_019_a.setName("aula019");
	   	panel_alarmas_p0.add(lbl_cl_019_a);
	   					
	   	lbl_cl_007_a = new JLabel("");
	   	lbl_cl_007_a.setBounds(423, 159, 39, 13);
		lbl_cl_007_a.setName("aula007");
	   	panel_alarmas_p0.add(lbl_cl_007_a);
	   							
	   	lbl_cl_009_a = new JLabel("");
	   	lbl_cl_009_a.setBounds(423, 136, 39, 13);
		lbl_cl_009_a.setName("aula009");
	   	panel_alarmas_p0.add(lbl_cl_009_a);
	   							
	   	lbl_cl_011_a = new JLabel("");
	   	lbl_cl_011_a.setBounds(423, 113, 39, 13);
		lbl_cl_011_a.setName("aula011");
	   	panel_alarmas_p0.add(lbl_cl_011_a);
	   							
	   	lbl_cl_012_a = new JLabel("");
	   	lbl_cl_012_a.setBounds(423, 90, 39, 13);
		lbl_cl_012_a.setName("aula012");
	   	panel_alarmas_p0.add(lbl_cl_012_a);
	   							
	   	lbl_cl_014_a = new JLabel("");
	   	lbl_cl_014_a.setBounds(423, 67, 39, 13);
	   	panel_alarmas_p0.add(lbl_cl_014_a);
	   							
	   	lbl_cl_016_a = new JLabel("");
	   	lbl_cl_016_a.setBounds(423, 44, 39, 13);
		lbl_cl_016_a.setName("aula016");
	   	panel_alarmas_p0.add(lbl_cl_016_a);
	   									
	   	lbl_cl_017_a = new JLabel("");
	   	lbl_cl_017_a.setBounds(501, 28, 39, 13);
		lbl_cl_017_a.setName("aula017");
	   	panel_alarmas_p0.add(lbl_cl_017_a);
	   									
	   	lbl_cl_015_a = new JLabel("");
	   	lbl_cl_015_a.setBounds(561, 46, 39, 13);
		lbl_cl_015_a.setName("aula015");
	   	panel_alarmas_p0.add(lbl_cl_015_a);
	   	
	   	lbl_cl_026_a = new JLabel("");
	   	lbl_cl_026_a.setBounds(92, 210, 62, 13);
		lbl_cl_026_a.setName("aula026");
	   	panel_alarmas_p0.add(lbl_cl_026_a);
	   											
	   	lbl_cl_013_a = new JLabel("");
	   	lbl_cl_013_a.setBounds(561, 67, 39, 13);
		lbl_cl_013_a.setName("aula013");
	   	panel_alarmas_p0.add(lbl_cl_013_a);
	   	
	   											
	   	lbl_cl_010_a = new JLabel("");
	   	lbl_cl_010_a.setBounds(561, 90, 39, 13);
		lbl_cl_010_a.setName("aula010");
	   	panel_alarmas_p0.add(lbl_cl_010_a);
	   													
	   	lbl_cl_008_a = new JLabel("");
	   	lbl_cl_008_a.setBounds(561, 147, 39, 13);
		lbl_cl_008_a.setName("aula008");
	   	panel_alarmas_p0.add(lbl_cl_008_a);
	   													
	   	lbl_cl_006_a = new JLabel("");
	   	lbl_cl_006_a.setBounds(561, 170, 39, 13);
		lbl_cl_006_a.setName("aula006");
	   	panel_alarmas_p0.add(lbl_cl_006_a);
	   															
	   	lbl_cl_001_a = new JLabel("");
	   	lbl_cl_001_a.setBounds(423, 387, 39, 13);
		lbl_cl_001_a.setName("aula001");
	   	panel_alarmas_p0.add(lbl_cl_001_a);
	   																	
	   	lbl_cl_003_a = new JLabel("");
	   	lbl_cl_003_a.setBounds(423, 334, 39, 13);
		lbl_cl_003_a.setName("aula003");
	   	panel_alarmas_p0.add(lbl_cl_003_a);
	   																	
	   	lbl_cl_002_a = new JLabel("");
	   	lbl_cl_002_a.setBounds(561, 334, 39, 13);
		lbl_cl_002_a.setName("aula002");
	   	panel_alarmas_p0.add(lbl_cl_002_a);
	   																			
	   	lbl_cl_004_a = new JLabel("");
	   	lbl_cl_004_a.setBounds(423, 313, 39, 13);
		lbl_cl_004_a.setName("aula004");
	   	panel_alarmas_p0.add(lbl_cl_004_a);
	   																			
	   	lbl_cl_005_a = new JLabel("");
	   	lbl_cl_005_a.setBounds(561, 298, 39, 13);
		lbl_cl_005_a.setName("aula005");
	   	panel_alarmas_p0.add(lbl_cl_005_a);
	   	
	   	
	   	arraylistalarmas.add(lbl_cl_001_a);
	   	arraylistalarmas.add(lbl_cl_002_a);
	   	arraylistalarmas.add(lbl_cl_003_a);
	   	arraylistalarmas.add(lbl_cl_004_a);
	   	arraylistalarmas.add(lbl_cl_005_a);
	   	arraylistalarmas.add(lbl_cl_006_a);
	   	arraylistalarmas.add(lbl_cl_007_a);
	   	arraylistalarmas.add(lbl_cl_008_a);
	   	arraylistalarmas.add(lbl_cl_009_a);
	   	arraylistalarmas.add(lbl_cl_010_a);
	   	arraylistalarmas.add(lbl_cl_011_a);
	   	arraylistalarmas.add(lbl_cl_012_a);
	   	arraylistalarmas.add(lbl_cl_013_a);
	   	arraylistalarmas.add(lbl_cl_014_a);
	   	arraylistalarmas.add(lbl_cl_015_a);
	   	arraylistalarmas.add(lbl_cl_016_a);
	   	arraylistalarmas.add(lbl_cl_017_a);
	   	arraylistalarmas.add(lbl_cl_019_a);
	   	arraylistalarmas.add(lbl_cl_020_a);
	   	arraylistalarmas.add(lbl_cl_021_a);
	   	arraylistalarmas.add(lbl_cl_022_a);
	   	arraylistalarmas.add(lbl_cl_023_a);
	   	arraylistalarmas.add(lbl_cl_024_a);
	   	arraylistalarmas.add(lbl_cl_025_a);
		
		/*CALEFACCION*/
		
		lbl_cl_025_c = new JLabel("");	
		lbl_cl_025_c.setName("aula025_c");
		lbl_cl_025_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(23).booleanValue()) {
					
					arraylistcalefaccion.get(23).setIcon(termometro_vacio_escalado);
					estado.set(23,false);
				}else {
					arraylistcalefaccion.get(23).setIcon(termometro_escalado);
					estado.set(23,true);

				}
			}
		});
		lbl_cl_025_c.setBounds(170, 170, 39, 25);
		panel_calefaccion_p0.add(lbl_cl_025_c);

		lbl_cl_023_c = new JLabel("");
		lbl_cl_023_c.setName("aula023_c");
		lbl_cl_023_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(21).booleanValue()) {
					
					arraylistcalefaccion.get(21).setIcon(termometro_vacio_escalado);
					estado.set(21,false);
				}else {
					arraylistcalefaccion.get(21).setIcon(termometro_escalado);
					estado.set(21,true);

				}
			}
		});
		lbl_cl_023_c.setBounds(191, 250, 39, 25);
		panel_calefaccion_p0.add(lbl_cl_023_c);
		
	   	
	   	lbl_cl_024_c = new JLabel("");
		lbl_cl_024_c.setName("aula024_c");
	   	lbl_cl_024_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(22).booleanValue()) {
					
					arraylistcalefaccion.get(22).setIcon(termometro_vacio_escalado);
					estado.set(22,false);
				}else {
					arraylistcalefaccion.get(22).setIcon(termometro_escalado);
					estado.set(22,true);

				}
			}
		});
	   	lbl_cl_024_c.setBounds(142, 245, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_024_c);
	   			
	   	lbl_cl_022_c = new JLabel("");
		lbl_cl_022_c.setName("aula022_c");
	   	lbl_cl_022_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(20).booleanValue()) {
					
					arraylistcalefaccion.get(20).setIcon(termometro_vacio_escalado);
					estado.set(20,false);
				}else {
					arraylistcalefaccion.get(20).setIcon(termometro_escalado);
					estado.set(20,true);

				}
			}
		});
	   	lbl_cl_022_c.setBounds(234, 245, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_022_c);
	   			
	   	lbl_cl_021_c = new JLabel("");
		lbl_cl_021_c.setName("aula021_c");
	   	lbl_cl_021_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(19).booleanValue()) {
					
					arraylistcalefaccion.get(19).setIcon(termometro_vacio_escalado);
					estado.set(19,false);
				}else {
					arraylistcalefaccion.get(19).setIcon(termometro_escalado);
					estado.set(19,true);

				}
			}
		});
	   	lbl_cl_021_c.setBounds(283, 250, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_021_c);
	   			
	   	lbl_cl_020_c = new JLabel("");
		lbl_cl_020_c.setName("aula020_c");
	   	lbl_cl_020_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(18).booleanValue()) {
					
					arraylistcalefaccion.get(18).setIcon(termometro_vacio_escalado);
					estado.set(18,false);
				}else {
					arraylistcalefaccion.get(18).setIcon(termometro_escalado);
					estado.set(18,true);

				}
			}
		});
	   	lbl_cl_020_c.setBounds(340, 250, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_020_c);
	   					
	   	lbl_cl_019_c = new JLabel("");
		lbl_cl_019_c.setName("aula019_c");
	   	lbl_cl_019_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(17).booleanValue()) {
					
					arraylistcalefaccion.get(17).setIcon(termometro_vacio_escalado);
					estado.set(17,false);
				}else {
					arraylistcalefaccion.get(17).setIcon(termometro_escalado);
					estado.set(17,true);

				}
			}
		});
	   	lbl_cl_019_c.setBounds(379, 170, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_019_c);
	   					
	   	lbl_cl_007_c = new JLabel("");
		lbl_cl_007_c.setName("aula007_c");
	   	lbl_cl_007_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(6).booleanValue()) {
					
					arraylistcalefaccion.get(6).setIcon(termometro_vacio_escalado);
					estado.set(6,false);
				}else {
					arraylistcalefaccion.get(6).setIcon(termometro_escalado);
					estado.set(6,true);

				}
			}
		});
	   	lbl_cl_007_c.setBounds(423, 159, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_007_c);
	   							
	   	lbl_cl_009_c = new JLabel("");
		lbl_cl_009_c.setName("aula009_c");
	   	lbl_cl_009_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(8).booleanValue()) {
					
					arraylistcalefaccion.get(8).setIcon(termometro_vacio_escalado);
					estado.set(8,false);
				}else {
					arraylistcalefaccion.get(8).setIcon(termometro_escalado);
					estado.set(8,true);

				}
			}
		});
	   	lbl_cl_009_c.setBounds(423, 136, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_009_c);
	   							
	   	lbl_cl_011_c = new JLabel("");
		lbl_cl_011_c.setName("aula011_c");
	   	lbl_cl_011_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(10).booleanValue()) {
					
					arraylistcalefaccion.get(10).setIcon(termometro_vacio_escalado);
					estado.set(10,false);
				}else {
					arraylistcalefaccion.get(10).setIcon(termometro_escalado);
					estado.set(10,true);

				}
			}
		});
	   	lbl_cl_011_c.setBounds(423, 113, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_011_c);
	   							
	   	lbl_cl_012_c = new JLabel("");
		lbl_cl_012_c.setName("aula012_c");
	   	lbl_cl_012_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(11).booleanValue()) {
					
					arraylistcalefaccion.get(11).setIcon(termometro_vacio_escalado);
					estado.set(11,false);
				}else {
					arraylistcalefaccion.get(11).setIcon(termometro_escalado);
					estado.set(11,true);

				}
			}
		});
	   	lbl_cl_012_c.setBounds(423, 90, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_012_c);
	   							
	   	lbl_cl_014_c = new JLabel("");
		lbl_cl_014_c.setName("aula014_c");
	   	lbl_cl_014_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(13).booleanValue()) {
					
					arraylistcalefaccion.get(13).setIcon(termometro_vacio_escalado);
					estado.set(13,false);
				}else {
					arraylistcalefaccion.get(13).setIcon(termometro_escalado);
					estado.set(13,true);

				}
			}
		});
	   	lbl_cl_014_c.setBounds(423, 67, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_014_c);
	   							
	   	lbl_cl_016_c = new JLabel("");
		lbl_cl_016_c.setName("aula016_c");
	   	lbl_cl_016_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(15).booleanValue()) {
					
					arraylistcalefaccion.get(15).setIcon(termometro_vacio_escalado);
					estado.set(15,false);
				}else {
					arraylistcalefaccion.get(15).setIcon(termometro_escalado);
					estado.set(15,true);

				}
			}
		});
	   	lbl_cl_016_c.setBounds(423, 44, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_016_c);
	   									
	   	lbl_cl_017_c = new JLabel("");
		lbl_cl_017_c.setName("aula017_c");
	   	lbl_cl_017_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(16).booleanValue()) {
					
					arraylistcalefaccion.get(16).setIcon(termometro_vacio_escalado);
					estado.set(16,false);
				}else {
					arraylistcalefaccion.get(16).setIcon(termometro_escalado);
					estado.set(16,true);

				}
			}
		});
	   	lbl_cl_017_c.setBounds(501, 28, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_017_c);
	   									
	   	lbl_cl_015_c = new JLabel("");
		lbl_cl_015_c.setName("aula015_c");
	   	lbl_cl_015_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(14).booleanValue()) {
					
					arraylistcalefaccion.get(14).setIcon(termometro_vacio_escalado);
					estado.set(14,false);
				}else {
					arraylistcalefaccion.get(14).setIcon(termometro_escalado);
					estado.set(14,true);

				}
			}
		});
	   	lbl_cl_015_c.setBounds(561, 46, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_015_c);
	   	
	   	lbl_cl_026_c = new JLabel("");
		lbl_cl_026_c.setName("aula026_c");
	   	lbl_cl_026_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(24).booleanValue()) {
					
					arraylistcalefaccion.get(24).setIcon(termometro_vacio_escalado);
					estado.set(24,false);
				}else {
					arraylistcalefaccion.get(24).setIcon(termometro_escalado);
					estado.set(24,true);

				}
			}
		});
	   	lbl_cl_026_c.setBounds(92, 210, 62, 25);
	   	panel_calefaccion_p0.add(lbl_cl_026_c);
	   											
	   	lbl_cl_013_c = new JLabel("");
		lbl_cl_013_c.setName("aula013_c");
	   	lbl_cl_013_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(12).booleanValue()) {
					
					arraylistcalefaccion.get(12).setIcon(termometro_vacio_escalado);
					estado.set(12,false);
				}else {
					arraylistcalefaccion.get(12).setIcon(termometro_escalado);
					estado.set(12,true);

				}
			}
		});
	   	lbl_cl_013_c.setBounds(561, 67, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_013_c);
	   	
	   											
	   	lbl_cl_010_c = new JLabel("");
		lbl_cl_010_c.setName("aula010_c");
	   	lbl_cl_010_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(9).booleanValue()) {
					
					arraylistcalefaccion.get(9).setIcon(termometro_vacio_escalado);
					estado.set(9,false);
				}else {
					arraylistcalefaccion.get(9).setIcon(termometro_escalado);
					estado.set(9,true);

				}
			}
		});
	   	lbl_cl_010_c.setBounds(561, 90, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_010_c);
	   													
	   	lbl_cl_008_c = new JLabel("");
		lbl_cl_008_c.setName("aula008_c");
	   	lbl_cl_008_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(7).booleanValue()) {
					
					arraylistcalefaccion.get(7).setIcon(termometro_vacio_escalado);
					estado.set(7,false);
				}else {
					arraylistcalefaccion.get(7).setIcon(termometro_escalado);
					estado.set(7,true);

				}
			}
		});
	   	lbl_cl_008_c.setBounds(561, 147, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_008_c);
	   													
	   	lbl_cl_006_c = new JLabel("");
		lbl_cl_006_c.setName("aula006_c");
	   	lbl_cl_006_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(5).booleanValue()) {
					
					arraylistcalefaccion.get(5).setIcon(termometro_vacio_escalado);
					estado.set(5,false);
				}else {
					arraylistcalefaccion.get(5).setIcon(termometro_escalado);
					estado.set(5,true);

				}
			}
		});
	   	lbl_cl_006_c.setBounds(561, 170, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_006_c);
	   															
	   	lbl_cl_001_c = new JLabel("");
		lbl_cl_001_c.setName("aula001_c");
	   	lbl_cl_001_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(0).booleanValue()) {
					
					arraylistcalefaccion.get(0).setIcon(termometro_vacio_escalado);
					estado.set(0,false);
				}else {
					arraylistcalefaccion.get(0).setIcon(termometro_escalado);
					estado.set(0,true);

				}
			}
		});
	   	lbl_cl_001_c.setBounds(423, 387, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_001_c);
	   																	
	   	lbl_cl_003_c = new JLabel("");
		lbl_cl_003_c.setName("aula003_c");
	   	lbl_cl_003_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(2).booleanValue()) {
					
					arraylistcalefaccion.get(2).setIcon(termometro_vacio_escalado);
					estado.set(2,false);
				}else {
					arraylistcalefaccion.get(2).setIcon(termometro_escalado);
					estado.set(2,true);

				}
			}
		});
	   	lbl_cl_003_c.setBounds(423, 334, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_003_c);
	   																	
	   	lbl_cl_002_c = new JLabel("");
		lbl_cl_002_c.setName("aula002_c");
	   	lbl_cl_002_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(1).booleanValue()) {
					
					arraylistcalefaccion.get(1).setIcon(termometro_vacio_escalado);
					estado.set(1,false);
				}else {
					arraylistcalefaccion.get(1).setIcon(termometro_escalado);
					estado.set(1,true);

				}
			}
		});
	   	lbl_cl_002_c.setBounds(561, 334, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_002_c);
	   																			
	   	lbl_cl_004_c = new JLabel("");
		lbl_cl_004_c.setName("aula004_c");
	   	lbl_cl_004_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(3).booleanValue()) {
					
					arraylistcalefaccion.get(3).setIcon(termometro_vacio_escalado);
					estado.set(3,false);
				}else {
					arraylistcalefaccion.get(3).setIcon(termometro_escalado);
					estado.set(3,true);

				}
			}
		});
	   	lbl_cl_004_c.setBounds(423, 313, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_004_c);
	   																			
	   	lbl_cl_005_c = new JLabel("");
		lbl_cl_005_c.setName("aula005_c");
	   	lbl_cl_005_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(4).booleanValue()) {
					
					arraylistcalefaccion.get(4).setIcon(termometro_vacio_escalado);
					estado.set(4,false);
				}else {
					arraylistcalefaccion.get(4).setIcon(termometro_escalado);
					estado.set(4,true);

				}
			}
		});
	   	lbl_cl_005_c.setBounds(561, 298, 39, 25);
	   	panel_calefaccion_p0.add(lbl_cl_005_c);
	   	
	   	arraylistcalefaccion.add(lbl_cl_001_c);
	   	arraylistcalefaccion.add(lbl_cl_002_c);
	   	arraylistcalefaccion.add(lbl_cl_003_c);
	   	arraylistcalefaccion.add(lbl_cl_004_c);
	   	arraylistcalefaccion.add(lbl_cl_005_c);
	   	arraylistcalefaccion.add(lbl_cl_006_c);
	   	arraylistcalefaccion.add(lbl_cl_007_c);
	   	arraylistcalefaccion.add(lbl_cl_008_c);
	   	arraylistcalefaccion.add(lbl_cl_009_c);
	   	arraylistcalefaccion.add(lbl_cl_010_c);
	   	arraylistcalefaccion.add(lbl_cl_011_c);
	   	arraylistcalefaccion.add(lbl_cl_012_c);
	   	arraylistcalefaccion.add(lbl_cl_013_c);
	   	arraylistcalefaccion.add(lbl_cl_014_c);
	   	arraylistcalefaccion.add(lbl_cl_015_c);
	   	arraylistcalefaccion.add(lbl_cl_016_c);
	   	arraylistcalefaccion.add(lbl_cl_017_c);
	   	arraylistcalefaccion.add(lbl_cl_019_c);
	   	arraylistcalefaccion.add(lbl_cl_020_c);
	   	arraylistcalefaccion.add(lbl_cl_021_c);
	   	arraylistcalefaccion.add(lbl_cl_022_c);
	   	arraylistcalefaccion.add(lbl_cl_023_c);
	   	arraylistcalefaccion.add(lbl_cl_024_c);
	   	arraylistcalefaccion.add(lbl_cl_025_c);
	   	arraylistcalefaccion.add(lbl_cl_026_c);
		
				
	   	
	   	
	   
	   	
	   /*RANDOMIZADOR PISO 0*/
	   
		Random r = new Random();
		int result;
		
		
		for(int i=0;i<arraylistcalefaccion.size();i++) {
			result = r.nextInt(100-1) + 1;
			if(result>30) {
				estado.add(true);
				arraylistcalefaccion.get(i).setIcon(termometro_escalado);
			}else {
				estado.add(false);
				arraylistcalefaccion.get(i).setIcon(termometro_vacio_escalado);

			}

		}
		
		for(int i=0;i<arraylistalarmas.size();i++) {
			result = r.nextInt(100-1) + 1;
			if (result>15) {
				arraylistalarmas.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			arraylistalarmas.get(i).setIcon(luz_roja_escalada);

		}
	}
		
		/*PISO 1*/
		
		/*ALARMAS*/
		
		lbl_cl_120_a = new JLabel("");
		lbl_cl_120_a.setName("aula120");
		lbl_cl_120_a.setBounds(85, 272, 39, 13);
		panel_alarmas_p1.add(lbl_cl_120_a);
		
		lbl_cl_116_a = new JLabel("");
		lbl_cl_116_a.setName("aula116");
		lbl_cl_116_a.setBounds(191, 197, 39, 13);
		panel_alarmas_p1.add(lbl_cl_116_a);
		
	   	
	   	lbl_cl_115_a = new JLabel("");
		lbl_cl_115_a.setName("aula115");
	   	lbl_cl_115_a.setBounds(147, 272, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_115_a);
	   			
	   	lbl_cl_114_a = new JLabel("");
		lbl_cl_114_a.setName("aula114");
	   	lbl_cl_114_a.setBounds(218, 272, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_114_a);
	   			
	   	lbl_cl_117_a = new JLabel("");
		lbl_cl_117_a.setName("aula117");
	   	lbl_cl_117_a.setBounds(283, 197, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_117_a);
	   			
	   	lbl_cl_113_a = new JLabel("");
		lbl_cl_113_a.setName("aula113");
	   	lbl_cl_113_a.setBounds(317, 272, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_113_a);
	   					
	   	lbl_cl_118_a = new JLabel("");
	   	lbl_cl_118_a.setBounds(379, 197, 39, 13);
		lbl_cl_118_a.setName("aula118");
	   	panel_alarmas_p1.add(lbl_cl_118_a);
	   					
	   	lbl_cl_106_a = new JLabel("");
		lbl_cl_106_a.setName("aula106");
	   	lbl_cl_106_a.setBounds(423, 159, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_106_a);
	   							
	   	lbl_cl_108_a = new JLabel("");
		lbl_cl_108_a.setName("aula108");
	   	lbl_cl_108_a.setBounds(423, 113, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_108_a);
	   							
	   	lbl_cl_110_a = new JLabel("");
		lbl_cl_110_a.setName("aula110");
	   	lbl_cl_110_a.setBounds(423, 67, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_110_a);
	   									
	   	lbl_cl_112_a = new JLabel("");
		lbl_cl_112_a.setName("aula112");
	   	lbl_cl_112_a.setBounds(501, 28, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_112_a);
	   									
	   	lbl_cl_119_a = new JLabel("");
		lbl_cl_119_a.setName("aula119");
	   	lbl_cl_119_a.setBounds(109, 334, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_119_a);
	   											
	   	lbl_cl_111_a = new JLabel("");
		lbl_cl_111_a.setName("aula111");
	   	lbl_cl_111_a.setBounds(561, 77, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_111_a);
	   	
	   											
	   	lbl_cl_109_a = new JLabel("");
		lbl_cl_109_a.setName("aula109");
	   	lbl_cl_109_a.setBounds(561, 100, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_109_a);
	   													
	   	lbl_cl_107_a = new JLabel("");
		lbl_cl_107_a.setName("aula107");
	   	lbl_cl_107_a.setBounds(561, 147, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_107_a);
	   													
	   	lbl_cl_105_a = new JLabel("");
		lbl_cl_105_a.setName("aula105");
	   	lbl_cl_105_a.setBounds(561, 170, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_105_a);
	   															
	   	lbl_cl_101_a = new JLabel("");
		lbl_cl_101_a.setName("aula101");
	   	lbl_cl_101_a.setBounds(423, 387, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_101_a);
	   																	
	   	lbl_cl_103_a = new JLabel("");
		lbl_cl_103_a.setName("aula103");
	   	lbl_cl_103_a.setBounds(423, 334, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_103_a);
	   																	
	   	lbl_cl_102_a = new JLabel("");
		lbl_cl_102_a.setName("aula102");
	   	lbl_cl_102_a.setBounds(423, 357, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_102_a);
	   																			
	   	lbl_cl_104_a = new JLabel("");
		lbl_cl_104_a.setName("aula104");
	   	lbl_cl_104_a.setBounds(423, 313, 39, 13);
	   	panel_alarmas_p1.add(lbl_cl_104_a);
	   	
	   	arraylistalarmas.add(lbl_cl_101_a);
	   	arraylistalarmas.add(lbl_cl_102_a);
	   	arraylistalarmas.add(lbl_cl_103_a);
	   	arraylistalarmas.add(lbl_cl_104_a);
	   	arraylistalarmas.add(lbl_cl_105_a);
	   	arraylistalarmas.add(lbl_cl_106_a);
	   	arraylistalarmas.add(lbl_cl_107_a);
	   	arraylistalarmas.add(lbl_cl_108_a);
	   	arraylistalarmas.add(lbl_cl_109_a);
	   	arraylistalarmas.add(lbl_cl_110_a);
	   	arraylistalarmas.add(lbl_cl_111_a);
	   	arraylistalarmas.add(lbl_cl_112_a);
	   	arraylistalarmas.add(lbl_cl_113_a);
	   	arraylistalarmas.add(lbl_cl_114_a);
	   	arraylistalarmas.add(lbl_cl_115_a);
	   	arraylistalarmas.add(lbl_cl_116_a);
	   	arraylistalarmas.add(lbl_cl_117_a);
	   	arraylistalarmas.add(lbl_cl_118_a);
	   	arraylistalarmas.add(lbl_cl_119_a);
	   	arraylistalarmas.add(lbl_cl_120_a);
	   	
	   	panel_alarmas_p1.setVisible(false);
	   	panel_alarmas_p2.setVisible(false);
	   	panel_calefaccion_p0.setVisible(false);
	   	panel_calefaccion_p1.setVisible(false);
	   	panel_calefaccion_p2.setVisible(false);
	   	
	   	/*CALEFACCION*/
	   	
	   	lbl_cl_101_c = new JLabel("");	
		lbl_cl_101_c.setName("aula101_c");
		lbl_cl_101_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(25).booleanValue()) {
					
					arraylistcalefaccion.get(25).setIcon(termometro_vacio_escalado);
					estado.set(25,false);
				}else {
					arraylistcalefaccion.get(25).setIcon(termometro_escalado);
					estado.set(25,true);

				}
			}
		});
		lbl_cl_101_c.setBounds(423, 387, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_101_c);
		
		lbl_cl_102_c = new JLabel("");	
		lbl_cl_102_c.setName("aula102_c");
		lbl_cl_102_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(26).booleanValue()) {
					
					arraylistcalefaccion.get(26).setIcon(termometro_vacio_escalado);
					estado.set(26,false);
				}else {
					arraylistcalefaccion.get(26).setIcon(termometro_escalado);
					estado.set(26,true);

				}
			}
		});
		lbl_cl_102_c.setBounds(423, 350, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_102_c);
		
		lbl_cl_103_c = new JLabel("");		
		lbl_cl_103_c.setName("aula103_c");
		lbl_cl_103_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(27).booleanValue()) {
					
					arraylistcalefaccion.get(27).setIcon(termometro_vacio_escalado);
					estado.set(27,false);
				}else {
					arraylistcalefaccion.get(27).setIcon(termometro_escalado);
					estado.set(27,true);

				}
			}
		});
		lbl_cl_103_c.setBounds(423, 325, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_103_c);
		
		lbl_cl_104_c = new JLabel("");	
		lbl_cl_104_c.setName("aula104_c");
		lbl_cl_104_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(28).booleanValue()) {
					
					arraylistcalefaccion.get(28).setIcon(termometro_vacio_escalado);
					estado.set(28,false);
				}else {
					arraylistcalefaccion.get(28).setIcon(termometro_escalado);
					estado.set(28,true);

				}
			}
		});
		lbl_cl_104_c.setBounds(423, 300, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_104_c);
		
		lbl_cl_105_c = new JLabel("");	
		lbl_cl_105_c.setName("aula105_c");
		lbl_cl_105_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(29).booleanValue()) {
					
					arraylistcalefaccion.get(29).setIcon(termometro_vacio_escalado);
					estado.set(29,false);
				}else {
					arraylistcalefaccion.get(29).setIcon(termometro_escalado);
					estado.set(29,true);

				}
			}
		});
		lbl_cl_105_c.setBounds(555, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_105_c);
		
		lbl_cl_106_c = new JLabel("");	
		lbl_cl_106_c.setName("aula106_c");
		lbl_cl_106_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(30).booleanValue()) {
					
					arraylistcalefaccion.get(30).setIcon(termometro_vacio_escalado);
					estado.set(30,false);
				}else {
					arraylistcalefaccion.get(30).setIcon(termometro_escalado);
					estado.set(30,true);

				}
			}
		});
		lbl_cl_106_c.setBounds(455, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_106_c);
		
		lbl_cl_107_c = new JLabel("");		
		lbl_cl_107_c.setName("aula107_c");
		lbl_cl_107_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(31).booleanValue()) {
					
					arraylistcalefaccion.get(31).setIcon(termometro_vacio_escalado);
					estado.set(31,false);
				}else {
					arraylistcalefaccion.get(31).setIcon(termometro_escalado);
					estado.set(31,true);

				}
			}
		});
		lbl_cl_107_c.setBounds(555, 135, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_107_c);
		
		lbl_cl_108_c = new JLabel("");		
		lbl_cl_108_c.setName("aula108_c");
		lbl_cl_108_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(32).booleanValue()) {
					
					arraylistcalefaccion.get(32).setIcon(termometro_vacio_escalado);
					estado.set(32,false);
				}else {
					arraylistcalefaccion.get(32).setIcon(termometro_escalado);
					estado.set(32,true);

				}
			}
		});
		lbl_cl_108_c.setBounds(450, 120, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_108_c);
		
		lbl_cl_109_c = new JLabel("");		
		lbl_cl_109_c.setName("aula109_c");
		lbl_cl_109_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(33).booleanValue()) {
					
					arraylistcalefaccion.get(33).setIcon(termometro_vacio_escalado);
					estado.set(33,false);
				}else {
					arraylistcalefaccion.get(33).setIcon(termometro_escalado);
					estado.set(33,true);

				}
			}
		});
		lbl_cl_109_c.setBounds(555, 90, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_109_c);
		
		lbl_cl_110_c = new JLabel("");	
		lbl_cl_110_c.setName("aula110_c");
		lbl_cl_110_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(34).booleanValue()) {
					
					arraylistcalefaccion.get(34).setIcon(termometro_vacio_escalado);
					estado.set(34,false);
				}else {
					arraylistcalefaccion.get(34).setIcon(termometro_escalado);
					estado.set(34,true);

				}
			}
		});
		lbl_cl_110_c.setBounds(450, 80, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_110_c);
		
		lbl_cl_111_c = new JLabel("");
		lbl_cl_111_c.setName("aula111_c");
		lbl_cl_111_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(35).booleanValue()) {
					
					arraylistcalefaccion.get(35).setIcon(termometro_vacio_escalado);
					estado.set(35,false);
				}else {
					arraylistcalefaccion.get(35).setIcon(termometro_escalado);
					estado.set(35,true);

				}
			}
		});
		lbl_cl_111_c.setBounds(555, 60, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_111_c);
		
		lbl_cl_112_c = new JLabel("");
		lbl_cl_112_c.setName("aula112_c");
		lbl_cl_112_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(36).booleanValue()) {
					
					arraylistcalefaccion.get(36).setIcon(termometro_vacio_escalado);
					estado.set(36,false);
				}else {
					arraylistcalefaccion.get(36).setIcon(termometro_escalado);
					estado.set(36,true);

				}
			}
		});
		lbl_cl_112_c.setBounds(450, 40, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_112_c);
		
		lbl_cl_113_c = new JLabel("");	
		lbl_cl_113_c.setName("aula113_c");
		lbl_cl_113_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(37).booleanValue()) {
					
					arraylistcalefaccion.get(37).setIcon(termometro_vacio_escalado);
					estado.set(37,false);
				}else {
					arraylistcalefaccion.get(37).setIcon(termometro_escalado);
					estado.set(37,true);

				}
			}
		});
		lbl_cl_113_c.setBounds(350, 255, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_113_c);
		
		lbl_cl_114_c = new JLabel("");	
		lbl_cl_114_c.setName("aula114_c");
		lbl_cl_114_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(38).booleanValue()) {
					
					arraylistcalefaccion.get(38).setIcon(termometro_vacio_escalado);
					estado.set(38,false);
				}else {
					arraylistcalefaccion.get(38).setIcon(termometro_escalado);
					estado.set(38,true);

				}
			}
		});
		lbl_cl_114_c.setBounds(250, 255, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_114_c);
		
		lbl_cl_115_c = new JLabel("");		
		lbl_cl_115_c.setName("aula115_c");
		lbl_cl_115_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(39).booleanValue()) {
					
					arraylistcalefaccion.get(39).setIcon(termometro_vacio_escalado);
					estado.set(39,false);
				}else {
					arraylistcalefaccion.get(39).setIcon(termometro_escalado);
					estado.set(39,true);

				}
			}
		});
		lbl_cl_115_c.setBounds(170, 255, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_115_c);
		
		lbl_cl_116_c = new JLabel("");		
		lbl_cl_116_c.setName("aula116_c");
		lbl_cl_116_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(40).booleanValue()) {
					
					arraylistcalefaccion.get(40).setIcon(termometro_vacio_escalado);
					estado.set(40,false);
				}else {
					arraylistcalefaccion.get(40).setIcon(termometro_escalado);
					estado.set(40,true);

				}
			}
		});
		lbl_cl_116_c.setBounds(190, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_116_c);
		
		lbl_cl_117_c = new JLabel("");
		lbl_cl_117_c.setName("aula117_c");
		lbl_cl_117_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(41).booleanValue()) {
					
					arraylistcalefaccion.get(41).setIcon(termometro_vacio_escalado);
					estado.set(41,false);
				}else {
					arraylistcalefaccion.get(41).setIcon(termometro_escalado);
					estado.set(41,true);

				}
			}
		});
		lbl_cl_117_c.setBounds(290, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_117_c);
		
		lbl_cl_118_c = new JLabel("");		
		lbl_cl_118_c.setName("aula118_c");
		lbl_cl_118_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(42).booleanValue()) {
					
					arraylistcalefaccion.get(42).setIcon(termometro_vacio_escalado);
					estado.set(42,false);
				}else {
					arraylistcalefaccion.get(42).setIcon(termometro_escalado);
					estado.set(42,true);

				}
			}
		});
		lbl_cl_118_c.setBounds(370, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_118_c);
		
		lbl_cl_119_c = new JLabel("");		
		lbl_cl_119_c.setName("aula119_c");
		lbl_cl_119_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(43).booleanValue()) {
					
					arraylistcalefaccion.get(43).setIcon(termometro_vacio_escalado);
					estado.set(43,false);
				}else {
					arraylistcalefaccion.get(43).setIcon(termometro_escalado);
					estado.set(43,true);

				}
			}
		});
		lbl_cl_119_c.setBounds(110, 330, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_119_c);
		
		lbl_cl_120_c = new JLabel("");
		lbl_cl_120_c.setName("aula120_c");
		lbl_cl_120_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(44).booleanValue()) {
					
					arraylistcalefaccion.get(44).setIcon(termometro_vacio_escalado);
					estado.set(44,false);
				}else {
					arraylistcalefaccion.get(44).setIcon(termometro_escalado);
					estado.set(44,true);

				}
			}
		});
		lbl_cl_120_c.setBounds(85, 270, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_120_c);
	   	
	   	arraylistcalefaccion.add(lbl_cl_101_c);
	   	arraylistcalefaccion.add(lbl_cl_102_c);
	   	arraylistcalefaccion.add(lbl_cl_103_c);
	   	arraylistcalefaccion.add(lbl_cl_104_c);
	   	arraylistcalefaccion.add(lbl_cl_105_c);
	   	arraylistcalefaccion.add(lbl_cl_106_c);
	   	arraylistcalefaccion.add(lbl_cl_107_c);
	   	arraylistcalefaccion.add(lbl_cl_108_c);
	   	arraylistcalefaccion.add(lbl_cl_109_c);
	   	arraylistcalefaccion.add(lbl_cl_110_c);
	   	arraylistcalefaccion.add(lbl_cl_111_c);
	   	arraylistcalefaccion.add(lbl_cl_112_c);
	   	arraylistcalefaccion.add(lbl_cl_113_c);
	   	arraylistcalefaccion.add(lbl_cl_114_c);
	   	arraylistcalefaccion.add(lbl_cl_115_c);
	   	arraylistcalefaccion.add(lbl_cl_116_c);
	   	arraylistcalefaccion.add(lbl_cl_117_c);
	   	arraylistcalefaccion.add(lbl_cl_118_c);
	   	arraylistcalefaccion.add(lbl_cl_119_c);
	   	arraylistcalefaccion.add(lbl_cl_120_c);
	   	
	    
	   	/*RANDOMIZADOR PISO 1*/
		   
		for(int i=25;i<45;i++) {
			result = r.nextInt(100-1) + 1;
			if(result>30) {
				estado.add(true);
				arraylistcalefaccion.get(i).setIcon(termometro_escalado);
			}else {
				estado.add(false);
				arraylistcalefaccion.get(i).setIcon(termometro_vacio_escalado);

			}

		}
		
		
		for(int i=25;i<44;i++) {
			result = r.nextInt(100-1) + 1;
			if (result>15) {
				arraylistalarmas.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			arraylistalarmas.get(i).setIcon(luz_roja_escalada);

		}
	}
		
		/*PISO 2*/
		
		panel_alarmas_p2.setLayout(null);
		panel_calefaccion_p2.setLayout(null);
		
			/*ALARMAS*/
		
		lbl_cl_220_a = new JLabel("");
		lbl_cl_220_a.setName("aula220");
		lbl_cl_220_a.setBounds(55, 172, 39, 13);
		panel_alarmas_p2.add(lbl_cl_220_a);
		
		lbl_cl_216_a = new JLabel("");
		lbl_cl_216_a.setName("aula216");
		lbl_cl_216_a.setBounds(330, 285, 39, 13);
		panel_alarmas_p2.add(lbl_cl_216_a);
		
	   	
	   	lbl_cl_215_a = new JLabel("");
		lbl_cl_215_a.setName("aula215");
	   	lbl_cl_215_a.setBounds(330, 180, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_215_a);
	   			
	   	lbl_cl_214_a = new JLabel("");
		lbl_cl_214_a.setName("aula214");
	   	lbl_cl_214_a.setBounds(480, 35, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_214_a);
	   			
	   	lbl_cl_217_a = new JLabel("");
		lbl_cl_217_a.setName("aula217");
	   	lbl_cl_217_a.setBounds(190, 285, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_217_a);
	   			
	   	lbl_cl_213_a = new JLabel("");
		lbl_cl_213_a.setName("aula213");
	   	lbl_cl_213_a.setBounds(420, 70, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_213_a);
	   					
	   	lbl_cl_218_a = new JLabel("");
		lbl_cl_218_a.setName("aula218");
	   	lbl_cl_218_a.setBounds(150, 285, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_218_a);
	   					
	   	lbl_cl_206_a = new JLabel("");
		lbl_cl_206_a.setName("aula206");
	   	lbl_cl_206_a.setBounds(540, 320, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_206_a);
	   							
	   	lbl_cl_208_a = new JLabel("");
		lbl_cl_208_a.setName("aula208");
	   	lbl_cl_208_a.setBounds(560, 185, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_208_a);
	   							
	   	lbl_cl_210_a = new JLabel("");
	   	lbl_cl_210_a.setBounds(560, 145, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_210_a);
	   									
	   	lbl_cl_212_a = new JLabel("");
		lbl_cl_212_a.setName("aula212");
	   	lbl_cl_212_a.setBounds(560, 90, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_212_a);
	   									
	   	lbl_cl_219_a = new JLabel("");
		lbl_cl_219_a.setName("aula219");
	   	lbl_cl_219_a.setBounds(109, 334, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_219_a);
	   											
	   	lbl_cl_211_a = new JLabel("");
		lbl_cl_211_a.setName("aula211");
	   	lbl_cl_211_a.setBounds(420, 120, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_211_a);
	   	
	   											
	   	lbl_cl_209_a = new JLabel("");
		lbl_cl_209_a.setName("aula209");
	   	lbl_cl_209_a.setBounds(420, 160, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_209_a);
	   													
	   	lbl_cl_207_a = new JLabel("");
		lbl_cl_207_a.setName("aula207");
	   	lbl_cl_207_a.setBounds(540, 290, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_207_a);
	   													
	   	lbl_cl_205_a = new JLabel("");
		lbl_cl_205_a.setName("aula205");
	   	lbl_cl_205_a.setBounds(423, 320, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_205_a);
	   															
	   	lbl_cl_201_a = new JLabel("");
		lbl_cl_201_a.setName("aula201");
	   	lbl_cl_201_a.setBounds(423, 387, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_201_a);
	   																	
	   	lbl_cl_203_a = new JLabel("");
		lbl_cl_203_a.setName("aula203");
	   	lbl_cl_203_a.setBounds(530, 385, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_203_a);
	   																	
	   	lbl_cl_202_a = new JLabel("");
		lbl_cl_202_a.setName("aula202");
	   	lbl_cl_202_a.setBounds(490, 400, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_202_a);
	   																			
	   	lbl_cl_204_a = new JLabel("");
		lbl_cl_204_a.setName("aula204");
	   	lbl_cl_204_a.setBounds(540, 350, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_204_a);
	   	
		arraylistalarmas.add(lbl_cl_201_a);
		arraylistalarmas.add(lbl_cl_202_a);
		arraylistalarmas.add(lbl_cl_203_a);
		arraylistalarmas.add(lbl_cl_204_a);
		arraylistalarmas.add(lbl_cl_205_a);
		arraylistalarmas.add(lbl_cl_206_a);
		arraylistalarmas.add(lbl_cl_207_a);
		arraylistalarmas.add(lbl_cl_208_a);
		arraylistalarmas.add(lbl_cl_209_a);
		arraylistalarmas.add(lbl_cl_210_a);
		arraylistalarmas.add(lbl_cl_211_a);
		arraylistalarmas.add(lbl_cl_212_a);
		arraylistalarmas.add(lbl_cl_213_a);
		arraylistalarmas.add(lbl_cl_214_a);
		arraylistalarmas.add(lbl_cl_215_a);
		arraylistalarmas.add(lbl_cl_216_a);
		arraylistalarmas.add(lbl_cl_217_a);
		arraylistalarmas.add(lbl_cl_218_a);
		arraylistalarmas.add(lbl_cl_219_a);
		arraylistalarmas.add(lbl_cl_220_a);
		
		/*CALEFACCION*/
		
		lbl_cl_201_c = new JLabel("");		
		lbl_cl_201_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(45).booleanValue()) {
					
					arraylistcalefaccion.get(45).setIcon(termometro_vacio_escalado);
					estado.set(45,false);
				}else {
					arraylistcalefaccion.get(45).setIcon(termometro_escalado);
					estado.set(45,true);

				}
			}
		});
		lbl_cl_201_c.setBounds(423, 387, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_201_c);
		
		lbl_cl_202_c = new JLabel("");		
		lbl_cl_202_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(46).booleanValue()) {
					
					arraylistcalefaccion.get(46).setIcon(termometro_vacio_escalado);
					estado.set(46,false);
				}else {
					arraylistcalefaccion.get(46).setIcon(termometro_escalado);
					estado.set(46,true);

				}
			}
		});
		lbl_cl_202_c.setBounds(490, 380, 39, 25);
		lbl_cl_202_c.setName("aula202_c");
		panel_calefaccion_p2.add(lbl_cl_202_c);
		
		lbl_cl_203_c = new JLabel("");		
		lbl_cl_203_c.setName("aula203_c");
		lbl_cl_203_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(47).booleanValue()) {
					
					arraylistcalefaccion.get(47).setIcon(termometro_vacio_escalado);
					estado.set(47,false);
				}else {
					arraylistcalefaccion.get(47).setIcon(termometro_escalado);
					estado.set(47,true);

				}
			}
		});
		lbl_cl_203_c.setBounds(530, 380, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_203_c);
		
		lbl_cl_204_c = new JLabel("");	
		lbl_cl_204_c.setName("aula204_c");
		lbl_cl_204_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(48).booleanValue()) {
					
					arraylistcalefaccion.get(48).setIcon(termometro_vacio_escalado);
					estado.set(48,false);
				}else {
					arraylistcalefaccion.get(48).setIcon(termometro_escalado);
					estado.set(48,true);

				}
			}
		});
		lbl_cl_204_c.setBounds(560, 340, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_204_c);
		
		lbl_cl_205_c = new JLabel("");
		lbl_cl_205_c.setName("aula205_c");
		lbl_cl_205_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(49).booleanValue()) {
					
					arraylistcalefaccion.get(49).setIcon(termometro_vacio_escalado);
					estado.set(49,false);
				}else {
					arraylistcalefaccion.get(49).setIcon(termometro_escalado);
					estado.set(49,true);

				}
			}
		});
		lbl_cl_205_c.setBounds(423, 320, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_205_c);
		
		lbl_cl_206_c = new JLabel("");	
		lbl_cl_206_c.setName("aula206_c");
		lbl_cl_206_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(50).booleanValue()) {
					
					arraylistcalefaccion.get(50).setIcon(termometro_vacio_escalado);
					estado.set(50,false);
				}else {
					arraylistcalefaccion.get(50).setIcon(termometro_escalado);
					estado.set(50,true);

				}
			}
		});
		lbl_cl_206_c.setBounds(560, 310, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_206_c);
		
		lbl_cl_207_c = new JLabel("");
		lbl_cl_207_c.setName("aula207_c");
		lbl_cl_207_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(51).booleanValue()) {
					
					arraylistcalefaccion.get(51).setIcon(termometro_vacio_escalado);
					estado.set(6,false);
				}else {
					arraylistcalefaccion.get(51).setIcon(termometro_escalado);
					estado.set(51,true);

				}
			}
		});
		lbl_cl_207_c.setBounds(560, 275, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_207_c);
		
		lbl_cl_208_c = new JLabel("");		
		lbl_cl_208_c.setName("aula208_c");
		lbl_cl_208_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(52).booleanValue()) {
					
					arraylistcalefaccion.get(52).setIcon(termometro_vacio_escalado);
					estado.set(52,false);
				}else {
					arraylistcalefaccion.get(52).setIcon(termometro_escalado);
					estado.set(52,true);

				}
			}
		});
		lbl_cl_208_c.setBounds(560, 185, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_208_c);
		
		lbl_cl_209_c = new JLabel("");		
		lbl_cl_209_c.setName("aula209_c");
		lbl_cl_209_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(53).booleanValue()) {
					
					arraylistcalefaccion.get(53).setIcon(termometro_vacio_escalado);
					estado.set(53,false);
				}else {
					arraylistcalefaccion.get(53).setIcon(termometro_escalado);
					estado.set(53,true);

				}
			}
		});
		lbl_cl_209_c.setBounds(420, 160, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_209_c);
		
		lbl_cl_210_c = new JLabel("");	
		lbl_cl_210_c.setName("aula210_c");
		lbl_cl_210_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(54).booleanValue()) {
					
					arraylistcalefaccion.get(54).setIcon(termometro_vacio_escalado);
					estado.set(54,false);
				}else {
					arraylistcalefaccion.get(54).setIcon(termometro_escalado);
					estado.set(54,true);

				}
			}
		});
		lbl_cl_210_c.setBounds(560, 145, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_210_c);
		
		lbl_cl_211_c = new JLabel("");		
		lbl_cl_211_c.setName("aula211_c");
		lbl_cl_211_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(55).booleanValue()) {
					
					arraylistcalefaccion.get(55).setIcon(termometro_vacio_escalado);
					estado.set(55,false);
				}else {
					arraylistcalefaccion.get(55).setIcon(termometro_escalado);
					estado.set(55,true);

				}
			}
		});
		lbl_cl_211_c.setBounds(420, 120, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_211_c);
		
		lbl_cl_212_c = new JLabel("");		
		lbl_cl_212_c.setName("aula212_c");
		lbl_cl_212_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(56).booleanValue()) {
					
					arraylistcalefaccion.get(56).setIcon(termometro_vacio_escalado);
					estado.set(56,false);
				}else {
					arraylistcalefaccion.get(56).setIcon(termometro_escalado);
					estado.set(56,true);

				}
			}
		});
		lbl_cl_212_c.setBounds(560, 90, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_212_c);
		
		lbl_cl_213_c = new JLabel("");		
		lbl_cl_213_c.setName("aula213_c");
		lbl_cl_213_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(57).booleanValue()) {
					
					arraylistcalefaccion.get(57).setIcon(termometro_vacio_escalado);
					estado.set(57,false);
				}else {
					arraylistcalefaccion.get(57).setIcon(termometro_escalado);
					estado.set(57,true);

				}
			}
		});
		lbl_cl_213_c.setBounds(420, 70, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_213_c);
		
		lbl_cl_214_c = new JLabel("");		
		lbl_cl_214_c.setName("aula214_c");
		lbl_cl_214_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(58).booleanValue()) {
					
					arraylistcalefaccion.get(58).setIcon(termometro_vacio_escalado);
					estado.set(58,false);
				}else {
					arraylistcalefaccion.get(58).setIcon(termometro_escalado);
					estado.set(58,true);

				}
			}
		});
		lbl_cl_214_c.setBounds(480, 35, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_214_c);
		
		lbl_cl_215_c = new JLabel("");	
		lbl_cl_215_c.setName("aula215_c");
		lbl_cl_215_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(59).booleanValue()) {
					
					arraylistcalefaccion.get(59).setIcon(termometro_vacio_escalado);
					estado.set(59,false);
				}else {
					arraylistcalefaccion.get(59).setIcon(termometro_escalado);
					estado.set(59,true);

				}
			}
		});
		lbl_cl_215_c.setBounds(330, 170, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_215_c);
		
		lbl_cl_216_c = new JLabel("");		
		lbl_cl_216_c.setName("aula216_c");
		lbl_cl_216_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(60).booleanValue()) {
					
					arraylistcalefaccion.get(60).setIcon(termometro_vacio_escalado);
					estado.set(60,false);
				}else {
					arraylistcalefaccion.get(60).setIcon(termometro_escalado);
					estado.set(60,true);

				}
			}
		});
		lbl_cl_216_c.setBounds(330, 285, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_216_c);
		
		lbl_cl_217_c = new JLabel("");	
		lbl_cl_217_c.setName("aula217_c");
		lbl_cl_217_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(61).booleanValue()) {
					
					arraylistcalefaccion.get(61).setIcon(termometro_vacio_escalado);
					estado.set(61,false);
				}else {
					arraylistcalefaccion.get(61).setIcon(termometro_escalado);
					estado.set(61,true);

				}
			}
		});
		lbl_cl_217_c.setBounds(190, 285, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_217_c);
		
		lbl_cl_218_c = new JLabel("");		
		lbl_cl_218_c.setName("aula218_c");
		lbl_cl_218_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(62).booleanValue()) {
					
					arraylistcalefaccion.get(62).setIcon(termometro_vacio_escalado);
					estado.set(62,false);
				}else {
					arraylistcalefaccion.get(62).setIcon(termometro_escalado);
					estado.set(62,true);

				}
			}
		});
		lbl_cl_218_c.setBounds(150, 285, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_218_c);
		
		lbl_cl_219_c = new JLabel("");	
		lbl_cl_219_c.setName("aula219_c");
		lbl_cl_219_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(63).booleanValue()) {
					
					arraylistcalefaccion.get(63).setIcon(termometro_vacio_escalado);
					estado.set(63,false);
				}else {
					arraylistcalefaccion.get(63).setIcon(termometro_escalado);
					estado.set(63,true);

				}
			}
		});
		lbl_cl_219_c.setBounds(109, 300, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_219_c);
		
		lbl_cl_220_c = new JLabel("");		
		lbl_cl_220_c.setName("aula220_c");
		lbl_cl_220_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado.get(64).booleanValue()) {
					
					arraylistcalefaccion.get(64).setIcon(termometro_vacio_escalado);
					estado.set(64,false);
				}else {
					arraylistcalefaccion.get(64).setIcon(termometro_escalado);
					estado.set(64,true);

				}
			}
		});
		lbl_img_piso2_c = new JLabel("");
	   	lbl_img_piso2_c.setBounds(0, -80, 600, 600);
	   	panel_calefaccion_p2.add(lbl_img_piso2_c);
	   	lbl_img_piso2_c.setIcon(plano2);
		lbl_cl_220_c.setBounds(55, 172, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_220_c);
		
		
		
		arraylistcalefaccion.add(lbl_cl_201_c);
		arraylistcalefaccion.add(lbl_cl_202_c);
		arraylistcalefaccion.add(lbl_cl_203_c);
		arraylistcalefaccion.add(lbl_cl_204_c);
		arraylistcalefaccion.add(lbl_cl_205_c);
		arraylistcalefaccion.add(lbl_cl_206_c);
		arraylistcalefaccion.add(lbl_cl_207_c);
		arraylistcalefaccion.add(lbl_cl_208_c);
		arraylistcalefaccion.add(lbl_cl_209_c);
		arraylistcalefaccion.add(lbl_cl_210_c);
		arraylistcalefaccion.add(lbl_cl_211_c);
		arraylistcalefaccion.add(lbl_cl_212_c);
		arraylistcalefaccion.add(lbl_cl_213_c);
		arraylistcalefaccion.add(lbl_cl_214_c);
		arraylistcalefaccion.add(lbl_cl_215_c);
		arraylistcalefaccion.add(lbl_cl_216_c);
		arraylistcalefaccion.add(lbl_cl_217_c);
		arraylistcalefaccion.add(lbl_cl_218_c);
		arraylistcalefaccion.add(lbl_cl_219_c);
		arraylistcalefaccion.add(lbl_cl_220_c);
		
		
		/*RANDOMIZADOR PISO 2*/
		
		for(int i=45;i<65;i++) {
			result = r.nextInt(100-1) + 1;
			if(result>30) {
				estado.add(true);
				arraylistcalefaccion.get(i).setIcon(termometro_escalado);
			}else {
				estado.add(false);
				arraylistcalefaccion.get(i).setIcon(termometro_vacio_escalado);

			}

		}
		
		for(int i=45;i<64;i++) {
			result = r.nextInt(100-1) + 1;
			if (result>15) {
				arraylistalarmas.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			arraylistalarmas.get(i).setIcon(luz_roja_escalada);
		}
	}
	   	
	   	
	   	/*PLANOS*/
		
		lbl_img_piso0_a = new JLabel("");
	   	lbl_img_piso0_a.setBounds(0, -80, 600, 600);
	   	panel_alarmas_p0.add(lbl_img_piso0_a);
	   	lbl_img_piso0_a.setIcon(plano0);
	   	
	   	lbl_img_piso0_c = new JLabel("");
	   	lbl_img_piso0_c.setBounds(0, -80, 600, 600);
	   	panel_calefaccion_p0.add(lbl_img_piso0_c);
	   	lbl_img_piso0_c.setIcon(plano0);
	   	
		lbl_img_piso1_a = new JLabel("");
	   	lbl_img_piso1_a.setBounds(0, -80, 600, 600);
	   	panel_alarmas_p1.add(lbl_img_piso1_a);
	   	lbl_img_piso1_a.setIcon(plano1);
	   	
		lbl_img_piso1_c = new JLabel("");
	   	lbl_img_piso1_c.setBounds(0, -80, 600, 600);
	   	panel_calefaccion_p1.add(lbl_img_piso1_c);
	   	lbl_img_piso1_c.setIcon(plano1);
	   	
	   	lbl_img_piso2_a = new JLabel("");
		lbl_img_piso2_a.setBounds(0, -80, 600, 600);
		panel_alarmas_p2.add(lbl_img_piso2_a);
		lbl_img_piso2_a.setIcon(plano2);
		
		
	   	lbl_img_piso2_c = new JLabel("");
	   	lbl_img_piso2_c.setBounds(0, -80, 600, 600);
	   	panel_alarmas_p2.add(lbl_img_piso2_c);
	   	lbl_img_piso2_c.setIcon(plano2);
	   	
	   	lblAlarmaCalefaccion = new JLabel("ALARMAS");
	   	lblAlarmaCalefaccion.setHorizontalAlignment(SwingConstants.CENTER);
	   	lblAlarmaCalefaccion.setFont(new Font("Tahoma", Font.BOLD, 25));
	   	lblAlarmaCalefaccion.setBounds(144, 441, 367, 70);
	   	panel_piso.add(lblAlarmaCalefaccion);
	   	
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
		
		lblAlarmaCalefaccion.setText("ALARMAS");
		
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
		
		lblAlarmaCalefaccion.setText("CALEFACCION");
		
		
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