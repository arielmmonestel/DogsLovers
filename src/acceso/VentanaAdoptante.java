package acceso;
import logicaDeNegocios.*;
import acceso.VentanaPrincipal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Component;

import javax.swing.JPasswordField;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JToolBar;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.Point;

import javax.swing.JScrollBar;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import sun.security.util.Length;

import java.awt.SystemColor;
import java.awt.ComponentOrientation;
import java.awt.Frame;
import java.io.IOException;
import java.util.ArrayList;

import logicaDeNegocios.EnviarMail;
import logicaDeNegocios.Mascota;
import logicaDeNegocios.Persona;
import logicaDeNegocios.Sistema;
import logicaDeNegocios.Usuario;

public class VentanaAdoptante extends JFrame {

	private JPanel contentPane;
	private static ArrayList<Mascota>listaMascotasParaMostrar ;
	private static ArrayList<Usuario>listaUsuarios ;
	private Usuario usuario ;
	private JLabel lblIcono;
	private JLabel labelFondo;
	private JLabel labelIcono;
	private static int IDUsuario=0;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public VentanaAdoptante(Mascota mascota) {
		listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
		try {
			listaUsuarios = SistemasUsuarios.getUsuarios();
			usuario = listaUsuarios.get(VentanaPrincipal.getIDUsuarioActivo());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		setName("frameRegistroUsuario");
		setLocationByPlatform(true);
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setResizable(true);
		
		setLocation(new Point(0, 0));
		setRootPaneCheckingEnabled(false);
		setAlwaysOnTop(true);
		setTitle("Adopciones");
		setBounds(100, 100, 1387, 730);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//java.awt.Rectangle[x=-8,y=-8,width=1382,height=744]
		
		JPanel panelAgregarPersona = new JPanel();
		panelAgregarPersona.setBounds(0, 0, 1380, 742);
		contentPane.add(panelAgregarPersona);
		panelAgregarPersona.setBackground(Color.GRAY);
		panelAgregarPersona.setBorder(null);
		panelAgregarPersona.setLayout(null);
		
		
		JButton btnGuardar = new JButton("");
		btnGuardar.setToolTipText("Guardar");
		btnGuardar.setFocusPainted(false);
		btnGuardar.setOpaque(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setBorderPainted(false);
		btnGuardar.setBorder(null);
		btnGuardar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGuardar.setIconTextGap(-3);
		btnGuardar.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
		btnGuardar.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
		btnGuardar.setIcon(new ImageIcon("./imgs/save-48.png"));
		
		JButton buttonCancelar = new JButton("");
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		buttonCancelar.setBorder(null);
		buttonCancelar.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonCancelar.setIconTextGap(-3);
		buttonCancelar.setBorderPainted(false);
		buttonCancelar.setContentAreaFilled(false);
		buttonCancelar.setFocusPainted(false);
		buttonCancelar.setPressedIcon(new ImageIcon("./imgs/Cancel-32.png"));
		buttonCancelar.setRolloverIcon(new ImageIcon("./imgs/Cancel-64.png"));
		buttonCancelar.setToolTipText("Cancelar");
		buttonCancelar.setIcon(new ImageIcon("./imgs/Cancel-48.png"));
		buttonCancelar.setBounds(1228, 608, 110, 74);
		panelAgregarPersona.add(buttonCancelar);
		btnGuardar.setBackground(new Color(102, 153, 255));
		btnGuardar.setBounds(1106, 608, 105, 64);
		panelAgregarPersona.add(btnGuardar);
		
		JLabel lblSegundoApellido = DefaultComponentFactory.getInstance().createLabel("Segundo Apellido: "+usuario.getSegundoApellido());
		lblSegundoApellido.setForeground(Color.WHITE);
		lblSegundoApellido.setBounds(33, 461, 259, 23);
		lblSegundoApellido.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblSegundoApellido);
		
		JLabel lblPrimerApellido = DefaultComponentFactory.getInstance().createLabel("Primer Apellido: "+usuario.getPrimerApellido());
		lblPrimerApellido.setForeground(Color.WHITE);
		lblPrimerApellido.setBounds(33, 416, 259, 23);
		lblPrimerApellido.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblPrimerApellido);
		
		JLabel lblNombre = new JLabel("Nombre: "+usuario.getNombre());
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(33, 363, 259, 23);
		lblNombre.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNombre);
		
		JLabel lblSe = DefaultComponentFactory.getInstance().createLabel("Sexo: "+usuario.getSexo());
		lblSe.setForeground(Color.WHITE);
		lblSe.setBounds(33, 512, 259, 23);
		lblSe.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblSe);
		
		labelIcono = new JLabel("");
		labelIcono.setIcon(new ImageIcon("./imgs/Icono.png"));
		labelIcono.setBounds(573, 11, 176, 144);
		panelAgregarPersona.add(labelIcono);
		
		labelFondo = new JLabel("");
		labelFondo.setVerifyInputWhenFocusTarget(false);
		labelFondo.setVerticalAlignment(SwingConstants.TOP);
		labelFondo.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
		labelFondo.setBounds(0, 0, 5296, 2504);
		panelAgregarPersona.add(labelFondo);
		
		JLabel labelAdoptante = new JLabel("Adoptante");
		labelAdoptante.setForeground(Color.WHITE);
		labelAdoptante.setFont(new Font("Batang", Font.BOLD, 19));
		labelAdoptante.setBounds(220, 363, 259, 23);
		panelAgregarPersona.add(labelAdoptante);
		
		JLabel lblMascota = new JLabel("Mascota");
		lblMascota.setForeground(Color.WHITE);
		lblMascota.setFont(new Font("Batang", Font.BOLD, 19));
		lblMascota.setBounds(978, 172, 259, 23);
		panelAgregarPersona.add(lblMascota);
		
		JLabel lblTipo = new JLabel("Tipo: "+mascota.getTipo());
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Batang", Font.BOLD, 19));
		lblTipo.setBounds(775, 363, 259, 23);
		panelAgregarPersona.add(lblTipo);
		
		JLabel lblRaza = new JLabel("Raza: "+mascota.getRaza());
		lblRaza.setForeground(Color.WHITE);
		lblRaza.setFont(new Font("Batang", Font.BOLD, 19));
		lblRaza.setBounds(775, 416, 259, 23);
		panelAgregarPersona.add(lblRaza);
		
		JLabel lblColorDePelo = new JLabel("Color de pelo: "+mascota.getColorDePelo());
		lblColorDePelo.setForeground(Color.WHITE);
		lblColorDePelo.setFont(new Font("Batang", Font.BOLD, 19));
		lblColorDePelo.setBounds(775, 461, 259, 23);
		panelAgregarPersona.add(lblColorDePelo);
		
		JLabel lblColorDeOjos = new JLabel("Color de ojos: "+mascota.getColorDeOjos());
		lblColorDeOjos.setForeground(Color.WHITE);
		lblColorDeOjos.setFont(new Font("Batang", Font.BOLD, 19));
		lblColorDeOjos.setBounds(775, 512, 259, 23);
		panelAgregarPersona.add(lblColorDeOjos);
		
		JLabel label = new JLabel("<Foto>");
		label.setBounds(888, 113, 94, 106);
		label.setIcon(new ImageIcon(mascota.getFoto()));
		panelAgregarPersona.add(label);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnGuardar}));
		
	
	}
}
