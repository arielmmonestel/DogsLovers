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

public class Usuario extends Persona{
	private int id;
	private String nombreUsuario;
	private String contrasenia;
	private CasaCuna casaCuna= null;
	private boolean esAdministrador = false;
	private boolean estaEnListaNegra=false;
	private ArrayList<Usuario> personasCalificables;
	private ArrayList<Mascota> mascotasAdoptadas;
	int calificacion;
	
	
	private static int IDUsuarios = 0;
	private static ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	private static String rutaUsuarios = "./usuarios.poo";	

	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	  
	    
	
	public Usuario(String pNombre,String pPrimerApellido, String pSegundoApellido,String pSexo, String pTelefono,
			String pEmail,int pDiaNacimiento, String pMesNacimiento, int pAnioNacimiento, String pNombreUsuario, String pContrasenia)  {
		super( pNombre,pPrimerApellido, pSegundoApellido, pSexo, pTelefono,
				pEmail,pDiaNacimiento,pMesNacimiento,pAnioNacimiento);
		
		setID(IDUsuarios++);
		setNombreUsuario(pNombreUsuario);
		setContrasenia(pContrasenia);
		
		
	}


	public Usuario() {
		super();
	}


	public int getID() {
		return id;
	}

	public void setID(int pId) {
		id = pId;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String pNombreUsuario) {
		nombreUsuario = pNombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String pContrasenia) {
		contrasenia = pContrasenia;
	}

	public CasaCuna getCasaCuna() {
		return casaCuna;
	}

	public void setEsCasaCuna(CasaCuna pCasaCuna) {
		casaCuna = pCasaCuna;
	}
	
	public boolean esAdministrador() {
		return esAdministrador;
	}

	public void setEsAdministrador(boolean pEsAdministrador) {
		esAdministrador = pEsAdministrador;
	}

	public boolean estaEnListaNegra() {
		return estaEnListaNegra;
	}

	public void setEstaEnListaNegra(boolean pEstaEnListaNegra) {
		estaEnListaNegra = pEstaEnListaNegra;
	}

	public ArrayList<Usuario> getPersonasCalificables() {
		return personasCalificables;
	}

	public void setPersonasCalificables(ArrayList<Usuario> pPersonasCalificables) {
		personasCalificables = pPersonasCalificables;
	}

	public ArrayList<Mascota> getMascotasAdoptadas() {
		return mascotasAdoptadas;
	}

	public void setMascotasAdoptadas(ArrayList<Mascota> pMascotasAdoptadas) {
		mascotasAdoptadas = pMascotasAdoptadas;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int pCalificacion) {
		calificacion = pCalificacion;
	}

	public static ArrayList<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public static void agregarUsuario(Usuario pUsuario) {
		listaDeUsuarios.add(pUsuario);
	}
	
	public static int getListaDeUsuariosSize(){
		return listaDeUsuarios.size();
	}
	
	/*Metodo que carga a los Usuarios en un arreglo*/
	public void  leerUsuario() throws IOException
    {
		File archivo = new File (rutaUsuarios);
    	try
    	{
    		listaDeUsuarios.clear();    
    		IDUsuarios = 0;
    		if (archivo.exists())
    		{			
	    		lectura = new FileReader (archivo);
	    		bufferLectura = new BufferedReader(lectura);
	    		while((bufferLectura.readLine())!=null)    			
	    		{ 
	    			Usuario obj = new Usuario();   
	    			obj.setID(Integer.parseInt(bufferLectura.readLine()));
	    			IDUsuarios ++;
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
	    			listaDeUsuarios.add(obj);				
	    		}


    		}else
        		JOptionPane.showMessageDialog(frame, "No existen datos. O cambio el archivo de ruta. (Usuarios)");                		
    	}catch(Exception e){
    		e.printStackTrace();  
    	}finally
    	{
    		//  En el finally cerramos el fichero, para asegurarnos
    		// que se cierra tanto si todo va bien como si salta  una excepcion.
    		try
    		{
    			//if( null!= lectura )
        		if (archivo.exists())
    				lectura.close();
 
    		}catch (Exception e2)
    			{e2.printStackTrace();}
    	}
    }
	
	public void GuardarUsuario(ArrayList<Usuario> arrayUsuarios1) 
    {
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	try
    	{		
    		escribir = new FileWriter(rutaUsuarios,false);
    		pw = new PrintWriter(escribir);
    		
    		for(Usuario obj: arrayUsuarios1)
    		{	
    			pw.println("===>nuevo Usuario<===");
    			pw.println(obj.getID());
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
			}
    	} catch (Exception e) {
    		e.printStackTrace();
    	} finally 
    	{
    		try 
    		{
    			// 	Nuevamente aprovechamos el finally para
    			//	asegurarnos que se cierra el fichero.
    			//if (null != escribir)
    				escribir.close();
    		} catch (Exception e2) 
    		{e2.printStackTrace();}
    	}
    }
  



	

}
