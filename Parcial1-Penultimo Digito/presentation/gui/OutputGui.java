package gui;

import javax.swing.JOptionPane;

public class OutputGui {
	public static void print(double value){
		String valueStr = String.valueOf(value);
		JOptionPane.showMessageDialog(null, "El total a pagar del articulo es: "+valueStr);
	}
	
	
}
