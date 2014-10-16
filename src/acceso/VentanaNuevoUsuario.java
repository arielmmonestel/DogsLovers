package acceso;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;

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

//import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JToolBar;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Point;
import javax.swing.JScrollBar;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.SystemColor;
import java.awt.ComponentOrientation;
import java.awt.Frame;

public class VentanaNuevoUsuario extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroupSexo = new ButtonGroup();
	private final ButtonGroup buttonGroupSerCasaCuna= new ButtonGroup();
	private JTextField textFieldNombre;
	private JTextField textFieldApellidoUno;
	private JTextField textFieldApellidoDos;
	private JTextField textFieldCorreo;
	private JTextField textFieldTelefono;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldNewPass;
	private JPasswordField passwordFieldRepeatPass;
	private JComboBox comboBoxMes; 
	private JCheckBox CheckBoxCasaCuna;
	private JLabel lblDireccionCasaCuna;
	private JLabel lblCantidadDeMascotas;
	private JSpinner spinnerCantidadDeMascota;
	private JComboBox comboBoxTipoMascota;
	private JLabel lblTipoDeMascota;
	private JLabel lblTamaoDeMascota;
	private JComboBox comboBoxTamanoMascota;
	private JLabel lblIcono;
	private JTextArea textAreaDireccionCC;
	private JScrollPane scrollPane;
	private JLabel labelFondo;
	private JTextField textFieldOtros;
	private JLabel labelIcono;
	Loggin loguearse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNuevoUsuario frame = new VentanaNuevoUsuario();
					frame.setVisible(true);
					frame.setSize(frame.getMaximumSize());
					frame.setLocation(50,0);
					frame.setExtendedState(MAXIMIZED_BOTH);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaNuevoUsuario() {
		setName("frameRegistroUsuario");
		setLocationByPlatform(true);
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setResizable(true);
		
		setLocation(new Point(0, 0));
		setRootPaneCheckingEnabled(false);
		setAlwaysOnTop(true);
		setTitle("Nuevo Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton btnRegistrarme = new JButton("");
		btnRegistrarme.setToolTipText("Guardar");
		btnRegistrarme.setFocusPainted(false);
		btnRegistrarme.setOpaque(false);
		btnRegistrarme.setContentAreaFilled(false);
		btnRegistrarme.setBorderPainted(false);
		btnRegistrarme.setBorder(null);
		btnRegistrarme.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegistrarme.setIconTextGap(-3);
		btnRegistrarme.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
		btnRegistrarme.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
		btnRegistrarme.setIcon(new ImageIcon("./imgs/save-48.png"));
		btnRegistrarme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textFieldCorreo.getText().contains("@")){ //Si el correo Ingresado no contiene "@"
					JOptionPane.showMessageDialog(null, "Por Favor,introduzca adecuadamente su correo(Falta \"@\")", "Error",1);
				}
				if(textFieldCorreo.getText().contains(" ")){//Si el correo Ingresado contiene espacios
					JOptionPane.showMessageDialog(null, "Por Favor,introduzca adecuadamente su correo", "Error",3);
				}
				//System.out.println(passwordFieldNewPass.getPassword()+ "\n" + passwordFieldRepeatPass.getPassword());
				if (!passwordFieldNewPass.getText().equals(passwordFieldRepeatPass.getText())){ //Si las contraseñas no concuerdan
					JOptionPane.showMessageDialog(null, "Su contraseñas no concuerdan, porfavor reingrese las contraseñas", "Error",3);
					passwordFieldNewPass.setText(null);
					passwordFieldRepeatPass.setText(null);
				}
				if(comboBoxMes.getSelectedIndex()==0){
					JOptionPane.showMessageDialog(null, "Seleccione su mes de nacimiento", "Error",3);
					
				}
				//Faltan Validaciones
				else{
					
					JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
					dispose();
						
					
					
					loguearse= new Loggin();
					loguearse.setVisible(true);
					
				}
			}
		});
		
		textFieldOtros = new JTextField();
		textFieldOtros.setVisible(false);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				loguearse= new Loggin();
				loguearse.setVisible(true);
				
			}
		});
		button.setBorder(null);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setIconTextGap(-3);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.setFocusPainted(false);
		button.setPressedIcon(new ImageIcon("./imgs/Cancel-32.png"));
		button.setRolloverIcon(new ImageIcon("./imgs/Cancel-64.png"));
		button.setToolTipText("Cancelar");
		button.setIcon(new ImageIcon("./imgs/Cancel-48.png"));
		button.setBounds(1228, 608, 110, 74);
		panelAgregarPersona.add(button);
		textFieldOtros.setEnabled(false);
		textFieldOtros.setBounds(1232, 199, 138, 20);
		panelAgregarPersona.add(textFieldOtros);
		textFieldOtros.setColumns(10);
		btnRegistrarme.setBackground(new Color(102, 153, 255));
		btnRegistrarme.setBounds(1106, 608, 105, 64);
		panelAgregarPersona.add(btnRegistrarme);
		
		JLabel lblRepetirContrasea = DefaultComponentFactory.getInstance().createLabel("Repetir Contrase\u00F1a");
		lblRepetirContrasea.setForeground(Color.WHITE);
		lblRepetirContrasea.setFont(new Font("Batang", Font.BOLD, 19));
		lblRepetirContrasea.setBounds(29, 569, 236, 23);
		panelAgregarPersona.add(lblRepetirContrasea);
		
		JLabel lblTelefono = DefaultComponentFactory.getInstance().createLabel("Tel\u00E9fono");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(29, 425, 259, 23);
		lblTelefono.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblTelefono);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Nuevo Nickname");
		lblNewJgoodiesLabel.setForeground(Color.WHITE);
		lblNewJgoodiesLabel.setBounds(29, 475, 259, 23);
		lblNewJgoodiesLabel.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNewJgoodiesLabel);
		
		JLabel lblNuevaContrasena = DefaultComponentFactory.getInstance().createLabel("Nueva Contrase\u00F1a");
		lblNuevaContrasena.setForeground(Color.WHITE);
		lblNuevaContrasena.setBounds(29, 522, 259, 23);
		lblNuevaContrasena.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNuevaContrasena);
		
		JLabel lblMail = DefaultComponentFactory.getInstance().createLabel("Correo Electr\u00F3nico");
		lblMail.setForeground(Color.WHITE);
		lblMail.setBounds(29, 378, 259, 23);
		lblMail.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblMail);
		
		JLabel lblSegundoApellido = DefaultComponentFactory.getInstance().createLabel("Segundo Apellido");
		lblSegundoApellido.setForeground(Color.WHITE);
		lblSegundoApellido.setBounds(29, 245, 259, 23);
		lblSegundoApellido.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblSegundoApellido);
		
		JLabel lblPrimerApellido = DefaultComponentFactory.getInstance().createLabel("Primer Apellido");
		lblPrimerApellido.setForeground(Color.WHITE);
		lblPrimerApellido.setBounds(29, 198, 259, 23);
		lblPrimerApellido.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblPrimerApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(29, 153, 259, 23);
		lblNombre.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNombre);
		
		JLabel lblSe = DefaultComponentFactory.getInstance().createLabel("Sexo");
		lblSe.setForeground(Color.WHITE);
		lblSe.setBounds(29, 292, 259, 23);
		lblSe.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblSe);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setFont(new Font("Batang", Font.BOLD, 13));
		rdbtnMasculino.setForeground(Color.WHITE);
		rdbtnMasculino.setContentAreaFilled(false);
		rdbtnMasculino.setSelected(true);
		rdbtnMasculino.setBackground(SystemColor.window);
		rdbtnMasculino.setBounds(278, 292, 253, 23);
		buttonGroupSexo.add(rdbtnMasculino);
		panelAgregarPersona.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setFont(new Font("Batang", Font.BOLD, 13));
		rdbtnFemenino.setForeground(Color.WHITE);
		rdbtnFemenino.setContentAreaFilled(false);
		rdbtnFemenino.setBackground(SystemColor.text);
		rdbtnFemenino.setBounds(407, 292, 124, 23);
		buttonGroupSexo.add(rdbtnFemenino);
		panelAgregarPersona.add(rdbtnFemenino);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setForeground(Color.WHITE);
		lblFechaDeNacimiento.setBounds(29, 334, 229, 23);
		lblFechaDeNacimiento.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblFechaDeNacimiento);
		
		JSpinner spinnerDia = new JSpinner();
		spinnerDia.setBounds(278, 334, 40, 23);
		spinnerDia.setToolTipText("Dia de Nacimiento");
		spinnerDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelAgregarPersona.add(spinnerDia);
		
		comboBoxMes = new JComboBox();
		comboBoxMes.setBackground(SystemColor.text);
		comboBoxMes.setBounds(328, 334, 176, 23);
		comboBoxMes.setToolTipText("Mes de nacimiento");
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"}));
		panelAgregarPersona.add(comboBoxMes);
		
		JSpinner spinnerAnio = new JSpinner();
		spinnerAnio.setBounds(514, 334, 63, 23);
		spinnerAnio.setToolTipText("A\u00F1o de Nacimiento");
		spinnerAnio.setModel(new SpinnerNumberModel(1990, 1887, 2014, 1));
		panelAgregarPersona.add(spinnerAnio);
		
		JLabel lbldeseaSerCasa = new JLabel("\u00BFDesea ser Casa Cuna?");
		lbldeseaSerCasa.setForeground(Color.WHITE);
		lbldeseaSerCasa.setFont(new Font("Batang", Font.BOLD, 19));
		lbldeseaSerCasa.setBounds(29, 618, 236, 23);
		panelAgregarPersona.add(lbldeseaSerCasa);
		
		CheckBoxCasaCuna = new JCheckBox("S\u00ED");
		CheckBoxCasaCuna.setFont(new Font("Batang", Font.BOLD, 13));
		CheckBoxCasaCuna.setForeground(Color.WHITE);
		CheckBoxCasaCuna.setContentAreaFilled(false);
		CheckBoxCasaCuna.setSelected(true);
		CheckBoxCasaCuna.setBackground(SystemColor.text);
		CheckBoxCasaCuna.setBounds(278, 618, 40, 23);
		CheckBoxCasaCuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!CheckBoxCasaCuna.isSelected()){
					CheckBoxCasaCuna.setText("No");
					textAreaDireccionCC.setEnabled(false);
					textAreaDireccionCC.setVisible(false);
					spinnerCantidadDeMascota.setEnabled(false);
					comboBoxTamanoMascota.setEnabled(false);
					comboBoxTipoMascota.setEnabled(false);
					lblTipoDeMascota.setEnabled(false);
					lblTamaoDeMascota.setEnabled(false);
					lblDireccionCasaCuna.setEnabled(false);
					lblCantidadDeMascotas.setEnabled(false);
				}
				else{
					CheckBoxCasaCuna.setText("S\u00ED");
					textAreaDireccionCC.setEnabled(true);
					textAreaDireccionCC.setVisible(true);
					spinnerCantidadDeMascota.setEnabled(true);
					comboBoxTamanoMascota.setEnabled(true);
					comboBoxTipoMascota.setEnabled(true);
					lblTipoDeMascota.setEnabled(true);
					lblTamaoDeMascota.setEnabled(true);
					lblDireccionCasaCuna.setEnabled(true);
					lblCantidadDeMascotas.setEnabled(true);
				
				}
			}
		});
		panelAgregarPersona.add(CheckBoxCasaCuna);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldNombre.setBorder(null);
		textFieldNombre.setActionCommand("\r\n");
		textFieldNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNombre.setBounds(278, 153, 253, 23);
		textFieldNombre.setForeground(Color.BLACK);
		textFieldNombre.setBackground(Color.WHITE);
		panelAgregarPersona.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellidoUno = new JTextField();
		textFieldApellidoUno.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldApellidoUno.setBorder(null);
		textFieldApellidoUno.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldApellidoUno.setBounds(278, 200, 253, 23);
		textFieldApellidoUno.setForeground(new Color(0, 0, 0));
		textFieldApellidoUno.setBackground(Color.WHITE);
		textFieldApellidoUno.setColumns(10);
		panelAgregarPersona.add(textFieldApellidoUno);
		
		textFieldApellidoDos = new JTextField();
		textFieldApellidoDos.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldApellidoDos.setBorder(null);
		textFieldApellidoDos.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldApellidoDos.setBounds(278, 245, 253, 23);
		textFieldApellidoDos.setForeground(new Color(0, 0, 0));
		textFieldApellidoDos.setBackground(Color.WHITE);
		textFieldApellidoDos.setColumns(10);
		panelAgregarPersona.add(textFieldApellidoDos);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldCorreo.setBorder(null);
		textFieldCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCorreo.setBounds(275, 378, 253, 23);
		textFieldCorreo.setForeground(new Color(0, 0, 0));
		textFieldCorreo.setBackground(Color.WHITE);
		textFieldCorreo.setColumns(10);
		panelAgregarPersona.add(textFieldCorreo);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldTelefono.setBorder(null);
		textFieldTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTelefono.setBounds(275, 425, 253, 23);
		textFieldTelefono.setForeground(new Color(0, 0, 0));
		textFieldTelefono.setBackground(Color.WHITE);
		textFieldTelefono.setColumns(10);
		panelAgregarPersona.add(textFieldTelefono);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldUsuario.setBorder(null);
		textFieldUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUsuario.setBounds(275, 475, 253, 23);
		textFieldUsuario.setForeground(new Color(0, 0, 0));
		textFieldUsuario.setBackground(Color.WHITE);
		textFieldUsuario.setColumns(10);
		panelAgregarPersona.add(textFieldUsuario);
		
		passwordFieldNewPass = new JPasswordField();
		passwordFieldNewPass.setBackground(Color.WHITE);
		passwordFieldNewPass.setFont(new Font("Batang", Font.PLAIN, 13));
		passwordFieldNewPass.setBorder(null);
		passwordFieldNewPass.setBounds(275, 522, 253, 23);
		panelAgregarPersona.add(passwordFieldNewPass);
		
		passwordFieldRepeatPass = new JPasswordField();
		passwordFieldRepeatPass.setBackground(Color.WHITE);
		passwordFieldRepeatPass.setFont(new Font("Batang", Font.PLAIN, 13));
		passwordFieldRepeatPass.setBorder(null);
		passwordFieldRepeatPass.setBounds(275, 569, 253, 23);
		panelAgregarPersona.add(passwordFieldRepeatPass);
		
		lblDireccionCasaCuna = new JLabel("Direccion Casa Cuna");
		lblDireccionCasaCuna.setForeground(Color.WHITE);
		lblDireccionCasaCuna.setFont(new Font("Batang", Font.BOLD, 19));
		lblDireccionCasaCuna.setBounds(722, 299, 203, 23);
		panelAgregarPersona.add(lblDireccionCasaCuna);
		
		lblTamaoDeMascota = new JLabel("Tama\u00F1o de Mascota a Recibir");
		lblTamaoDeMascota.setForeground(Color.WHITE);
		lblTamaoDeMascota.setFont(new Font("Batang", Font.BOLD, 19));
		lblTamaoDeMascota.setBounds(722, 153, 270, 23);
		panelAgregarPersona.add(lblTamaoDeMascota);
		
		lblTipoDeMascota = new JLabel("Tipo de Mascota");
		lblTipoDeMascota.setForeground(Color.WHITE);
		lblTipoDeMascota.setFont(new Font("Batang", Font.BOLD, 19));
		lblTipoDeMascota.setBounds(722, 200, 146, 23);
		panelAgregarPersona.add(lblTipoDeMascota);
		
		lblCantidadDeMascotas = new JLabel("\u00BFCu\u00E1ntas Mascotas Podr\u00E9 Recibir? ");
		lblCantidadDeMascotas.setForeground(Color.WHITE);
		lblCantidadDeMascotas.setFont(new Font("Batang", Font.BOLD, 19));
		lblCantidadDeMascotas.setBounds(722, 242, 319, 23);
		panelAgregarPersona.add(lblCantidadDeMascotas);
		
		comboBoxTamanoMascota = new JComboBox();
		comboBoxTamanoMascota.setModel(new DefaultComboBoxModel(new String[] {"Peque\u00F1a(s)", "Mediana(s)", "Grande(s)"}));
		comboBoxTamanoMascota.setBounds(1057, 153, 203, 22);
		panelAgregarPersona.add(comboBoxTamanoMascota);
		
		spinnerCantidadDeMascota = new JSpinner();
		spinnerCantidadDeMascota.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinnerCantidadDeMascota.setBounds(1057, 242, 54, 20);
		panelAgregarPersona.add(spinnerCantidadDeMascota);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(722, 337, 499, 193);
		panelAgregarPersona.add(scrollPane);
		
		textAreaDireccionCC = new JTextArea();
		scrollPane.setViewportView(textAreaDireccionCC);
		
		comboBoxTipoMascota = new JComboBox();
		comboBoxTipoMascota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxTipoMascota.getSelectedIndex()==4){
					textFieldOtros.setVisible(true);
					textFieldOtros.setEnabled(true);
				}else{
				textFieldOtros.setVisible(false);
				textFieldOtros.setEnabled(false);}
			}
		});
		comboBoxTipoMascota.setModel(new DefaultComboBoxModel(new String[] {"Caninos", "Felinos", "Aves", "Roedores", "Otros (Especifique)"}));
		comboBoxTipoMascota.setBounds(1057, 200, 153, 20);
		panelAgregarPersona.add(comboBoxTipoMascota);
		
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
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textFieldNombre, textFieldApellidoUno, textFieldApellidoDos, rdbtnMasculino, rdbtnFemenino, spinnerDia, comboBoxMes, spinnerAnio, textFieldCorreo, textFieldTelefono, textFieldUsuario, passwordFieldNewPass, passwordFieldRepeatPass, CheckBoxCasaCuna, comboBoxTamanoMascota, comboBoxTipoMascota, textFieldOtros, spinnerCantidadDeMascota, textAreaDireccionCC, lblFechaDeNacimiento, lbldeseaSerCasa, lblDireccionCasaCuna, lblTamaoDeMascota, lblTipoDeMascota, lblCantidadDeMascotas, scrollPane, btnRegistrarme}));
		
	
	}
}
