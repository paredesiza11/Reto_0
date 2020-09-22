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

public class principal2 {

	private JFrame frame;
	private final JPanel panel_piso1 = new JPanel();
	private JPanel panel_alarmas_p1;
	private JPanel panel_calefaccion_p1;
	private JButton btn_calefaccion;
	private JButton btn_alarmas;
	private JLabel lbl_piso1;
	private JButton btn_subir_p1;
	private JButton btn_bajar_p1;
	private JButton btn_llamada_de_emergencia;
	private JLabel lbl_plano_piso_0;
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
	private JLabel lbl_img_piso1;
	
	private JLabel lbl_cl_120_C;
	private JLabel lbl_cl_116_C;
	private JLabel lbl_cl_115_C;
	private JLabel lbl_cl_114_C;
	private JLabel lbl_cl_117_C;
	private JLabel lbl_cl_113_C;
	private JLabel lbl_cl_118_C;
	private JLabel lbl_cl_106_C;
	private JLabel lbl_cl_108_C;
	private JLabel lbl_cl_110_C;
	private JLabel lbl_cl_112_C;
	private JLabel lbl_cl_119_C;
	private JLabel lbl_cl_111_C;
	private JLabel lbl_cl_109_C;
	private JLabel lbl_cl_107_C;
	private JLabel lbl_cl_105_C;
	private JLabel lbl_cl_101_C;
	private JLabel lbl_cl_103_C;
	private JLabel lbl_cl_102_C;
	private JLabel lbl_cl_104_C;
	private JLabel lbl_img_piso1_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal2 window = new principal2();
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
	public principal2() {
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

		ArrayList<JLabel> label_alarmas_p1 = new ArrayList<JLabel>(); 
		//arraylist de labels de calefaccion
		
		ArrayList<JLabel> labelC_p1 = new ArrayList<JLabel>(); 

		//arraylist de estado de calefaccion
		
		ArrayList<Boolean> estado_p1 = new ArrayList<Boolean>(); 
		
		
		Image img = new ImageIcon(("../reto_0/imagenes/Planta0.png")).getImage();
	   	Image newimg = img.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano0 = new ImageIcon(newimg);
	   	
	   	/*nuevo*/
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

				
		lbl_piso1 = new JLabel("Piso 2");
		lbl_piso1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_piso1.setBounds(20, 121, 52, 24);
		panel_piso1.add(lbl_piso1);
				
		btn_alarmas = new JButton("Alarmas\r\n");
		btn_alarmas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_alarmas.setBounds(616, 389, 116, 62);
		panel_piso1.add(btn_alarmas);
		btn_alarmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas_p1.setVisible(true);
				panel_calefaccion_p1.setVisible(false);
			}
		});
		
		btn_calefaccion = new JButton("Calefacci\u00F3n");
		btn_calefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas_p1.setVisible(false);
				panel_calefaccion_p1.setVisible(true);
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
		
		panel_alarmas_p1 = new JPanel();
		panel_alarmas_p1.setBounds(60, 0, 710, 431);
		panel_piso1.add(panel_alarmas_p1);

		panel_calefaccion_p1 = new JPanel();
	   	panel_calefaccion_p1.setBounds(60, 0, 710, 431);
		panel_piso1.add(panel_calefaccion_p1);
	   	panel_calefaccion_p1.setVisible(false);
		
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 189, 50);
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 172, 50);

		
		lbl_plano_piso_0 = new JLabel("New label");
		panel_alarmas_p1.setLayout(null);
		panel_calefaccion_p1.setLayout(null);
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
	   	
		label_alarmas_p1.add(lbl_cl_101_a);
		label_alarmas_p1.add(lbl_cl_102_a);
		label_alarmas_p1.add(lbl_cl_103_a);
		label_alarmas_p1.add(lbl_cl_104_a);
		label_alarmas_p1.add(lbl_cl_105_a);
		label_alarmas_p1.add(lbl_cl_106_a);
		label_alarmas_p1.add(lbl_cl_107_a);
		label_alarmas_p1.add(lbl_cl_108_a);
		label_alarmas_p1.add(lbl_cl_109_a);
		label_alarmas_p1.add(lbl_cl_110_a);
		label_alarmas_p1.add(lbl_cl_111_a);
		label_alarmas_p1.add(lbl_cl_112_a);
		label_alarmas_p1.add(lbl_cl_113_a);
		label_alarmas_p1.add(lbl_cl_114_a);
		label_alarmas_p1.add(lbl_cl_115_a);
		label_alarmas_p1.add(lbl_cl_116_a);
		label_alarmas_p1.add(lbl_cl_117_a);
		label_alarmas_p1.add(lbl_cl_118_a);
		label_alarmas_p1.add(lbl_cl_119_a);
		label_alarmas_p1.add(lbl_cl_120_a);
		
		//Piso 1 colocación
				
		lbl_cl_101_C = new JLabel("");		
		lbl_cl_101_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(0).booleanValue()) {
					
					labelC_p1.get(0).setIcon(termometro_vacio_escalado);
					estado_p1.set(0,false);
				}else {
					labelC_p1.get(0).setIcon(termometro_escalado);
					estado_p1.set(0,true);

				}
			}
		});
		lbl_cl_101_C.setBounds(423, 387, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_101_C);
		
		lbl_cl_102_C = new JLabel("");		
		lbl_cl_102_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(1).booleanValue()) {
					
					labelC_p1.get(1).setIcon(termometro_vacio_escalado);
					estado_p1.set(1,false);
				}else {
					labelC_p1.get(1).setIcon(termometro_escalado);
					estado_p1.set(1,true);

				}
			}
		});
		lbl_cl_102_C.setBounds(423, 350, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_102_C);
		
		lbl_cl_103_C = new JLabel("");		
		lbl_cl_103_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(2).booleanValue()) {
					
					labelC_p1.get(2).setIcon(termometro_vacio_escalado);
					estado_p1.set(2,false);
				}else {
					labelC_p1.get(2).setIcon(termometro_escalado);
					estado_p1.set(2,true);

				}
			}
		});
		lbl_cl_103_C.setBounds(423, 325, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_103_C);
		
		lbl_cl_104_C = new JLabel("");		
		lbl_cl_104_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(3).booleanValue()) {
					
					labelC_p1.get(3).setIcon(termometro_vacio_escalado);
					estado_p1.set(3,false);
				}else {
					labelC_p1.get(3).setIcon(termometro_escalado);
					estado_p1.set(3,true);

				}
			}
		});
		lbl_cl_104_C.setBounds(423, 300, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_104_C);
		
		lbl_cl_105_C = new JLabel("");		
		lbl_cl_105_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(4).booleanValue()) {
					
					labelC_p1.get(4).setIcon(termometro_vacio_escalado);
					estado_p1.set(4,false);
				}else {
					labelC_p1.get(4).setIcon(termometro_escalado);
					estado_p1.set(4,true);

				}
			}
		});
		lbl_cl_105_C.setBounds(555, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_105_C);
		
		lbl_cl_106_C = new JLabel("");		
		lbl_cl_106_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(5).booleanValue()) {
					
					labelC_p1.get(5).setIcon(termometro_vacio_escalado);
					estado_p1.set(5,false);
				}else {
					labelC_p1.get(5).setIcon(termometro_escalado);
					estado_p1.set(5,true);

				}
			}
		});
		lbl_cl_106_C.setBounds(455, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_106_C);
		
		lbl_cl_107_C = new JLabel("");		
		lbl_cl_107_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(6).booleanValue()) {
					
					labelC_p1.get(6).setIcon(termometro_vacio_escalado);
					estado_p1.set(6,false);
				}else {
					labelC_p1.get(6).setIcon(termometro_escalado);
					estado_p1.set(6,true);

				}
			}
		});
		lbl_cl_107_C.setBounds(555, 135, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_107_C);
		
		lbl_cl_108_C = new JLabel("");		
		lbl_cl_108_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(7).booleanValue()) {
					
					labelC_p1.get(7).setIcon(termometro_vacio_escalado);
					estado_p1.set(7,false);
				}else {
					labelC_p1.get(7).setIcon(termometro_escalado);
					estado_p1.set(7,true);

				}
			}
		});
		lbl_cl_108_C.setBounds(450, 120, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_108_C);
		
		lbl_cl_109_C = new JLabel("");		
		lbl_cl_109_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(8).booleanValue()) {
					
					labelC_p1.get(8).setIcon(termometro_vacio_escalado);
					estado_p1.set(8,false);
				}else {
					labelC_p1.get(8).setIcon(termometro_escalado);
					estado_p1.set(8,true);

				}
			}
		});
		lbl_cl_109_C.setBounds(555, 90, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_109_C);
		
		lbl_cl_110_C = new JLabel("");		
		lbl_cl_110_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(9).booleanValue()) {
					
					labelC_p1.get(9).setIcon(termometro_vacio_escalado);
					estado_p1.set(9,false);
				}else {
					labelC_p1.get(9).setIcon(termometro_escalado);
					estado_p1.set(9,true);

				}
			}
		});
		lbl_cl_110_C.setBounds(450, 80, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_110_C);
		
		lbl_cl_111_C = new JLabel("");		
		lbl_cl_111_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(10).booleanValue()) {
					
					labelC_p1.get(10).setIcon(termometro_vacio_escalado);
					estado_p1.set(10,false);
				}else {
					labelC_p1.get(10).setIcon(termometro_escalado);
					estado_p1.set(10,true);

				}
			}
		});
		lbl_cl_111_C.setBounds(555, 60, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_111_C);
		
		lbl_cl_112_C = new JLabel("");		
		lbl_cl_112_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(11).booleanValue()) {
					
					labelC_p1.get(11).setIcon(termometro_vacio_escalado);
					estado_p1.set(11,false);
				}else {
					labelC_p1.get(11).setIcon(termometro_escalado);
					estado_p1.set(11,true);

				}
			}
		});
		lbl_cl_112_C.setBounds(450, 40, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_112_C);
		
		lbl_cl_113_C = new JLabel("");		
		lbl_cl_113_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(12).booleanValue()) {
					
					labelC_p1.get(12).setIcon(termometro_vacio_escalado);
					estado_p1.set(12,false);
				}else {
					labelC_p1.get(12).setIcon(termometro_escalado);
					estado_p1.set(12,true);

				}
			}
		});
		lbl_cl_113_C.setBounds(350, 255, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_113_C);
		
		lbl_cl_114_C = new JLabel("");		
		lbl_cl_114_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(13).booleanValue()) {
					
					labelC_p1.get(13).setIcon(termometro_vacio_escalado);
					estado_p1.set(13,false);
				}else {
					labelC_p1.get(13).setIcon(termometro_escalado);
					estado_p1.set(13,true);

				}
			}
		});
		lbl_cl_114_C.setBounds(250, 255, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_114_C);
		
		lbl_cl_115_C = new JLabel("");		
		lbl_cl_115_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(14).booleanValue()) {
					
					labelC_p1.get(14).setIcon(termometro_vacio_escalado);
					estado_p1.set(14,false);
				}else {
					labelC_p1.get(14).setIcon(termometro_escalado);
					estado_p1.set(14,true);

				}
			}
		});
		lbl_cl_115_C.setBounds(170, 255, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_115_C);
		
		lbl_cl_116_C = new JLabel("");		
		lbl_cl_116_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(15).booleanValue()) {
					
					labelC_p1.get(15).setIcon(termometro_vacio_escalado);
					estado_p1.set(15,false);
				}else {
					labelC_p1.get(15).setIcon(termometro_escalado);
					estado_p1.set(15,true);

				}
			}
		});
		lbl_cl_116_C.setBounds(190, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_116_C);
		
		lbl_cl_117_C = new JLabel("");		
		lbl_cl_117_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(16).booleanValue()) {
					
					labelC_p1.get(16).setIcon(termometro_vacio_escalado);
					estado_p1.set(16,false);
				}else {
					labelC_p1.get(16).setIcon(termometro_escalado);
					estado_p1.set(16,true);

				}
			}
		});
		lbl_cl_117_C.setBounds(290, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_117_C);
		
		lbl_cl_118_C = new JLabel("");		
		lbl_cl_118_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(17).booleanValue()) {
					
					labelC_p1.get(17).setIcon(termometro_vacio_escalado);
					estado_p1.set(17,false);
				}else {
					labelC_p1.get(17).setIcon(termometro_escalado);
					estado_p1.set(17,true);

				}
			}
		});
		lbl_cl_118_C.setBounds(370, 170, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_118_C);
		
		lbl_cl_119_C = new JLabel("");		
		lbl_cl_119_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(18).booleanValue()) {
					
					labelC_p1.get(18).setIcon(termometro_vacio_escalado);
					estado_p1.set(18,false);
				}else {
					labelC_p1.get(18).setIcon(termometro_escalado);
					estado_p1.set(18,true);

				}
			}
		});
		lbl_cl_119_C.setBounds(110, 330, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_119_C);
		
		lbl_cl_120_C = new JLabel("");		
		lbl_cl_120_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p1.get(19).booleanValue()) {
					
					labelC_p1.get(19).setIcon(termometro_vacio_escalado);
					estado_p1.set(19,false);
				}else {
					labelC_p1.get(19).setIcon(termometro_escalado);
					estado_p1.set(19,true);

				}
			}
		});
		lbl_cl_120_C.setBounds(85, 270, 39, 25);
		panel_calefaccion_p1.add(lbl_cl_120_C);
		
		
		
		labelC_p1.add(lbl_cl_101_C);
		labelC_p1.add(lbl_cl_102_C);
		labelC_p1.add(lbl_cl_103_C);
		labelC_p1.add(lbl_cl_104_C);
		labelC_p1.add(lbl_cl_105_C);
		labelC_p1.add(lbl_cl_106_C);
		labelC_p1.add(lbl_cl_107_C);
		labelC_p1.add(lbl_cl_108_C);
		labelC_p1.add(lbl_cl_109_C);
		labelC_p1.add(lbl_cl_110_C);
		labelC_p1.add(lbl_cl_111_C);
		labelC_p1.add(lbl_cl_112_C);
		labelC_p1.add(lbl_cl_113_C);
		labelC_p1.add(lbl_cl_114_C);
		labelC_p1.add(lbl_cl_115_C);
		labelC_p1.add(lbl_cl_116_C);
		labelC_p1.add(lbl_cl_117_C);
		labelC_p1.add(lbl_cl_118_C);
		labelC_p1.add(lbl_cl_119_C);
		labelC_p1.add(lbl_cl_120_C);
		
		lbl_img_piso1_1 = new JLabel("");
		lbl_img_piso1_1.setBounds(0, -80, 600, 600);
		panel_calefaccion_p1.add(lbl_img_piso1_1);
		lbl_img_piso1_1.setIcon(plano1);
		
	   	lbl_img_piso1 = new JLabel("");
	   	lbl_img_piso1.setBounds(0, -80, 600, 600);
	   	panel_alarmas_p1.add(lbl_img_piso1);
	   	lbl_img_piso1.setIcon(plano1);
		Random r = new Random();
		int result;
		
		for(int i=0;i<labelC_p1.size();i++) {
			result = r.nextInt(100-1) + 1;
			System.out.println(result);
			if(result>30) {
				estado_p1.add(true);
			labelC_p1.get(i).setIcon(termometro_escalado);
			}else {
				estado_p1.add(false);
				labelC_p1.get(i).setIcon(termometro_vacio_escalado);

			}

		}
		for(int i=0;i<estado_p1.size();i++) {
			System.out.println(estado_p1.get(i).toString());
		}
		
		
		
		for(int i=0;i<label_alarmas_p1.size();i++) {
			result = r.nextInt(100-1) + 1;
			System.out.println(result);
			if (result>15) {
				label_alarmas_p1.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			label_alarmas_p1.get(i).setIcon(luz_roja_escalada);
		}
	}
}
}