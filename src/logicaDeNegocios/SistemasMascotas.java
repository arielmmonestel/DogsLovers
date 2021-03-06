/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabi�n Monge
*Jefri C�rdenas
<<<<<<< HEAD
*Fecha de Creacion: 4/11/2014
*
*Descripci�n: Esta es la clase Sistamas Mascotas , su funci�n general es mostrar todos los datos de la mascota em pantalla y guardarlos en memoria.
=======
*Fecha de Creacion: 21/10/2014
*
*Descripci�n: Esta es la clase SistemasMascotas, se ocupa de toda la parte del sistemas dedicada a mascotas.
>>>>>>> origin/master
*
*/



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
import javax.swing.text.StyledEditorKit.BoldAction;

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
	public static  ArrayList<Mascota> listaMascotasFiltradas = new ArrayList<Mascota>();
	public static int size;
	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	public static int idMascota;

	public static ArrayList<Mascota> getListaMascota(){
		return listaMascotas;
	}
	
	public static void  leerMascota() throws IOException
    {
		File archivo = new File (rutaMascotas);
    	try
    	{
    		listaMascotas.clear();    
    		idMascota = 0;
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
	    			idMascota++;
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
                    listaMascotas.add(obj);	

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
	
	public static void GuardarMascota(){
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	size  = 0;
    	idMascota = 0;
    	try
    	{		
    		escribir = new FileWriter(rutaMascotas,false);
    		pw = new PrintWriter(escribir);
    		
    		for(Mascota obj: listaMascotas)
    		{	
    			pw.println("===>nuevo Mascota<===");
    			pw.println(obj.getEstado());
    			pw.println(idMascota);
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
                idMascota ++;

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
	
	public static int getListaMascotasSize() throws IOException{leerMascota();return listaMascotas.size(); }
	
	public static ArrayList<Mascota> getMascotas(){
		return listaMascotas;
	}
	
	public static Mascota getMascota(int pIndice){
		return listaMascotas.get(pIndice);
	}
	
	public static String getFotoMascota(int idMascota){
		String foto = "";
		try {
			leerMascota();
			for(Mascota mascota:listaMascotas){
				if(mascota.getID() == idMascota){
					foto = mascota.getFoto();
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return foto;
	}
	
	public static String getNombreMascota(int idMascota){
		String nombre= "";
		try {
			leerMascota();
			for(Mascota mascota:listaMascotas){
				if(mascota.getID() == idMascota){
					nombre = mascota.getNombre();
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return nombre;
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
			
			
			for(Mascota obj:listaMascotas)
				if (obj.getChip().equals(numChip))
					return true;
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static ArrayList<Mascota> getMascotasFiltradas(){return listaMascotasFiltradas;} 
	
	public static void buscarEnTodasLasMascotas() throws IOException{leerMascota(); listaMascotasFiltradas = listaMascotas;} // llamar antes de cada busqueda
	
	public static ArrayList<Mascota> getMascotasPorEstado(String estado){
		try {
			leerMascota();
		} catch (IOException e) { 
			e.printStackTrace();
		}	
		ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>(); 
		if(estado==" ")
	    	return listaMascotasFiltradas;
	    
	    for(Mascota obj:listaMascotasFiltradas)
	        if (obj.getEstado().equals(estado))
	        	mascotasFiltradas.add(obj);
	               
	    return listaMascotasFiltradas = mascotasFiltradas; 
	        
	}
	
	public static ArrayList<Mascota> getMascotasPorTipo(String tipo){

	    ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
	    if(tipo != null)
	    if( tipo.equals(" "))
	    	return listaMascotasFiltradas;
	    
	    for(Mascota obj:listaMascotasFiltradas)
	        if (obj.getTipo().equals(tipo))
	              	mascotasFiltradas.add(obj);
	   
	       return listaMascotasFiltradas = mascotasFiltradas;
	}
	
	public static ArrayList<Mascota> getMascotasPorRaza(String raza){
		ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
		if(!(raza == null)) 
			if(!(raza.equals(" ")))
			{
				for(Mascota obj:listaMascotasFiltradas)
					if (obj.getRaza().equals(raza))
							{System.out.println("filtr� un -"+raza);
			               	mascotasFiltradas.add(obj);
							}
				return listaMascotasFiltradas = mascotasFiltradas;
				
			}   
		return listaMascotasFiltradas;
	}	
	
	
	
	public static ArrayList<Mascota> getMascotasPorColorDePelo(String color){
			
		ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
		if(color.equals((" ")))
	    	return listaMascotasFiltradas;    
		for(Mascota obj:listaMascotasFiltradas)
			if (obj.getColorDePelo().equals(color))
	             	mascotasFiltradas.add(obj);
	               
		return listaMascotasFiltradas = mascotasFiltradas;    
	}
	
	public static ArrayList<Mascota> getMascotasPorColorDeOjos(String color){
		
		  ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
		  if(color.equals(" "))
		    	return listaMascotasFiltradas;
		  for(Mascota obj:listaMascotasFiltradas)
		      if (obj.getColorDeOjos().equals(color))
		             	mascotasFiltradas.add(obj);
		               
		  return listaMascotasFiltradas = mascotasFiltradas;    
	}
	
	public static ArrayList<Mascota> getMascotasPorLugarDelSuceso(String lugar){
		
		  ArrayList<Mascota> mascotasFiltradas = new ArrayList<Mascota>();
		  if(lugar.equals(" "))
		    	return listaMascotasFiltradas;  
		  for(Mascota obj:listaMascotasFiltradas)
		      if (obj.getLugarDelSuceso().equals(lugar))
		             	mascotasFiltradas.add(obj);
		               
		  return listaMascotasFiltradas = mascotasFiltradas;    
	}


	
	
	public static boolean hayCoincidencias(String raza, String colorPelo, 
			String colorOjos, String estado, int idDeQuienRegitra){
		try {
				String subject = " ";
				String mensaje = " ";
				String imagen = " ";
			 
				buscarEnTodasLasMascotas();
				if(estado.equals("ENCONTRADA")){
					getMascotasPorEstado("PERDIDA");
					System.out.println("if de Encontradas");
				}
				else
					if(estado.equals("PERDIDA")){
						getMascotasPorEstado("EN ADOPCI�N");
						ArrayList<Mascota> listaTemp = new ArrayList<Mascota>();
						listaTemp = getMascotasFiltradas();
						
						buscarEnTodasLasMascotas();
						getMascotasPorEstado("EN CASA CUNA");
						listaMascotasFiltradas.addAll(listaTemp);
						
						ArrayList<Mascota> listaTemp1 = new ArrayList<Mascota>();
						listaTemp1 = getMascotasFiltradas();
						
						buscarEnTodasLasMascotas();
						getMascotasPorEstado("ENCONTRADA");						
						listaMascotasFiltradas.addAll(listaTemp1);
						System.out.println("if de perdidas");
												
					}
				
				getMascotasPorRaza(raza);
				getMascotasPorColorDeOjos(colorOjos);
				getMascotasPorColorDePelo(colorPelo);
				
				if(getMascotasFiltradas() !=null){
					  
						for(Mascota obj: getMascotasFiltradas()){
							subject = ""
									+ "Es posible que " + SistemasUsuarios.getNombreCompletoDelUsuario(obj.getIdEncargado())
									+ " conozca informaci�n de la mascota ingresada ";
							imagen = obj.getFoto();
							mensaje = "La mascota con el id " + obj.getID() + " en este momento esta bajo el cuido de  " 
									+ SistemasUsuarios.getNombreCompletoDelUsuario(obj.getIdEncargado()) +  ".\n" 
									+"Si desea comunicarse puede hacerlo al tel�fono:  " 
									+ SistemasUsuarios.getUsuario(obj.getIdEncargado()).getTelefono() 
									+ ".\n " +"O al correo electr�nico: " + SistemasUsuarios.getUsuario(obj.getIdEncargado()).getEmail()
									+ "Dogs Lover no se hace responsable por falsa informaci�n."; 
							
							Sistema.enviarMailConAdjunto(SistemasUsuarios.getEmailPorID(idDeQuienRegitra), subject, mensaje, imagen);
								
					}
					return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	
	
	public static String getRazaDeMascota(int idMascota) {
		String raza = "";
		try {
			leerMascota();
			for(Mascota mascota:listaMascotas){
				if(mascota.getID() == idMascota){
					raza= mascota.getRaza();
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return raza;
	}

	public static String getTipoDeMascota(int idMascota) {
		String tipo= "";
		try {
			leerMascota();
			for(Mascota mascota:listaMascotas){
				if(mascota.getID() == idMascota){
					tipo= mascota.getTipo();
							
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return tipo;
	}

	public static String getEncargadoActual(int idMascota2) {
		int idEncargado = 0;
		String encargado= "";
		try {
			leerMascota();
			SistemasUsuarios.leerUsuarios();
			for(Mascota mascota:listaMascotas){
				if(mascota.getID() == idMascota){
					idEncargado= mascota.getIdEncargado();
							
				}
			}
			encargado = SistemasUsuarios.getNombreCompletoDelUsuario(idEncargado);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return encargado;
		
	}

	
	public static String getNickEncargadoActual(int idMascota2) {
		int idEncargado = 0;
		String encargado= "";
		try {
			leerMascota();
			SistemasUsuarios.leerUsuarios();
			for(Mascota mascota:listaMascotas){
				if(mascota.getID() == idMascota2){
					idEncargado= mascota.getIdEncargado();
					break;
				}
			}
			encargado = SistemasUsuarios.getNombreUsuario(idEncargado);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encargado;
		
	}
	
	

	public static ArrayList<Mascota> buscarMascotasPorNumeroDeChip(String filtro){
		ArrayList<Mascota> arregloDeRetorno = new ArrayList<Mascota>();
		for(Mascota obj : listaMascotas){
			if(obj.getChip().contains(filtro)){
				arregloDeRetorno.add(obj);
			}
		}
		return arregloDeRetorno;
	}
	
	public static ArrayList<Mascota> buscarMascotasPorLugar(String filtro){
		ArrayList<Mascota> arregloDeRetorno = new ArrayList<Mascota>();
		for(Mascota obj : listaMascotas){
			if(obj.getLugarDelSuceso().contains(filtro)){
				arregloDeRetorno.add(obj);
			}
		}
		return arregloDeRetorno;
	}

	
	public static int getIDporChip(String numChip){
		
		try {
		
			leerMascota();
			Mascota mascotaEncontradaPorChip = new Mascota();
			
			for(Mascota obj:listaMascotas)
				if (obj.getChip().equals(numChip))
					return obj.getID();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	
	
	
	
}

