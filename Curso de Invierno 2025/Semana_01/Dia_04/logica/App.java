package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import dominio.*;

public class App {
	
	static ArrayList<Animal> animales = new ArrayList<>();
	
	public static void leerArchivo() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("ecosistema.txt"));
		
		while(scan.hasNextLine()) {
			String[] partes = scan.nextLine().split(",");
			String dieta = partes[0];
			String animal = partes[1];
			int edad = Integer.parseInt(partes[2]);
			String habitat = partes[3];
			String alimento = partes[4];
			
			switch(dieta) {
				case "Carnívoro":
					animales.add(new Carnivoro(animal, edad, habitat, alimento));
					break;
				case "Herbívoro":
					animales.add(new Herbivoro(animal, edad, habitat, alimento));
					break;
				case "Omnívoro":
					animales.add(new Omnivoro(animal, edad, habitat, alimento));
					break;
			}
			
		}
		
		mostrarAnimales();
		scan.close();
	}
	
	public static void mostrarAnimales() {
		for(Animal a: animales) {
			System.out.println(a.mostrarInfo());
			System.out.println();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		leerArchivo();
	}
}
