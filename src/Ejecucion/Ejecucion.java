package Ejecucion;

import Controlador.Controlador;
import Modelo.ConsultasBBDD;
import Modelo.Modelo;
import Vista.Vista;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		ConsultasBBDD consultasBBDD = null;
		Controlador Controlador = new Controlador(vista, modelo, consultasBBDD);
		
		
		Controlador.elmasmolon();
	}

}