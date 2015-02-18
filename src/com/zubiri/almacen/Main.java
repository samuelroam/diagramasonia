package com.zubiri.almacen;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException,UnsupportedEncodingException {
	
		int seleccion;
		Scanner sc = new Scanner(System.in);
		Productos productos = null;
		
    	//Leemos la lista de distribuidores del fichero.
		Distribuidores.leerDistribuidores("./almacen/distribuidores.txt");

		do {
			
			//Visualiza por terminal (stdout) las opciones del menú
			System.out.println("Mostrar distribuidores---------------------------1");
			System.out.println("Solicitar productos------------------------------2");
			System.out.println("Mostrar productos--------------------------------3");
			System.out.println("SALIR DEL PROGRAMA-------------------------------4");
			   
			seleccion = sc.nextInt();
			switch (seleccion) {
				
				case 1: //Mostrar distribuidores
					Distribuidores.mostrarDistribuidores();
					break;
					
				case 2: //Solicitar productos
					productos = new Productos(sc);
					break;
				case 3: //Mostrar productos
					if (productos == null) {
						System.out.println("No es posible mostrar productos sin haber sido solicitados");
					}
					productos.mostrarProductos();
					break;
				default:
					System.out.println("No ha insertado la opción correcta");
			}
		} while (seleccion != 4);
		sc.close();
	}

}
