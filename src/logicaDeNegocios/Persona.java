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

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String sexo;
	private String telefono;
	private String email;
	private int diaNacimiento;
	private String mesNacimiento;
	private int anioNacimiento;
	
	public  Persona(String pNombre,String pPrimerApellido, String pSegundoApellido,String pSexo, String pTelefono,
			String pEmail,int pDiaNacimiento, String pMesNacimiento, int pAnioNacimiento)
	{		
		setNombre(pNombre);
		setPrimerApellido(pPrimerApellido);
		setSegundoApellido(pSegundoApellido);
		setSexo(pSexo);
		setTelefono(pTelefono);
		setEmail(pEmail);
		setDiaNacimiento(pDiaNacimiento);
		setMesNacimiento(pMesNacimiento);
		setAnioNacimiento(pAnioNacimiento);
		
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

	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}
	public String getMesNacimiento() {
		return mesNacimiento;
	}
	public void setMesNacimiento(String mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

}
