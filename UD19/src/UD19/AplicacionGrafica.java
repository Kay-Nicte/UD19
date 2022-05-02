package UD19;
import javax.swing.*;

public class AplicacionGrafica extends JFrame {
	
	/*
	 * Panel de la aplicación
	 */
	
	private static final String EXIT_ON_CLOSE = null;
	private JPanel contentPane;
	
	public AplicacionGrafica(JTextField textField) {
		
		//Añade un título. No es estrictamente necesario
		setTitle("Título de la ventana.");
		
		/*Coordenadas x y de la aplicación y su altura y longitud,
		 * si no lo indicamos aparecerá una ventana muy pequeña.
		 */
		
		setBounds(400, 200, 250, 300);
		
		/*
		 * Indica que cuando se cierre la ventana se acaba la aplicación, 
		 * si no lo indicamos cuando cerremos la ventana la aplicación seguirá 
		 * funcionando
		 */
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Hace visible la ventana, si no lo hacemos no veremos la aplicación 
		setVisible(true);
		
		//Creamos el panel
		contentPane = new JPanel();
		
		//Indicamos su diseño
		contentPane.setLayout(null);
		
		//Asigno el panel a la ventana
		setContentPane(contentPane);
		
		
		//Creación de componentes
		
		//Creo el componente
		JLabel etiqueta = new JLabel("¡Hola Mundo!");
		textField = new JTextField();
		JButton btnPulsame = new JButton("Pulsame");
		
		//Colocamos el componente
		etiqueta.setBounds(60, 20, 100, 20);
		textField.setBounds	(43, 67, 86, 26);
		btnPulsame.setBounds(43, 133, 89, 23);

		//Añadimos el elemento al panel, si no, no se verá
		contentPane.add(etiqueta);
		contentPane.add(textField);
		contentPane.add(btnPulsame);
	}
}