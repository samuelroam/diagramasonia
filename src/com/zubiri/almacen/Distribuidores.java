/**
 * 
 */
package com.zubiri.almacen;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.UnsupportedEncodingException;
/**
 * @author xoni
 *
 */
public class Distribuidores {
	
	private static ArrayList<Distribuidor> listaDistribuidores = new ArrayList<Distribuidor>();	
	
	/**
	 * 
	 */
	private Distribuidores() {
		// TODO Auto-generated constructor stub
	}

	public static void leerDistribuidores(String fichero) throws IOException {
			String linea;
			FileInputStream f;
		    InputStreamReader fr;
		    BufferedReader br;
		    
		    f = new FileInputStream(fichero);
	    	fr = new InputStreamReader(f, "UTF8");
	    	br = new BufferedReader(fr);
	    	linea = br.readLine();
			
			if (linea == null) {
				System.out.println("No existen distribuidores en el fichero");
			}
			
			while(linea != null) {
				Distribuidor distribuidor = new Distribuidor(linea);
				listaDistribuidores.add(distribuidor);
			}
			br.close();
	 }
	 
	 public static Distribuidor buscarDistribuidor(String nombre) {
		
		int i = 0;
		Distribuidor distribuidor = null;
	
		do {			
		
			if ((distribuidor != null) && (listaDistribuidores.get(i).getNombre().equalsIgnoreCase(nombre))) {
				distribuidor = (Distribuidor)listaDistribuidores.get(i);
			}
			i++;
		} while ((distribuidor == null) && (i < listaDistribuidores.size()));

		return distribuidor;
	}
	 
	public static void mostrarDistribuidores() {
		
		if (listaDistribuidores.size() == 0) {
			System.out.println("No se han cargado los distribuidores del fichero");
		}
		for (int i = 0;i < listaDistribuidores.size();i++) {
			System.out.println(listaDistribuidores.get(i).formattedDistribuidor());
		}
	}
}
