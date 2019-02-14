package Modelo;

public class Paradas {
	private String Nombre;
	   private int Cod_Parada;

	    public Paradas(String Nombre, int Cod_Parada) {
	        this.Nombre = Nombre;
	        this.Cod_Parada = Cod_Parada;
	    }

	    public String getNombre() {
	        return Nombre;
	    }

	    public void setNombre(String Nombre) {
	        this.Nombre = Nombre;
	    }

	    public int getCod_Parada() {
	        return Cod_Parada;
	    }

	    public void setCod_Parada(int Cod_Parada) {
	        this.Cod_Parada = Cod_Parada;
	    }

	    public int toint() {
	        return Cod_Parada;
	    }
}
