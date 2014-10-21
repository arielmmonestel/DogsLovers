package logicaDeNegocios;

import java.util.ArrayList;

public class Usuario extends Persona{
	private int id;
	private String nombreUsuario;
	private String contrasenia;
	private CasaCuna casaCuna= null;
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
		setID(pID);
		setNombreUsuario(pNombreUsuario);
		setContrasenia(pContrasenia);
		
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

	public CasaCuna getCasaCuna() {
		return casaCuna;
	}

	public void setEsCasaCuna(CasaCuna pCasaCuna) {
		casaCuna = pCasaCuna;
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

	public static ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public static void setListaUsuarios(ArrayList<Usuario> pListaUsuarios) {
		listaUsuarios = pListaUsuarios;
	}



	

}
