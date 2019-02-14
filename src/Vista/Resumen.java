package Vista;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;



import javax.swing.JLabel;

public class Resumen extends JPanel {

	private JLabel LblResumen;
	private JLabel LblLineas;
	private JLabel LblOrigen;
	private JLabel LblDestino;
	private JLabel LblIda;
	private JLabel LblVuelta;
	private JLabel LblPrecio;
	private JButton BtnPagar;
	private JTextField TextField;
	private JTextField TextField_1;
	private JTextField TextField_2;
	private JTextField TextField_3;
	private JTextField TextField_4;
	private JTextField TextField_5;
	private JPanel panel;
	
	/**
	 * Create the panel.
	 */
	public Resumen() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		
		LblResumen = new JLabel("RESUMEN DEL BILLETE");
		LblResumen.setBounds(135, 25, 182, 24);
		add(LblResumen);
		
		LblLineas = new JLabel("Linea");
		LblLineas.setBounds(32, 80, 56, 16);
		add(LblLineas);
		
		LblOrigen = new JLabel("Origen");
		LblOrigen.setBounds(32, 109, 56, 16);
		add(LblOrigen);
		
		LblDestino = new JLabel("Destino");
		LblDestino.setBounds(32, 138, 56, 16);
		add(LblDestino);
		
		LblIda = new JLabel("Ida");
		LblIda.setBounds(32, 167, 56, 16);
		add(LblIda);
		
		LblVuelta = new JLabel("Vuelta");
		LblVuelta.setBounds(199, 167, 56, 16);
		add(LblVuelta);
		
		LblPrecio = new JLabel("Precio");
		LblPrecio.setBounds(32, 205, 56, 16);
		add(LblPrecio);
		
		BtnPagar = new JButton("Pagar");
		BtnPagar.setBounds(280, 222, 97, 25);
		add(BtnPagar);
		
		TextField = new JTextField();
		TextField.setBounds(64, 77, 116, 22);
		add(TextField);
		TextField.setColumns(10);
		
		TextField_1 = new JTextField();
		TextField_1.setBounds(74, 109, 116, 22);
		add(TextField_1);
		TextField_1.setColumns(10);
		
		TextField_2 = new JTextField();
		TextField_2.setColumns(10);
		TextField_2.setBounds(84, 135, 116, 22);
		add(TextField_2);
		
		TextField_3 = new JTextField();
		TextField_3.setColumns(10);
		TextField_3.setBounds(53, 164, 116, 22);
		add(TextField_3);
		
		TextField_4 = new JTextField();
		TextField_4.setColumns(10);
		TextField_4.setBounds(239, 164, 116, 22);
		add(TextField_4);
		
		TextField_5 = new JTextField();
		TextField_5.setColumns(10);
		TextField_5.setBounds(74, 202, 116, 22);
		add(TextField_5);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(10, 48, 411, 167);
		add(panel);

	}
	
	public JLabel getLblResumen() {
		return (this.LblResumen);
	}
	public void setLblResumen() {
		this.LblResumen.setText("RESUMEN DEL BILLETE");
	}
	public JLabel getLblLineas() {
		return (this.LblLineas);
	}
	public void setLblLineas() {
		this.LblLineas.setText("Linea");
	}
	public JLabel getLblOrigen() {
		return (this.LblOrigen);
	}
	public void setLblOrigen() {
		this.LblOrigen.setText("Origen"); 
	}
	public JLabel getLblDestino() {
		return (this.LblDestino);
	}
	public void setLblDestino() {
		this.LblDestino.setText("Destino");
	}
	public JLabel getLblIda() {
		return (this.LblIda);
	}
	public void setLblIda() {
		this.LblIda.setText("Ida");
	}
	public JLabel getLblVuelta() {
		return (this.LblVuelta);
	}
	public void setLblVuelta() {
		this.LblVuelta.setText("Vuelta");
	}
	public JLabel getLblPrecio() {
		return (this.LblPrecio);
	}
	public void setLblPrecio() {
		this.LblPrecio.setText("Precio");
	}
	public JButton getBtnPagar() {
		return (this.BtnPagar);
	}
	public void setBtnPagar() {
		this.BtnPagar.setText("Pagar");
	}
	public JTextField getTextField() {
		return (this.TextField);
	}
	public void setTextField() {
		this.TextField.setText("");
	}
	public JTextField getTextField_1() {
		return (this.TextField_1);
	}
	public void setTextField_1() {
		this.TextField_1.setText("");
	}
	public JTextField getTextField_2() {
		return (this.TextField_2);
	}
	public void setTextField_2() {
		this.TextField_2.setText("");
	}
	public JTextField getTextField_3() {
		return (this.TextField_3);
	}
	public void setTextField_3() {
		this.TextField_3.setText("");
	}
	public JTextField getTextField_4() {
		return (this.TextField_4);
	}
	public void setTextField_4() {
		this.TextField_4.setText("");
	}
	public JTextField getTextField_5() {
		return (this.TextField_5);
	}
	public void setTextField_5() {
		this.TextField_5.setText("");
	}
	
}