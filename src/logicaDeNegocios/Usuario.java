/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
*Fecha de Creacion: 4/11/2014
*
*Descripción: Esta es la clase Usuario , su función general es instanciar objetos de tipo Usuario. Hereda de Persona
*
*/


package logicaDeNegocios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Usuario extends Persona{
	private int id;
	private String nombreUsuario;
	private String contrasenia;
	private boolean esCasaCuna;
	private boolean esAdministrador ;
	private boolean estaEnListaNegra;
	private ArrayList<Usuario> personasCalificables;
	int calificacion;
	
	
	private static int IDUsuarios = 0;

    
	
	public Usuario(String pNombre,String pPrimerApellido, String pSegundoApellido,String pSexo, String pTelefono,
			String pEmail,int pDiaNacimiento, String pMesNacimiento, int pAnioNacimiento, String pNombreUsuario, String pContrasenia)  {
		super( pNombre,pPrimerApellido, pSegundoApellido, pSexo, pTelefono,
				pEmail,pDiaNacimiento,pMesNacimiento,pAnioNacimiento);
		
		setID(IDUsuarios++);
		setNombreUsuario(pNombreUsuario);
		setContrasenia(pContrasenia);
		
		
	}


	public Usuario() {
		super();
	}


	public int getID() {
		return id;
	}

	public void setID(int pId) {
		id = pId;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String pNombreUsuario) {
		nombreUsuario = pNombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String pContrasenia) {
		contrasenia = pContrasenia;
	}

	public boolean esCasaCuna() {
		return esCasaCuna;
	}

	public void setEsCasaCuna(boolean pCasaCuna) {
		esCasaCuna = pCasaCuna;
	}
	
	public boolean esAdministrador() {
		return esAdministrador;
	}

	public void setEsAdministrador(boolean pEsAdministrador) {
		esAdministrador = pEsAdministrador;
	}

	public boolean estaEnListaNegra() {
		return estaEnListaNegra;
	}

	public void setEstaEnListaNegra(boolean pEstaEnListaNegra) {
		estaEnListaNegra = pEstaEnListaNegra;
	}

	public ArrayList<Usuario> getPersonasCalificables() {
		return personasCalificables;
	}

	public void setPersonasCalificables(ArrayList<Usuario> pPersonasCalificables) {
		personasCalificables = pPersonasCalificables;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int pCalificacion) {
		calificacion = pCalificacion;
	}

		
	public void reportar(int idUsuario, String pMotivo) throws IOException{
		SistemasUsuarios.leerUsuarios();
		Sistema.agregarReporte(new Reporte(this, idUsuario, pMotivo));
		SistemasUsuarios.getUsuario(idUsuario).setEstaEnListaNegra(true);
		System.out.println("Al hacer reportar");
		System.out.println(idUsuario);
		System.out.println(SistemasUsuarios.getUsuario(idUsuario).estaEnListaNegra());
		ListaNegra.agregarAListaNegra(SistemasUsuarios.getUsuario(idUsuario));
		SistemasUsuarios.GuardarUsuario();
	}
	
	
	
}