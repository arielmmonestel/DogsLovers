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
