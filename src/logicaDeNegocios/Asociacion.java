package logicaDeNegocios;

import java.util.ArrayList;

public class Asociacion {

	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private String numeroDeCuenta;
	private String paginaWeb;
	private static ArrayList<Asociacion> listaDeAsociaciones = new ArrayList<Asociacion>();
	
	
	public Asociacion(int pId,
					  String pNombre,
					  String pDireccion,
					  String pTelefono,
					  String pNumeroDeCuenta,
					  String pPaginaWeb) {
		setId(pId);
		setNombre(pNombre);
		setDireccion(pDireccion);
		setTelefono(pTelefono);
		setNumeroDeCuenta(pNumeroDeCuenta);
		setPaginaWeb(pPaginaWeb);
	}
	
	public static ArrayList<Asociacion> getListaDeAsociaciones(){
		return listaDeAsociaciones;
	}
	
	public static int getListaDeAsociacionesSize(){
		return listaDeAsociaciones.size();
	}
	
	public static void agregarAsociacion(Asociacion pAsociacion){
		listaDeAsociaciones.add(pAsociacion);
	}
	
	public ArrayList<Donacion> getDonacionesRecibidas(){
		ArrayList<Donacion> donacionesRecibidas = new ArrayList<Donacion>();
		for(Donacion obj : Donacion.getListaDeDonaciones()){
			if(obj.getAsociacionBeneficiada().equals(this)){
				donacionesRecibidas.add(obj);
			}
		}
		return donacionesRecibidas;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int pId) {
		id = pId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNombre) {
		nombre = pNombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String pDireccion) {
		direccion = pDireccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String pTelefono) {
		telefono = pTelefono;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String pNumeroDeCuenta) {
		numeroDeCuenta = pNumeroDeCuenta;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String pPaginaWeb) {
		paginaWeb = pPaginaWeb;
	}
	

}