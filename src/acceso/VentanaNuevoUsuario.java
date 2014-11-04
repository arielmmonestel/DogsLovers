package acceso;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.jgoodies.forms.factories.DefaultComponentFactory;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import logicaDeNegocios.EnviarMail;
import logicaDeNegocios.Sistema;
import logicaDeNegocios.SistemasUsuarios;
import logicaDeNegocios.Usuario;

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
	private JLabel lblIcono;
	private JLabel labelFondo;
	private JLabel labelIcono;
	Loggin loguearse;
	private static int IDUsuarios=0;
	private JComboBox comboBoxSexo;
	private JSpinner spinnerDia;
	private JSpinner spinnerAnio;

	/**
	 * Launch the application.
	 */
	public String convertirClave(char[] arreglo){
		String respuesta = "";
		for(int i = 0; i < arreglo.length; i++){
			respuesta += arreglo[i]; 
		}
		return respuesta;
	}
	
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
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
				validarEmail();
				String nombre = textFieldNombre.getText();
				String apellidoUno= textFieldApellidoUno.getText();
				String apellidoDos =  textFieldApellidoDos.getText();
				String sexo= (String) comboBoxSexo.getSelectedItem();
				String telefono = textFieldTelefono.getText();
				String correo = textFieldCorreo.getText();
				int diaNacimiento = (Integer) (spinnerDia.getValue());
				String mesNacimiento =((String)comboBoxMes.getSelectedItem());
				int anioNacimiento= ((Integer)spinnerAnio.getValue());
				String nickName = textFieldUsuario.getText();
				String contrasenia= convertirClave(passwordFieldNewPass.getPassword()); // No probado aún
				
						
						if(textFieldNombre.getText().isEmpty()){
							JOptionPane.showMessageDialog(contentPane, "Error! el campo de nombre esta vacio");
							return;
						}
						
						if(textFieldApellidoUno.getText().isEmpty()){
							JOptionPane.showMessageDialog(contentPane, "Error! el campo de Apellido Uno esta vacio");
							return;
						}
						
						if(textFieldApellidoDos.getText().isEmpty()){
							JOptionPane.showMessageDialog(contentPane, "Error! el campo de Apellido Dos esta vacio");
							return;
						}
						
						
						
						if(textFieldUsuario.getText().isEmpty()){
							JOptionPane.showMessageDialog(contentPane, "Error! el campo de Usuario esta vacio");
							return;
						}
						
						if(textFieldTelefono.getText().length() == 0){
							JOptionPane.showMessageDialog(contentPane, "Error! el campo de Telefono esta vacio");
							return;
						}
						if(passwordFieldRepeatPass.getPassword().length!= passwordFieldNewPass.getPassword().length){
							JOptionPane.showMessageDialog(contentPane, "Error! Las contrasenas no concuerdan");
							return;
						
						}
						
						
						if(textFieldCorreo.getText().isEmpty()){
							JOptionPane.showMessageDialog(contentPane, "Error! el campo de correo electronico esta vacio");
							return;
						}
						
						if(SistemasUsuarios.nicknameYaEstaRegistrado(nickName)){
							JOptionPane.showMessageDialog(contentPane, "Error! el nombre de usuario ya existe");
							textFieldUsuario.setText("");
							return;
						}

						if(SistemasUsuarios.emailYaEstaRegistrado(correo)){
						
							JOptionPane.showMessageDialog(contentPane, "Error! Este usuario ya fue registrado");
							return;
						}
						
						else{
							Usuario NuevoUsuario = new Usuario(nombre,apellidoUno,apellidoDos,sexo,
									telefono,correo,diaNacimiento,mesNacimiento,anioNacimiento,nickName,contrasenia);
									try {
										//SistemasUsuarios.leerUsuarios();
										SistemasUsuarios.AgregarUsuario(NuevoUsuario);
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									//Usuario.getListaDeUsuarios().add(NuevoUsuario);
									//NuevoUsuario.GuardarUsuario(Usuario.getListaDeUsuarios());
									String subject = "¡Bienvenido a Dogs Lovers " +nombre+ "!";
									String mensaje = "¡Bienvenido a Dogs Lovers " +nombre+ "!." + "\n"+ 
													 "Su nombre de Usuario es: "+nickName+ "."+ "\n" + 
													 "Su contrasenia es: " +contrasenia + "." + "\n" + 
													 "Fecha de Registro: " + Sistema.getFecha();
									EnviarMail.correoDestinatario = correo;
									EnviarMail.subject = subject;
									EnviarMail.mensaje = mensaje;
									
									JOptionPane.showMessageDialog(contentPane, "Usuario registrado correctamente");
									EnviarMail.enviarMail();
									dispose();
									loguearse= new Loggin();
									loguearse.setVisible(true);
									
					  }
			}});
					
		
		
		JButton buttonCancelar = new JButton("");
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				loguearse= new Loggin();
				loguearse.setVisible(true);
				
				
			}
		});
		
		comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		comboBoxSexo.setBounds(282, 385, 176, 19);
		panelAgregarPersona.add(comboBoxSexo);
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
		btnRegistrarme.setBackground(new Color(102, 153, 255));
		btnRegistrarme.setBounds(1106, 608, 105, 64);
		panelAgregarPersona.add(btnRegistrarme);
		
		JLabel lblRepetirContrasea = DefaultComponentFactory.getInstance().createLabel("Repetir Contrase\u00F1a");
		lblRepetirContrasea.setForeground(Color.WHITE);
		lblRepetirContrasea.setFont(new Font("Batang", Font.BOLD, 19));
		lblRepetirContrasea.setBounds(659, 324, 236, 23);
		panelAgregarPersona.add(lblRepetirContrasea);
		
		JLabel lblTelefono = DefaultComponentFactory.getInstance().createLabel("Tel\u00E9fono");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(33, 557, 259, 23);
		lblTelefono.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblTelefono);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Nuevo Nickname");
		lblNewJgoodiesLabel.setForeground(Color.WHITE);
		lblNewJgoodiesLabel.setBounds(659, 210, 259, 23);
		lblNewJgoodiesLabel.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNewJgoodiesLabel);
		
		JLabel lblNuevaContrasena = DefaultComponentFactory.getInstance().createLabel("Nueva Contrase\u00F1a");
		lblNuevaContrasena.setForeground(Color.WHITE);
		lblNuevaContrasena.setBounds(659, 266, 259, 23);
		lblNuevaContrasena.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNuevaContrasena);
		
		JLabel lblMail = DefaultComponentFactory.getInstance().createLabel("Correo Electr\u00F3nico");
		lblMail.setForeground(Color.WHITE);
		lblMail.setBounds(33, 494, 259, 23);
		lblMail.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblMail);
		
		JLabel lblSegundoApellido = DefaultComponentFactory.getInstance().createLabel("Segundo Apellido");
		lblSegundoApellido.setForeground(Color.WHITE);
		lblSegundoApellido.setBounds(33, 324, 259, 23);
		lblSegundoApellido.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblSegundoApellido);
		
		JLabel lblPrimerApellido = DefaultComponentFactory.getInstance().createLabel("Primer Apellido");
		lblPrimerApellido.setForeground(Color.WHITE);
		lblPrimerApellido.setBounds(33, 266, 259, 23);
		lblPrimerApellido.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblPrimerApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(33, 210, 259, 23);
		lblNombre.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNombre);
		
		JLabel lblSe = DefaultComponentFactory.getInstance().createLabel("Sexo");
		lblSe.setForeground(Color.WHITE);
		lblSe.setBounds(33, 381, 259, 23);
		lblSe.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblSe);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setForeground(Color.WHITE);
		lblFechaDeNacimiento.setBounds(33, 436, 229, 23);
		lblFechaDeNacimiento.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblFechaDeNacimiento);
		
		spinnerDia = new JSpinner();
		spinnerDia.setBounds(282, 436, 40, 23);
		spinnerDia.setToolTipText("Dia de Nacimiento");
		spinnerDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelAgregarPersona.add(spinnerDia);
		
		comboBoxMes = new JComboBox();
		comboBoxMes.setBackground(SystemColor.text);
		comboBoxMes.setBounds(332, 436, 176, 23);
		comboBoxMes.setToolTipText("Mes de nacimiento");
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"}));
		panelAgregarPersona.add(comboBoxMes);
		
		spinnerAnio = new JSpinner();
		spinnerAnio.setBounds(518, 436, 63, 23);
		spinnerAnio.setToolTipText("A\u00F1o de Nacimiento");
		spinnerAnio.setModel(new SpinnerNumberModel(1990, 1887, 2014, 1));
		panelAgregarPersona.add(spinnerAnio);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldNombre.setBorder(null);
		textFieldNombre.setActionCommand("\r\n");
		textFieldNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNombre.setBounds(282, 210, 253, 23);
		textFieldNombre.setForeground(Color.BLACK);
		textFieldNombre.setBackground(Color.WHITE);
		panelAgregarPersona.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellidoUno = new JTextField();
		textFieldApellidoUno.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldApellidoUno.setBorder(null);
		textFieldApellidoUno.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldApellidoUno.setBounds(282, 268, 253, 23);
		textFieldApellidoUno.setForeground(new Color(0, 0, 0));
		textFieldApellidoUno.setBackground(Color.WHITE);
		textFieldApellidoUno.setColumns(10);
		panelAgregarPersona.add(textFieldApellidoUno);
		
		textFieldApellidoDos = new JTextField();
		textFieldApellidoDos.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldApellidoDos.setBorder(null);
		textFieldApellidoDos.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldApellidoDos.setBounds(282, 324, 253, 23);
		textFieldApellidoDos.setForeground(new Color(0, 0, 0));
		textFieldApellidoDos.setBackground(Color.WHITE);
		textFieldApellidoDos.setColumns(10);
		panelAgregarPersona.add(textFieldApellidoDos);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldCorreo.setBorder(null);
		textFieldCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCorreo.setBounds(279, 494, 253, 23);
		textFieldCorreo.setForeground(new Color(0, 0, 0));
		textFieldCorreo.setBackground(Color.WHITE);
		textFieldCorreo.setColumns(10);
		panelAgregarPersona.add(textFieldCorreo);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldTelefono.setBorder(null);
		textFieldTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTelefono.setBounds(279, 557, 253, 23);
		textFieldTelefono.setForeground(new Color(0, 0, 0));
		textFieldTelefono.setBackground(Color.WHITE);
		textFieldTelefono.setColumns(10);
		panelAgregarPersona.add(textFieldTelefono);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldUsuario.setBorder(null);
		textFieldUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUsuario.setBounds(905, 210, 253, 23);
		textFieldUsuario.setForeground(new Color(0, 0, 0));
		textFieldUsuario.setBackground(Color.WHITE);
		textFieldUsuario.setColumns(10);
		panelAgregarPersona.add(textFieldUsuario);
		
		passwordFieldNewPass = new JPasswordField();
		passwordFieldNewPass.setBackground(Color.WHITE);
		passwordFieldNewPass.setFont(new Font("Batang", Font.PLAIN, 13));
		passwordFieldNewPass.setBorder(null);
		passwordFieldNewPass.setBounds(905, 266, 253, 23);
		panelAgregarPersona.add(passwordFieldNewPass);
		
		passwordFieldRepeatPass = new JPasswordField();
		passwordFieldRepeatPass.setBackground(Color.WHITE);
		passwordFieldRepeatPass.setFont(new Font("Batang", Font.PLAIN, 13));
		passwordFieldRepeatPass.setBorder(null);
		passwordFieldRepeatPass.setBounds(905, 324, 253, 23);
		panelAgregarPersona.add(passwordFieldRepeatPass);
		
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
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textFieldNombre, textFieldApellidoUno, textFieldApellidoDos, spinnerDia, comboBoxMes, spinnerAnio, textFieldCorreo, textFieldTelefono, textFieldUsuario, passwordFieldNewPass, passwordFieldRepeatPass, lblFechaDeNacimiento, btnRegistrarme}));
		
	
	}
	public void validarEmail(){
		if (textFieldCorreo.getText().isEmpty()){
			textFieldCorreo.setText(null);
		}
	}
}
