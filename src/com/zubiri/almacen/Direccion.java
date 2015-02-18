/**
 * 
 */
package com.zubiri.almacen;

/**
 * @author xoni
 *
 */
public class Direccion {

	private TipoCalle tipo;
	private String nombreCalle;
	private int portal;
	private String escalera;
	private int piso;
	private char letra;
	 
	/**
	 * 
	 */
	public Direccion() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor que recibe en forma de String las propiedades separadas entre sí por el caracter ';'.
	 */

	public Direccion(String formattedDireccion) {
		
		String[] strArray = formattedDireccion.split(";");
		
		switch (strArray[0]) {
		case "CALLE":
			this.setTipo(TipoCalle.CALLE);
			break;
		case "AVENIDA":
			this.setTipo(TipoCalle.AVENIDA);
			break;
		case "CAMINO":
			this.setTipo(TipoCalle.CAMINO);
			break;
		case "PLAZA":
			this.setTipo(TipoCalle.PLAZA);
			break;
		case "BOULEVARD":
			this.setTipo(TipoCalle.BOULEVARD);
			break;
		default:
			System.out.println("No existe el tipo de calle especificado");
			System.exit(-1);
		}
		
		this.setNombreCalle(strArray[1]);
		this.setPortal(Integer.parseInt(strArray[2]));
		this.setEscalera(strArray[3]);
		this.setPiso(Integer.parseInt(strArray[4]));
		this.setLetra(strArray[5].charAt(0));
	}
	
	public TipoCalle getTipo() {
		return tipo;
	}

	public void setTipo(TipoCalle tipo) {
		this.tipo = tipo;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public int getPortal() {
		return portal;
	}

	public void setPortal(int portal) {
		this.portal = portal;
	}

	public String getEscalera() {
		return escalera;
	}

	public void setEscalera(String escalera) {
		this.escalera = escalera;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	public String formattedDireccion() {
		
		String formattedDireccion = 
		"DIRECCION:\n" +
		this.tipo.toString() + " " + 
		this.nombreCalle + " " + 
		this.portal + " " +
		this.escalera + " " + 
		this.piso + " " +
		this.letra;
		
		return formattedDireccion;
	}
}
