package logicaDeNegocios;
import java.io.IOException;
import java.util.ArrayList;

import logicaDeNegocios.*;

public class ListaNegra {

	private static ArrayList<Integer> listaNegra= new ArrayList<Integer>();

	public ListaNegra(){

	}

	public static ArrayList<Integer> getListaNegra(){
		
		try {
			listaNegra.clear();
			SistemasUsuarios.leerUsuarios();
			for(Usuario usuario:SistemasUsuarios.getUsuarios())
				if(usuario.estaEnListaNegra()){
					listaNegra.add(usuario.getID());
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listaNegra;
	}

	public static int getListaSize(){
		getListaNegra();
		return listaNegra.size();
	}

	public static void agregarAListaNegra(Usuario pUsuario){
		try {
			SistemasUsuarios.leerUsuarios();
			pUsuario.setEstaEnListaNegra(true);
			SistemasUsuarios.GuardarUsuario();
			listaNegra.add(pUsuario.getID());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void quitarDeListaNegra(String string){
		
		getListaNegra();
		try {
			for(Usuario usuario:SistemasUsuarios.getUsuarios()){
				if (usuario.getNombreUsuario().equals(string)){
					
					usuario.setEstaEnListaNegra(false);
					//ListaNegra.getListaNegra().remove(usuario.getID());
					
				}
				//borrardeListaNegra(usuario.getID());
			}SistemasUsuarios.GuardarUsuario();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SistemasUsuarios.GuardarUsuario();
	}
	public static void borrardeListaNegra(int idUsuario){
		for(int i=0; i< ListaNegra.getListaSize();i++){
			if (ListaNegra.getListaNegra().get(i) ==idUsuario){
				ListaNegra.getListaNegra().remove(i);
			}
		}
		
	
	}
	

	public static boolean estaEnListaNegra(Usuario pUsuario){
		getListaNegra();
		if(listaNegra.contains(pUsuario.getID())){
			return true;
		}
		return false;
	}

}