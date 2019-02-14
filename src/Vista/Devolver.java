package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JButton;

public class Devolver extends JPanel {
	private JTextField textField;
	private JButton btnImprimirBillete;

	/**
	 * Create the panel.
	 */
	public Devolver() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaption);
		textField.setBounds(35, 49, 371, 203);
		add(textField);
		textField.setColumns(10);
		
		btnImprimirBillete = new JButton("Imprimir Billete");
		btnImprimirBillete.setBounds(265, 265, 152, 25);
		add(btnImprimirBillete);

	}

	public JTextField gettextField() {
		return (this.textField);
	}

	public void settextField() {
		this.textField.setText("");
	}

	public JButton getbtnImprimirBillete() {
		return (this.btnImprimirBillete);
	}

	public void setbtnImprimirBillete() {
		this.btnImprimirBillete.setText("Imprimir Billete");
	}
	
}
