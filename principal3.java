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

public class principal3 {

	private JFrame frame;
	private final JPanel panel_piso2 = new JPanel();
	private JPanel panel_alarmas_p2;
	private JPanel panel_calefaccion_p2;
	private JButton btn_calefaccion;
	private JButton btn_alarmas;
	private JLabel lbl_piso2;
	private JButton btn_subir_p1;
	private JButton btn_bajar_p1;
	private JButton btn_llamada_de_emergencia;
	private JLabel lbl_plano_piso_0;
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
	private JLabel lbl_img_piso2;
	
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
	private JLabel lbl_img_piso2_1;

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
		
		//arraylist de labels de alarmas

		ArrayList<JLabel> label_p2_a = new ArrayList<JLabel>(); 
		//arraylist de labels de calefaccion
		
		ArrayList<JLabel> label_p2_c = new ArrayList<JLabel>(); 

		//arraylist de estado de calefaccion
		
		ArrayList<Boolean> estado_p2 = new ArrayList<Boolean>(); 
		
		
		
		Image img = new ImageIcon(("../reto_0/imagenes/Planta0.png")).getImage();
	   	Image newimg = img.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano0 = new ImageIcon(newimg);
	   	
	   	
	   	Image img_p1 = new ImageIcon(("../reto_0/imagenes/Planta1.png")).getImage();
	   	Image newimg_p1 = img_p1.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano1 = new ImageIcon(newimg_p1);
	   	
		/*nuevo*/
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

				
				
		lbl_piso2 = new JLabel("Piso 3");
		lbl_piso2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_piso2.setBounds(20, 121, 52, 24);
		panel_piso2.add(lbl_piso2);
				
