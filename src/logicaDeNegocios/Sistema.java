package logicaDeNegocios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;


public class Sistema {
	
	private static Calendar fecha = Calendar.getInstance();
	private static int anio = fecha.get(Calendar.YEAR);
	private static int mes = fecha.get(Calendar.MONTH)+1; 
	private static int dia = fecha.get(Calendar.DATE);
	
	public static void main(String[] args){
		System.out.println("Dia: "  +dia+"\n"+ "Mes: "+mes+"\n"+"Anio: "+anio);
	}
	

	public Sistema() {
	}
	
	public static String[][] tomarDatosDeBusqueda(ArrayList<Integer> indicesDeResultados){
		String[][] matrizConDatos = new String[Mascota.getListaDeMascotasSize()][7];
		for(int k = 0; k < indicesDeResultados.size(); k++){
			int i = (int) indicesDeResultados.get(k);
			matrizConDatos[k][0] = String.valueOf(i);
			matrizConDatos[k][1] = Mascota.getMascota(i).getEstado(); 
			matrizConDatos[k][2] = Mascota.getMascota(i).getTipo(); 
			matrizConDatos[k][3] = Mascota.getMascota(i).getRaza(); 
			matrizConDatos[k][4] = Mascota.getMascota(i).getChip(); 
			matrizConDatos[k][5] = Mascota.getMascota(i).getColorDePelo(); 
			matrizConDatos[k][6] = Mascota.getMascota(i).getColorDeOjos(); 
			matrizConDatos[k][7] = Mascota.getMascota(i).getLugarVisto();
		}
		return matrizConDatos;
	}

	public static ArrayList<Integer> buscarMascotaPorEstado(String filtro){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		for(int i = 0; i < Mascota.getListaDeMascotasSize(); i++){
			if( Mascota.getMascota(i).contieneFiltro(filtro, Mascota.opcionESTADO)){
				resultados.add(i);
			}
		}
		return resultados;
	}
	
	public static ArrayList<Integer> buscarMascotaPorTipo(String filtro){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		for(int i = 0; i < Mascota.getListaDeMascotasSize(); i++){
			if( Mascota.getMascota(i).contieneFiltro(filtro, Mascota.opcionTIPO)){
				resultados.add(i);
			}
		}
		return resultados;
	}
	
	public static ArrayList<Integer> buscarMascotaPorRaza(String filtro){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		for(int i = 0; i < Mascota.getListaDeMascotasSize(); i++){
			if( Mascota.getMascota(i).contieneFiltro(filtro, Mascota.opcionRAZA)){
				resultados.add(i);
			}
		}
		return resultados;
	}

	public static ArrayList<Integer> buscarMascotaPorChip(String filtro){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		for(int i = 0; i < Mascota.getListaDeMascotasSize(); i++){
			if( Mascota.getMascota(i).contieneFiltro(filtro, Mascota.opcionCHIP)){
				resultados.add(i);
			}
		}
		return resultados;
	}

	public static ArrayList<Integer> buscarMascotaPorColorDePelo(String filtro){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		for(int i = 0; i < Mascota.getListaDeMascotasSize(); i++){
			if( Mascota.getMascota(i).contieneFiltro(filtro, Mascota.opcionCOLORPELO)){
				resultados.add(i);
			}
		}
		return resultados;
	}

	//public static ArrayList<Integer> buscarMascotaPorFecha(String filtro){
		/* TODO */
	//}

	public static ArrayList<Integer> buscarMascotaPorColorDeOjos(String filtro){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		for(int i = 0; i < Mascota.getListaDeMascotasSize(); i++){
			if( Mascota.getMascota(i).contieneFiltro(filtro, Mascota.opcionCOLOROJOS)){
				resultados.add(i);
			}
		}
		return resultados;
	}

	public static ArrayList<Integer> buscarMascotaPorLugarVisto(String filtro){
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		for(int i = 0; i < Mascota.getListaDeMascotasSize(); i++){
			if( Mascota.getMascota(i).contieneFiltro(filtro, Mascota.opcionLUGARVISTO)){
				resultados.add(i);
			}
		}
		return resultados;
	}

	public static void copiarImagen(File imagenOriginal) {
		File archivoOriginal = new File(imagenOriginal.getAbsolutePath());
		File archivoNuevo	 = new File(System.getProperty("user.dir") + "./mascotas/" + String.valueOf(Mascota.getListaDeMascotasSize()) + ".jpg");
		try {
			FileInputStream inStream = new FileInputStream(archivoOriginal);
			FileOutputStream outStream = new FileOutputStream(archivoNuevo);
    	    byte[] buffer = new byte[1024]; 
    	    int length; 
    	    while ((length = inStream.read(buffer)) > 0){
    	    	outStream.write(buffer, 0, length);
    	    }
    	    inStream.close();
    	    outStream.close();
		} catch (IOException noHayArchivo) {
			JOptionPane.showMessageDialog(null, "No se pudo copiar la imagen seleccionada.\n" + noHayArchivo.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
}

