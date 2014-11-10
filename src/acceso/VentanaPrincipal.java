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
import javax.swing.JTable;
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
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseMotionAdapter;
import java.awt.Choice;
import java.awt.Panel;

public class VentanaPrincipal {

	private JFrame VentanaPrincipal;
	private JPanel panelAgregarMascota;
	private JPanel panelAgregarCasaCuna;
	private JPanel panelConsultaDeMascotas;
	private JTextField textFieldNombreMascota;
	private JTextField textFieldNumChip;
	private ButtonGroup estadoMascota = new ButtonGroup();
	private ButtonGroup monedaDePago = new ButtonGroup();
	private ButtonGroup VerMascotasPor = new ButtonGroup();
	private ButtonGroup verUsuariosPor = new ButtonGroup();
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
	private String estado;
	private static String tipo;
	private static String nombre = "";
	private static String raza;
	private static String chip = "";
	private static String colorDePelo;
	private static String colorDeOjos;
	private static String foto = "";
	private static String lugarVisto;
	private static String nota;
	private static String recompensa = "";
	private static int idMascotaSeleccionada = -1; 
	private static int idEncargado;
	private static String fechaSuceso;
	private JTextField textFieldMontoRecompensa;
	private JComboBox comboBoxProvincia;
	private static int IDUsuarioActivo = -1; // Para iniciar en un valor
												// distinto a los posibles
	
	private File archivoSeleccionado;
	private JLabel lblFotoMascota;
	private JSpinner spinnerDiaPerdida;
	private JComboBox comboBoxMesPerdida;
	private JSpinner spinnerAnioPerdida;
	private JButton btnAgregarFoto;
	private static String rutaImagenesMascotas = "./mascotas";

	private static String opcEstado = " ";
	private static String opcTipo = " ";
	private static String opcRaza = " ";
	private static String opcColorDeOjos = " ";
	private static String opcColorDePelo = " ";
	/**
	 * @wbp.nonvisual location=314,-31
	 */

	private JLabel lblFecha_3;
	private JLabel lblLugarSuceso_3;
	private JPanel panelTerceraMascota;
	private JLabel lblFotoMascota_3;
	private JLabel lblTituloMascota_3;
	private JTextArea lblNotas_3;
	private JLabel lblFotoMascota_2;
	private JLabel lblTituloMascota_2;
	private JPanel panelSegundaMascota;
	private JLabel lblLugar_2;
	private JLabel lblFecha_2;
	private JTextArea lblNotas2;
	private JPanel panelPrimeraMascota;
	private JLabel lblfechaSuceso;
	private JLabel lblLugarSuceso1;
	private JTextArea lblNotas_1;
	private JLabel lblFotoMascota1;
	private JLabel lbltitulomascota1;
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
	private static ArrayList<Mascota> listaMascotasParaMostrar;
	private int posicionMascotaPanel1;
	private int posicionMascotaPanel2;
	private int posicionMascotaPanel3;
	private Mascota mascotaPanel1;
	private Mascota mascotaPanel2;
	private Mascota mascotaPanel3;
	private static boolean llegoAlLimiteDerecho = false;
	private static boolean llegoAlLimiteIzquierdo = true;
	private JButton btnFlechaDerecha;
	private JTable tablaDeUsuarios;
	private JScrollPane scrollPane_1;
	private JLabel fondoConsultaUsuarios;
	private JPanel panelConsultaDeUsuarios;
	private JLabel lblMensajeListaVacia;
	private DefaultTableModel modeloListaDeUsuarios;
	private DefaultTableModel modeloListaDeMascotas;
	ImageIcon imgfotomascota1;
	ImageIcon imgfotomascota2;
	ImageIcon imgfotomascota3;
	static JMenu mnConfiguracin;
	private static boolean esVisible = true;
	private JRadioButton rdbtnTodosLosUsuarios;
	private JRadioButton rdbtnUsuariosEnLaListaNegra;
	private JMenuItem mntmAsociacinBeneficiaria;
	private JLabel labelTituloAso;
	private JTable tablaConsultaMascotas;
	private JLabel lblPorRaza;
	private JLabel lblPorColorDePelo;
	private JLabel lblPorTipo;
	private JLabel lblPorColorDeOjos;
	private JTextField textFieldBuscarPorNumDeChip;
	private JLabel lblLineaDivisoraPequenia;
	private JButton btnBuscarConsulta;
	private JTextField textFieldBuscarPorLugar;
	private JScrollPane scrollPane_2;
	private JButton btnVer_panel1;
	private JButton btnVer_panel2;
	private JButton btnVer_panel3;
	private JLabel lblTituloDogsLovers;
	private JLabel lbl_panelPerfilMascota_Foto;
	private JLabel lbl_panelPerfilMascota_colorOjos;
	private JLabel lbl_panelPerfilMascota_Tipo;
	private JLabel lbl_panelPerfilMascota_Raza;
	private JLabel lbl_panelPerfilMascota_lNombreMacota;
	private JLabel lbl_panelPerfilMascota_Encargado;
	private JLabel lbl_panelPerfilMacota_Correo;
	private JLabel lbl_panelPerfilMacota_Telefono;
	private JPanel panelPerfilMascota;
	private JLabel lbl_id_macota1;
	private JLabel lbl_id_mascota2;
	private JLabel lbl_id_mascota3;
	private JLabel lblColorOjos;
	private JLabel lblColorPelo;

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

