

/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
*Fecha de Creacion: 4/11/2014
*
*Descripción: Esta es la clase VentanaRegistroAdopcion, su función es abrir una ventana que permita registrar nuevas adopciones.
*
*/



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

//labelFotoPanel1.setIcon(new ImageIcon(imgfotomascota1.getImage().getScaledInstance(94, 106,Image.SCALE_SMOOTH)));
//setIcon(new ImageIcon(imgfotomascota1.getImage().getScaledInstance(94, 106,Image.SCALE_SMOOTH)));

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
      private Panel panelRegistrarAdopcion;
    private final static String rutaImagenesAdoptantes = "./Adoptantes";
    private JLabel labelDelAdoptante;
    private JButton btnAgregarFoto;
    private static int idUsuarioActivo = VentanaPrincipal.getIDUsuarioActivo();
    private JButton btnGuardarAdopcion;
    protected int idMascota = 0;
    private static String fotoAdoptante = "";
    protected static String fotoConvivencia= "";
    protected int idUsuarioQueCalifica= 0;
    protected String nuevoNombreMascota= "";
    private JTextField textFieldNuevoNombreMascota;
    ImageIcon imgfotomascota1;
	ImageIcon imgfotomascota2 ;
	ImageIcon imgfotomascota3; 
	ImageIcon imgfotomascotaAdoptar ;
	private JLabel labelRazaMAscotaAdopccion;
	private JLabel labelTipoMascotaAdopcion;
	private JLabel labelEncargadoActual;
	private JLabel labelFotoMascotaAdopcion; 
	
      

      /**
       * Launch the application.
       */
