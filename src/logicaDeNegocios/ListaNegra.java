package logicaDeNegocios;
import java.io.IOException;
import java.util.ArrayList;

import logicaDeNegocios.*;

public class ListaNegra {

	private static ArrayList<Integer> listaNegra = new ArrayList<Integer>();

	public ListaNegra(){

	}

	public static ArrayList<Usuario> getListaNegraPorUsuarios(){ // ListaNegra tiene los índices, éste método devuelve la lista en objetos Usuario
		ArrayList<Usuario> respuestas = new ArrayList<Usuario>(); 
		try {
			for(Usuario obj : SistemasUsuarios.getUsuarios()){
				if(obj.estaEnListaNegra() == true){
					respuestas.add(obj);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return respuestas;
	}
	
	public static Usuario getUsuario(int id){
		return SistemasUsuarios.getUsuario(id);
	}

	
	public static ArrayList<Integer> getListaNegra(){
		return listaNegra;
	}

	public static int getListaSize(){
		return listaNegra.size();
	}

	public static void agregarAListaNegra(Usuario pUsuario){
		listaNegra.add(pUsuario.getID());
	}

	public static void quitarDeListaNegra(Usuario pUsuario){
		if(listaNegra.contains(pUsuario.getID())){
			listaNegra.remove(pUsuario.getID());
		}
	}

	public static boolean estaEnListaNegra(Usuario pUsuario){
		if(listaNegra.contains(pUsuario.getID())){
			return true;
		}
		return false;
	}
	
	public static String listatoString(){
		String listaAImprimir = "{";
		for(Usuario obj : getListaNegraPorUsuarios()){
			listaAImprimir += obj.getNombreUsuario();
			listaAImprimir += ", ";
		}
		return listaAImprimir;
	}

}