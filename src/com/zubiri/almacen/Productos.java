package com.zubiri.almacen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Productos {
	
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();	
	
	public Productos(Scanner sc) {

		System.out.println("Cuantos productos quieres insertar? ");
		int seleccion = sc.nextInt();
		for (int i = 0; i < seleccion; i++) {
			
			System.out.println("¿Qué producto quieres insertar?");
			System.out.println("MANZANA:--------1");
			System.out.println("LECHE:----------2");
			System.out.println("LECHUGA:--------3");
		    
			switch(sc.nextInt()) {
				case 1:
					Manzana manzana = new Manzana(sc);
					listaProductos.add(manzana);
					break;
				case 2:
					Leche leche = new Leche(sc);
					listaProductos.add(leche);

			/*
					System.out.println("¿Contiene lactosa?(SI-NO):");
					switch(sc.next()) {
						case "SI":
							leche.setLactosa(true));
							break;
						case "NO":
							leche.setLactosa(false));
							break;
					}
					System.out.println("¿Es entera?(SI-NO):");
					switch(sc.next()) {
					case "SI":
						leche.setEntera(true);
						break;
					case "NO":
						leche.setEntera(false);
						break;
					}
					*/
					break;
				case 3:
					Lechuga lechuga = new Lechuga(sc);
					listaProductos.add(lechuga);

					/*
					System.out.println("¿Es fresca?(SI-NO):");
					switch(sc.next()) {
						case "SI":
							lechuga.setFresca(true);
							break;
						case "NO":
							lechuga.setFresca(false);
							break;
						default:
							System.out.println("No ha seleccionado la opción correcta");
						}
						*/
					break;
				default:
					System.out.println("No ha insertado la opción correcta.");
					break;
			}			
		}
	} 
		 
	public void mostrarProductos() {
		
		if (listaProductos.size() == 0) {
			System.out.println("No se han cargado los productos");
		}
		for (int i = 0;i < listaProductos.size();i++) {
			Producto producto = listaProductos.get(i);
			producto.mostrarProducto(); //dispatching dinámico a partir de polimorfismo
		}
	}

}
