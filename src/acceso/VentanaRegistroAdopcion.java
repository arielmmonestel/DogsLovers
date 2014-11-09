package acceso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Toolkit;
import java.awt.CardLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.Window.Type;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JRadioButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import logicaDeNegocios.Adopcion;
import logicaDeNegocios.EnviarMail;
import logicaDeNegocios.Mascota;
import logicaDeNegocios.Sistema;
import logicaDeNegocios.SistemasAdopciones;
import logicaDeNegocios.SistemasMascotas;
import logicaDeNegocios.SistemasUsuarios;
import logicaDeNegocios.Usuario;

import javax.swing.JComboBox;

import java.awt.Choice;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.swing.JTextField;


public class VentanaRegistroAdopcion extends JFrame {

	private JPanel contentPane;
	private static ArrayList<Mascota>listaMascotasParaMostrar ;
	private static ArrayList<Mascota>listaTemporal = new  ArrayList<Mascota>();
	private static ArrayList<Usuario>listaUsuarios ;
	private int tamanio ;
	private int contador = 0;
	private String nombreUsuario1;
	private String nombreUsuario2;
	private String nombreUsuario3;
	private int posicionMascotaPanel1 ;
	private int posicionMascotaPanel2 ;
	private int posicionMascotaPanel3 ;
	private Mascota mascotaPanel1 ;
	private Mascota mascotaPanel2 ;
	private Mascota mascotaPanel3 ;
	private JLabel lblRegistrarAdopcin;
	private JPanel panelMascotaAdopcion;
	private Panel panelRegistrarAdopcion;
    private final static String rutaImagenesAdoptantes = "./Adoptantes";
    private JLabel labelDelAdoptante;
    private JButton btnAgregarFoto;
    private static int idUsuarioActivo = VentanaPrincipal.getIDUsuarioActivo();
    private JButton btnGuardarAdopcion;
	protected int idMascota = 0;
	protected String fotoAdoptante = "";
	protected String fotoConvivencia= "";
	protected int idUsuarioQueCalifica= 0;
	protected String nuevoNombreMascota= "";
	private JTextField textFieldNuevoNombreMascota;
	    
	

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

    public static String getRutaImagenesAdoptantes() {
			return rutaImagenesAdoptantes;
		}

	
	public void filtro(String tipo){
		listaTemporal.clear();
		for(int x = 0;x<listaMascotasParaMostrar.size();x++){
			if(listaMascotasParaMostrar.get(x).getTipo().equals(tipo) && listaMascotasParaMostrar.get(x).getEstado().equals("ENADOPCION")){
				listaTemporal.add(listaMascotasParaMostrar.get(x));
			}	 
		}
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public VentanaRegistroAdopcion() throws IOException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Adopciones");
		setAlwaysOnTop(true);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		setBounds(100, 100, 836, 693);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(99, 84, 75));
		contentPane.setForeground(new Color(99, 84, 75));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		panelMascotaAdopcion = new JPanel();
		panelMascotaAdopcion.setBackground(new Color(99,84, 65));
		panelMascotaAdopcion.setBounds(100, 100, 923, 641);
		contentPane.add(panelMascotaAdopcion, "name_42351462238686");
		panelMascotaAdopcion.setLayout(null);

		JPanel panelAdopcionTres = new JPanel();
		panelAdopcionTres.setBounds(238, 414, 489, 128);
		panelAdopcionTres.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panelMascotaAdopcion.add(panelAdopcionTres);
		panelAdopcionTres.setLayout(null);

		final JButton btnAdoptarPanel3 = new JButton("Adoptar");
		btnAdoptarPanel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();

