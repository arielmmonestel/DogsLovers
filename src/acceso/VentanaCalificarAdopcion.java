        package acceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import logicaDeNegocios.Sistema;
import logicaDeNegocios.SistemasUsuarios;
import logicaDeNegocios.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalificarAdopcion extends JFrame {

        private JPanel contentPane;
        private JTable tableCalificarAdopcion;
        private boolean brilloEstrellas= false;
        JButton buttonEstrellaUno ;
        JButton buttonEstrellaDos;
        JButton buttonEstrellaTres;
        JButton buttonEstrellaCuatro;
        JButton buttonEstrellaCinco;
        private static int calificacion = 0;
        private JLabel labelTitulo;
        private JButton buttomGuardarCalificacion;
        
        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        VentanaCalificarAdopcion frame = new VentanaCalificarAdopcion();
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
        public VentanaCalificarAdopcion() throws IOException {
        	setResizable(false);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setBounds(100, 100, 836, 693);
                contentPane = new JPanel();
                contentPane.setBackground(new Color(99,84, 65));
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                setContentPane(contentPane);
                contentPane.setLayout(null);
                
                JLabel lblCalificarUnaAdopcin = new JLabel("Calificar una Adopci\u00F3n");
                lblCalificarUnaAdopcin .setForeground(new Color(210, 180, 140));
                lblCalificarUnaAdopcin .setFont(new Font("Khmer UI", Font.BOLD, 35));
                lblCalificarUnaAdopcin .setBounds(10, 129, 379, 93);
                
                contentPane.add(lblCalificarUnaAdopcin);
                
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setBounds(48, 254, 482, 247);
                contentPane.add(scrollPane);
                String[] columna = {"Nombre de Usuario","Nombre Completo", "Calificacion Actual"};
        		String[] datos = new String[3];
        		DefaultTableModel tableModel = new DefaultTableModel(columna,0);
        		tableCalificarAdopcion = new JTable(tableModel);
        		tableCalificarAdopcion.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent arg0) {
        				buttonEstrellaUno.setEnabled(true);
        				buttonEstrellaDos.setEnabled(true);
        				buttonEstrellaTres.setEnabled(true);
        				buttonEstrellaCuatro.setEnabled(true);
        				buttonEstrellaCinco.setEnabled(true);
        			}
        		});
        		Sistema.cargarTableAdopcionesACalificar(columna, datos, tableModel);
                scrollPane.setViewportView(tableCalificarAdopcion);
                
                buttonEstrellaUno = new JButton("");
                buttonEstrellaUno.setEnabled(false);
                buttonEstrellaUno.addMouseListener(new MouseAdapter() {
                        
                        public void mouseClicked(MouseEvent arg0) {
                                buttonEstrellaUno.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaDos.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                buttonEstrellaTres.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                buttonEstrellaCuatro.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                buttonEstrellaCinco.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                brilloEstrellas = true;
                                calificacion = 1;
                                buttomGuardarCalificacion.setEnabled(true);
                        }
                });
                buttonEstrellaUno.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                buttonEstrellaUno.setBounds(569, 463, 35, 35);
                contentPane.add(buttonEstrellaUno);
                
                buttonEstrellaDos = new JButton("");
                buttonEstrellaDos.setEnabled(false);
                buttonEstrellaDos.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent arg0) {
                                buttonEstrellaUno.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaDos.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaTres.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                buttonEstrellaCuatro.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                buttonEstrellaCinco.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                brilloEstrellas = true;
                                calificacion = 2;
                                buttomGuardarCalificacion.setEnabled(true);
                        }
                });
                buttonEstrellaDos.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                buttonEstrellaDos.setBounds(614, 463, 35, 35);
                contentPane.add(buttonEstrellaDos);
                
                buttonEstrellaTres = new JButton("");
                buttonEstrellaTres.setEnabled(false);
                buttonEstrellaTres.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent arg0) {
                                buttonEstrellaUno.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaDos.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaTres.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaCuatro.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                buttonEstrellaCinco.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                brilloEstrellas = true;
                                calificacion = 3;
                                buttomGuardarCalificacion.setEnabled(true);
                        }
                });
                buttonEstrellaTres.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                buttonEstrellaTres.setBounds(658, 463, 35, 35);
                contentPane.add(buttonEstrellaTres);
                
                buttonEstrellaCuatro = new JButton("");
                buttonEstrellaCuatro.setEnabled(false);
                buttonEstrellaCuatro.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent arg0) {
                                buttonEstrellaUno.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaDos.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaTres.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaCuatro.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaCinco.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                                brilloEstrellas = true;
                                calificacion = 4;
                                buttomGuardarCalificacion.setEnabled(true);
                        }
                });
                buttonEstrellaCuatro.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                buttonEstrellaCuatro.setBounds(704, 463, 35, 35);
                contentPane.add(buttonEstrellaCuatro);
                
                buttonEstrellaCinco = new JButton("");
                buttonEstrellaCinco.setEnabled(false);
                buttonEstrellaCinco.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent arg0) {
                                buttonEstrellaUno.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaDos.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaTres.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaCuatro.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                buttonEstrellaCinco.setIcon(new ImageIcon("./imgs/EstrellaLlena.png"));
                                brilloEstrellas = true;
                                calificacion = 5;
                                buttomGuardarCalificacion.setEnabled(true);
                        }
                });
                buttonEstrellaCinco.setIcon(new ImageIcon("./imgs/EstrellaVacia.png"));
                buttonEstrellaCinco.setBounds(748, 463, 35, 35);
                contentPane.add(buttonEstrellaCinco);
                
                labelTitulo = new JLabel("");
                labelTitulo .setIcon(new ImageIcon("./imgs/Logo.png"));
                labelTitulo .setHorizontalAlignment(SwingConstants.CENTER);
                labelTitulo .setBounds(206, 0, 457, 108);
                
                contentPane.add(labelTitulo);
                
                buttomGuardarCalificacion = new JButton("");
                buttomGuardarCalificacion.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent arg0) {
                		
                		String mensaje = "Calificación guardada en el sistema";
                		int fila = tableCalificarAdopcion.getSelectedRow();
                		String nombreUsuario= (String) tableCalificarAdopcion.getValueAt(fila, 0);
                		int iDUsuario=SistemasUsuarios.getIdPorNickName(nombreUsuario);
                		Usuario usuario = SistemasUsuarios.getUsuario(iDUsuario);
                		try {
							SistemasUsuarios.leerUsuarios();
							
							tableModel.removeRow(fila);
							buttomGuardarCalificacion.setEnabled(false);
							buttonEstrellaUno.setEnabled(false);
							buttonEstrellaDos.setEnabled(false);
							buttonEstrellaTres.setEnabled(false);
							buttonEstrellaCuatro.setEnabled(false);
							buttonEstrellaCinco.setEnabled(false);
							SistemasUsuarios.verificarCalificacion(iDUsuario, calificacion);
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                		
                	}
                });
                buttomGuardarCalificacion.setEnabled(false);
                buttomGuardarCalificacion.setToolTipText("Guardar Adopcion");
                buttomGuardarCalificacion.setFocusPainted(false);
                buttomGuardarCalificacion.setOpaque(false);
                buttomGuardarCalificacion.setContentAreaFilled(false);
                buttomGuardarCalificacion.setBorderPainted(false);
                buttomGuardarCalificacion.setBorder(null);
                buttomGuardarCalificacion.setHorizontalTextPosition(SwingConstants.CENTER);
                buttomGuardarCalificacion.setIconTextGap(-3);
                buttomGuardarCalificacion.setRolloverIcon(new ImageIcon("./imgs/save-64.png"));
                buttomGuardarCalificacion.setPressedIcon(new ImageIcon("./imgs/save-32.png"));
                buttomGuardarCalificacion.setIcon(new ImageIcon("./imgs/save-48.png"));
                buttomGuardarCalificacion.setBounds(572, 567, 105, 64);
  	          
                contentPane.add(buttomGuardarCalificacion);
                
                
        }
}
