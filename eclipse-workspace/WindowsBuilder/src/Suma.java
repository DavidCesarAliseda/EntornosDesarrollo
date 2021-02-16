import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Suma extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suma frame = new Suma();
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
	public Suma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el primer valor:");
		lblNewLabel.setBounds(40, 42, 144, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblIngreseElSegundo = new JLabel("Ingrese el segundo valor:");
		lblIngreseElSegundo.setBounds(40, 91, 144, 24);
		contentPane.add(lblIngreseElSegundo);
		
		textField = new JTextField();
		textField.setBounds(215, 44, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(215, 93, 86, 20);
		contentPane.add(textField_1);
		
		lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(335, 149, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sumar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1=Integer.parseInt(textField.getText());
	            int v2=Integer.parseInt(textField_1.getText());
	            int suma=v1+v2;
	            lblNewLabel_1.setText(String.valueOf(suma));
			}
		});
		btnNewButton.setBounds(215, 145, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
