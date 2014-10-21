package acceso;

import java.awt.EventQueue;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.SystemColor;

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

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
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

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VentanaPrincipal {

	private static final Component CheckBoxCasaCuna = null;
	private JFrame frame;
	private JPanel panelPrincipal;
	private JPanel panelAgregarMascota;
	private JPanel panelAgregarCasaCuna;
	
    private JTextField textFieldNombreMascota;
    private JTextField textFieldNumChip;
    JTextField textFieldMontoRecompensa;
    private final ButtonGroup estadoMascota = new ButtonGroup() ;
    private final ButtonGroup monedaDePago = new ButtonGroup() ;
    private JRadioButton rdbtnColones;
    private JRadioButton radioButtonDolares;
    private JLabel lblMonto;
    private JComboBox comboBoxRazaMascota;
    private JRadioButton rdbtnEncontrada;
    private JRadioButton rdbtnPerdida;
    private JComboBox comboBoxCanton;
    private JButton buttonGuardar;
    private JComboBox comboBoxTipoMascota;
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(0, 0, 1435, 735);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panelPrincipal = new JPanel();
		frame.getContentPane().add(panelPrincipal, "name_27977974667427");
		panelPrincipal.setLayout(null);
		panelPrincipal.setVisible(true);
		
		
		panelAgregarMascota = new JPanel();
		frame.getContentPane().add(panelAgregarMascota, "name_27990074221032");
		panelAgregarMascota.setLayout(null);
		panelAgregarMascota.setVisible(false);
		
		/*Inicio Codigo del Panel Agregar Mascota*/
		
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
        
        final JLabel lblDer = new JLabel("Der");
        lblDer.setVisible(false);
        
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
        
        JButton buttonCancelar = new JButton("");
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
        buttonCancelar.setBounds(1155, 558, 109, 78);
        panelAgregarMascota.add(buttonCancelar);
        buttonGuardar.setDefaultCapable(false);
        buttonGuardar.setContentAreaFilled(false);
        buttonGuardar.setBorderPainted(false);
        buttonGuardar.setIconTextGap(-3);
        buttonGuardar.setHorizontalTextPosition(SwingConstants.CENTER);
        buttonGuardar.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
        buttonGuardar.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
        buttonGuardar.setIcon(new ImageIcon("./imgs/save-48.png"));
        buttonGuardar.setBounds(1036, 558, 109, 78);
        panelAgregarMascota.add(buttonGuardar);
        
        comboBoxCanton = new JComboBox();
        comboBoxCanton.setBounds(500, 477, 168, 20);
        comboBoxCanton.setModel(new DefaultComboBoxModel(new String[] {"Central","Escazú","Desamparados","Puriscal","Tarrazú","Aserrí","Mora","Goicoechea","Santa Ana","Alajuelita",
                                                                            "Coronado","Acosta","Tibás","Moravia","Montes de Oca","Turrubares",
                                                                            "Dota","Curridabat","Perez Zeledón","León Cortés"}))    ;           
        
        panelAgregarMascota.add(comboBoxCanton);
        
        final JComboBox comboBoxProvincia = new JComboBox();
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
        comboBoxProvincia.setBounds(322, 477, 168, 19);
        panelAgregarMascota.add(comboBoxProvincia);
        lblDer.setEnabled(false);
        lblDer.setHorizontalAlignment(SwingConstants.RIGHT);
        lblDer.setBounds(699, 360, 46, 14);
        panelAgregarMascota.add(lblDer);
        
        final JComboBox comboBoxOjoDerecho = new JComboBox();
        comboBoxOjoDerecho.setModel(new DefaultComboBoxModel(new String[] {"Cafe", "Azul", "Negro", "Gris", "Amarillo", "Verde", "Celeste"}));
        comboBoxOjoDerecho.setVisible(false);
        comboBoxOjoDerecho.setEnabled(false);
        comboBoxOjoDerecho.setBounds(670, 375, 75, 20);
        panelAgregarMascota.add(comboBoxOjoDerecho);
        
        final JLabel lblIzq = new JLabel("Izq");
        lblIzq.setVisible(false);
        lblIzq.setEnabled(false);
        lblIzq.setBounds(585, 360, 46, 14);
        panelAgregarMascota.add(lblIzq);
        
        final JComboBox comboBoxOjoIzquierdo = new JComboBox();
        comboBoxOjoIzquierdo.setModel(new DefaultComboBoxModel(new String[] {"Negro", "Cafe", "Azul", "Gris", "Amarillo", "Verde", "Celeste"}));
        comboBoxOjoIzquierdo.setVisible(false);
        comboBoxOjoIzquierdo.setEnabled(false);
        comboBoxOjoIzquierdo.setBounds(585, 375, 75, 20);
        panelAgregarMascota.add(comboBoxOjoIzquierdo);
        
        JSpinner spinner = new JSpinner();
        spinner.setToolTipText("D\u00EDa");
        spinner.setModel(new SpinnerNumberModel(1, 1, 31, 1));
        spinner.setBounds(322, 420, 39, 23);
        panelAgregarMascota.add(spinner);
        
        JSpinner spinnerAnioPerdida = new JSpinner();
        spinnerAnioPerdida.setToolTipText("A\u00F1o");
        spinnerAnioPerdida.setBounds(561, 419, 61, 23);
        spinnerAnioPerdida.setModel(new SpinnerNumberModel(2014.0, 1990.0, 2014.0, 1.0));
        panelAgregarMascota.add(spinnerAnioPerdida);
        
        JComboBox comboBoxMesPerdida = new JComboBox();
        comboBoxMesPerdida.setToolTipText("Mes");
        comboBoxMesPerdida.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"}));
        comboBoxMesPerdida.setBounds(381, 419, 163, 23);
        panelAgregarMascota.add(comboBoxMesPerdida);
        
        textFieldMontoRecompensa = new JTextField();
        textFieldMontoRecompensa.setColumns(10);
        textFieldMontoRecompensa.setBounds(487, 526, 127, 23);
        panelAgregarMascota.add(textFieldMontoRecompensa);
        
        lblMonto = new JLabel("Monto");
        lblMonto.setForeground(Color.WHITE);
        lblMonto.setFont(new Font("Batang", Font.BOLD, 19));
        lblMonto.setBounds(415, 530, 75, 14);
        panelAgregarMascota.add(lblMonto);
        chckbxRecompensa.setBounds(34, 526, 163, 23);
        chckbxRecompensa.setSelected(true);
        panelAgregarMascota.add(chckbxRecompensa);
        
        JLabel lblsiAplica_1 = new JLabel("(Si Aplica)");
        lblsiAplica_1.setBounds(187, 275, 61, 14);
        panelAgregarMascota.add(lblsiAplica_1);
        
        final JLabel lblsiAplica = new JLabel("(Si Aplica)");
        lblsiAplica.setBounds(240, 226, 61, 14);
        panelAgregarMascota.add(lblsiAplica);
        
        JLabel lblEstado = new JLabel("Estado de la Mascota");
        lblEstado.setForeground(Color.WHITE);
        lblEstado.setFont(new Font("Batang", Font.BOLD, 19));
        lblEstado.setBounds(34, 58, 214, 23);
        panelAgregarMascota.add(lblEstado);
        
        JLabel lblTipoDeMascota = new JLabel("Tipo de Mascota");
        lblTipoDeMascota.setForeground(Color.WHITE);
        lblTipoDeMascota.setFont(new Font("Batang", Font.BOLD, 19));
        lblTipoDeMascota.setBounds(34, 117, 186, 23);
        panelAgregarMascota.add(lblTipoDeMascota);
        
        JLabel lblRaza = new JLabel("Raza");
        lblRaza.setForeground(Color.WHITE);
        lblRaza.setFont(new Font("Batang", Font.BOLD, 19));
        lblRaza.setBounds(34, 169, 186, 23);
        panelAgregarMascota.add(lblRaza);
        
        final JLabel lblNombreDeLa = new JLabel("Nombre de la Mascota");
        lblNombreDeLa.setForeground(Color.WHITE);
        lblNombreDeLa.setFont(new Font("Batang", Font.BOLD, 19));
        lblNombreDeLa.setBounds(34, 219, 214, 23);
        panelAgregarMascota.add(lblNombreDeLa);
        
        final JLabel lblNumeroDeChip = new JLabel("N\u00FAmero de Chip");
        lblNumeroDeChip.setForeground(Color.WHITE);
        lblNumeroDeChip.setFont(new Font("Batang", Font.BOLD, 19));
        lblNumeroDeChip.setBounds(34, 271, 225, 23);
        panelAgregarMascota.add(lblNumeroDeChip);
        
        JLabel lblColorDelPelaje = new JLabel("Color del Pelaje");
        lblColorDelPelaje.setForeground(Color.WHITE);
        lblColorDelPelaje.setFont(new Font("Batang", Font.BOLD, 19));
        lblColorDelPelaje.setBounds(34, 324, 186, 23);
        panelAgregarMascota.add(lblColorDelPelaje);
        
        JLabel lblColorDeOjos = new JLabel("Color de Ojos");
        lblColorDeOjos.setForeground(Color.WHITE);
        lblColorDeOjos.setFont(new Font("Batang", Font.BOLD, 19));
        lblColorDeOjos.setBounds(34, 374, 186, 23);
        panelAgregarMascota.add(lblColorDeOjos);
        
        final JLabel lblSitioDeHallazgoperdida = new JLabel("Sitio de P\u00E9rdida");
        lblSitioDeHallazgoperdida.setForeground(Color.WHITE);
        lblSitioDeHallazgoperdida.setFont(new Font("Batang", Font.BOLD, 19));
        lblSitioDeHallazgoperdida.setBounds(34, 473, 177, 23);
        panelAgregarMascota.add(lblSitioDeHallazgoperdida);
        
        final JLabel lblFechaDeHallazgoperdida = new JLabel("Fecha de P\u00E9rdida");
        lblFechaDeHallazgoperdida.setForeground(Color.WHITE);
        lblFechaDeHallazgoperdida.setFont(new Font("Batang", Font.BOLD, 19));
        lblFechaDeHallazgoperdida.setBounds(34, 420, 163, 23);
        panelAgregarMascota.add(lblFechaDeHallazgoperdida);
        
        JLabel lblNotas = new JLabel("Notas");
        lblNotas.setForeground(Color.WHITE);
        lblNotas.setFont(new Font("Batang", Font.BOLD, 19));
        lblNotas.setBounds(861, 314, 384, 28);
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
                    
                }
                
                
            }
        });
        rdbtnPerdida.setBounds(318, 58, 109, 23);
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
                    
                    
                }else{
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
        rdbtnEncontrada.setBounds(446, 58, 109, 23);
        estadoMascota.add(rdbtnEncontrada);
        panelAgregarMascota.add(rdbtnEncontrada);
        
         comboBoxTipoMascota = new JComboBox();
        comboBoxTipoMascota.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
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
                    //comboBoxRazaMascota.setVisible(false);
                    comboBoxRazaMascota.setEnabled(false);
                }

                }
            
        });
        comboBoxTipoMascota.setBounds(322, 118, 233, 20);
        comboBoxTipoMascota.setModel(new DefaultComboBoxModel(new String[] {"Canino", "Felino", "Ave", "Roedor", "Otro"}));
        panelAgregarMascota.add(comboBoxTipoMascota);
        
        comboBoxRazaMascota = new JComboBox();
        comboBoxRazaMascota.setModel(new DefaultComboBoxModel(new String[] {"Airedale Terrier" ,"Akita inu" ,"Alaskan malamute", "American Stafford","Shire Terrier","Basenji",
                "Basset Hound","Beagle","Bichón Maltés","Boxer","Braco de Weimar","Bull Terrier","Bulldog francés","Bulldog inglés","Caniche","Carlino","Chihuahua","Chow-chow","Cocker Spaniel Americano","Cocker Spaniel inglés","Crestado chino","Dálmata","Dobermann","Dogo Aleman","Dogo Argentino","Golden retriever",
                "Labrador Retrevier","Mastín Español","Mastín Napolitano","Pastor Alemán","Pequinés",
                "Pinscher Pomerania","Rottweiler","Samoyedo","San Bernardo","Schnauzer","Setter inglés",
                "Setter irlandés","Shar Pei","Shih Tzu","Siberian Husky"})) ;           
        comboBoxRazaMascota.setBounds(322, 170, 233, 20);
        panelAgregarMascota.add(comboBoxRazaMascota);
        
        textFieldNombreMascota = new JTextField();
        textFieldNombreMascota.setBounds(322, 219, 233, 23);
        panelAgregarMascota.add(textFieldNombreMascota);
        textFieldNombreMascota.setColumns(10);
        
        textFieldNumChip = new JTextField();
        textFieldNumChip.setBounds(322, 271, 233, 23);
        textFieldNumChip.setColumns(10);
        panelAgregarMascota.add(textFieldNumChip);
        
        JComboBox comboBoxColorPelaje = new JComboBox();
        comboBoxColorPelaje.setModel(new DefaultComboBoxModel(new String[] {"Negro", "Manchado", "Dos Tonalidades", "Amarillo", "Cafe", "Blanco", "Gris"}));
        comboBoxColorPelaje.setBounds(322, 325, 233, 20);
        panelAgregarMascota.add(comboBoxColorPelaje);
        
        final JComboBox comboBoxColorOjos = new JComboBox();
        comboBoxColorOjos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(comboBoxColorOjos.getSelectedIndex()== 7){
                    lblDer.setVisible(true);
                    lblIzq.setVisible(true);
                    comboBoxOjoDerecho.setVisible(true);
                    comboBoxOjoDerecho.setEnabled(true);
                    comboBoxOjoIzquierdo.setVisible(true);
                    comboBoxOjoIzquierdo.setEnabled(true);
                }
                else{
                    lblDer.setVisible(false);
                    lblIzq.setVisible(false);
                    comboBoxOjoDerecho.setVisible(false);
                    comboBoxOjoDerecho.setEnabled(false);
                    comboBoxOjoIzquierdo.setVisible(false);
                    comboBoxOjoIzquierdo.setEnabled(false);
                    
                }
            }
        });
        comboBoxColorOjos.setModel(new DefaultComboBoxModel(new String[] {"Cafes", "Azules", "Negros", "Grises", "Amarillos", "Verdes", "Celestes", "Dos Tonos (Especifique)"}));
        comboBoxColorOjos.setBounds(322, 375, 233, 20);
        panelAgregarMascota.add(comboBoxColorOjos);
        
        rdbtnColones = new JRadioButton("\u20A1");
        rdbtnColones.setForeground(Color.WHITE);
        rdbtnColones.setContentAreaFilled(false);
        rdbtnColones.setSelected(true);
        rdbtnColones.setBounds(318, 526, 39, 23);
        monedaDePago.add(rdbtnColones);
        panelAgregarMascota.add(rdbtnColones);
        
        radioButtonDolares = new JRadioButton("$");
        radioButtonDolares.setForeground(Color.WHITE);
        radioButtonDolares.setContentAreaFilled(false);
        radioButtonDolares.setBounds(362, 526, 47, 23);
        monedaDePago.add(radioButtonDolares);
        panelAgregarMascota.add(radioButtonDolares);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(861, 353, 384, 184);
        panelAgregarMascota.add(scrollPane);
        
        JEditorPane editorPaneNotas = new JEditorPane();
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
		frame.getContentPane().add(panelAgregarCasaCuna, "name_28003406149630");
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
		scrollPane_1.setBounds(64, 429, 399, 130);
		panelAgregarCasaCuna.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JCheckBox chckbxNoAlimentos = new JCheckBox("No");
		chckbxNoAlimentos.setForeground(Color.WHITE);
		chckbxNoAlimentos.setContentAreaFilled(false);
		chckbxNoAlimentos.setFont(new Font("Batang", Font.BOLD, 11));
		chckbxNoAlimentos.setBounds(443, 331, 97, 23);
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
		lblnecesitarDonacionesDe_1.setBounds(64, 324, 373, 30);
		panelAgregarCasaCuna.add(lblnecesitarDonacionesDe_1);
		
		JCheckBox chckbxNoMedicamentos = new JCheckBox("No");
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
		chckbxNoMedicamentos.setBounds(443, 271, 97, 23);
		panelAgregarCasaCuna.add(chckbxNoMedicamentos);
		
		JLabel lblnecesitarDonacionesDe = new JLabel("\u00BFNecesitar\u00E9 Donaciones de Medicamentos?");
		lblnecesitarDonacionesDe.setForeground(Color.WHITE);
		lblnecesitarDonacionesDe.setFont(new Font("Batang", Font.BOLD, 17));
		lblnecesitarDonacionesDe.setBounds(64, 265, 373, 30);
		panelAgregarCasaCuna.add(lblnecesitarDonacionesDe);

		JLabel lblDireccionCasaCuna = new JLabel("Direccion Casa Cuna");
		lblDireccionCasaCuna.setForeground(Color.WHITE);
		lblDireccionCasaCuna.setFont(new Font("Batang", Font.BOLD, 19));
		lblDireccionCasaCuna.setBounds(64, 401, 203, 23);
		panelAgregarCasaCuna.add(lblDireccionCasaCuna);
		
		JLabel lblTamaoDeMascota = new JLabel("Tama\u00F1o de Mascota a Recibir");
		lblTamaoDeMascota.setForeground(Color.WHITE);
		lblTamaoDeMascota.setFont(new Font("Batang", Font.BOLD, 19));
		lblTamaoDeMascota.setBounds(64, 61, 270, 23);
		panelAgregarCasaCuna.add(lblTamaoDeMascota);
		
		lblTipoDeMascota = new JLabel("Tipo de Mascota");
		lblTipoDeMascota.setForeground(Color.WHITE);
		lblTipoDeMascota.setFont(new Font("Batang", Font.BOLD, 19));
		lblTipoDeMascota.setBounds(64, 130, 146, 23);
		panelAgregarCasaCuna.add(lblTipoDeMascota);
		
		JLabel lblCantidadDeMascotas = new JLabel("\u00BFCu\u00E1ntas Mascotas Podr\u00E9 Recibir? ");
		lblCantidadDeMascotas.setForeground(Color.WHITE);
		lblCantidadDeMascotas.setFont(new Font("Batang", Font.BOLD, 19));
		lblCantidadDeMascotas.setBounds(64, 201, 319, 23);
		panelAgregarCasaCuna.add(lblCantidadDeMascotas);
		
		JComboBox comboBoxTamanoMascota = new JComboBox();
		comboBoxTamanoMascota.setModel(new DefaultComboBoxModel(new String[] {"Peque\u00F1a(s)", "Mediana(s)", "Grande(s)"}));
		comboBoxTamanoMascota.setBounds(399, 61, 203, 22);
		panelAgregarCasaCuna.add(comboBoxTamanoMascota);
		
		JSpinner spinnerCantidadDeMascota = new JSpinner();
		spinnerCantidadDeMascota.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinnerCantidadDeMascota.setBounds(399, 201, 54, 20);
		panelAgregarCasaCuna.add(spinnerCantidadDeMascota);
		
		comboBoxTipoMascota = new JComboBox();
		comboBoxTipoMascota.setModel(new DefaultComboBoxModel(new String[] {"Caninos", "Felinos", "Aves", "Roedores", "Otros (Especifique)"}));
		comboBoxTipoMascota.setBounds(399, 130, 153, 20);
		panelAgregarCasaCuna.add(comboBoxTipoMascota);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\fondoRegistro.png"));
		label.setBounds(0, 0, 1354, 675);
		panelAgregarCasaCuna.add(label);
		labelFondo.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
        
		
		
		
/*fin codigo Casa Cuna*/
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
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
		mntmCasaCuna.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\casaCuna.png"));
		mnRegistro.add(mntmCasaCuna);
		panelAgregarCasaCuna.setVisible(false);
	}
}
