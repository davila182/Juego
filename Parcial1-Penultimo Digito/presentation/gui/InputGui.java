package gui;

import javax.swing.JOptionPane;

public class InputGui {
	public static double inDouble(String message){
		double result = 0;
		String valueStr = JOptionPane.showInputDialog(null, message);
		try {
			result = Double.parseDouble(valueStr);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No corresponde a un número valido", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return result;
	}

	
}