package logica;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Auto;
import dominio.Camion;
import dominio.Motocicleta;
import dominio.SistemaGestionImpl;
import dominio.Vehiculo;

public class App {
	static Scanner scan = new Scanner(System.in);
	
	public static void desplegarMenu(ISistemaGestion sistema) {
		int opcion;
		
		do {
			System.out.println("=== SISTEMA DE GESTIÓN DE VEHÍCULOS ===");
			System.out.println("1. Agregar vehículo");
			System.out.println("2. Mostrar vehículos disponibles");
			System.out.println("3. Alquilar vehículo");
			System.out.println("4. Devolver vehículo");
			System.out.println("5. Mostrar todos los vehículos");
			System.out.println("0. Salir");
			System.out.print("Ingrese su opción: ");
			opcion = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			switch(opcion) {
				case 1:
					sistema.agregarVehiculo(crearVehiculo());
					break;
				case 2:
					listarDisponibles(sistema.listarDisponibles());
					break;
				case 3:
					System.out.print("Ingrese la matricula del vehículo a alquilar: ");
					String matricula = scan.nextLine();
					System.out.println("Indique la cantidad de días: ");
					int cantDias = scan.nextInt();
					scan.nextLine();
					sistema.alquilarVehiculo(matricula, cantDias);
					break;
				case 4:
					System.out.print("Ingrese la matricula del vehículo a devolver: ");
					String matriculaa = scan.nextLine();
					sistema.devolverVehiculo(matriculaa);
					break;
				case 5:
					listarVehiculos(sistema.listarVehiculos());
			}
			
		} while(opcion != 0);
	}
	
	public static Vehiculo crearVehiculo() {
		Vehiculo v = null;
		
		System.out.print("Ingrese el tipo de vehículo: ");
		String tipo = scan.nextLine().toLowerCase();
		System.out.print("Ingrese la marca: ");
		String marca = scan.nextLine();
		System.out.print("Ingrese el modelo: ");
		String modelo = scan.nextLine();
		System.out.print("Ingrese la matricula: ");
		String matricula = scan.nextLine();
		System.out.print("Ingrese el año: ");
		int anio = scan.nextInt();
		scan.nextLine();
		System.out.print("Ingrese el kilometraje: ");
		double kilometraje = scan.nextDouble();
		scan.nextLine();
		
		switch(tipo) {
			case "auto":
				System.out.print("Ingrese el número de puertas: ");
				int np = scan.nextInt();
				scan.nextLine();
				System.out.print("Ingrese el tipo de combustible: ");
				String tc = scan.nextLine();
				v = new Auto(matricula, marca, modelo, anio, kilometraje, np, tc);
				break;
			case "motocicleta":
				System.out.print("Ingrese la cilindrada: ");
				int c = scan.nextInt();
				scan.nextLine();
				v = new Motocicleta(matricula, marca, modelo, anio, kilometraje, c);
				break;
			case "camion":
				System.out.print("Ingrese la capacidad de carga: ");
				double capacidad = scan.nextDouble();
				scan.nextLine();
				v = new Camion(matricula, marca, modelo, anio, kilometraje, capacidad);
				break;
		}
		
		return v;
	}
	
	public static void listarDisponibles(ArrayList<Vehiculo> disponibles) {
		for(Vehiculo v: disponibles) {
			System.out.println(v.mostrarInformacion());
			System.out.println();
		}
	}
	
	public static void listarVehiculos(ArrayList<Vehiculo> vehiculos) {
		for(Vehiculo v: vehiculos) {
			System.out.println(v.mostrarInformacion());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ISistemaGestion sistema = new SistemaGestionImpl();
		
		desplegarMenu(sistema);
	}
}
