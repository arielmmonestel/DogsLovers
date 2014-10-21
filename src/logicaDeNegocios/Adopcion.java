package logicaDeNegocios;
import java.util.ArrayList;

public class Adopcion {
	
	private int idPersona;
	private int idMascota;
	private ArrayList<String> fotos = new ArrayList<String>();
	
	public Adopcion(int pIdPersona, int pIdMascota) {
		setIdPersona(pIdPersona);
		setIdMascota(pIdMascota);
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int pIdPersona) {
		idPersona = pIdPersona;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int pIdMascota) {
		idMascota = pIdMascota;
	}
	
	public ArrayList<String> getArrayDeFotos(){
		return fotos;
	}
	
	public void agregarFoto(String direccion){
		
	}

}
