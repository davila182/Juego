package test;


import logic.Shop;
import gui.InputGui;
import gui.OutputGui;

public class TestGui {

	public static void main(String[] args) {
		System.out.println("----------------PRUEBA 1. CASO DE PRUEBA PRECIO UNITARIO 1890, CANTIDAD 1 DEL ARTICULO---------------");
		Shop object4 = new Shop(1890,1);
		object4.amounPayable();;
		System.out.println("El total a pagar del articulo debe ser (2192.4 ");
		System.out.println("El total a pagar del producto es: "+ object4.getAmountPayable());
		System.out.println("-------------------------------------------------------------------------------------");
		
		
		double object5 = InputGui.inDouble("Ingrese el precio unitario del articulo: ");
		double object6 = InputGui.inDouble("Ingrese la cantidad del articulo: ");

		Shop object7 = new Shop(object5, object6);
		object7.amounPayable();
		OutputGui.print(object7.getAmountPayable());
	}

}