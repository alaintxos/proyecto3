package Modelo;

public class Autobus {
	
	private int Cod_bus;
	private int N_plazas;
	private String Color;
	private double Consumo_km;
	
	//Constructor
	public Autobus(int cod_bus, int n_plazas, String color, double consumo_km) {
		
		this.Cod_bus = cod_bus;
		this.N_plazas = n_plazas;
		this.Color = color;
		this.Consumo_km = consumo_km;
	}
	public Autobus() {
		
	}
	
	//Getters and Setters
	
	public int getCod_bus() {
		return Cod_bus;
	}
	public void setCod_bus(int cod_bus) {
		Cod_bus = cod_bus;
	}
	public int getN_plazas() {
		return N_plazas;
	}
	public void setN_plazas(int n_plazas) {
		N_plazas = n_plazas;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public double getConsumo_km() {
		return Consumo_km;
	}
	public void setConsumo_km(double consumo_km) {
		Consumo_km = consumo_km;
	}
	
	
}
