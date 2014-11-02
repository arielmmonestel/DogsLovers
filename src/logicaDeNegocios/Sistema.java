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




public class Sistema {
	
	private static Calendar fecha = Calendar.getInstance();
	private static int anio = fecha.get(Calendar.YEAR);
	private static int mes = fecha.get(Calendar.MONTH)+1; 
	private static int dia = fecha.get(Calendar.DATE);
	
	private static String rutaCasaCuna = "./casaCuna.poo";
	private static ArrayList<CasaCuna> listaCasasCuna = new ArrayList<CasaCuna>();
	
	private static final String rutaTipoYRazaDeMascotas = "./Mascotas_TipoYRaza.poo";
	private static ArrayList<String> listaTipoYRazaDeMascotas =  new ArrayList<>() ;
	//private static String listaTipoYRazaDeMascotas[]; 
	
	private static final String rutaColorDeOjos = "./Mascotas_color_Ojos.poo";
	private static ArrayList<String> listaColorDeOjos =  new ArrayList<>() ;
	
	private static final String rutaColorDePelo = "./Mascotas_color_Pelo.poo";
	private static ArrayList<String> listaColorDePelo =  new ArrayList<>() ;
	
	
	private static final String rutaEstadosDeMascotas = "./Mascotas_Estados.poo";
	private static ArrayList<String> listaEstados =  new ArrayList<>() ;


	//public static  ArrayList<String> listaDetallesMascota = new ArrayList<String>();
	
	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	

	public Sistema() {
	}
	

	public  static String getFecha(){
		String fecha = dia +"/"+ mes +"/"+ anio;
		return fecha;
	}
	

