package acceso;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class VentanaAgregarMascota extends JPanel {

	/**
	 * Create the panel.
	 */
	public VentanaAgregarMascota() {
		
		JButton btnNewButton = new JButton("comaCC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblHola = new JLabel("hola");
		setLayout(new BorderLayout(0, 0));
		add(btnNewButton);
		add(lblHola);
		
		JButton btnNuevoBoton = new JButton("Nuevo Boton");
		add(btnNuevoBoton, BorderLayout.NORTH);

	}

}
