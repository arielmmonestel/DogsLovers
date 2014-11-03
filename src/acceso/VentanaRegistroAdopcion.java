package acceso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Toolkit;
import java.awt.CardLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.Window.Type;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JRadioButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import logicaDeNegocios.Mascota;
import logicaDeNegocios.Sistema;
import logicaDeNegocios.SistemasMascotas;
import logicaDeNegocios.SistemasUsuarios;
import logicaDeNegocios.Usuario;

import javax.swing.JComboBox;

import java.awt.Choice;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaRegistroAdopcion extends JFrame {

    private JPanel contentPane;
    private ButtonGroup grupoMostrarPor = new ButtonGroup();
    private static ArrayList<Mascota>listaMascotasParaMostrar ;
    private static ArrayList<Usuario> listaUsuarios ;
    private int posicionMascotaPanel1 ;
    private int posicionMascotaPanel2 ;
    private int posicionMascotaPanel3 ;
    private Mascota mascotaPanel1 ;
    private Mascota mascotaPanel2 ;
    private Mascota mascotaPanel3 ;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	SistemasMascotas.leerMascota();
                    SistemasUsuarios.leerUsuarios();
                    VentanaRegistroAdopcion frame = new VentanaRegistroAdopcion();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * @throws IOException 
     */
    public VentanaRegistroAdopcion() throws IOException {
        setTitle("Adopciones");
        setAlwaysOnTop(true);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
        setBounds(100, 100, 979, 695);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(99, 84, 75));
        contentPane.setForeground(new Color(99, 84, 75));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));
        
        JPanel panelMascotaAdopcion = new JPanel();
        panelMascotaAdopcion.setBounds(100, 100, 923, 641);
        contentPane.add(panelMascotaAdopcion, "name_42351462238686");
        panelMascotaAdopcion.setLayout(null);
        
        JComboBox comboBoxMostrarPorRaza = new JComboBox();
        comboBoxMostrarPorRaza.setVisible(false);
        comboBoxMostrarPorRaza.setBounds(20, 241, 137, 20);
        panelMascotaAdopcion.add(comboBoxMostrarPorRaza);
        
        JComboBox comboBoxMostrarTipo = new JComboBox();
        comboBoxMostrarTipo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		if(comboBoxMostrarTipo.getSelectedIndex() == 0){
        			comboBoxMostrarPorRaza.setEnabled(false);
        			comboBoxMostrarPorRaza.setVisible(false);
        			
        			listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
        			
        			
        			
        		}
        		
        		
        		if(comboBoxMostrarTipo.getSelectedIndex() == 1){    
        			comboBoxMostrarPorRaza.setModel(new DefaultComboBoxModel(new String[] {"Airedale Terrier" ,"Akita inu" ,"Alaskan malamute", "American Stafford","Shire Terrier","Basenji",
                            "Basset Hound","Beagle","Bichón Maltés","Boxer","Braco de Weimar","Bull Terrier","Bulldog francés","Bulldog inglés","Caniche","Carlino","Chihuahua","Chow-chow","Cocker Spaniel Americano","Cocker Spaniel inglés",
                            "Crestado chino","Dálmata","Dobermann","Dogo Aleman","Dogo Argentino","Golden retriever","French Poodle",
                            "Labrador Retrevier","Mastín Español","Mastín Napolitano","Pastor Alemán","Pequinés",
                            "Pinscher Pomerania","Rottweiler","Samoyedo","San Bernardo","Schnauzer","Setter inglés",
                            "Setter irlandés","Shar Pei","Shih Tzu","Siberian Husky"})) ;   
        			comboBoxMostrarPorRaza.setVisible(true);
        			comboBoxMostrarPorRaza.setEnabled(true);  

                }
                if (comboBoxMostrarTipo.getSelectedIndex() == 2){
                    
                	comboBoxMostrarPorRaza.setModel(new DefaultComboBoxModel(new String[] {"Abisinio","Aleman de pelo largo","Angora turco","American curl","American shorthair","American wirehair","Aphrodites giant","Australian mist",
                      "Azul ruso","Balinés","Bengalí","Bogtail Japonés","Bosque de noruega","British shorthair","Burmilla","Burmés","Cornish rex","Cymric",
                      "Chartreux","Devon rex","Don sphynx","Gato bombay","Gato brasileño","Ceylon","Europeo","Exótico","Gato habana","Korat","Manx","Munchkin","Ocicat","Ojos azules","Oriental","Oriental de pelo largo","Persa","Siamés","Siberiano","Singapura","Somalí","Tonkinés","LaPerm","Maine coon","Mau egipcio","Peterbald",
                      "Pixiebob","Ragdoll","Sagrado de birmania","Scottish fold","Selkirk Rex","Sphynx","Van turco","Otro"}));
                	comboBoxMostrarPorRaza.setVisible(true);
                	comboBoxMostrarPorRaza.setEnabled(true);
                    
                }
                if (comboBoxMostrarTipo.getSelectedIndex() == 3){
                    
                	comboBoxMostrarPorRaza.setModel(new DefaultComboBoxModel(new String[] {"Canario","Cotorra","Angaporis(Pájaros de Amor)","Rosella","Loro de Bolsillo"
                            ,"Loro","Turaco","Cacatua","Guacamayo","Ninfa","Pato","Gallina","Otro"})); 
                	comboBoxMostrarPorRaza.setVisible(true);
                	comboBoxMostrarPorRaza.setEnabled(true);
                    
                }
                if (comboBoxMostrarTipo.getSelectedIndex() == 4){
                    
                	comboBoxMostrarPorRaza.setModel(new DefaultComboBoxModel(new String[] {"Ardilla Coreana",
                            "Cobaya","Conejos","Erizo","Hamster","Jerbo","Rata","Ratón","Otro"}));
                	comboBoxMostrarPorRaza.setVisible(true);
                	comboBoxMostrarPorRaza.setEnabled(true);
                    
                }
                if (comboBoxMostrarTipo.getSelectedIndex() == 5){
                    
                	comboBoxMostrarPorRaza.setEnabled(false);
                	comboBoxMostrarPorRaza.setVisible(false);
                    
                    
                }


        	}
        });
        comboBoxMostrarTipo.setModel(new DefaultComboBoxModel(new String[] {"Todos", "Canino", "Felino", "Ave", "Roedor", "Otro"}));
        comboBoxMostrarTipo.setBounds(20, 186, 137, 20);
        panelMascotaAdopcion.add(comboBoxMostrarTipo);
        
        JButton btnFlechaDerecha = new JButton("");
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
        btnFlechaDerecha.setBounds(773, 553, 151, 44);
        panelMascotaAdopcion.add(btnFlechaDerecha);
        
        JButton btnFlechaIzquierda = new JButton("");
        btnFlechaIzquierda.setFocusable(false);
        btnFlechaIzquierda.setFocusTraversalKeysEnabled(false);
        btnFlechaIzquierda.setFocusPainted(false);
        btnFlechaIzquierda.setContentAreaFilled(false);
        btnFlechaIzquierda.setBorderPainted(false);
        btnFlechaIzquierda.setPressedIcon(new ImageIcon("./imgs/flechaIzquierda-32.png"));
        btnFlechaIzquierda.setRolloverIcon(new ImageIcon("./imgs/flechaIzquierda-64.png"));
        btnFlechaIzquierda.setIcon(new ImageIcon("./imgs/flechaIzquierda-48.png"));
        btnFlechaIzquierda.setBounds(215, 553, 151, 44);
        panelMascotaAdopcion.add(btnFlechaIzquierda);
        
        listaUsuarios = SistemasUsuarios.getUsuarios();
        
        JPanel panelAdopcionTres = new JPanel();
        panelAdopcionTres.setBounds(238, 414, 659, 128);
        panelAdopcionTres.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        panelMascotaAdopcion.add(panelAdopcionTres);
        panelAdopcionTres.setLayout(null);
        
        JButton btnAdoptarPanel3 = new JButton("Adoptar");
        btnAdoptarPanel3.setBounds(560, 94, 89, 23);
        panelAdopcionTres.add(btnAdoptarPanel3);
        
        JLabel labelFotoPanel3 = new JLabel("<Foto>");
        labelFotoPanel3.setBounds(10, 11, 94, 106);
        panelAdopcionTres.add(labelFotoPanel3);
        
        JLabel lblTituloPanel3 = new JLabel("<Tipo de Mascota> +\"En Adopcion por: \" +  <Nombre Usuario Encargado>");
        lblTituloPanel3.setBounds(114, 53, 383, 23);
        panelAdopcionTres.add(lblTituloPanel3);
        
        JLabel lblFondoPanel3 = new JLabel("");
        lblFondoPanel3.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        lblFondoPanel3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        lblFondoPanel3.setBounds(0, 0, 659, 128);
        panelAdopcionTres.add(lblFondoPanel3);
        
        JPanel panelAdopcionDos = new JPanel();
        panelAdopcionDos.setBounds(238, 279, 659, 128);
        panelAdopcionDos.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        panelMascotaAdopcion.add(panelAdopcionDos);
        panelAdopcionDos.setLayout(null);
        
        JButton btnAdoptarPanel2 = new JButton("Adoptar");
        btnAdoptarPanel2.setBounds(560, 94, 89, 23);
        panelAdopcionDos.add(btnAdoptarPanel2);
        
        JLabel labelFotoPanel2 = new JLabel("<Foto>");
        labelFotoPanel2.setBounds(10, 11, 94, 106);
        panelAdopcionDos.add(labelFotoPanel2);
        
        JLabel labelTituloPanel2 = new JLabel("<Tipo de Mascota> +\"En Adopcion por: \" +  <Nombre Usuario Encargado>");
        labelTituloPanel2.setBounds(114, 53, 383, 23);
        panelAdopcionDos.add(labelTituloPanel2);
        
        JLabel labelFondoPanel2 = new JLabel("");
        labelFondoPanel2.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        labelFondoPanel2.setBounds(0, 0, 659, 128);
        labelFondoPanel2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        panelAdopcionDos.add(labelFondoPanel2);
        
        JPanel panelAdopcionUno = new JPanel();
        panelAdopcionUno.setBounds(238, 145, 659, 128);
        panelAdopcionUno.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(100, 149, 237), null, null, null));
        panelMascotaAdopcion.add(panelAdopcionUno);
        panelAdopcionUno.setLayout(null);
        
        JButton btnAdoptarPanel1 = new JButton("Adoptar");
        btnAdoptarPanel1.setBounds(560, 94, 89, 23);
        panelAdopcionUno.add(btnAdoptarPanel1);
        
        JLabel labelFotoPanel1 = new JLabel("<Foto>");
        labelFotoPanel1.setBounds(10, 11, 94, 106);
        panelAdopcionUno.add(labelFotoPanel1);
        
        JLabel labelTituloPanel1 = new JLabel("<Tipo de Mascota> +\"En Adopcion por: \" +  <Nombre Usuario Encargado>");
        labelTituloPanel1.setBounds(115, 53, 383, 23);
        panelAdopcionUno.add(labelTituloPanel1);
        
        JLabel labelFondoPanel1 = new JLabel("");
        labelFondoPanel1.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        labelFondoPanel1.setBounds(0, 0, 659, 128);
        labelFondoPanel1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        panelAdopcionUno.add(labelFondoPanel1);
        
        JLabel lblMostrarPor = new JLabel("Mostrar  Por:");
        lblMostrarPor.setFont(new Font("Batang", Font.BOLD, 12));
        lblMostrarPor.setBounds(20, 155, 137, 20);
        panelMascotaAdopcion.add(lblMostrarPor);
        
        JLabel labelMostrarPor = new JLabel("");
        labelMostrarPor.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        labelMostrarPor.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        labelMostrarPor.setBounds(10, 125, 198, 234);
        panelMascotaAdopcion.add(labelMostrarPor);
        
        JLabel lblTitulo = new JLabel("");
        lblTitulo.setIcon(new ImageIcon("./imgs/Logo.png"));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(270, 0, 457, 108);
        panelMascotaAdopcion.add(lblTitulo);
        
        JLabel labelFondo = new JLabel("");
        labelFondo.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
        labelFondo.setBounds(0, 0, 2508, 1246);
        panelMascotaAdopcion.add(labelFondo);
        
        Panel panel = new Panel();
        contentPane.add(panel, "name_19734065748226");
    }
}