package reto_0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8802095397294448337L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private String usuario="admin";
	private String contraseña="admin";
	private String user;
	private String contra;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/reto_0/LogoTxurdinaga.png")));
		setTitle("Control Domotico Txurdinaga CIFP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsuario.setBounds(84, 72, 100, 29);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContrasena.setBounds(84, 103, 100, 29);
		contentPane.add(lblContrasena);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(194, 79, 139, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user=txtUsuario.getText();
				contra=new String(passwordField.getPassword());
					if(user.equals(contraseña)&&contraseña.equals(contra)) {
						System.out.println("hola");
					}
					else {
						System.out.println("adivinas");
					}
			}
		});
		btnAcceder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAcceder.setBounds(143, 163, 125, 35);
		contentPane.add(btnAcceder);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 110, 139, 19);
		contentPane.add(passwordField);
	}
}
