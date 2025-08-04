package logica;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import dominio.*;

public class App {
	
	static ArrayList<Animal> animales = new ArrayList<>();
	
	public static void leerArchivo() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("animales.txt"));
		
		while(scan.hasNextLine()) {
			String[] partes = scan.nextLine().split(",");
			String tipo = partes[0];
			String nombre = partes[1];
			int edad = Integer.parseInt(partes[2]);
			String raza = partes[3];
			
			switch(tipo) {
				case "Perro":
					animales.add(new Perro(nombre, edad, raza));
					break;
				case "Gato":
					animales.add(new Gato(nombre, edad, raza));
					break;
				case "Pez":
					animales.add(new Pez(nombre, edad, raza));
					break;
			}
		}
		
		mostrarInfo();
		scan.close();
	}
	
	public static void mostrarInfo() {
		for(Animal a: animales) {
			System.out.println(a.mostrarInfo());
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		leerArchivo();
	}
}
