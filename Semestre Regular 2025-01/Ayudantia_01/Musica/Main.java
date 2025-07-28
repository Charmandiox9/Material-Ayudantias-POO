	package Musica;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		//160 a 220 seg.
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de canciones escuchadas: ");
		int x = s.nextInt();	
		s.nextLine();
		int aux = 1;
		int min = 220;
		int max = 160;
		int total = 0;
		double totalAnuncios = 0;
		
		for (int i=0; i<x; i++) {
			
			System.out.printf("%nIngrese la duracion de la cancion numero %d: ", aux);
			int actual = s.nextInt();
			s.nextLine();
			if (actual <= 220 && actual >= 160) {
				if (actual < min) {min = actual;}
				if (actual > max) {max = actual;}
				total += actual;
				if (aux%3 == 0) {totalAnuncios += anuncios(actual);}
				aux++;
			} else { 
				i--;
				System.out.println("Duracion invalida, reingrese.");
			}	
		}
		System.out.printf("%nEl tiempo total escuhado fue de: %d", total);
		System.out.printf("%nEl tiempo total con anuncios fue: %f", totalAnuncios);
		System.out.printf("%nLa cancion con mayor duracion fue de: %d segundos, y la de menor fue de: %d segundos", max, min);
		s.close();
	}
	
	public static double anuncios(int actual) {
		
		//x es la duracion de la cancion a evaluar
		
		double anuncio = actual * 0.15;
		double total = anuncio + actual;
	
		return total;
	}
	
}