	public VentanaPrincipal() throws IOException {
		try {
			SistemasMascotas.leerMascota();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		initialize();

	}

	private void initialize() throws IOException {
    	
    	listaMascotasParaMostrar =  SistemasMascotas.getListaMascota();
        posicionMascotaPanel1 = listaMascotasParaMostrar.size()-1; posicionMascotaPanel2 = listaMascotasParaMostrar.size()-2; posicionMascotaPanel3 = listaMascotasParaMostrar.size()-3; mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
        mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
        mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
        imgfotomascota1 = new ImageIcon(mascotaPanel1.getFoto());
        imgfotomascota2 = new ImageIcon(mascotaPanel2.getFoto());
        imgfotomascota3 = new ImageIcon(mascotaPanel3.getFoto());
        VentanaPrincipal = new JFrame();
        VentanaPrincipal.setBounds(0, 0, 1435, 735);
        VentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaPrincipal.getContentPane().setLayout(new CardLayout(0, 0));
        VentanaPrincipal.setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
        
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(99, 84, 65));
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
        label_1 = new JLabel("Mostrar Por:");
        label_1 .setForeground(new Color(210, 180, 140));
        label_1 .setFont(new Font("Khmer UI", Font.BOLD, 19));
        label_1.setBounds(54, 144, 147, 30);
        panelPrincipal.add(label_1);
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
        
        btnVer_panel1 = new JButton("Ver mascota");
        btnVer_panel1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		// ir a otro panel con el id  esta mascota! 
        		
        		panelPrincipal.setVisible(false);
        		panelAgregarCasaCuna.setVisible(false);
        		panelAgregarMascota.setVisible(false);
        		panelConsultaDeUsuarios.setVisible(false);
        		panelPerfilMascota.setVisible(true);
        		idMascotaSeleccionada =  mascotaPanel1.getID(); 
        		mascotaPanel1.getEstado();
        		mascotaPanel1.getChip();
        		mascotaPanel1.getColorDeOjos();
        		mascotaPanel1.getColorDePelo();
        		mascotaPanel1.getDiaSuceso();
        		mascotaPanel1.getRaza();
        		mascotaPanel1.getTipo();
        		mascotaPanel1.getIdEncargado();
        		mascotaPanel1.getRecompensa();
        		mascotaPanel1.getNombre(); // nombreMascora
        		
        		
        		
        		cargarPanelPerfilMacota(idMascotaSeleccionada);
        	}
        });
        btnVer_panel1.setBounds(728, 107, 130, 23);
        panelPrimeraMascota.add(btnVer_panel1);
        
        
        lblFotoMascota1 = new JLabel();
        lblFotoMascota1.setBounds(10, 11, 106, 119);
        
         
        lblFotoMascota1.setIcon(new ImageIcon(imgfotomascota1.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
        
        
        lblFotoMascota1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);        
        lblFotoMascota1.setHorizontalAlignment(SwingConstants.CENTER);
        lblFotoMascota1.setBounds(10, 11, 106, 119);
        panelPrimeraMascota.add(lblFotoMascota1);
        
        lbltitulomascota1 = new JLabel();
        lbltitulomascota1.setBounds(126, 11, 309, 14);
        lbltitulomascota1.setText(mascotaPanel1.getTipo()+" " +mascotaPanel1.getEstado()+" en "+mascotaPanel1.getLugarDelSuceso() );
        panelPrimeraMascota.add(lbltitulomascota1);
        
        lblLugarSuceso1 = new JLabel(mascotaPanel1.getLugarDelSuceso());
        lblLugarSuceso1.setBounds(685, 44, 158, 14);
        panelPrimeraMascota.add(lblLugarSuceso1);
        
        lblfechaSuceso = new JLabel(mascotaPanel1.getDiaSuceso());
        lblfechaSuceso.setBounds(728, 11, 130, 14);
        panelPrimeraMascota.add(lblfechaSuceso);
        
        lblNotas_1 = new JTextArea(mascotaPanel1.getNota());
        lblNotas_1.setEditable(false); 
        lblNotas_1.setBounds(126, 40, 528, 78);
        panelPrimeraMascota.add(lblNotas_1);
        
        JLabel lblFondoPanel1 = new JLabel("");
        lblFondoPanel1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        lblFondoPanel1.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        lblFondoPanel1.setBounds(0, 0, 868, 141);
        panelPrimeraMascota.add(lblFondoPanel1);
        
        lbl_id_macota1 = new JLabel("New label");
        lbl_id_macota1.setVisible(false);
        lbl_id_macota1.setBounds(672, 111, 46, 14);
        panelPrimeraMascota.add(lbl_id_macota1);
        
        panelSegundaMascota = new JPanel();
        panelSegundaMascota.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        panelSegundaMascota.setLayout(null);
        panelSegundaMascota.setBounds(347, 284, 868, 141);
        panelPrincipal.add(panelSegundaMascota);
        
        btnVer_panel2 = new JButton("Ver mascota");
        btnVer_panel2.setBounds(728, 107, 130, 23);
        panelSegundaMascota.add(btnVer_panel2);
        
        lblNotas2 = new JTextArea(mascotaPanel2.getNota());
        lblNotas2.setEditable(false);
        lblNotas2.setBounds(126, 40, 525, 74);
        panelSegundaMascota.add(lblNotas2);
        
        lblFotoMascota_2 = new JLabel();
        lblFotoMascota_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblFotoMascota_2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);        
        lblFotoMascota_2.setBounds(10, 11, 106, 119);
       
        lblFotoMascota_2.setIcon(new ImageIcon(imgfotomascota2.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
        panelSegundaMascota.add(lblFotoMascota_2);
        
        lblTituloMascota_2 = new JLabel(mascotaPanel2.getTipo()+" " +mascotaPanel2.getEstado()+" en "+mascotaPanel2.getLugarDelSuceso() );
        lblTituloMascota_2.setBounds(126, 11, 308, 14);
        panelSegundaMascota.add(lblTituloMascota_2);
        
        lblLugar_2 = new JLabel(mascotaPanel2.getLugarDelSuceso() );
        lblLugar_2.setBounds(710, 40, 158, 14);
        panelSegundaMascota.add(lblLugar_2);
        
        lblFecha_2 = new JLabel(mascotaPanel2.getDiaSuceso() );
        lblFecha_2.setBounds(728, 11, 130, 14);
        panelSegundaMascota.add(lblFecha_2);
        
        JLabel labelFondoPanel2 = new JLabel("");
        labelFondoPanel2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        labelFondoPanel2.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        labelFondoPanel2.setBounds(0, 0, 868, 141);
        panelSegundaMascota.add(labelFondoPanel2);
        
        lbl_id_mascota2 = new JLabel("New label");
        lbl_id_mascota2.setBounds(672, 111, 46, 14);
        panelSegundaMascota.add(lbl_id_mascota2);
        
        panelTerceraMascota = new JPanel();
        panelTerceraMascota.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        panelTerceraMascota.setLayout(null);
        panelTerceraMascota.setBounds(347, 439, 868, 141);
        panelPrincipal.add(panelTerceraMascota);
        
        btnVer_panel3 = new JButton("Ver mascota");
        btnVer_panel3.setBounds(728, 107, 130, 23);
        panelTerceraMascota.add(btnVer_panel3);
        
        lblFotoMascota_3 = new JLabel();
        lblFotoMascota_3 .setVerticalAlignment(javax.swing.SwingConstants.CENTER);  
         
        lblFotoMascota_3.setIcon(new ImageIcon(imgfotomascota3.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
        
        
       // lblFotoMascota_3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(mascotaPanel3.getFoto())));
        
        
        lblFotoMascota_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblFotoMascota_3.setBounds(10, 11, 106, 119);
        panelTerceraMascota.add(lblFotoMascota_3);
        
        lblTituloMascota_3 = new JLabel(mascotaPanel3.getTipo()+" " +mascotaPanel3.getEstado()+" en "+mascotaPanel3.getLugarDelSuceso() );
        lblTituloMascota_3.setBounds(126, 11, 376, 14);
        panelTerceraMascota.add(lblTituloMascota_3);
        
        lblLugarSuceso_3 = new JLabel(mascotaPanel3.getLugarDelSuceso() );
        lblLugarSuceso_3.setBounds(710, 40, 158, 14);
        panelTerceraMascota.add(lblLugarSuceso_3);
        
        lblFecha_3 = new JLabel(mascotaPanel3.getDiaSuceso() );
        lblFecha_3.setBounds(728, 11, 130, 14);
        panelTerceraMascota.add(lblFecha_3);
        
        lblNotas_3 = new JTextArea(mascotaPanel3.getNota() );
        lblNotas_3.setBounds(126, 40, 528, 78);
        lblNotas_3.setEditable(false);
        panelTerceraMascota.add(lblNotas_3);
        
        JLabel labelFondoPanel3 = new JLabel("");
        labelFondoPanel3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        labelFondoPanel3.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        labelFondoPanel3.setBounds(0, 0, 868, 141);
        panelTerceraMascota.add(labelFondoPanel3);
        
        lbl_id_mascota3 = new JLabel("New label");
        lbl_id_mascota3.setBounds(672, 111, 46, 14);
        panelTerceraMascota.add(lbl_id_mascota3);
        
        btnFlechaDerecha = new JButton("");
        btnFlechaDerecha.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) { 
        		
        		if(!llegoAlLimiteDerecho){
        		
        			llegoAlLimiteIzquierdo = false;
	        		posicionMascotaPanel1 -= 3; posicionMascotaPanel2 -= 3; posicionMascotaPanel3 -= 3;
		        	if(posicionMascotaPanel1 < 0 || posicionMascotaPanel2 < 0 || posicionMascotaPanel3 < 0){
		        		llegoAlLimiteDerecho = true;
		        	}
		        	
		        	if(posicionMascotaPanel1 != -1){
	        		
		        		if(posicionMascotaPanel1 >= 0){	
		        			
			        		mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
			        		imgfotomascota1 = new ImageIcon(mascotaPanel1.getFoto());
		    	            lblFotoMascota1.setIcon(new ImageIcon(imgfotomascota1.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
			        		lbltitulomascota1.setText(mascotaPanel1.getTipo()+" " +mascotaPanel1.getEstado()+" en "+mascotaPanel1.getLugarDelSuceso() );
			        		lblfechaSuceso.setText(mascotaPanel1.getDiaSuceso());
			        		lblNotas_1.setText(mascotaPanel1.getNota());
			        		lblLugarSuceso1.setText(mascotaPanel1.getLugarDelSuceso());
			        		habilitarPanel1();
			        	}else{
			        		ocultarPanel1();
			        	}
	        		
		        		if(posicionMascotaPanel2 >= 0){
		        			
		    	        	
		    	        	
			        		mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
			        		imgfotomascota2 = new ImageIcon(mascotaPanel2.getFoto());
			        		lblFotoMascota_2.setIcon(new ImageIcon(imgfotomascota2.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
			                lblTituloMascota_2.setText(mascotaPanel2.getTipo()+" " +mascotaPanel2.getEstado()+" en "+mascotaPanel2.getLugarDelSuceso() );
			                lblFecha_2.setText(mascotaPanel2.getDiaSuceso());
			                lblNotas2.setText(mascotaPanel2.getNota());
			                lblLugar_2.setText(mascotaPanel2.getLugarDelSuceso());
			                habilitarPanel2();
			                
			        	}else{
			        		
			        		ocultarPanel2();
			        	}
			        	
			        	if(posicionMascotaPanel3 >= 0){
			        		
			        		mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
			        		imgfotomascota3 = new ImageIcon(mascotaPanel3.getFoto());
			        		lblFotoMascota_3.setIcon(new ImageIcon(imgfotomascota3.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
			                lblTituloMascota_3.setText(mascotaPanel3.getTipo()+" " +mascotaPanel3.getEstado()+" en "+mascotaPanel3.getLugarDelSuceso() );
			                lblFecha_3.setText(mascotaPanel3.getDiaSuceso());
			                lblNotas_3.setText(mascotaPanel3.getNota());
			                lblLugarSuceso_3.setText(mascotaPanel3.getLugarDelSuceso());
			                habilitarPanel3();
			        	}else{
			        		ocultarPanel3();
			        	}
		        	}
		        	else{
		        		llegoAlLimiteDerecho = true;
		        		posicionMascotaPanel1 += 3; posicionMascotaPanel2 += 3; posicionMascotaPanel3 += 3; }
        		}
        	}
        });
        btnFlechaDerecha.setHorizontalTextPosition(SwingConstants.CENTER);
        btnFlechaDerecha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnFlechaDerecha.setRequestFocusEnabled(true);
        btnFlechaDerecha.setPressedIcon(new ImageIcon("./imgs/flechaDerecha-32.png"));
        btnFlechaDerecha.setRolloverIcon(new ImageIcon("./imgs/flechaDerecha-64.png"));
        btnFlechaDerecha.setFocusable(false);
        btnFlechaDerecha.setFocusTraversalKeysEnabled(false);
        btnFlechaDerecha.setFocusPainted(false);
        btnFlechaDerecha.setBorderPainted(false);
        btnFlechaDerecha.setDefaultCapable(false);
        btnFlechaDerecha.setContentAreaFilled(false);
        btnFlechaDerecha.setIcon(new ImageIcon("./imgs/flechaDerecha-48.png"));
        btnFlechaDerecha.setBounds(1064, 582, 151, 44);
        panelPrincipal.add(btnFlechaDerecha);
        
        JButton btnFlechaIzquierda = new JButton("");
        btnFlechaIzquierda.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(!llegoAlLimiteIzquierdo){
        			panelPrimeraMascota.setVisible(true);
        			panelSegundaMascota.setVisible(true);
        			panelTerceraMascota.setVisible(true);
        			llegoAlLimiteDerecho = false;
	        		posicionMascotaPanel1 += 3;
	        		if(posicionMascotaPanel1 < listaMascotasParaMostrar.size()){
	        			
	    	            mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
	    	            imgfotomascota1 = new ImageIcon(mascotaPanel1.getFoto());
	    	            lblFotoMascota1.setIcon(new ImageIcon(imgfotomascota1.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
		        		lbltitulomascota1.setText(mascotaPanel1.getTipo()+" " +mascotaPanel1.getEstado()+" en "+mascotaPanel1.getLugarDelSuceso() );
		        		lblfechaSuceso.setText(mascotaPanel1.getDiaSuceso());
		        		lblNotas_1.setText(mascotaPanel1.getNota());
		        		lblLugarSuceso1.setText(mascotaPanel1.getLugarDelSuceso());
		        		lblFotoMascota1.setVisible(true);
		                lbltitulomascota1.setVisible(true);
		                lblfechaSuceso.setVisible(true);
		                lblNotas_1.setVisible(true);
		                lblLugarSuceso1.setVisible(true);
	        		}

	        		posicionMascotaPanel2 += 3;
	        		if(posicionMascotaPanel2 < listaMascotasParaMostrar.size()){
		        		
			        	
		        		mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
		        		imgfotomascota2 = new ImageIcon(mascotaPanel2.getFoto());
			        	lblFotoMascota_2.setIcon(new ImageIcon(imgfotomascota2.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
		                lblTituloMascota_2.setText(mascotaPanel2.getTipo()+" " +mascotaPanel2.getEstado()+" en "+mascotaPanel2.getLugarDelSuceso() );
		                lblFecha_2.setText(mascotaPanel2.getDiaSuceso());
		                lblNotas2.setText(mascotaPanel2.getNota());
		                lblLugar_2.setText(mascotaPanel2.getLugarDelSuceso());
		                lblFotoMascota_2.setVisible(true);
		                lblTituloMascota_2.setVisible(true);
		                lblFecha_2.setVisible(true);
		                lblNotas2.setVisible(true);
		                lblLugar_2.setVisible(true);
	        		}
	        		
	        		posicionMascotaPanel3 += 3;
		        	if(posicionMascotaPanel3 < listaMascotasParaMostrar.size()){
		        		
			        	mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
			        	imgfotomascota3 = new ImageIcon(mascotaPanel3.getFoto());
			        	lblFotoMascota_3.setIcon(new ImageIcon(imgfotomascota3.getImage().getScaledInstance(106,119,Image.SCALE_SMOOTH)));
		                lblTituloMascota_3.setText(mascotaPanel3.getTipo()+" " +mascotaPanel3.getEstado()+" en "+mascotaPanel3.getLugarDelSuceso() );
		                lblFecha_3.setText(mascotaPanel3.getDiaSuceso());
		                lblNotas_3.setText(mascotaPanel3.getNota());
		                lblLugarSuceso_3.setText(mascotaPanel3.getLugarDelSuceso());
		                lblFotoMascota_3.setVisible(true);
		                lblTituloMascota_3.setVisible(true);
		                lblFecha_3.setVisible(true);
		                lblNotas_3.setVisible(true);
		                lblLugarSuceso_3.setVisible(true);
		        	}

		        	if(posicionMascotaPanel1 == listaMascotasParaMostrar.size() - 1 ){
		        		llegoAlLimiteIzquierdo = true;
		        	}
        		}
        	}
        });
        btnFlechaIzquierda.setFocusable(false);
        btnFlechaIzquierda.setFocusTraversalKeysEnabled(false);
        btnFlechaIzquierda.setFocusPainted(false);
        btnFlechaIzquierda.setContentAreaFilled(false);
        btnFlechaIzquierda.setBorderPainted(false);
        btnFlechaIzquierda.setPressedIcon(new ImageIcon("./imgs/flechaIzquierda-32.png"));
        btnFlechaIzquierda.setRolloverIcon(new ImageIcon("./imgs/flechaIzquierda-64.png"));
        btnFlechaIzquierda.setIcon(new ImageIcon("./imgs/flechaIzquierda-48.png"));
        btnFlechaIzquierda.setBounds(347, 591, 151, 44);
        panelPrincipal.add(btnFlechaIzquierda);
        
        JComboBox comboBoxEstado = new JComboBox();
        comboBoxEstado.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		opcEstado = (String)comboBoxEstado.getSelectedItem();
        		System.out.println(opcEstado);
        		if(opcEstado.equals("Todos"))
        			opcEstado = " ";
        		refrescarPaneles();
        	}
        });
        comboBoxEstado.setEditable(true);
        comboBoxEstado.setBounds(148, 192, 137, 23);
        panelPrincipal.add(comboBoxEstado);
        String datos = "Todos,";
        for(String str : Sistema.getListaEstados())
        	datos += str + ",";
        String listaDatos[] = datos.split(",");
        comboBoxEstado.setModel(new DefaultComboBoxModel(listaDatos));

        JComboBox comboBoxRaza = new JComboBox();
        comboBoxRaza.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		opcRaza = (String)comboBoxRaza.getSelectedItem();
        		if(opcRaza.equals("Todos"))
        			opcRaza = " ";
        		refrescarPaneles();
        	}
        });
        comboBoxRaza.setModel(new DefaultComboBoxModel(new String[] {"Todos"}));
        comboBoxRaza.setEditable(true);
        comboBoxRaza.setBounds(148, 314, 137, 23);
        panelPrincipal.add(comboBoxRaza);
        
        
        JComboBox comboBoxTipo = new JComboBox();
        comboBoxTipo.setEditable(true);
        comboBoxTipo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
        		opcTipo = (String)comboBoxTipo.getSelectedItem();        		
        		if(opcTipo.equals("Todos")){
        			opcTipo = " ";
        			comboBoxRaza.setModel(new DefaultComboBoxModel(new String[] {" "}));
        		}
        		else{        			
	        		String datos = "Todos,";
	                for(String str : Sistema.getListaRazas(opcTipo))
	                	datos += str + ",";
	                String listaDatos[] = datos.split(",");        		
	        		comboBoxRaza.setModel(new DefaultComboBoxModel(listaDatos));
        		}
        		System.out.println(opcTipo);
        		refrescarPaneles();
        		
        		
        		
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
        	}
        });
        comboBoxTipo.setBounds(148, 249, 138, 23);
        panelPrincipal.add(comboBoxTipo);
        datos = "Todos,";
        for(String str : Sistema.getListaTipo())
        	datos += str + ",";
        listaDatos = datos.split(",");
        comboBoxTipo.setModel(new DefaultComboBoxModel(listaDatos));
        
        
        JComboBox comboBoxOjos = new JComboBox();
        comboBoxOjos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		opcColorDeOjos = (String)comboBoxOjos.getSelectedItem();
        		System.out.println(opcColorDeOjos);
        		
        		if(opcColorDeOjos.equals("Todos")){
        			opcColorDeOjos = " ";
        			System.out.println("entro!!");
        		}
        		refrescarPaneles();
        	}
        });
        comboBoxOjos.setEditable(true);
        comboBoxOjos.setBounds(148, 375, 137, 22);
        panelPrincipal.add(comboBoxOjos);
        
        datos = "Todos,";
        for(String str : Sistema.getListaColorDeOjos())
        	datos += str + ",";
        listaDatos = datos.split(",");
        comboBoxOjos.setModel(new DefaultComboBoxModel(listaDatos));
        
        JComboBox comboBoxPelo = new JComboBox();
        comboBoxPelo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		opcColorDePelo = (String)comboBoxPelo.getSelectedItem();
        		System.out.println(opcColorDePelo);
        		if(opcColorDePelo.equals("Todos"))
        			opcColorDePelo = " ";
        		refrescarPaneles();
        	}
        });
        comboBoxPelo.setEditable(true);
        comboBoxPelo.setBounds(148, 431, 137, 23);
        panelPrincipal.add(comboBoxPelo);
        datos = "Todos,";
        for(String str : Sistema.getListaColorDePelo())
        	datos += str + ",";
        listaDatos = datos.split(",");
        comboBoxPelo.setModel(new DefaultComboBoxModel(listaDatos));
        
        JLabel lblTipo = new JLabel("Estado");
        lblTipo.setForeground(new Color(210, 180, 140));
        lblTipo.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblTipo.setBounds(54, 185, 71, 30);
        panelPrincipal.add(lblTipo);
        
        JLabel label_3 = new JLabel("Tipo");
        label_3.setForeground(new Color(210, 180, 140));
        label_3.setFont(new Font("Khmer UI", Font.BOLD, 19));
        label_3.setBounds(54, 243, 51, 30);
        panelPrincipal.add(label_3);
        
        JLabel lblRaza_1 = new JLabel("Raza");
        lblRaza_1.setForeground(new Color(210, 180, 140));
        lblRaza_1.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblRaza_1.setBounds(54, 307, 51, 30);
        panelPrincipal.add(lblRaza_1);
        
        JLabel lblOjos = new JLabel("Ojos");
        lblOjos.setForeground(new Color(210, 180, 140));
        lblOjos.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblOjos.setBounds(54, 368, 51, 30);
        panelPrincipal.add(lblOjos);
        
        JLabel lblPelo = new JLabel("Pelo");
        lblPelo.setForeground(new Color(210, 180, 140));
        lblPelo.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblPelo.setBounds(54, 424, 51, 30);
        panelPrincipal.add(lblPelo);
        
        label_2 = new JLabel("");
        label_2 .setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        label_2 .setForeground(new Color(210, 180, 140));
        label_2 .setFont(new Font("Khmer UI", Font.BOLD, 19));
        label_2.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        label_2.setBounds(34, 132, 273, 448);
        panelPrincipal.add(label_2);
        
        
        panelAgregarMascota = new JPanel();
        panelAgregarMascota.setBackground(new Color(99,84, 65));
        VentanaPrincipal.getContentPane().add(panelAgregarMascota, "name_27990074221032");
        panelAgregarMascota.setLayout(null);
        panelAgregarMascota.setVisible(false);
        
        comboBoxColorPelaje = new JComboBox();
        try {
			for(String obj: Sistema.getListaColorDePelo()){
				comboBoxColorPelaje.addItem(obj);
			}
			
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        
        comboBoxColorPelaje.setBounds(320, 468, 233, 19);
        panelAgregarMascota.add(comboBoxColorPelaje);
        
        lblFotoMascota = new JLabel("");
        lblFotoMascota.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.WHITE, null));
        lblFotoMascota.setBounds(995, 61, 142, 141);
        panelAgregarMascota.add(lblFotoMascota);
        
        JLabel lblImagenDeLa = new JLabel("Imagen de la Mascota");
        lblImagenDeLa.setForeground(Color.WHITE);
        lblImagenDeLa.setFont(new Font("Khmer UI", Font.BOLD, 19));
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
                    String nombre =      archivoSeleccionado.getName();                    
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
                Sistema.crearCarpetaImagenesMascotas();
                Sistema.asignarIDFoto();
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
        chckbxRecompensa.setFont(new Font("Khmer UI", Font.BOLD, 19));
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
            	 try {
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
	                if(SistemasMascotas.ChipYaEstaRegistrado(chip)){
	                    JOptionPane.showMessageDialog(panelAgregarMascota, "Mascota ya ha sido registrada");
	                    return ;
	                }
	                if(getFoto() == null){           
	                    JOptionPane.showMessageDialog(panelAgregarMascota, "Debe agregar fotografia");
	                    return;
	                }
	                if( nombre == null){
	                    JOptionPane.showMessageDialog(panelAgregarMascota, "Ingrese el nombre de la mascota");
	                    return;
	                }else{
	                    
	                    Mascota NuevaMascota = new Mascota(estado, tipo, raza, nombre, chip, colorDePelo, colorDeOjos, getFoto(), lugarVisto, nota, fechaSuceso, recompensa, idEncargado);
	                    
	                    if(SistemasMascotas.hayCoincidencias(raza, colorDePelo, colorDeOjos, estado,IDUsuarioActivo))
	                    	JOptionPane.showMessageDialog(null, "Se encontran coincidencias. Se le enviara un correo con mas información");
	                    	
	                    
	                    
	                    SistemasMascotas.AgregarMascota(NuevaMascota);
						
	                    textFieldNombreMascota.setText(null);
	                    textFieldNumChip.setText(null);
	                    lblFotoMascota.setIcon(null);
	                    textFieldMontoRecompensa.setText(null);
	                    editorPaneNotas.setText(null);
	                    nombre = null;
	                    chip = null;
	                    recompensa = null;
	                    setFoto(null);
	                    
	                    JOptionPane.showMessageDialog(panelAgregarMascota, "Mascota registrada correctamente"); 
	                    panelAgregarMascota.setVisible(false);
	                    panelPrincipal.setVisible(true);
	                 }
            	 } catch (IOException e1) {
						e1.printStackTrace();
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
        lblMonto.setFont(new Font("Khmer UI", Font.BOLD, 19));
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
        lblEstado.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblEstado.setBounds(32, 134, 214, 23);
        panelAgregarMascota.add(lblEstado);
        
        JLabel lblTipoDeMascota = new JLabel("Tipo de Mascota");
        lblTipoDeMascota.setForeground(Color.WHITE);
        lblTipoDeMascota.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblTipoDeMascota.setBounds(32, 207, 186, 23);
        panelAgregarMascota.add(lblTipoDeMascota);
        
        JLabel lblRaza = new JLabel("Raza");
        lblRaza.setForeground(Color.WHITE);
        lblRaza.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblRaza.setBounds(32, 271, 186, 23);
        panelAgregarMascota.add(lblRaza);
        
        final JLabel lblNombreDeLa = new JLabel("Nombre de la Mascota");
        lblNombreDeLa.setForeground(Color.WHITE);
        lblNombreDeLa.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblNombreDeLa.setBounds(33, 333, 214, 23);
        panelAgregarMascota.add(lblNombreDeLa);
        
        final JLabel lblNumeroDeChip = new JLabel("N\u00FAmero de Chip");
        lblNumeroDeChip.setForeground(Color.WHITE);
        lblNumeroDeChip.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblNumeroDeChip.setBounds(33, 397, 225, 23);
        panelAgregarMascota.add(lblNumeroDeChip);
        
        JLabel lblColorDelPelaje = new JLabel("Color del Pelaje");
        lblColorDelPelaje.setForeground(Color.WHITE);
        lblColorDelPelaje.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblColorDelPelaje.setBounds(32, 464, 186, 23);
        panelAgregarMascota.add(lblColorDelPelaje);
        
        JLabel lblColorDeOjos = new JLabel("Color de Ojos");
        lblColorDeOjos.setForeground(Color.WHITE);
        lblColorDeOjos.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblColorDeOjos.setBounds(32, 527, 186, 23);
        panelAgregarMascota.add(lblColorDeOjos);
        
        final JLabel lblSitioDeHallazgoperdida = new JLabel("Sitio de P\u00E9rdida");
        lblSitioDeHallazgoperdida.setForeground(Color.WHITE);
        lblSitioDeHallazgoperdida.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblSitioDeHallazgoperdida.setBounds(707, 290, 177, 23);
        panelAgregarMascota.add(lblSitioDeHallazgoperdida);
        
        final JLabel lblFechaDeHallazgoperdida = new JLabel("Fecha de P\u00E9rdida");
        lblFechaDeHallazgoperdida.setForeground(Color.WHITE);
        lblFechaDeHallazgoperdida.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblFechaDeHallazgoperdida.setBounds(707, 237, 163, 23);
        panelAgregarMascota.add(lblFechaDeHallazgoperdida);
        
        JLabel lblNotas = new JLabel("Notas");
        lblNotas.setForeground(Color.WHITE);
        lblNotas.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblNotas.setBounds(707, 389, 384, 28);
        panelAgregarMascota.add(lblNotas);
        
        rdbtnPerdida = new JRadioButton("Perdida");
        rdbtnPerdida.setFont(new Font("Khmer UI", Font.BOLD, 13));
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
        rdbtnEncontrada.setFont(new Font("Khmer UI", Font.BOLD, 13));
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
         try {
			comboBoxTipoMascota.setModel(new DefaultComboBoxModel(Sistema.getListaTipo()));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
         
         comboBoxTipoMascota.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
	            	try {
	            	String opcTipo = (String)comboBoxTipoMascota.getSelectedItem();
						comboBoxRazaMascota.setModel(new DefaultComboBoxModel(Sistema.getListaRazas(opcTipo))); } catch (IOException e1) {
						e1.printStackTrace();
					}
	            
	            	
	           }
         }
            
         );
        comboBoxTipoMascota.setBounds(320, 208, 233, 20);
        panelAgregarMascota.add(comboBoxTipoMascota);
        
       comboBoxRazaMascota = new JComboBox();

        
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
		try {
			for(String obj: Sistema.getListaColorDeOjos())
				comboBoxColorOjos.addItem(obj);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

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
        
        
        
        //////////////////////////////////Codigo panel Mascota fin///////////////////////////////////////////////////////////////
    
        
        panelAgregarCasaCuna = new JPanel();
        panelAgregarCasaCuna.setBackground(new Color(99,84,65));
        VentanaPrincipal.getContentPane().add(panelAgregarCasaCuna, "name_28003406149630");
        panelAgregarCasaCuna.setLayout(null);
        
        
///////////////////////Inicio codigo casa Cuna//////////////////////////////////////////////
        
        
        buttonGuardarCC = new JButton("");
        buttonGuardarCC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	//try {
	              
            	String tamanoMascota = (String) comboBoxTamanoMascotaCC.getSelectedItem();
	            String tipoMascota =(String) comboBoxTipoMascotaCC.getSelectedItem();
	            Boolean necesitaDonacion = verificarNecesitaDonacion();
	            Boolean necesitaMedicamentos = verificarNecesitaMedicamentos();
	            int cantMascotas =(int) spinnerCantidadDeMascotaCC.getValue();
	            int camposDisponibles =(int) spinnerCantidadDeMascotaCC.getValue();
	            String direccionCC = comboBoxCantonCasaCuna.getSelectedItem().toString() + ", " + comboBoxProvinciaCasaCuna.getSelectedItem().toString();
	            int idUsuarioCasaCuna = IDUsuarioActivo;
	              
	            CasaCuna nuevaCasaCuna = new CasaCuna(tamanoMascota, tipoMascota,necesitaDonacion, necesitaMedicamentos, cantMascotas, camposDisponibles, direccionCC, idUsuarioCasaCuna);
	               
	            // nuevaCasaCuna.leerCasaCuna();	                
	            //nuevaCasaCuna.GuardarCasaCuna(CasaCuna.getListaCasasCuna());
	            CasaCuna.getListaCasasCuna().add(nuevaCasaCuna);
	                
	                
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
        try {
			comboBoxTipoMascotaCC.setModel(new DefaultComboBoxModel(Sistema.getListaTipo()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
        lblnecesitarDonacionesDe_1.setFont(new Font("Khmer UI", Font.BOLD, 19));
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
        lblnecesitarDonacionesDe.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblnecesitarDonacionesDe.setBounds(749, 176, 373, 30);
        panelAgregarCasaCuna.add(lblnecesitarDonacionesDe);

        JLabel lblDireccionCasaCuna = new JLabel("Direccion Casa Cuna");
        lblDireccionCasaCuna.setForeground(Color.WHITE);
        lblDireccionCasaCuna.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblDireccionCasaCuna.setBounds(749, 312, 203, 23);
        panelAgregarCasaCuna.add(lblDireccionCasaCuna);
        
        JLabel lblTamaoDeMascota = new JLabel("Tama\u00F1o de Mascota a Recibir");
        lblTamaoDeMascota.setForeground(Color.WHITE);
        lblTamaoDeMascota.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblTamaoDeMascota.setBounds(69, 182, 270, 23);
        panelAgregarCasaCuna.add(lblTamaoDeMascota);
        
        lblTipoDeMascota = new JLabel("Tipo de Mascota");
        lblTipoDeMascota.setForeground(Color.WHITE);
        lblTipoDeMascota.setFont(new Font("Khmer UI", Font.BOLD, 19));
        lblTipoDeMascota.setBounds(69, 276, 146, 23);
        panelAgregarCasaCuna.add(lblTipoDeMascota);
        
        JLabel lblCantidadDeMascotas = new JLabel("\u00BFCu\u00E1ntas Mascotas Podr\u00E9 Recibir? ");
        lblCantidadDeMascotas.setForeground(Color.WHITE);
        lblCantidadDeMascotas.setFont(new Font("Khmer UI", Font.BOLD, 19));
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
                    comboBoxCantonCasaCuna.setModel(new DefaultComboBoxModel(new String[] {"Central","  Barva","Santo Domingo","Santa Barbara","San Rafael","San Isidro","Belén","Flores","San Pablo","Sarapiqui"}))  ;
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
        
        
        
//////////////////////////////////////*fin codigo Casa Cuna*/////////////////////////////////////////////////////////////////

        
        JMenuBar menuBar = new JMenuBar();
        VentanaPrincipal.setJMenuBar(menuBar);
        
        mnRegistro = new JMenu("Registro");
        mnRegistro.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent arg0) {
                    //if(CasaCuna.esCasacuna(IDUsuarioActivo)){
            		if(Sistema.esCasacuna(IDUsuarioActivo)){
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
        		panelAgregarCasaCuna.setVisible(false);
        		panelAgregarMascota.setVisible(true);
        		panelConsultaDeUsuarios.setVisible(false);
        	
            }
        });
        mnRegistro.add(mntmMascota);
        
        mntmCasaCuna = new JMenuItem("Casa Cuna");
        mntmCasaCuna.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.setVisible(false);
        		panelAgregarCasaCuna.setVisible(true);
        		panelAgregarMascota.setVisible(false);
        		panelConsultaDeUsuarios.setVisible(false);
        	
            }
        });
        mntmCasaCuna.setIcon(new ImageIcon("./imgs/casaCuna.png"));
        mnRegistro.add(mntmCasaCuna);
        
        mntmAsociacinBeneficiaria = new JMenuItem("Asociaci\u00F3n Beneficiaria");
        mntmAsociacinBeneficiaria.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		VentanaRegistroAsociaciónBeneficiaria asobene = new VentanaRegistroAsociaciónBeneficiaria();
        		asobene.setVisible(true);
        	}
        });
        mntmAsociacinBeneficiaria.setVisible(esVisible);
        mntmAsociacinBeneficiaria.setIcon(new ImageIcon("./imgs/AsociBene32.png"));
        mnRegistro.add(mntmAsociacinBeneficiaria);
        
        JMenu mnConsulta = new JMenu("Consulta");
        mnConsulta.setIcon(new ImageIcon("./imgs/Consulta.png"));
        menuBar.add(mnConsulta);
        
        JMenuItem mntmConsutaMiPerfil = new JMenuItem("Mi Perfil");
        mntmConsutaMiPerfil.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		VentanaPerfilUsuario ventanaMiPerfil = new VentanaPerfilUsuario(IDUsuarioActivo);
        		ventanaMiPerfil.setVisible(true);
        	}
        });
        mntmConsutaMiPerfil.setIcon(new ImageIcon("./imgs/Perfil.png"));
        mnConsulta.add(mntmConsutaMiPerfil);
        
        JMenuItem mntmConsultaUsuarios = new JMenuItem("Usuarios");
        mnConsulta.add(mntmConsultaUsuarios);
        mntmConsultaUsuarios.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelPrincipal.setVisible(false);
        		
        		panelAgregarCasaCuna.setVisible(false);
        		panelAgregarMascota.setVisible(false);
        		panelConsultaDeUsuarios.setVisible(true);
        		
        		if(SistemasUsuarios.getListaDeUsuariosSize() == 0){
        			tablaDeUsuarios.setVisible(false);
        			lblMensajeListaVacia.setVisible(true);
        		}else{
        			tablaDeUsuarios.setVisible(true);
        			lblMensajeListaVacia.setVisible(false);
        		}
        	}
        });
        
        JMenuItem mntmConsultaMascota = new JMenuItem("Mascotas");
        mntmConsultaMascota.setIcon(new ImageIcon("./imgs/Pets-30.png"));         
        mnConsulta.add(mntmConsultaMascota);
        mntmConsultaMascota.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelPrincipal.setVisible(false);
        		panelConsultaDeMascotas.setVisible(true);
        	}
        });
        
        JMenuItem mntmConsutarCasaCuna = new JMenuItem("Casa Cuna");
        mntmConsutarCasaCuna.setIcon(new ImageIcon("./imgs/casaCuna.png"));
        mnConsulta.add(mntmConsutarCasaCuna);
        
        JMenuItem mntmConsultarAsociacinBeneficiaria = new JMenuItem("Asociaci\u00F3n Beneficiaria");
        mntmConsultarAsociacinBeneficiaria.setIcon(new ImageIcon("./imgs/AsociBene32.png"));
        mnConsulta.add(mntmConsultarAsociacinBeneficiaria);
        
        JMenu mnAdopciones = new JMenu("Adopciones");
        menuBar.add(mnAdopciones);
        
        JMenuItem mntmAdoptarUnaMascota = new JMenuItem("Adoptar una Mascota");
        mntmAdoptarUnaMascota.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		VentanaRegistroAdopcion ventanaRegistroAdopcion;
				try {
					ventanaRegistroAdopcion = new VentanaRegistroAdopcion();
					ventanaRegistroAdopcion.setVisible(true);
					ventanaRegistroAdopcion.setLocation(posicionMascotaPanel1, posicionMascotaPanel1);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
        		
        		
        	}
        });
        mnAdopciones.add(mntmAdoptarUnaMascota);
        
        JMenuItem mntmCalificarUnaAdopcin = new JMenuItem("Calificar una Adopci\u00F3n");
        mntmCalificarUnaAdopcin.setIcon(new ImageIcon("./imgs/Calificacion-32.png"));
        mnAdopciones.add(mntmCalificarUnaAdopcin);
        
        mnConfiguracin = new JMenu("Configuraci\u00F3n");
        mnConfiguracin.setVisible(esVisible);
        mnConfiguracin.setEnabled(esVisible);
        mnConfiguracin.setIcon(new ImageIcon("./imgs/params-32.png"));
        menuBar.add(mnConfiguracin);
        
        JMenuItem mntmAdministracion = new JMenuItem("Administrador");
        mntmAdministracion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		VentanaConfiguracion ventanaConfiguracion  = new VentanaConfiguracion();
        		ventanaConfiguracion.setVisible(true);
        		
        	}
        });
        mntmAdministracion.setIcon(new ImageIcon("./imgs/admin.png"));
        mnConfiguracin.add(mntmAdministracion);
        panelAgregarCasaCuna.setVisible(false);

