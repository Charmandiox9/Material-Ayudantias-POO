package logica;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dominio.*;

public class App {
	
	public static void leerArchivo(Supermercado s) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("bodegas.txt"));
		
		while(scan.hasNextLine()) {
			String[] partes = scan.nextLine().split(",");
			String ciudad = partes[0];
			int capMax = Integer.parseInt(partes[1]);
			String id = partes[2];
			
			Bodega b = new Bodega(ciudad, capMax, id);
			s.agregarBodega(b);
		}
		scan.close();
		
		scan = new Scanner(new File("inventario.txt"));
		
		while(scan.hasNextLine()) {
			String[] partes = scan.nextLine().split(",");
			String bodega = partes[0];
			String tipo = partes[1];
			String nombre = partes[2];
			double precio = Double.parseDouble(partes[3]);
			int stock = Integer.parseInt(partes[4]);
			
			switch(tipo) {
				case "ELECTRODOMESTICO":
					int mg = Integer.parseInt(partes[5]);
					double ee = Double.parseDouble(partes[6]);
					for(int i = 0; i < s.getBodegas().length; i++) {
						for(int j = 0; j < s.getBodegas()[0].length; j++) {
							if(s.getBodegas()[i][j] != null && s.getBodegas()[i][j].getId().equals(bodega)) {
								s.getBodegas()[i][j].agregarProdcuto(new Electrodomestico(nombre, precio, stock, mg, ee));
								break;
							}
						}
					}
					break;
					
				case "ALIMENTO":
					String fv = partes[5];
					String c = partes[6];
					for(int i = 0; i < s.getBodegas().length; i++) {
						for(int j = 0; j < s.getBodegas()[0].length; j++) {
							if(s.getBodegas()[i][j] != null && s.getBodegas()[i][j].getId().equals(bodega)) {
								s.getBodegas()[i][j].agregarProdcuto(new Alimento(nombre, precio, stock, fv, c));
								break;
							}
						}
					}
					break;
					
				case "ROPA":
					int t = Integer.parseInt(partes[5]);
					String m = partes[6];
					for(int i = 0; i < s.getBodegas().length; i++) {
						for(int j = 0; j < s.getBodegas()[0].length; j++) {
							if(s.getBodegas()[i][j] != null && s.getBodegas()[i][j].getId().equals(bodega)) {
								s.getBodegas()[i][j].agregarProdcuto(new Ropa(nombre, precio, stock, t, m));
								break;
							}
						}
					}
					break;
			}
		}
		scan.close();
		mostrarMenu(s);
	}
	
	public static void mostrarMenu(Supermercado s) {
		int opcion;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("==== SISTEMA SUPERMERCADO VIRTUAL ====");
			System.out.println("1. Mostrar inventario completo");
			System.out.println("2. Buscar productos por bodega");
			System.out.println("3. Agregar nuevo producto");
			System.out.println("4. Buscar por tipo de producto");
			System.out.println("5. Eliminar producto");
			System.out.println("6. Estadísticas generales");
			System.out.println("0. Salir");
			System.out.print("Opción: ");
			opcion = scan.nextInt();
			scan.hasNextLine();
			
			switch(opcion) {
				case 1:
					System.out.println("---Mostrar Inventario Completo---");
					mostrarInventarioCompleto(s);
					break;
				case 2:
					System.out.println("---Buscar productos por bodega---");
					mostrarProductosPorBodega(s);
					break;
				case 3:
					System.out.println("---Agregar nuevo producto---");
					mostrarInventarioCompleto(s);
					break;
				case 4:
					System.out.println("---Buscar por tipo de producto---");
					mostrarProductosPorTipo(s);
					break;
				case 5:
					System.out.println("---Eliminar producto---");
					eliminarProducto(s);
					break;
				case 6:
					System.out.println("---Estadísticas generales---");
					mostrarEstadisticasGenerales(s);
					break;
				case 0:
					System.out.println("Hsta luego :D");
			}
			
			
		} while(opcion != 0);
	}
	
	public static void mostrarInventarioCompleto(Supermercado s) {
		for(int i = 0; i < s.getBodegas().length; i++) {
			for(int j = 0; j < s.getBodegas()[0].length; j++) {
				if(s.getBodegas()[i][j] != null) {
					for(Producto p: s.getBodegas()[i][j].getProductos()) {
						System.out.println(p.mostrarInfo());
						System.out.println();
					}
				}
			}
		}
	}
	
	public static void mostrarProductosPorBodega(Supermercado s) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese el nombre de la bodgea: ");
		String bodega = scan.nextLine();
		
		for(int i = 0; i < s.getBodegas().length; i++) {
			for(int j = 0; j < s.getBodegas()[0].length; j++) {
				if(s.getBodegas()[i][j] != null && s.getBodegas()[i][j].getId().equals(bodega)) {
					for(Producto p: s.getBodegas()[i][j].getProductos()) {
						System.out.println(p.mostrarInfo());
						System.out.println();
					}
					break;
				}
			}
		}
	}
	
	public static void mostrarProductosPorTipo(Supermercado s) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese el tipo de productos a bsucar: ");
		String tipo = scan.nextLine();
		
		for(int i = 0; i < s.getBodegas().length; i++) {
			for(int j = 0; j < s.getBodegas()[0].length; j++) {
				if(s.getBodegas()[i][j] != null) {
					for(Producto p: s.getBodegas()[i][j].getProductos()) {
						if(p.getClass().getSimpleName().equals(tipo)) {
							System.out.println(p.mostrarInfo());
							System.out.println();
						}
					}
					break;
				}
			}
		}
		
	}
	
	public static void eliminarProducto(Supermercado s) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese el nombre del producto a eliminar: ");
		String producto = scan.nextLine();
		
		for(int i = 0; i < s.getBodegas().length; i++) {
			for(int j = 0; j < s.getBodegas()[0].length; j++) {
				if(s.getBodegas()[i][j] != null) {
					for(Producto p: s.getBodegas()[i][j].getProductos()) {
						if(p.getNombre().equals(producto)) {
							s.getBodegas()[i][j].getProductos().remove(p);
							break;
						}
					}
				}
			}
		}
		
	}
	
	public static void mostrarEstadisticasGenerales(Supermercado s) {
		double mayorPrecio = Double.MIN_VALUE;
		Producto productoMayorPrecio = null;
		int menorStock = Integer.MAX_VALUE;
		Producto productoMenorStock = null;
		double mayorPrecioEspecial = Double.MIN_VALUE;
		Producto productoMayorPrecioEspecial = null;
		
		for(int i = 0; i < s.getBodegas().length; i++) {
			for(int j = 0; j < s.getBodegas()[0].length; j++) {
				if(s.getBodegas()[i][j] != null) {
					for(Producto p: s.getBodegas()[i][j].getProductos()) {
						if(p.getPrecio() > mayorPrecio) {
							mayorPrecio = p.getPrecio();
							productoMayorPrecio = p;
						}
						
						if(p.getStock() < menorStock) {
							menorStock = p.getStock();
							productoMenorStock = p;
						}
						
						if(p.calcularPrecioEspecial() > mayorPrecioEspecial) {
							mayorPrecioEspecial = p.calcularPrecioEspecial();
							productoMayorPrecioEspecial = p;
						}
						
						
					}
				}
			}
		}
		
		System.out.println("Producto con mayor precio: " + productoMayorPrecio.mostrarInfo());
		System.out.println("\nProducto con menor stock: " + productoMenorStock.mostrarInfo());
		System.out.println("\nProducto con mayor precio especial: " + productoMayorPrecioEspecial.mostrarInfo());
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Supermercado s = new Supermercado("Paulinho");
		
		leerArchivo(s);
	}

}
