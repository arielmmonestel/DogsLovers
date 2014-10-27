package acceso;

import acceso.*;
import logicaDeNegocios.*;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.Cursor;

import javax.swing.DebugGraphics;
import javax.swing.JFrame;

import java.awt.CardLayout;
import java.io.IOException;
import java.util.Calendar;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import logicaDeNegocios.*;
import sun.util.logging.resources.logging;

import javax.swing.SpinnerDateModel;

import java.io.File;
import java.util.Date;

public class VentanaPrincipal {

	private JFrame VentanaPrincipal;
	private JPanel panelPrincipal;
	private JPanel panelAgregarMascota;
	private JPanel panelAgregarCasaCuna;
	
    private JTextField textFieldNombreMascota;
    private JTextField textFieldNumChip;
    private ButtonGroup estadoMascota = new ButtonGroup() ;
    private  ButtonGroup monedaDePago = new ButtonGroup() ;
    private JRadioButton rdbtnColones;
    private JRadioButton radioButtonDolares;
    private JLabel lblMonto;
    private JComboBox comboBoxRazaMascota;
    private JRadioButton rdbtnEncontrada;
    private JRadioButton rdbtnPerdida;
    private JComboBox comboBoxCanton;
    private JButton buttonGuardar;
    private JComboBox comboBoxTipoMascota;
    private JEditorPane editorPaneNotas;
    private static String estado = "PERDIDA";
    private static String tipo;
    private static String nombre;
    private static String raza;
    private static String chip;
    private static String colorDePelo;
    private static String colorDeOjos;
    private static String foto;
    private static String lugarVisto;
    private static String nota;
    private static String recompensa;
    private static int idEncargado;
    private static Object diaSuceso;
	private JLabel labelDL;
	private JSpinner spinnerFechaSuceso;
	private JTextField textFieldMontoRecompensa;
	private JComboBox comboBoxProvincia;
	private static int IDUsuarioActivo = -1; //Para iniciar en un valor distinto a los posibles
	private File archivoSeleccionado;
	private JLabel lblFotoMascota;
	
	
	
	/**
	 * Launch the application.
	 */
	
	public static void setIDUsuarioActivo(int id){
		IDUsuarioActivo = id;
	}
	
