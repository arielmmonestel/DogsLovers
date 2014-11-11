
/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
<<<<<<< HEAD
*Fecha de Creacion: 4/11/2014
*
*Descripción: Esta es la clase Casa Cuna , su función es instanciar objetos Casas Cuna
=======
*Fecha de Creacion: 21/10/2014
*
*Descripción: Esta es la clase CasaCuna, esta clase engloba el concepto de casas cuna, que son las que se registran en el programa
*con el propósito de brindar albergue a otras mascotas encontradas o en adopción
>>>>>>> origin/master
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

public class CasaCuna {

	
	private String tamanoMascota;
	private String tipoMascota;
	private boolean necesitaDonacion;
	private boolean necesitaMedicamentos;
	private int cantMascota; //Cantidad de mascotas que ha recibido
	private int camposDiponibles; //  cantidad de mascotas que puede recibir
	private String direccion;
	private int idUsuarioCasaCuna;
	private static ArrayList<CasaCuna> listaCasasCuna = new ArrayList<CasaCuna>();
	private static String rutaCasaCuna = "./casaCuna.poo";	
	public File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();

	
	public CasaCuna(String pTamanoMascota,String pTipoMascota,boolean pNecesitaDonacion,boolean pNecesitaMedicamentos,int pCantMascota,int pCamposDiponibles,String pDireccion,int pIdUsuarioCasaCuna){
		
		setTamanoMascota(pTamanoMascota);
		setTipoMascota(pTipoMascota);
		setNecesitaDonacion(pNecesitaDonacion);
		setNecesitaMedicamentos(pNecesitaMedicamentos);
		setCantMascota(pCantMascota);
		setCamposDiponibles(pCamposDiponibles);
		setDireccion(pDireccion);
		setIdUsuarioCasaCuna(pIdUsuarioCasaCuna);
		
	}
	public CasaCuna(){}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String pDireccion) {
		direccion = pDireccion;
	}
	public int getIdUsuarioCasaCuna() {
		return idUsuarioCasaCuna;
	}
	public void setIdUsuarioCasaCuna(int idUsuarioCasaCuna) {
		this.idUsuarioCasaCuna = idUsuarioCasaCuna;
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
	
	public boolean isNecesitaMedicamentos() {
		return necesitaMedicamentos;
	}
	public void setNecesitaMedicamentos(boolean necesitaMedicamentos) {
		this.necesitaMedicamentos = necesitaMedicamentos;
	}
	
	public static ArrayList<CasaCuna> getListaCasasCuna() {
		return listaCasasCuna;
	}
	public static void setListaCasasCuna(ArrayList<CasaCuna> listaCasasCuna) {
		CasaCuna.listaCasasCuna = listaCasasCuna;
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
 

}
