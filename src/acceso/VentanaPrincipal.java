package acceso;

import acceso.*;
import logicaDeNegocios.*;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

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
import javax.swing.ButtonModel;
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
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import logicaDeNegocios.*;
import sun.util.logging.resources.logging;

import javax.swing.SpinnerDateModel;

import java.io.File;




import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JToolBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import java.awt.event.MouseMotionAdapter;

public class VentanaPrincipal {

	private JFrame VentanaPrincipal;
	private JPanel panelAgregarMascota;
	private JPanel panelAgregarCasaCuna;
	
    private JTextField textFieldNombreMascota;
    private JTextField textFieldNumChip;
    private ButtonGroup estadoMascota = new ButtonGroup() ;
    private  ButtonGroup monedaDePago = new ButtonGroup() ;
    private  ButtonGroup VerMascotasPor = new ButtonGroup() ;
    private JRadioButton rdbtnColones;
    private JRadioButton rdbtnDolares;
    private JLabel lblMonto;
    private JComboBox comboBoxRazaMascota;
    private JRadioButton rdbtnEncontrada;
    private JRadioButton rdbtnPerdida;
    private JComboBox comboBoxCanton;
    private JButton buttonGuardar;
    private JButton buttonGuardarCC;
    private JComboBox comboBoxTipoMascota;
    private JEditorPane editorPaneNotas;
    private  String estado;
	private static String tipo;
    private static String nombre = null;
    private static String raza;
    private static String chip = null;
    private static String colorDePelo;
    private static String colorDeOjos;
    private static String foto = null;
    private static String lugarVisto;
    private static String nota;
    private static String recompensa = null;
    private static int idEncargado;
    private static String fechaSuceso;
	private JTextField textFieldMontoRecompensa;
	private JComboBox comboBoxProvincia;
	private static int IDUsuarioActivo = -1; //Para iniciar en un valor distinto a los posibles
	private File archivoSeleccionado;
	private JLabel lblFotoMascota;
	private JSpinner spinnerDiaPerdida;
	private JComboBox comboBoxMesPerdida;
	private JSpinner spinnerAnioPerdida;
	private JButton btnAgregarFoto;
	private String rutaImagenesMascotas = "./mascotas";
	/**
	 * @wbp.nonvisual location=314,-31
	 */
	private final JToolBar toolBar = new JToolBar();
	private JLabel lblFecha_3;
	private JLabel lblLugarSuceso_3;
	private JPanel panelTerceraMascota;
	private JLabel lblFotoMascota_3;
	private JLabel lblTituloMascota_3;
	private JLabel lblNotas_3;
	private JLabel lblFotoMascota_2;
	private JLabel lblTituloMascota_2;
	private JPanel panelSegundaMascota;
	private JLabel lblLugar_2;
	private JLabel lblFecha_2;
	private JPanel panelPrimeraMascota;
	private JLabel lblfechaSuceso;
	private JLabel lblLugarSuceso1;
	private JLabel lblNotas_1;
	private JLabel lblFotoMascota1;
	private JLabel lbltitulomascota1;
	private JLabel lblFondoPanelPrincipal;
	private JComboBox comboBoxColorPelaje;
	private JComboBox comboBoxColorOjos;
	private JComboBox comboBoxTamanoMascotaCC;
	private JComboBox comboBoxTipoMascotaCC;
	private JCheckBox chckbxNoMedicamentosCC;
	private JSpinner spinnerCantidadDeMascotaCC;
	private JCheckBox chckbxNoAlimentosCC;
	private JComboBox comboBoxProvinciaCasaCuna;
	private JComboBox comboBoxCantonCasaCuna;
	private JMenuItem mntmCasaCuna;
	private JMenu mnRegistro;
	private JLabel label_1;
	private JLabel label_2;
	private JRadioButton rdbtnTodas;
	private JRadioButton rdbtnPerdidas;
	private JRadioButton rdbtnEncontradas;
	private static ArrayList<Mascota>listaMascotasParaMostrar = new ArrayList<Mascota>();
	private int posicionMascotaPanel1 = listaMascotasParaMostrar.size()-1 ;
	private int posicionMascotaPanel2 = listaMascotasParaMostrar.size()-2 ;
	private int posicionMascotaPanel3 = listaMascotasParaMostrar.size()-3 ;
	private Mascota mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
	private Mascota mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
	private Mascota mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
	
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

	public VentanaPrincipal() {
		initialize();
	}