		btn_alarmas = new JButton("Alarmas\r\n");
		btn_alarmas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_alarmas.setBounds(616, 389, 116, 62);
		panel_piso2.add(btn_alarmas);	
		btn_alarmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas_p2.setVisible(true);
				panel_calefaccion_p2.setVisible(false);
			}
		});
		
		btn_calefaccion = new JButton("Calefacci\u00F3n");
		btn_calefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas_p2.setVisible(false);
				panel_calefaccion_p2.setVisible(true);
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
		
		panel_alarmas_p2 = new JPanel();
		panel_alarmas_p2.setBounds(60, 0, 710, 431);
		panel_piso2.add(panel_alarmas_p2);
		
		panel_calefaccion_p2 = new JPanel();
	   	panel_calefaccion_p2.setBounds(60, 0, 710, 431);
		panel_piso2.add(panel_calefaccion_p2);
	   	panel_calefaccion_p2.setVisible(false);
		
		
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 189, 50);
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 172, 50);

		
		lbl_plano_piso_0 = new JLabel("New label");
		panel_alarmas_p2.setLayout(null);
		panel_calefaccion_p2.setLayout(null);
		lbl_cl_220_a = new JLabel("");
		lbl_cl_220_a.setBounds(55, 172, 39, 13);
		panel_alarmas_p2.add(lbl_cl_220_a);
		
		lbl_cl_216_a = new JLabel("");
		lbl_cl_216_a.setBounds(330, 285, 39, 13);
		panel_alarmas_p2.add(lbl_cl_216_a);
		
	   	
	   	lbl_cl_215_a = new JLabel("");
	   	lbl_cl_215_a.setBounds(330, 180, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_215_a);
	   			
	   	lbl_cl_214_a = new JLabel("");
	   	lbl_cl_214_a.setBounds(480, 35, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_214_a);
	   			
	   	lbl_cl_217_a = new JLabel("");
	   	lbl_cl_217_a.setBounds(190, 285, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_217_a);
	   			
	   	lbl_cl_213_a = new JLabel("");
	   	lbl_cl_213_a.setBounds(420, 70, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_213_a);
	   					
	   	lbl_cl_218_a = new JLabel("");
	   	lbl_cl_218_a.setBounds(150, 285, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_218_a);
	   					
	   	lbl_cl_206_a = new JLabel("");
	   	lbl_cl_206_a.setBounds(540, 320, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_206_a);
	   							
	   	lbl_cl_208_a = new JLabel("");
	   	lbl_cl_208_a.setBounds(560, 185, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_208_a);
	   							
	   	lbl_cl_210_a = new JLabel("");
	   	lbl_cl_210_a.setBounds(560, 145, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_210_a);
	   									
	   	lbl_cl_212_a = new JLabel("");
	   	lbl_cl_212_a.setBounds(560, 90, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_212_a);
	   									
	   	lbl_cl_219_a = new JLabel("");
	   	lbl_cl_219_a.setBounds(109, 334, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_219_a);
	   											
	   	lbl_cl_211_a = new JLabel("");
	   	lbl_cl_211_a.setBounds(420, 120, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_211_a);
	   	
	   											
	   	lbl_cl_209_a = new JLabel("");
	   	lbl_cl_209_a.setBounds(420, 160, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_209_a);
	   													
	   	lbl_cl_207_a = new JLabel("");
	   	lbl_cl_207_a.setBounds(540, 290, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_207_a);
	   													
	   	lbl_cl_205_a = new JLabel("");
	   	lbl_cl_205_a.setBounds(423, 320, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_205_a);
	   															
	   	lbl_cl_201_a = new JLabel("");
	   	lbl_cl_201_a.setBounds(423, 387, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_201_a);
	   																	
	   	lbl_cl_203_a = new JLabel("");
	   	lbl_cl_203_a.setBounds(530, 385, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_203_a);
	   																	
	   	lbl_cl_202_a = new JLabel("");
	   	lbl_cl_202_a.setBounds(490, 400, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_202_a);
	   																			
	   	lbl_cl_204_a = new JLabel("");
	   	lbl_cl_204_a.setBounds(540, 350, 39, 13);
	   	panel_alarmas_p2.add(lbl_cl_204_a);
	   	
		label_p2_a.add(lbl_cl_201_a);
		label_p2_a.add(lbl_cl_202_a);
		label_p2_a.add(lbl_cl_203_a);
		label_p2_a.add(lbl_cl_204_a);
		label_p2_a.add(lbl_cl_205_a);
		label_p2_a.add(lbl_cl_206_a);
		label_p2_a.add(lbl_cl_207_a);
		label_p2_a.add(lbl_cl_208_a);
		label_p2_a.add(lbl_cl_209_a);
		label_p2_a.add(lbl_cl_210_a);
		label_p2_a.add(lbl_cl_211_a);
		label_p2_a.add(lbl_cl_212_a);
		label_p2_a.add(lbl_cl_213_a);
		label_p2_a.add(lbl_cl_214_a);
		label_p2_a.add(lbl_cl_215_a);
		label_p2_a.add(lbl_cl_216_a);
		label_p2_a.add(lbl_cl_217_a);
		label_p2_a.add(lbl_cl_218_a);
		label_p2_a.add(lbl_cl_219_a);
		label_p2_a.add(lbl_cl_220_a);
		
		//Piso 2 colocación
		
		
		lbl_cl_201_c = new JLabel("");		
		lbl_cl_201_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(0).booleanValue()) {
					
					label_p2_c.get(0).setIcon(termometro_vacio_escalado);
					estado_p2.set(0,false);
				}else {
					label_p2_c.get(0).setIcon(termometro_escalado);
					estado_p2.set(0,true);

				}
			}
		});
		lbl_cl_201_c.setBounds(423, 387, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_201_c);
		
		lbl_cl_202_c = new JLabel("");		
		lbl_cl_202_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(1).booleanValue()) {
					
					label_p2_c.get(1).setIcon(termometro_vacio_escalado);
					estado_p2.set(1,false);
				}else {
					label_p2_c.get(1).setIcon(termometro_escalado);
					estado_p2.set(1,true);

				}
			}
		});
		lbl_cl_202_c.setBounds(490, 380, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_202_c);
		
		lbl_cl_203_c = new JLabel("");		
		lbl_cl_203_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(2).booleanValue()) {
					
					label_p2_c.get(2).setIcon(termometro_vacio_escalado);
					estado_p2.set(2,false);
				}else {
					label_p2_c.get(2).setIcon(termometro_escalado);
					estado_p2.set(2,true);

				}
			}
		});
		lbl_cl_203_c.setBounds(530, 380, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_203_c);
		
		lbl_cl_204_c = new JLabel("");		
		lbl_cl_204_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(3).booleanValue()) {
					
					label_p2_c.get(3).setIcon(termometro_vacio_escalado);
					estado_p2.set(3,false);
				}else {
					label_p2_c.get(3).setIcon(termometro_escalado);
					estado_p2.set(3,true);

				}
			}
		});
		lbl_cl_204_c.setBounds(560, 340, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_204_c);
		
		lbl_cl_205_c = new JLabel("");		
		lbl_cl_205_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(4).booleanValue()) {
					
					label_p2_c.get(4).setIcon(termometro_vacio_escalado);
					estado_p2.set(4,false);
				}else {
					label_p2_c.get(4).setIcon(termometro_escalado);
					estado_p2.set(4,true);

				}
			}
		});
		lbl_cl_205_c.setBounds(423, 320, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_205_c);
		
		lbl_cl_206_c = new JLabel("");		
		lbl_cl_206_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(5).booleanValue()) {
					
					label_p2_c.get(5).setIcon(termometro_vacio_escalado);
					estado_p2.set(5,false);
				}else {
					label_p2_c.get(5).setIcon(termometro_escalado);
					estado_p2.set(5,true);

				}
			}
		});
		lbl_cl_206_c.setBounds(560, 310, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_206_c);
		
		lbl_cl_207_c = new JLabel("");		
		lbl_cl_207_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(6).booleanValue()) {
					
					label_p2_c.get(6).setIcon(termometro_vacio_escalado);
					estado_p2.set(6,false);
				}else {
					label_p2_c.get(6).setIcon(termometro_escalado);
					estado_p2.set(6,true);

				}
			}
		});
		lbl_cl_207_c.setBounds(560, 275, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_207_c);
		
		lbl_cl_208_c = new JLabel("");		
		lbl_cl_208_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(7).booleanValue()) {
					
					label_p2_c.get(7).setIcon(termometro_vacio_escalado);
					estado_p2.set(7,false);
				}else {
					label_p2_c.get(7).setIcon(termometro_escalado);
					estado_p2.set(7,true);

				}
			}
		});
		lbl_cl_208_c.setBounds(560, 185, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_208_c);
		
		lbl_cl_209_c = new JLabel("");		
		lbl_cl_209_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(8).booleanValue()) {
					
					label_p2_c.get(8).setIcon(termometro_vacio_escalado);
					estado_p2.set(8,false);
				}else {
					label_p2_c.get(8).setIcon(termometro_escalado);
					estado_p2.set(8,true);

				}
			}
		});
		lbl_cl_209_c.setBounds(420, 160, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_209_c);
		
		lbl_cl_210_c = new JLabel("");		
		lbl_cl_210_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(9).booleanValue()) {
					
					label_p2_c.get(9).setIcon(termometro_vacio_escalado);
					estado_p2.set(9,false);
				}else {
					label_p2_c.get(9).setIcon(termometro_escalado);
					estado_p2.set(9,true);

				}
			}
		});
		lbl_cl_210_c.setBounds(560, 145, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_210_c);
		
		lbl_cl_211_c = new JLabel("");		
		lbl_cl_211_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(10).booleanValue()) {
					
					label_p2_c.get(10).setIcon(termometro_vacio_escalado);
					estado_p2.set(10,false);
				}else {
					label_p2_c.get(10).setIcon(termometro_escalado);
					estado_p2.set(10,true);

				}
			}
		});
		lbl_cl_211_c.setBounds(420, 120, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_211_c);
		
		lbl_cl_212_c = new JLabel("");		
		lbl_cl_212_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(11).booleanValue()) {
					
					label_p2_c.get(11).setIcon(termometro_vacio_escalado);
					estado_p2.set(11,false);
				}else {
					label_p2_c.get(11).setIcon(termometro_escalado);
					estado_p2.set(11,true);

				}
			}
		});
		lbl_cl_212_c.setBounds(560, 90, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_212_c);
		
		lbl_cl_213_c = new JLabel("");		
		lbl_cl_213_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(12).booleanValue()) {
					
					label_p2_c.get(12).setIcon(termometro_vacio_escalado);
					estado_p2.set(12,false);
				}else {
					label_p2_c.get(12).setIcon(termometro_escalado);
					estado_p2.set(12,true);

				}
			}
		});
		lbl_cl_213_c.setBounds(420, 70, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_213_c);
		
		lbl_cl_214_c = new JLabel("");		
		lbl_cl_214_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(13).booleanValue()) {
					
					label_p2_c.get(13).setIcon(termometro_vacio_escalado);
					estado_p2.set(13,false);
				}else {
					label_p2_c.get(13).setIcon(termometro_escalado);
					estado_p2.set(13,true);

				}
			}
		});
		lbl_cl_214_c.setBounds(480, 35, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_214_c);
		
		lbl_cl_215_c = new JLabel("");		
		lbl_cl_215_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(14).booleanValue()) {
					
					label_p2_c.get(14).setIcon(termometro_vacio_escalado);
					estado_p2.set(14,false);
				}else {
					label_p2_c.get(14).setIcon(termometro_escalado);
					estado_p2.set(14,true);

				}
			}
		});
		lbl_cl_215_c.setBounds(330, 170, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_215_c);
		
		lbl_cl_216_c = new JLabel("");		
		lbl_cl_216_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(15).booleanValue()) {
					
					label_p2_c.get(15).setIcon(termometro_vacio_escalado);
					estado_p2.set(15,false);
				}else {
					label_p2_c.get(15).setIcon(termometro_escalado);
					estado_p2.set(15,true);

				}
			}
		});
		lbl_cl_216_c.setBounds(330, 285, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_216_c);
		
		lbl_cl_217_c = new JLabel("");		
		lbl_cl_217_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(16).booleanValue()) {
					
					label_p2_c.get(16).setIcon(termometro_vacio_escalado);
					estado_p2.set(16,false);
				}else {
					label_p2_c.get(16).setIcon(termometro_escalado);
					estado_p2.set(16,true);

				}
			}
		});
		lbl_cl_217_c.setBounds(190, 285, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_217_c);
		
		lbl_cl_218_c = new JLabel("");		
		lbl_cl_218_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(17).booleanValue()) {
					
					label_p2_c.get(17).setIcon(termometro_vacio_escalado);
					estado_p2.set(17,false);
				}else {
					label_p2_c.get(17).setIcon(termometro_escalado);
					estado_p2.set(17,true);

				}
			}
		});
		lbl_cl_218_c.setBounds(150, 285, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_218_c);
		
		lbl_cl_219_c = new JLabel("");		
		lbl_cl_219_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(18).booleanValue()) {
					
					label_p2_c.get(18).setIcon(termometro_vacio_escalado);
					estado_p2.set(18,false);
				}else {
					label_p2_c.get(18).setIcon(termometro_escalado);
					estado_p2.set(18,true);

				}
			}
		});
		lbl_cl_219_c.setBounds(109, 300, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_219_c);
		
		lbl_cl_220_c = new JLabel("");		
		lbl_cl_220_c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado_p2.get(19).booleanValue()) {
					
					label_p2_c.get(19).setIcon(termometro_vacio_escalado);
					estado_p2.set(19,false);
				}else {
					label_p2_c.get(19).setIcon(termometro_escalado);
					estado_p2.set(19,true);

				}
			}
		});
		lbl_cl_220_c.setBounds(55, 172, 39, 25);
		panel_calefaccion_p2.add(lbl_cl_220_c);
		
		
		
		label_p2_c.add(lbl_cl_201_c);
		label_p2_c.add(lbl_cl_202_c);
		label_p2_c.add(lbl_cl_203_c);
		label_p2_c.add(lbl_cl_204_c);
		label_p2_c.add(lbl_cl_205_c);
		label_p2_c.add(lbl_cl_206_c);
		label_p2_c.add(lbl_cl_207_c);
		label_p2_c.add(lbl_cl_208_c);
		label_p2_c.add(lbl_cl_209_c);
		label_p2_c.add(lbl_cl_210_c);
		label_p2_c.add(lbl_cl_211_c);
		label_p2_c.add(lbl_cl_212_c);
		label_p2_c.add(lbl_cl_213_c);
		label_p2_c.add(lbl_cl_214_c);
		label_p2_c.add(lbl_cl_215_c);
		label_p2_c.add(lbl_cl_216_c);
		label_p2_c.add(lbl_cl_217_c);
		label_p2_c.add(lbl_cl_218_c);
		label_p2_c.add(lbl_cl_219_c);
		label_p2_c.add(lbl_cl_220_c);
			
		lbl_img_piso2_1 = new JLabel("");
		lbl_img_piso2_1.setBounds(0, -80, 600, 600);
		panel_calefaccion_p2.add(lbl_img_piso2_1);
		lbl_img_piso2_1.setIcon(plano2);
		
		
	   	lbl_img_piso2 = new JLabel("");
	   	lbl_img_piso2.setBounds(0, -80, 600, 600);
	   	panel_alarmas_p2.add(lbl_img_piso2);
	   	lbl_img_piso2.setIcon(plano2);
		Random r = new Random();
		int result;

		for(int i=0;i<label_p2_c.size();i++) {
			result = r.nextInt(100-1) + 1;
			if(result>30) {
				estado_p2.add(true);
			label_p2_c.get(i).setIcon(termometro_escalado);
			}else {
				estado_p2.add(false);
				label_p2_c.get(i).setIcon(termometro_vacio_escalado);

			}

		}
		
		for(int i=0;i<label_p2_a.size();i++) {
			result = r.nextInt(100-1) + 1;
			if (result>15) {
				label_p2_a.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			label_p2_a.get(i).setIcon(luz_roja_escalada);
		}
	}
}
}