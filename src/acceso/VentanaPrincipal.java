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
    private static String nombre = "";
    private static String raza;
    private static String chip = "";
    private static String colorDePelo;
    private static String colorDeOjos;
    private static String foto = "";
    private static String lugarVisto;
    private static String nota;
    private static String recompensa = "";
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
    private static String rutaImagenesMascotas = "./mascotas";
    
    private static String opcEstado = " ";
    private static String opcTipo = " ";
    private static String opcRaza = " ";
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
    private JTextArea lblNotas2 ;
    private JPanel panelPrimeraMascota;
    private JLabel lblfechaSuceso;
    private JLabel lblLugarSuceso1;
    private JTextArea lblNotas_1;
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
    private static ArrayList<Mascota>listaMascotasParaMostrar ;
    private int posicionMascotaPanel1 ;
    private int posicionMascotaPanel2 ;
    private int posicionMascotaPanel3 ;
    private Mascota mascotaPanel1 ;
    private Mascota mascotaPanel2 ;
    private Mascota mascotaPanel3 ;
    private static boolean llegoAlLimiteDerecho = false;
    private static boolean llegoAlLimiteIzquierdo = true;
    private JButton btnFlechaDerecha;
    private Choice choice;
    private Choice choice_1;
    private JTable tablaListaNegra;
    private JScrollPane scrollPane_1;
    private JLabel FondoConsultaListaNegra;
    private JPanel panelConsultaListaNegra;
    private JLabel lblMotivoLN;
    private JLabel lblFotoLN;
    private JLabel lblNombreLN;
    private JLabel lblFechaLN;
    private JLabel lblMensajeListaVacia;

    static JMenu mnConfiguracin;
   private static boolean esVisible = true;
    


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
        try {
            SistemasMascotas.leerMascota();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        initialize();
        
    }

    private void initialize() {
    	
    	listaMascotasParaMostrar =  SistemasMascotas.getListaMascota();
        posicionMascotaPanel1 = listaMascotasParaMostrar.size()-1;
        System.out.println("pos1 = " + posicionMascotaPanel1);
        posicionMascotaPanel2 = listaMascotasParaMostrar.size()-2; 
        System.out.println("pos2 = " + posicionMascotaPanel2);
        posicionMascotaPanel3 = listaMascotasParaMostrar.size()-3;
        System.out.println("pos3 = " + posicionMascotaPanel3);
        mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
        mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
        mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
        
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
        
//////////////////////////////*Inicio Codigo del Panel Agregar Mascota*/////////////////////////////////////////////////////////////////////        
        
        
        rdbtnEncontradas = new JRadioButton("Encontradas");
        rdbtnEncontradas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if(rdbtnEncontradas.isSelected()){
            	  opcEstado = "ENCONTRADA";
                refrescarPaneles();
    
            }}
        });
        rdbtnEncontradas.setContentAreaFilled(false);
        rdbtnEncontradas.setBounds(54, 241, 109, 23);
        rdbtnEncontradas.setForeground(new Color(210, 180, 140));
        rdbtnEncontradas.setFont(new Font("Khmer UI", Font.BOLD, 14));
        
        
        VerMascotasPor.add(rdbtnEncontradas);
        panelPrincipal.add(rdbtnEncontradas);
        
        rdbtnPerdidas = new JRadioButton("Perdidas");
        rdbtnPerdidas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnPerdidas.isSelected()){
                	
                	opcEstado = "PERDIDA";
                	refrescarPaneles();
               
            }
            }
        });
       

        rdbtnPerdidas.setContentAreaFilled(false);
        rdbtnPerdidas.setBounds(54, 205, 109, 23);
        rdbtnPerdidas.setForeground(new Color(210, 180, 140));
        rdbtnPerdidas.setFont(new Font("Khmer UI", Font.BOLD, 14));
        
        
        VerMascotasPor.add(rdbtnPerdidas);
        panelPrincipal.add(rdbtnPerdidas);
        
        rdbtnTodas = new JRadioButton("Todas");
        rdbtnTodas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(rdbtnTodas.isSelected()){
                opcEstado=" ";
                opcTipo=" ";
                opcRaza=" ";
                
                refrescarPaneles();
                
                                }
            
            }
            }
            
        );
        rdbtnTodas.setSelected(true);
        rdbtnTodas.setContentAreaFilled(false);
        rdbtnTodas.setForeground(new Color(210, 180, 140));
        rdbtnTodas.setFont(new Font("Khmer UI", Font.BOLD, 14));
        rdbtnTodas.setBounds(54, 172, 109, 23);
        panelPrincipal.add(rdbtnTodas);
        VerMascotasPor.add(rdbtnTodas);
        label_1 = new JLabel("Mostrar Por:");
        label_1 .setForeground(new Color(210, 180, 140));
        label_1 .setFont(new Font("Khmer UI", Font.BOLD, 19));
        label_1.setBounds(44, 135, 147, 30);
        panelPrincipal.add(label_1);
        
        label_2 = new JLabel("");
        label_2 .setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        label_2 .setForeground(new Color(210, 180, 140));
        label_2 .setFont(new Font("Khmer UI", Font.BOLD, 19));
        label_2.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        label_2.setBounds(34, 135, 234, 146);
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
        lblFotoMascota1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(mascotaPanel1.getFoto())));
        
        lblFotoMascota1.setVerticalAlignment(javax.swing.SwingConstants.CENTER);        
        lblFotoMascota1.setHorizontalAlignment(SwingConstants.CENTER);
        lblFotoMascota1.setBounds(10, 11, 106, 119);
        panelPrimeraMascota.add(lblFotoMascota1);
        
        lbltitulomascota1 = new JLabel();
        lbltitulomascota1.setBounds(126, 11, 309, 14);
        lbltitulomascota1.setText(mascotaPanel1.getTipo()+" " +mascotaPanel1.getEstado()+" en "+mascotaPanel1.getLugarDelSuceso() );
        panelPrimeraMascota.add(lbltitulomascota1);
        
        lblLugarSuceso1 = new JLabel(mascotaPanel1.getLugarDelSuceso());
        lblLugarSuceso1.setBounds(710, 40, 158, 14);
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
        
        panelSegundaMascota = new JPanel();
        panelSegundaMascota.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        panelSegundaMascota.setLayout(null);
        panelSegundaMascota.setBounds(347, 284, 868, 141);
        panelPrincipal.add(panelSegundaMascota);
        
        lblNotas2 = new JTextArea(mascotaPanel2.getNota());
        lblNotas2.setEditable(false);
        lblNotas2.setBounds(126, 40, 461, 74);
        panelSegundaMascota.add(lblNotas2);
        
        lblFotoMascota_2 = new JLabel();
        lblFotoMascota_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblFotoMascota_2.setVerticalAlignment(javax.swing.SwingConstants.CENTER);        
        lblFotoMascota_2.setBounds(10, 11, 106, 119);
        lblFotoMascota_2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(mascotaPanel2.getFoto())));
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
        
        panelTerceraMascota = new JPanel();
        panelTerceraMascota.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        panelTerceraMascota.setLayout(null);
        panelTerceraMascota.setBounds(347, 439, 868, 141);
        panelPrincipal.add(panelTerceraMascota);
        
        lblFotoMascota_3 = new JLabel();
        lblFotoMascota_3 .setVerticalAlignment(javax.swing.SwingConstants.CENTER);        
        lblFotoMascota_3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(mascotaPanel3.getFoto())));
        
        
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
        
        btnFlechaDerecha = new JButton("");
        btnFlechaDerecha.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) { 
        		if(!llegoAlLimiteDerecho){
        		
        			llegoAlLimiteIzquierdo = false;
	        		posicionMascotaPanel1 -= 3;
	        		System.out.println("pos1 = " + posicionMascotaPanel1);
	        		posicionMascotaPanel2 -= 3;
	        		System.out.println("pos2 = " + posicionMascotaPanel2);
	        		posicionMascotaPanel3 -= 3;
	        		System.out.println("pos3 = " + posicionMascotaPanel3);
	        		
		        	if(posicionMascotaPanel1 < 0 || posicionMascotaPanel2 < 0 || posicionMascotaPanel3 < 0){
		        		llegoAlLimiteDerecho = true;
		        	}
		        	
		        	if(posicionMascotaPanel1 != -1){
	        		
		        		if(posicionMascotaPanel1 >= 0){	
			        		mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
			        		lblFotoMascota1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
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
			                lblFotoMascota_2.setIcon((new ImageIcon(mascotaPanel2.getFoto())));
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
			                lblFotoMascota_3.setIcon((new ImageIcon(mascotaPanel3.getFoto())));
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
		        		posicionMascotaPanel1 += 3;
		        		System.out.println("pos1 = " + posicionMascotaPanel1);
		        		posicionMascotaPanel2 += 3;
		        		System.out.println("pos2 = " + posicionMascotaPanel2);
		        		posicionMascotaPanel3 += 3;
		        		System.out.println("pos3 = " + posicionMascotaPanel3);
		        	}
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
	        		System.out.println("pos1 = " + posicionMascotaPanel1);
	        		
	        		if(posicionMascotaPanel1 < listaMascotasParaMostrar.size()){	
		        		mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
		        		lblFotoMascota1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
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
	        		System.out.println("pos2 = " + posicionMascotaPanel2);
	        		
	        		if(posicionMascotaPanel2 < listaMascotasParaMostrar.size()){
		        		mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
		                lblFotoMascota_2.setIcon((new ImageIcon(mascotaPanel2.getFoto())));
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
	        		System.out.println("pos3 = " + posicionMascotaPanel3);
		        	
		        	if(posicionMascotaPanel3 < listaMascotasParaMostrar.size()){
		        		mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
		                lblFotoMascota_3.setIcon((new ImageIcon(mascotaPanel3.getFoto())));
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
        
        lblFondoPanelPrincipal = new JLabel("");
        lblFondoPanelPrincipal.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
        lblFondoPanelPrincipal.setBounds(0, 0, 1362, 675);
        panelPrincipal.add(lblFondoPanelPrincipal);
        
        JLabel label_3 = new JLabel("");
        label_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        label_3.setBounds(34, 298, 234, 146);
        panelPrincipal.add(label_3);
        
        choice = new Choice();
        choice.setBounds(54, 326, 129, 20);
        panelPrincipal.add(choice);
        
        choice_1 = new Choice();
        choice_1.setBounds(68, 377, 123, 23);
        panelPrincipal.add(choice_1);
        
        
        panelAgregarMascota = new JPanel();
        VentanaPrincipal.getContentPane().add(panelAgregarMascota, "name_27990074221032");
        panelAgregarMascota.setLayout(null);
        panelAgregarMascota.setVisible(false);
        
        comboBoxColorPelaje = new JComboBox();
        //comboBoxColorPelaje.setModel(new DefaultComboBoxModel(Sistema.getListaColorDePelo()));
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
	               // if(Mascota.verificarChip(chip, estado)){
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
	                }
	                
	                else{
	                    
	                    Mascota NuevaMascota = new Mascota(estado, tipo, raza, nombre, chip, colorDePelo, colorDeOjos, getFoto(), lugarVisto, nota, fechaSuceso, recompensa, idEncargado);
	                   
	                   // Mascota.getListaDeMascotas().add(NuevaMascota);
	                    //NuevaMascota.GuardarMascota(Mascota.getListaDeMascotas());
	                   
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
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         
         comboBoxTipoMascota.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(comboBoxTipoMascota.getSelectedIndex() == 0){
            		JOptionPane.showMessageDialog(null, "Por Favor, elija una Especie");
            	}
            	else{
	            	try {
	            	String opcTipo = (String)comboBoxTipoMascota.getSelectedItem();
	            	System.out.println(opcTipo);
	            	
	            		//if(!opcTipo.equals("Elija un tipo")){
	            		//	JOptionPane.showMessageDialog(null, "Eliga un tipo de masaCota");
	            	//	/;
	            		//}
						comboBoxRazaMascota.setModel(new DefaultComboBoxModel(Sistema.getListaRazas(opcTipo)));
						System.out.println("lis asaqui");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	            
	            	}
	           }
         }
            
         );
        comboBoxTipoMascota.setBounds(320, 208, 233, 20);
        panelAgregarMascota.add(comboBoxTipoMascota);
        
       comboBoxRazaMascota = new JComboBox();
       /* comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Airedale Terrier" ,"Akita inu" ,"Alaskan malamute", "American Stafford","Shire Terrier","Basenji",
                "Basset Hound","Beagle","Bichón Maltés","Boxer","Braco de Weimar","Bull Terrier","Bulldog francés","Bulldog inglés","Caniche","Carlino","Chihuahua","Chow-chow","Cocker Spaniel Americano","Cocker Spaniel inglés","Crestado chino","Dálmata","Dobermann","Dogo Aleman","Dogo Argentino","French Poodle","Golden retriever",
                "Labrador Retrevier","Mastín Español","Mastín Napolitano","Pastor Alemán","Pequinés",
                "Pinscher Pomerania","Rottweiler","Samoyedo","San Bernardo","Schnauzer","Setter inglés",
                "Setter irlandés","Shar Pei","Shih Tzu","Siberian Husky","Otro"})) ; */
        
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
        //comboBoxColorOjos.setModel(new DefaultComboBoxModel(new String[] {"Cafes", "Azules", "Negros", "Grises", "Amarillos", "Verdes", "Celestes", "Dos Tonos ", "Otro"}));
		try {
			for(String obj: Sistema.getListaColorDeOjos()){
				comboBoxColorOjos.addItem(obj);

			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
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
        
        JLabel labelFondo = new JLabel("");
        labelFondo.setOpaque(true);
        labelFondo.setFocusTraversalKeysEnabled(false);
        labelFondo.setForeground(Color.WHITE);
        labelFondo.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
        labelFondo.setBounds(0, 0, 2508, 1246);
        panelAgregarMascota.add(labelFondo);
        
        
        
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
        mnConsulta.setIcon(new ImageIcon("./imgs/Consulta.png"));
        menuBar.add(mnConsulta);
        
        JMenuItem mntmConsultaMascota = new JMenuItem("Mascotas");
        mntmConsultaMascota.setIcon(new ImageIcon("./imgs/Pets-30.png"));         
        mnConsulta.add(mntmConsultaMascota);
        
        JMenuItem mntmConsutarCasaCuna = new JMenuItem("Casa Cuna");
        mntmConsutarCasaCuna.setIcon(new ImageIcon("./imgs/casaCuna.png"));
        mnConsulta.add(mntmConsutarCasaCuna);
        
        JMenuItem mntmConsultarAsociacinBeneficiaria = new JMenuItem("Asociaci\u00F3n Beneficiaria");
        mntmConsultarAsociacinBeneficiaria.setIcon(new ImageIcon("./imgs/AsociBene32.png"));
        mnConsulta.add(mntmConsultarAsociacinBeneficiaria);
        
        JMenuItem mntmConsutaMiPerfil = new JMenuItem("Mi Perfil");
        mntmConsutaMiPerfil.setIcon(new ImageIcon("./imgs/Perfil.png"));
        mnConsulta.add(mntmConsutaMiPerfil);
        
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
        
        JMenu mnListaNegra = new JMenu("Lista Negra");
        mnListaNegra.setIcon(new ImageIcon("./imgs/DeleteSelected.png"));
        menuBar.add(mnListaNegra);
        
        JMenuItem mntmVerListaNegra = new JMenuItem("Ver Lista Negra");
        mntmVerListaNegra.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelPrincipal.setVisible(false);
        		panelConsultaListaNegra.setVisible(true);
        		if(ListaNegra.getListaSize() == 0){
        			tablaListaNegra.setVisible(false);
        			lblFotoLN.setVisible(false);
        			lblNombreLN.setVisible(false);
        			lblFechaLN.setVisible(false);
        			lblMotivoLN.setVisible(false);
        			lblMensajeListaVacia.setVisible(true);
        		}else{
        			Usuario primerUsuarioEnLista = SistemasUsuarios.getUsuario(ListaNegra.getListaNegra().get(0));
        			tablaListaNegra.setVisible(true);
        			lblFotoLN.setVisible(true);
        			//El atributo Foto para Usuario no existe, la sgte línea mostraría la misma si esto se añadiera.
        			//lblFotoLN.setIcon(new ImageIcon(primerUsuarioEnLista.getFoto()));
        			lblNombreLN.setVisible(true);
        			lblNombreLN.setText(primerUsuarioEnLista.getNombreUsuario());
        			lblFechaLN.setVisible(true); // Falta agregar una manera de conseguir fechas en las que Sistema pasó 
        										// un usuario a listaNegra por malas calficaciones
        			lblMotivoLN.setVisible(true);
        			if(Sistema.estaReportado(primerUsuarioEnLista)){
        				lblMotivoLN.setText(Sistema.getReporteDeUsuarioReportado(primerUsuarioEnLista).getMotivoReporte());
        			}else{
        				lblMotivoLN.setText("Este usuario fue puesto en la lista negra por malas calificaciones por parte de los demás.");
        			}
        			lblMensajeListaVacia.setVisible(false);
        		}
        	}
        });
        mnListaNegra.add(mntmVerListaNegra);
        
        mnConfiguracin = new JMenu("Configuraci\u00F3n");
        mnConfiguracin.setVisible(esVisible);
        mnConfiguracin.setEnabled(esVisible);
        mnConfiguracin.setIcon(new ImageIcon("./imgs/params-32.png"));
        menuBar.add(mnConfiguracin);
        
        JMenuItem mntmAdministrador = new JMenuItem("Administrador");
        mntmAdministrador.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		VentanaConfiguracion ventanaConfiguracion  = new VentanaConfiguracion();
        		ventanaConfiguracion.setVisible(true);
        		
        	}
        });
        mntmAdministrador.setIcon(new ImageIcon("./imgs/admin.png"));
        mnConfiguracin.add(mntmAdministrador);
        panelAgregarCasaCuna.setVisible(false);
        
