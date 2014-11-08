package logicaDeNegocios;
import java.util.ArrayList;

public class Adopcion {
	
	private int idAdoptante;
	private int idMascota;
	private String fotoAdoptante;
	private String fotoConvivencia;
	
	public Adopcion(int pIdAdoptante, int pIdMascota, String fotoAdoptante, String fotoConvivencia){
		setIdAdoptante(pIdAdoptante);
		setIdMascota(pIdMascota);
		setFotoAdoptante(fotoAdoptante);
		setFotoConvivencia(fotoConvivencia);
	}
	
	public Adopcion(){
		
	}
	
	public int getIdAdoptante() {
		return idAdoptante;
	}
	public void setIdAdoptante(int idAdoptante) {
		this.idAdoptante = idAdoptante;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String  getFotoAdoptante() {
		return fotoAdoptante;
	}
	public void setFotoAdoptante(String fotoAdoptante) {
		this.fotoAdoptante = fotoAdoptante;
	}
	public String getFotoConvivencia() {
		return fotoConvivencia;
	}
	public void setFotoConvivencia(String fotoConvivencia) {
		this.fotoConvivencia = fotoConvivencia;
	}
	
	}
