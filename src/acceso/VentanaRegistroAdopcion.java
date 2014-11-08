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

	public void filtro(String tipo){
		listaTemporal.clear();
		for(int x = 0;x<listaMascotasParaMostrar.size();x++){
			if(listaMascotasParaMostrar.get(x).getTipo().equals(tipo)){
				listaTemporal.add(listaMascotasParaMostrar.get(x));
			}	 
		}
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

		JPanel panelAdopcionTres = new JPanel();
		panelAdopcionTres.setBounds(238, 414, 659, 128);
		panelAdopcionTres.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panelMascotaAdopcion.add(panelAdopcionTres);
		panelAdopcionTres.setLayout(null);

		final JButton btnAdoptarPanel3 = new JButton("Adoptar");
		btnAdoptarPanel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaAdoptante adopcion = new VentanaAdoptante(mascotaPanel3);
				adopcion.setVisible(true);
			}
		});
		btnAdoptarPanel3.setBounds(560, 94, 89, 23);
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
		lblFondoPanel3.setBounds(0, 0, 659, 128);
		panelAdopcionTres.add(lblFondoPanel3);

		JPanel panelAdopcionDos = new JPanel();
		panelAdopcionDos.setBounds(238, 279, 659, 128);
		panelAdopcionDos.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		panelMascotaAdopcion.add(panelAdopcionDos);
		panelAdopcionDos.setLayout(null);

		final JButton btnAdoptarPanel2 = new JButton("Adoptar");
		btnAdoptarPanel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VentanaAdoptante adopcion = new VentanaAdoptante(mascotaPanel2);
				adopcion.setVisible(true);
			}
		});
		btnAdoptarPanel2.setBounds(560, 94, 89, 23);
		panelAdopcionDos.add(btnAdoptarPanel2);

		final JLabel labelFotoPanel2 = new JLabel("<Foto>");
		labelFotoPanel2.setBounds(10, 11, 94, 106);
		panelAdopcionDos.add(labelFotoPanel2);

		final JLabel labelTituloPanel2 = new JLabel("<Tipo de Mascota> +\"En Adopcion por: \" +  <Nombre Usuario Encargado>");
		labelTituloPanel2.setBounds(114, 53, 383, 23);
		panelAdopcionDos.add(labelTituloPanel2);

		final JLabel labelFondoPanel2 = new JLabel("");
		labelFondoPanel2.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
		labelFondoPanel2.setBounds(0, 0, 659, 128);
		labelFondoPanel2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		panelAdopcionDos.add(labelFondoPanel2);

		JPanel panelAdopcionUno = new JPanel();
		panelAdopcionUno.setBounds(238, 145, 659, 128);
		panelAdopcionUno.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(100, 149, 237), null, null, null));
		panelMascotaAdopcion.add(panelAdopcionUno);
		panelAdopcionUno.setLayout(null);

		final JButton btnAdoptarPanel1 = new JButton("Adoptar");
		btnAdoptarPanel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VentanaAdoptante adopcion = new VentanaAdoptante(mascotaPanel1);
				adopcion.setVisible(true);
			}
		});
		btnAdoptarPanel1.setBounds(560, 94, 89, 23);
		panelAdopcionUno.add(btnAdoptarPanel1);

		final JLabel labelFotoPanel1 = new JLabel("<Foto>");
		labelFotoPanel1.setBounds(10, 11, 94, 106);
		panelAdopcionUno.add(labelFotoPanel1);

		final JLabel labelTituloPanel1 = new JLabel("<Tipo de Mascota> +\"En Adopcion por: \" +  <Nombre Usuario Encargado>");
		labelTituloPanel1.setBounds(115, 53, 383, 23);
		panelAdopcionUno.add(labelTituloPanel1);

		final JLabel labelFondoPanel1 = new JLabel("");
		labelFondoPanel1.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
		labelFondoPanel1.setBounds(0, 0, 659, 128);
		labelFondoPanel1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
		panelAdopcionUno.add(labelFondoPanel1);

		final JComboBox comboBoxMostrarTipo = new JComboBox();
		
		listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
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
		comboBoxMostrarTipo.setBounds(20, 186, 137, 20);
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
		btnFlechaDerecha.setBounds(773, 553, 151, 44);
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
		btnFlechaIzquierda.setBounds(215, 553, 151, 44);
		panelMascotaAdopcion.add(btnFlechaIzquierda);

		listaUsuarios = SistemasUsuarios.getUsuarios();

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