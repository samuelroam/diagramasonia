/**
 * 
 */
package com.zubiri.almacen;

/**
 * @author xoni
 *
 */
public class Lechuga extends Producto implements Enviable {

	private boolean fresca;
	
	public Lechuga(Distribuidor distribuidor, String marca, Double precio, String procedencia, boolean fresca) {

		super(distribuidor,marca,precio,procedencia);
		this.fresca = fresca;
	}

	public boolean getFresca() {
		return fresca;
	}

	public void setFresca(boolean fresca) {
		this.fresca = fresca;
	}

	/**
	 * implementación del método de la interface Enviable
	 */
	public boolean esFragil(){
		return true;
	}

	@Override
	public void mostrarProducto() {
		
		
		System.out.println("LECHUGA:");
		super.mostrarProducto();
		if (this.fresca) {
			System.out.println("fresca");
		} else {
			System.out.println("envasada");
			
		}	
	}
}
