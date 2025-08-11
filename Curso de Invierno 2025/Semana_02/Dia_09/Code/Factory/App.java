package Factory;

import java.util.Scanner;

public class App {
	public static void desplegarMenu(ISistema sistema) {
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("=== FÁBRICA DE VEHÍCULOS ===");
			System.out.println("1. Crear automóvil");
			System.out.println("2. Crear motocicleta");
			System.out.println("3. Crear bicileta");
			System.out.println("4. Mostrar vehículos creados");
			System.out.println("0. Salir");
			System.out.print("Opción: ");
			opcion = scan.nextInt();
			scan.nextLine();
			
			switch(opcion){
			case 1:
				System.out.println("Ingrese la marca: ");
				String marca = scan.nextLine();
				System.out.println("Ingrese el modelo: ");
				String modelo = scan.nextLine();
				
				sistema.crearAutomovil(marca, modelo);
				break;
			case 2:
				System.out.println("Ingrese la marca: ");
				String marca1 = scan.nextLine();
				System.out.println("Ingrese el modelo: ");
				String modelo1 = scan.nextLine();
				
				sistema.crearMotocicleta(marca1, modelo1);
				break;
			case 3:
				System.out.println("Ingrese la marca: ");
				String marca11 = scan.nextLine();
				System.out.println("Ingrese el modelo: ");
				String modelo11 = scan.nextLine();
				
				sistema.crearBicicleta(marca11, modelo11);
				break;
			case 4:
				sistema.mostrarVehiculos();
				break;
			}
			
			
		} while(opcion != 0);
	}
	

	public static void main(String[] args) {
		ISistema sistema = new SistemaImpl();
		desplegarMenu(sistema);
	}

}
