package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

import Modelo.Cliente;
import Modelo.ConsultasBBDD;
import Modelo.Modelo;
import Vista.PanelRegistro;
import Vista.Ventana;
import Vista.Vista;


public class Controlador {

	protected static final String String = null;
	private Vista vista;
	private Modelo modelo;
	private ConsultasBBDD consultasBBDD;

	public Controlador(Vista vista, Modelo modelo, ConsultasBBDD consultasBBDD2) {
		this.vista = vista;
		this.modelo = modelo;
		this.consultasBBDD = consultasBBDD2;
		InitializeEvents();
		
	}

	public static StringBuilder devolucion() {

		double cambios = 0;
		int devolucion = (int) cambios / 2;
		StringBuilder texto = null;
		while (cambios > 200) {
			cambios = cambios - 200;
			texto.append("Un billete de 200 euros \n");

		}
		while (cambios > 100) {
			cambios = cambios - 100;
			texto.append("Un billete de 100 euros \n");

		}
		while (cambios > 50) {
			cambios = cambios - 50;
			texto.append("Un billete de 50 euros \n");

		}
		while (cambios > 20) {
			cambios = cambios - 20;
			texto.append("Un billete de 20 euros \n");

		}
		while (cambios > 10) {
			cambios = cambios - 10;
			texto.append("Un billete de 10 euros \n");

		}
		while (cambios > 5) {
			cambios = cambios - 5;
			texto.append("Un billete de 5 euros \n");

		}
		while (cambios > 2) {
			cambios = cambios - 2;
			texto.append("Una moneda de 2 euros \n");

		}
		while (cambios > 1) {
			cambios = cambios - 1;
			texto.append("Una moneda de 1 euros \n");
		}
		while (cambios > 0.5) {
			cambios = cambios - 0.5;
			texto.append("Una moneda de 0,5 euros \n");
		}
		while (cambios > 0.2) {
			cambios = cambios - 0.2;
			texto.append("Una moneda de 0,2 euros \n");

		}
		while (cambios > 0.1) {
			cambios = cambios - 0.1;
			texto.append("Una moneda de 0,1 euros \n");
		}
		while (cambios > 0.05) {
			cambios = cambios - 0.05;
			texto.append("Una moneda de 0,05 euros \n");
		}
		while (cambios > 0.02) {
			cambios = cambios - 0.02;
			texto.append("Una moneda de 0,02 euros \n");
		}
		while (cambios > 0.01) {
			cambios = cambios - 0.01;
			texto.append("Una moneda de 0,01 euros \n");

		}
		return texto;

	}
	 
	public void insertarUsuario(Cliente A1) {
		Modelo connection=new Modelo();
		String sql="INSERT INTO cliente VALUES(?,?,?,?,?,?)";
		
		try {
			//Cogemos la sentencia realizada anteriormente
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			//asignamos los atributos a la consulta
			ps.setString(1, A1.getNombre());
			ps.setString(2, A1.getDni());
			ps.setString(3, A1.getApellido());
			ps.setString(4, A1.getFecha_nac());
			ps.setString(5, A1.getSexo());
			ps.setString(6, A1.getContraseña());
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("Insert Erroneo");
		}
		
}
	public  ArrayList<String> cargarLineas(){
		Modelo connection= new Modelo();
		ArrayList<String> nLineas=new ArrayList<String>();
		String sql="SELECT Nombre FROM linea";
		String nombrelinea = " ";
		try {
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				nLineas.add(rs.getString(1));
				nombrelinea=rs.getString(1);
			}
		
		}catch(Exception e) {
			System.err.println("Consulta no valida");
		}
		
