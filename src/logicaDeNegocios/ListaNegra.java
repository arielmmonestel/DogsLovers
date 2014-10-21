package logicaDeNegocios;
import java.util.ArrayList;

import logicaDeNegocios.*;

public class ListaNegra {

	private static ArrayList<Integer> listaNegra;

	public ListaNegra(){

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

}