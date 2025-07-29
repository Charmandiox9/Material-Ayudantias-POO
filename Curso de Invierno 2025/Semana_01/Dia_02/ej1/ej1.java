package ej1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ej1 {
	static Producto[] productos = new Producto[10];
	
	
	public static void leerArchivo() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("productos.txt"));
		int contador = 0;
		
		while(scan.hasNextLine()) {
			String[] partes = scan.nextLine().split(",");
			String nombre = partes[0];
			double precio = Double.parseDouble(partes[1]);
			int stock = Integer.parseInt(partes[2]);
			
			productos[contador++] = new Producto(nombre, precio, stock);
		}
		
		mostrarResumen(contador);
		scan.close();
	}
	
	public static void mostrarResumen(int contador) {
		double proMasCaro = Integer.MIN_VALUE;
		String proMasCaroN = "";
		int proMasStock = Integer.MIN_VALUE;
		String proMasStockN = "";
		int cantProductos = 0;
		double valorTotalInventario = 0;
		
		for(int i = 0; i < productos.length; i++) {
			if(productos[i] != null) {
				cantProductos++;
				valorTotalInventario += productos[i].getPrecio() * productos[i].getStock();
				if(productos[i].getPrecio() > proMasCaro) {
					proMasCaro = productos[i].getPrecio();
					proMasCaroN = productos[i].getNombre();
				}
				
				if(productos[i].getStock() > proMasStock) {
					proMasStock = productos[i].getStock();
					proMasStockN = productos[i].getNombre();
				}
			}
		}
		
		System.out.println("---RESUMEN INVENTARIO---");
		System.out.println("Total de productos únicos: " + cantProductos);
		System.out.println("Valor total del inventario: " + valorTotalInventario);
		System.out.println("Producto mas caro: " + proMasCaroN + " (" + proMasCaro + ")");
		System.out.println("Producto con mayor stock: " + proMasStockN + " (" + proMasStock + ")");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		leerArchivo();
	}
}