/////////////////////////////////////// Inicio Código Consulta Mascotas //////////////////////////////////////////////////////
        
        panelConsultaDeMascotas = new JPanel();
        panelConsultaDeMascotas.setBackground(new Color(99,84,65));
        VentanaPrincipal.getContentPane().add(panelConsultaDeMascotas, "name_28003406149630");
        panelConsultaDeMascotas.setLayout(null);
        
        scrollPane_2 = new JScrollPane();
        scrollPane_2.setBounds(567, 191, 749, 436);
        panelConsultaDeMascotas.add(scrollPane_2);
        String[] columnaConsultaMascotas = {"ID", "Estado", "Tipo", "Raza", "Color de Pelo", "Color de Ojos", "Número de chip", "Lugar"};
        String[] filaConsultaMascotas = new String[8];
        modeloListaDeMascotas = new DefaultTableModel(columnaConsultaMascotas, 0);
		
        tablaConsultaMascotas = new JTable(){
			public boolean isCellEditable(int row, int column){  
		    return false;  
			} 
        };
        scrollPane_2.setViewportView(tablaConsultaMascotas);
        tablaConsultaMascotas.setRowSelectionAllowed(true);
        tablaConsultaMascotas.setCellSelectionEnabled(true);
        tablaConsultaMascotas.setBorder(new LineBorder(new Color(189, 183, 107)));
        tablaConsultaMascotas.setForeground(new Color(139, 69, 19));
        tablaConsultaMascotas.setRowHeight(15);
        tablaConsultaMascotas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaConsultaMascotas.setVisible(true);
        tablaConsultaMascotas.setEnabled(true);
        modeloListaDeMascotas = Sistema.cargarTablaDeMascotas(filaConsultaMascotas, modeloListaDeMascotas);
        tablaConsultaMascotas.setModel(modeloListaDeMascotas);
        tablaConsultaMascotas.getColumnModel().getColumn(0).setPreferredWidth(30);
        tablaConsultaMascotas.getColumnModel().getColumn(1).setPreferredWidth(95);
        tablaConsultaMascotas.getColumnModel().getColumn(2).setPreferredWidth(65);
        tablaConsultaMascotas.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaConsultaMascotas.getColumnModel().getColumn(4).setPreferredWidth(105);
        tablaConsultaMascotas.getColumnModel().getColumn(5).setPreferredWidth(100);
        tablaConsultaMascotas.getColumnModel().getColumn(6).setPreferredWidth(90);
        tablaConsultaMascotas.getColumnModel().getColumn(7).setPreferredWidth(160);
        
        JLabel lblBuscarMascotas = new JLabel("Buscar mascotas:\r\n");
        lblBuscarMascotas.setForeground(new Color(189, 183, 107));
        lblBuscarMascotas.setFont(new Font("Khmer UI", Font.PLAIN, 20));
        lblBuscarMascotas.setHorizontalAlignment(SwingConstants.CENTER);
        lblBuscarMascotas.setBounds(30, 170, 200, 50);
        panelConsultaDeMascotas.add(lblBuscarMascotas);
        
        JComboBox comboBoxPorEstado = new JComboBox();
        comboBoxPorEstado.setModel(new DefaultComboBoxModel(Sistema.arrayToString(Sistema.getListaEstados())));
        comboBoxPorEstado.setForeground(new Color(0, 0, 0));
        comboBoxPorEstado.setFont(new Font("Khmer UI", Font.PLAIN, 14));
        comboBoxPorEstado.setBounds(63, 427, 166, 20);
        panelConsultaDeMascotas.add(comboBoxPorEstado);
        
        JComboBox comboBoxPorTipo = new JComboBox();
        comboBoxPorTipo.setModel(new DefaultComboBoxModel(Sistema.getListaTipo()));
        comboBoxPorTipo.setForeground(Color.BLACK);
        comboBoxPorTipo.setFont(new Font("Khmer UI", Font.PLAIN, 14));
        comboBoxPorTipo.setBounds(283, 427, 166, 20);
        panelConsultaDeMascotas.add(comboBoxPorTipo);
        String tipoElegido = (String) comboBoxPorTipo.getSelectedItem();
        
        JComboBox comboBoxPorRaza = new JComboBox();
        comboBoxPorRaza.setModel(new DefaultComboBoxModel(Sistema.getListaRazas(tipoElegido)));
        comboBoxPorRaza.setForeground(Color.BLACK);
        comboBoxPorRaza.setFont(new Font("Khmer UI", Font.PLAIN, 14));
        comboBoxPorRaza.setBounds(63, 501, 166, 20);
        panelConsultaDeMascotas.add(comboBoxPorRaza);
        
        JComboBox comboBoxPorColorOjos = new JComboBox();
        comboBoxPorColorOjos.setModel(new DefaultComboBoxModel(Sistema.arrayToString(Sistema.getListaColorDeOjos())));
        comboBoxPorColorOjos.setForeground(Color.BLACK);
        comboBoxPorColorOjos.setFont(new Font("Khmer UI", Font.PLAIN, 14));
        comboBoxPorColorOjos.setBounds(283, 501, 166, 20);
        panelConsultaDeMascotas.add(comboBoxPorColorOjos);
        
        JComboBox comboBoxPorPelo = new JComboBox();
        comboBoxPorColorOjos.setModel(new DefaultComboBoxModel(Sistema.arrayToString(Sistema.getListaColorDeOjos())));
        comboBoxPorPelo.setForeground(Color.BLACK);
        comboBoxPorPelo.setFont(new Font("Khmer UI", Font.PLAIN, 14));
        comboBoxPorPelo.setBounds(63, 577, 166, 20);
        panelConsultaDeMascotas.add(comboBoxPorPelo);
        
        JLabel lblMascotas = new JLabel("Mascotas");
        lblMascotas.setForeground(new Color(189, 183, 107));
        lblMascotas.setFont(new Font("Khmer UI", Font.BOLD, 47));
        lblMascotas.setHorizontalAlignment(SwingConstants.CENTER);
        lblMascotas.setBounds(21, 26, 277, 80);
        panelConsultaDeMascotas.add(lblMascotas);
        
        JLabel label = new JLabel("__________________________________");
        label.setForeground(new Color(107, 142, 35));
        label.setFont(new Font("Tahoma", Font.BOLD, 60));
        label.setBounds(42, -16, 1318, 227);
        panelConsultaDeMascotas.add(label);
        
        JLabel lblPorEstado = new JLabel("ESTADO");
        lblPorEstado.setHorizontalAlignment(SwingConstants.CENTER);
        lblPorEstado.setForeground(new Color(189, 183, 107));
        lblPorEstado.setFont(new Font("Khmer UI", Font.BOLD, 14));
        lblPorEstado.setBounds(53, 375, 84, 50);
        panelConsultaDeMascotas.add(lblPorEstado);
        
        lblPorRaza = new JLabel("RAZA");
        lblPorRaza.setHorizontalAlignment(SwingConstants.CENTER);
        lblPorRaza.setForeground(new Color(189, 183, 107));
        lblPorRaza.setFont(new Font("Khmer UI", Font.BOLD, 14));
        lblPorRaza.setBounds(60, 453, 55, 50);
        panelConsultaDeMascotas.add(lblPorRaza);
        
        lblPorColorDePelo = new JLabel("COLOR DE PELO");
        lblPorColorDePelo.setHorizontalAlignment(SwingConstants.CENTER);
        lblPorColorDePelo.setForeground(new Color(189, 183, 107));
        lblPorColorDePelo.setFont(new Font("Khmer UI", Font.BOLD, 14));
        lblPorColorDePelo.setBounds(63, 529, 113, 50);
        panelConsultaDeMascotas.add(lblPorColorDePelo);
        
        lblPorTipo = new JLabel("TIPO");
        lblPorTipo.setHorizontalAlignment(SwingConstants.CENTER);
        lblPorTipo.setForeground(new Color(189, 183, 107));
        lblPorTipo.setFont(new Font("Khmer UI", Font.BOLD, 14));
        lblPorTipo.setBounds(283, 375, 47, 50);
        panelConsultaDeMascotas.add(lblPorTipo);
        
        lblPorColorDeOjos = new JLabel("COLOR DE OJOS");
        lblPorColorDeOjos.setHorizontalAlignment(SwingConstants.CENTER);
        lblPorColorDeOjos.setForeground(new Color(189, 183, 107));
        lblPorColorDeOjos.setFont(new Font("Khmer UI", Font.BOLD, 14));
        lblPorColorDeOjos.setBounds(283, 453, 113, 50);
        panelConsultaDeMascotas.add(lblPorColorDeOjos);
        
        textFieldBuscarPorLugar = new JTextField();
        textFieldBuscarPorLugar.setBounds(209, 251, 240, 20);
        panelConsultaDeMascotas.add(textFieldBuscarPorLugar);
        textFieldBuscarPorLugar.setColumns(10);
        
        textFieldBuscarPorNumDeChip = new JTextField();
        textFieldBuscarPorNumDeChip.setColumns(10);
        textFieldBuscarPorNumDeChip.setBounds(209, 293, 240, 20);
        panelConsultaDeMascotas.add(textFieldBuscarPorNumDeChip);
        
        JLabel lblPorLugar = new JLabel("LUGAR\r\n");
        lblPorLugar.setHorizontalAlignment(SwingConstants.CENTER);
        lblPorLugar.setForeground(new Color(189, 183, 107));
        lblPorLugar.setFont(new Font("Khmer UI", Font.BOLD, 14));
        lblPorLugar.setBounds(127, 235, 72, 50);
        panelConsultaDeMascotas.add(lblPorLugar);
        
        JLabel lblPorNumeroDeChip = new JLabel("N\u00DAMERO DE CHIP\r\n");
        lblPorNumeroDeChip.setHorizontalAlignment(SwingConstants.CENTER);
        lblPorNumeroDeChip.setForeground(new Color(189, 183, 107));
        lblPorNumeroDeChip.setFont(new Font("Khmer UI", Font.BOLD, 14));
        lblPorNumeroDeChip.setBounds(54, 277, 145, 50);
        panelConsultaDeMascotas.add(lblPorNumeroDeChip);
        
        lblLineaDivisoraPequenia = new JLabel("_______________________________________________________________");
        lblLineaDivisoraPequenia.setHorizontalAlignment(SwingConstants.CENTER);
        lblLineaDivisoraPequenia.setForeground(new Color(189, 183, 107));
        lblLineaDivisoraPequenia.setFont(new Font("Khmer UI", Font.BOLD, 14));
        lblLineaDivisoraPequenia.setBounds(53, 324, 396, 50);
        panelConsultaDeMascotas.add(lblLineaDivisoraPequenia);
        
        btnBuscarConsulta = new JButton("Buscar\r\n");
        btnBuscarConsulta.setFont(new Font("Khmer UI", Font.PLAIN, 14));
        btnBuscarConsulta.setBounds(283, 571, 113, 32);
        panelConsultaDeMascotas.add(btnBuscarConsulta);
        
