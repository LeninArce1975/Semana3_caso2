package caso2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtNum;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese número");
			lblNewLabel.setBounds(21, 25, 88, 13);
			contentPane.add(lblNewLabel);
		}
		{
			txtNum = new JTextField();
			txtNum.setBounds(119, 22, 96, 19);
			contentPane.add(txtNum);
			txtNum.setColumns(10);
		}
		{
			btnNewButton = new JButton("Celsius a Fahrenheit");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(0, 66, 141, 21);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Kilómetros a millas");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(136, 66, 141, 21);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Segundos a minutos-segundis");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(278, 66, 158, 21);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 115, 416, 99);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	try {
		double num=Double.parseDouble(txtNum.getText());
		Conversor c=new Conversor(num);
		txtS.setText("");
		txtS.append("De Celsius a Fahrenheit es: "+c.Convertir(num));
	} catch (Exception e2) {
		mostrarError();
	}
	}
	private void mostrarError() {
		JOptionPane.showMessageDialog(this, "Ingrese números válidos");
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
			int num=Integer.parseInt(txtNum.getText());			
			Conversor c=new Conversor(num);
			txtS.setText("");
			txtS.append("De kilometros a millas es: "+c.Convertir(num));
		} catch (Exception e2) {
			mostrarError();
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		try {
			int num=Integer.parseInt(txtNum.getText());			
			Conversor c=new Conversor(num, true);
			txtS.setText("");
			txtS.append("De segundos a minutos-segundos es: "+c.Convertir(num, true));
		} catch (Exception e2) {
			mostrarError();
		}
	}
}
