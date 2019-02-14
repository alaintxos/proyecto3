package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ConsultasBBDD {

	protected static PreparedStatement statement = null;
	protected static ResultSet rs = null;
	static int indice=0;

	static String pass="root";
	static String user="root1";
	static String nombre="root1";
	static String server="127.0.0.1";
	static String URL="jdbc:mysql://"+server+":3306/"+nombre+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static Object valor(String nombreColumna)
	{
		Object aux=null;
		try {
			if(rs.isBeforeFirst())
				rs.next();
			aux=rs.getObject(nombreColumna);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aux;
	}
	
	public static void alPrimero() {
		try {
			rs.first();
			indice=rs.getRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void alUltimo() {
		try {
			rs.last();
			indice=rs.getRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void siguiente() {
		try {
			rs.last();
			if(indice<rs.getRow())
			{
				indice++;
				rs.absolute(indice);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void anterior() {
		try {
			if (indice > 1) {
				indice--;
				rs.absolute(indice);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}
	public static boolean existe() {
		boolean existe=false;
		try {
			rs.beforeFirst();
			existe=rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return existe;
	}
 
	public static void cerrarStatement() {
		try {
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}