	private static void GuardarCasaCuna() 
    {
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	try
    	{		
    		escribir = new FileWriter(rutaCasaCuna,false);
    		pw = new PrintWriter(escribir);
    		
    		for(CasaCuna obj: listaCasasCuna)
    		{
    			pw.println("===>Nueva Casa Cuna<===");
    			pw.println(obj.getTamanoMascota());
    			pw.println(obj.getTipoMascota());
				pw.println(obj.isNecesitaDonacion());
				pw.println(obj.isNecesitaMedicamentos());
				pw.println(obj.getCantMascota());
				pw.println(obj.getCamposDiponibles());
				pw.println(obj.getDireccion());
				pw.println(obj.getIdUsuarioCasaCuna());
				
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
	
	private static void  leerCasaCuna() throws IOException
    {
		File archivo = new File (rutaCasaCuna);
    	try
    	{
    		listaCasasCuna.clear();    
    		if (archivo.exists())
    		{			
	    		lectura = new FileReader (archivo);
	    		bufferLectura = new BufferedReader(lectura);
	    		while((bufferLectura.readLine())!=null)    			
	    		{ 
				CasaCuna obj = new CasaCuna();   
	    			obj.setTamanoMascota(bufferLectura.readLine());
	    			obj.setTipoMascota(bufferLectura.readLine());
	    			obj.setNecesitaDonacion(Boolean.getBoolean(bufferLectura.readLine()));
	    			obj.setNecesitaMedicamentos(Boolean.getBoolean(bufferLectura.readLine()));
	    			obj.setCantMascota(Integer.parseInt(bufferLectura.readLine()));
	    			obj.setCamposDiponibles(Integer.parseInt(bufferLectura.readLine()));
	    			obj.setDireccion(bufferLectura.readLine());
	    			obj.setIdUsuarioCasaCuna(Integer.parseInt(bufferLectura.readLine()));
	    			listaCasasCuna.add(obj);				
	    		}


    		}else
        		JOptionPane.showMessageDialog(frame, "No existen datos. O cambio el archivo de ruta. (Usuarios)");                		
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		try
    		{
    			//if( null!= lectura )
        		if (archivo.exists())
    				lectura.close();
 
    		}catch (Exception e2)
    			{e2.printStackTrace();}
    	}
    }
	
	public static boolean esCasacuna(int idUsuario){
		try {
			leerCasaCuna();
		
		for(CasaCuna obj: listaCasasCuna)
			if(obj.getIdUsuarioCasaCuna() == idUsuario)
				return true;
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<CasaCuna>  getCastacuna() throws IOException{
		leerCasaCuna();
		return listaCasasCuna;
	}
	
	/*
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
	}*/


	public static void copiarImagen(File imagenOriginal) {
		File archivoOriginal = new File(imagenOriginal.getAbsolutePath());
		File archivoNuevo	 = new File(System.getProperty("user.dir") + "./mascotas/" + String.valueOf(SistemasMascotas.getSize()) + ".jpg");
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
	
	public static void enviarMail(String correoDestinatario, String mensaje, String subject,String CorreoRemitente,String passwordRemitente){
	        try
	       { 
	            // Propiedades de la conexi�n
	            Properties props = new Properties();
	            props.setProperty("mail.smtp.host", "smtp.gmail.com");
	            props.setProperty("mail.smtp.starttls.enable", "true");
	            props.setProperty("mail.smtp.port", "587");
	            props.setProperty("mail.smtp.user", "alejandrinabiblioteca172@gmail.com");
	            props.setProperty("mail.smtp.auth", "true");

	            // Preparamos la sesion
	            Session session = Session.getDefaultInstance(props);

	            // Construimos el mensaje
	            MimeMessage message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("alejandrinabiblioteca172@gmail.com"));
	            message.addRecipient(
	                Message.RecipientType.TO,
	                new InternetAddress(correoDestinatario)); //Sitio de destino del msj
	            
	            message.setSubject(subject); //"Subject o motivo del correo"
	            message.setText(mensaje); //Correo

	            // Lo enviamos.
	            Transport t = session.getTransport("smtp");
	            t.connect(CorreoRemitente, passwordRemitente); //Aqui va el correo de donde se va a enviar y la contrasena
	            t.sendMessage(message, message.getAllRecipients());

	            // Cierre.
	            t.close();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	        	
			
	
}
	
	private static boolean estaEnLista(ArrayList<String> lista, String dato){
		/*verifica si dato est� en lista*/
		for(String str: lista)
			if( str.equals(dato))
				return true;
		return false;
			
	}

	
	
	private static String estados = null; 
	private static String razas = null;
	private static String tipos = null;
	private static String colorDePelo = null;
	private static String colorDeOjos = null;
	private static String lugarVisto = null;
	
	public static String[] getListaRazas(String tipo) throws IOException{
		leerTiposYRazas();
		boolean encontrado = false;
		for(String str: listaDetalles){
			if(encontrado){
				String listaRazas[] = str.split(",");
				return listaRazas;
			}
			if(str.equals(tipo))
				encontrado = true;
			
		}
		return null;
	}
	
	public static String[] getListaTipo() throws IOException{
		
		leerTiposYRazas();
		boolean esTipo = true;
		String tipos = null;
		for(String str: listaDetalles){
			if(esTipo){
				tipos+= ","+str;
			}
			esTipo = !esTipo;
		}
		return tipos.split(",");
	}
	
	public static ArrayList<String> getListaColorDeOjos() throws IOException{
		leerColorDeOjos();
		return listaColorDeOjos;
	}
	
	public static ArrayList<String> getListaColorDePelo() throws IOException{
		leerColorDePelo();
		return listaColorDePelo;
	}
	
	public static ArrayList<String> getListaEsados() throws IOException{
		leerEstados();
		return listaEstados;
	}
	
	private static ArrayList<String> listaDetalles = new ArrayList<String>();
			
	private static void  leerEstados() throws IOException{
		File archivo = new File (rutaEstadosDeMascotas);
    	try
    	{
    		if (archivo.exists())
    		{		
	    		lectura = new FileReader (archivo);
    			bufferLectura = new BufferedReader(lectura);
    			while((bufferLectura.readLine())!=null)    			
    				listaEstados.add(bufferLectura.readLine());	    				
    		}else
        		JOptionPane.showMessageDialog(frame, "No existen datos. O cambio la ruta del archivo \"Color de pelo de mascotas\"");                		
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		lectura.close();
    	}
	}

	private static void  leerColorDeOjos() throws IOException{
		File archivo = new File (rutaColorDeOjos);
    	try
    	{
    		if (archivo.exists())
    		{		
	    		lectura = new FileReader (archivo);
    			bufferLectura = new BufferedReader(lectura);
    			while((bufferLectura.readLine())!=null)    			
    				listaColorDeOjos.add(bufferLectura.readLine());	    				
    		}else
        		JOptionPane.showMessageDialog(frame, "No existen datos. O cambio la ruta del archivo \"Color de pelo de mascotas\"");                		
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		lectura.close();
    	}
	}
	
	public static void  leerColorDePelo() throws IOException{
		File archivo = new File (rutaColorDePelo);
    	try
    	{
    		if (archivo.exists())
    		{		
	    		lectura = new FileReader (archivo);
    			bufferLectura = new BufferedReader(lectura);
    			while((bufferLectura.readLine())!=null)    			
    				listaColorDePelo.add(bufferLectura.readLine());	    				
    		}else
        		JOptionPane.showMessageDialog(frame, "No existen datos. O cambio la ruta del archivo \"Color de pelo de mascotas\"");                		
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		lectura.close();
    	}
	}
	
	private static void  leerTiposYRazas() throws IOException{
		File archivo = new File (rutaTipoYRazaDeMascotas);
    	try
    	{
    		if (archivo.exists())
    		{		
	    		lectura = new FileReader (archivo);
    			bufferLectura = new BufferedReader(lectura);
    			while((bufferLectura.readLine())!=null)    			
    				listaDetalles.add(bufferLectura.readLine());	    				
    		}else
        		JOptionPane.showMessageDialog(frame, "No existen datos. O cambio la ruta del archivo \"Detalles de mascotas\"");                		
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		lectura.close();
    	}
    }

	
	public static void  agregarColorDeOjos(String nuevoColorDeOjos) throws IOException{
		leerColorDeOjos();
		listaColorDeOjos.add(nuevoColorDeOjos);
	}
	
	public static void  agregarColorDePelo(String nuevoColorDePelo) throws IOException{
		leerColorDePelo();
		listaColorDePelo.add(nuevoColorDePelo);
	}
	
	public static void agregarTipo(String tipo) throws IOException{
		leerTiposYRazas();
		listaTipoYRazaDeMascotas.add(tipo);
		listaTipoYRazaDeMascotas.add(""); //" " 
	}
	
	public static void agregarRaza(String tipo, String NuevaRaza) throws IOException{
		leerTiposYRazas();
		
		boolean encontrado = false;
		for(String str: listaDetalles){
			if(str.equals(tipo))
				encontrado = true;
			if(encontrado){
				str+=","+NuevaRaza;
				encontrado = false;
				break;
			}
		}
		guardarTipoYRazaDeMascotas();
	}
	
	private static void guardarColorDeOjos() throws IOException{
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	try
    	{		
    		escribir = new FileWriter(rutaColorDeOjos,false);
    		pw = new PrintWriter(escribir);    		
    		for(String str: listaColorDeOjos)
    			pw.println(str);
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally 
    	{
    			escribir.close();
    	}
    }
	
	private static void guardarColorDePelo() throws IOException{
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	try
    	{		
    		escribir = new FileWriter(rutaColorDePelo,false);
    		pw = new PrintWriter(escribir);    		
    		for(String str: listaColorDePelo)
    			pw.println(str);
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally 
    	{
    				escribir.close();
    	}
	}
		
	private static void guardarTipoYRazaDeMascotas(){
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	try
    	{		
    		escribir = new FileWriter(rutaTipoYRazaDeMascotas,false);
    		pw = new PrintWriter(escribir);    		
    		for(String str: listaTipoYRazaDeMascotas)
    			pw.println(str);
    	
    		
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
	
	private static void guardarEstados(){
		
	}

		
	public static void agregarEstado(String nuevoEstado) throws IOException{
		leerEstados();
		listaEstados.add(nuevoEstado);
		guardarEstados();
	}
	
	
	
	
	
	// cambiar  
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}