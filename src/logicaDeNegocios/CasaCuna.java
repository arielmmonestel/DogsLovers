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

public class CasaCuna {

	
	private String tamanoMascota;
	private String tipoMascota;
	private boolean necesitaDonacion;
	private boolean necesitaMedicamentos;
	
	private int cantMascota; //Cantidad de mascotas que ha recibido
	private int camposDiponibles; //  cantidad de mascotas que puede recibir
	//private ArrayList<Integer> IDMascotasqueTengo; //Creo que para saber las mascotas que tengo en casa cuna,basta con escoger todas las mascotas que estan en estado "ENCASACUNA" y tienen el id del usuario encagardo
	private String direccion;
	private int idUsuarioCasaCuna;
	private static ArrayList<CasaCuna> listaCasasCuna = new ArrayList<CasaCuna>();
	private static String rutaCasaCuna = "./casaCuna.poo";	

	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();

	
	public CasaCuna(String pTamanoMascota,String pTipoMascota,boolean pNecesitaDonacion,boolean pNecesitaMedicamentos,int pCantMascota,int pCamposDiponibles,String pDireccion,int pIdUsuarioCasaCuna){
		
		setTamanoMascota(pTamanoMascota);
		setTipoMascota(pTipoMascota);
		setNecesitaDonacion(pNecesitaDonacion);
		setNecesitaMedicamentos(pNecesitaMedicamentos);
		setCantMascota(pCantMascota);
		setCamposDiponibles(pCamposDiponibles);
		setDireccion(pDireccion);
		setIdUsuarioCasaCuna(pIdUsuarioCasaCuna);
		
	}
	public CasaCuna(){}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String pDireccion) {
		direccion = pDireccion;
	}
	public int getIdUsuarioCasaCuna() {
		return idUsuarioCasaCuna;
	}
	public void setIdUsuarioCasaCuna(int idUsuarioCasaCuna) {
		this.idUsuarioCasaCuna = idUsuarioCasaCuna;
	}
	public String getTamanoMascota() {
		return tamanoMascota;
	}
	public void setTamanoMascota(String tamanoMascota) {
		this.tamanoMascota = tamanoMascota;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public boolean isNecesitaDonacion() {
		return necesitaDonacion;
	}
	
	public boolean isNecesitaMedicamentos() {
		return necesitaMedicamentos;
	}
	public void setNecesitaMedicamentos(boolean necesitaMedicamentos) {
		this.necesitaMedicamentos = necesitaMedicamentos;
	}
	
	public static ArrayList<CasaCuna> getListaCasasCuna() {
		return listaCasasCuna;
	}
	public static void setListaCasasCuna(ArrayList<CasaCuna> listaCasasCuna) {
		CasaCuna.listaCasasCuna = listaCasasCuna;
	}
		
	public void setNecesitaDonacion(boolean necesitaDonacion) {
		this.necesitaDonacion = necesitaDonacion;
	}
	public int getCantMascota() {
		return cantMascota;
	}
	public void setCantMascota(int cantMascota) {
		this.cantMascota = cantMascota;
	}
	public int getCamposDiponibles() {
		return camposDiponibles;
	}
	public void setCamposDiponibles(int camposDiponibles) {
		this.camposDiponibles = camposDiponibles;
	}
/*	public ArrayList<Integer> getIDMascotasqueTengo() {
		return IDMascotasqueTengo;
	}
	public void setIDMascotasqueTengo(ArrayList<Integer> iDMascotasqueTengo) {
		//IDMascotasqueTengo = iDMascotasqueTengo;
	}
*/
	
	public  void GuardarCasaCuna(ArrayList<CasaCuna> arrayCasaCuna) 
    {
    	FileWriter escribir = null;
    	PrintWriter pw = null;
    	try
    	{		
    		escribir = new FileWriter(rutaCasaCuna,false);
    		pw = new PrintWriter(escribir);
    		
    		for(CasaCuna obj: arrayCasaCuna)
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
    			// 	Nuevamente aprovechamos el finally para
    			//	asegurarnos que se cierra el fichero.
    			//if (null != escribir)
    				escribir.close();
    		} catch (Exception e2) 
    		{e2.printStackTrace();}
    	}
    }
	
	public static void  leerCasaCuna() throws IOException
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
	
	public static boolean esCasacuna(int idUsuario){
		try {
			CasaCuna.leerCasaCuna();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(CasaCuna obj: listaCasasCuna){
			if(obj.getIdUsuarioCasaCuna() == idUsuario){
				return true;
			}
			
		}
		return false;
	}

	
  

}
