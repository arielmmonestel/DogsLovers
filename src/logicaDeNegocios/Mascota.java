package logicaDeNegocios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mascota {
	
	
	private static ArrayList<Mascota> listaDeMascotas = new ArrayList<Mascota>();
	
	private static String estado;
	private int id;
	private String tipo;
	private String raza;
	private String nombre = null;
	private String chip = null;
	private String colorDePelo;
	private String colorDeOjos;
	private String foto;
	private String lugarVisto;
	private String nota=null;
	private Object diaSuceso;
	private String recompensa;	
	private int idEncargado;
	private boolean estaEnCasaCuna = false;
	private static int IDMascotas = 0;
	private static String rutaMascotas = "./mascotas.poo";	
	File archivo = null;
	static FileReader lectura = null;
	static BufferedReader bufferLectura = null;
	static JFrame frame = new JFrame();
	
	
	public Mascota(String pEstado, String pTipo, String pRaza, String pNombre, String pChip, String pColorDePelo, String pColorDeOjos,
				   String pFoto, String pLugarVisto, String pNota, Object pDia, String pRecompensa, int pIdEncargado) {
		setID(IDMascotas++);
		setEstado(pEstado);
		setTipo(pTipo);
		setRaza(pRaza);
		setNombre(pNombre);
		setChip(pChip);
		setColorDePelo(pColorDePelo);
		setColorDeOjos(pColorDeOjos);
		setFoto(pFoto);
		setLugarVisto(pLugarVisto);
		setNota(pNota);
		setDiaSuceso(pDia);
		
				
		setRecompensa(pRecompensa);
		setIdEncargado(pIdEncargado);
		setEstaEnCasaCuna(false);
	}
	
	public Mascota() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<Mascota> getListaDeMascotas(){
		return listaDeMascotas;
	}

	public static int getListaDeMascotasSize(){
		return listaDeMascotas.size();
	}
	
	public static void agregarMascota(Mascota pMascota){
		listaDeMascotas.add(pMascota);
	}
	

	
	public void setID(int pId){
		id = pId;
	}
	
	public int getID(){
		return id;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String string) {
		estado = string;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String pTipo) {
		tipo = pTipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String pRaza) {
		raza = pRaza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String pNombre) {
		nombre = pNombre;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String pChip) {
		chip = pChip;
	}

	public String getColorDePelo() {
		return colorDePelo;
	}

	public void setColorDePelo(String pColorDePelo) {
		colorDePelo = pColorDePelo;
	}

	public String getColorDeOjos() {
		return colorDeOjos;
	}

	public void setColorDeOjos(String pColorDeOjos) {
		colorDeOjos = pColorDeOjos;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String pFoto) {
		foto = pFoto;
	}

	public String getLugarVisto() {
		return lugarVisto;
	}

	public void setLugarVisto(String pLugarVisto) {
		lugarVisto = pLugarVisto;
	}

	public String getNota() {
		return nota;
	}
	

	public Object getDiaSuceso() {
		return diaSuceso;
	}

	public void setDiaSuceso(Object pDia) {
		this.diaSuceso = pDia;
	}

	

	public void setNota(String pNota) {
		nota = pNota;
	}

	public String getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(String pRecompensa) {
		recompensa = pRecompensa;
	}

	public int getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(int pIdEncargado) {
		idEncargado = pIdEncargado;
	}

	public boolean estaEnCasaCuna() {
		return estaEnCasaCuna;
	}

	public void setEstaEnCasaCuna(boolean pEstaEnCasaCuna) {
		estaEnCasaCuna = pEstaEnCasaCuna;
	}
	
	public static void  leerMascota() throws IOException
    {
          File archivo = new File (rutaMascotas);
     try
     {
          listaDeMascotas.clear();    
          IDMascotas = 0;
          if (archivo.exists())
          {              
               lectura = new FileReader (archivo);
               bufferLectura = new BufferedReader(lectura);
               while((bufferLectura.readLine())!=null)   
            	   
               { 
            	   
                    Mascota obj = new Mascota();
                    obj.setID(Integer.parseInt(bufferLectura.readLine()));
                    IDMascotas ++;
                    obj.setEstado(bufferLectura.readLine());
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
                    obj.setIdEncargado(0);
                    listaDeMascotas.add(obj);       
                    
               }


          }else
               JOptionPane.showMessageDialog(frame, "No existen datos. O cambio el archivo de ruta. (Mascotas)");                      
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
     
     public void GuardarMascota(ArrayList<Mascota> arrayMascotas1) 
    {
     FileWriter escribir = null;
     PrintWriter pw = null;
     try
     {         
          escribir = new FileWriter(rutaMascotas,false);
          pw = new PrintWriter(escribir);
          
          for(Mascota obj: arrayMascotas1)
          {    
               pw.println("===>nuevo Mascota<===");
               pw.println(obj.getID());
               pw.println(obj.getEstado());
               pw.println(obj.getTipo());
               pw.println(obj.getRaza());
               pw.println(obj.getNombre());
               pw.println(obj.getChip());
               pw.println(obj.getColorDePelo());
               pw.println(obj.getColorDeOjos());
               pw.println(obj.getFoto());
               pw.println(obj.getLugarVisto());
               pw.println(obj.getNota());
               pw.println(obj.getDiaSuceso());
               pw.println(obj.getRecompensa());
               pw.println(obj.getIdEncargado());
               
               }
          
          
     } catch (Exception e) {
          e.printStackTrace();
     } finally 
     {
          try 
          {
               //   Nuevamente aprovechamos el finally para
               //   asegurarnos que se cierra el fichero.
               //if (null != escribir)
                    escribir.close();
          } catch (Exception e2) 
          {e2.printStackTrace();}
     }
    }


	
}
