import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Menu extends JFrame {

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
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Culculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 584, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cambiar color");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Rojo");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.red);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Verde");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.green);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Azul");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.blue);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Amarillo");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.yellow);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Grey");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.gray);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JLabel lblNewLabel = new JLabel("Introduzca el primer valor:");
		lblNewLabel.setBounds(50, 47, 191, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblIntroduzcaElSegundo = new JLabel("Introduzca el segundo valor:");
		lblIntroduzcaElSegundo.setBounds(50, 111, 191, 22);
		contentPane.add(lblIntroduzcaElSegundo);
		
		textField = new JTextField();
		textField.setBounds(241, 48, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(241, 112, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Suma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1=Integer.parseInt(textField.getText());
	            int v2=Integer.parseInt(textField_1.getText());
	            int suma=v1+v2;
	            lblNewLabel_1.setText(String.valueOf(suma));
			}
		});
		btnNewButton.setBounds(50, 189, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1=Integer.parseInt(textField.getText());
	            int v2=Integer.parseInt(textField_1.getText());
	            int resta=v1-v2;
	            lblNewLabel_1.setText(String.valueOf(resta));
			}
		});
		btnResta.setBounds(175, 189, 89, 23);
		contentPane.add(btnResta);
		
		JButton btnMultiplicacin = new JButton("Multiplicaci\u00F3n");
		btnMultiplicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1=Integer.parseInt(textField.getText());
	            int v2=Integer.parseInt(textField_1.getText());
	            int mult=v1*v2;
	            lblNewLabel_1.setText(String.valueOf(mult));
			}
		});
		btnMultiplicacin.setBounds(298, 189, 117, 23);
		contentPane.add(btnMultiplicacin);
		
		JButton btnDivisin = new JButton("Divisi\u00F3n");
		btnDivisin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double v1=Integer.parseInt(textField.getText());
	            double v2=Integer.parseInt(textField_1.getText());
	            double div=v1/v2;
	            lblNewLabel_1.setText(String.valueOf(div));
			}
		});
		btnDivisin.setBounds(444, 189, 100, 23);
		contentPane.add(btnDivisin);
		
		lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(424, 83, 66, 22);
		contentPane.add(lblNewLabel_1);
	}
}