	public static int getIDUsuarioActivo(){
		return IDUsuarioActivo;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.VentanaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		VentanaPrincipal = new JFrame();
		VentanaPrincipal.setBounds(0, 0, 1435, 735);
		VentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		VentanaPrincipal.getContentPane().setLayout(new CardLayout(0, 0));
		
		panelPrincipal = new JPanel();
		VentanaPrincipal.getContentPane().add(panelPrincipal, "name_27977974667427");
		panelPrincipal.setLayout(null);
		JButton btnCerrarSesin = new JButton("");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal.dispose();
				Loggin loguearse = new Loggin();
				loguearse.setVisible(true);
			}
		});
		btnCerrarSesin.setToolTipText("Cerrar Sesi\u00F3n");
		btnCerrarSesin.setFocusable(false);
		btnCerrarSesin.setFocusTraversalKeysEnabled(false);
		btnCerrarSesin.setFocusPainted(false);
		btnCerrarSesin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCerrarSesin.setDefaultCapable(false);
		btnCerrarSesin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCerrarSesin.setIconTextGap(-3);
		btnCerrarSesin.setIcon(new ImageIcon("./imgs/sign-out-20.png"));
		btnCerrarSesin.setPressedIcon(new ImageIcon("./imgs/sign-out-16.png"));
		btnCerrarSesin.setRolloverIcon(new ImageIcon("./imgs/sign-out-24.png"));
		btnCerrarSesin.setContentAreaFilled(false);
		btnCerrarSesin.setBorderPainted(false);
		btnCerrarSesin.setBorder(null);
		btnCerrarSesin.setBounds(1322, 0, 40, 34);
		panelPrincipal.add(btnCerrarSesin);
		panelPrincipal.setVisible(true);
		
		
		panelAgregarMascota = new JPanel();
		VentanaPrincipal.getContentPane().add(panelAgregarMascota, "name_27990074221032");
		panelAgregarMascota.setLayout(null);
		panelAgregarMascota.setVisible(false);
		
		/*Inicio Codigo del Panel Agregar Mascota*/
		
		lblFotoMascota = new JLabel("");
		lblFotoMascota.setBounds(1130, 60, 142, 141);
		panelAgregarMascota.add(lblFotoMascota);
		
		textFieldMontoRecompensa = new JTextField();
		textFieldMontoRecompensa.setBounds(1017, 347, 86, 20);
		panelAgregarMascota.add(textFieldMontoRecompensa);
		textFieldMontoRecompensa.setColumns(10);
		
		JLabel lblImagenDeLa = new JLabel("Imagen de la Mascota");
		lblImagenDeLa.setForeground(Color.WHITE);
		lblImagenDeLa.setFont(new Font("Batang", Font.BOLD, 19));
		lblImagenDeLa.setBounds(707, 178, 208, 23);
		panelAgregarMascota.add(lblImagenDeLa);
		
		JButton btnAgregarFoto = new JButton("");
		btnAgregarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser elegir = new JFileChooser();
				int resultadoAbrir = elegir.showOpenDialog(VentanaPrincipal.getContentPane());
				archivoSeleccionado = elegir.getSelectedFile();
				if (resultadoAbrir == JFileChooser.APPROVE_OPTION) {
					String pathArchivo = archivoSeleccionado.getAbsolutePath(); 	// Obtiene path del archivo
		            String nombre = 	 archivoSeleccionado.getName(); 			// Obtiene nombre del archivo           
		            System.out.println("El nombre del archivo es: "+ nombre);
		            System.out.println("El path del archivo es: "+ pathArchivo);
		            if (archivoSeleccionado != null) {
		            	try {
							BufferedImage imagenMostrada = ImageIO.read(archivoSeleccionado);
							Dimension recuadro = lblFotoMascota.getSize();
							lblFotoMascota.setIcon(new ImageIcon(imagenMostrada.getScaledInstance(recuadro.width, recuadro.height, Image.SCALE_AREA_AVERAGING)));
						} catch (IOException ex) {
							JOptionPane.showMessageDialog(VentanaPrincipal.getContentPane(), ex.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
		            }
		            foto = pathArchivo;
				}
				
			}
		});
		btnAgregarFoto.setToolTipText("Agregar imagen de la mascota");
		btnAgregarFoto.setPressedIcon(new ImageIcon("./imgs/addPicture-24.png"));
		btnAgregarFoto.setRolloverIcon(new ImageIcon("./imgs/addPicture-48.png"));
		btnAgregarFoto.setRequestFocusEnabled(false);
		btnAgregarFoto.setOpaque(false);
		btnAgregarFoto.setFocusable(false);
		btnAgregarFoto.setFocusTraversalKeysEnabled(false);
		btnAgregarFoto.setFocusPainted(false);
		btnAgregarFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAgregarFoto.setBorderPainted(false);
		btnAgregarFoto.setContentAreaFilled(false);
		btnAgregarFoto.setIcon(new ImageIcon("./imgs/addPicture-32.png"));
		btnAgregarFoto.setBounds(902, 156, 75, 65);
		panelAgregarMascota.add(btnAgregarFoto);
		foto = null;
		
		labelDL = new JLabel("");
		labelDL.setIcon(new ImageIcon("./imgs/Logo.png"));
		labelDL.setBounds(375, 0, 552, 135);
		panelAgregarMascota.add(labelDL);
		
		final JCheckBox chckbxRecompensa = new JCheckBox("Recompensa");
        chckbxRecompensa.setForeground(Color.WHITE);
        chckbxRecompensa.setFont(new Font("Batang", Font.BOLD, 19));
        chckbxRecompensa.setContentAreaFilled(false);
        chckbxRecompensa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            if(!chckbxRecompensa.isSelected()){
            
                rdbtnColones.setEnabled(false);
                radioButtonDolares.setEnabled(false);
                lblMonto.setEnabled(false);
                textFieldMontoRecompensa.setEnabled(false);
                lblMonto.setVisible(false);
            
                        
            }else{
            rdbtnColones.setEnabled(true);
            radioButtonDolares.setEnabled(true);
            lblMonto.setEnabled(true);
            lblMonto.setVisible(true);
            textFieldMontoRecompensa.setEnabled(true);
            }
            } 
        });
        
        buttonGuardar = new JButton("");
        buttonGuardar.setToolTipText("Guardar en el Registro de Mascota");
        buttonGuardar.setBorder(null);
        buttonGuardar.setFocusable(false);
        buttonGuardar.setFocusTraversalKeysEnabled(false);
        buttonGuardar.setFocusPainted(false);
        buttonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            	nombre = textFieldNombreMascota.getText();
            	chip = textFieldNumChip.getText();
            	
            	nota = editorPaneNotas.getText();
            	
            	recompensa = textFieldMontoRecompensa.getText();
            	idEncargado = IDUsuarioActivo;
            	
            	diaSuceso =  spinnerFechaSuceso.getValue();
            	tipo = (String) comboBoxTipoMascota.getSelectedItem();
            	raza = (String) comboBoxRazaMascota.getSelectedItem();
            	lugarVisto = (String)comboBoxCanton.getSelectedItem() + ", " + (String)comboBoxProvincia.getSelectedItem();
            	recompensa = textFieldMontoRecompensa.getText();
            	
            	Mascota NuevaMascota = new Mascota(estado, tipo, raza, nombre, chip, colorDePelo, colorDeOjos, foto, lugarVisto, nota, diaSuceso, recompensa, idEncargado);
            			try {
							NuevaMascota.leerMascota();
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
            	Mascota.getListaDeMascotas().add(NuevaMascota);
            	NuevaMascota.GuardarMascota(Mascota.getListaDeMascotas());
            	JOptionPane.showMessageDialog(panelAgregarMascota, "Mascota registrada correctamente");
            }
        });
        
        JButton buttonCancelar = new JButton("");
        buttonCancelar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelPrincipal.setVisible(true);
				panelAgregarCasaCuna.setVisible(false);
				panelAgregarMascota.setVisible(false);
        	}
        });
        buttonCancelar.setToolTipText("Cancelar Registro de Mascota");
        buttonCancelar.setPressedIcon(new ImageIcon("./imgs/Cancel-32.png"));
        buttonCancelar.setRolloverIcon(new ImageIcon("./imgs/Cancel-64.png"));
        buttonCancelar.setIcon(new ImageIcon("./imgs/Cancel-48.png"));
        buttonCancelar.setOpaque(false);
        buttonCancelar.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonCancelar.setFocusable(false);
        buttonCancelar.setFocusTraversalKeysEnabled(false);
        buttonCancelar.setFocusPainted(false);
        buttonCancelar.setDefaultCapable(false);
        buttonCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonCancelar.setContentAreaFilled(false);
        buttonCancelar.setBorderPainted(false);
        buttonCancelar.setBorder(null);
        buttonCancelar.setBounds(1232, 534, 109, 78);
        panelAgregarMascota.add(buttonCancelar);
        buttonGuardar.setDefaultCapable(false);
        buttonGuardar.setContentAreaFilled(false);
        buttonGuardar.setBorderPainted(false);
        buttonGuardar.setIconTextGap(-3);
        buttonGuardar.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonGuardar.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
        buttonGuardar.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
        buttonGuardar.setIcon(new ImageIcon("./imgs/save-48.png"));
        buttonGuardar.setBounds(1108, 534, 109, 78);
        panelAgregarMascota.add(buttonGuardar);
        
        comboBoxCanton = new JComboBox();
        comboBoxCanton.setBounds(1173, 294, 168, 20);
        comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Escazú","Desamparados","Puriscal","Tarrazú","Aserrí","Mora","Goicoechea","Santa Ana","Alajuelita",
                                                                            "Coronado","Acosta","Tibás","Moravia","Montes de Oca","Turrubares",
                                                                            "Dota","Curridabat","Perez Zeledón","León Cortés"}))    ;           
        
        panelAgregarMascota.add(comboBoxCanton);
        
        comboBoxProvincia = new JComboBox();
        comboBoxProvincia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(comboBoxProvincia.getSelectedIndex()==0){
                    comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Escazú","Desamparados","Puriscal","Tarrazú","Aserrí","Mora","Goicoechea","Santa Ana","Alajuelita",
                            "Coronado","Acosta","Tibás","Moravia","Montes de Oca","Turrubares",
                            "Dota","Curridabat","Perez Zeledón","León Cortés"}))    ;           

                }if(comboBoxProvincia.getSelectedIndex()==1){
                    

                    comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","San Ramón","Grecia","San Mateo","Atenas","Naranjo",
                            "Palmares","Poás","Orotina","San Carlos","Alfaro Ruíz","Valverde Vega",
                            "Upala","Los Chiles","Guatuzo"}))   ;
                }if(comboBoxProvincia.getSelectedIndex()==2){
                    comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Paraiso","La Unión","Jimenez","Turrialba","Alvarado","Oreamuno","El Guarco"}))    ;
                }
                if(comboBoxProvincia.getSelectedIndex()==3){
                    comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Barva","Santo Domingo","Santa Barbara","San Rafael","San Isidro","Belén","Flores","San Pablo","Sarapiqui"}))  ;
                }
                if(comboBoxProvincia.getSelectedIndex()==4){
                    comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Esparza","Buenos Aires","Montes de Oro","Osa","Aguirre","Golfito","Coto Brus","Parrita","Corredores","Garabito"}))    ;
                }
                if(comboBoxProvincia.getSelectedIndex()==5){
                    comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Pococí","Siquirres","Talamanca","Matina","Guacimo"})) ;
                }
                if(comboBoxProvincia.getSelectedIndex()==6){
                    comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Liberia","Nicoya","Santa Cruz","Bagaces","Carrillo","Cañas","Abangares","Tilaran","Nandayure","La Cruz","Hojancha"}))   ;
                }
            }
        });
        comboBoxProvincia.setModel(new DefaultComboBoxModel(new String[] {"San Jose", "Alajuela", "Cartago", "Heredia", "Puntarenas", "Limon", "Guanacaste"}));
        comboBoxProvincia.setBounds(995, 294, 168, 19);
        panelAgregarMascota.add(comboBoxProvincia);
        
        
        spinnerFechaSuceso = new JSpinner();
        spinnerFechaSuceso.setToolTipText("Fecha");
        spinnerFechaSuceso.setModel(new SpinnerDateModel(new Date(1411624800000L), new Date(946706400000L), new Date(1419487200000L), Calendar.DAY_OF_YEAR));
        spinnerFechaSuceso.setBounds(996, 237, 142, 23);
        panelAgregarMascota.add(spinnerFechaSuceso);

        lugarVisto = comboBoxCanton.getSelectedItem().toString() + ", " + comboBoxProvincia.getSelectedItem().toString();
        
        JSpinner spinner = new JSpinner();
        spinner.setToolTipText("D\u00EDa");
        spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
        spinner.setBounds(995, 237, 39, 23);
        panelAgregarMascota.add(spinner);
        
        JSpinner spinnerAnioPerdida = new JSpinner();
        spinnerAnioPerdida.setToolTipText("A\u00F1o");
        spinnerAnioPerdida.setBounds(1234, 236, 61, 23);
        spinnerAnioPerdida.setModel(new SpinnerNumberModel(2014.0, 1990.0, 2014.0, 1.0));
        panelAgregarMascota.add(spinnerAnioPerdida);
        
        JComboBox comboBoxMesPerdida = new JComboBox();
        comboBoxMesPerdida.setToolTipText("Mes");
        comboBoxMesPerdida.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"}));
        comboBoxMesPerdida.setBounds(1054, 236, 163, 23);
        panelAgregarMascota.add(comboBoxMesPerdida);
        
        
        textFieldMontoRecompensa = new JTextField();
        textFieldMontoRecompensa.setColumns(10);
        textFieldMontoRecompensa.setBounds(1016, 347, 127, 23);
        panelAgregarMascota.add(textFieldMontoRecompensa);

        
        lblMonto = new JLabel("Monto");
        lblMonto.setForeground(Color.WHITE);
        lblMonto.setFont(new Font("Batang", Font.BOLD, 19));
        lblMonto.setBounds(944, 351, 75, 14);
        panelAgregarMascota.add(lblMonto);
        chckbxRecompensa.setBounds(707, 347, 155, 23);
        chckbxRecompensa.setSelected(true);
        panelAgregarMascota.add(chckbxRecompensa);
        
        JLabel lblsiAplica_1 = new JLabel("(Si Aplica)");
        lblsiAplica_1.setBounds(186, 401, 61, 14);
        panelAgregarMascota.add(lblsiAplica_1);
        
        final JLabel lblsiAplica = new JLabel("(Si Aplica)");
        lblsiAplica.setBounds(239, 340, 61, 14);
        panelAgregarMascota.add(lblsiAplica);
        
        JLabel lblEstado = new JLabel("Estado de la Mascota");
        lblEstado.setForeground(Color.WHITE);
        lblEstado.setFont(new Font("Batang", Font.BOLD, 19));
        lblEstado.setBounds(32, 134, 214, 23);
        panelAgregarMascota.add(lblEstado);
        
        JLabel lblTipoDeMascota = new JLabel("Tipo de Mascota");
        lblTipoDeMascota.setForeground(Color.WHITE);
        lblTipoDeMascota.setFont(new Font("Batang", Font.BOLD, 19));
        lblTipoDeMascota.setBounds(32, 207, 186, 23);
        panelAgregarMascota.add(lblTipoDeMascota);
        
        JLabel lblRaza = new JLabel("Raza");
        lblRaza.setForeground(Color.WHITE);
        lblRaza.setFont(new Font("Batang", Font.BOLD, 19));
        lblRaza.setBounds(32, 271, 186, 23);
        panelAgregarMascota.add(lblRaza);
        
        final JLabel lblNombreDeLa = new JLabel("Nombre de la Mascota");
        lblNombreDeLa.setForeground(Color.WHITE);
        lblNombreDeLa.setFont(new Font("Batang", Font.BOLD, 19));
        lblNombreDeLa.setBounds(33, 333, 214, 23);
        panelAgregarMascota.add(lblNombreDeLa);
        
        final JLabel lblNumeroDeChip = new JLabel("N\u00FAmero de Chip");
        lblNumeroDeChip.setForeground(Color.WHITE);
        lblNumeroDeChip.setFont(new Font("Batang", Font.BOLD, 19));
        lblNumeroDeChip.setBounds(33, 397, 225, 23);
        panelAgregarMascota.add(lblNumeroDeChip);
        
        JLabel lblColorDelPelaje = new JLabel("Color del Pelaje");
        lblColorDelPelaje.setForeground(Color.WHITE);
        lblColorDelPelaje.setFont(new Font("Batang", Font.BOLD, 19));
        lblColorDelPelaje.setBounds(32, 464, 186, 23);
        panelAgregarMascota.add(lblColorDelPelaje);
        
        JLabel lblColorDeOjos = new JLabel("Color de Ojos");
        lblColorDeOjos.setForeground(Color.WHITE);
        lblColorDeOjos.setFont(new Font("Batang", Font.BOLD, 19));
        lblColorDeOjos.setBounds(32, 527, 186, 23);
        panelAgregarMascota.add(lblColorDeOjos);
        
        final JLabel lblSitioDeHallazgoperdida = new JLabel("Sitio de P\u00E9rdida");
        lblSitioDeHallazgoperdida.setForeground(Color.WHITE);
        lblSitioDeHallazgoperdida.setFont(new Font("Batang", Font.BOLD, 19));
        lblSitioDeHallazgoperdida.setBounds(707, 290, 177, 23);
        panelAgregarMascota.add(lblSitioDeHallazgoperdida);
        
        final JLabel lblFechaDeHallazgoperdida = new JLabel("Fecha de P\u00E9rdida");
        lblFechaDeHallazgoperdida.setForeground(Color.WHITE);
        lblFechaDeHallazgoperdida.setFont(new Font("Batang", Font.BOLD, 19));
        lblFechaDeHallazgoperdida.setBounds(707, 237, 163, 23);
        panelAgregarMascota.add(lblFechaDeHallazgoperdida);
        
        JLabel lblNotas = new JLabel("Notas");
        lblNotas.setForeground(Color.WHITE);
        lblNotas.setFont(new Font("Batang", Font.BOLD, 19));
        lblNotas.setBounds(707, 389, 384, 28);
        panelAgregarMascota.add(lblNotas);
        
        rdbtnPerdida = new JRadioButton("Perdida");
        rdbtnPerdida.setFont(new Font("Batang", Font.BOLD, 13));
        rdbtnPerdida.setForeground(Color.WHITE);
        rdbtnPerdida.setContentAreaFilled(false);
        rdbtnPerdida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (rdbtnPerdida.isSelected()){
                    lblsiAplica.setVisible(true);
                    textFieldNombreMascota.setEnabled(true);
                    lblNombreDeLa.setEnabled(true);
                    textFieldNumChip.setEnabled(true);
                    lblNumeroDeChip.setEnabled(true);
                    textFieldNombreMascota.setEnabled(true);
                    lblFechaDeHallazgoperdida.setText("Fecha de Pérdida");
                    lblSitioDeHallazgoperdida.setText("Sitio de Pérdida");
                    radioButtonDolares.setVisible(true);
                    radioButtonDolares.setEnabled(true);
                    rdbtnColones.setVisible(true);
                    rdbtnColones.setEnabled(true);
                    chckbxRecompensa.setVisible(true);
                    chckbxRecompensa.setEnabled(true);
                    lblMonto.setEnabled(true);
                    lblMonto.setVisible(true);
                    textFieldMontoRecompensa.setEnabled(true);
                    textFieldMontoRecompensa.setVisible(true);
                    estado = "PERDIDA";
                    
                }
                
                
            }
        });
        rdbtnPerdida.setBounds(316, 134, 109, 23);
        rdbtnPerdida.setSelected(true);
        estadoMascota.add(rdbtnPerdida);
        panelAgregarMascota.add(rdbtnPerdida);
        
        rdbtnEncontrada = new JRadioButton("Encontrada");
        rdbtnEncontrada.setFont(new Font("Batang", Font.BOLD, 13));
        rdbtnEncontrada.setForeground(Color.WHITE);
        rdbtnEncontrada.setContentAreaFilled(false);
        rdbtnEncontrada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (rdbtnEncontrada.isSelected()){
                    lblsiAplica.setVisible(false);
                    lblFechaDeHallazgoperdida.setText("Fecha de Hallazgo");
                    lblSitioDeHallazgoperdida.setText("Sitio de Hallazgo");
                    radioButtonDolares.setVisible(false);
                    radioButtonDolares.setEnabled(false);
                    rdbtnColones.setVisible(false);
                    rdbtnColones.setEnabled(false);
                    chckbxRecompensa.setVisible(false);
                    chckbxRecompensa.setEnabled(false);
                    lblMonto.setEnabled(false);
                    lblMonto.setVisible(false);
                    textFieldMontoRecompensa.setEnabled(false);
                    textFieldMontoRecompensa.setVisible(false);

                    /* Cambiar aquí el estado de la mascota a Encontrada*/
                    estado = "ENCONTRADA";


                    
                    
                    
                    
                }else{
                    textFieldNombreMascota.setEnabled(true);
                    lblNombreDeLa.setEnabled(true);
                    textFieldNumChip.setEnabled(true);
                    lblNumeroDeChip.setEnabled(true);                   
                    textFieldNombreMascota.setEnabled(true);
                    lblFechaDeHallazgoperdida.setText("Fecha de Pérdida");
                    lblSitioDeHallazgoperdida.setText("Sitio de Pérdida");
                    estado = "PERDIDA";
                    
                }
            }
        });
        rdbtnEncontrada.setBounds(444, 134, 109, 23);
        estadoMascota.add(rdbtnEncontrada);
        panelAgregarMascota.add(rdbtnEncontrada);
        
         comboBoxTipoMascota = new JComboBox();
         comboBoxTipoMascota.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(comboBoxTipoMascota.getSelectedIndex() == 0){
                    comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Airedale Terrier" ,"Akita inu" ,"Alaskan malamute", "American Stafford","Shire Terrier","Basenji",
                            "Basset Hound","Beagle","Bichón Maltés","Boxer","Braco de Weimar","Bull Terrier","Bulldog francés","Bulldog inglés","Caniche","Carlino","Chihuahua","Chow-chow","Cocker Spaniel Americano","Cocker Spaniel inglés",
                            "Crestado chino","Dálmata","Dobermann","Dogo Aleman","Dogo Argentino","Golden retriever","French Poodle",
                            "Labrador Retrevier","Mastín Español","Mastín Napolitano","Pastor Alemán","Pequinés",
                            "Pinscher Pomerania","Rottweiler","Samoyedo","San Bernardo","Schnauzer","Setter inglés",
                            "Setter irlandés","Shar Pei","Shih Tzu","Siberian Husky"})) ;   
                    comboBoxRazaMascota.setVisible(true);
                    comboBoxRazaMascota.setEnabled(true);  

                }
                if (comboBoxTipoMascota.getSelectedIndex() == 1){
                    comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Abisinio","Aleman de pelo largo","Angora turco","American curl","American shorthair","American wirehair","Aphrodites giant","Australian mist",
                      "Azul ruso","Balinés","Bengalí","Bogtail Japonés","Bosque de noruega","British shorthair","Burmilla","Burmés","Cornish rex","Cymric",
                      "Chartreux","Devon rex","Don sphynx","Gato bombay","Gato brasileño","Ceylon","Europeo","Exótico","Gato habana","Korat","Manx","Munchkin","Ocicat","Ojos azules","Oriental","Oriental de pelo largo","Persa","Siamés","Siberiano","Singapura","Somalí","Tonkinés","LaPerm","Maine coon","Mau egipcio","Peterbald",
                      "Pixiebob","Ragdoll","Sagrado de birmania","Scottish fold","Selkirk Rex","Sphynx","Van turco"}));
                    comboBoxRazaMascota.setVisible(true);
                    comboBoxRazaMascota.setEnabled(true);
                    
                }
                if (comboBoxTipoMascota.getSelectedIndex() == 2){
                    comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Canario","Cotorra","Angaporis(Pájaros de Amor)","Rosella","Loro de Bolsillo"
                            ,"Loro","Turaco","Cacatua","Guacamayo","Ninfa","Pato","Gallina"})); 
                    comboBoxRazaMascota.setVisible(true);
                    comboBoxRazaMascota.setEnabled(true);
                    
                }
                if (comboBoxTipoMascota.getSelectedIndex() == 3){
                    comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Ardilla Coreana",
                            "Cobaya","Conejos","Erizo","Hamster","Jerbo","Rata","Ratón"}));
                    comboBoxRazaMascota.setVisible(true);
                    comboBoxRazaMascota.setEnabled(true);
                    
                }
                if (comboBoxTipoMascota.getSelectedIndex() == 4){
                    
                    comboBoxRazaMascota.setEnabled(false);
                    
                }

                }

         	}
         );
        comboBoxTipoMascota.setBounds(320, 208, 233, 20);
        comboBoxTipoMascota.setModel(new DefaultComboBoxModel(new String[] {"Canino", "Felino", "Ave", "Roedor", "Otro"}));
        panelAgregarMascota.add(comboBoxTipoMascota);
        
        comboBoxRazaMascota = new JComboBox();
        comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Airedale Terrier" ,"Akita inu" ,"Alaskan malamute", "American Stafford","Shire Terrier","Basenji",
                "Basset Hound","Beagle","Bichón Maltés","Boxer","Braco de Weimar","Bull Terrier","Bulldog francés","Bulldog inglés","Caniche","Carlino","Chihuahua","Chow-chow","Cocker Spaniel Americano","Cocker Spaniel inglés","Crestado chino","Dálmata","Dobermann","Dogo Aleman","Dogo Argentino","Golden retriever",
                "Labrador Retrevier","Mastín Español","Mastín Napolitano","Pastor Alemán","Pequinés",
                "Pinscher Pomerania","Rottweiler","Samoyedo","San Bernardo","Schnauzer","Setter inglés",
                "Setter irlandés","Shar Pei","Shih Tzu","Siberian Husky"})) ; 
        
        comboBoxRazaMascota.setBounds(320, 272, 233, 20);
        panelAgregarMascota.add(comboBoxRazaMascota);
        
        textFieldNombreMascota = new JTextField();
        textFieldNombreMascota.setBounds(321, 333, 233, 23);
        panelAgregarMascota.add(textFieldNombreMascota);
        textFieldNombreMascota.setColumns(10);
        
        textFieldNumChip = new JTextField();
        textFieldNumChip.setBounds(321, 397, 233, 23);
        textFieldNumChip.setColumns(10);
        panelAgregarMascota.add(textFieldNumChip);
        
        
        JComboBox comboBoxColorPelaje = new JComboBox();
        comboBoxColorPelaje.setModel(new DefaultComboBoxModel(new String[] {"Negro", "Manchado", "Dos Tonalidades", "Amarillo", "Cafe", "Blanco", "Gris"}));
        comboBoxColorPelaje.setBounds(320, 465, 233, 20);
        panelAgregarMascota.add(comboBoxColorPelaje);
        colorDePelo = (comboBoxColorPelaje.getSelectedItem()).toString();
        
        final JComboBox comboBoxColorOjos = new JComboBox();
        comboBoxColorOjos.setModel(new DefaultComboBoxModel(new String[] {"Cafes", "Azules", "Negros", "Grises", "Amarillos", "Verdes", "Celestes", "Dos Tonos "}));
        comboBoxColorOjos.setBounds(320, 528, 233, 20);
        panelAgregarMascota.add(comboBoxColorOjos);
        colorDeOjos = (comboBoxColorOjos.getSelectedItem()).toString();
        
        rdbtnColones = new JRadioButton("\u20A1");
        rdbtnColones.setForeground(Color.WHITE);
        rdbtnColones.setContentAreaFilled(false);
        rdbtnColones.setSelected(true);
        rdbtnColones.setBounds(847, 347, 39, 23);
        monedaDePago.add(rdbtnColones);
        panelAgregarMascota.add(rdbtnColones);
        
        radioButtonDolares = new JRadioButton("$");
        radioButtonDolares.setForeground(Color.WHITE);
        radioButtonDolares.setContentAreaFilled(false);
        radioButtonDolares.setBounds(891, 347, 47, 23);
        monedaDePago.add(radioButtonDolares);
        panelAgregarMascota.add(radioButtonDolares);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(707, 428, 384, 184);
        panelAgregarMascota.add(scrollPane);
        
        editorPaneNotas = new JEditorPane();
        scrollPane.setViewportView(editorPaneNotas);
        
        JLabel labelFondo = new JLabel("");
        labelFondo.setOpaque(true);
        labelFondo.setFocusTraversalKeysEnabled(false);
        labelFondo.setForeground(Color.WHITE);
        labelFondo.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
        labelFondo.setBounds(0, 0, 2508, 1246);
        panelAgregarMascota.add(labelFondo);
        
		
		
		/*Codigo panel Mascota fin*/
	
		
		panelAgregarCasaCuna = new JPanel();
		VentanaPrincipal.getContentPane().add(panelAgregarCasaCuna, "name_28003406149630");
		panelAgregarCasaCuna.setLayout(null);
