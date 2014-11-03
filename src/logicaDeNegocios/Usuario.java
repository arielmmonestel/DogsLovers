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
	private boolean esCasaCuna= false;
	private boolean esAdministrador = false;
	private boolean estaEnListaNegra=false;
	private ArrayList<Usuario> personasCalificables;
	private ArrayList<Mascota> mascotasAdoptadas;
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

	public ArrayList<Mascota> getMascotasAdoptadas() {
		return mascotasAdoptadas;
	}

	public void setMascotasAdoptadas(ArrayList<Mascota> pMascotasAdoptadas) {
		mascotasAdoptadas = pMascotasAdoptadas;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int pCalificacion) {
		calificacion = pCalificacion;
	}

	/*public static ArrayList<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public static void agregarUsuario(Usuario pUsuario) {
		listaDeUsuarios.add(pUsuario);
	}
	
	public static int getListaDeUsuariosSize(){
		return listaDeUsuarios.size();
	}*/	
	
	
	//////////////////////////////////// Acciones de Usuario /////////////////////////////////////////////////////////
	
//	public void adoptar(Mascota pMascota){
//		Sistema.agregarAdopcion(new Adopcion(this, Mascota pMascota));
//	}
	
	public void reportar(int idUsuario, String pMotivo){
		Usuario usuarioReportado = SistemasUsuarios.getUsuario(idUsuario);
		Sistema.agregarReporte(new Reporte(this, idUsuario, pMotivo));
		usuarioReportado.setEstaEnListaNegra(true);
		ListaNegra.agregarAListaNegra(usuarioReportado);
	}
	
	
	
}