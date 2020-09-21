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
	private final JPanel panel_piso2 = new JPanel();
	private JPanel panel_alarmas_p1;
	private JButton btn_calefaccion;
	private JButton btn_alarmas;
	private JLabel lbl_piso2;
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
		panel_piso2.setBounds(10, 10, 800, 600);
		frame.getContentPane().add(panel_piso2);
		panel_piso2.setLayout(null);
		ArrayList<JLabel> label_alarmas = new ArrayList<JLabel>(); 

		
		
		Image img = new ImageIcon(("../reto_0/imagenes/Planta0.png")).getImage();
	   	Image newimg = img.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano0 = new ImageIcon(newimg);
	   	
	   	/*nuevo*/
	   	Image img_p1 = new ImageIcon(("../reto_0/imagenes/Planta1.png")).getImage();
	   	Image newimg_p1 = img_p1.getScaledInstance(710, 397,  java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon plano1 = new ImageIcon(newimg_p1);
	   	
	   	
	   	Image luz_verde=new ImageIcon(("../reto_0/imagenes/verde.jpg")).getImage();
	   	Image tamañoLV=luz_verde.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon luz_verde_escalada=new ImageIcon(tamañoLV);
	   	
	   	Image luz_roja=new ImageIcon(("../reto_0/imagenes/señal_roja.jpg")).getImage();
	   	Image tamañoLR=luz_roja.getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
	   	ImageIcon luz_roja_escalada=new ImageIcon(tamañoLR);
				
		lbl_piso2 = new JLabel("Piso 2");
		lbl_piso2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_piso2.setBounds(20, 121, 52, 24);
		panel_piso2.add(lbl_piso2);
				
		btn_alarmas = new JButton("Alarmas\r\n");
		btn_alarmas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_alarmas.setBounds(616, 389, 116, 62);
		panel_piso2.add(btn_alarmas);
				
		btn_calefaccion = new JButton("Calefacci\u00F3n");
		btn_calefaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_alarmas_p1.setVisible(false);
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
		
		panel_alarmas_p1 = new JPanel();
		panel_alarmas_p1.setBounds(60, 0, 710, 431);
		panel_piso2.add(panel_alarmas_p1);
		
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 189, 50);
		btn_llamada_de_emergencia = new JButton("Llamada de emergencia");
		btn_llamada_de_emergencia.setBounds(20, 457, 172, 50);

		
		lbl_plano_piso_0 = new JLabel("New label");
		panel_alarmas_p1.setLayout(null);

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
	   	
		label_alarmas.add(lbl_cl_101_a);
		label_alarmas.add(lbl_cl_102_a);
		label_alarmas.add(lbl_cl_103_a);
		label_alarmas.add(lbl_cl_104_a);
		label_alarmas.add(lbl_cl_105_a);
		label_alarmas.add(lbl_cl_106_a);
		label_alarmas.add(lbl_cl_107_a);
		label_alarmas.add(lbl_cl_109_a);
		label_alarmas.add(lbl_cl_108_a);
		label_alarmas.add(lbl_cl_111_a);
		label_alarmas.add(lbl_cl_110_a);
		label_alarmas.add(lbl_cl_119_a);
		label_alarmas.add(lbl_cl_112_a);
		label_alarmas.add(lbl_cl_118_a);
		label_alarmas.add(lbl_cl_113_a);
		label_alarmas.add(lbl_cl_117_a);
		label_alarmas.add(lbl_cl_114_a);
		label_alarmas.add(lbl_cl_116_a);
		label_alarmas.add(lbl_cl_115_a);
		label_alarmas.add(lbl_cl_120_a);
		
		//Piso 0 colocación
				
	   	lbl_img_piso1 = new JLabel("");
	   	lbl_img_piso1.setBounds(0, -80, 600, 600);
	   	panel_alarmas_p1.add(lbl_img_piso1);
	   	lbl_img_piso1.setIcon(plano1);
		Random r = new Random();
		int result;
		
		for(int i=0;i<label_alarmas.size();i++) {
			result = r.nextInt(100-1) + 1;
			System.out.println(result);
			if (result>15) {
				label_alarmas.get(i).setIcon(luz_verde_escalada);

			}
			
		else {
			label_alarmas.get(i).setIcon(luz_roja_escalada);
		}
	}
}
}