	private void initialize() {
		VentanaPrincipal = new JFrame();
		VentanaPrincipal.setBounds(0, 0, 1435, 735);
		VentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaPrincipal.getContentPane().setLayout(new CardLayout(0, 0));
		VentanaPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		
		JPanel panelPrincipal = new JPanel();
		VentanaPrincipal.getContentPane().add(panelPrincipal, "name_154826621946393");
		panelPrincipal.setLayout(null);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IDUsuarioActivo = -1;
				VentanaPrincipal.dispose();
				Loggin log  = new Loggin();
				log.setVisible(true);
				
				
			}
		});
		btnCerrarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnCerrarSesion.setForeground(Color.WHITE);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCerrarSesion.setForeground(Color.BLUE);
			}
		});
		
		rdbtnEncontradas = new JRadioButton("Encontradas");
		rdbtnEncontradas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaMascotasParaMostrar.clear();
				listaMascotasParaMostrar = Mascota.getMascotasEncontradas();
			}
		});
		rdbtnEncontradas.setContentAreaFilled(false);
		rdbtnEncontradas.setBounds(54, 241, 109, 23);
		VerMascotasPor.add(rdbtnEncontradas);
		panelPrincipal.add(rdbtnEncontradas);
		
		rdbtnPerdidas = new JRadioButton("Perdidas");
		rdbtnPerdidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaMascotasParaMostrar.clear();
				listaMascotasParaMostrar= Mascota.getMascotasPerdidas();
			}
		});
		rdbtnPerdidas.setContentAreaFilled(false);
		rdbtnPerdidas.setBounds(54, 205, 109, 23);
		VerMascotasPor.add(rdbtnPerdidas);
		panelPrincipal.add(rdbtnPerdidas);
		
		rdbtnTodas = new JRadioButton("Todas");
		rdbtnTodas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaMascotasParaMostrar.clear();
				listaMascotasParaMostrar = Mascota.getListaDeMascotas();
				
			}
		});
		rdbtnTodas.setSelected(true);
		rdbtnTodas.setContentAreaFilled(false);
		
		rdbtnTodas.setBounds(54, 172, 109, 23);
		panelPrincipal.add(rdbtnTodas);
		VerMascotasPor.add(rdbtnTodas);
		label_1 = new JLabel("Mostrar Por:");
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("Batang", Font.BOLD, 18));
		label_1.setBounds(44, 135, 147, 30);
		panelPrincipal.add(label_1);
		
		label_2 = new JLabel("");
		label_2 .setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		label_2.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\fondoPanelesPantallaPrincipal.png"));
		label_2.setBounds(34, 135, 234, 290);
		panelPrincipal.add(label_2);
		btnCerrarSesion.setRolloverIcon(null);
		btnCerrarSesion.setFocusable(false);
		btnCerrarSesion.setFocusTraversalKeysEnabled(false);
		btnCerrarSesion.setFocusPainted(false);
		btnCerrarSesion.setForeground(Color.WHITE);
		btnCerrarSesion.setContentAreaFilled(false);
		btnCerrarSesion.setBorderPainted(false);
		btnCerrarSesion.setBounds(1238, 0, 124, 23);
		panelPrincipal.add(btnCerrarSesion);
		
		JLabel lblNewLabelFondo = new JLabel("");
		lblNewLabelFondo.setBounds(449, 0, 540, 110);
		panelPrincipal.add(lblNewLabelFondo);
		lblNewLabelFondo.setIcon(new ImageIcon("./imgs/Logo.png"));
		
		panelPrimeraMascota = new JPanel();
		panelPrimeraMascota.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panelPrimeraMascota.setBounds(347, 132, 868, 141);
		panelPrincipal.add(panelPrimeraMascota);
		panelPrimeraMascota.setLayout(null);
		
		lblFotoMascota1 = new JLabel();
		lblFotoMascota1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
		lblFotoMascota1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoMascota1.setBounds(10, 11, 106, 119);
		panelPrimeraMascota.add(lblFotoMascota1);
		
		lbltitulomascota1 = new JLabel();
		lbltitulomascota1.setBounds(126, 11, 158, 14);
		lbltitulomascota1.setText(mascotaPanel1.getTipo()+" " +mascotaPanel1.getEstado()+" en "+mascotaPanel1.getLugarVisto() );
		panelPrimeraMascota.add(lbltitulomascota1);
		
		lblLugarSuceso1 = new JLabel("Lugar Suceso");
		lblLugarSuceso1.setBounds(710, 40, 158, 14);
		panelPrimeraMascota.add(lblLugarSuceso1);
		
		lblfechaSuceso = new JLabel("dia/Mes/anio");
		lblfechaSuceso.setBounds(728, 11, 130, 14);
		panelPrimeraMascota.add(lblfechaSuceso);
		
		lblNotas_1 = new JLabel("Notas");
		lblNotas_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotas_1.setBounds(126, 40, 528, 78);
		panelPrimeraMascota.add(lblNotas_1);
		
		JLabel lblFondoPanel1 = new JLabel("");
		lblFondoPanel1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		lblFondoPanel1.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\fondoPanelesPantallaPrincipal.png"));
		lblFondoPanel1.setBounds(0, 0, 868, 141);
		panelPrimeraMascota.add(lblFondoPanel1);
		
		panelSegundaMascota = new JPanel();
		panelSegundaMascota.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panelSegundaMascota.setLayout(null);
		panelSegundaMascota.setBounds(347, 284, 868, 141);
		panelPrincipal.add(panelSegundaMascota);
		
		JLabel lblNotas2 = new JLabel("Notas");
		lblNotas2.setBounds(126, 40, 461, 74);
		panelSegundaMascota.add(lblNotas2);
		
		lblFotoMascota_2 = new JLabel("FotoMascota");
		lblFotoMascota_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoMascota_2.setBounds(10, 11, 106, 119);
		panelSegundaMascota.add(lblFotoMascota_2);
		
		lblTituloMascota_2 = new JLabel("TituloMascota");
		lblTituloMascota_2.setBounds(126, 11, 158, 14);
		panelSegundaMascota.add(lblTituloMascota_2);
		
		lblLugar_2 = new JLabel("Lugar Suceso");
		lblLugar_2.setBounds(710, 40, 158, 14);
		panelSegundaMascota.add(lblLugar_2);
		
		lblFecha_2 = new JLabel("dia/Mes/anio");
		lblFecha_2.setBounds(728, 11, 130, 14);
		panelSegundaMascota.add(lblFecha_2);
		
		JLabel labelFondoPanel2 = new JLabel("");
		labelFondoPanel2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		labelFondoPanel2.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\fondoPanelesPantallaPrincipal.png"));
		labelFondoPanel2.setBounds(0, 0, 868, 141);
		panelSegundaMascota.add(labelFondoPanel2);
		
		panelTerceraMascota = new JPanel();
		panelTerceraMascota.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panelTerceraMascota.setLayout(null);
		panelTerceraMascota.setBounds(347, 439, 868, 141);
		panelPrincipal.add(panelTerceraMascota);
		
		lblFotoMascota_3 = new JLabel("FotoMascota");
		lblFotoMascota_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoMascota_3.setBounds(10, 11, 106, 119);
		panelTerceraMascota.add(lblFotoMascota_3);
		
		lblTituloMascota_3 = new JLabel("TituloMascota");
		lblTituloMascota_3.setBounds(126, 11, 158, 14);
		panelTerceraMascota.add(lblTituloMascota_3);
		
		lblLugarSuceso_3 = new JLabel("Lugar Suceso");
		lblLugarSuceso_3.setBounds(710, 40, 158, 14);
		panelTerceraMascota.add(lblLugarSuceso_3);
		
		lblFecha_3 = new JLabel("dia/Mes/anio");
		lblFecha_3.setBounds(728, 11, 130, 14);
		panelTerceraMascota.add(lblFecha_3);
		
		lblNotas_3 = new JLabel("Notas");
		lblNotas_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotas_3.setBounds(126, 40, 528, 78);
		panelTerceraMascota.add(lblNotas_3);
		
		JLabel labelFondoPanel3 = new JLabel("");
		labelFondoPanel3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		labelFondoPanel3.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\fondoPanelesPantallaPrincipal.png"));
		labelFondoPanel3.setBounds(0, 0, 868, 141);
		panelTerceraMascota.add(labelFondoPanel3);
		
		JButton btnFlechaDerecha = new JButton("");
		btnFlechaDerecha.setBounds(1064, 609, 34, 29);
		panelPrincipal.add(btnFlechaDerecha);
		
		JButton btnFlechaIzquierda = new JButton("Flecha Izquierda");
		btnFlechaIzquierda.setBounds(252, 603, 111, 23);
		panelPrincipal.add(btnFlechaIzquierda);
		
		lblFondoPanelPrincipal = new JLabel("");
		lblFondoPanelPrincipal.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\fondoRegistro.png"));
		lblFondoPanelPrincipal.setBounds(0, 0, 1362, 675);
		panelPrincipal.add(lblFondoPanelPrincipal);
		
		
		panelAgregarMascota = new JPanel();
		VentanaPrincipal.getContentPane().add(panelAgregarMascota, "name_27990074221032");
		panelAgregarMascota.setLayout(null);
		panelAgregarMascota.setVisible(false);
		
		comboBoxColorPelaje = new JComboBox();
		comboBoxColorPelaje.setModel(new DefaultComboBoxModel(new String[] {"Negro", "Manchado", "Dos Tonalidades", "Amarillo", "Cafe", "Blanco", "Gris", "Otro"}));
		comboBoxColorPelaje.setBounds(320, 468, 233, 19);
		panelAgregarMascota.add(comboBoxColorPelaje);
		
