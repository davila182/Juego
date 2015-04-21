package logic;

/**
 * 
 * Programacion 1
 * Parcial del penultimo digito del codigo(5)
 * Se hace la modelacion que permita ingresar el precio unitario, la cantidad, el iva de un articulo 
 * y que permita mostrar el total a pagar del articulo que el cliente escogio(se tendra en cuenta 
 * el iva del producto)
 * @author Daniel Stevenson Avila Rios Cod:201420954
 *
 */

public class Shop {
	/**
	 * Indica el precio unitario del articulo 
	 */
	private double unitPrice;
	/**
	 * Indica la cantidad del articulo articulo 
	 */
	private double quantity;
	/**
	 * Inidca el iva=16% del arituclo
	 */
	private double iva;
	/**
	 * Indica el total a pagar del articulo
	 */
	private double amountPayable;

	
	public Shop(double unitPrice,double quantity){
		this.unitPrice=unitPrice;
		this.quantity=quantity;
		this.iva=16;
	}
	
	public  void amounPayable(){
		double auxAmountpayable=0;
		double auxIva=0;
		
		auxAmountpayable = (unitPrice*quantity);
		
		auxIva=((auxAmountpayable*iva)/100);
		
		
		
		amountPayable=auxAmountpayable+auxIva;
		
		
	
        
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the iva
	 */
	public double getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * @return the amountPayable
	 */
	public double getAmountPayable() {
		return amountPayable;
	}

	/**
	 * @param amountPayable the amountPayable to set
	 */
	public void setAmountPayable(double amountPayable) {
		this.amountPayable = amountPayable;
	}
	
	
	
	
}