//////////////////////////////////////Inicio Código Consulta Lista Negra////////////////////////////////////////////////////

		        
		panelConsultaListaNegra = new JPanel();
		VentanaPrincipal.getContentPane().add(panelConsultaListaNegra, "name_154826621946393");
		panelConsultaListaNegra.setLayout(null);
		
		JLabel lblTituloListaNegra = new JLabel("Lista Negra");
		lblTituloListaNegra.setForeground(new Color(189, 183, 107));
		lblTituloListaNegra.setFont(new Font("Khmer UI", Font.BOLD, 47));
		lblTituloListaNegra.setBounds(47, 29, 364, 80);
		panelConsultaListaNegra.add(lblTituloListaNegra);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(175, 161, 554, 399);
		panelConsultaListaNegra.add(scrollPane_1);
		
		
		String[] columna = {"ID","Usuario","Calificacion","Motivo"};
		String[] fila = new String[4];
		DefaultTableModel modeloListanegra = new DefaultTableModel(columna,0);
		tablaListaNegra = new JTable(modeloListanegra);
		Sistema.cargarTableUsuariosEnListaNegra(columna, fila, modeloListanegra);
		
		tablaListaNegra.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				JTable target = (JTable)e.getSource();
				int row = target.getSelectedRow();
				int column = target.getSelectedColumn();
				Usuario usuarioSeleccionado = SistemasUsuarios.getUsuario(ListaNegra.getListaNegra().get(row));
				//lblFotoLN.setIcon(new ImageIcon(primerUsuarioEnLista.getFoto()));
				lblNombreLN.setText(usuarioSeleccionado.getNombreUsuario());
				if(Sistema.estaReportado(usuarioSeleccionado)){
					lblMotivoLN.setText(Sistema.getReporteDeUsuarioReportado(usuarioSeleccionado).getMotivoReporte());
				}else{
					lblMotivoLN.setText("Este usuario fue puesto en la lista negra por malas calificaciones por parte de los demás.");
				}
			}
		}
		});
		scrollPane_1.setViewportView(tablaListaNegra);
		tablaListaNegra.setFont(new Font("Khmer UI", Font.PLAIN, 14));
		
		
		lblFotoLN = new JLabel("");
		lblFotoLN.setBounds(1024, 161, 154, 189);
		panelConsultaListaNegra.add(lblFotoLN);
		
		lblNombreLN = new JLabel("");
		lblNombreLN.setBounds(1024, 361, 160, 26);
		panelConsultaListaNegra.add(lblNombreLN);
		
		lblFechaLN = new JLabel("");
		lblFechaLN.setBounds(1000, 404, 110, 26);
		panelConsultaListaNegra.add(lblFechaLN);
		
		lblMotivoLN = new JLabel("");
		lblMotivoLN.setBounds(1005, 466, 234, 93);
		panelConsultaListaNegra.add(lblMotivoLN);
		
		lblMensajeListaVacia = new JLabel("En este momento no hay usuarios en la lista negra.");
		lblMensajeListaVacia.setForeground(new Color(189, 183, 107));
		lblMensajeListaVacia.setFont(new Font("Khmer UI", Font.PLAIN, 18));
		lblMensajeListaVacia.setBounds(47, 120, 430, 30);
		lblMensajeListaVacia.setVisible(false);
		panelConsultaListaNegra.add(lblMensajeListaVacia);
		
		FondoConsultaListaNegra = new JLabel("");
		FondoConsultaListaNegra.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
		FondoConsultaListaNegra.setBounds(0, 1, 1362, 675);
		panelConsultaListaNegra.add(FondoConsultaListaNegra);



        
    }//Fin initilize()
    
	public static class modeloTablaListaNegra extends AbstractTableModel {
		private String [] columnas = {"ID", "Usuario", "Calificación", "Motivo"}; 
		private String[][] matrizDeListaNegra;
		
//		public modeloTablaListaNegra(){
//			
//			matrizDeListaNegra = new String[ListaNegra.getListaSize()][4]; // filas x columnas
//			int contador = 0; // contador usado para ubicar cada posición en la matriz
//			for(Integer id: ListaNegra.getListaNegra()){
//				matrizDeListaNegra[contador][0] = String.valueOf(ListaNegra.getUsuario(id).getID());
//				matrizDeListaNegra[contador][1] = ListaNegra.getUsuario(id).getNombreUsuario();
//				matrizDeListaNegra[contador][2] = String.valueOf(ListaNegra.getUsuario(id).getCalificacion());
//				if(Sistema.estaReportado(ListaNegra.getUsuario(id))){
//					matrizDeListaNegra[contador][3] = "Reportado por otro usuario";
//				}else{
//					matrizDeListaNegra[contador][3] = "Calificaciones bajas";
//				}
//	 			contador++;
//			}
//		}
		public modeloTablaListaNegra(String[][] pMatriz){
			matrizDeListaNegra = pMatriz;
		}
		public int getColumnCount() {
		return columnas.length;
		}
		public int getRowCount() {
		return matrizDeListaNegra.length;
		}
		public String getColumnName(int column) {
		return columnas[column];
		}
		public Object getValueAt(int rowIndex, int columnIndex) {
			switch (columnIndex)
			{
				case 0: return matrizDeListaNegra[rowIndex][0]; 
				case 1: return matrizDeListaNegra[rowIndex][1];
				case 2: return matrizDeListaNegra[rowIndex][2];
				case 3: return matrizDeListaNegra[rowIndex][3];
				default: return null;
			}
		}
	}

