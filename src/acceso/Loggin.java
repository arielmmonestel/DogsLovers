/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabi�n Monge
*Jefri C�rdenas
*Fecha de Creacion: 4/11/2014
*
*/

package acceso;

import acceso.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

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

import java.awt.Toolkit;
import java.awt.Cursor;
import java.io.IOException;

import logicaDeNegocios.EnviarMail;
import logicaDeNegocios.Mascota;
import logicaDeNegocios.SistemasUsuarios;
import logicaDeNegocios.Usuario;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Loggin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setOpaque(false);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIngresar = new JButton("");
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngresar.setFocusPainted(false);
		btnIngresar.setFocusTraversalKeysEnabled(false);
		btnIngresar.setFocusable(false);
		btnIngresar.setRolloverIcon(new ImageIcon("./imgs/BotonIngresarTamanioGrande.png"));
		btnIngresar.setPressedIcon(new ImageIcon("./imgs/BotonIngresarTamanioPequenio.png"));
		btnIngresar.setBorderPainted(false);
		btnIngresar.setBorder(null);
		btnIngresar.setIcon(new ImageIcon("./imgs/BotonIngresarTamanioMedio.png"));
		btnIngresar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String entradaUsuario = textFieldNombreUsuario.getText();
				String entradaContrasenia = passwordFieldContrasenaUsuario.getText();
				

				if(SistemasUsuarios.verificarUsuarioYContrasena(entradaUsuario, entradaContrasenia)){
					
					dispose();
					
					try {
						VentanaPrincipal.setNombreUsuarioActivo(entradaUsuario);
						VentanaPrincipal window = new VentanaPrincipal();
	                    window.VentanaPrincipal.setVisible(true);
	                    VentanaPrincipal.setIDUsuarioActivo(SistemasUsuarios.getIdPorNickName(entradaUsuario));
						
						
						if(SistemasUsuarios.verificarEsAdministrador(entradaUsuario)){
						
							VentanaPrincipal.setEsVisible(true);
							
						}
						
						else{
						
							VentanaPrincipal.setEsVisible(false);
							
						}
					
					
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				else{
				
					JOptionPane.showMessageDialog(null, "Usuario y/o contrase�a inv�lidos");
				}
			}
		});
		
		JButton btnquinesSomos = new JButton("\u00BFQui\u00E9nes Somos?");
		btnquinesSomos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaInformacionDL bla = new  VentanaInformacionDL(); 
				bla.setVisible(true);
			}
		});
		btnquinesSomos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnquinesSomos.setForeground(Color.WHITE);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnquinesSomos.setForeground(Color.BLUE);
			}
		});
		btnquinesSomos.setForeground(Color.WHITE);
		btnquinesSomos.setFont(new Font("Khmer UI", Font.BOLD, 11));
		btnquinesSomos.setFocusable(false);
		btnquinesSomos.setFocusTraversalKeysEnabled(false);
		btnquinesSomos.setFocusPainted(false);
		btnquinesSomos.setContentAreaFilled(false);
		btnquinesSomos.setBorderPainted(false);
		btnquinesSomos.setBounds(414, 0, 138, 23);
		contentPane.add(btnquinesSomos);
		
		btnIngresar.setBounds(154, 302, 245, 62);
		contentPane.add(btnIngresar);
		
		JLabel lblUsuario = DefaultComponentFactory.getInstance().createLabel("");
		lblUsuario.setIcon(new ImageIcon("./imgs/EtiquetaUsuario.png"));
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Batang", Font.BOLD, 18));
		lblUsuario.setBounds(112, 180, 138, 29);
		contentPane.add(lblUsuario);
		
		textFieldNombreUsuario = new JTextField();
		textFieldNombreUsuario.setBounds(198, 187, 155, 20);
		contentPane.add(textFieldNombreUsuario);
		textFieldNombreUsuario.setColumns(10);
		
		
		
		passwordFieldContrasenaUsuario = new JPasswordField();
		passwordFieldContrasenaUsuario.setBounds(198, 243, 155, 20);
		contentPane.add(passwordFieldContrasenaUsuario);
		
		JButton btnDeseoRegistrarme = new JButton("");
		btnDeseoRegistrarme.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDeseoRegistrarme.setRolloverIcon(new ImageIcon("./imgs/BotonRegistarseM2yM3.png"));
		btnDeseoRegistrarme.setRequestFocusEnabled(false);
		btnDeseoRegistrarme.setFocusTraversalKeysEnabled(false);
		btnDeseoRegistrarme.setFocusPainted(false);
		btnDeseoRegistrarme.setDefaultCapable(false);
		btnDeseoRegistrarme.setBorderPainted(false);
		btnDeseoRegistrarme.setIcon(new ImageIcon("./imgs/BotonRegistarseM1.png"));
		btnDeseoRegistrarme.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				VentanaNuevoUsuario NU = new VentanaNuevoUsuario();
				NU.setVisible(true);
				NU.setExtendedState(MAXIMIZED_BOTH);
				
				
			}
		});
		btnDeseoRegistrarme.setBackground(new Color(102, 153, 255));
		btnDeseoRegistrarme.setBounds(186, 386, 183, 36);
		contentPane.add(btnDeseoRegistrarme);
		
		JLabel lblContrasea = DefaultComponentFactory.getInstance().createLabel("");
		lblContrasea.setIcon(new ImageIcon("./imgs/EtiquetaContrasenia.png"));
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Batang", Font.BOLD, 18));
		lblContrasea.setBounds(112, 230, 125, 42);
		contentPane.add(lblContrasea);
		
		JLabel labelDL = new JLabel("");
		labelDL.setIcon(new ImageIcon("./imgs/Logo.png"));
		labelDL.setBounds(0, 0, 552, 135);
		contentPane.add(labelDL);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setHorizontalAlignment(SwingConstants.CENTER);
		labelFondo.setHorizontalTextPosition(SwingConstants.CENTER);
		labelFondo.setIconTextGap(-3);
		labelFondo.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
		labelFondo.setBounds(0, 0, 552, 458);
		contentPane.add(labelFondo);
	}
}
