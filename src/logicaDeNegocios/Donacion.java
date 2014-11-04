package logicaDeNegocios;

import java.util.ArrayList;

public class Donacion {
	
	private Usuario donador;
	private int cantidadDonada;
	private Asociacion asociacionBeneficiada;

	public Donacion(Usuario pDonador, int pCantidadDonada, Asociacion pAsociacionBeneficiada) {
		setDonador(pDonador);
		setCantidadDonada(pCantidadDonada);
		setAsociacionBeneficiada(pAsociacionBeneficiada);
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