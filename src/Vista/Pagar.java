package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Pagar extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblTotalAPagar;
	private JLabel lblPagado;
	private JLabel lblADevolver;
	private JButton btn50euro;
	private JButton btn20euro;
	private JButton btn10euro;
	private JButton btn5euro;
	private JButton btn2euro;
	private JButton btn1euro;
	private JButton btnDevolver;
	private JButton btnCancelar;
	private JButton btncnt;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	
	/**
	 * Create the panel.
	 */
	public Pagar() {
		setLayout(null);
		
		lblTotalAPagar = new JLabel("Total a pagar:");
		lblTotalAPagar.setBounds(33, 42, 95, 16);
		add(lblTotalAPagar);
		
		textField = new JTextField();
		textField.setBounds(160, 39, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		lblPagado = new JLabel("Total Introducido :");
		lblPagado.setBounds(12, 71, 116, 16);
		add(lblPagado);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 68, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblADevolver = new JLabel("A devolver :");
		lblADevolver.setBounds(33, 101, 95, 16);
		add(lblADevolver);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 98, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		btn50euro = new JButton("50\u20AC");
		btn50euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn50euro.setBounds(33, 143, 95, 25);
		add(btn50euro);
		
		btn20euro = new JButton("20\u20AC");
		btn20euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn20euro.setBounds(147, 143, 95, 25);
		add(btn20euro);
		
		btn10euro = new JButton("10 \u20AC");
		btn10euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn10euro.setBounds(255, 143, 95, 25);
		add(btn10euro);
		
		btn5euro = new JButton("5\u20AC");
		btn5euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5euro.setBounds(33, 181, 95, 25);
		add(btn5euro);
		
		btn2euro = new JButton("2\u20AC");
		btn2euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2euro.setBounds(147, 181, 95, 25);
		add(btn2euro);
		
		btn1euro = new JButton("1\u20AC");
		btn1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1euro.setBounds(255, 181, 95, 25);
		add(btn1euro);
		
		btnDevolver = new JButton("Devolver");
		btnDevolver.setBounds(309, 219, 97, 25);
		add(btnDevolver);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(33, 219, 97, 25);
		add(btnCancelar);
		
		btncnt = new JButton("50cnt");
		btncnt.setBackground(new Color(160, 82, 45));
		btncnt.setBounds(90, 142, 75, 25);
		add(btncnt);
		
		btnNewButton_1 = new JButton("20cnt");
		btnNewButton_1.setBackground(new Color(160, 82, 45));
		btnNewButton_1.setBounds(187, 142, 75, 25);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("10cnt");
		btnNewButton_2.setBackground(new Color(160, 82, 45));
		btnNewButton_2.setBounds(284, 142, 75, 25);
		add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("5cnt");
		btnNewButton_3.setBackground(new Color(233, 150, 122));
		btnNewButton_3.setBounds(90, 178, 75, 25);
		add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("2cnt");
		btnNewButton_4.setBackground(new Color(233, 150, 122));
		btnNewButton_4.setBounds(187, 178, 75, 25);
		add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("1cnt");
		btnNewButton_5.setBackground(new Color(233, 150, 122));
		btnNewButton_5.setBounds(284, 178, 75, 25);
		add(btnNewButton_5);

	}

	public JTextField gettextField() {
		return (this.textField);
	}

	public void settextField() {
		this.textField.setText("");
	}

	public JTextField gettextField_1() {
		return (this.textField_1);
	}

	public void settextField_1() {
		this.textField_1.setText("");
	}

	public JTextField gettextField_2() {
		return (this.textField_2);
	}

	public void settextField_2() {
		this.textField_2.setText("");
	}

	public JLabel getlblTotalAPagar() {
		return (this.lblTotalAPagar);
	}

	public void setlblTotalAPagar() {
		this.lblTotalAPagar.setText("Total A Pagar");
	}

	public JLabel getlblPagado() {
		return (this.lblPagado);
	}

	public void setlblPagado() {
		this.lblPagado.setText("Pagado");
	}

	public JLabel getlblADevolver() {
		return (this.lblADevolver);
	}

	public void setlblADevolver() {
		this.lblADevolver.setText("A Devolver");
	}

	public JButton getbtn50euro() {
		return (this.btn50euro);
	}

	public void setbtn50euro() {
		this.btn50euro.setText("50€");
	}

	public JButton getbtn20euro() {
		return (this.btn20euro);
	}

	public void setbtn20euro() {
		this.btn20euro.setText("20€");
	}

	public JButton getbtn10euro() {
		return (this.btn10euro);
	}

	public void setbtn10euro() {
		this.btn10euro.setText("10€");
	}

	public JButton getbtn5euro() {
		return (this.btn5euro);
	}

	public void setbtn5euro() {
		this.btn5euro.setText("5€");
	}

	public JButton getbtn2euro() {
		return (this.btn2euro);
	}

	public void setbtn2euro() {
		this.btn2euro.setText("2€");
	}

	public JButton getbtn1euro() {
		return (this.btn1euro);
	}

	public void setbtn1euro() {
		this.btn1euro.setText("1€");
	}

	public JButton getbtnDevolver() {
		return (this.btnDevolver);
	}

	public void setbtnDevolver() {
		this.btnDevolver.setText("Devolver");
	}

	public JButton getbtnCancelar() {
		return (this.btnCancelar);
	}

	public void setbtnCancelar() {
		this.btnCancelar.setText("Cancelar");
	}
	
}