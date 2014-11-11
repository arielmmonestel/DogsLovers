
/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
*Fecha de Creacion: 4/11/2014
*
*Descripción: Esta es la clase VentanaInformacionDL, no tiene funcionalidad
*
*/

package acceso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class VentanaInformacionDL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInformacionDL frame = new VentanaInformacionDL();
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
	public VentanaInformacionDL() {
		setTitle("\u00BFQui\u00E9nes Somos?");
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 515, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(99,84, 65));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setHorizontalAlignment(SwingConstants.CENTER);
		labelFondo.setIcon(new ImageIcon("C:\\Users\\Ariel\\Documents\\GitHub\\DogsLovers\\imgs\\Icono Borroso.png"));
		labelFondo.setBounds(362, 180, 127, 109);
		contentPane.add(labelFondo);
		
		JTextPane txtpnsomosEstudiantesDe = new JTextPane();
		txtpnsomosEstudiantesDe.setFont(new Font("Khmer UI", Font.BOLD, 14));
		txtpnsomosEstudiantesDe.setForeground(Color.WHITE);
		txtpnsomosEstudiantesDe.setText("      Somos  estudiantes de la carrera de Ingenier\u00EDa en Computaci\u00F3n  del Instituto Tecnol\u00F3gico de Costa Rica. \r\n      Esta aplicaci\u00F3n de escritorio es  creada para el proyecto n\u00FAmero tres del curso de Programaci\u00F3n Orientada a Objetos.\r\n      Deseamos que sea una herramienta para todas aquellas personas amantes de los animales, deseosas de encontrar a sus mascotas o cooperar reportando las encontradas.\r\n      Si desea obtener m\u00E1s informaci\u00F3n sobre nosotros, lo puede hacer al correo electr\u00F3nico dogs1lovers@gmail.com.\r\n\r\n\r\n-Equipo de Dogs Lovers.\r\n");
		txtpnsomosEstudiantesDe.setBounds(10, 11, 395, 249);
		txtpnsomosEstudiantesDe.setBackground(null);
		contentPane.add(txtpnsomosEstudiantesDe);
	}
}