/*Inicio codigo casa Cuna*/
		buttonGuardar = new JButton("");
		buttonGuardar.setToolTipText("Guardar en el Registro del Mascota");
		buttonGuardar.setBorder(null);
		buttonGuardar.setFocusable(false);
		buttonGuardar.setFocusTraversalKeysEnabled(false);
		buttonGuardar.setFocusPainted(false);
		buttonGuardar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    }
		});
		
		JButton CancelarOperacion = new JButton("");
		CancelarOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(true);
				panelAgregarCasaCuna.setVisible(false);
				panelAgregarMascota.setVisible(false);
			}
		});
		
		JComboBox comboBoxTipoMascotaCC = new JComboBox();
		comboBoxTipoMascotaCC.setModel(new DefaultComboBoxModel(new String[] {"Canino", "Felino", "Ave", "Roedor", "Otro"}));
		comboBoxTipoMascotaCC.setBounds(404, 280, 203, 19);
		panelAgregarCasaCuna.add(comboBoxTipoMascotaCC);
		
		JLabel labelIcono = new JLabel("");
		labelIcono.setIcon(new ImageIcon("./imgs/Logo.png"));
		labelIcono.setBounds(378, 0, 552, 135);
		panelAgregarCasaCuna.add(labelIcono);
		CancelarOperacion.setToolTipText("Cancelar Registro de Mascota");
		CancelarOperacion.setPressedIcon(new ImageIcon("./imgs/Cancel-32.png"));
		CancelarOperacion.setRolloverIcon(new ImageIcon("./imgs/Cancel-64.png"));
		CancelarOperacion.setIcon(new ImageIcon("./imgs/Cancel-48.png"));
		CancelarOperacion.setOpaque(false);
		CancelarOperacion.setHorizontalTextPosition(SwingConstants.CENTER);
		CancelarOperacion.setFocusable(false);
		CancelarOperacion.setFocusTraversalKeysEnabled(false);
		CancelarOperacion.setFocusPainted(false);
		CancelarOperacion.setDefaultCapable(false);
		CancelarOperacion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		CancelarOperacion.setContentAreaFilled(false);
		CancelarOperacion.setBorderPainted(false);
		CancelarOperacion.setBorder(null);
		CancelarOperacion.setBounds(1155, 558, 109, 78);
		panelAgregarCasaCuna.add(CancelarOperacion);
		buttonGuardar.setDefaultCapable(false);
		buttonGuardar.setContentAreaFilled(false);
		buttonGuardar.setBorderPainted(false);
		buttonGuardar.setIconTextGap(-3);
		buttonGuardar.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonGuardar.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
		buttonGuardar.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
		buttonGuardar.setIcon(new ImageIcon("./imgs/save-48.png"));
		buttonGuardar.setBounds(1036, 558, 109, 78);
		panelAgregarCasaCuna.add(buttonGuardar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(749, 340, 399, 130);
		panelAgregarCasaCuna.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		final JCheckBox chckbxNoAlimentos = new JCheckBox("No");
		chckbxNoAlimentos.setForeground(Color.WHITE);
		chckbxNoAlimentos.setContentAreaFilled(false);
		chckbxNoAlimentos.setFont(new Font("Batang", Font.BOLD, 11));
		chckbxNoAlimentos.setBounds(1128, 242, 97, 23);
		panelAgregarCasaCuna.add(chckbxNoAlimentos);
	    chckbxNoAlimentos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(chckbxNoAlimentos.isSelected()){
                    chckbxNoAlimentos.setText("Sí");
                }
                else{
                    chckbxNoAlimentos.setText("No");
                }
            }
	    });
	    
		JLabel lblnecesitarDonacionesDe_1 = new JLabel("\u00BFNecesitar\u00E9 Donaciones de Alimentos?");
		lblnecesitarDonacionesDe_1.setForeground(Color.WHITE);
		lblnecesitarDonacionesDe_1.setFont(new Font("Batang", Font.BOLD, 19));
		lblnecesitarDonacionesDe_1.setBounds(749, 235, 373, 30);
		panelAgregarCasaCuna.add(lblnecesitarDonacionesDe_1);
		
		final JCheckBox chckbxNoMedicamentos = new JCheckBox("No");
		chckbxNoMedicamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNoMedicamentos.isSelected()){
					chckbxNoMedicamentos.setText("Sí");
				}
				else{
					chckbxNoMedicamentos.setText("No");
				}
			}
		});
		chckbxNoMedicamentos.setFont(new Font("Batang", Font.BOLD, 11));
		chckbxNoMedicamentos.setForeground(Color.WHITE);
		chckbxNoMedicamentos.setContentAreaFilled(false);
		chckbxNoMedicamentos.setBounds(1128, 182, 97, 23);
		panelAgregarCasaCuna.add(chckbxNoMedicamentos);
		
		JLabel lblnecesitarDonacionesDe = new JLabel("\u00BFNecesitar\u00E9 Donaciones de Medicamentos?");
		lblnecesitarDonacionesDe.setForeground(Color.WHITE);
		lblnecesitarDonacionesDe.setFont(new Font("Batang", Font.BOLD, 17));
		lblnecesitarDonacionesDe.setBounds(749, 176, 373, 30);
		panelAgregarCasaCuna.add(lblnecesitarDonacionesDe);

		JLabel lblDireccionCasaCuna = new JLabel("Direccion Casa Cuna");
		lblDireccionCasaCuna.setForeground(Color.WHITE);
		lblDireccionCasaCuna.setFont(new Font("Batang", Font.BOLD, 19));
		lblDireccionCasaCuna.setBounds(749, 312, 203, 23);
		panelAgregarCasaCuna.add(lblDireccionCasaCuna);
		
		JLabel lblTamaoDeMascota = new JLabel("Tama\u00F1o de Mascota a Recibir");
		lblTamaoDeMascota.setForeground(Color.WHITE);
		lblTamaoDeMascota.setFont(new Font("Batang", Font.BOLD, 19));
		lblTamaoDeMascota.setBounds(69, 182, 270, 23);
		panelAgregarCasaCuna.add(lblTamaoDeMascota);
		
		lblTipoDeMascota = new JLabel("Tipo de Mascota");
		lblTipoDeMascota.setForeground(Color.WHITE);
		lblTipoDeMascota.setFont(new Font("Batang", Font.BOLD, 19));
		lblTipoDeMascota.setBounds(69, 276, 146, 23);
		panelAgregarCasaCuna.add(lblTipoDeMascota);
		
		JLabel lblCantidadDeMascotas = new JLabel("\u00BFCu\u00E1ntas Mascotas Podr\u00E9 Recibir? ");
		lblCantidadDeMascotas.setForeground(Color.WHITE);
		lblCantidadDeMascotas.setFont(new Font("Batang", Font.BOLD, 19));
		lblCantidadDeMascotas.setBounds(69, 372, 319, 23);
		panelAgregarCasaCuna.add(lblCantidadDeMascotas);
		
		JComboBox comboBoxTamanoMascota = new JComboBox();
		comboBoxTamanoMascota.setModel(new DefaultComboBoxModel(new String[] {"Peque\u00F1a(s)", "Mediana(s)", "Grande(s)"}));
		comboBoxTamanoMascota.setBounds(404, 182, 203, 22);
		panelAgregarCasaCuna.add(comboBoxTamanoMascota);
		
		JSpinner spinnerCantidadDeMascota = new JSpinner();
		spinnerCantidadDeMascota.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinnerCantidadDeMascota.setBounds(404, 372, 54, 20);
		panelAgregarCasaCuna.add(spinnerCantidadDeMascota);
		
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
		label.setBounds(0, 0, 2508, 1246);
		panelAgregarCasaCuna.add(label);
		
        
		
		
		
/*fin codigo Casa Cuna*/
		
		JMenuBar menuBar = new JMenuBar();
		VentanaPrincipal.setJMenuBar(menuBar);
		
		JMenu mnRegistro = new JMenu("Registro");
        mnRegistro.setIcon(new ImageIcon("./imgs/Registro-40.png"));
        mnRegistro.setToolTipText("Registro");
        menuBar.add(mnRegistro);
		
		
		JMenuItem mntmMascota = new JMenuItem("Mascota");
		mntmMascota.setIcon(new ImageIcon("./imgs/Pets-30.png"));	       
		mntmMascota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelPrincipal.setVisible(false);
				panelAgregarMascota.setVisible(true);
				panelAgregarCasaCuna.setVisible(false);
			}
		});
		mnRegistro.add(mntmMascota);
		
		JMenuItem mntmCasaCuna = new JMenuItem("Casa Cuna");
		mntmCasaCuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				panelAgregarMascota.setVisible(false);
				panelAgregarCasaCuna.setVisible(true);
			}
		});
		mntmCasaCuna.setIcon(new ImageIcon("./imgs/casaCuna.png"));
		mnRegistro.add(mntmCasaCuna);
		panelAgregarCasaCuna.setVisible(false);
	}
}
