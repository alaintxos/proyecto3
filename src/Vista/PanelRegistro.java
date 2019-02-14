package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PanelRegistro extends JPanel {
	/**
	 * 
	 */
	
	private JTextField tFNombreRegistro;
	private JTextField tfDNIRegistro;
	private JPasswordField pFContraseñaRegistro;
	private JPasswordField pFRegistroContraseña;
	private JComboBox<String> cBSexoRegistro;
	private JButton btnSalir, btnLoginAceptar;
	
	/**
	 * Create the panel.
	 */
	public PanelRegistro() {
		setLayout(null);
		setBounds(100, 100, 500, 500);
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(55, 104, 120, 14);
		add(lblNewLabel);
		
		tFNombreRegistro = new JTextField();
		tFNombreRegistro.setBounds(213, 101, 86, 20);
		add(tFNombreRegistro);
		tFNombreRegistro.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(121, 178, 31, 14);
		add(lblDni);
		
		tfDNIRegistro = new JTextField();
		tfDNIRegistro.setColumns(10);
		tfDNIRegistro.setBounds(213, 175, 86, 20);
		add(tfDNIRegistro);
		
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(89, 254, 63, 14);
		add(lblSexo);
		
		cBSexoRegistro = new JComboBox<String>();
		cBSexoRegistro.setBounds(213, 251, 86, 20);
		cBSexoRegistro.addItem("");
		cBSexoRegistro.addItem("M");
		cBSexoRegistro.setToolTipText("");
		cBSexoRegistro.addItem("F");
		cBSexoRegistro.setToolTipText("");
		add(cBSexoRegistro);
		
		JLabel lblContrasea = new JLabel("Contraseña: ");
		lblContrasea.setBounds(66, 313, 86, 14);
		add(lblContrasea);
		
		pFContraseñaRegistro = new JPasswordField();
		pFContraseñaRegistro.setBounds(213, 310, 86, 20);
		add(pFContraseñaRegistro);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contraseña: ");
		lblRepetirContrasea.setBounds(33, 379, 119, 14);
		add(lblRepetirContrasea);
		
		pFRegistroContraseña = new JPasswordField();
		pFRegistroContraseña.setBounds(213, 376, 86, 20);
		add(pFRegistroContraseña);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(33, 454, 89, 23);
		add(btnSalir);

		
		btnLoginAceptar = new JButton("Aceptar");
		btnLoginAceptar.setBounds(375, 454, 89, 23);
		add(btnLoginAceptar);
		
		

	}
	public JTextField gettFNombreRegistro() {
		return tFNombreRegistro;
	}
	public void settFNombreRegistro(JTextField tFNombreRegistro) {
		this.tFNombreRegistro = tFNombreRegistro;
	}
	public JTextField getTfDNIRegistro() {
		return tfDNIRegistro;
	}
	public void setTfDNIRegistro(JTextField tfDNIRegistro) {
		this.tfDNIRegistro = tfDNIRegistro;
	}
	public JPasswordField getpFContraseñaRegistro() {
		return pFContraseñaRegistro;
	}
	public void setpFContraseñaRegistro(JPasswordField pFContraseñaRegistro) {
		this.pFContraseñaRegistro = pFContraseñaRegistro;
	}
	public JPasswordField getpFRegistroContraseña() {
		return pFRegistroContraseña;
	}
	public void setpFRegistroContraseña(JPasswordField pFRegistroContraseña) {
		this.pFRegistroContraseña = pFRegistroContraseña;
	}
	public JComboBox<String> getcBSexoRegistro() {
		return cBSexoRegistro;
	}
	public void setcBSexoRegistro(JComboBox<String> cBSexoRegistro) {
		this.cBSexoRegistro = cBSexoRegistro;
	}
	public JButton getbtnSalir() {
		return btnSalir;
	}
	public void setbtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
	public JButton getbtnLoginAceptar() {
		return btnLoginAceptar;
	}
	public void setgetbtnLoginAceptar(JButton btnLoginAceptar) {
		this.btnLoginAceptar = btnLoginAceptar;
	}
	
	
}