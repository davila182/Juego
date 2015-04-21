package guiSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logic.Shop;


public class WindowShop extends JFrame {
	/**
	 * Etiqueta que indica el precio unitario del articulo
	 */
	private JLabel labelUnitprice;
	/**
	 * Etiqueta que indica la cantidad del articulo
	 */
	private JLabel labelQuantity;
	/**
	 * Etiqueta que indica el total a pagar del articulo
	 */
	private JLabel labelAmountpayable;
	/**
	 * Indica la caja de texto en la cual se digita el precio unitario del articulo
	 */
	private JTextField textUnitprice;
	/**
	 * Indica la caja de texto en la cual se digita la cantidad del articulo
	 */
	private JTextField textQuantity;
	/**
	 * Indica la caja de texto en la cual se da el total a pagar del articulo
	 */
	private JTextField textAmonutpayable;
	/**
	 *Indica el boton para calcular el total a pagardel articulo 
	 */
	private JButton buttonAmountpayable;
	/**
	 * Indica el color de la ventana
	 */
	private JPanel contentpane;
	
	

	
	
	public WindowShop() {
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setBackground(Color.cyan);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400 );
		setResizable(false);
		setTitle("SHOP");
		setLayout(null);
		
		
		labelUnitprice = new JLabel("Ingrese el precio unitario del articulo:");
		labelUnitprice.setBounds(20, 40, 300, 25);
		add(labelUnitprice);
		
		textUnitprice = new JTextField();
		textUnitprice.setBounds(250, 40, 100, 25);
		add(textUnitprice);
		
		
		labelQuantity = new JLabel("Ingrese la cantidad del articulo: ");
		labelQuantity.setBounds(20, 80, 300, 25);
		add(labelQuantity);
		
		textQuantity = new JTextField();
		textQuantity.setBounds(250, 80, 100, 25);
		add(textQuantity);
		
		
		labelAmountpayable = new JLabel("El total a pagar del producto es: ");
		labelAmountpayable.setBounds(20, 120, 300, 25);
		add(labelAmountpayable);
		
		textAmonutpayable= new JTextField();
		textAmonutpayable.setBounds(250, 120, 100, 25);
		add(textAmonutpayable);
		
		buttonAmountpayable = new JButton("TOTAL A PAGAR");
		buttonAmountpayable.setBounds(400, 20, 200, 100);
		buttonAmountpayable.addActionListener(new ActionListener() {
			
			

			public void actionPerformed(ActionEvent actionEvent) {
			
					try {
						amountPayable2();
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				
				}
			
		});
		add(buttonAmountpayable);

	}
	

	public void amountPayable2() throws Exception {
	
		double unitPrice = Double.parseDouble(textUnitprice.getText());	
		double quantity =  Double.parseDouble(textQuantity.getText());	
		
		Shop object8 = new Shop(unitPrice, quantity);
		object8.amounPayable();
		textAmonutpayable.setText(String.valueOf(object8.getAmountPayable()));
		
	}

}
