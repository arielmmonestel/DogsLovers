package logicaDeNegocios;

public class Persona {
/*-int ID
-String nombre
-String primerApellido
-String segundoApellido
-String nombre
-String password
-String Sexo
-String phone
-String email
-String DireccionResidencia
-CasaCuna CasaCuna //Si el usuario es casa cuna. aqui van todos los atributos de esa clase
-boolean blackList
*/
	private int iD = 0;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String password;
	private String nombreUsuario;
	private String sexo;
	private String telefono;
	private String email;	
	private String direccionResidencia;
	protected CasaCuna casaCuna;
	boolean listaNegra;
	
	public  Persona(String pNombre,String pPrimerApellido, String pSegundoApellido,String pPassword,String pNombreUsuario,String pSexo, String pTelefono,
			String pEmail,String pDireccionResidencia,CasaCuna pCasaCuna,boolean pListaNegra)
	{	iD++;	
		setNombre(pNombre);
		setPrimerApellido(pPrimerApellido);
		setSegundoApellido(pSegundoApellido);
		setPassword(pPassword);
		setNombreUsuario(pNombreUsuario);
		setSexo(pSexo);
		setTelefono(pTelefono);
		setEmail(pEmail);
		setDireccionResidencia(pDireccionResidencia);
		setCasaCuna(pCasaCuna);
		setListaNegra(pListaNegra);
		
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String pSexo) {
		sexo = pSexo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccionResidencia() {
		return direccionResidencia;
	}
	public void setDireccionResidencia(String pDireccionResidencia) {
		direccionResidencia = pDireccionResidencia;
	}
	public CasaCuna getCasaCuna() {
		return casaCuna;
	}
	public void setCasaCuna(CasaCuna pCasaCuna) {
		casaCuna = pCasaCuna;
	}
	public boolean isListaNegra() {
		return listaNegra;
	}
	public void setListaNegra(boolean listaNegra) {
		this.listaNegra = listaNegra;
	}

}
