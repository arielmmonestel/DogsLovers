package acceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import logicaDeNegocios.Asociacion;
import logicaDeNegocios.Sistema;

public class VentanaRegistroAsociaciónBeneficiaria extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombreAsociacion;
	private JTextField textFieldDireccionAso;
	private JTextField textFieldTelefonoASo;
	private JTextField textFieldNumCuentaAso;
	private JTextField textFieldPaginaWebAso;
	private JButton btnGuardarAso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistroAsociaciónBeneficiaria frame = new VentanaRegistroAsociaciónBeneficiaria();
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
	public VentanaRegistroAsociaciónBeneficiaria() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setAlwaysOnTop(true);
		setType(Type.POPUP);
		setTitle("Registro Asociaci\u00F3n Beneficiaria");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 467, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(99, 84, 65));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nombre de la Asociaci\u00F3n :");
		label.setBounds(30, 136, 264, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Direcci\u00F3n :");
		label_1.setBounds(30, 178, 264, 31);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Tel\u00E9fono :");
		label_2.setBounds(30, 220, 264, 31);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("N\u00FAmero de Cuenta:");
		label_3.setBounds(30, 262, 264, 31);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("P\u00E1gina Web :");
		label_4.setBounds(30, 304, 264, 31);
		contentPane.add(label_4);
		
		textFieldNombreAsociacion = new JTextField();
		textFieldNombreAsociacion.setBounds(208, 141, 163, 20);
		contentPane.add(textFieldNombreAsociacion);
		textFieldNombreAsociacion.setColumns(10);
		
		textFieldDireccionAso = new JTextField();
		textFieldDireccionAso.setText("");
		textFieldDireccionAso.setBounds(208, 183, 163, 20);
		contentPane.add(textFieldDireccionAso);
		textFieldDireccionAso.setColumns(10);
		
		textFieldTelefonoASo = new JTextField();
		textFieldTelefonoASo.setText("");
		textFieldTelefonoASo.setColumns(10);
		textFieldTelefonoASo.setBounds(208, 225, 163, 20);
		contentPane.add(textFieldTelefonoASo);
		
		textFieldNumCuentaAso = new JTextField();
		textFieldNumCuentaAso.setText("");
		textFieldNumCuentaAso.setColumns(10);
		textFieldNumCuentaAso.setBounds(208, 267, 163, 20);
		contentPane.add(textFieldNumCuentaAso);
		
		textFieldPaginaWebAso = new JTextField();
		textFieldPaginaWebAso.setText("");
		textFieldPaginaWebAso.setBounds(208, 309, 163, 20);
		contentPane.add(textFieldPaginaWebAso);
		textFieldPaginaWebAso.setColumns(10);
		
		btnGuardarAso = new JButton("");
		btnGuardarAso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Asociacion asobene = new Asociacion();
				asobene.setNombre(textFieldNombreAsociacion.getText());
				asobene.setDireccion(textFieldDireccionAso.getText());
				asobene.setNumeroDeCuenta(textFieldNumCuentaAso.getText());
				asobene.setPaginaWeb(textFieldPaginaWebAso.getText());
				asobene.setTelefono(textFieldTelefonoASo.getText());
				try {
					Sistema.leerAsociaciones();
					Sistema.listaAsociaciones.add(asobene);
					Sistema.GuardarAsociacion();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Asociación Beneficiara registrada correctamente");
				textFieldTelefonoASo.setText("");
				textFieldDireccionAso.setText("");
				textFieldNombreAsociacion.setText("");
				textFieldNumCuentaAso.setText("");
				textFieldPaginaWebAso.setText("");
				dispose();
			}
		});
		btnGuardarAso .setToolTipText("Guardar en el Registro de Asociaciones Beneficiarias");
		btnGuardarAso .setBorder(null);
		btnGuardarAso .setFocusable(false);
		btnGuardarAso .setFocusTraversalKeysEnabled(false);
		btnGuardarAso .setFocusPainted(false);
		btnGuardarAso.setDefaultCapable(false);
		btnGuardarAso.setContentAreaFilled(false);
		btnGuardarAso.setBorderPainted(false);
		btnGuardarAso.setIconTextGap(-3);
		btnGuardarAso.setHorizontalTextPosition(SwingConstants.CENTER);
		btnGuardarAso.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
		btnGuardarAso.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
		btnGuardarAso.setIcon(new ImageIcon("./imgs/save-48.png"));
		btnGuardarAso.setBounds(304, 357, 109, 78);
		contentPane.add(btnGuardarAso);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setBounds(160, 0, 163, 125);
        lblIcono.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\Icono.png"));
        contentPane.add(lblIcono);
	}
}
