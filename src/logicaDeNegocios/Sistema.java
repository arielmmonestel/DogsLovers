package logicaDeNegocios;
import java.util.*;

public class Sistema {
	
	static Calendar fecha = Calendar.getInstance();
	static int anio = fecha.get(Calendar.YEAR);
	static int mes = fecha.get(Calendar.MONTH)+1;
	static int dia = fecha.get(Calendar.DATE);
	
	public static void main(String[] args){
		System.out.println("Dia: "  +dia+"\n"+ "Mes: "+mes+"\n"+"Anio: "+anio);
	}

}