//////////////////////////////*Inicio Codigo del Panel Agregar Mascota*/////////////////////////////////////////////////////////////////////
		
		lblFotoMascota = new JLabel("");
		lblFotoMascota.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.WHITE, null));
		lblFotoMascota.setBounds(995, 61, 142, 141);
		panelAgregarMascota.add(lblFotoMascota);
		
		JLabel lblImagenDeLa = new JLabel("Imagen de la Mascota");
		lblImagenDeLa.setForeground(Color.WHITE);
		lblImagenDeLa.setFont(new Font("Batang", Font.BOLD, 19));
		lblImagenDeLa.setBounds(707, 178, 208, 23);
		panelAgregarMascota.add(lblImagenDeLa);
		
		btnAgregarFoto = new JButton("");
		btnAgregarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser elegir = new JFileChooser();
				int resultadoAbrir = elegir.showOpenDialog(VentanaPrincipal.getContentPane());
				archivoSeleccionado = elegir.getSelectedFile();
				if (resultadoAbrir == JFileChooser.APPROVE_OPTION) {
					String pathArchivo = archivoSeleccionado.getAbsolutePath(); 	
		            String nombre = 	 archivoSeleccionado.getName(); 		           
		            if (archivoSeleccionado != null) {
		            	try {
							BufferedImage imagenMostrada = ImageIO.read(archivoSeleccionado);
							Dimension recuadro = lblFotoMascota.getSize();
							lblFotoMascota.setIcon(new ImageIcon(imagenMostrada.getScaledInstance(recuadro.width, recuadro.height, Image.SCALE_AREA_AVERAGING)));
						} catch (IOException ex) {
							JOptionPane.showMessageDialog(VentanaPrincipal.getContentPane(), ex.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
						}
		            }
		            
				}
				crearCarpetaImagenesMascotas();
	           	asignarIDFoto();
				Sistema.copiarImagen(archivoSeleccionado);
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
		btnAgregarFoto.setBounds(1142, 150, 75, 65);
		panelAgregarMascota.add(btnAgregarFoto);
		
		
		JLabel labelDL = new JLabel("");
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
                rdbtnDolares.setEnabled(false);
                lblMonto.setEnabled(false);
                textFieldMontoRecompensa.setEnabled(false);
                lblMonto.setVisible(false);
            
                        
            }else{
            rdbtnColones.setEnabled(true);
            rdbtnDolares.setEnabled(true);
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
            	lugarVisto = comboBoxCanton.getSelectedItem().toString() + ", " + comboBoxProvincia.getSelectedItem().toString();
            	nota = editorPaneNotas.getText();
            	colorDePelo =(String)comboBoxColorPelaje.getSelectedItem();
            	idEncargado = IDUsuarioActivo;
            	fechaSuceso =  spinnerDiaPerdida.getValue().toString() + "/" + comboBoxMesPerdida.getSelectedItem().toString()+"/"+spinnerAnioPerdida.getValue().toString();
            	tipo = (String) comboBoxTipoMascota.getSelectedItem();
            	lugarVisto = (String)comboBoxCanton.getSelectedItem() + ", " + (String)comboBoxProvincia.getSelectedItem();
            	colorDeOjos = (comboBoxColorOjos.getSelectedItem()).toString();
            	verificarRaza();
            	verificarEstado();
            	verificarMoneda();
            	verificartxtFieldChip();
            	verificarNombre();
            	
            	if(chckbxRecompensa.isSelected() &&textFieldMontoRecompensa.getText().isEmpty()){
            		JOptionPane.showMessageDialog(panelAgregarMascota, "Ingrese un monto de recompensa");
            		return;
            	}
            	if(Mascota.verificarChip(chip, estado)){
            	
            		JOptionPane.showMessageDialog(panelAgregarMascota, "Mascota ya ha sido registrada");
            		return ;
            	}
            	
            	if(foto == null){
            		
            		JOptionPane.showMessageDialog(panelAgregarMascota, "Debe agregar fotografia");
            		return;
            	}
            	if( nombre == null){
            		JOptionPane.showMessageDialog(panelAgregarMascota, "Ingrese el nombre de la mascota");
            		return;
            	}
            	
            	else{
            		
            		Mascota NuevaMascota = new Mascota(estado, tipo, raza, nombre, chip, colorDePelo, colorDeOjos, foto, lugarVisto, nota, fechaSuceso, recompensa, idEncargado);
        			
            		try {
						NuevaMascota.leerMascota();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
        			Mascota.getListaDeMascotas().add(NuevaMascota);
        			
        			NuevaMascota.GuardarMascota(Mascota.getListaDeMascotas());
        			textFieldNombreMascota.setText(null);
        			textFieldNumChip.setText(null);
        			lblFotoMascota.setIcon(null);
        			textFieldMontoRecompensa.setText(null);
        			editorPaneNotas.setText(null);
        			nombre = null;
        			chip = null;
        			recompensa = null;
        			foto = null;
        			JOptionPane.showMessageDialog(panelAgregarMascota, "Mascota registrada correctamente");	
        			   	}
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

                }
                if(comboBoxProvincia.getSelectedIndex()==1){
                    
                    comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","San Ramón","Grecia","San Mateo","Atenas","Naranjo",
                            "Palmares","Poás","Orotina","San Carlos","Alfaro Ruíz","Valverde Vega",
                            "Upala","Los Chiles","Guatuzo"}))   ;
                }
                if(comboBoxProvincia.getSelectedIndex()==2){
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
        
        spinnerDiaPerdida = new JSpinner();
        spinnerDiaPerdida.setToolTipText("D\u00EDa");
        spinnerDiaPerdida.setModel(new SpinnerNumberModel(1, 1, 31, 1));
        spinnerDiaPerdida.setBounds(995, 237, 39, 23);
        panelAgregarMascota.add(spinnerDiaPerdida);
        
        spinnerAnioPerdida = new JSpinner();
        spinnerAnioPerdida.setToolTipText("A\u00F1o");
        spinnerAnioPerdida.setBounds(1234, 236, 61, 23);
        spinnerAnioPerdida.setModel(new SpinnerNumberModel(2014.0, 1990.0, 2014.0, 1.0));
        panelAgregarMascota.add(spinnerAnioPerdida);
        
        comboBoxMesPerdida = new JComboBox();
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
        lblsiAplica.setVisible(false);
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
                  
                	lblsiAplica.setVisible(false);
                    textFieldNombreMascota.setEnabled(true);
                    lblNombreDeLa.setEnabled(true);
                    textFieldNumChip.setEnabled(true);
                    lblNumeroDeChip.setEnabled(true);
                    textFieldNombreMascota.setEnabled(true);
                    lblFechaDeHallazgoperdida.setText("Fecha de Pérdida");
                    lblSitioDeHallazgoperdida.setText("Sitio de Pérdida");
                    rdbtnDolares.setVisible(true);
                    rdbtnDolares.setEnabled(true);
                    rdbtnColones.setVisible(true);
                    rdbtnColones.setEnabled(true);
                    chckbxRecompensa.setVisible(true);
                    chckbxRecompensa.setEnabled(true);
                    lblMonto.setEnabled(true);
                    lblMonto.setVisible(true);
                    textFieldMontoRecompensa.setEnabled(true);
                    textFieldMontoRecompensa.setVisible(true);
                    	
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
                    chckbxRecompensa.setSelected(false);
                	lblsiAplica.setVisible(true);
                    lblFechaDeHallazgoperdida.setText("Fecha de Hallazgo");
                    lblSitioDeHallazgoperdida.setText("Sitio de Hallazgo");
                    rdbtnDolares.setVisible(false);
                    rdbtnDolares.setEnabled(false);
                    rdbtnColones.setVisible(false);
                    rdbtnColones.setEnabled(false);
                    chckbxRecompensa.setVisible(false);
                    chckbxRecompensa.setEnabled(false);
                    lblMonto.setEnabled(false);
                    lblMonto.setVisible(false);
                    textFieldMontoRecompensa.setEnabled(false);
                    textFieldMontoRecompensa.setVisible(false);
                }
                else{
                    textFieldNombreMascota.setEnabled(true);
                    lblNombreDeLa.setEnabled(true);
                    textFieldNumChip.setEnabled(true);
                    lblNumeroDeChip.setEnabled(true);                   
                    textFieldNombreMascota.setEnabled(true);
                    lblFechaDeHallazgoperdida.setText("Fecha de Pérdida");
                    lblSitioDeHallazgoperdida.setText("Sitio de Pérdida");   
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
                      "Pixiebob","Ragdoll","Sagrado de birmania","Scottish fold","Selkirk Rex","Sphynx","Van turco","Otro"}));
                    comboBoxRazaMascota.setVisible(true);
                    comboBoxRazaMascota.setEnabled(true);
                    
                }
                if (comboBoxTipoMascota.getSelectedIndex() == 2){
                    
                	comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Canario","Cotorra","Angaporis(Pájaros de Amor)","Rosella","Loro de Bolsillo"
                            ,"Loro","Turaco","Cacatua","Guacamayo","Ninfa","Pato","Gallina","Otro"})); 
                    comboBoxRazaMascota.setVisible(true);
                    comboBoxRazaMascota.setEnabled(true);
                    
                }
                if (comboBoxTipoMascota.getSelectedIndex() == 3){
                    
                	comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Ardilla Coreana",
                            "Cobaya","Conejos","Erizo","Hamster","Jerbo","Rata","Ratón","Otro"}));
                    comboBoxRazaMascota.setVisible(true);
                    comboBoxRazaMascota.setEnabled(true);
                    
                }
                if (comboBoxTipoMascota.getSelectedIndex() == 4){
                    
                    comboBoxRazaMascota.setEnabled(false);
                    raza= "Otro";
                    
                }

                }

         	}
         );
        comboBoxTipoMascota.setBounds(320, 208, 233, 20);
        comboBoxTipoMascota.setModel(new DefaultComboBoxModel(new String[] {"Canino", "Felino", "Ave", "Roedor", "Otro"}));
        panelAgregarMascota.add(comboBoxTipoMascota);
        
        comboBoxRazaMascota = new JComboBox();
        comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Airedale Terrier" ,"Akita inu" ,"Alaskan malamute", "American Stafford","Shire Terrier","Basenji",
                "Basset Hound","Beagle","Bichón Maltés","Boxer","Braco de Weimar","Bull Terrier","Bulldog francés","Bulldog inglés","Caniche","Carlino","Chihuahua","Chow-chow","Cocker Spaniel Americano","Cocker Spaniel inglés","Crestado chino","Dálmata","Dobermann","Dogo Aleman","Dogo Argentino","French Poodle","Golden retriever",
                "Labrador Retrevier","Mastín Español","Mastín Napolitano","Pastor Alemán","Pequinés",
                "Pinscher Pomerania","Rottweiler","Samoyedo","San Bernardo","Schnauzer","Setter inglés",
                "Setter irlandés","Shar Pei","Shih Tzu","Siberian Husky","Otro"})) ; 
        
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
        
        comboBoxColorOjos = new JComboBox();
        comboBoxColorOjos.setModel(new DefaultComboBoxModel(new String[] {"Cafes", "Azules", "Negros", "Grises", "Amarillos", "Verdes", "Celestes", "Dos Tonos ", "Otro"}));
        comboBoxColorOjos.setBounds(320, 528, 233, 20);
        panelAgregarMascota.add(comboBoxColorOjos);
        
        
        rdbtnColones = new JRadioButton("\u20A1");
        rdbtnColones.setForeground(Color.WHITE);
        rdbtnColones.setContentAreaFilled(false);
        rdbtnColones.setSelected(true);
        rdbtnColones.setBounds(847, 347, 39, 23);
        monedaDePago.add(rdbtnColones);
        panelAgregarMascota.add(rdbtnColones);
        
        rdbtnDolares = new JRadioButton("$");rdbtnDolares.setForeground(Color.WHITE);
        rdbtnDolares.setContentAreaFilled(false);
        rdbtnDolares.setBounds(891, 347, 47, 23);
        monedaDePago.add(rdbtnDolares);
        panelAgregarMascota.add(rdbtnDolares);
        
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
        
		
		
		//////////////////////////////////Codigo panel Mascota fin///////////////////////////////////////////////////////////////
	
		
		panelAgregarCasaCuna = new JPanel();
		VentanaPrincipal.getContentPane().add(panelAgregarCasaCuna, "name_28003406149630");
		panelAgregarCasaCuna.setLayout(null);
		
		