/*
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

      }*/
    
      public static String getFotoAdoptante() {
  		return fotoAdoptante;
  	}

  	public static void setFotoAdoptante(String fotoAdoptante) {
  		VentanaRegistroAdopcion.fotoAdoptante = fotoAdoptante;
  	}



    public static String getRutaImagenesAdoptantes() {
                  return rutaImagenesAdoptantes;
            }

      public void filtro(String tipo){
            listaTemporal.clear();
            for(Mascota mascota:listaMascotasParaMostrar){
                  if(mascota.getTipo().equals(tipo)){
                        if(mascota.getEstado().equals("ENADOPCION")||mascota.getEstado().equals("EN CASA CUNA")){
                            if(mascota.getIdEncargado()!= idUsuarioActivo){
                        	listaTemporal.add(mascota);
                        	}
                        }  
                        
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
            
            listaMascotasParaMostrar = SistemasMascotas.getListaMascota();
            listaTemporal.clear();
            for(Mascota mascota:listaMascotasParaMostrar){
            	if(mascota.getIdEncargado()!= idUsuarioActivo){
                  if(mascota.getEstado().equals("ENADOPCION")||mascota.getEstado().equals("EN CASA CUNA")){
                        listaTemporal.add(mascota);
                  }      
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
                  imgfotomascota1 = new ImageIcon(mascotaPanel1.getFoto());
              //labelFotoPanel1.setIcon(new ImageIcon(imgfotomascota1.getImage().getScaledInstance(94, 106,Image.SCALE_SMOOTH)));
               //   labelTituloPanel1.setText(mascotaPanel1.getTipo()+" En adopción por: "+nombreUsuario1);
            }else{
              //    labelFotoPanel1.setVisible(false);
              ///    labelFondoPanel1.setEnabled(false);
              ///    labelTituloPanel1.setVisible(false);
                //  btnAdoptarPanel1.setEnabled(false);
            }
            posicionMascotaPanel2 = contador + 1;
            if(posicionMascotaPanel2 < tamanio){
                  mascotaPanel2 = listaMascotasParaMostrar.get(posicionMascotaPanel2);
                  for(Usuario usuario:listaUsuarios){
                        if(mascotaPanel2.getIdEncargado() == usuario.getID()){
                              nombreUsuario2 = usuario.getNombre()+" "+usuario.getPrimerApellido();
                        }
                  }
              
                  imgfotomascota2 = new ImageIcon(mascotaPanel2.getFoto());
                  //  labelFotoPanel2.setIcon(new ImageIcon(imgfotomascota2.getImage().getScaledInstance(94, 106,Image.SCALE_SMOOTH)));
                  //    labelTituloPanel2.setText(mascotaPanel2.getTipo()+" En adopción por: "+nombreUsuario2);
            }else{
            	 //   labelFotoPanel2.setVisible(false);
                  // labelFondoPanel2.setEnabled(false);
            	 // labelTituloPanel2.setVisible(false);
            	 // btnAdoptarPanel2.setEnabled(false);
            }
            posicionMascotaPanel3 = contador + 2;
            if(posicionMascotaPanel3 < tamanio){
                  mascotaPanel3 = listaMascotasParaMostrar.get(posicionMascotaPanel3);
                  for(Usuario usuario:listaUsuarios){
                        if(mascotaPanel3.getIdEncargado() == usuario.getID()){
                              nombreUsuario3 = usuario.getNombre()+" "+usuario.getPrimerApellido();
                        }
                  }
                  imgfotomascota3 = new ImageIcon(mascotaPanel3.getFoto());
                  //    labelFotoPanel3.setIcon(new ImageIcon(imgfotomascota3.getImage().getScaledInstance(94, 106,Image.SCALE_SMOOTH)));
                  //       lblTituloPanel3.setText(mascotaPanel3.getTipo()+" En adopción por: "+nombreUsuario3);
            }else{
            	 //      labelFotoPanel3.setVisible(false);
            	 //    lblFondoPanel3.setEnabled(false);
            	 //   lblTituloPanel3.setVisible(false);
            	 //  btnAdoptarPanel3.setEnabled(false);
            }

            listaUsuarios = SistemasUsuarios.getUsuarios();

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
                              //  JOptionPane.showMessageDialog(btnAgregarFoto, ex.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                        
                    }
                    Sistema.crearCarpetaImagenesAdoptantes();
                    Sistema.asignarIDFotoAdoptante();
                    Sistema.copiarImagenAdoptante(archivoSeleccionado);
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
          
	          labelRazaMAscotaAdopccion = new JLabel();
	          labelRazaMAscotaAdopccion.setText("Raza: "+SistemasMascotas.getRazaDeMascota(idMascota)); 
	          labelRazaMAscotaAdopccion.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          labelRazaMAscotaAdopccion.setBounds(272, 301, 185, 26);
	          panelRegistrarAdopcion.add(labelRazaMAscotaAdopccion);
	          
	          labelTipoMascotaAdopcion = new JLabel("Especie: "+SistemasMascotas.getTipoDeMascota(idMascota));
	          labelTipoMascotaAdopcion.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          labelTipoMascotaAdopcion.setText("Especie: "+SistemasMascotas.getTipoDeMascota(idMascota));
	          labelTipoMascotaAdopcion.setBounds(272, 251, 185, 26);
	          panelRegistrarAdopcion.add(labelTipoMascotaAdopcion);
	          
	          
	          labelFotoMascotaAdopcion = new JLabel("");
	          
	          labelFotoMascotaAdopcion.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          labelFotoMascotaAdopcion.setBounds(20, 233, 146, 137);
	          panelRegistrarAdopcion.add(labelFotoMascotaAdopcion);
	          
	          labelEncargadoActual = new JLabel("<EncargadoActual>");
	          labelEncargadoActual.setText("Encargado Actual: "+SistemasMascotas.getEncargadoActual(idMascota));
	          labelEncargadoActual.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          
	          labelEncargadoActual.setBounds(272, 351, 393, 26);
	          panelRegistrarAdopcion.add(labelEncargadoActual);
	          
	          JLabel labelFechaDeAdopcion = new JLabel("<FechaDeAdopcion>");
	          labelFechaDeAdopcion.setText("Fecha de la Adopción: "+Sistema.getFecha());
	          labelFechaDeAdopcion.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          labelFechaDeAdopcion.setBounds(272, 212, 290, 26);
	          panelRegistrarAdopcion.add(labelFechaDeAdopcion);
	          
	          labelDelAdoptante = new JLabel("<FotoDelAdoptante>");
	          labelDelAdoptante.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          labelDelAdoptante.setBounds(10, 452, 146, 137);
	          panelRegistrarAdopcion.add(labelDelAdoptante);
	          
	          JLabel lblNombreDelAdoptante = new JLabel("<NombreDelAdoptante>");
	          lblNombreDelAdoptante.setText("Nombre del Adoptante:"+SistemasUsuarios.getNombreCompletoDelUsuario(idUsuarioActivo));
	          lblNombreDelAdoptante.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          lblNombreDelAdoptante.setBounds(272, 458, 391,26);
	          panelRegistrarAdopcion.add(lblNombreDelAdoptante);
	          
	          JLabel labelCantMascotasAdoptadas = new JLabel("");
	          labelCantMascotasAdoptadas.setText("Cantidad de Adopciones Registradas: "+String.valueOf(SistemasUsuarios.getCantMascotasAdoptadas(idUsuarioActivo))); 
	          labelCantMascotasAdoptadas.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          labelCantMascotasAdoptadas.setBounds(272, 507, 391, 26);
	          panelRegistrarAdopcion.add(labelCantMascotasAdoptadas);
	          
	          JLabel labelCorreoDelAdoptante = new JLabel("<CorreoDelAdoptante>");
	          labelCorreoDelAdoptante.setText("Correo: "+ SistemasUsuarios.getCorreoDelUsuario(idUsuarioActivo));
	          labelCorreoDelAdoptante.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          labelCorreoDelAdoptante.setBounds(272, 554, 391, 26);
	          panelRegistrarAdopcion.add(labelCorreoDelAdoptante);
	          
	          JLabel labelTelefonoDelAdoptante = new JLabel("<TelefonoDelAdoptante>");
	          labelTelefonoDelAdoptante.setText("Telefono: "+ SistemasUsuarios.getTelefonoDelUsuario(idUsuarioActivo));
	          labelTelefonoDelAdoptante.setFont(new Font("Khmer UI", Font.BOLD, 15));
	          labelTelefonoDelAdoptante.setBounds(329, 591, 391, 26);
	          panelRegistrarAdopcion.add(labelTelefonoDelAdoptante);
	          
	          btnGuardarAdopcion = new JButton("");
	          btnGuardarAdopcion.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent arg0) {
	                	nuevoNombreMascota = textFieldNuevoNombreMascota.getText();
	                      
	                		if(nuevoNombreMascota.length()!= 0 ){
	                		Adopcion adopcion = new Adopcion(idUsuarioActivo, idMascota, fotoAdoptante,fotoConvivencia,idUsuarioQueCalifica);
	                                  
	                      		try {
	                                        SistemasMascotas.leerMascota();
	                                        for(Mascota mascota:SistemasMascotas.getListaMascota()){
	                                        	if(mascota.getID() == idMascota){
	                                        		mascota.setIdEncargado(idUsuarioActivo);
	                                        		mascota.setNombre(nuevoNombreMascota);
	                                        		mascota.setEstado("ADOPTADA");
	                                        		mascota.setEstaEnCasaCuna(false);
	                                        		
	                                        	}
	                                        }
	                                        
	                                        SistemasMascotas.GuardarMascota();
	                                        SistemasAdopciones.AgregarAdopcion(adopcion);
	                                  } catch (IOException e1) {
	                                        // TODO Auto-generated catch block
	                                        e1.printStackTrace();
	                                  }labelFotoMascotaAdopcion.setIcon(null);
	                                  labelDelAdoptante.setIcon(null);
	                                  dispose();
	                                  String subject = "¡Se ha registrado la adopción de " +nuevoNombreMascota+ "!";
	                                  String mensaje = "¡Es un honor ser parte de la adopción de " +nuevoNombreMascota+ "!." + "\n"+ 
	                                                           "Es importante cuidar mucho de "+nuevoNombreMascota+ "pues será calificado por el usuario que dio en adopción a" +nuevoNombreMascota+ "\n"   
	                                                           + "\n"+"Fecha de Registro: " + Sistema.getFecha()+ "\n"+ "¡Muchas Felicidades!";
	                                  EnviarMail.correoDestinatario = SistemasUsuarios.getCorreoDelUsuario(idUsuarioActivo);
	                                  EnviarMail.subject = subject;
	                                  EnviarMail.mensaje = mensaje;
	                                  
	                                  JOptionPane.showMessageDialog(contentPane, "Adopción registrada correctamente. Se enviará un correo electrónico con los datos de la adopcion");
	                                  
	                                        EnviarMail.enviarMail();
	                                        JOptionPane.showMessageDialog(contentPane, "Correo electrónico enviado correctamente");
	                                  
	                                  
	            }else{
                	JOptionPane.showMessageDialog(null,"Debe Asignarle un nombre a la mascota");
                }
	                }    
	          });
	          btnGuardarAdopcion.setToolTipText("Guardar Adopcion");
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
	          lblNuevoNombreDe.setBounds(272, 400, 249, 26);
	          panelRegistrarAdopcion.add(lblNuevoNombreDe);
	          
	          textFieldNuevoNombreMascota = new JTextField();
	          textFieldNuevoNombreMascota.setBounds(542, 400, 128, 20);
	          panelRegistrarAdopcion.add(textFieldNuevoNombreMascota);
	          textFieldNuevoNombreMascota.setColumns(10);
	  }
};