//////////////////////////////////////Fin Código Consulta Lista Negra////////////////////////////////////////////////////
    
    
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
        else{
            raza = (String)comboBoxRazaMascota.getSelectedItem();
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
	
	public void refrescarPaneles(){
		try {
			
			SistemasMascotas.buscarEnTodasLasMascotas();
			SistemasMascotas.getMascotasPorEstado(opcEstado);
			SistemasMascotas.getMascotasPorTipo("Canino");
			SistemasMascotas.getMascotasPorRaza(opcRaza);
			
	        listaMascotasParaMostrar = SistemasMascotas.getMascotasFiltradas();
	        	        
	        habilitarPanel1();
	        habilitarPanel2();
	        habilitarPanel3();
	        int size = listaMascotasParaMostrar.size();

	        if(size>=3){
	            posicionMascotaPanel3 = size-3;
		        mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
		        lblFotoMascota_3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(mascotaPanel3.getFoto())));
		        lblTituloMascota_3.setText(mascotaPanel3.getTipo()+" " +mascotaPanel3.getEstado()+" en "+mascotaPanel3.getLugarDelSuceso() );
		        lblFecha_3.setText(mascotaPanel3.getDiaSuceso());
		        lblNotas_3.setText(mascotaPanel3.getNota());
	    		lblLugarSuceso_3.setText(mascotaPanel3.getLugarDelSuceso());
	    	}else
	    		ocultarPanel3();

			if(size>=2){		        
		        posicionMascotaPanel2 = size-2;
		        mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
		        lblFotoMascota_2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(mascotaPanel2.getFoto())));
		        lblTituloMascota_2.setText(mascotaPanel2.getTipo()+" " +mascotaPanel2.getEstado()+" en "+mascotaPanel2.getLugarDelSuceso() );
		        lblNotas2.setText(mascotaPanel2.getNota());
		        lblFecha_2.setText(mascotaPanel2.getDiaSuceso());
		        lblLugar_2.setText(mascotaPanel2.getLugarDelSuceso());
	        }else
	        	ocultarPanel2();

	        if (size>=1){
	   			posicionMascotaPanel1 = size-1; 
		        mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
		        lblFotoMascota1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(mascotaPanel1.getFoto())));
				lbltitulomascota1.setText(mascotaPanel1.getTipo()+" " +mascotaPanel1.getEstado()+" en "+mascotaPanel1.getLugarDelSuceso() );   
		        lblfechaSuceso.setText(mascotaPanel1.getDiaSuceso());
				lblNotas_1.setText(mascotaPanel1.getNota());
				lblLugarSuceso1.setText(mascotaPanel1.getLugarDelSuceso());
	        }else
	        	ocultarPanel1();
				
	        
         
		} catch (IOException e) {
			e.printStackTrace();
		}
     
	}
	
	private void habilitarPanel2(){
		lblFotoMascota_2.setVisible(true);
		lblTituloMascota_2.setVisible(true);
		lblFecha_2.setVisible(true);
		lblNotas2.setVisible(true);
		lblLugar_2.setVisible(true);
		panelSegundaMascota.setVisible(true);
	}
	
	private void habilitarPanel1(){
		lblFotoMascota1.setVisible(true);
		lbltitulomascota1.setVisible(true);
		lblfechaSuceso.setVisible(true);
		lblNotas_1.setVisible(true);
		lblLugarSuceso1.setVisible(true);
		panelPrimeraMascota.setVisible(true);
	}
		private void habilitarPanel3(){
		lblFotoMascota_3.setVisible(true);
		lblTituloMascota_3.setVisible(true);
		lblFecha_3.setVisible(true);
		lblNotas_3.setVisible(true);
		lblLugarSuceso_3.setVisible(true);
		panelTerceraMascota.setVisible(true);
	}

	private void ocultarPanel2(){
		lblFotoMascota_2.setVisible(false);
		lblTituloMascota_2.setVisible(false);
		lblFecha_2.setVisible(false);
		lblNotas2.setVisible(false);
		lblLugar_2.setVisible(false);
		panelSegundaMascota.setVisible(false);
	}
	private void ocultarPanel1(){
		lblFotoMascota1.setVisible(false);
		lbltitulomascota1.setVisible(false);
		lblfechaSuceso.setVisible(false);
		lblNotas_1.setVisible(false);
		lblLugarSuceso1.setVisible(false);
		panelPrimeraMascota.setVisible(false);
	}
	private void ocultarPanel3(){
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

