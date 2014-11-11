
/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
*Fecha de Creacion: 4/11/2014
*
*Descripción: Esta es la clase VentanaReporte, su función es abrir una ventana para definir el motivo de un reporte y finalizar el mismo.
*
*/




package acceso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

import logicaDeNegocios.SistemasUsuarios;

public class VentanaReporte extends JFrame {

	private JPanel contentPane;

	public VentanaReporte(int idUsuarioDelPerfil, int idUsuarioActivo) {
		setTitle("Reporte");
		setResizable(false);
		setBounds(100, 100, 489, 361);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		contentPane = new JPanel();
		contentPane.setBackground(new Color(99,84, 65));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(85, 107, 47));
		textPane.setFont(new Font("Khmer UI", Font.PLAIN, 15));
		textPane.setBounds(36, 182, 398, 65);
		contentPane.add(textPane);
		
		JLabel lblReporte = new JLabel("Reporte");
		lblReporte.setForeground(new Color(189, 183, 107));
		lblReporte.setFont(new Font("Khmer UI", Font.BOLD, 25));
		lblReporte.setBounds(36, 23, 131, 30);
		contentPane.add(lblReporte);
		
		JLabel lblNewLabel = new JLabel("______________________________________________________");
		lblNewLabel.setForeground(new Color(189, 183, 107));
		lblNewLabel.setFont(new Font("Khmer UI", Font.PLAIN, 19));
		lblNewLabel.setBounds(24, 39, 436, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblMotivoDeReporte = new JLabel("Motivo de Reporte:");
		lblMotivoDeReporte.setForeground(new Color(189, 183, 107));
		lblMotivoDeReporte.setFont(new Font("Khmer UI", Font.PLAIN, 18));
		lblMotivoDeReporte.setBounds(36, 140, 200, 50);
		contentPane.add(lblMotivoDeReporte);
		
		JLabel lblEstsReportandoA = new JLabel("Est\u00E1s reportando a alguien, este usuario aparecer\u00E1 en la");
		lblEstsReportandoA.setForeground(new Color(189, 183, 107));
		lblEstsReportandoA.setFont(new Font("Khmer UI", Font.PLAIN, 13));
		lblEstsReportandoA.setBounds(36, 84, 411, 30);
		contentPane.add(lblEstsReportandoA);
		
		JLabel lblListaNegraY = new JLabel("lista negra y perder\u00E1 derechos en DogsLovers. Por favor,");
		lblListaNegraY.setForeground(new Color(189, 183, 107));
		lblListaNegraY.setFont(new Font("Khmer UI", Font.PLAIN, 13));
		lblListaNegraY.setBounds(36, 99, 411, 30);
		contentPane.add(lblListaNegraY);
		
		JLabel lblEscribeElMotivo = new JLabel("escribe el motivo de tu reporte abajo.");
		lblEscribeElMotivo.setForeground(new Color(189, 183, 107));
		lblEscribeElMotivo.setFont(new Font("Khmer UI", Font.PLAIN, 13));
		lblEscribeElMotivo.setBounds(36, 114, 411, 30);
		contentPane.add(lblEscribeElMotivo);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setIcon(new ImageIcon("./imgs/ReportarGrande.png"));
		btnReportar.setIcon(new ImageIcon("./imgs/ReportarPequenio.png"));
		btnReportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textPane.getText().equals("")){
					JOptionPane.showMessageDialog(null, "No has puesto un motivo para el reporte", "Error", JOptionPane.ERROR_MESSAGE);
				}else{
					try {
						SistemasUsuarios.getUsuario(idUsuarioActivo).reportar(idUsuarioDelPerfil, textPane.getText());
						System.out.println("Al llamar a reportar de otro lado");
						System.out.println(idUsuarioDelPerfil);
						System.out.println(SistemasUsuarios.getUsuario(idUsuarioDelPerfil).estaEnListaNegra());
						JOptionPane.showMessageDialog(null, "Usuario reportado correctamente");
						dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		btnReportar.setBounds(345, 279, 89, 23);
		contentPane.add(btnReportar);
	
	}

}
