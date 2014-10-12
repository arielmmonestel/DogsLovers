package logicaDeNegocios;
import java.util.ArrayList;

public class CasaCuna {

	
	private String tamanoMascota;
	private String tipoMascota;
	private boolean necesitaDonacion;
	private int cantMascota; //Cantidad de mascotas que ha recibido
	private int camposDiponibles; //  cantidad de mascotas que puede recibir
	private ArrayList<Integer> IDMascotasqueTengo;
	private String Direccion;

	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTamanoMascota() {
		return tamanoMascota;
	}
	public void setTamanoMascota(String tamanoMascota) {
		this.tamanoMascota = tamanoMascota;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public boolean isNecesitaDonacion() {
		return necesitaDonacion;
	}
	public void setNecesitaDonacion(boolean necesitaDonacion) {
		this.necesitaDonacion = necesitaDonacion;
	}
	public int getCantMascota() {
		return cantMascota;
	}
	public void setCantMascota(int cantMascota) {
		this.cantMascota = cantMascota;
	}
	public int getCamposDiponibles() {
		return camposDiponibles;
	}
	public void setCamposDiponibles(int camposDiponibles) {
		this.camposDiponibles = camposDiponibles;
	}
	public ArrayList<Integer> getIDMascotasqueTengo() {
		return IDMascotasqueTengo;
	}
	public void setIDMascotasqueTengo(ArrayList<Integer> iDMascotasqueTengo) {
		IDMascotasqueTengo = iDMascotasqueTengo;
	}


}
