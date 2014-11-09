package acceso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;

import logicaDeNegocios.*;
import javax.swing.SwingConstants;

public class VentanaPerfilUsuario extends JFrame {

	private JPanel contentPane;
	
	public VentanaPerfilUsuario(int idUsuarioDelPerfil) {
		
		System.out.println("el id de usuaro es: ");
		System.out.println(idUsuarioDelPerfil);
		
		setTitle("Perfil de Usuario");
		setResizable(false);
		setBounds(100, 100, 758, 597);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/Icono.png"));
		contentPane = new JPanel();
		contentPane.setBackground(new Color(99,84, 65));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFotoDePerfil = new JLabel("");
		lblFotoDePerfil.setBounds(50, 49, 186, 222);
		contentPane.add(lblFotoDePerfil);
		
		JLabel lblNombredeusuario = new JLabel("NombreDeUsuario");
		lblNombredeusuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombredeusuario.setFont(new Font("Khmer UI", Font.BOLD, 21));
		lblNombredeusuario.setForeground(new Color(189, 183, 107));
		lblNombredeusuario.setBounds(50, 282, 200, 50);
		contentPane.add(lblNombredeusuario);
		
		JLabel lblNombreDePersona = new JLabel("NombreDePersona\r\n");
		lblNombreDePersona.setForeground(new Color(189, 183, 107));
		lblNombreDePersona.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblNombreDePersona.setBounds(407, 49, 219, 50);
		contentPane.add(lblNombreDePersona);
		
		JLabel lblTelefono = new JLabel("Telefono\r\n");
		lblTelefono.setForeground(new Color(189, 183, 107));
		lblTelefono.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblTelefono.setBounds(407, 100, 219, 50);
		contentPane.add(lblTelefono);
		
		JLabel lblEsCasaCuna = new JLabel("EsCasaCuna\r\n");
		lblEsCasaCuna.setForeground(new Color(189, 183, 107));
		lblEsCasaCuna.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblEsCasaCuna.setBounds(333, 444, 219, 50);
		contentPane.add(lblEsCasaCuna);
		
		JLabel lblEstaenlistanegra = new JLabel("EstaEnListaNegra");
		lblEstaenlistanegra.setForeground(new Color(189, 183, 107));
		lblEstaenlistanegra.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblEstaenlistanegra.setBounds(333, 251, 219, 50);
		contentPane.add(lblEstaenlistanegra);
		
		JLabel lblMotivoListaNegra = new JLabel("MotivoListaNegra");
		lblMotivoListaNegra.setForeground(new Color(189, 183, 107));
		lblMotivoListaNegra.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblMotivoListaNegra.setBounds(333, 298, 219, 50);
		contentPane.add(lblMotivoListaNegra);
		
		JLabel lblCalificaciones = new JLabel("Calificaci\u00F3n\r\n");
		lblCalificaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificaciones.setForeground(new Color(189, 183, 107));
		lblCalificaciones.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblCalificaciones.setBounds(100, 343, 97, 50);
		contentPane.add(lblCalificaciones);
		
		JLabel lblNumAdopcionesHechas = new JLabel("NumAdopcionesHechas\r\n");
		lblNumAdopcionesHechas.setForeground(new Color(189, 183, 107));
		lblNumAdopcionesHechas.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblNumAdopcionesHechas.setBounds(333, 343, 219, 50);
		contentPane.add(lblNumAdopcionesHechas);
		
		JLabel lblNumAdopcionesRecibidas = new JLabel("NumAdopcionesRecibidas\r\n\r\n");
		lblNumAdopcionesRecibidas.setForeground(new Color(189, 183, 107));
		lblNumAdopcionesRecibidas.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblNumAdopcionesRecibidas.setBounds(333, 399, 219, 50);
		contentPane.add(lblNumAdopcionesRecibidas);
		
		if(idUsuarioDelPerfil != -1){
			Usuario usuarioActual = SistemasUsuarios.getUsuario(idUsuarioDelPerfil);
			
			int cantidadDeAdopcionesHechas = 0;
			int cantidadDeAdopcionesRecibidas = 0;
			
//			try {
//				for(Adopcion obj : SistemasAdopciones.getAdopciones()){
//					if(obj.getIdAdoptante() == usuarioActual.getID()){
//						cantidadDeAdopcionesRecibidas++;
//					}
//					if(obj.getIdPersonaQueDaEnAdopcion() == usuarioActual.getID()){
//						cantidadDeAdopcionesHechas++;
//					}
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			
			lblNumAdopcionesHechas.setText("Ha dado en adopción a " + cantidadDeAdopcionesHechas + " mascotas.");
			lblNumAdopcionesRecibidas.setText("Ha adoptado a " + cantidadDeAdopcionesRecibidas + " mascotas.");	
			// Usuario no tiene el atributo foto, aún
			//lblFotoDePerfil.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(usuarioActual.getFoto())));
			lblNombredeusuario.setText(usuarioActual.getNombreUsuario());
			lblNombreDePersona.setText(usuarioActual.getNombre());
			lblTelefono.setText(usuarioActual.getTelefono());
			
			if(usuarioActual.estaEnListaNegra()){
				lblEstaenlistanegra.setText("Este usuario está en la lista negra");
				if(Sistema.estaReportado(usuarioActual)){
					lblMotivoListaNegra.setText("Motivo: Ha sido reportado por otro usuario.");
				}else{
					lblMotivoListaNegra.setText("Motivo: Calificado negativamente por otros usuarios.");
				}
				
			}else{
				lblEstaenlistanegra.setVisible(false);
				lblMotivoListaNegra.setVisible(false);
			}
			
			if(usuarioActual.esCasaCuna()){
				lblEsCasaCuna.setText("Este usuario es Casa cuna.");
			}else{
				lblEsCasaCuna.setVisible(false);
			}
			
		}
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.setBounds(611, 518, 89, 23);
		contentPane.add(btnReportar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(611, 484, 89, 23);
		contentPane.add(btnEditar);
		
		JLabel lblTitleNombre = new JLabel("Nombre");
		lblTitleNombre.setForeground(new Color(189, 183, 107));
		lblTitleNombre.setFont(new Font("Khmer UI", Font.PLAIN, 16));
		lblTitleNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitleNombre.setBounds(261, 57, 112, 32);
		contentPane.add(lblTitleNombre);
		
		JLabel lblTitleTelefono = new JLabel("Tel\u00E9fono\r\n");
		lblTitleTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitleTelefono.setForeground(new Color(189, 183, 107));
		lblTitleTelefono.setFont(new Font("Khmer UI", Font.PLAIN, 16));
		lblTitleTelefono.setBounds(261, 108, 112, 32);
		contentPane.add(lblTitleTelefono);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(189, 183, 107));
		lblEmail.setFont(new Font("Khmer UI", Font.BOLD, 15));
		lblEmail.setBounds(407, 153, 219, 50);
		contentPane.add(lblEmail);
		
		JLabel lblTitleEmail = new JLabel("E-mail");
		lblTitleEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTitleEmail.setForeground(new Color(189, 183, 107));
		lblTitleEmail.setFont(new Font("Khmer UI", Font.PLAIN, 16));
		lblTitleEmail.setBounds(261, 161, 112, 32);
		contentPane.add(lblTitleEmail);
	}
}
