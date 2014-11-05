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

import com.sun.org.apache.bcel.internal.generic.IDIV;

public class SistemasUsuarios {

	public SistemasUsuarios() {
	}

	private static final String rutaUsuarios = "./Usuarios.poo";	
	private static  ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static  ArrayList<Usuario> listaUsuariosFiltradas = new ArrayList<Usuario>();
	private static  ArrayList<Usuario> listaNegra = new ArrayList<Usuario>();
	public static int size;
	public static int idUsuario;
	
	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	
	public static int getSize(){return size = idUsuario;}
	
	public static ArrayList<Usuario> getUsuarios() throws IOException{leerUsuarios(); return listaUsuarios;}
	
	public static void  leerUsuarios() throws IOException
    {
		File archivo = new File (rutaUsuarios);
    	try
    	{
    		listaUsuarios.clear();    
    		idUsuario = 0;
    		if (archivo.exists())
    		{			
	    		lectura = new FileReader (archivo);
	    		bufferLectura = new BufferedReader(lectura);
	    		while((bufferLectura.readLine())!=null)    			
	    		{ 
	    			Usuario obj = new Usuario();   
	    			obj.setID(Integer.parseInt(bufferLectura.readLine()));
	    			idUsuario ++;
	    			obj.setNombre(bufferLectura.readLine());
	    			obj.setPrimerApellido(bufferLectura.readLine());
	    			obj.setSegundoApellido(bufferLectura.readLine());
	    			obj.setSexo(bufferLectura.readLine());
	    			obj.setTelefono(bufferLectura.readLine());
	    			obj.setEmail(bufferLectura.readLine());
	    			obj.setDiaNacimiento(Integer.parseInt(bufferLectura.readLine()));
	    			obj.setMesNacimiento(bufferLectura.readLine());
	    			obj.setAnioNacimiento(Integer.parseInt(bufferLectura.readLine()));
	    			obj.setNombreUsuario(bufferLectura.readLine());
	    			obj.setContrasenia(bufferLectura.readLine());
	    			obj.setEsCasaCuna(Boolean.parseBoolean(bufferLectura.readLine()));
	    			obj.setEsAdministrador(Boolean.parseBoolean(bufferLectura.readLine()));
	    			obj.setEstaEnListaNegra(Boolean.parseBoolean(bufferLectura.readLine()));
					obj.setCalificacion(Integer.parseInt(bufferLectura.readLine()));
	    			listaUsuarios.add(obj);		
	    			
	    		}
    		}else
        		JOptionPane.showMessageDialog(frame, "No existen datos. O cambio la ruta del archivo \"Usuarios\"");                		
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

	
	public static void GuardarUsuario() 
    {
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	try
    	{		
    		escribir = new FileWriter(rutaUsuarios,false);
    		pw = new PrintWriter(escribir);
    		idUsuario = 0;
    		
    		for(Usuario obj: listaUsuarios)
    		{	
    			pw.println("===>nuevo Usuario<===");
    			pw.println(idUsuario);
    			pw.println(obj.getNombre());
				pw.println(obj.getPrimerApellido());
				pw.println(obj.getSegundoApellido());
				pw.println(obj.getSexo());
				pw.println(obj.getTelefono());
				pw.println(obj.getEmail());
				pw.println(obj.getDiaNacimiento());
				pw.println(obj.getMesNacimiento());
				pw.println(obj.getAnioNacimiento());
				pw.println(obj.getNombreUsuario());
				pw.println(obj.getContrasenia());
				pw.println(obj.esCasaCuna());
				pw.println(obj.esAdministrador());
				pw.println(obj.estaEnListaNegra());
				pw.println(obj.getCalificacion());
				idUsuario++;
				
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
	
	public static Usuario getUsuario(int indice){
		return listaUsuarios.get(indice);
	}
  
	public static void AgregarUsuario(Usuario usuario) throws IOException{
		leerUsuarios();
		listaUsuarios.add(usuario);
		GuardarUsuario();
	}
	
	public  static boolean nicknameYaEstaRegistrado(String nickname)
    {		     
		try {
			
			leerUsuarios();
		
			for(Usuario obj: listaUsuarios)	
				if(obj.getNombreUsuario().equals(nickname))
					return true;
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
		
		
    }
	
	public  static boolean emailYaEstaRegistrado(String email)
    {		    
		try {
			leerUsuarios();
			for(Usuario obj: listaUsuarios)
				if(obj.getEmail().equals(email))
					return true;
							
		} 
		 catch (IOException e) {
				e.printStackTrace();
		}
		return false;
    }
	
	public  static boolean verificarUsuarioYContrasena(String nombreUsuario,String contrasena){

		try {
			leerUsuarios();
		
			for(Usuario obj: listaUsuarios)
				if(obj.getNombreUsuario().equals(nombreUsuario))
					if(obj.getContrasenia().equals(contrasena))
						return true;
					else
						return false;
								
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public  static boolean verificarEsAdministrador(String nombreUsuario){
	
		try {
			leerUsuarios();
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(Usuario obj: listaUsuarios){
			if(obj.getNombreUsuario().equals(nombreUsuario)){
			
				if(obj.esAdministrador()){
					return true;
				}
			}
		}

		return false;
	}

	//public static void todasLasPersonas() throws IOException{leerUsuarios(); listaUsuariosFiltradas = listaUsuarios;} // llamar antes de cada busqueda
	
	public static Usuario buscarUsuarioPorEmail(String email){
		try {
			leerUsuarios();
			for(Usuario obj: listaUsuarios)
				if(obj.getEmail().equals(email))
					return obj;		
		} 
		 catch (IOException e) {
				e.printStackTrace();
		}
		return null;
	}
	
	public static Usuario buscarUsuarioPorNickName(String nick){
		try {
			leerUsuarios();
			for(Usuario obj: listaUsuarios)
				if(obj.getNombreUsuario().equals(nick))
					return obj;		
		} 
		 catch (IOException e) {
				e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<Usuario> getUsuariosCasaCuna(String nick){
		try {
			leerUsuarios();
			ArrayList<Usuario> usuriosCasaCuna = new ArrayList<Usuario>(1); 
			for(Usuario obj: listaUsuarios)
				if(obj.getNombreUsuario().equals(nick))
					usuriosCasaCuna.add(obj);
			return usuriosCasaCuna;
		} 
		 catch (IOException e) {
				e.printStackTrace();
		}
		return null;
	}
	
	
	public static int getIdPorNickName(String nick){
		try {
			leerUsuarios();
			for(Usuario obj: listaUsuarios)
				if(obj.getNombreUsuario().equals(nick))
					return  obj.getID();		
		} 
		 catch (IOException e) {
				e.printStackTrace();
		}
		return -1;
	}
	public static String getNombreUsuario(int id){
		try {
			leerUsuarios();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String nombreUsuario = "";
		for(Usuario usuario:listaUsuarios){
			if (usuario.getID() ==id){
				nombreUsuario = usuario.getNombreUsuario();
			}
		}
		return nombreUsuario;
	}
	
	public static int getCalificacion(int id){
		try {
			leerUsuarios();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int calificacionUsuario = 0;
		for(Usuario usuario:listaUsuarios){
			if (usuario.getID() ==id){
				calificacionUsuario= usuario.getCalificacion();
			}
		}
		return calificacionUsuario;
	}
	
}
