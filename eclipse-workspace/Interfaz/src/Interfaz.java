import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtMisApellidos;
	private JTextField txtEdad;
	private JTextField txtMiNombre;
	private JLabel lblInformacin;
	private JLabel lblInformacin_1;
	private JLabel lblInformacin_2;
	private JLabel lblInformacin_3;
	private JLabel lblnombre;
	private JLabel lblapellidos;
	private JLabel lbledad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   Agregar Persona:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(0, 0, 131, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("   Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setBounds(0, 35, 131, 24);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("   Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellidos.setBounds(0, 73, 131, 24);
		contentPane.add(lblApellidos);
		
		JLabel lblEdad = new JLabel("   Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEdad.setBounds(0, 112, 131, 24);
		contentPane.add(lblEdad);
		
		txtMisApellidos = new JTextField();
		txtMisApellidos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMisApellidos.setText("Mis Apellidos");
		txtMisApellidos.setColumns(10);
		txtMisApellidos.setBounds(88, 73, 195, 27);
		contentPane.add(txtMisApellidos);
		
		txtEdad = new JTextField();
		txtEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEdad.setText("24");
		txtEdad.setColumns(10);
		txtEdad.setBounds(88, 110, 195, 27);
		contentPane.add(txtEdad);
		
		txtMiNombre = new JTextField();
		txtMiNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtMiNombre.setText("Mi Nombre");
		txtMiNombre.setColumns(10);
		txtMiNombre.setBounds(88, 35, 195, 27);
		contentPane.add(txtMiNombre);
		
		lblInformacin = new JLabel("   Informaci\u00F3n:");
		lblInformacin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInformacin.setBounds(0, 163, 131, 24);
		contentPane.add(lblInformacin);
		
		lblInformacin_1 = new JLabel("   Nombre:");
		lblInformacin_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInformacin_1.setBounds(0, 188, 131, 24);
		contentPane.add(lblInformacin_1);
		
		lblInformacin_2 = new JLabel("   Edad:");
		lblInformacin_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInformacin_2.setBounds(0, 236, 131, 24);
		contentPane.add(lblInformacin_2);
		
		lblInformacin_3 = new JLabel("   Apellidos:");
		lblInformacin_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInformacin_3.setBounds(0, 213, 131, 24);
		contentPane.add(lblInformacin_3);
		
		lblnombre = new JLabel("   Mi Nombre");
		lblnombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblnombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblnombre.setBounds(240, 188, 131, 24);
		contentPane.add(lblnombre);
		
		lblapellidos = new JLabel("   Mis Apellidos");
		lblapellidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblapellidos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblapellidos.setBounds(240, 213, 131, 24);
		contentPane.add(lblapellidos);
		
		lbledad = new JLabel("   24");
		lbledad.setHorizontalAlignment(SwingConstants.CENTER);
		lbledad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbledad.setBounds(240, 236, 131, 24);
		contentPane.add(lbledad);
		
		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nombre
				String nombre=txtMiNombre.getText();
				lblnombre.setText(String.valueOf(nombre));
				//Apellido
				String apellidos=txtMisApellidos.getText();
				lblapellidos.setText(String.valueOf(apellidos));
				//Edad
				int edad=Integer.parseInt(txtEdad.getText());
				lbledad.setText(String.valueOf(edad));
				//Lista
				
				
			}
		});
		btnAñadir.setBounds(293, 37, 113, 28);
		contentPane.add(btnAñadir);
		btnAñadir.setBorder(new Button (10)); 
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nombre
				String nombre="";
				lblnombre.setText(String.valueOf(nombre));
				//Apellido
				String apellidos="";
				lblapellidos.setText(String.valueOf(apellidos));
				//Edad
				
				lbledad.setText(String.valueOf(nombre));
			}
		});
		btnEliminar.setBounds(293, 117, 113, 19);
		contentPane.add(btnEliminar);
		btnEliminar.setBorder(new Button (10)); 
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 14));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mi Nombre"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(415, 11, 159, 249);
		contentPane.add(list);
	}
}
