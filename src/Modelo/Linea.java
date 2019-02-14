package Modelo;

public class Linea {
	
	private String Dni;
	private String Nombre;
	private String Apellido;
	private char Sexo;
	private String Contrasena;
	private String Fecha_naci;
	
	//Constructor
	public Linea(String dni, String nombre, String apellido, char sexo, String contrasena, String fecha_naci) {
		
		this.Dni = dni;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Sexo = sexo;
		this.Contrasena = contrasena;
		this.Fecha_naci = fecha_naci;
	}
	public Linea() {
		
	}
	
	//Getters and Setters
	
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	public String getFecha_naci() {
		return Fecha_naci;
	}
	public void setFecha_naci(String fecha_naci) {
		Fecha_naci = fecha_naci;
	}
	
	
	
}