//////////////////////////////////////Inicio Código Consulta Usuarios////////////////////////////////////////////////////

		        
        panelConsultaDeUsuarios = new JPanel();
		VentanaPrincipal.getContentPane().add(panelConsultaDeUsuarios, "name_154826621946393");
		panelConsultaDeUsuarios.setLayout(null);
		
		JLabel lblTituloConsultaUsuarios = new JLabel("Usuarios");
		lblTituloConsultaUsuarios.setForeground(new Color(189, 183, 107));
		lblTituloConsultaUsuarios.setFont(new Font("Khmer UI", Font.BOLD, 47));
		lblTituloConsultaUsuarios.setBounds(47, 29, 364, 80);
		panelConsultaDeUsuarios.add(lblTituloConsultaUsuarios);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(176, 208, 554, 399);
		panelConsultaDeUsuarios.add(scrollPane_1);
		
		
		String[] columna = {"ID","Usuario", "Nombre", "Calificacion"};
		String[] fila = new String[4];
		modeloListaDeUsuarios = new DefaultTableModel(columna,0);
		tablaDeUsuarios = new JTable(modeloListaDeUsuarios){
			public boolean isCellEditable(int row, int column){  
			    return false;  
			} 
		};
		tablaDeUsuarios.setRowSelectionAllowed(true);
		tablaDeUsuarios.setCellSelectionEnabled(true);
		tablaDeUsuarios.setBorder(new LineBorder(new Color(189, 183, 107)));
		tablaDeUsuarios.setBackground(new Color(238, 232, 170));
		tablaDeUsuarios.setForeground(new Color(139, 69, 19));
		tablaDeUsuarios.setRowHeight(20);
		tablaDeUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tablaDeUsuarios.getColumnModel().getColumn(0).setPreferredWidth(27);
		tablaDeUsuarios.getColumnModel().getColumn(1).setPreferredWidth(143);
		tablaDeUsuarios.getColumnModel().getColumn(2).setPreferredWidth(300);
		tablaDeUsuarios.getColumnModel().getColumn(3).setPreferredWidth(80);
		modeloListaDeUsuarios = Sistema.cargarTablaDeUsuarios(fila, modeloListaDeUsuarios);
		
		
		tablaDeUsuarios.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				System.out.println("Dio doble clic en una celda");
				JTable target = (JTable)e.getSource();
				int row = target.getSelectedRow();
				int column = target.getSelectedColumn();
				int idUsuarioDelPerfil = -1;
				if(rdbtnTodosLosUsuarios.isSelected()){
					idUsuarioDelPerfil = tablaDeUsuarios.getSelectedRow();
				}else{
					idUsuarioDelPerfil = ListaNegra.getUsuario(tablaDeUsuarios.getSelectedRow()).getID();
				}
				VentanaPerfilUsuario ventanaDePerfil = new VentanaPerfilUsuario(idUsuarioDelPerfil);
				ventanaDePerfil.setVisible(true);
			}
		}
		});
		scrollPane_1.setViewportView(tablaDeUsuarios);
		tablaDeUsuarios.setFont(new Font("Khmer UI", Font.PLAIN, 14));
		
		lblMensajeListaVacia = new JLabel("En este momento no hay usuarios registrados.");
		lblMensajeListaVacia.setForeground(new Color(189, 183, 107));
		lblMensajeListaVacia.setFont(new Font("Khmer UI", Font.PLAIN, 18));
		lblMensajeListaVacia.setBounds(47, 167, 430, 30);
		lblMensajeListaVacia.setVisible(false);
		panelConsultaDeUsuarios.add(lblMensajeListaVacia);
		
		rdbtnTodosLosUsuarios = new JRadioButton("Todos los usuarios");
		rdbtnTodosLosUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnTodosLosUsuarios.isSelected()){
					modeloListaDeUsuarios.setRowCount(0);
					modeloListaDeUsuarios = Sistema.cargarTablaDeUsuarios(fila, modeloListaDeUsuarios);
					tablaDeUsuarios.setModel(modeloListaDeUsuarios);
				}
			}
		});
		rdbtnTodosLosUsuarios.setSelected(true);
		rdbtnTodosLosUsuarios.setContentAreaFilled(false);
		rdbtnTodosLosUsuarios.setForeground(new Color(189, 183, 107));
		rdbtnTodosLosUsuarios.setFont(new Font("Khmer UI", Font.PLAIN, 20));
		rdbtnTodosLosUsuarios.setBounds(792, 276, 251, 23);
		verUsuariosPor.add(rdbtnTodosLosUsuarios);
		panelConsultaDeUsuarios.add(rdbtnTodosLosUsuarios);
		
		rdbtnUsuariosEnLaListaNegra = new JRadioButton("Usuarios en la lista negra");
		rdbtnUsuariosEnLaListaNegra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnUsuariosEnLaListaNegra.isSelected()){
					modeloListaDeUsuarios.setRowCount(0);
					modeloListaDeUsuarios = Sistema.cargarTablaDeUsuariosEnListaNegra(fila, modeloListaDeUsuarios);
					tablaDeUsuarios.setModel(modeloListaDeUsuarios);
				}
			}
		});
		rdbtnUsuariosEnLaListaNegra.setContentAreaFilled(false);
		rdbtnUsuariosEnLaListaNegra.setFont(new Font("Khmer UI", Font.PLAIN, 20));
		rdbtnUsuariosEnLaListaNegra.setForeground(new Color(189, 183, 107));
		rdbtnUsuariosEnLaListaNegra.setBounds(791, 316, 332, 23);
		verUsuariosPor.add(rdbtnUsuariosEnLaListaNegra);
		panelConsultaDeUsuarios.add(rdbtnUsuariosEnLaListaNegra);
		
		JLabel lblLineaDivisoria = new JLabel("__________________________________");
		lblLineaDivisoria.setForeground(new Color(189, 183, 107));
		lblLineaDivisoria.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblLineaDivisoria.setBounds(42, -12, 1318, 227);
		panelConsultaDeUsuarios.add(lblLineaDivisoria);
		
		JLabel lblVerListaPor = new JLabel("Ver lista por:");
		lblVerListaPor.setForeground(new Color(189, 183, 107));
		lblVerListaPor.setFont(new Font("Khmer UI", Font.PLAIN, 18));
		lblVerListaPor.setBounds(784, 226, 193, 25);
		panelConsultaDeUsuarios.add(lblVerListaPor);
		
		fondoConsultaUsuarios = new JLabel("");
		fondoConsultaUsuarios.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
		fondoConsultaUsuarios.setBounds(0, 1, 1362, 675);
		panelConsultaDeUsuarios.add(fondoConsultaUsuarios);
		
		panelPerfilMascota = new JPanel();
		panelPerfilMascota.setBackground(new Color(99, 84,65));
		VentanaPrincipal.getContentPane().add(panelPerfilMascota, "name_18610174723405");
		panelPerfilMascota.setLayout(null);
		
		lblTituloDogsLovers = new JLabel("");
		lblTituloDogsLovers.setBackground(new Color(128, 0, 0));
		lblTituloDogsLovers.setIcon(new ImageIcon("./imgs/Logo.png"));
		lblTituloDogsLovers.setBounds(446, 11, 540, 110);
		panelPerfilMascota.add(lblTituloDogsLovers);
		
		lbl_panelPerfilMascota_Foto = new JLabel("No hay foto disponible");
		lbl_panelPerfilMascota_Foto.setBounds(44, 135, 117, 110);
		panelPerfilMascota.add(lbl_panelPerfilMascota_Foto);
		
		lbl_panelPerfilMascota_colorOjos = new JLabel("New label");
		lbl_panelPerfilMascota_colorOjos.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lbl_panelPerfilMascota_colorOjos.setBounds(383, 291, 46, 14);
		panelPerfilMascota.add(lbl_panelPerfilMascota_colorOjos);
		
		JLabel lblaa = new JLabel("Tipo");
		lblaa.setBounds(263, 176, 31, 26);
		panelPerfilMascota.add(lblaa);
		lblaa.setFont(new Font("Khmer UI", Font.BOLD, 15));
		
		JLabel label_6 = new JLabel();
		label_6.setBounds(263, 229, 53, 26);
		panelPerfilMascota.add(label_6);
		label_6.setText("Raza: ");
		label_6.setFont(new Font("Khmer UI", Font.BOLD, 15));
		
		JLabel label_9 = new JLabel("Encargado Actual: ");
		label_9.setBounds(620, 176, 160, 26);
		panelPerfilMascota.add(label_9);
		label_9.setFont(new Font("Khmer UI", Font.BOLD, 15));
		
		JLabel lblNombreDeLa_1 = new JLabel("Nombre de la Mascota: ");
		lblNombreDeLa_1.setForeground(new Color(0, 0, 0));
		lblNombreDeLa_1.setBounds(33, 312, 181, 26);
		panelPerfilMascota.add(lblNombreDeLa_1);
		lblNombreDeLa_1.setFont(new Font("Khmer UI", Font.BOLD, 15));
		
		JLabel label_14 = new JLabel("Correo: ");
		label_14.setBounds(620, 229, 141, 26);
		panelPerfilMascota.add(label_14);
		label_14.setFont(new Font("Khmer UI", Font.BOLD, 15));
		
		JLabel label_15 = new JLabel("Telefono: ");
		label_15.setBounds(620, 279, 160, 26);
		panelPerfilMascota.add(label_15);
		label_15.setFont(new Font("Khmer UI", Font.BOLD, 15));
		
		lbl_panelPerfilMascota_Tipo = new JLabel("New label");
		lbl_panelPerfilMascota_Tipo.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lbl_panelPerfilMascota_Tipo.setBounds(383, 175, 169, 31);
		panelPerfilMascota.add(lbl_panelPerfilMascota_Tipo);
		
		lbl_panelPerfilMascota_Raza = new JLabel("New label");
		lbl_panelPerfilMascota_Raza.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lbl_panelPerfilMascota_Raza.setBounds(383, 229, 169, 31);
		panelPerfilMascota.add(lbl_panelPerfilMascota_Raza);
		
		lbl_panelPerfilMascota_lNombreMacota = new JLabel("New label");
		lbl_panelPerfilMascota_lNombreMacota.setBounds(33, 349, 169, 31);
		panelPerfilMascota.add(lbl_panelPerfilMascota_lNombreMacota);
		
		lbl_panelPerfilMascota_Encargado = new JLabel("New label");
		lbl_panelPerfilMascota_Encargado.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lbl_panelPerfilMascota_Encargado.setBounds(817, 175, 169, 31);
		panelPerfilMascota.add(lbl_panelPerfilMascota_Encargado);
		
		lbl_panelPerfilMacota_Correo = new JLabel("New label");
		lbl_panelPerfilMacota_Correo.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lbl_panelPerfilMacota_Correo.setBounds(817, 228, 169, 31);
		panelPerfilMascota.add(lbl_panelPerfilMacota_Correo);
		
		lbl_panelPerfilMacota_Telefono = new JLabel("New label");
		lbl_panelPerfilMacota_Telefono.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lbl_panelPerfilMacota_Telefono.setBounds(817, 278, 169, 31);
		panelPerfilMascota.add(lbl_panelPerfilMacota_Telefono);
		
		lblColorOjos = new JLabel();
		lblColorOjos.setText("Color Ojos");
		lblColorOjos.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblColorOjos.setBounds(263, 286, 97, 26);
		panelPerfilMascota.add(lblColorOjos);
		
		lblColorPelo = new JLabel();
		lblColorPelo.setText("Color Pelo");
		lblColorPelo.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblColorPelo.setBounds(263, 337, 53, 26);
		panelPerfilMascota.add(lblColorPelo);

		

        
    }//Fin initilize()

	// ////////////////////////////////////Fin Código Consulta
	// Usuarios////////////////////////////////////////////////////

	public void verificarEstado() {

		if (estadoMascota.isSelected(rdbtnEncontrada.getModel())) {

			setEstado("ENCONTRADA");

		} else {

			setEstado("PERDIDA");

		}

	}

	public void verificarMoneda() {

		if (getEstado().equals("ENCONTRADA")) {

			recompensa = null;

		} else {

			if (monedaDePago.isSelected(rdbtnColones.getModel())) {

				recompensa = rdbtnColones.getText() + " "
						+ textFieldMontoRecompensa.getText();

			} else {

				recompensa = rdbtnDolares.getText() + " "
						+ textFieldMontoRecompensa.getText();

			}

		}

	}

	public void verificartxtFieldChip() {
		String chip = textFieldNumChip.getText();
		if (chip.isEmpty()) {
			this.chip = null;
		}
	}

	public void verificarRaza() {
		if (comboBoxTipoMascota.getSelectedIndex() == 4) {
			raza = "Otro";// ???
		} else {
			raza = (String) comboBoxRazaMascota.getSelectedItem();
		}
	}

	public String getEstado() {

		return estado;

	}

	public void setEstado(String pEstado) {
		estado = pEstado;
	}

	public static void setIDUsuarioActivo(int id) {

		IDUsuarioActivo = id;
	}

	public static int getIDUsuarioActivo() {

		return IDUsuarioActivo;
	}

	private void verificarNombre() {
		String nombreMascota = textFieldNombreMascota.getText();
		if (estado == "PERDIDA" && nombreMascota.isEmpty()) {
			nombre = null;
		}

	}

	public boolean verificarNecesitaDonacion() {
		if (chckbxNoAlimentosCC.getText().equals("No")) {
			return false;
		} else {
			return true;
		}

	}

	public boolean verificarNecesitaMedicamentos() {
		if (chckbxNoMedicamentosCC.getText().equals("No")) {
			return false;
		} else {
			return true;
		}

	}

	public static String getFoto() {
		return foto;
	}

	public static void setFoto(String pFoto) {
		foto = pFoto;
	}

	public static String getRutaImagenesMascotas() {
		return rutaImagenesMascotas;
	}

	public void setRutaImagenesMascotas(String pRutaImagenesMascotas) {
		rutaImagenesMascotas = pRutaImagenesMascotas;
	}

	private void cargarPanelPerfilMacota(int id){
		lbl_panelPerfilMascota_Raza.setText(SistemasMascotas.getRazaDeMascota(id));
		//lbl_panelPerfilMascota_Tipo.setText(SistemasMascotas.get);
		return;
	}
	
	public void refrescarPaneles() {
		try {
			SistemasMascotas.buscarEnTodasLasMascotas();
			SistemasMascotas.getMascotasPorEstado(opcEstado);
			SistemasMascotas.getMascotasPorTipo(opcTipo);
			SistemasMascotas.getMascotasPorRaza(opcRaza);
			SistemasMascotas.getMascotasPorColorDeOjos(opcColorDeOjos);
			SistemasMascotas.getMascotasPorColorDePelo(opcColorDePelo);

			listaMascotasParaMostrar = SistemasMascotas.getMascotasFiltradas();
			llegoAlLimiteDerecho = false;
			llegoAlLimiteIzquierdo = false;

			habilitarPanel1();
			habilitarPanel2();
			habilitarPanel3();
			int size = listaMascotasParaMostrar.size();

			btnVer_panel1.setVisible(true);
			btnVer_panel2.setVisible(true);
			btnVer_panel3.setVisible(true);

			if (size <= 3)
				llegoAlLimiteIzquierdo = true;

			if (size >= 3) {

				posicionMascotaPanel3 = size - 3;
				mascotaPanel3 = listaMascotasParaMostrar
						.get(posicionMascotaPanel3);
				imgfotomascota3 = new ImageIcon(mascotaPanel3.getFoto());
				lblFotoMascota_3.setIcon(new ImageIcon(imgfotomascota3
						.getImage().getScaledInstance(106, 119,
								Image.SCALE_SMOOTH)));
				lblTituloMascota_3.setText(mascotaPanel3.getTipo() + " "
						+ mascotaPanel3.getEstado() + " en "
						+ mascotaPanel3.getLugarDelSuceso());
				lblFecha_3.setText(mascotaPanel3.getDiaSuceso());
				lblNotas_3.setText(mascotaPanel3.getNota());
				lblLugarSuceso_3.setText(mascotaPanel3.getLugarDelSuceso());
				//lbl_id_mascota3.setText();
				btnVer_panel3.setVisible(true);

			} else {
				ocultarPanel3();
				llegoAlLimiteDerecho = true;
			}

			if (size >= 2) {

				posicionMascotaPanel2 = size - 2;
				mascotaPanel2 = listaMascotasParaMostrar
						.get(posicionMascotaPanel2);
				imgfotomascota2 = new ImageIcon(mascotaPanel2.getFoto());
				lblFotoMascota_2.setIcon(new ImageIcon(imgfotomascota2
						.getImage().getScaledInstance(106, 119,
								Image.SCALE_SMOOTH)));
				lblTituloMascota_2.setText(mascotaPanel2.getTipo() + " "
						+ mascotaPanel2.getEstado() + " en "
						+ mascotaPanel2.getLugarDelSuceso());
				lblNotas2.setText(mascotaPanel2.getNota());
				lblFecha_2.setText(mascotaPanel2.getDiaSuceso());
				lblLugar_2.setText(mascotaPanel2.getLugarDelSuceso());
				btnVer_panel2.setVisible(true);
			} else {
				ocultarPanel2();
				llegoAlLimiteDerecho = true;
			}

			if (size >= 1) {

				posicionMascotaPanel1 = size - 1;
				mascotaPanel1 = listaMascotasParaMostrar
						.get(posicionMascotaPanel1);
				imgfotomascota1 = new ImageIcon(mascotaPanel1.getFoto());
				lblFotoMascota1.setIcon(new ImageIcon(imgfotomascota1
						.getImage().getScaledInstance(106, 119,
								Image.SCALE_SMOOTH)));
				lbltitulomascota1.setText(mascotaPanel1.getTipo() + " "
						+ mascotaPanel1.getEstado() + " en "
						+ mascotaPanel1.getLugarDelSuceso());
				lblfechaSuceso.setText(mascotaPanel1.getDiaSuceso());
				lblNotas_1.setText(mascotaPanel1.getNota());
				lblLugarSuceso1.setText(mascotaPanel1.getLugarDelSuceso());
				btnVer_panel1.setVisible(true);
			} else {
				ocultarPanel1();
				llegoAlLimiteDerecho = true;
				JOptionPane.showMessageDialog(null,
						"No se encontraron mascotas");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void habilitarPanel2() {
		lblFotoMascota_2.setVisible(true);
		lblTituloMascota_2.setVisible(true);
		lblFecha_2.setVisible(true);
		lblNotas2.setVisible(true);
		lblLugar_2.setVisible(true);
		panelSegundaMascota.setVisible(true);
	}

	private void habilitarPanel1() {
		lblFotoMascota1.setVisible(true);
		lbltitulomascota1.setVisible(true);
		lblfechaSuceso.setVisible(true);
		lblNotas_1.setVisible(true);
		lblLugarSuceso1.setVisible(true);
		panelPrimeraMascota.setVisible(true);
	}

	private void habilitarPanel3() {
		lblFotoMascota_3.setVisible(true);
		lblTituloMascota_3.setVisible(true);
		lblFecha_3.setVisible(true);
		lblNotas_3.setVisible(true);
		lblLugarSuceso_3.setVisible(true);
		panelTerceraMascota.setVisible(true);
	}

	private void ocultarPanel2() {
		lblFotoMascota_2.setVisible(false);
		lblTituloMascota_2.setVisible(false);
		lblFecha_2.setVisible(false);
		lblNotas2.setVisible(false);
		lblLugar_2.setVisible(false);
		panelSegundaMascota.setVisible(false);
	}

	private void ocultarPanel1() {
		lblFotoMascota1.setVisible(false);
		lbltitulomascota1.setVisible(false);
		lblfechaSuceso.setVisible(false);
		lblNotas_1.setVisible(false);
		lblLugarSuceso1.setVisible(false);
		panelPrimeraMascota.setVisible(false);
	}

	private void ocultarPanel3() {
		lblFotoMascota_3.setVisible(false);
		lblTituloMascota_3.setVisible(false);
		lblFecha_3.setVisible(false);
		lblNotas_3.setVisible(false);
		lblLugarSuceso_3.setVisible(false);
		panelTerceraMascota.setVisible(false);
	}

	public static boolean isEsVisible() {
		return esVisible;
	}

	public static void setEsVisible(boolean pVisible) {
		esVisible = pVisible;
	}
};;