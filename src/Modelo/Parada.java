package Modelo;

public class Parada {
	
	private int Cod_Parada;
	private String Nombre;
	private String Calle;
	private double Latitud;
	private double Longitud;
	
	//Constructor
	public Parada(int cod_Parada, String nombre, String calle, double latitud, double longitud) {
		
		this.Cod_Parada = cod_Parada;
		this.Nombre = nombre;
		this.Calle = calle;
		this.Latitud = latitud;
		this.Longitud = longitud;
	}
	public Parada() {
		
	}
	
	//Getters and Setters
	
	public int getCod_Parada() {
		return Cod_Parada;
	}
	public void setCod_Parada(int cod_Parada) {
		Cod_Parada = cod_Parada;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCalle() {
		return Calle;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	public double getLatitud() {
		return Latitud;
	}
	public void setLatitud(double latitud) {
		Latitud = latitud;
	}
	public double getLongitud() {
		return Longitud;
	}
	public void setLongitud(double longitud) {
		Longitud = longitud;
	}
	
}
