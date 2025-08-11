package Visitor;

import java.util.Scanner;

public class App {
	public static void desplegarMenu(CalculadoraFormas calculadora) {
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("=== CALCULADORA DE FORMAS ===");
			System.out.println("1. Agregar círculo");
			System.out.println("2. Agregar cuadrado");
			System.out.println("3. Agregar triángulo");
			System.out.println("4. Calcular áreas");
			System.out.println("5. Calcular perímetros");
			System.out.println("0. Salir");
			System.out.print("Opción: ");
			opcion = scan.nextInt();
			scan.nextLine();
			System.out.println();
			
			switch(opcion) {
				case 1:
					System.out.print("Indique el radio del circulo: ");
					double radio = scan.nextDouble();
					scan.nextLine();
					calculadora.agregarForma(new Circulo("radio", radio));
					break;
				case 2:
					System.out.print("Indique el tamaño de su lado: ");
					double lado = scan.nextDouble();
					scan.nextLine();
					calculadora.agregarForma(new Cuadrado("cuadrado", lado));
					break;
				case 3:
					System.out.print("Indique la base: ");
					double base = scan.nextDouble();
					scan.nextLine();
					System.out.print("Indique la altura: ");
					double altura = scan.nextDouble();
					scan.nextLine();
					calculadora.agregarForma(new Triangulo("triangulo", base, altura));
					break;
				case 4:
					calculadora.calcularArea();
					break;
				case 5:
					calculadora.calcularPerimetros();
			}
			
			
		} while(opcion != 0);
	}
	
	public static void main(String[] args) {
		CalculadoraFormas calculadora = new CalculadoraFormas();
		desplegarMenu(calculadora);
	}
}
