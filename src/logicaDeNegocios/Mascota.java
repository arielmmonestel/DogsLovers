package logicaDeNegocios;
import java.util.ArrayList;
import java.util.Calendar;

public class Mascota {
	
	
	private static ArrayList<Mascota> listaDeMascotas = new ArrayList<Mascota>();
	
	private estadoMascota estado;
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
	private Calendar fecha; //En la que se perdió o se encontró
	private int recompensa;
	private int idEncargado;
	private boolean estaEnCasaCuna;
	private static int IDMascotas = 0;
	
	public Mascota(estadoMascota pEstado, String pTipo, String pRaza, String pNombre, String pChip, String pColorDePelo, String pColorDeOjos,
				   String pFoto, String pLugarVisto, String pNota, Calendar pFecha, int pRecompensa, int pIdEncargado) {
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
		setFecha(pFecha);
		setRecompensa(pRecompensa);
		setIdEncargado(pIdEncargado);
		setEstaEnCasaCuna(false);
	}
	
	public static ArrayList<Mascota> getListaDeMascotas(){
		return listaDeMascotas;
	}
	
	public static Mascota getMascota(int pIndice){
		return listaDeMascotas.get(pIndice);
	}

	public static int getListaDeMascotasSize(){
		return listaDeMascotas.size();
	}
	
	public static void agregarMascota(Mascota pMascota){
		listaDeMascotas.add(pMascota);
	}
	
	public void cargarMascotas(){
		
	}
	
	public void setID(int pId){
		id = pId;
	}
	
	public int getID(){
		return id;
	}
	
	public String getEstado() {
		return estado.toString();
	}

	public void setEstado(estadoMascota pEstado) {
		estado = pEstado;
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

	public void setNota(String pNota) {
		nota = pNota;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar pFecha) {
		fecha = pFecha;
	}

	public int getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(int pRecompensa) {
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
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////// Búsqueda
	
	public static final int opcionESTADO = 1;
	public static final int opcionTIPO = 2;
	public static final int opcionRAZA = 3;
	public static final int opcionCHIP = 4;
	public static final int opcionCOLORPELO = 5;
	public static final int opcionCOLOROJOS = 6;
	public static final int opcionLUGARVISTO = 7;
	
	public boolean contieneFiltro(String filtro, int opcion) {
		
		if (opcion == opcionESTADO){
			return getEstado().toString().toLowerCase().contains(filtro.toLowerCase());
		}
		if (opcion == opcionTIPO){
			return getTipo().toLowerCase().contains(filtro.toLowerCase());
		}
		if (opcion == opcionRAZA){
			return getRaza().toLowerCase().contains(filtro.toLowerCase());
		}
		if (opcion == opcionCHIP){
			return getChip().toLowerCase().contains(filtro.toLowerCase());
		}
		if (opcion == opcionCOLORPELO){
			return getColorDePelo().toLowerCase().contains(filtro.toLowerCase());
		}
		if (opcion == opcionCOLOROJOS){
			return getColorDeOjos().toLowerCase().contains(filtro.toLowerCase());
		}
		if (opcion == opcionLUGARVISTO){
			return getLugarVisto().toLowerCase().contains(filtro.toLowerCase());
		}		
		return false;
	}
	
}
