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
import javax.swing.table.DefaultTableModel;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;







import acceso.VentanaPrincipal;





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

	private static final String rutaReportes = "./Usuarios_Reportes.poo";
	private static ArrayList<Reporte> listaDeReportes = new ArrayList<Reporte>();
	
	private static final String rutaDonaciones = "./Donaciones.poo";
	private static ArrayList<Donacion> listaDeDonaciones = new ArrayList<Donacion>();
	
	private static int idAsociacion;
	private static String rutaAsociaciones = "./Asociaciones.poo";
	private static String RutaImagenesAdoptantes = "./Adoptantes";
	public static ArrayList<Asociacion> listaAsociaciones=  new ArrayList<Asociacion>() ;
	
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
	
	
	public static void  leerAsociaciones() throws IOException
	{
		File archivo = new File (rutaAsociaciones);
		try
		{
			listaAsociaciones.clear();    
			idAsociacion= 0;
			if (archivo.exists())
			{			
	    		FileReader lectura = new FileReader (archivo);
	    		BufferedReader bufferLectura = new BufferedReader(lectura);
	    		while((bufferLectura.readLine())!=null)    			
	    		{ 
	    			Asociacion obj = new Asociacion();
	    			obj.setId(Integer.parseInt(bufferLectura.readLine()));
	    			idAsociacion++;
	    			obj.setNombre(bufferLectura.readLine());
	    			obj.setDireccion(bufferLectura.readLine());
	    			obj.setTelefono(bufferLectura.readLine());
	    			obj.setNumeroDeCuenta(bufferLectura.readLine());
	    			obj.setPaginaWeb(bufferLectura.readLine());
	    			listaAsociaciones.add(obj);		
	    			
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
	

public static void GuardarAsociacion() 
{
	FileWriter escribir = null;
	PrintWriter pw = null;
	try
	{		
		escribir = new FileWriter(rutaAsociaciones,false);
		pw = new PrintWriter(escribir);
		idAsociacion= 0;
		
		for(Asociacion obj: listaAsociaciones)
		{	
			pw.println("===>Nueva Asociacion<===");
			pw.println(idAsociacion);
			pw.println(obj.getNombre());
			pw.println(obj.getDireccion());
			pw.println(obj.getTelefono());
			pw.println(obj.getNumeroDeCuenta());
			pw.println(obj.getPaginaWeb());
			idAsociacion ++;
			
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

	public static ArrayList<Asociacion> getListaAsociaciones()throws IOException{leerAsociaciones();return listaAsociaciones;}


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
	
	public static void AgregarAsociacion(Asociacion asociacion) throws IOException{
		leerAsociaciones();
		listaAsociaciones.add(asociacion);
		GuardarAsociacion();
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


    		}                		
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

	public static ArrayList<CasaCuna>  getListaDeCasasCuna() throws IOException{
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
		File archivoOriginal = new File(imagenOriginal.getAbsolutePath());/////////////////////

		File archivoNuevo = null;
		try {
			archivoNuevo = new File(System.getProperty("user.dir") + "./mascotas/" + String.valueOf(SistemasMascotas.getListaMascotasSize()+1) + ".jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
	
		}
	}
	
	public static void copiarImagenAdoptante(File imagenOriginal) {
		File archivoOriginal = new File(imagenOriginal.getAbsolutePath());

		File archivoNuevo	 = new File(System.getProperty("user.dir") + "/Adoptantes/"+ String.valueOf(SistemasAdopciones.getListaDeAdopcionesSize()+1)+".jpg");

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
	            // Propiedades de la conexión
	            Properties props = new Properties();
	            props.setProperty("mail.smtp.host", "smtp.gmail.com");
	            props.setProperty("mail.smtp.starttls.enable", "true");
	            props.setProperty("mail.smtp.port", "587");
	            props.setProperty("mail.smtp.user", "dogs1lovers@gmail.com");
	            props.setProperty("mail.smtp.auth", "true");

	            // Preparamos la sesion
	            Session session = Session.getDefaultInstance(props);

	            // Construimos el mensaje
	            MimeMessage message = new MimeMessage(session);
	            message.setFrom(new InternetAddress("dogs1lovers@gmail.com"));
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
	

	

    public static void enviarMailConAdjunto(String correoDestinatario,String subject, String mensaje,String imagen)
    {
        try
        {
          // se obtiene el objeto Session. La configuración es para
          // una cuenta de gmail.
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "dogs1lovers@gmail.com");
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");//Linea que falta
			 
            Session session = Session.getDefaultInstance(props, null);
            // session.setDebug(true);

            // Se compone la parte del texto
            BodyPart texto = new MimeBodyPart();
            texto.setText(mensaje);

            // Se compone el adjunto con la imagen
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(
                new DataHandler(new FileDataSource(imagen)));
            adjunto.setFileName("fotoMascota.jpg");

            // Una MultiParte para agrupar texto e imagen.
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);

            // Se compone el correo, dando to, from, subject y el
            // contenido.
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("dogs1lovers@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(correoDestinatario));
            message.setSubject(subject);
            message.setContent(multiParte);

            // Se envia el correo.
            Transport t = session.getTransport("smtp");
            t.connect("dogs1lovers@gmail.com", "46@5aF1o.Dogs"); 
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
	
	private static boolean estaEnLista(String lista[], String dato){
		/*verifica si dato está en una lista dada*/
		for(String str: lista)
			if( str.equals(dato))
				return true;
		return false;
	}
	private static boolean estaEnLista(ArrayList<String> lista, String dato){
		/*verifica si dato está en una lista dada*/
		for(String str: lista)
			if( str.equals(dato))
				return true;
		return false;
	}

	////////////////////////////////////////// mascotas /////////////////////////////////////////////
	
	private static String estados = null; 
	private static String razas = null;
	private static String tipos = null;
	private static String colorDePelo = null;
	private static String colorDeOjos = null;
	private static String lugarVisto = null;
	
	
	

	

	
	
	private static ArrayList<String> listaDetalles = new ArrayList<String>();
		
	
	
	private static void  leerEstados() throws IOException{
		File archivo = new File (rutaEstadosDeMascotas);
    	try
    	{
    		if (archivo.exists())
    		{		
	    		lectura = new FileReader (archivo);
    			bufferLectura = new BufferedReader(lectura);
    			listaEstados.clear();
    			String dato = "" ;
    			while((dato = bufferLectura.readLine())!=null)    			
    				listaEstados.add(dato);	    				

    		}
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		lectura.close();
    	}
	}

	public static void agregarEstado(String nuevoEstado) throws IOException{
		leerEstados();
		ArrayList<String> estado = getListaEstados();
		if(!(estaEnLista(estado, nuevoEstado))){
		listaEstados.add(nuevoEstado);
		guardarEstados();
		JOptionPane.showMessageDialog(null, "Nuevo estado guardado con exito.");

		}else
			JOptionPane.showMessageDialog(null, "Estado ya está guardado.");

	}
	
	private static void guardarEstados(){
		
		
        FileWriter escribir = null;
        PrintWriter pw = null;
        try
        {       
            escribir = new FileWriter(rutaEstadosDeMascotas,false);
            pw = new PrintWriter(escribir);         
            
            for(String str: listaEstados)
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

	public static ArrayList<String> getListaEstados() throws IOException{
		leerEstados();
		return listaEstados;
	}

	
	
	private static void  leerColorDeOjos() throws IOException{
		File archivo = new File (rutaColorDeOjos);
    	try
    	{
    		if (archivo.exists())
    		{		
	    		lectura = new FileReader (archivo);
    			bufferLectura = new BufferedReader(lectura);
    			String dato = "" ;
    			while((dato = bufferLectura.readLine())!=null)    			
    				listaColorDeOjos.add(dato);	    				

    		}
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		lectura.close();
    	}
	}
	
	public static void  agregarColorDeOjos(String nuevoColorDeOjos) throws IOException{
		leerColorDeOjos();
		ArrayList<String> colorOjos = getListaColorDeOjos();
		if(!(estaEnLista(colorOjos, nuevoColorDeOjos))){
			listaColorDeOjos.add(nuevoColorDeOjos);
			guardarColorDeOjos();
			JOptionPane.showMessageDialog(null, "Nuevo color de ojos guardado con exito.");
		}else
			JOptionPane.showMessageDialog(null, "Color de ojo ya está guardado.");
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
	
	public static ArrayList<String> getListaColorDeOjos() throws IOException{
		leerColorDeOjos();
		return listaColorDeOjos;
	}
	
	
	
	public static void  leerColorDePelo() throws IOException{
		File archivo = new File (rutaColorDePelo);
    	try
    	{
    		if (archivo.exists())
    		{		
	    		lectura = new FileReader (archivo);
    			bufferLectura = new BufferedReader(lectura);
    			String dato = "" ;
    			while((dato = bufferLectura.readLine())!=null)    			
    				listaColorDePelo.add(dato);	    				

    		}               		

    		
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		lectura.close();
    	}
	}
	
	public static void  agregarColorDePelo(String nuevoColorDePelo) throws IOException{
		leerColorDePelo();
		ArrayList<String> colorPelo = getListaColorDeOjos();
		if(!(estaEnLista(colorPelo, nuevoColorDePelo))){
			listaColorDePelo.add(nuevoColorDePelo);
			guardarColorDePelo();
			JOptionPane.showMessageDialog(null, "Nuevo color de pelo guardado con exito.");
		}else
			JOptionPane.showMessageDialog(null, "Color de pelo ya está guardado.");
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
	
	public static ArrayList<String> getListaColorDePelo() throws IOException{
		leerColorDePelo();
		return listaColorDePelo;
	}
	
	

	private static void  leerTiposYRazas() throws IOException{
		File archivo = new File (rutaTipoYRazaDeMascotas);
    	try
    	{
    		if (archivo.exists())
    		{	listaTipoYRazaDeMascotas.clear();
	    		lectura = new FileReader (archivo);
    			bufferLectura = new BufferedReader(lectura);
    			String dato = "" ;
    			while((dato = bufferLectura.readLine())!=null){    			
    				listaTipoYRazaDeMascotas.add(dato);	    				
    				listaTipoYRazaDeMascotas.add(bufferLectura.readLine());
    				}
    		}//else
        		//JOptionPane.showMessageDialog(frame, "No existen datos. O cambio la ruta del archivo \"Detalles de mascotas\"");                		
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		lectura.close();
    	}
    }
	
	public static void agregarTipo(String tipo) throws IOException{
		leerTiposYRazas();
		String tipos[] = getListaTipo();
		if(!(estaEnLista(tipos, tipo))){
			listaTipoYRazaDeMascotas.add(tipo);
			listaTipoYRazaDeMascotas.add("");
			guardarTipoYRazaDeMascotas();
			JOptionPane.showMessageDialog(null, "Nuevo tipo guardado con exito");
		}
		else
			JOptionPane.showMessageDialog(null, "Este tipo ya está gardado");
	}
	
	public static void agregarRaza(String tipo, String NuevaRaza) throws IOException{
		leerTiposYRazas();
		
		boolean encontrado = false;
		boolean agregado = false;
		String tipos[] = getListaRazas(tipo);
		ArrayList<String> nuevaLista = new ArrayList<String>();
		if(!(estaEnLista(tipos, tipo))){
			
			for(String str: listaTipoYRazaDeMascotas){
				if(!agregado){					
					if(encontrado){
						System.out.println("AGRERR");
							str+=NuevaRaza+",";
							encontrado = false;
							JOptionPane.showMessageDialog(null, "Nueva raza guardada con exito");
							agregado = true;	
					}
					if(str.equals(tipo))
						encontrado = true;
				}
				if(str!=null)
					nuevaLista.add(str);
			}
			listaTipoYRazaDeMascotas = nuevaLista;
			guardarTipoYRazaDeMascotas();
		}else
			JOptionPane.showMessageDialog(null, "Esta raza ya está guardada");
		
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
	
	public static String[] getListaRazas(String tipo) throws IOException{
		leerTiposYRazas();
		boolean encontrado = false;
		for(String str: listaTipoYRazaDeMascotas){
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
		
		String tipos="";
		for(String str: listaTipoYRazaDeMascotas){
			if(esTipo){
				tipos+= str+",";
			}
			esTipo = !esTipo;
		}
		for (String str: tipos.split(","))
			System.out.println(str);
		
		return tipos.split(",");
	}
	
		

    public static void asignarIDFoto() {

        try {
			VentanaPrincipal.setFoto("./mascotas/" + String.valueOf(SistemasMascotas.getListaMascotasSize()+1)+".jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    }
    
    public static void crearCarpetaImagenesMascotas()
    {
        File archivo = new File (VentanaPrincipal.getRutaImagenesMascotas());

        if(!archivo.exists())
        {
            archivo.mkdir();
        }
    }
    
    public static void asignarIDFotoAdoptante() {
        try {
           SistemasAdopciones.leerAdopcion();
           VentanaPrincipal.setFotoAdoptante("./Adoptantes/" + String.valueOf(SistemasAdopciones.getListaDeAdopcionesSize()+1)+".jpg");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

    }
	public static void crearCarpetaImagenesAdoptantes() {
		   File archivo = new File (RutaImagenesAdoptantes);

	        if(!archivo.exists())
	        {
	            archivo.mkdir();
	        }

	}

	public static String[] arrayToString(ArrayList<String> pArreglo){
		String[] datos = new String[pArreglo.size()];
		int i = 0;
		for(String obj : pArreglo){
			datos[i] = obj;
		}
		return datos;
	}
	

	
	
	
	// cambiar  
	
	
 ///////////////////////////////////////////// Casas Cuna //////////////////////////////////////////////////////////
	
	
	public static CasaCuna getCasaCunaPorIdDeUsuario(int idUsuario){
		for(CasaCuna obj : listaCasasCuna){
			if(obj.getIdUsuarioCasaCuna() == idUsuario){
				return obj;
			}
		}
		return null;
	}

	
	public static DefaultTableModel cargarTablaDeCasaCuna(String[]datos, DefaultTableModel tableModel) throws IOException{
//		String[] datos = new String[4];
//		DefaultTableModel tableModel = new DefaultTableModel();
		for(int i = 0; i < getListaDeCasasCuna().size(); i++){
			CasaCuna casaCunaTemp = getListaDeCasasCuna().get(i);
			Usuario usuarioEncargado = SistemasUsuarios.getUsuario(casaCunaTemp.getIdUsuarioCasaCuna());
			datos[0] = Integer.toString(usuarioEncargado.getID());
			datos[1] = usuarioEncargado.getNombre() + " " + usuarioEncargado.getPrimerApellido() + " " + usuarioEncargado.getSegundoApellido(); 
			datos[2] = Integer.toString(casaCunaTemp.getCantMascota());
			datos[3] = Integer.toString(casaCunaTemp.getCamposDiponibles());
			tableModel.addRow(datos);
			
		}
		return tableModel;
	}
	
	
	
  /////////////////////////////////////////// Donaciones ///////////////////////////////////////////////////
    
   	public static ArrayList<Donacion> getListaDeDonaciones(){
   		return listaDeDonaciones;
   	}
   	
   	public static int getListaDeDonacionesSize(){
   		return listaDeDonaciones.size();
   	}

   	public static void agregarDonacion(Donacion pDonacion){
   		listaDeDonaciones.add(pDonacion);
   		
   	}
   	
   	public static void getDonacion(int pIndice){
   		listaDeDonaciones.get(pIndice);
   	}
   	
   	public static DefaultTableModel crearModeloDeDonacionesFiltradas(ArrayList<Donacion> pArreglo){
   		String[] columna = {"Asociación", "Donador", "Cantidad Donada"};
   		String[] datos = new String[3];
   		DefaultTableModel modeloNuevo = new DefaultTableModel(columna, 0);
   		for(int i = 0; i < pArreglo.size(); i++){
   			Donacion donacionTemp = pArreglo.get(i);
   			datos[0] = donacionTemp.getAsociacionBeneficiada().getNombre();
   			datos[1] = donacionTemp.getDonador().getNombre() + " " + 
   					   donacionTemp.getDonador().getPrimerApellido() + " " +
   					   donacionTemp.getDonador().getSegundoApellido();
   			datos[2] = Integer.toString(donacionTemp.getCantidadDonada());
   			modeloNuevo.addRow(datos);
   		}
   		return modeloNuevo;
   	}
   	
   	public static ArrayList<Donacion> buscarPorAsociacion(String filtro, ArrayList<Donacion> arregloAFiltrar){
   		ArrayList<Donacion> arregloFiltrado = new ArrayList<Donacion>();
   		for(Donacion obj : arregloAFiltrar){
   			if(obj.getAsociacionBeneficiada().getNombre().contains(filtro)){
   				arregloFiltrado.add(obj);
   			}
   		}
   		return arregloFiltrado;
   	}
   	
   	public static ArrayList<Donacion> buscarPorDonador(String filtro, ArrayList<Donacion> arregloAFiltrar){
   		ArrayList<Donacion> arregloFiltrado = new ArrayList<Donacion>();
   		for(Donacion obj : arregloAFiltrar){
   			if(obj.getDonador().getNombre().contains(filtro) || obj.getDonador().getNombreUsuario().contains(filtro)){
   				arregloFiltrado.add(obj);
   			}
   		}
   		return arregloFiltrado;
   	}
   	
   	public static DefaultTableModel cargarTablaDeDonaciones(String[]datos, DefaultTableModel tableModel) throws IOException{
   		
   		for(int i = 0 ; i < getListaDeDonacionesSize() ; i++){
   			Donacion donacionTemp = listaDeDonaciones.get(i);
			datos[0] = donacionTemp.getAsociacionBeneficiada().getNombre();
			datos[1] = donacionTemp.getDonador().getNombre() +
					   donacionTemp.getDonador().getPrimerApellido() +
					   donacionTemp.getDonador().getSegundoApellido();
			datos[2] = Integer.toString(donacionTemp.getCantidadDonada());
			tableModel.addRow(datos);
		}
   		return tableModel;
   	}
   	
   	
   	/////////////////////////////////////////// Reportes /////////////////////////////////////////////////////
   	
   	public static void agregarReporte(Reporte pReporte){
   		listaDeReportes.add(pReporte);
   	}
   	
   	public static void quitarReporte(Reporte pReporte){
   		listaDeReportes.remove(pReporte);
   	}
   	
   	public static boolean estaReportado(Usuario pUsuario){
   		for(Reporte obj : listaDeReportes){
   			if(pUsuario.equals(obj.getIdUsuarioReportado())){
   				return true;
   			}
   		}
   		return false;
   	}
   	
   	public static Reporte getReporteDeUsuarioReportado(Usuario pUsuario){
   		Reporte reporteBuscado = null;
   		for(Reporte obj : listaDeReportes){
   			if(obj.getIdUsuarioReportado() == pUsuario.getID()){
   				reporteBuscado = obj;
   			}
   		}
   		return reporteBuscado;
   	}
   	
   /*	public static void cargarTableDeListaNegra(){
   		
   		for(int i = 0; i < 1; i++){
   			Usuario usuarioTemp = ListaNegra.getListaNegraPorUsuarios().get(i);
   			matrizDeSalida[i][0] = String.valueOf(usuarioTemp.getID());
   			matrizDeSalida[i][1] = usuarioTemp.getNombreUsuario();
   			matrizDeSalida[i][2] = String.valueOf(usuarioTemp.getCalificacion());
   			if(estaReportado(usuarioTemp)){
   				matrizDeSalida[i][3] = "Reportado por otro usuario";
   			}else{
   				matrizDeSalida[i][3] = "Calificaciones bajas";
   			}
   		}
   		System.out.println(ListaNegra.listatoString());
   		return matrizDeSalida;
   	}
	*/
   	
   	public static DefaultTableModel cargarTablaDeUsuarios(String[]datos, DefaultTableModel tableModel){
   		
   		for(int i = 0 ; i < SistemasUsuarios.getListaDeUsuariosSize() ; i++){
   			Usuario usuarioTemp = SistemasUsuarios.getUsuario(i);
			datos[0] = Integer.toString(usuarioTemp.getID()); 
			datos[1] = usuarioTemp.getNombreUsuario();
			datos[2] = usuarioTemp.getNombre() + " " + usuarioTemp.getPrimerApellido() + " " + usuarioTemp.getSegundoApellido();
			datos[3] = Integer.toString(usuarioTemp.getCalificacion());
			tableModel.addRow(datos);
		}
   		return tableModel;
   	}
   	
   	public static DefaultTableModel cargarTablaDeUsuariosEnListaNegra(String[]datos, DefaultTableModel tableModel){
   		
   		for(int i = 0 ; i < SistemasUsuarios.getListaDeUsuariosSize() ; i++){
   			Usuario usuarioTemp = SistemasUsuarios.getUsuario(i);
   			if(usuarioTemp.estaEnListaNegra()){
				datos[0] = Integer.toString(usuarioTemp.getID()); 
				datos[1] = usuarioTemp.getNombreUsuario();
				datos[2] = usuarioTemp.getNombre() + " " + usuarioTemp.getPrimerApellido() + " " + usuarioTemp.getSegundoApellido();
				datos[3] = Integer.toString(usuarioTemp.getCalificacion());
				tableModel.addRow(datos);
   			}
		}
   		return tableModel;
   	}
   	
	public static void cargarTableNuevosAdmin(String[]columna,String[]filas,DefaultTableModel tableModel){
   		
   		for(int i = 0 ; i < SistemasUsuarios.getNoAdministradores().size(); i++){
   			Usuario usuarioTemp = SistemasUsuarios.getNoAdministradores().get(i);
   			filas[0] =Integer.toString(usuarioTemp.getID()); 
   			filas[1] =usuarioTemp.getNombre() + " " + usuarioTemp.getPrimerApellido();
   			filas[2] = usuarioTemp.getNombreUsuario();
   			tableModel.addRow(filas);
		}
   	}
	

public static void cargarTableAsociacionBeneficiaria(String[]columna,String[]filas,DefaultTableModel tableModel)throws IOException{
   		
   		for(Asociacion asociacion:getListaAsociaciones()){
   			filas[0] =asociacion.getNombre(); 
   			filas[1] =asociacion.getTelefono();
   			filas[2] = asociacion.getPaginaWeb();
   			tableModel.addRow(filas);
		}
   	}
	
public static void cargarTableAdopcionesACalificar(String[]columna,String[]filas,DefaultTableModel tableModel) throws IOException{
 
   		for(Adopcion adopcion:SistemasAdopciones.getAdopciones()){
   			if(adopcion.getIdPersonaQueDaEnAdopcion() == VentanaPrincipal.getIDUsuarioActivo()){
   			filas[0] =SistemasUsuarios.getNombreUsuario(adopcion.getIdAdoptante()); 
   			filas[1] =SistemasUsuarios.getNombreCompletoDelUsuario(adopcion.getIdAdoptante());
   			filas[2] =Integer.toString(SistemasUsuarios.getCalificacion(adopcion.getIdAdoptante()));
   			tableModel.addRow(filas);
   			}
		}
   	}


	public static DefaultTableModel cargarTablaDeMascotas(String[]datos, DefaultTableModel tableModel) throws IOException{
	   		
	   		for(int i = 0 ; i < SistemasMascotas.getListaMascotasSize() ; i++){
	   			Mascota mascotaTemp = SistemasMascotas.getMascota(i);
				datos[0] = Integer.toString(mascotaTemp.getID()); 
				datos[1] = mascotaTemp.getEstado();
				datos[2] = mascotaTemp.getTipo();
				datos[3] = mascotaTemp.getRaza();
				datos[4] = mascotaTemp.getColorDePelo();
				datos[5] = mascotaTemp.getColorDeOjos();
				datos[6] = mascotaTemp.getChip();
				datos[7] = mascotaTemp.getLugarDelSuceso();
				tableModel.addRow(datos);
				
			}
	   		return tableModel;
	   	}
		


	///////////////////////////////////////// Adopciones //////////////////////////////////////////////////////

	
}