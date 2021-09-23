package dad.holamundo.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HolaMundo {

	public static void main(String[] args) {
		
		//creamos la etiqueta para mostrar el saludo
		JLabel saludoLabel = new JLabel ();
		saludoLabel.setText("Aqui saldra el saludo");
		saludoLabel.setBounds(20, 20, 120, 50);
		
		//creamos el boton para saludar
		JButton saludarButton = new JButton();
		saludarButton.setText("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		saludarButton.setToolTipText("Como me pulses te saludo");
		saludarButton.addActionListener(e ->saludoLabel.setText("Hola Mundo"));
		
		//panel (contenedor) que contiene etiqueta y boton
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		//ventana
		JFrame frame = new JFrame();
		frame.setTitle("Hola mundo con swing");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setContentPane(rootPanel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
	
				
	}

}
