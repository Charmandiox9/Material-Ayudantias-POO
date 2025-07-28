package Videojuegos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Cuanta fue la venta del mes: ");
		int total = s.nextInt();
		s.nextLine();
		int aux = 1;
		int max = 0;
		int ganancias = 0;
		
		for (int i=0; i<total; i++) {
			System.out.printf("Ingrese el precio del videojuego numero %d: ", aux);
			int actual = s.nextInt();
			s.nextLine();
			if (actual > max) {max = actual;}
			ganancias += actual;
			aux++;
		}
		
		System.out.printf("%nLa ganancia de este mes fue de: %d", ganancias);
		System.out.printf("%nEl videojuego mas caro vendido fue de: %d", max);
		
		s.close();
	}
	
	
}
