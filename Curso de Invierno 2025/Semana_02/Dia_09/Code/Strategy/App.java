package Strategy;

import java.util.Scanner;

public class App {
	public static void desplegarMenu(ISistema sistema) {
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("=== CALCULADORA DE IMPUESTOS ===");
			System.out.println("1. Calcular impuesto persona natural");
			System.out.println("2. Calcular impuesto empresa pequeña");
			System.out.println("3. Calcular impuesto gran corporación");
			System.out.println("0. Salir");
			System.out.print("Opción: ");
			opcion = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			switch(opcion) {
				case 1:
					System.out.print("Indique sus ingresos: ");
					double ingresos = scan.nextDouble();
					scan.nextLine();
					System.out.println("Impuestos: " + sistema.calcularImpuestoPersonaNatural(ingresos));
					System.out.println("Estrategia: " + sistema.mostrarInfoEstrategia());
					break;
				case 2:
					System.out.print("Indique sus ingresos: ");
					double ingresos1 = scan.nextDouble();
					scan.nextLine();
					System.out.println("Impuestos: " + sistema.calcularImpuestoEmpresaPequeña(ingresos1));
					System.out.println("Estrategia: " + sistema.mostrarInfoEstrategia());
					break;
				case 3:
					System.out.print("Indique sus ingresos: ");
					double ingresos11 = scan.nextDouble();
					scan.nextLine();
					System.out.println("Impuestos: " + sistema.calcularImpuestoGranCorporacion(ingresos11));
					System.out.println("Estrategia: " + sistema.mostrarInfoEstrategia());
					break;
			}
			
			
		} while(opcion != 0);
	}

	public static void main(String[] args) {
		ISistema sistema = new SistemaImpl();
		desplegarMenu(sistema);
	}

}
