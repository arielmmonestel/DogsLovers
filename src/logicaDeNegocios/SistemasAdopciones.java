/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabián Monge
*Jefri Cárdenas
<<<<<<< HEAD
*Fecha de Creacion: 4/11/2014
*
*Descripción: Esta es la clase Sistema Adopciones , su función General es procesar todos los datos de Adopciones para mostrarlos en pantalla
*				o para guardarlos en memoria
*/

package logicaDeNegocios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SistemasAdopciones {
	
	private static final String rutaAdopciones = "./Adopciones.poo";
	private static ArrayList<Adopcion> listaAdopciones = new ArrayList<Adopcion>();
	
	public static int idAdopcion;
	
	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	
	
	public static int getListaDeAdopcionesSize(){
		try {
			leerAdopcion();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return listaAdopciones.size();
	}
	
	public static ArrayList<Adopcion> getAdopciones() throws IOException{leerAdopcion(); return listaAdopciones;}
	
	

public static void  leerAdopcion() throws IOException
{
	File archivo = new File (rutaAdopciones);
	try
	{
		listaAdopciones.clear();    
		idAdopcion = 0;
		if (archivo.exists())
		{			
    		lectura = new FileReader (archivo);
    		bufferLectura = new BufferedReader(lectura);
    		while((bufferLectura.readLine())!=null)    			
    		{ 
    			Adopcion obj = new Adopcion();
    			obj.setIdAdopcion(Integer.parseInt(bufferLectura.readLine()));
    			idAdopcion++;
    			obj.setIdAdoptante(Integer.parseInt(bufferLectura.readLine()));
    			obj.setIdMascota(Integer.parseInt(bufferLectura.readLine()));
    			obj.setFotoAdoptante(bufferLectura.readLine());
    			obj.setFotoConvivencia(bufferLectura.readLine());
    			obj.setIdPersonaQueDaEnAdopcion(Integer.parseInt(bufferLectura.readLine()));
    			listaAdopciones.add(obj);		
    			
    		}
		}	                		
	}catch(Exception e){
		e.printStackTrace();  
	}finally
	{
		try
		{
    		if (archivo.exists())
				lectura.close();

		}catch (Exception e2)
			{e2.printStackTrace();}
	}
	
}
public static void GuardarAdopcion() 
{
	FileWriter escribir = null;
	PrintWriter pw = null;
	try
	{		
		escribir = new FileWriter(rutaAdopciones,false);
		pw = new PrintWriter(escribir);
		idAdopcion = 0;
		
		for(Adopcion obj: listaAdopciones)
		{	
			pw.println("===>Nueva Adopcion<===");
			pw.println(obj.getIdAdopcion());
			pw.println(obj.getIdAdoptante());
			pw.println(obj.getIdMascota());
			pw.println(obj.getFotoAdoptante());
			pw.println(obj.getFotoConvivencia());
			pw.println(obj.getIdPersonaQueDaEnAdopcion());
			idAdopcion ++;
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally 
	{
		try 
		{
				escribir.close();
		} catch (Exception e2) 
		{e2.printStackTrace();}
	}
}

public static void AgregarAdopcion(Adopcion adopcion) throws IOException{
	leerAdopcion();
	listaAdopciones.add(adopcion);
	GuardarAdopcion();
}

}


