

/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabi�n Monge
*Jefri C�rdenas
*Fecha de Creacion: 21/10/2014
*
*Descripci�n: Esta es la clase SistemasUsuarios, se ocupa de toda la parte dedicada del sistema a los usuarios.
*
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

import com.sun.org.apache.bcel.internal.generic.IDIV;

public class SistemasUsuarios {

	public SistemasUsuarios() {
	}

	private static final String rutaUsuarios = "./Usuarios.poo";	
	private static  ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static  ArrayList<Usuario> listaUsuariosFiltradas = new ArrayList<Usuario>();
	private static  ArrayList<Usuario> listaNegra = new ArrayList<Usuario>();
	public static int idUsuario;
	
	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	
	public static int getListaDeUsuariosSize(){
		return listaUsuarios.size();
	}
	
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
		try {
			leerUsuarios();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public static ArrayList<Usuario> getNoAdministradores(){
		
		ArrayList<Usuario> listaDeNoAdministradores = new ArrayList<Usuario>();
		
		try {
			leerUsuarios();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		for(Usuario usuario:listaUsuarios){
			if (!usuario.esAdministrador()){
				listaDeNoAdministradores.add(usuario);
			}
		}
		return listaDeNoAdministradores;
		
	}

	
	
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
	
	public static int getCantMascotasAdoptadas(int idUsuario){
		
		int cantidadDeMascotasAdoptadas = 0;
		try {
			SistemasMascotas.leerMascota();
			for(Mascota mascota: SistemasMascotas.getListaMascota()){
				if(mascota.getIdEncargado() == idUsuario){
					if (mascota.getEstado().equalsIgnoreCase("ADOPTADA")){
						cantidadDeMascotasAdoptadas++;
					}
				}
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		return cantidadDeMascotasAdoptadas;
	}
	
	public static String getNombreCompletoDelUsuario(int iDUsuario){
		
		String nombreCompleto = "";
		try {
			leerUsuarios();
			for(Usuario usuario:listaUsuarios){
				if(usuario.getID() == iDUsuario){
					nombreCompleto = usuario.getNombre()+" "+ usuario.getPrimerApellido() + " " + usuario.getSegundoApellido();
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return nombreCompleto;
		
	}
	

	public static String getCorreoDelUsuario(int iDUsuario){
		
		String correo = "";
		try {
			leerUsuarios();
			for(Usuario usuario:listaUsuarios){
				if(usuario.getID() == iDUsuario){
					correo = usuario.getEmail();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return correo;
		
	}


	public static String getTelefonoDelUsuario(int iDUsuario){
		
		String telefono= "";
		try {
			leerUsuarios();
			for(Usuario usuario:listaUsuarios){
				if(usuario.getID() == iDUsuario){
					telefono = usuario.getTelefono();
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return telefono;
		
	}
	
	public static int getCalificacion(int id){
		try {
			leerUsuarios();
		} catch (IOException e) {
			
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
	
	public static void convertirEnAdministrador(int idUsuario){
		try {
			leerUsuarios();
			for(Usuario usuario: listaUsuarios){
				if (usuario.getID() == idUsuario){
					usuario.setEsAdministrador(true);
				}
			}
			GuardarUsuario();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public static void verificarCalificacion(int idUsuario, int calificacion){
		
		try {
			leerUsuarios();
			for(Usuario usuario: listaUsuarios){
				if (usuario.getID() == idUsuario){
					if(calificacion < 3){
						usuario.setCalificacion(calificacion);
						usuario.setEstaEnListaNegra(true);
						JOptionPane.showMessageDialog(null, "Calificaci�n registrada correctamente.");
					}else{
						usuario.setCalificacion(calificacion);
						JOptionPane.showMessageDialog(null, "Calificaci�n registrada correctamente. El usuario fue a�adido a Lista Negra");
					}
				}
			}
			GuardarUsuario();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public static String getEmailPorID(int idUsuario) {			
		String email = "";
		try {
			leerUsuarios();
			for(Usuario usuario: listaUsuarios){
				if (usuario.getID() == idUsuario){
					email =  usuario.getEmail();
					return email;
				}
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}return email;
	
	}
	
}