///////////////////////Inicio codigo casa Cuna//////////////////////////////////////////////
		
		
		buttonGuardarCC = new JButton("");
		buttonGuardarCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tamanoMascota = (String) comboBoxTamanoMascotaCC.getSelectedItem();
				String tipoMascota =(String) comboBoxTipoMascotaCC.getSelectedItem();
				Boolean necesitaDonacion = verificarNecesitaDonacion();
				Boolean necesitaMedicamentos = verificarNecesitaMedicamentos();
				int cantMascotas =(int) spinnerCantidadDeMascotaCC.getValue();
				int camposDisponibles =(int) spinnerCantidadDeMascotaCC.getValue();
				String direccionCC = comboBoxCantonCasaCuna.getSelectedItem().toString() + ", " + comboBoxProvinciaCasaCuna.getSelectedItem().toString();
				int idUsuarioCasaCuna = IDUsuarioActivo;
				
				CasaCuna nuevaCasaCuna = new CasaCuna(tamanoMascota, tipoMascota,necesitaDonacion, necesitaMedicamentos, cantMascotas, camposDisponibles, direccionCC, idUsuarioCasaCuna);
				
			
				try {
					nuevaCasaCuna.leerCasaCuna();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
    			CasaCuna.getListaCasasCuna().add(nuevaCasaCuna);
    			
    			nuevaCasaCuna.GuardarCasaCuna(CasaCuna.getListaCasasCuna());
    			
    			JOptionPane.showMessageDialog(null, "Casa Cuna Registrada Correctamente");
    			chckbxNoAlimentosCC.setSelected(false);
    			chckbxNoMedicamentosCC.setSelected(false);
    			spinnerCantidadDeMascotaCC.setValue(1);
    			
			
			}
		});
		buttonGuardarCC.setToolTipText("Guardar en el Registro del Mascota");
		buttonGuardarCC.setBorder(null);
		buttonGuardarCC.setFocusable(false);
		buttonGuardarCC.setFocusTraversalKeysEnabled(false);
		buttonGuardarCC.setFocusPainted(false);
				
		JButton CancelarOperacion = new JButton("");
		CancelarOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(true);
				panelAgregarCasaCuna.setVisible(false);
				panelAgregarMascota.setVisible(false);
			}
		});
		
		comboBoxTipoMascotaCC = new JComboBox();
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
		
		buttonGuardarCC.setDefaultCapable(false);
		buttonGuardarCC.setContentAreaFilled(false);
		buttonGuardarCC.setBorderPainted(false);
		buttonGuardarCC.setIconTextGap(-3);
		buttonGuardarCC.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonGuardarCC.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
		buttonGuardarCC.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
		buttonGuardarCC.setIcon(new ImageIcon("./imgs/save-48.png"));
		buttonGuardarCC.setBounds(1036, 558, 109, 78);
		panelAgregarCasaCuna.add(buttonGuardarCC);
		
		chckbxNoAlimentosCC = new JCheckBox("No");
		chckbxNoAlimentosCC.setForeground(Color.WHITE);
		chckbxNoAlimentosCC.setContentAreaFilled(false);
		chckbxNoAlimentosCC.setFont(new Font("Batang", Font.BOLD, 11));
		chckbxNoAlimentosCC.setBounds(1128, 242, 97, 23);
		panelAgregarCasaCuna.add(chckbxNoAlimentosCC);
	    chckbxNoAlimentosCC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            	if(chckbxNoAlimentosCC.isSelected()){
                    chckbxNoAlimentosCC.setText("Sí");
                }
                else{
                    chckbxNoAlimentosCC.setText("No");
                }
            }
	    });
	    
		JLabel lblnecesitarDonacionesDe_1 = new JLabel("\u00BFNecesitar\u00E9 Donaciones de Alimentos?");
		lblnecesitarDonacionesDe_1.setForeground(Color.WHITE);
		lblnecesitarDonacionesDe_1.setFont(new Font("Batang", Font.BOLD, 19));
		lblnecesitarDonacionesDe_1.setBounds(749, 235, 373, 30);
		panelAgregarCasaCuna.add(lblnecesitarDonacionesDe_1);
		
		chckbxNoMedicamentosCC = new JCheckBox("No");
		chckbxNoMedicamentosCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNoMedicamentosCC.isSelected()){
				
					chckbxNoMedicamentosCC.setText("Sí");
				
				}
				else{
				
					chckbxNoMedicamentosCC.setText("No");
				}
			}
		});
		chckbxNoMedicamentosCC.setFont(new Font("Batang", Font.BOLD, 11));
		chckbxNoMedicamentosCC.setForeground(Color.WHITE);
		chckbxNoMedicamentosCC.setContentAreaFilled(false);
		chckbxNoMedicamentosCC.setBounds(1128, 182, 97, 23);
		panelAgregarCasaCuna.add(chckbxNoMedicamentosCC);
		
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
		
		comboBoxTamanoMascotaCC = new JComboBox();
		comboBoxTamanoMascotaCC.setModel(new DefaultComboBoxModel(new String[] {"Peque\u00F1a(s)", "Mediana(s)", "Grande(s)"}));
		comboBoxTamanoMascotaCC.setBounds(404, 182, 203, 22);
		panelAgregarCasaCuna.add(comboBoxTamanoMascotaCC);
		
		spinnerCantidadDeMascotaCC = new JSpinner();
		spinnerCantidadDeMascotaCC.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinnerCantidadDeMascotaCC.setBounds(404, 372, 54, 20);
		panelAgregarCasaCuna.add(spinnerCantidadDeMascotaCC);
		
		comboBoxProvinciaCasaCuna = new JComboBox();
		comboBoxProvinciaCasaCuna.setModel(new DefaultComboBoxModel(new String[] {"San Jose", "Alajuela", "Cartago", "Heredia", "Puntarenas", "Limon", "Guanacaste"}));
		comboBoxProvinciaCasaCuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxProvinciaCasaCuna.getSelectedIndex() == 0){
					comboBoxProvinciaCasaCuna.setModel(new DefaultComboBoxModel(new String[]{"Central","Escazú","Desamparados","Puriscal","Tarrazú","Aserrí","Mora","Goicoechea","Santa Ana","Alajuelita",
                            "Coronado","Acosta","Tibás","Moravia","Montes de Oca","Turrubares",
                            "Dota","Curridabat","Perez Zeledón","León Cortés"}));
				}
				if(comboBoxProvinciaCasaCuna.getSelectedIndex() == 1){
                    comboBoxCantonCasaCuna.setModel(new DefaultComboBoxModel(new String[] {"Central","San Ramón","Grecia","San Mateo","Atenas","Naranjo",
                    		"Palmares","Poás","Orotina","San Carlos","Alfaro Ruíz","Valverde Vega", "Upala","Los Chiles","Guatuzo"}))   ;
                }
                if(comboBoxProvinciaCasaCuna.getSelectedIndex() == 2){
                    comboBoxCantonCasaCuna.setModel(new DefaultComboBoxModel(new String[] {"Central","Paraiso","La Unión","Jimenez","Turrialba","Alvarado","Oreamuno","El Guarco"}));
                }
                if(comboBoxProvinciaCasaCuna.getSelectedIndex() == 3){
                    comboBoxCantonCasaCuna.setModel(new DefaultComboBoxModel(new String[] {"Central","	Barva","Santo Domingo","Santa Barbara","San Rafael","San Isidro","Belén","Flores","San Pablo","Sarapiqui"}))  ;
                }
                if(comboBoxProvinciaCasaCuna.getSelectedIndex() == 4){
                    comboBoxCantonCasaCuna.setModel(new DefaultComboBoxModel(new String[] {"Central","Esparza","Buenos Aires","Montes de Oro","Osa","Aguirre","Golfito","Coto Brus","Parrita","Corredores","Garabito"}))    ;
                }
                if(comboBoxProvinciaCasaCuna.getSelectedIndex() == 5){
                    comboBoxCantonCasaCuna.setModel(new DefaultComboBoxModel(new String[] {"Central","Pococí","Siquirres","Talamanca","Matina","Guacimo"})) ;
                }
                if(comboBoxProvinciaCasaCuna.getSelectedIndex() == 6){
                    comboBoxCantonCasaCuna.setModel(new DefaultComboBoxModel(new String[] {"Liberia","Nicoya","Santa Cruz","Bagaces","Carrillo","Cañas","Abangares","Tilaran","Nandayure","La Cruz","Hojancha"}))   ;
                }
			}
		});
		comboBoxProvinciaCasaCuna.setBounds(841, 376, 197, 20);
		panelAgregarCasaCuna.add(comboBoxProvinciaCasaCuna);
		
		comboBoxCantonCasaCuna = new JComboBox();
		comboBoxCantonCasaCuna.setModel(new DefaultComboBoxModel(new String[]{"Central","Escazú","Desamparados","Puriscal","Tarrazú","Aserrí","Mora","Goicoechea","Santa Ana","Alajuelita",
                            "Coronado","Acosta","Tibás","Moravia","Montes de Oca","Turrubares",
                            "Dota","Curridabat","Perez Zeledón","León Cortés"}));
		comboBoxCantonCasaCuna.setBounds(841, 436, 197, 20);
		panelAgregarCasaCuna.add(comboBoxCantonCasaCuna);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setForeground(Color.WHITE);
		lblProvincia.setFont(new Font("Khmer UI", Font.BOLD, 13));
		lblProvincia.setBounds(749, 379, 91, 14);
		panelAgregarCasaCuna.add(lblProvincia);
		
		JLabel lblCantn = new JLabel("Cant\u00F3n:");
		lblCantn.setForeground(Color.WHITE);
		lblCantn.setFont(new Font("Khmer UI", Font.BOLD, 13));
		lblCantn.setBounds(749, 438, 69, 14);
		panelAgregarCasaCuna.add(lblCantn);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
		label.setBounds(0, -49, 2508, 1246);
		panelAgregarCasaCuna.add(label);
		
		
        
