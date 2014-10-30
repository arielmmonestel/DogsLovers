package logicaDeNegocios;

import java.util.ArrayList;

public class Donacion {
	
	private Usuario donador;
	private int cantidadDonada;
	private Asociacion asociacionBeneficiada;
	private static ArrayList<Donacion> listaDeDonaciones = new ArrayList<Donacion>();

	public Donacion(Usuario pDonador, int pCantidadDonada, Asociacion pAsociacionBeneficiada) {
		setDonador(pDonador);
		setCantidadDonada(pCantidadDonada);
		setAsociacionBeneficiada(pAsociacionBeneficiada);
	}
	
	public static ArrayList<Donacion> getListaDeDonaciones(){
		return listaDeDonaciones;
	}
	
	public static int getListaDeDonacionesSize(){
		return listaDeDonaciones.size();
	}

	public static void agregarDonacion(Donacion pDonacion){
		listaDeDonaciones.add(pDonacion);
		
	}
	
	public Usuario getDonador() {
		return donador;
	}

	public void setDonador(Usuario pDonador) {
		donador = pDonador;
	}

	public int getCantidadDonada() {
		return cantidadDonada;
	}

	public void setCantidadDonada(int pCantidadDonada) {
		cantidadDonada = pCantidadDonada;
	}

	public Asociacion getAsociacionBeneficiada() {
		return asociacionBeneficiada;
	}

	public void setAsociacionBeneficiada(Asociacion pAsociacionBeneficiada) {
		asociacionBeneficiada = pAsociacionBeneficiada;
	}
	

}