				panelMascotaAdopcion.setVisible(false);
				panelRegistrarAdopcion.setVisible(true);
			}
		});
		btnAdoptarPanel3.setBounds(390, 94, 89, 23);
		panelAdopcionTres.add(btnAdoptarPanel3);

		final JLabel labelFotoPanel3 = new JLabel("<Foto>");
		labelFotoPanel3.setBounds(10, 11, 94, 106);
		panelAdopcionTres.add(labelFotoPanel3);

		final JLabel lblTituloPanel3 = new JLabel("<Tipo de Mascota> +\"En Adopcion por: \" +  <Nombre Usuario Encargado>");
		lblTituloPanel3.setBounds(114, 53, 383, 23);
		panelAdopcionTres.add(lblTituloPanel3);

		final JLabel lblFondoPanel3 = new JLabel("");
		lblFondoPanel3.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
		lblFondoPanel3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		lblFondoPanel3.setBounds(0, 0, 490, 128);
		panelAdopcionTres.add(lblFondoPanel3);

		JPanel panelAdopcionDos = new JPanel();
		panelAdopcionDos.setBounds(238, 279, 489, 128);
		panelAdopcionDos.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panelMascotaAdopcion.add(panelAdopcionDos);
		panelAdopcionDos.setLayout(null);

		final JButton btnAdoptarPanel2 = new JButton("Adoptar");
		btnAdoptarPanel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				panelMascotaAdopcion.setVisible(false);
				panelRegistrarAdopcion.setVisible(true);
			}
		});
		btnAdoptarPanel2.setBounds(390, 94, 89, 23);
		panelAdopcionDos.add(btnAdoptarPanel2);

		final JLabel labelFotoPanel2 = new JLabel("<Foto>");
		labelFotoPanel2.setBounds(10, 11, 94, 106);
		panelAdopcionDos.add(labelFotoPanel2);

		final JLabel labelTituloPanel2 = new JLabel("<Tipo de Mascota> +\"En Adopcion por: \" +  <Nombre Usuario Encargado>");
		labelTituloPanel2.setBounds(114, 53, 383, 23);
		panelAdopcionDos.add(labelTituloPanel2);

		final JLabel labelFondoPanel2 = new JLabel("");
		labelFondoPanel2.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
		labelFondoPanel2.setBounds(0, 0, 490, 128);
		labelFondoPanel2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		panelAdopcionDos.add(labelFondoPanel2);

		JPanel panelAdopcionUno = new JPanel();
		panelAdopcionUno.setBounds(238, 145, 489, 128);
		panelAdopcionUno.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(100, 149, 237), null, null, null));
		panelMascotaAdopcion.add(panelAdopcionUno);
		panelAdopcionUno.setLayout(null);

		final JButton btnAdoptarPanel1 = new JButton("Adoptar");
		btnAdoptarPanel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				panelMascotaAdopcion.setVisible(false);
				panelRegistrarAdopcion.setVisible(true);
				
				
			}
		});
		btnAdoptarPanel1.setBounds(390, 94, 89, 23);
		panelAdopcionUno.add(btnAdoptarPanel1);

		final JLabel labelFotoPanel1 = new JLabel("<Foto>");
		labelFotoPanel1.setBounds(10, 11, 94, 106);
		panelAdopcionUno.add(labelFotoPanel1);

		final JLabel labelTituloPanel1 = new JLabel("<Tipo de Mascota> +\"En Adopcion por: \" +  <Nombre Usuario Encargado>");
		labelTituloPanel1.setBounds(115, 53, 383, 23);
		panelAdopcionUno.add(labelTituloPanel1);

		final JLabel labelFondoPanel1 = new JLabel("");
		labelFondoPanel1.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
		labelFondoPanel1.setBounds(0, 0, 490, 128);
		labelFondoPanel1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		panelAdopcionUno.add(labelFondoPanel1);

		final JComboBox comboBoxMostrarTipo = new JComboBox();
		
		listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
		listaTemporal.clear();
		for(int x = 0;x<listaMascotasParaMostrar.size();x++){
			if(listaMascotasParaMostrar.get(x).getEstado().equals("ENADOPCION")){
				listaTemporal.add(listaMascotasParaMostrar.get(x));
			}	 
		}
		listaMascotasParaMostrar = listaTemporal;
		listaUsuarios = SistemasUsuarios.getUsuarios();
		tamanio = listaMascotasParaMostrar.size();
		posicionMascotaPanel1 = contador;
		posicionMascotaPanel2 = contador + 1;
		posicionMascotaPanel3 = contador + 2;

		if(posicionMascotaPanel1 < tamanio){
			mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
			for(Usuario usuario:listaUsuarios){
				if(mascotaPanel1.getIdEncargado() == usuario.getID()){
					nombreUsuario1 = usuario.getNombre()+" "+usuario.getPrimerApellido();
				}
			}
			labelFotoPanel1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
			labelTituloPanel1.setText(mascotaPanel1.getTipo()+" En adopción por: "+nombreUsuario1);
		}else{
			labelFotoPanel1.setVisible(false);
			labelFondoPanel1.setEnabled(false);
			labelTituloPanel1.setVisible(false);
			btnAdoptarPanel1.setEnabled(false);
		}
		posicionMascotaPanel2 = contador + 1;
		if(posicionMascotaPanel2 < tamanio){
			mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
			for(Usuario usuario:listaUsuarios){
				if(mascotaPanel2.getIdEncargado() == usuario.getID()){
					nombreUsuario2 = usuario.getNombre()+" "+usuario.getPrimerApellido();
				}
			}
			labelFotoPanel2.setIcon(new ImageIcon(mascotaPanel2.getFoto()));
			labelTituloPanel2.setText(mascotaPanel2.getTipo()+" En adopción por: "+nombreUsuario2);
		}else{
			labelFotoPanel2.setVisible(false);
			labelFondoPanel2.setEnabled(false);
			labelTituloPanel2.setVisible(false);
			btnAdoptarPanel2.setEnabled(false);
		}
		posicionMascotaPanel3 = contador + 2;
		if(posicionMascotaPanel3 < tamanio){
			mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
			for(Usuario usuario:listaUsuarios){
				if(mascotaPanel3.getIdEncargado() == usuario.getID()){
					nombreUsuario3 = usuario.getNombre()+" "+usuario.getPrimerApellido();
				}
			}
			labelFotoPanel3.setIcon(new ImageIcon(mascotaPanel3.getFoto()));
			lblTituloPanel3.setText(mascotaPanel3.getTipo()+" En adopción por: "+nombreUsuario3);
		}else{
			labelFotoPanel3.setVisible(false);
			lblFondoPanel3.setEnabled(false);
			lblTituloPanel3.setVisible(false);
			btnAdoptarPanel3.setEnabled(false);
		}

		comboBoxMostrarTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(comboBoxMostrarTipo.getSelectedIndex() == 0){
					contador = 0;
					listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
					try {
						listaUsuarios = SistemasUsuarios.getUsuarios();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					listaTemporal.clear();
					for(int x = 0;x<listaMascotasParaMostrar.size();x++){
						if(listaMascotasParaMostrar.get(x).getEstado().equals("ENADOPCION")){
							listaTemporal.add(listaMascotasParaMostrar.get(x));
						}	 
					}
					listaMascotasParaMostrar = listaTemporal;
					tamanio = listaMascotasParaMostrar.size();
					posicionMascotaPanel1 = contador;
					posicionMascotaPanel2 = contador + 1;
					posicionMascotaPanel3 = contador + 2;

					labelFotoPanel1.setVisible(true);
					labelFondoPanel1.setEnabled(true);
					labelTituloPanel1.setVisible(true);
					btnAdoptarPanel1.setEnabled(true);
					///
					labelFotoPanel2.setVisible(true);
					labelFondoPanel2.setEnabled(true);
					labelTituloPanel2.setVisible(true);
					btnAdoptarPanel2.setEnabled(true);
					///
					labelFotoPanel3.setVisible(true);
					lblFondoPanel3.setEnabled(true);
					lblTituloPanel3.setVisible(true);
					btnAdoptarPanel3.setEnabled(true);

					if(posicionMascotaPanel1 < tamanio){
						mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel1.getIdEncargado() == usuario.getID()){
								nombreUsuario1 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
						labelTituloPanel1.setText(mascotaPanel1.getTipo()+" En adopción por: "+nombreUsuario1);
					}else{
						labelFotoPanel1.setVisible(false);
						labelFondoPanel1.setEnabled(false);
						labelTituloPanel1.setVisible(false);
						btnAdoptarPanel1.setEnabled(false);
					}
					posicionMascotaPanel2 = contador + 1;
					if(posicionMascotaPanel2 < tamanio){
						mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel2.getIdEncargado() == usuario.getID()){
								nombreUsuario2 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel2.setIcon(new ImageIcon(mascotaPanel2.getFoto()));
						labelTituloPanel2.setText(mascotaPanel2.getTipo()+" En adopción por: "+nombreUsuario2);
					}else{
						labelFotoPanel2.setVisible(false);
						labelFondoPanel2.setEnabled(false);
						labelTituloPanel2.setVisible(false);
						btnAdoptarPanel2.setEnabled(false);
					}
					posicionMascotaPanel3 = contador + 2;
					if(posicionMascotaPanel3 < tamanio){
						mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel3.getIdEncargado() == usuario.getID()){
								nombreUsuario3 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel3.setIcon(new ImageIcon(mascotaPanel3.getFoto()));
						lblTituloPanel3.setText(mascotaPanel3.getTipo()+" En adopción por: "+nombreUsuario3);
					}else{
						labelFotoPanel3.setVisible(false);
						lblFondoPanel3.setEnabled(false);
						lblTituloPanel3.setVisible(false);
						btnAdoptarPanel3.setEnabled(false);
					}

				}else{
					contador = 0;
					listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
					try {
						listaUsuarios = SistemasUsuarios.getUsuarios();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					filtro(comboBoxMostrarTipo.getSelectedItem().toString());
					tamanio = listaTemporal.size();
					listaMascotasParaMostrar = listaTemporal;
					posicionMascotaPanel1 = contador;

					if(posicionMascotaPanel1 < tamanio){
						mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel1.getIdEncargado() == usuario.getID()){
								nombreUsuario1 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel1.setVisible(true);
						labelFondoPanel1.setEnabled(true);
						labelTituloPanel1.setVisible(true);
						btnAdoptarPanel1.setEnabled(true);
						labelFotoPanel1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
						labelTituloPanel1.setText(mascotaPanel1.getTipo()+" En adopción por: "+nombreUsuario1);
					}else{
						labelFotoPanel1.setVisible(false);
						labelFondoPanel1.setEnabled(false);
						labelTituloPanel1.setVisible(false);
						btnAdoptarPanel1.setEnabled(false);
					}
					posicionMascotaPanel2 = contador + 1;
					if(posicionMascotaPanel2 < tamanio){
						mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel2.getIdEncargado() == usuario.getID()){
								nombreUsuario2 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel2.setVisible(true);
						labelFondoPanel2.setEnabled(true);
						labelTituloPanel2.setVisible(true);
						btnAdoptarPanel2.setEnabled(true);
						labelFotoPanel2.setIcon(new ImageIcon(mascotaPanel2.getFoto()));
						labelTituloPanel2.setText(mascotaPanel2.getTipo()+" En adopción por: "+nombreUsuario2);
					}else{
						labelFotoPanel2.setVisible(false);
						labelFondoPanel2.setEnabled(false);
						labelTituloPanel2.setVisible(false);
						btnAdoptarPanel2.setEnabled(false);
					}
					posicionMascotaPanel3 = contador + 2;
					if(posicionMascotaPanel3 < tamanio){
						mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel3.getIdEncargado() == usuario.getID()){
								nombreUsuario3 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel3.setVisible(true);
						lblFondoPanel3.setEnabled(true);
						lblTituloPanel3.setVisible(true);
						btnAdoptarPanel3.setEnabled(true);
						labelFotoPanel3.setIcon(new ImageIcon(mascotaPanel3.getFoto()));
						lblTituloPanel3.setText(mascotaPanel3.getTipo()+" En adopción por: "+nombreUsuario3);
					}else{
						labelFotoPanel3.setVisible(false);
						lblFondoPanel3.setEnabled(false);
						lblTituloPanel3.setVisible(false);
						btnAdoptarPanel3.setEnabled(false);
					}
				}

			}
		});
		comboBoxMostrarTipo.setModel(new DefaultComboBoxModel(new String[] {"Todos", "Canino", "Felino", "Ave", "Roedor", "Otro"}));
		comboBoxMostrarTipo.setBounds(40, 207, 137, 20);
		panelMascotaAdopcion.add(comboBoxMostrarTipo);

		JButton btnFlechaDerecha = new JButton("");
		btnFlechaDerecha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tamanio = listaMascotasParaMostrar.size();
				if(tamanio-contador > 3){
					contador+=3;
				}
				if(comboBoxMostrarTipo.getSelectedIndex() == 0){

					listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
					try {
						listaUsuarios = SistemasUsuarios.getUsuarios();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					posicionMascotaPanel1 = contador;
					posicionMascotaPanel2 = contador + 1;
					posicionMascotaPanel3 = contador + 2;

					labelFotoPanel1.setVisible(true);
					labelFondoPanel1.setEnabled(true);
					labelTituloPanel1.setVisible(true);
					btnAdoptarPanel1.setEnabled(true);
					///
					labelFotoPanel2.setVisible(true);
					labelFondoPanel2.setEnabled(true);
					labelTituloPanel2.setVisible(true);
					btnAdoptarPanel2.setEnabled(true);
					///
					labelFotoPanel3.setVisible(true);
					lblFondoPanel3.setEnabled(true);
					lblTituloPanel3.setVisible(true);
					btnAdoptarPanel3.setEnabled(true);

					if(posicionMascotaPanel1 < tamanio){
						mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel1.getIdEncargado() == usuario.getID()){
								nombreUsuario1 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
						labelTituloPanel1.setText(mascotaPanel1.getTipo()+" En adopción por: "+nombreUsuario1);
					}else{
						labelFotoPanel1.setVisible(false);
						labelFondoPanel1.setEnabled(false);
						labelTituloPanel1.setVisible(false);
						btnAdoptarPanel1.setEnabled(false);
					}
					posicionMascotaPanel2 = contador + 1;
					if(posicionMascotaPanel2 < tamanio){
						mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel2.getIdEncargado() == usuario.getID()){
								nombreUsuario2 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel2.setIcon(new ImageIcon(mascotaPanel2.getFoto()));
						labelTituloPanel2.setText(mascotaPanel2.getTipo()+" En adopción por: "+nombreUsuario2);
					}else{
						labelFotoPanel2.setVisible(false);
						labelFondoPanel2.setEnabled(false);
						labelTituloPanel2.setVisible(false);
						btnAdoptarPanel2.setEnabled(false);
					}
					posicionMascotaPanel3 = contador + 2;
					if(posicionMascotaPanel3 < tamanio){
						mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel3.getIdEncargado() == usuario.getID()){
								nombreUsuario3 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel3.setIcon(new ImageIcon(mascotaPanel3.getFoto()));
						lblTituloPanel3.setText(mascotaPanel3.getTipo()+" En adopción por: "+nombreUsuario3);
					}else{
						labelFotoPanel3.setVisible(false);
						lblFondoPanel3.setEnabled(false);
						lblTituloPanel3.setVisible(false);
						btnAdoptarPanel3.setEnabled(false);
					}

				}else{

					listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
					try {
						listaUsuarios = SistemasUsuarios.getUsuarios();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					filtro(comboBoxMostrarTipo.getSelectedItem().toString());
					tamanio = listaTemporal.size();
					listaMascotasParaMostrar = listaTemporal;
					
					posicionMascotaPanel1 = contador;
					if(posicionMascotaPanel1 < tamanio){
						labelFotoPanel1.setVisible(true);
						labelFondoPanel1.setEnabled(true);
						labelTituloPanel1.setVisible(true);
						btnAdoptarPanel1.setEnabled(true);
						mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel1.getIdEncargado() == usuario.getID()){
								nombreUsuario1 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
						labelTituloPanel1.setText(mascotaPanel1.getTipo()+" En adopción por: "+nombreUsuario1);
					}else{
						labelFotoPanel1.setVisible(false);
						labelFondoPanel1.setEnabled(false);
						labelTituloPanel1.setVisible(false);
						btnAdoptarPanel1.setEnabled(false);
					}
					posicionMascotaPanel2 = contador + 1;
					if(posicionMascotaPanel2 < tamanio){
						labelFotoPanel2.setVisible(true);
						labelFondoPanel2.setEnabled(true);
						labelTituloPanel2.setVisible(true);
						btnAdoptarPanel2.setEnabled(true);
						mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel2.getIdEncargado() == usuario.getID()){
								nombreUsuario2 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel2.setIcon(new ImageIcon(mascotaPanel2.getFoto()));
						labelTituloPanel2.setText(mascotaPanel2.getTipo()+" En adopción por: "+nombreUsuario2);
					}else{
						labelFotoPanel2.setVisible(false);
						labelFondoPanel2.setEnabled(false);
						labelTituloPanel2.setVisible(false);
						btnAdoptarPanel2.setEnabled(false);
					}
					posicionMascotaPanel3 = contador + 2;
					if(posicionMascotaPanel3 < tamanio){
						labelFotoPanel3.setVisible(true);
						lblFondoPanel3.setEnabled(true);
						lblTituloPanel3.setVisible(true);
						btnAdoptarPanel3.setEnabled(true);
						mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel3.getIdEncargado() == usuario.getID()){
								nombreUsuario3 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel3.setIcon(new ImageIcon(mascotaPanel3.getFoto()));
						lblTituloPanel3.setText(mascotaPanel3.getTipo()+" En adopción por: "+nombreUsuario3);
					}else{
						labelFotoPanel3.setVisible(false);
						lblFondoPanel3.setEnabled(false);
						lblTituloPanel3.setVisible(false);
						btnAdoptarPanel3.setEnabled(false);
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
		btnFlechaDerecha.setBounds(650, 553, 151, 44);
		panelMascotaAdopcion.add(btnFlechaDerecha);

		JButton btnFlechaIzquierda = new JButton("");
		btnFlechaIzquierda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tamanio = listaMascotasParaMostrar.size();
				if(contador != 0){
					contador-=3;
				}
				if(comboBoxMostrarTipo.getSelectedIndex() == 0){

					listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
					try {
						listaUsuarios = SistemasUsuarios.getUsuarios();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					posicionMascotaPanel1 = contador;
					posicionMascotaPanel2 = contador + 1;
					posicionMascotaPanel3 = contador + 2;

					labelFotoPanel1.setVisible(true);
					labelFondoPanel1.setEnabled(true);
					labelTituloPanel1.setVisible(true);
					btnAdoptarPanel1.setEnabled(true);
					///
					labelFotoPanel2.setVisible(true);
					labelFondoPanel2.setEnabled(true);
					labelTituloPanel2.setVisible(true);
					btnAdoptarPanel2.setEnabled(true);
					///
					labelFotoPanel3.setVisible(true);
					lblFondoPanel3.setEnabled(true);
					lblTituloPanel3.setVisible(true);
					btnAdoptarPanel3.setEnabled(true);

					if(posicionMascotaPanel1 < tamanio){
						mascotaPanel1 = listaMascotasParaMostrar.get(posicionMascotaPanel1);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel1.getIdEncargado() == usuario.getID()){
								nombreUsuario1 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
						labelTituloPanel1.setText(mascotaPanel1.getTipo()+" En adopción por: "+nombreUsuario1);
					}else{
						labelFotoPanel1.setVisible(false);
						labelFondoPanel1.setEnabled(false);
						labelTituloPanel1.setVisible(false);
						btnAdoptarPanel1.setEnabled(false);
					}
					posicionMascotaPanel2 = contador + 1;
					if(posicionMascotaPanel2 < tamanio){
						mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel2.getIdEncargado() == usuario.getID()){
								nombreUsuario2 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel2.setIcon(new ImageIcon(mascotaPanel2.getFoto()));
						labelTituloPanel2.setText(mascotaPanel2.getTipo()+" En adopción por: "+nombreUsuario2);
					}else{
						labelFotoPanel2.setVisible(false);
						labelFondoPanel2.setEnabled(false);
						labelTituloPanel2.setVisible(false);
						btnAdoptarPanel2.setEnabled(false);
					}
					posicionMascotaPanel3 = contador + 2;
					if(posicionMascotaPanel3 < tamanio){
						mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel3.getIdEncargado() == usuario.getID()){
								nombreUsuario3 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel3.setIcon(new ImageIcon(mascotaPanel3.getFoto()));
						lblTituloPanel3.setText(mascotaPanel3.getTipo()+" En adopción por: "+nombreUsuario3);
					}else{
						labelFotoPanel3.setVisible(false);
						lblFondoPanel3.setEnabled(false);
						lblTituloPanel3.setVisible(false);
						btnAdoptarPanel3.setEnabled(false);
					}

				}else{

					listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
					try {
						listaUsuarios = SistemasUsuarios.getUsuarios();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					filtro(comboBoxMostrarTipo.getSelectedItem().toString());
					tamanio = listaTemporal.size();
					posicionMascotaPanel1 = contador;

					if(posicionMascotaPanel1 < tamanio){
						labelFotoPanel1.setVisible(true);
						labelFondoPanel1.setEnabled(true);
						labelTituloPanel1.setVisible(true);
						btnAdoptarPanel1.setEnabled(true);
						mascotaPanel1 = listaTemporal.get(posicionMascotaPanel1);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel1.getIdEncargado() == usuario.getID()){
								nombreUsuario1 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel1.setIcon(new ImageIcon(mascotaPanel1.getFoto()));
						labelTituloPanel1.setText(mascotaPanel1.getTipo()+" En adopción por: "+nombreUsuario1);
					}else{
						labelFotoPanel1.setVisible(false);
						labelFondoPanel1.setEnabled(false);
						labelTituloPanel1.setVisible(false);
						btnAdoptarPanel1.setEnabled(false);
					}
					posicionMascotaPanel2 = contador + 1;
					if(posicionMascotaPanel2 < tamanio){
						labelFotoPanel2.setVisible(true);
						labelFondoPanel2.setEnabled(true);
						labelTituloPanel2.setVisible(true);
						btnAdoptarPanel2.setEnabled(true);
						mascotaPanel2 = listaTemporal.get(posicionMascotaPanel2);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel2.getIdEncargado() == usuario.getID()){
								nombreUsuario2 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel2.setIcon(new ImageIcon(mascotaPanel2.getFoto()));
						labelTituloPanel2.setText(mascotaPanel2.getTipo()+" En adopción por: "+nombreUsuario2);
					}else{
						labelFotoPanel2.setVisible(false);
						labelFondoPanel2.setEnabled(false);
						labelTituloPanel2.setVisible(false);
						btnAdoptarPanel2.setEnabled(false);
					}
					posicionMascotaPanel3 = contador + 2;
					if(posicionMascotaPanel3 < tamanio){
						labelFotoPanel3.setVisible(true);
						lblFondoPanel3.setEnabled(true);
						lblTituloPanel3.setVisible(true);
						btnAdoptarPanel3.setEnabled(true);
						mascotaPanel3 = listaTemporal.get(posicionMascotaPanel3);
						for(Usuario usuario:listaUsuarios){
							if(mascotaPanel3.getIdEncargado() == usuario.getID()){
								nombreUsuario3 = usuario.getNombre()+" "+usuario.getPrimerApellido();
							}
						}
						labelFotoPanel3.setIcon(new ImageIcon(mascotaPanel3.getFoto()));
						lblTituloPanel3.setText(mascotaPanel3.getTipo()+" En adopción por: "+nombreUsuario3);
					}else{
						labelFotoPanel3.setVisible(false);
						lblFondoPanel3.setEnabled(false);
						lblTituloPanel3.setVisible(false);
						btnAdoptarPanel3.setEnabled(false);
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
		btnFlechaIzquierda.setBounds(161, 553, 151, 44);
		panelMascotaAdopcion.add(btnFlechaIzquierda);

		listaUsuarios = SistemasUsuarios.getUsuarios();

		JLabel lblMostrarPor = new JLabel("Mostrar  Por:");
		lblMostrarPor.setFont(new Font("Batang", Font.BOLD, 12));
		lblMostrarPor.setBounds(40, 176, 137, 20);
		panelMascotaAdopcion.add(lblMostrarPor);

		JLabel labelMostrarPor = new JLabel("");
		labelMostrarPor.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
		labelMostrarPor.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		labelMostrarPor.setBounds(30, 146, 198, 234);
		panelMascotaAdopcion.add(labelMostrarPor);

		JLabel lblTitulo = new JLabel("");
		lblTitulo.setIcon(new ImageIcon("./imgs/Logo.png"));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(270, 0, 457, 108);
		panelMascotaAdopcion.add(lblTitulo);

		panelRegistrarAdopcion = new Panel();
		contentPane.add(panelRegistrarAdopcion, "name_19734065748226");
		panelRegistrarAdopcion.setLayout(null);
		
		btnAgregarFoto= new JButton("");
		btnAgregarFoto.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        JFileChooser elegir = new JFileChooser();
		        int resultadoAbrir = elegir.showOpenDialog(btnAgregarFoto);
		        File archivoSeleccionado = elegir.getSelectedFile();
		        if (resultadoAbrir == JFileChooser.APPROVE_OPTION) {
		            String pathArchivo = archivoSeleccionado.getAbsolutePath();     
		            String nombre =      archivoSeleccionado.getName();                    
		            if (archivoSeleccionado != null) {
		                try {
		                    BufferedImage imagenMostrada = ImageIO.read(archivoSeleccionado);
		                    Dimension recuadro =labelDelAdoptante.getSize();
		                    labelDelAdoptante.setIcon(new ImageIcon(imagenMostrada.getScaledInstance(recuadro.width, recuadro.height, Image.SCALE_AREA_AVERAGING)));
		                } catch (IOException ex) {
		                    JOptionPane.showMessageDialog(btnAgregarFoto, ex.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
		                }
		            }
		            
		        }
		        Sistema.crearCarpetaImagenesAdoptantes();
		        Sistema.asignarIDFotoAdoptante();
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
		btnAgregarFoto.setBounds(187, 503, 75, 65);
		
			panelRegistrarAdopcion.add(btnAgregarFoto);
		
		lblRegistrarAdopcin = new JLabel("Registrar Adopci\u00F3n");
		lblRegistrarAdopcin.setForeground(new Color(210, 180, 140));
		lblRegistrarAdopcin.setFont(new Font("Khmer UI", Font.BOLD, 35));
		lblRegistrarAdopcin.setBounds(10, 129, 379, 93);
		
		panelRegistrarAdopcion.add(lblRegistrarAdopcin);
		
		JLabel lblTituloNuevaAdopcion = new JLabel("");
		lblTituloNuevaAdopcion.setIcon(new ImageIcon("./imgs/Logo.png"));
		lblTituloNuevaAdopcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloNuevaAdopcion.setBounds(206, 0, 457, 108);
			panelRegistrarAdopcion.add(lblTituloNuevaAdopcion);
			
			JLabel labelFotoMascotaAdopcion = new JLabel("<FotoDeLaMascota>");
			labelFotoMascotaAdopcion.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelFotoMascotaAdopcion.setBounds(20, 233, 146, 137);
			panelRegistrarAdopcion.add(labelFotoMascotaAdopcion);
			
			JLabel labelRazaMAscotaAdopccion = new JLabel("<RazaDeLaMascota>");
			labelRazaMAscotaAdopccion.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelRazaMAscotaAdopccion.setBounds(270, 322, 185, 26);
			panelRegistrarAdopcion.add(labelRazaMAscotaAdopccion);
			
			JLabel labelTipoMascotaAdopcion = new JLabel("<TipoDeMascota>");
			labelTipoMascotaAdopcion.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelTipoMascotaAdopcion.setBounds(270, 272, 185, 26);
			panelRegistrarAdopcion.add(labelTipoMascotaAdopcion);
			
			JLabel labelEncargadoActual = new JLabel("<EncargadoActual>");
			labelEncargadoActual.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelEncargadoActual.setBounds(270, 372, 185, 26);
			panelRegistrarAdopcion.add(labelEncargadoActual);
			
			JLabel labelFechaDeAdopcion = new JLabel("<FechaDeAdopcion>");
			labelFechaDeAdopcion.setText("Fecha de la Adopción: "+Sistema.getFecha());
			labelFechaDeAdopcion.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelFechaDeAdopcion.setBounds(270, 233, 290, 26);
			panelRegistrarAdopcion.add(labelFechaDeAdopcion);
			
			labelDelAdoptante = new JLabel("<FotoDelAdoptante>");
			labelDelAdoptante.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelDelAdoptante.setBounds(20, 446, 146, 137);
			panelRegistrarAdopcion.add(labelDelAdoptante);
			
			JLabel lblNombreDelAdoptante = new JLabel("<NombreDelAdoptante>");
			lblNombreDelAdoptante.setText(SistemasUsuarios.getNombreCompletoDelUsuario(idUsuarioActivo));
			lblNombreDelAdoptante.setFont(new Font("Khmer UI", Font.BOLD, 15));
			lblNombreDelAdoptante.setBounds(272, 446, 258, 26);
			panelRegistrarAdopcion.add(lblNombreDelAdoptante);
			
			JLabel labelCantMascotasAdoptadas = new JLabel("<CAntidadDeMAscotasAdoptadas>");
			labelCantMascotasAdoptadas.setText(String.valueOf(SistemasUsuarios.getCantMascotasAdoptadas(idUsuarioActivo))); 
			labelCantMascotasAdoptadas.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelCantMascotasAdoptadas.setBounds(272, 495, 258, 26);
			panelRegistrarAdopcion.add(labelCantMascotasAdoptadas);
			
			JLabel labelCorreoDelAdoptante = new JLabel("<CorreoDelAdoptante>");
			labelCorreoDelAdoptante.setText(SistemasUsuarios.getCorreoDelUsuario(idUsuarioActivo));
			labelCorreoDelAdoptante.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelCorreoDelAdoptante.setBounds(272, 542, 258, 26);
			panelRegistrarAdopcion.add(labelCorreoDelAdoptante);
			
			JLabel labelTelefonoDelAdoptante = new JLabel("<TelefonoDelAdoptante>");
			labelTelefonoDelAdoptante.setText(SistemasUsuarios.getTelefonoDelUsuario(idUsuarioActivo));
			labelTelefonoDelAdoptante.setFont(new Font("Khmer UI", Font.BOLD, 15));
			labelTelefonoDelAdoptante.setBounds(272, 590, 258, 26);
			panelRegistrarAdopcion.add(labelTelefonoDelAdoptante);
			
			btnGuardarAdopcion = new JButton("");
			btnGuardarAdopcion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					Adopcion adopcion = new Adopcion(idUsuarioActivo, idMascota, fotoAdoptante,fotoConvivencia,idUsuarioQueCalifica);
							try {
								//SistemasUsuarios.leerUsuarios();
								SistemasAdopciones.AgregarAdopcion(adopcion);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							String subject = "¡Se ha registrado la adopción de" +nuevoNombreMascota+ "!";
							String mensaje = "¡Es un honor ser parte de la adopción de " +nuevoNombreMascota+ "!." + "\n"+ 
											 "Es importante cuidar mucho de "+nuevoNombreMascota+ "pues será calificado por el usuario que dio en adopción a" +nuevoNombreMascota+ "\n"   
											 + "\n"+"Fecha de Registro: " + Sistema.getFecha()+ "\n"+ "¡Muchas Felicidades!";
							EnviarMail.correoDestinatario = SistemasUsuarios.getCorreoDelUsuario(idUsuarioActivo);
							EnviarMail.subject = subject;
							EnviarMail.mensaje = mensaje;
							
							JOptionPane.showMessageDialog(contentPane, "Adopción registrada correctamente. Se enviará un correo electrónico con los datos de la adopcion");
							
								EnviarMail.enviarMail();
								JOptionPane.showMessageDialog(contentPane, "Correo electrónico enviado correctamente");
							
			  }
				
			});
			btnGuardarAdopcion.setToolTipText("GuardarAdopcion");
			btnGuardarAdopcion.setFocusPainted(false);
			btnGuardarAdopcion.setOpaque(false);
			btnGuardarAdopcion.setContentAreaFilled(false);
			btnGuardarAdopcion.setBorderPainted(false);
			btnGuardarAdopcion.setBorder(null);
			btnGuardarAdopcion.setHorizontalTextPosition(SwingConstants.CENTER);
			btnGuardarAdopcion.setIconTextGap(-3);
			btnGuardarAdopcion.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
			btnGuardarAdopcion.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
			btnGuardarAdopcion.setIcon(new ImageIcon("./imgs/save-48.png"));
			btnGuardarAdopcion.setBounds(598, 590, 105, 64);
			panelRegistrarAdopcion.add(btnGuardarAdopcion);
			
			JLabel lblNuevoNombreDe = new JLabel("Nuevo Nombre de la Mascota: ");
			lblNuevoNombreDe.setFont(new Font("Khmer UI", Font.BOLD, 15));
			lblNuevoNombreDe.setBounds(270, 421, 249, 26);
			panelRegistrarAdopcion.add(lblNuevoNombreDe);
			
			textFieldNuevoNombreMascota = new JTextField();
			textFieldNuevoNombreMascota.setBounds(540, 421, 128, 20);
			panelRegistrarAdopcion.add(textFieldNuevoNombreMascota);
			textFieldNuevoNombreMascota.setColumns(10);
	}
}