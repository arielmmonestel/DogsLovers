package acceso;

import acceso.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

//import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Loggin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombreUsuario;
	private JPasswordField passwordFieldContrasenaUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loggin frame = new Loggin();
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
	public Loggin() {
		setTitle("Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setOpaque(false);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(116, 178, 148, 101);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLogin = new JButton("");
		btnLogin.setBounds(36, 11, 82, 67);
		panel.add(btnLogin);
		btnLogin.setVerticalTextPosition(SwingConstants.TOP);
		btnLogin.setToolTipText("Ingresar Al Sistema");
		btnLogin.setSelected(true);
		btnLogin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLogin.setFocusPainted(false);
		btnLogin.setRolloverIcon(new ImageIcon("./imgs/Login-in-i48a.png"));
		btnLogin.setPressedIcon(new ImageIcon("./imgs/Login-in-24.png"));
		btnLogin.setIconTextGap(-3);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setIcon(new ImageIcon("./imgs/Login-in-32a.png"));
		btnLogin.setBorderPainted(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnLogin.setBorder(null);
		
		JLabel lblUsuario = DefaultComponentFactory.getInstance().createLabel("Usuario");
		lblUsuario.setFont(new Font("Batang", Font.BOLD, 18));
		lblUsuario.setBounds(116, 77, 107, 14);
		contentPane.add(lblUsuario);
		
		textFieldNombreUsuario = new JTextField();
		textFieldNombreUsuario.setBounds(116, 102, 155, 20);
		contentPane.add(textFieldNombreUsuario);
		textFieldNombreUsuario.setColumns(10);
		
		
		
		passwordFieldContrasenaUsuario = new JPasswordField();
		passwordFieldContrasenaUsuario.setBounds(116, 159, 155, 20);
		contentPane.add(passwordFieldContrasenaUsuario);
		
		JButton btnDeseoRegistrarme = new JButton("Deseo Registrarme");
		btnDeseoRegistrarme.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				NuevoUsuario NU = new NuevoUsuario();
				NU.setVisible(true);
				
				
			}
		});
		btnDeseoRegistrarme.setBackground(new Color(102, 153, 255));
		btnDeseoRegistrarme.setBounds(205, 393, 160, 29);
		contentPane.add(btnDeseoRegistrarme);
		
		JLabel lblContrasea = DefaultComponentFactory.getInstance().createLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Batang", Font.BOLD, 18));
		lblContrasea.setBounds(116, 134, 125, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./imgs/huelloshuesos.png"));
		lblNewLabel.setBounds(-81, 0, 1372, 1280);
		contentPane.add(lblNewLabel);
	}
}
