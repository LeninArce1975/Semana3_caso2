package caso3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTextField txtNom;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;

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
			lblNewLabel = new JLabel("Ingrese nombre");
			lblNewLabel.setBounds(20, 25, 107, 13);
			contentPane.add(lblNewLabel);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(287, 21, 85, 21);
			contentPane.add(btnNewButton);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(126, 22, 96, 19);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 121, 346, 99);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setText("Holitas");
				scrollPane.setViewportView(txtS);
			}
		}
		{
			lblNewLabel_1 = new JLabel("Verificando");
			lblNewLabel_1.setBounds(283, 70, 89, 13);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("abcdefg");
			lblNewLabel_2.setBounds(30, 56, 45, 13);
			contentPane.add(lblNewLabel_2);
		}
		{
			btnNewButton_1 = new JButton("Borrar");
			btnNewButton_1.setBounds(287, 52, 85, 21);
			contentPane.add(btnNewButton_1);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		if(txtNom.getText().trim().isEmpty()) 
			JOptionPane.showMessageDialog(this, "Ingrese nombre");
			
		else {
			String nom=txtNom.getText();
			Contador c=new Contador(nom);
			txtS.setText("");
			txtS.append("Hay "+c.Cantidad()+" nombres");
		}
	}
}
