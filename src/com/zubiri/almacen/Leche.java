/**
 * 
 */
package com.zubiri.almacen;

import java.util.Scanner;

/**
 * @author xoni
 *
 */
public class Leche extends Producto  implements Enviable{

	private boolean lactosa;
	private boolean entera;

	
	/**
	 * 
	 */
	public Leche(Distribuidor distribuidor, String marca, Double precio, String procedencia, boolean lactosa, boolean entera) {

		super(distribuidor,marca,precio,procedencia);
		this.lactosa = lactosa;
		this.entera = entera;
	}

	public Leche(Scanner sc) {

		super(sc);
		/*
		System.out.println("Tipo de manzana (DELICIOUS-GOLDEN-RED):");
		this.setTipo(sc.next());
	    System.out.println("Color de la manzana:");
	    this.setColor(sc.next());
		*/
	}

	public boolean getLactosa() {
		return this.lactosa;
	}


	public void setLactosa(boolean lactosa) {
		this.lactosa = lactosa;
	}

	public boolean getEntera() {
		return this.entera;
	}


	public void setEntera(boolean entera) {
		this.entera = entera;
	}

	public boolean esFragil() {
		return false;
	}
	
	@Override
	public void mostrarProducto() {
			
		System.out.println("LECHE:");
		super.mostrarProducto();
		if (this.entera) {
			System.out.println("entera");
		} else {
			System.out.println("desnatada");
		}	
		if (this.lactosa) {
			System.out.println("con lactosa");
		} else {
			System.out.println("sin lactosa");			
		}	
	}

}
