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

public class NuevoUsuario extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoUsuario frame = new NuevoUsuario();
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
	public NuevoUsuario() {
		setTitle("Nuevo Usuario");
		setRootPaneCheckingEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 652);
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
		panelAgregarPersona.setBackground(new Color(30, 144, 255));
		panelAgregarPersona.setBorder(null);
		panelAgregarPersona.setLayout(null);
		
		JButton btnRegistrarme = new JButton("Guardar");
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
					Loggin loguearse= new Loggin();
					loguearse.setVisible(true);
					
				}
			}
		});
		btnRegistrarme.setBackground(new Color(102, 153, 255));
		btnRegistrarme.setBounds(691, 551, 139, 36);
		panelAgregarPersona.add(btnRegistrarme);
		
		JLabel lblRepetirContrasea = DefaultComponentFactory.getInstance().createLabel("Repetir Contrase\u00F1a");
		lblRepetirContrasea.setFont(new Font("Batang", Font.BOLD, 19));
		lblRepetirContrasea.setBounds(29, 510, 236, 23);
		panelAgregarPersona.add(lblRepetirContrasea);
		
		JLabel lblTelefono = DefaultComponentFactory.getInstance().createLabel("Telefono");
		lblTelefono.setBounds(29, 326, 259, 31);
		lblTelefono.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblTelefono);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Nuevo Nombre De Usuario");
		lblNewJgoodiesLabel.setBounds(29, 416, 259, 36);
		lblNewJgoodiesLabel.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNewJgoodiesLabel);
		
		JLabel lblNuevaContrasena = DefaultComponentFactory.getInstance().createLabel("Nueva Contrase\u00F1a");
		lblNuevaContrasena.setBounds(29, 463, 259, 36);
		lblNuevaContrasena.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNuevaContrasena);
		
		JLabel lblMail = DefaultComponentFactory.getInstance().createLabel("E-Mail");
		lblMail.setBounds(29, 279, 259, 36);
		lblMail.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblMail);
		
		JLabel lblSegundoApellido = DefaultComponentFactory.getInstance().createLabel("Segundo Apellido");
		lblSegundoApellido.setBounds(29, 156, 259, 36);
		lblSegundoApellido.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblSegundoApellido);
		
		JLabel lblPrimerApellido = DefaultComponentFactory.getInstance().createLabel("Primer Apellido");
		lblPrimerApellido.setBounds(29, 109, 259, 36);
		lblPrimerApellido.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblPrimerApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(29, 62, 259, 36);
		lblNombre.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblNombre);
		
		JLabel lblSe = DefaultComponentFactory.getInstance().createLabel("Sexo");
		lblSe.setBounds(29, 195, 259, 31);
		lblSe.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblSe);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setSelected(true);
		rdbtnMasculino.setBackground(new Color(255, 140, 0));
		rdbtnMasculino.setBounds(278, 199, 105, 23);
		buttonGroupSexo.add(rdbtnMasculino);
		panelAgregarPersona.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBackground(new Color(255, 140, 0));
		rdbtnFemenino.setBounds(411, 199, 105, 23);
		buttonGroupSexo.add(rdbtnFemenino);
		panelAgregarPersona.add(rdbtnFemenino);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setBounds(29, 237, 259, 31);
		lblFechaDeNacimiento.setFont(new Font("Batang", Font.BOLD, 19));
		panelAgregarPersona.add(lblFechaDeNacimiento);
		
		JSpinner spinnerDia = new JSpinner();
		spinnerDia.setBounds(278, 237, 40, 23);
		spinnerDia.setToolTipText("Dia de Nacimiento");
		spinnerDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelAgregarPersona.add(spinnerDia);
		
		comboBoxMes = new JComboBox();
		comboBoxMes.setBounds(355, 237, 176, 23);
		comboBoxMes.setToolTipText("Mes de nacimiento");
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"}));
		panelAgregarPersona.add(comboBoxMes);
		
		JSpinner spinnerAnio = new JSpinner();
		spinnerAnio.setBounds(556, 237, 92, 23);
		spinnerAnio.setToolTipText("A\u00F1o de Nacimiento");
		spinnerAnio.setModel(new SpinnerNumberModel(1990, 1887, 2014, 1));
		panelAgregarPersona.add(spinnerAnio);
		
		JLabel lbldeseaSerCasa = new JLabel("\u00BFDesea ser Casa Cuna?");
		lbldeseaSerCasa.setFont(new Font("Batang", Font.BOLD, 19));
		lbldeseaSerCasa.setBounds(29, 544, 236, 31);
		panelAgregarPersona.add(lbldeseaSerCasa);
		
		JCheckBox CheckBoxCasaCuna = new JCheckBox("S\u00ED");
		CheckBoxCasaCuna.setBackground(new Color(255, 140, 0));
		CheckBoxCasaCuna.setBounds(278, 551, 40, 23);
		CheckBoxCasaCuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!CheckBoxCasaCuna.isSelected()){
					CheckBoxCasaCuna.setText("No");
				}
				else{
					CheckBoxCasaCuna.setText("S\u00ED");
				}
			}
		});
		CheckBoxCasaCuna.setSelected(true);
		panelAgregarPersona.add(CheckBoxCasaCuna);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldNombre.setBorder(null);
		textFieldNombre.setActionCommand("\r\n");
		textFieldNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNombre.setBounds(278, 62, 253, 25);
		textFieldNombre.setForeground(new Color(255, 255, 255));
		textFieldNombre.setBackground(new Color(255, 140, 0));
		panelAgregarPersona.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellidoUno = new JTextField();
		textFieldApellidoUno.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldApellidoUno.setBorder(null);
		textFieldApellidoUno.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldApellidoUno.setBounds(278, 107, 253, 25);
		textFieldApellidoUno.setForeground(new Color(0, 0, 0));
		textFieldApellidoUno.setBackground(new Color(255, 140, 0));
		textFieldApellidoUno.setColumns(10);
		panelAgregarPersona.add(textFieldApellidoUno);
		
		textFieldApellidoDos = new JTextField();
		textFieldApellidoDos.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldApellidoDos.setBorder(null);
		textFieldApellidoDos.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldApellidoDos.setBounds(278, 153, 253, 25);
		textFieldApellidoDos.setForeground(new Color(0, 0, 0));
		textFieldApellidoDos.setBackground(new Color(255, 140, 0));
		textFieldApellidoDos.setColumns(10);
		panelAgregarPersona.add(textFieldApellidoDos);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldCorreo.setBorder(null);
		textFieldCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCorreo.setBounds(278, 279, 253, 25);
		textFieldCorreo.setForeground(new Color(0, 0, 0));
		textFieldCorreo.setBackground(new Color(255, 140, 0));
		textFieldCorreo.setColumns(10);
		panelAgregarPersona.add(textFieldCorreo);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldTelefono.setBorder(null);
		textFieldTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTelefono.setBounds(278, 326, 253, 25);
		textFieldTelefono.setForeground(new Color(0, 0, 0));
		textFieldTelefono.setBackground(new Color(255, 140, 0));
		textFieldTelefono.setColumns(10);
		panelAgregarPersona.add(textFieldTelefono);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("Batang", Font.PLAIN, 13));
		textFieldUsuario.setBorder(null);
		textFieldUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUsuario.setBounds(278, 416, 253, 25);
		textFieldUsuario.setForeground(new Color(0, 0, 0));
		textFieldUsuario.setBackground(new Color(255, 140, 0));
		textFieldUsuario.setColumns(10);
		panelAgregarPersona.add(textFieldUsuario);
		
		passwordFieldNewPass = new JPasswordField();
		passwordFieldNewPass.setBackground(new Color(255, 140, 0));
		passwordFieldNewPass.setFont(new Font("Batang", Font.PLAIN, 13));
		passwordFieldNewPass.setBorder(null);
		passwordFieldNewPass.setBounds(278, 463, 253, 23);
		panelAgregarPersona.add(passwordFieldNewPass);
		
		passwordFieldRepeatPass = new JPasswordField();
		passwordFieldRepeatPass.setBackground(new Color(255, 140, 0));
		passwordFieldRepeatPass.setFont(new Font("Batang", Font.PLAIN, 13));
		passwordFieldRepeatPass.setBorder(null);
		passwordFieldRepeatPass.setBounds(275, 510, 253, 23);
		panelAgregarPersona.add(passwordFieldRepeatPass);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("./imgs/huelloshuesos.png"));
		lblNewLabel.setLabelFor(contentPane);
		lblNewLabel.setBounds(0, 0, 1372, 1280);
		panelAgregarPersona.add(lblNewLabel);
		
		/*JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("./imgs/huelloshuesos.png"));
		lblFondo.setBounds(0, 0, 1397, 1280);
		panelAgregarPersona.add(lblFondo);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textFieldNombre, textFieldApellidoUno, textFieldApellidoDos, rdbtnMasculino, rdbtnFemenino, spinnerDia, comboBoxMes, spinnerAnio, textFieldCorreo, textFieldTelefono, textFieldUsuario, passwordFieldNewPass, passwordFieldRepeatPass, CheckBoxCasaCuna}));
		*/
		
	}
}
