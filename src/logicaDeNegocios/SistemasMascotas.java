package logicaDeNegocios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.org.apache.regexp.internal.recompile;


public class SistemasMascotas {

	public SistemasMascotas() {
	}
	
	private static final String rutaMascotas = "./mascotas.poo";	
	private static  ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
	private static  ArrayList<Mascota> listaMascotasFiltradas = new ArrayList<Mascota>();
	public static int size;
	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	

	public static ArrayList<Mascota> getListaMascota(){
		return listaMascotas;
	}
	
	public static void  leerMascota() throws IOException
    {
		File archivo = new File (rutaMascotas);
    	try
    	{
    		listaMascotas.clear();    
    		
    		if (archivo.exists())
    		{			
	    		lectura = new FileReader (archivo);
	    		bufferLectura = new BufferedReader(lectura);
	    		size= 0;
	    		
	    		while((bufferLectura.readLine())!=null)    			
	    		{ 
	    			Mascota obj = new Mascota();   
	    			obj.setEstado(bufferLectura.readLine());
	    			obj.setID(Integer.parseInt(bufferLectura.readLine()));
	    			obj.setTipo(bufferLectura.readLine());
	    			obj.setRaza(bufferLectura.readLine());
	    			obj.setNombre(bufferLectura.readLine());
	    			obj.setChip(bufferLectura.readLine());
	    			obj.setColorDePelo(bufferLectura.readLine());
	    			obj.setColorDeOjos(bufferLectura.readLine());
	    			obj.setFoto(bufferLectura.readLine());
	    			obj.setLugarVisto(bufferLectura.readLine());
	    			obj.setNota(bufferLectura.readLine());
	    			obj.setDiaSuceso(bufferLectura.readLine());
                    obj.setRecompensa(bufferLectura.readLine());
                    obj.setIdEncargado(Integer.parseInt(bufferLectura.readLine()));
                    obj.setEstaEnCasaCuna(Boolean.parseBoolean(bufferLectura.readLine()));
                    size++;
                    listaMascotas.add(obj);				
	    		}


    		}else
        		JOptionPane.showMessageDialog(frame, "No existen datos. O cambio el archivo de ruta del archivo \"Mascotas\"");                		
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
	
	public static void GuardarMascota(){
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	size  = 0;
    	try
    	{		
    		escribir = new FileWriter(rutaMascotas,false);
    		pw = new PrintWriter(escribir);
    		
    		for(Mascota obj: listaMascotas)
    		{	
    			pw.println("===>nuevo Mascota<===");
    			pw.println(obj.getEstado());
    			//pw.println(obj.getID());
    			pw.println(size);
				pw.println(obj.getTipo());
				pw.println(obj.getRaza());
				pw.println(obj.getNombre());
				pw.println(obj.getChip());
				pw.println(obj.getColorDePelo());
				pw.println(obj.getColorDeOjos());
				pw.println(obj.getFoto());
				pw.println(obj.getLugarDelSuceso());
				pw.println(obj.getNota());
                pw.println(obj.getDiaSuceso());
                pw.println(obj.getRecompensa());
                pw.println(obj.getIdEncargado());
                pw.println(obj.estaEnCasaCuna());
                size ++;
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
	
	public static void AgregarMascota(Mascota mascota) throws IOException{
		leerMascota();
		listaMascotas.add(mascota);
		GuardarMascota();
	}
	
	public static int getSize(){return size;}
	
	public static ArrayList<Mascota> getMascotas(){
		return listaMascotas;
	}
	
	public static Mascota buscarPorChip(String numChip){
		
		try {
		
			leerMascota();
			Mascota mascotaEncontradaPorChip = new Mascota();
			
			for(Mascota obj:listaMascotas)
				if (obj.getChip().equals(numChip))
					return mascotaEncontradaPorChip;
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public static boolean ChipYaEstaRegistrado(String numChip){
		
		try {
		
			leerMascota();
			Mascota mascotaEncontradaPorChip = new Mascota();
			
			for(Mascota obj:listaMascotas)
				if (obj.getChip().equals(numChip))
					return true;
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	public static void todasLasMascotas() throws IOException{leerMascota(); listaMascotasFiltradas = listaMascotas;} // llamar antes de cada busqueda
	
	public static ArrayList<Mascota> getMascotasPorEstado(String estado ){
			
		ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>(); 
	    
		if(estado==null)
	    	return listaMascotasFiltradas;
	    
	    for(Mascota obj:listaMascotasFiltradas)
	        if (obj.getEstado().equals(estado))
	        	mascotasFiltradas.add(obj);
	               
	    return listaMascotasFiltradas = mascotasFiltradas; 
	        
	}
	
	public static ArrayList<Mascota> getMascotasPorTipo(String tipo){

	    ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
	    
	    if(tipo==null)
	    	return listaMascotasFiltradas;
	    
	    for(Mascota obj:listaMascotasFiltradas)
	        if (obj.getTipo().equals(tipo))
	              	mascotasFiltradas.add(obj);
	               
	        return listaMascotasFiltradas = mascotasFiltradas;
	}
	
	public static ArrayList<Mascota> getMascotasPorRaza(String raza){

		ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
		if(raza==null)
	    	return listaMascotasFiltradas;
		for(Mascota obj:listaMascotasFiltradas)
			if (obj.getRaza().equals(raza))
	               	mascotasFiltradas.add(obj);
	               
		return listaMascotasFiltradas = mascotasFiltradas;  
	}
	
	public static ArrayList<Mascota> getMascotasPorColorDePelo(String color){
			
		ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
		if(color==null)
	    	return listaMascotasFiltradas;    
		for(Mascota obj:listaMascotasFiltradas)
			if (obj.getColorDePelo().equals(color))
	             	mascotasFiltradas.add(obj);
	               
		return listaMascotasFiltradas = mascotasFiltradas;    
	}
	
	public static ArrayList<Mascota> getMascotasPorColorDeOjos(String color){
		
		  ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
		  if(color==null)
		    	return listaMascotasFiltradas;
		  for(Mascota obj:listaMascotasFiltradas)
		      if (obj.getColorDeOjos().equals(color))
		             	mascotasFiltradas.add(obj);
		               
		  return listaMascotasFiltradas = mascotasFiltradas;    
	}
	
	public static ArrayList<Mascota> getMascotasPorLugarDelSuceso(String lugar){
		
		  ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
		  if(lugar==null)
		    	return listaMascotasFiltradas;  
		  for(Mascota obj:listaMascotasFiltradas)
		      if (obj.getLugarDelSuceso().equals(lugar))
		             	mascotasFiltradas.add(obj);
		               
		  return listaMascotasFiltradas = mascotasFiltradas;    
	}


	
	
	
	
	
	
	
	
}
