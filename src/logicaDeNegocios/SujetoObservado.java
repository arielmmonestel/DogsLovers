
/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabi�n Monge
*Jefri C�rdenas
*Fecha de Creacion: 21/10/2014
*
*Descripci�n: Esta es la interfaz SujetoObservado, implementada con el pro�sito de poner el patr�n Observador en el programa.
*
*/


package logicaDeNegocios;

import java.util.ArrayList;

import acceso.*;

public interface SujetoObservado {
	
	public ArrayList<Observador> listaObservadores = new ArrayList<Observador>();
	
	public void agregarObservador(Observador pObservador);
	
	public void quitarObservador(Observador pObservador);
	
	public void notificar();
	
	/*
	 * 
	 * IMPLEMENTAR ESTO PARA LA CLASE EN LA QUE SE VAYA A PONER
	 * 
	 * 
	 * 
	private ArrayList<Observador> listaObservadores = new ArrayList<Observador>(); 
	 
	 
	public void agregarObservador(Observador pObservador){
		listaObservadores.add(pObservador);
	}
	
	public void quitarObservador(Observador pObservador){
		int i = 0;
		for(Observador obj : listaObservadores){
			if(obj == pObservador){
				listaObservadores.remove(i);
			}
			i++;
		}
	}
	
	public void notificar(){
		for(Observador o : listaObservadores){
			o.actualizar();
		}
	}
	 */
}
