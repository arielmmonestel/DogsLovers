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
	
	
	
	public static ArrayList<Adopcion> getAdopciones() throws IOException{leerAdopcion(); return listaAdopciones;}
	
	public static void leerAdopcion(){}
}
