

/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
*Fecha de Creacion: 21/10/2014
*
*Descripción: Esta es la clase Mascota, su función es englobar el concepto de mascotas.
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
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mascota{
	
	
	
	private String estado;
	private int id;
	private String tipo;
	private String raza;
	private String nombre = "";
	private String chip ="";
	private String colorDePelo;
	private String colorDeOjos;

	private String foto = null;
	private String lugarDelSuceso;
	private String nota = null;
	private String diaSuceso;//En el que se perdió o se encontró

	private String recompensa;	
	private int idEncargado;
	private boolean estaEnCasaCuna = false;
	private int IDMascotas = 0;
	private String rutaMascotas = "./mascotas.poo";	
	
	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	
	
	public Mascota(String pEstado, String pTipo, String pRaza, String pNombre, String pChip, String pColorDePelo, String pColorDeOjos,
				   String pFoto, String pLugarVisto, String pNota, String pDia, String pRecompensa, int pIdEncargado) {
	
		setID(IDMascotas++);
		setEstado(pEstado);
		setTipo(pTipo);
		setRaza(pRaza);
		setNombre(pNombre);
		setChip(pChip);
		setColorDePelo(pColorDePelo);
		setColorDeOjos(pColorDeOjos);
		setFoto(pFoto);
		setLugarVisto(pLugarVisto);
		setNota(pNota);
		setDiaSuceso(pDia);
		setRecompensa(pRecompensa);
		setIdEncargado(pIdEncargado);
		setEstaEnCasaCuna(false);
		
	}
	
	public Mascota() {
	}
	
	public void setID(int pId){
		id = pId;
	}
	
	public int getID(){
		return id;
	}
	
	public String getEstado() {

		return estado;
	}

	public void setEstado(String pEstado) {
		//notifyObservers(pEstado);
		estado = pEstado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String pTipo) {
		tipo = pTipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String pRaza) {
		raza = pRaza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNombre) {
		nombre = pNombre;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String pChip) {
		chip = pChip;
	}

	public String getColorDePelo() {
		return colorDePelo;
	}

	public void setColorDePelo(String pColorDePelo) {
		colorDePelo = pColorDePelo;
	}

	public String getColorDeOjos() {
		return colorDeOjos;
	}

	public void setColorDeOjos(String pColorDeOjos) {
		colorDeOjos = pColorDeOjos;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String pFoto) {
		foto = pFoto;
	}

	public String getLugarDelSuceso() {
		return lugarDelSuceso;
	}

	public void setLugarVisto(String pLugarDelSucesoVisto) {
		lugarDelSuceso = pLugarDelSucesoVisto;
	}

	public String getNota() {
		return nota;
	}
	

	public String getDiaSuceso() {
		return diaSuceso;
	}

	public void setDiaSuceso(String pDia) {
		diaSuceso = pDia;
	}

	

	public void setNota(String pNota) {
		nota = pNota;
	}

	public String getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(String pRecompensa) {
		recompensa = pRecompensa;
	}

	public int getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(int pIdEncargado) {
		idEncargado = pIdEncargado;
	}

	public boolean estaEnCasaCuna() {
		return estaEnCasaCuna;
	}

	public void setEstaEnCasaCuna(boolean pEstaEnCasaCuna) {
		estaEnCasaCuna = pEstaEnCasaCuna;
	}

}
