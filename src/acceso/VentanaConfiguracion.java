package acceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.JTabbedPane;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import logicaDeNegocios.Sistema;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaConfiguracion extends JFrame {
	private JPanel contentPane;
	private JTextField textFieldNuevoEstado;
	private ButtonGroup grupoAgregarNuevo = new ButtonGroup();
	private JButton btnGuardar;
	private JRadioButton rdbtnNuevoEstado;
	private JRadioButton rdbtnNuevoTipo;
	private JRadioButton rdbtnNuevoColorOjos;
	private JRadioButton rdbtnNuevoColorDe;
	private JRadioButton rdbtnRaza;
	private JComboBox comboBoxTipos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConfiguracion frame = new VentanaConfiguracion();
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
	public VentanaConfiguracion() {
		setTitle("Configuraci\u00F3n");
		setResizable(false);
		setBounds(100, 100, 756, 537);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		contentPane = new JPanel();
		contentPane.setBackground(new Color(99,84, 65));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(99,84, 65));
		contentPane.add(panelPrincipal, "name_62609517236581");
		panelPrincipal.setLayout(null);
		
		btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnNuevoEstado.isSelected()){
					if(!textFieldNuevoEstado.getText().startsWith("Ingrese")){
						try {
							Sistema.agregarEstado(textFieldNuevoEstado.getText());
				
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				if(rdbtnRaza.isSelected()){
					if(!textFieldNuevoEstado.getText().startsWith("Ingrese")){
						try {
							Sistema.agregarRaza((String)comboBoxTipos.getSelectedItem(),textFieldNuevoEstado.getText());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if(rdbtnNuevoTipo.isSelected())
				{}
			}
		});
		btnGuardar.setOpaque(false);
		btnGuardar.setFocusable(false);
		btnGuardar.setFocusTraversalKeysEnabled(false);
		btnGuardar.setFocusPainted(false);
		btnGuardar.setDefaultCapable(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setBorderPainted(false);
		btnGuardar.setRolloverIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\save-64.png"));
		btnGuardar.setPressedIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\save-32.png"));
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\save-48.png"));
		btnGuardar.setBounds(622, 135, 95, 84);
		panelPrincipal.add(btnGuardar);
		
		comboBoxTipos = new JComboBox();
		try {
			comboBoxTipos.setModel(new DefaultComboBoxModel(Sistema.getListaTipo()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comboBoxTipos.setBounds(115, 177, 127, 19);
		panelPrincipal.add(comboBoxTipos);
		
		rdbtnRaza = new JRadioButton(" Raza");
		rdbtnRaza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese la Nueva Raza");
			}
		});
		rdbtnRaza.setFont(new Font("Batang", Font.BOLD, 19));
		rdbtnRaza.setForeground(new Color(0, 0, 0));
		rdbtnRaza.setContentAreaFilled(false);
		rdbtnRaza.setBounds(19, 177, 87, 23);
		grupoAgregarNuevo.add(rdbtnRaza);
		panelPrincipal.add(rdbtnRaza);
		
		textFieldNuevoEstado = new JTextField();
		textFieldNuevoEstado.setText("Ingrese el Nuevo Estado");
		textFieldNuevoEstado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textFieldNuevoEstado.setText(null);
			}
		});
		textFieldNuevoEstado.setBounds(370, 173, 241, 23);
		panelPrincipal.add(textFieldNuevoEstado);
		textFieldNuevoEstado.setColumns(10);
		
		rdbtnNuevoColorDe = new JRadioButton("Nuevo Color de Pelo");
		rdbtnNuevoColorDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese el Nuevo Color de Pelo");
			}
		});
		rdbtnNuevoColorDe.setForeground(new Color(0, 0, 0));
		rdbtnNuevoColorDe.setFont(new Font("Batang", Font.BOLD, 19));
		rdbtnNuevoColorDe.setContentAreaFilled(false);
		rdbtnNuevoColorDe.setBounds(19, 143, 247, 23);
		grupoAgregarNuevo.add(rdbtnNuevoColorDe);
		panelPrincipal.add(rdbtnNuevoColorDe);
		
		rdbtnNuevoTipo = new JRadioButton("Nuevo Tipo de Mascota");
		rdbtnNuevoTipo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese el Nuevo Tipo de Mascota");
			}
		});
		rdbtnNuevoTipo.setForeground(new Color(0, 0, 0));
		rdbtnNuevoTipo.setFont(new Font("Batang", Font.BOLD, 19));
		rdbtnNuevoTipo.setContentAreaFilled(false);
		rdbtnNuevoTipo.setBounds(19, 83, 247, 19);
		grupoAgregarNuevo.add(rdbtnNuevoTipo);
		panelPrincipal.add(rdbtnNuevoTipo);
		
		rdbtnNuevoColorOjos = new JRadioButton("Nuevo Color de Ojos");
		rdbtnNuevoColorOjos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese el Nuevo Color de Ojos");
				
			}
		});
		rdbtnNuevoColorOjos.setForeground(new Color(0, 0, 0));
		rdbtnNuevoColorOjos.setFont(new Font("Batang", Font.BOLD, 19));
		rdbtnNuevoColorOjos.setContentAreaFilled(false);
		rdbtnNuevoColorOjos.setBounds(19, 113, 247, 23);
		grupoAgregarNuevo.add(rdbtnNuevoColorOjos);
		panelPrincipal.add(rdbtnNuevoColorOjos);
		
		rdbtnNuevoEstado = new JRadioButton("Nuevo Estado");
		rdbtnNuevoEstado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese el Nuevo Estado");
			}
		});
		rdbtnNuevoEstado.setSelected(true);
		rdbtnNuevoEstado.setForeground(new Color(0, 0, 0));
		rdbtnNuevoEstado.setFont(new Font("Batang", Font.BOLD, 19));
		rdbtnNuevoEstado.setContentAreaFilled(false);
		rdbtnNuevoEstado.setBounds(19, 51, 247, 23);
		grupoAgregarNuevo.add(rdbtnNuevoEstado);
		panelPrincipal.add(rdbtnNuevoEstado);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(0, 0, 740, 234);
		label.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        //label.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        
		panelPrincipal.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.BLACK);
		//label_1.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
		label_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		label_1.setBounds(0, 253, 740, 234);
		panelPrincipal.add(label_1);
	}
}
