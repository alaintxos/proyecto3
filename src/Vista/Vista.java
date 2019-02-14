package Vista;

import javax.swing.JPanel;

public class Vista {

	public Ventana ventana = new Ventana();
	public PanelLogin panelLogin = new PanelLogin();
	public PanelRegistro PanelRegistro = new PanelRegistro();
	public PanelPresentacion panelPresentacion = new PanelPresentacion();
	public Eleccion eleccion = new Eleccion();
	public Resumen Resumen = new Resumen();
	public Devolver Devolver = new Devolver();
	public Pagar pagar = new Pagar();
	
	public Vista() {
		mostrarPanel(panelPresentacion);
	}
	
	//Metodo que recibe un panel
	//y lo muestra en el JFrame ventana
	public void mostrarPanel(JPanel panel) {
		ventana.setContentPane(panel);
		ventana.setVisible(true);
	}
}