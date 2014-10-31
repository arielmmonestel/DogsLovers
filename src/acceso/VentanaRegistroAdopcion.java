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
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.Window.Type;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JRadioButton;


public class VentanaRegistroAdopcion extends JFrame {

    private JPanel contentPane;
    private ButtonGroup grupoMostrarPor = new ButtonGroup();
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
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
     */
    public VentanaRegistroAdopcion() {
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
        
        JPanel panelRegistrarAdopcion = new JPanel();
        panelRegistrarAdopcion.setBounds(100, 100, 923, 641);
        contentPane.add(panelRegistrarAdopcion, "name_42351462238686");
        panelRegistrarAdopcion.setLayout(null);
        
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
        panelRegistrarAdopcion.add(btnFlechaDerecha);
        
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
        panelRegistrarAdopcion.add(btnFlechaIzquierda);
        
        
        JRadioButton rdbtnTodos = new JRadioButton("Todos");
        rdbtnTodos.setSelected(true);
        rdbtnTodos.setHorizontalAlignment(SwingConstants.LEFT);
        rdbtnTodos.setBounds(20, 193, 137, 20);
        grupoMostrarPor.add(rdbtnTodos);
        panelRegistrarAdopcion.add(rdbtnTodos);
        
        JRadioButton radioButtonOtros = new JRadioButton("Otros");
        radioButtonOtros.setHorizontalAlignment(SwingConstants.LEFT);
        grupoMostrarPor.add(radioButtonOtros);
        radioButtonOtros.setBounds(20, 339, 137, 20);
        panelRegistrarAdopcion.add(radioButtonOtros);
        
        JRadioButton rdbtnRoedores = new JRadioButton("Roedores");
        rdbtnRoedores.setHorizontalAlignment(SwingConstants.LEFT);
        grupoMostrarPor.add(rdbtnRoedores);
        rdbtnRoedores.setBounds(20, 310, 137, 20);
        panelRegistrarAdopcion.add(rdbtnRoedores);
        
        JRadioButton radioButtonAves = new JRadioButton("Aves");
        radioButtonAves.setHorizontalAlignment(SwingConstants.LEFT);
        grupoMostrarPor.add(radioButtonAves);
        radioButtonAves.setBounds(20, 279, 137, 20);
        panelRegistrarAdopcion.add(radioButtonAves);
        
        JRadioButton rdbtnFelinos = new JRadioButton("Felinos");
        rdbtnFelinos.setHorizontalAlignment(SwingConstants.LEFT);
        grupoMostrarPor.add(rdbtnFelinos);
        rdbtnFelinos.setBounds(20, 249, 137, 20);
        panelRegistrarAdopcion.add(rdbtnFelinos);
        
        JRadioButton radioButtonCaninos = new JRadioButton("Caninos");
        radioButtonCaninos.setHorizontalAlignment(SwingConstants.LEFT);
        grupoMostrarPor.add(radioButtonCaninos);
        radioButtonCaninos.setBounds(20, 219, 137, 20);
        panelRegistrarAdopcion.add(radioButtonCaninos);
        
        JLabel lblMostrarPor = new JLabel("Mostrar  Por:");
        lblMostrarPor.setFont(new Font("Batang", Font.BOLD, 12));
        lblMostrarPor.setBounds(20, 155, 137, 20);
        panelRegistrarAdopcion.add(lblMostrarPor);
        
        JLabel labelMostrarPor = new JLabel("");
        labelMostrarPor.setIcon(new ImageIcon("./imgs/fondoPanelesPantallaPrincipal.png"));
        labelMostrarPor.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(110, 170, 111)));
        labelMostrarPor.setBounds(10, 145, 198, 234);
        panelRegistrarAdopcion.add(labelMostrarPor);
        
        JPanel panelAdopcionTres = new JPanel();
        panelAdopcionTres.setBounds(238, 414, 659, 128);
        panelAdopcionTres.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
        panelRegistrarAdopcion.add(panelAdopcionTres);
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
        panelRegistrarAdopcion.add(panelAdopcionDos);
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
        panelRegistrarAdopcion.add(panelAdopcionUno);
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
        
        JLabel lblTitulo = new JLabel("");
        lblTitulo.setIcon(new ImageIcon("./imgs/Logo.png"));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(270, 0, 457, 108);
        panelRegistrarAdopcion.add(lblTitulo);
        
        JLabel labelFondo = new JLabel("");
        labelFondo.setIcon(new ImageIcon("./imgs/fondoRegistro.png"));
        labelFondo.setBounds(0, 0, 2508, 1246);
        panelRegistrarAdopcion.add(labelFondo);
    }
}