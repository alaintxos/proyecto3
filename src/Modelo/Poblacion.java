package Modelo;

public class Poblacion {
	private int Cod_Postal;
	private String Nombre;
	
	//Constructor
	public Poblacion(int cod_Postal, String nombre) {
		
		this.Cod_Postal = cod_Postal;
		this.Nombre = nombre;
	}
	public Poblacion() {
		
	}
	
	//Getters and Setters
	
	public int getCod_Postal() {
		return Cod_Postal;
	}
	public void setCod_Postal(int cod_Postal) {
		Cod_Postal = cod_Postal;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
}
