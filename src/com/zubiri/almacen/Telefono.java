/**
 * 
 */
package com.zubiri.almacen;

/**
 * @author xoni
 *
 */
public class Telefono {
	
	private TipoTelefono tipo;
    private int codInternacional;
    private int codNacional = -1;
    private int digitos9;

	/**
	 * 
	 */
	public Telefono() {

	}

	/**
	 * Constructor que recibe en forma de String las propiedades separadas entre sí por el caracter '*'.
	 */
	public Telefono(String formattedTelefono) {
		
		String[] strArray = formattedTelefono.split("*");
		switch (strArray[0]) {	
			case "MOVIL":
				this.tipo = TipoTelefono.MOVIL;
				break;
			case "FIJO":
				this.tipo = TipoTelefono.FIJO;
				break;
			default:
				System.out.println("No existe el tipo de teléfono especificado");
				System.exit(-1);
				break;
		}
		this.codInternacional = Integer.parseInt(strArray[1]);
		this.codNacional = Integer.parseInt(strArray[2]);
		this.digitos9 = Integer.parseInt(strArray[3]);
		
	}

	/**
	 * 
	 */
	public TipoTelefono getTipo() {
		return tipo;
	}

	/**
	 * 
	 */
	public void setTipo(TipoTelefono tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 */
	public int getCodInternacional() {
		return codInternacional;
	}

	/**
	 * 
	 */
	public void setCodInternacional(int codInternacional) {
		this.codInternacional = codInternacional;
	}

	/**
	 * 
	 */
	public int getCodNacional() {
		return codNacional;
	}

	/**
	 * 
	 */
	public void setCodNacional(int codNacional) {
		this.codNacional = codNacional;
	}

	/**
	 * 
	 */
	public int getDigitos9() {
		return digitos9;
	}

	/**
	 * 
	 */
	public void setDigitos9(int digitos9) {
		this.digitos9 = digitos9;
	}

	public String formattedTelefono() {
		
		String strTelefono = null;
		
		if (this.tipo == TipoTelefono.MOVIL) {
			strTelefono = 
			"TELEFONO " + this.tipo + ":\n" +
			"(+" + this.codInternacional + ")" + 
			this.digitos9;
		} else {
			strTelefono = 
			"TELEFONO " + this.tipo + ":\n" +
			"(" + this.codNacional + ")" + 
			this.digitos9;
		}
		
		return strTelefono;
	}
}
