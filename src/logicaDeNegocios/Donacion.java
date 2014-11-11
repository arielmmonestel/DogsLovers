
/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
<<<<<<< HEAD
*Fecha de Creacion: 4/11/2014
*
*Descripción: Esta es la clase Donacion  , su función es instanciar objetos de tipo donación
=======
*Fecha de Creacion: 21/10/2014
*
*Descripción: Esta es la clase Donación, su función es englobar el concepto de donaciones a otras asociaciones
*por parte de los usuarios.
>>>>>>> origin/master
*
*/


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