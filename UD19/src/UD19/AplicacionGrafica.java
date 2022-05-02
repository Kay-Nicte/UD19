package UD19;
import javax.swing.*;

public class AplicacionGrafica extends JFrame {
	
	/*
	 * Panel de la aplicaci�n
	 */
	
	private static final String EXIT_ON_CLOSE = null;
	private JPanel contentPane;
	
	public AplicacionGrafica(JTextField textField) {
		
		//A�ade un t�tulo. No es estrictamente necesario
		setTitle("T�tulo de la ventana.");
		
		/*Coordenadas x y de la aplicaci�n y su altura y longitud,
		 * si no lo indicamos aparecer� una ventana muy peque�a.
		 */
		
		setBounds(400, 200, 250, 300);
		
		/*
		 * Indica que cuando se cierre la ventana se acaba la aplicaci�n, 
		 * si no lo indicamos cuando cerremos la ventana la aplicaci�n seguir� 
		 * funcionando
		 */
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Hace visible la ventana, si no lo hacemos no veremos la aplicaci�n 
		setVisible(true);
		
		//Creamos el panel
		contentPane = new JPanel();
		
		//Indicamos su dise�o
		contentPane.setLayout(null);
		
		//Asigno el panel a la ventana
		setContentPane(contentPane);
		
		
		//Creaci�n de componentes
		
		//Creo el componente
		JLabel etiqueta = new JLabel("�Hola Mundo!");
		textField = new JTextField();
		JButton btnPulsame = new JButton("Pulsame");
		
		//Colocamos el componente
		etiqueta.setBounds(60, 20, 100, 20);
		textField.setBounds	(43, 67, 86, 26);
		btnPulsame.setBounds(43, 133, 89, 23);

		//A�adimos el elemento al panel, si no, no se ver�
		contentPane.add(etiqueta);
		contentPane.add(textField);
		contentPane.add(btnPulsame);
	}
}