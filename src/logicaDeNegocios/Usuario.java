package logicaDeNegocios;

import java.util.ArrayList;

public class Usuario extends Persona{
	private int iD;
	private String nombreUsuario;
	private String contrasenia;
	private CasaCuna esCasaCuna= null;
	private boolean esAdministrador = false;
	private boolean estaEnListaNegra=false;
	private ArrayList<Usuario> personasCalificables;
	private ArrayList<Mascota> mascotasAdoptadas;
	int calificacion;
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>(1);
	
	



	public Usuario(String pNombre,String pPrimerApellido, String pSegundoApellido,String pSexo, String pTelefono,
			String pEmail,int pDiaNacimiento, String pMesNacimiento, int pAnioNacimiento,int pID, String pNombreUsuario, String pContrasenia) {
		super( pNombre,pPrimerApellido, pSegundoApellido, pSexo, pTelefono,
				pEmail,pDiaNacimiento,pMesNacimiento,pAnioNacimiento);
		setiD(pID);
		setNombreUsuario(pNombreUsuario);
		setContrasenia(pContrasenia);
		
	}


	public int getiD() {
		return iD;
	}



	public void setiD(int iD) {
		this.iD = iD;
	}



	public String getNombreUsuario() {
		return nombreUsuario;
	}



	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}



	public String getContrasenia() {
		return contrasenia;
	}



	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	public CasaCuna getEsCasaCuna() {
		return esCasaCuna;
	}



	public void setEsCasaCuna(CasaCuna esCasaCuna) {
		this.esCasaCuna = esCasaCuna;
	}
	
	
	public boolean isEsAdministrador() {
		return esAdministrador;
	}


	public void setEsAdministrador(boolean esAdministrador) {
		this.esAdministrador = esAdministrador;
	}




	public boolean isEstaEnListaNegra() {
		return estaEnListaNegra;
	}



	public void setEstaEnListaNegra(boolean estaEnListaNegra) {
		this.estaEnListaNegra = estaEnListaNegra;
	}



	public ArrayList<Usuario> getPersonasCalificables() {
		return personasCalificables;
	}



	public void setPersonasCalificables(ArrayList<Usuario> personasCalificables) {
		this.personasCalificables = personasCalificables;
	}



	public ArrayList<Mascota> getMascotasAdoptadas() {
		return mascotasAdoptadas;
	}



	public void setMascotasAdoptadas(ArrayList<Mascota> mascotasAdoptadas) {
		this.mascotasAdoptadas = mascotasAdoptadas;
	}



	public int getCalificacion() {
		return calificacion;
	}



	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}



	public static ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}



	public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		Usuario.listaUsuarios = listaUsuarios;
	}



	

}
