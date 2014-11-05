package acceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

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

import logicaDeNegocios.ListaNegra;
import logicaDeNegocios.Sistema;
import logicaDeNegocios.SistemasUsuarios;
import logicaDeNegocios.Usuario;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JScrollPane;

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
	private JButton btnAgregarNuevasCaracteristicas;
	private JButton btnQuitarDeLista;
	private JPanel panelNuevasCaracteristicas;
	private JPanel panelQuitarDeListaNegra;
	private JTable tableQuitarListaNegra;
	private JLabel lblQuitarDeLista;
	private JLabel labelIcono2;
	private JButton btnQuitarDeLista_1;

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
		
		panelNuevasCaracteristicas = new JPanel();
		panelNuevasCaracteristicas.setBackground(new Color(99,84, 65));
		contentPane.add(panelNuevasCaracteristicas, "name_62609517236581");
		panelNuevasCaracteristicas.setLayout(null);
		
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
				{
					if(!textFieldNuevoEstado.getText().startsWith("Ingrese")){
						try {
							Sistema.agregarTipo(textFieldNuevoEstado.getText());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
				if(rdbtnNuevoColorOjos.isSelected()){
					if(!textFieldNuevoEstado.getText().startsWith("Ingrese")){
						try {
							Sistema.agregarColorDeOjos(textFieldNuevoEstado.getText());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if(rdbtnNuevoColorDe.isSelected()){
					if(!textFieldNuevoEstado.getText().startsWith("Ingrese")){
						try {
							Sistema.agregarColorDePelo(textFieldNuevoEstado.getText());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		btnGuardar.setOpaque(false);
		btnGuardar.setFocusable(false);
		btnGuardar.setFocusTraversalKeysEnabled(false);
		btnGuardar.setFocusPainted(false);
		btnGuardar.setDefaultCapable(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setBorderPainted(false);
		btnGuardar.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
		btnGuardar.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
		btnGuardar.setIcon(new ImageIcon("./imgs/save-48.png"));
		btnGuardar.setBounds(608, 356, 95, 84);
		panelNuevasCaracteristicas.add(btnGuardar);
		
		comboBoxTipos = new JComboBox();
		try {
			comboBoxTipos.setModel(new DefaultComboBoxModel(Sistema.getListaTipo()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comboBoxTipos.setBounds(102, 406, 127, 19);
		panelNuevasCaracteristicas.add(comboBoxTipos);
		
		rdbtnRaza = new JRadioButton(" Raza");
		rdbtnRaza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese la Nueva Raza");
			}
		});
		rdbtnRaza.setFont(new Font("Khmer UI", Font.BOLD, 19));
		rdbtnRaza.setForeground(new Color(210, 180, 140));
		rdbtnRaza.setContentAreaFilled(false);
		rdbtnRaza.setBounds(6, 406, 87, 23);
		grupoAgregarNuevo.add(rdbtnRaza);
		panelNuevasCaracteristicas.add(rdbtnRaza);
		
		textFieldNuevoEstado = new JTextField();
		textFieldNuevoEstado.setText("Ingrese el Nuevo Estado");
		textFieldNuevoEstado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textFieldNuevoEstado.setText(null);
			}
		});
		textFieldNuevoEstado.setBounds(357, 402, 241, 23);
		panelNuevasCaracteristicas.add(textFieldNuevoEstado);
		textFieldNuevoEstado.setColumns(10);
		
		rdbtnNuevoColorDe = new JRadioButton("Color de Pelo");
		rdbtnNuevoColorDe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese el Nuevo Color de Pelo");
			}
		});
		rdbtnNuevoColorDe.setForeground(new Color(210, 180, 140));
		rdbtnNuevoColorDe.setFont(new Font("Khmer UI", Font.BOLD, 19));
		rdbtnNuevoColorDe.setContentAreaFilled(false);
		rdbtnNuevoColorDe.setBounds(6, 358, 247, 23);
		grupoAgregarNuevo.add(rdbtnNuevoColorDe);
		panelNuevasCaracteristicas.add(rdbtnNuevoColorDe);
		
		rdbtnNuevoTipo = new JRadioButton("Tipo de Mascota");
		rdbtnNuevoTipo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese el Nuevo Tipo de Mascota");
			}
		});
		rdbtnNuevoTipo.setForeground(new Color(210, 180, 140));
		rdbtnNuevoTipo.setFont(new Font("Khmer UI", Font.BOLD, 19));
		rdbtnNuevoTipo.setContentAreaFilled(false);
		rdbtnNuevoTipo.setBounds(6, 271, 247, 19);
		grupoAgregarNuevo.add(rdbtnNuevoTipo);
		panelNuevasCaracteristicas.add(rdbtnNuevoTipo);
		
		rdbtnNuevoColorOjos = new JRadioButton("Color de Ojos");
		rdbtnNuevoColorOjos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese el Nuevo Color de Ojos");
				
			}
		});
		rdbtnNuevoColorOjos.setForeground(new Color(210, 180, 140));
		rdbtnNuevoColorOjos.setFont(new Font("Khmer UI", Font.BOLD, 19));
		rdbtnNuevoColorOjos.setContentAreaFilled(false);
		rdbtnNuevoColorOjos.setBounds(6, 314, 247, 23);
		grupoAgregarNuevo.add(rdbtnNuevoColorOjos);
		panelNuevasCaracteristicas.add(rdbtnNuevoColorOjos);
		
		rdbtnNuevoEstado = new JRadioButton(" Estado");
		rdbtnNuevoEstado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldNuevoEstado.removeAll();
				textFieldNuevoEstado.setText("Ingrese el Nuevo Estado");
			}
		});
		rdbtnNuevoEstado.setSelected(true);
		rdbtnNuevoEstado.setForeground(new Color(210, 180, 140));
		rdbtnNuevoEstado.setFont(new Font("Khmer UI", Font.BOLD, 19));
		rdbtnNuevoEstado.setContentAreaFilled(false);
		rdbtnNuevoEstado.setBounds(6, 229, 247, 23);
		grupoAgregarNuevo.add(rdbtnNuevoEstado);
		panelNuevasCaracteristicas.add(rdbtnNuevoEstado);
		
		JLabel lblNuevasCaractersticas = new JLabel("Nuevas Caracter\u00EDsticas");
		lblNuevasCaractersticas.setForeground(new Color(210, 180, 140));
		lblNuevasCaractersticas.setFont(new Font("Khmer UI", Font.BOLD, 35));
		lblNuevasCaractersticas.setBounds(10, 129, 379, 93);
		panelNuevasCaracteristicas.add(lblNuevasCaractersticas);
		
		btnQuitarDeLista = new JButton("Quitar de Lista Negra");
		btnQuitarDeLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNuevasCaracteristicas.setVisible(false);
				panelQuitarDeListaNegra.setVisible(true);
				for(int i:ListaNegra.getListaNegra()){
					
					
				}
				System.out.println(ListaNegra.getListaNegra().size());
			}
		});
		btnQuitarDeLista.setBounds(6, 11, 89, 67);
		panelNuevasCaracteristicas.add(btnQuitarDeLista);
		
		JLabel labelIcono = new JLabel("");
		labelIcono.setBounds(130, 0, 552, 135);

        labelIcono.setIcon(new ImageIcon("./imgs/Logo.png"));
        
		panelNuevasCaracteristicas.add(labelIcono);
		
		panelQuitarDeListaNegra = new JPanel();
		panelQuitarDeListaNegra.setBackground(new Color(99,84, 65));
		contentPane.add(panelQuitarDeListaNegra, "name_15768002466605");
		panelQuitarDeListaNegra.setLayout(null);
		
		btnAgregarNuevasCaracteristicas = new JButton("Agregar Nuevas Caracteristicas");
		btnAgregarNuevasCaracteristicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelNuevasCaracteristicas.setVisible(true);
				panelQuitarDeListaNegra.setVisible(false);
			}
		});
		btnAgregarNuevasCaracteristicas.setBounds(6, 11, 89, 67);
		panelQuitarDeListaNegra.add(btnAgregarNuevasCaracteristicas);
		
		JScrollPane scrollPaneQuitarListaNegra = new JScrollPane();
		scrollPaneQuitarListaNegra.setAutoscrolls(true);
		scrollPaneQuitarListaNegra.setBackground(new Color(210, 180, 140));
		scrollPaneQuitarListaNegra.setBounds(6, 218, 523, 229);
		panelQuitarDeListaNegra.add(scrollPaneQuitarListaNegra);
		
		String[] columna = {"ID","Usuario","Calificación","Motivo"};
		String[] datos = new String[4];
		DefaultTableModel tableModel = new DefaultTableModel(columna,0);
		tableQuitarListaNegra = new JTable(tableModel);
		Sistema.cargarTableUsuariosEnListaNegra(columna,datos,tableModel);
		tableQuitarListaNegra.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnQuitarDeLista_1.setEnabled(true);
			}
			});
			
		scrollPaneQuitarListaNegra.setViewportView(tableQuitarListaNegra);
		
		lblQuitarDeLista = new JLabel("Quitar de Lista Negra.");
		lblQuitarDeLista.setForeground(new Color(210, 180, 140));
		lblQuitarDeLista.setFont(new Font("Khmer UI", Font.BOLD, 35));
		lblQuitarDeLista.setBounds(10, 129, 379, 93);
		
		panelQuitarDeListaNegra.add(lblQuitarDeLista);
		
		labelIcono2 = new JLabel("");
		labelIcono2.setBounds(130, 0, 552, 135);
        labelIcono2.setIcon(new ImageIcon("./imgs/Logo.png"));
		panelQuitarDeListaNegra.add(labelIcono2);
		
		btnQuitarDeLista_1 = new JButton("Quitar de Lista Negra");
		btnQuitarDeLista_1 .setEnabled(false);
		btnQuitarDeLista_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int fila= tableQuitarListaNegra.getSelectedRow();
				int columna= tableQuitarListaNegra.getSelectedColumn();
				
				
				//Sistema.leerColorDePelo();
				try{
					
					int idUsuario = Integer.parseInt((String) tableQuitarListaNegra.getValueAt(fila,0));
					ListaNegra.quitarDeListaNegra(SistemasUsuarios.getNombreUsuario(idUsuario));
					ListaNegra.borrardeListaNegra(idUsuario);
					tableModel.removeRow(fila);
					btnQuitarDeLista_1.setEnabled(false);
				}catch(ArrayIndexOutOfBoundsException e){
						JOptionPane.showMessageDialog(null,"No hay Usuarios en Lista Negra");}	
				

		}
				
		});
		btnQuitarDeLista_1.setBounds(580, 369, 102, 82);
		panelQuitarDeListaNegra.add(btnQuitarDeLista_1);
	}
}
