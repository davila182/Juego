package test;

import logic.Shop;
import console.InputConsole;
public class TestConsole {
	
	public static void main(String[] args) throws Exception {
	System.out.println("----------------CASO DE PRUEBA 1 PRECIO UNITARIO 1890, CANTIDAD 2  DE UN ARTICULO----------------------");
	Shop object1 = new Shop(1890,1);
	object1.amounPayable();
	System.out.println("El total a pagar debe ser  (2192.4)");
	System.out.println("-------------------------------------------------------------");
    System.out.println("El total a pagar del articulo es: "+object1.getAmountPayable());	
	
	
	double object2 = InputConsole.inDouble("Ingrese el precio unitario del articulo: ");
	double object3 = InputConsole.inDouble("Ingrese la cantidad del articulo: ");

	
	
	object1 = new Shop(object2, object3);
	object1.amounPayable();
	System.out.println(String.valueOf("El total a pagar del articulo es: "+object1.getAmountPayable()));
		
	
	}
	
}