//////////////////////////////////////*fin codigo Casa Cuna*/////////////////////////////////////////////////////////////////

		
		JMenuBar menuBar = new JMenuBar();
		VentanaPrincipal.setJMenuBar(menuBar);
		
		mnRegistro = new JMenu("Registro");
		mnRegistro.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent arg0) {
				
					if(CasaCuna.esCasacuna(IDUsuarioActivo)){
						
						mntmCasaCuna.setVisible(false);
						mntmCasaCuna.setEnabled(false);
					
					}
					
					else{
					
						mntmCasaCuna.setVisible(true);
						mntmCasaCuna.setEnabled(true);
						
					}
				}
			
		});
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
		
		mntmCasaCuna = new JMenuItem("Casa Cuna");
		mntmCasaCuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(false);
				panelAgregarMascota.setVisible(false);
				panelAgregarCasaCuna.setVisible(true);
			}
		});
		mntmCasaCuna.setIcon(new ImageIcon("./imgs/casaCuna.png"));
		mnRegistro.add(mntmCasaCuna);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mntmConsultaMascota = new JMenuItem("Mascotas");
		mnConsulta.add(mntmConsultaMascota);
		
		JMenuItem mntmConsutarCasaCuna = new JMenuItem("Casa Cuna");
		mnConsulta.add(mntmConsutarCasaCuna);
		
		JMenuItem mntmConsultarAsociacinBeneficiaria = new JMenuItem("Asociaci\u00F3n Beneficiaria");
		mnConsulta.add(mntmConsultarAsociacinBeneficiaria);
		
		JMenuItem mntmConsutaMiPerfil = new JMenuItem("Mi Perfil");
		mnConsulta.add(mntmConsutaMiPerfil);
		
		JMenu mnAdopciones = new JMenu("Adopciones");
		menuBar.add(mnAdopciones);
		
		JMenuItem mntmAdoptarUnaMascota = new JMenuItem("Adoptar una Mascota");
		mnAdopciones.add(mntmAdoptarUnaMascota);
		
		JMenuItem mntmCalificarUnaAdopcin = new JMenuItem("Calificar una Adopci\u00F3n");
		mnAdopciones.add(mntmCalificarUnaAdopcin);
		panelAgregarCasaCuna.setVisible(false);
	}
	
    private void crearCarpetaImagenesMascotas()
    {
		File archivo = new File (rutaImagenesMascotas);

    	if(!archivo.exists())
    	{
    		archivo.mkdir();
    	}
    }
	
	private void asignarIDFoto() {
		try {
			Mascota.leerMascota();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		foto = "./mascotas/" + String.valueOf(Mascota.getListaDeMascotasSize());
	}
	
	public void verificarEstado(){
		
		if(estadoMascota.isSelected( rdbtnEncontrada.getModel())){
    		
			setEstado("ENCONTRADA");
  	   		
    	}
		else{
    	
			setEstado("PERDIDA");
    		
    	}
    	
	}
	
	public void verificarMoneda(){
		
		if  (getEstado().equals("ENCONTRADA")){
    	
			recompensa = null;
    			
    	}
		else{
			
    		if(monedaDePago.isSelected(rdbtnColones.getModel())){
    		
    			recompensa = rdbtnColones.getText() +" " +textFieldMontoRecompensa.getText();
        		
    		}
    		else {
    			
    			recompensa = rdbtnDolares.getText() +" " +textFieldMontoRecompensa.getText();	
			
    		}
    		
    		
    	}
	
	}
	
	public void verificartxtFieldChip(){
		String chip =textFieldNumChip.getText();
		if (chip.isEmpty()){
			this.chip = null;
		}
	}
	public void verificarRaza(){
		if (comboBoxTipoMascota.getSelectedIndex() == 4){
            raza= "Otro";
		}
	}
	
	
	public String getEstado() {
	
		return estado;
	
	}

	public void setEstado(String pEstado) {
		estado = pEstado;
	}

	
	public static void setIDUsuarioActivo(int id){
		
		IDUsuarioActivo = id;
	}
	
	public static int getIDUsuarioActivo(){
		
		return IDUsuarioActivo;
	}
	
	private void verificarNombre() {
		String nombreMascota = textFieldNombreMascota.getText();
		if(estado == "PERDIDA" &&nombreMascota.isEmpty()){
			 nombre=null;
		}
		
	}
	
	public boolean verificarNecesitaDonacion(){
		if (chckbxNoAlimentosCC.getText().equals("No")){
			return false;
		}else{
			return true;
		}
		
	}
	
	public boolean verificarNecesitaMedicamentos(){
		if (chckbxNoMedicamentosCC.getText().equals("No")){
			return false;
		}else{
			return true;
		}
		
	}
};;