		return nLineas;
	}
	
	public  ArrayList<String> cargarparadaO(){
		Modelo connection= new Modelo();
		ArrayList<String> paradasO=new ArrayList<String>();
		String nombrelinea = String.valueOf(vista.eleccion.getcomboLinea().getSelectedItem());
		String sql="SELECT p.Nombre FROM parada p , linea_parada lp WHERE p.Cod_Parada = lp.Cod_Parada AND lp.Cod_Linea LIKE '"+nombrelinea+"' ";
		
		try {
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				paradasO.add(rs.getString(1));
			}
		
		}catch(Exception e) {
			System.err.println("Consulta no valida");
		}
		
		return paradasO;
	}
	private void rellenarComboLineas() {
		//Sacar las lineas de la BBDD y rellenar el combobox
		//1.Sacar datos de la BBDD
				
		ArrayList<String> lineas=cargarLineas();
		
		//2.Rellenar combo de lineas		

		for(int i = 0;i<lineas.size();i++) {
			vista.eleccion.getcomboLinea().addItem(lineas.get(i));
		}

	}
	private void rellenarComboparadaO() {
		//Sacar las lineas de la BBDD y rellenar el combobox
		//1.Sacar datos de la BBDD
				
		ArrayList<String> paradasO=cargarparadaO();
		
		//2.Rellenar combo de lineas		

		for(int i = 0;i<paradasO.size();i++) {
			vista.eleccion.getcomboOrigen().addItem(paradasO.get(i));
		}

	}
	
	public boolean comprobarLogin(String dni,String pass) {
		
		Modelo connection=new Modelo();
		String sql="SELECT DNI,Contrasena FROM cliente WHERE DNI LIKE '"+dni+"' AND Contrasena LIKE '"+pass+"'";
		

			try {
			PreparedStatement ps=connection.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			rs.last();
			if(rs.getRow()>0) {
				return true;
			}else {
				return false;
			}
					
			}catch(Exception e) {
			System.err.println("Consulta erronea"+e);
			return false;
		}
		}
	
	

	public void SumarIntroducido(double cantidad) {
		double TotalIntroducido = 0;
		double cambios=0;
		double Total=0;
		TotalIntroducido = TotalIntroducido + cantidad;
		vista.pagar.gettextField_1().setText(Double.toString(TotalIntroducido));
		// Datos.sacarResto=Datos.Total-Datos.TotalIntroducido;
		if (Total > TotalIntroducido) {
			vista.pagar.gettextField_2().setText(Double.toString(0));

		} else {
			vista.pagar.gettextField_2().setText(Double.toString(TotalIntroducido - Total));
			cambios = TotalIntroducido - Total;
		}
	}

	public static void elmasmolon() {
		double latitudOrigen = 56.9;
		double longitudOrigen = 47.23;
		double latitudDestino = 65.43;
		double longitudDestino = 71.34;
		double calcular_distancia = 0;
		double calcularlatitud = 0;
		double calcularlongitud = 0;
		int asiento = 45;
		double consumo_km = 0.36;
		double precioTotal = 0;
		
		
		calcularlatitud = latitudDestino-latitudOrigen;
		calcularlongitud = longitudDestino-longitudOrigen;
		calcular_distancia = Math.sqrt(Math.pow(calcularlatitud,2)+(Math.pow(calcularlongitud,2)));

		precioTotal = (calcular_distancia*consumo_km*asiento*0.2);
		precioTotal = Math.round(precioTotal*100.0)/100.0;
		System.out.println(precioTotal);
		
	}

		private Cliente cogerdatosregistroUsuario() {
		
		//Al darle al boton registrar, Guardas los datos de la pantalla y los guarda en un objeto usuario
		
			if(vista.PanelRegistro.getpFContraseñaRegistro().getPassword() == vista.PanelRegistro.getpFRegistroContraseña().getPassword()) {
			
				Cliente A1 = new Cliente();

				A1.setNombre(vista.PanelRegistro.gettFNombreRegistro().getText());
				A1.setDni(vista.PanelRegistro.getTfDNIRegistro().getText());
				A1.setApellido("CASA");
				A1.setFecha_nac(" 0");
				A1.setContraseña(String.valueOf(vista.PanelRegistro.getpFContraseñaRegistro().getPassword()));
				A1.setContraseña(String.valueOf(vista.PanelRegistro.getpFRegistroContraseña().getPassword()));
				if (vista.PanelRegistro.getcBSexoRegistro().getSelectedItem().equals("M")){
					A1.setSexo("M");
				}else {
					A1.setSexo("F");
				}
				return A1;
			}
			return null;
		
}


	private void InitializeEvents() {
		vista.panelLogin.getbtnRegistrarse().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.PanelRegistro);

			}
		});

		vista.PanelRegistro.getbtnLoginAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value = (String)vista.PanelRegistro.getcBSexoRegistro().getSelectedItem();
				vista.PanelRegistro.getcBSexoRegistro().setSelectedItem(value);
				
				
				//recogemos los datos del usuario
				Cliente A1=cogerdatosregistroUsuario();
				insertarUsuario(A1);
				resetRegistro();
				vista.mostrarPanel(vista.panelLogin);

			}
			//resetear el panel registro poniendolo vacio.
			private void resetRegistro() {
				// TODO Auto-generated method stub
				vista.PanelRegistro.gettFNombreRegistro().setText(null);
				vista.PanelRegistro.getTfDNIRegistro().setText(null);
				vista.PanelRegistro.getcBSexoRegistro().setSelectedIndex(0);
				vista.PanelRegistro.getpFRegistroContraseña().setText(null);
				vista.PanelRegistro.getpFContraseñaRegistro().setText(null);
			}
		});

		
		vista.eleccion.getbtnaceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.Resumen);

			}
		});
		
		vista.Resumen.getBtnPagar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPanel(vista.panelLogin);

			}
		});

		vista.panelPresentacion.getbtnPresentacionTermibus().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Cambia el panel de presentacion a Login
				rellenarComboLineas();
				vista.mostrarPanel(vista.eleccion);
			}
		});
		vista.panelLogin.getbtnLoginAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String user=vista.panelLogin.gettFLoginUsuario().getText();
				String password=String.valueOf(vista.panelLogin.getpFLoginPassword().getPassword());
				
				 
				boolean validarLogin=comprobarLogin(user,password);
				
				if(validarLogin==true) {
					

					vista.mostrarPanel(vista.pagar);
					
				}else {
					//mostramos el error pero borramos los campos para hacer un intendo de nuevo
					System.out.println("esta mal");
					vista.mostrarPanel(vista.panelLogin);
				}
				
			
			}
		});
		
		vista.pagar.getbtnDevolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Cambia el pagar al panel devolver
				vista.mostrarPanel(vista.Devolver);
			}
		});
		vista.PanelRegistro.getbtnSalir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Cambia el pagar al panel devolver
				vista.mostrarPanel(vista.panelLogin);
			}
		});
		vista.panelLogin.getbtnLoginAceptar().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// Leer el usuario y password que han introducido en PanelLogin
				// Ir a la BBDD y ver si existe ese usuario
				// Si no existe, borrar datos y dar mensaje de error
				// si existe cambiar el Panel a PanelLineas

				String usuario = vista.panelLogin.gettFLoginUsuario().getText();
				String password = vista.panelLogin.getpFLoginPassword().getText();

				// Llamar a una metodo del modelo con usuario y password
				// y que me devuelva un boolean

			}
		});

	}

	
}