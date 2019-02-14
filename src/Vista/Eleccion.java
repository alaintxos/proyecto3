package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Choice;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;



import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;

public class Eleccion extends JPanel {
	private JButton btnaceptar;
	private static JComboBox comboOrigen = new JComboBox();
	private static JComboBox comboDestino = new JComboBox();
	private static JComboBox comboLinea = new JComboBox();
	private JRadioButton rdbtnIdaYVuelta;
	private JDateChooser dateChooserida;
	private JDateChooser dateChooservuelta;
	/**
	 * Create the panel.
	 */
	public Eleccion() {
		setLayout(null);

		comboOrigen.setModel(new DefaultComboBoxModel(new String[] { "Origen" }));
		comboOrigen.setToolTipText("");
		comboOrigen.setBounds(46, 87, 70, 20);
		add(comboOrigen);

		comboDestino = new JComboBox();
		comboDestino.setModel(new DefaultComboBoxModel(new String[] { "Destino" }));
		comboDestino.setBounds(46, 165, 70, 20);
		add(comboDestino);

		btnaceptar = new JButton("Aceptar");
		btnaceptar.setBounds(268, 86, 89, 23);
		add(btnaceptar);
		
		comboLinea.setModel(new DefaultComboBoxModel(new String[] { "Lineas" }));
		comboLinea.setToolTipText("");
		comboLinea.setBounds(149, 30, 109, 22);
		add(comboLinea);
		
		dateChooserida = new JDateChooser();
		dateChooserida.setBounds(46, 212, 105, 22);
		add(dateChooserida);
		
		dateChooservuelta = new JDateChooser();
		dateChooservuelta.setBounds(282, 212, 105, 22);
		add(dateChooservuelta);
		
		rdbtnIdaYVuelta = new JRadioButton("ida y vuelta");
		rdbtnIdaYVuelta.setBounds(265, 164, 109, 23);
		add(rdbtnIdaYVuelta);

	}
		public JButton getbtnaceptar() {
			return (this.btnaceptar);
		}
		public void setbtnaceptar() {
			this.btnaceptar.setText("Aceptar");
		}
		public JRadioButton getrdbtnIdaYVuelta() {
			return (this.rdbtnIdaYVuelta);
		}
		public void setrdbtnIdaYVuelta() {
			this.rdbtnIdaYVuelta.setText("IDA Y VUELTA");
		}
		public JComboBox getcomboOrigen() {
			return (this.comboOrigen);
		}
		public void setcomboOrigen() {
			this.comboOrigen.setToolTipText("Origen");
		}
		public JComboBox getcomboLinea() {
			return (this.comboLinea);
		}
		public void setcomboLinea() {
			this.comboLinea.setToolTipText("");
		}
		public JComboBox getcomboDestino() {
			return (this.comboDestino);
		}
		public void setcomboDestino() {
			this.comboDestino.setToolTipText("Destino");
		}
		
		public JDateChooser getdateChooserida() {
			return (this.dateChooserida);
		}
		public void setdateChooserida() {
			this.dateChooserida = dateChooserida;
		}
		public JDateChooser getdateChooservuelta() {
			return (this.dateChooservuelta);
		}
		public void setdateChooservuelta() {
			this.dateChooservuelta = dateChooservuelta;
		}
}