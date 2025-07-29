package ej3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ej3 {
	static Inscripcion[] inscripciones = new Inscripcion[10];
	static Curso[] cursos = new Curso[10];
	
	public static void leerArchivo() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("cursos.txt"));
		int contador = 0;
		
		while(scan.hasNextLine()) {
			String[] partes = scan.nextLine().split(",");
			String nombre = partes[0];
			String nrc = partes[1];
			String np = partes[2];
			
			cursos[contador++] = new Curso(nombre, nrc, np);
		}
		scan.close();
		
		scan = new Scanner(new File("inscripciones.txt"));
		contador = 0;
		
		while(scan.hasNextLine()) {
			String[] partes2 = scan.nextLine().split(",");
			String nrc = partes2[0];
			String ne = partes2[1];
			int edad = Integer.parseInt(partes2[2]);
			double promedio = Double.parseDouble(partes2[3]);
			
			inscripciones[contador++] = new Inscripcion(nrc, ne, edad, promedio);
		}
		
		mostrarResumen();
		scan.close();
	}
	
	public static void mostrarResumen() {
		for(int i = 0; i < cursos.length; i++) {
			if(cursos[i] != null) {
				System.out.println(cursos[i]);
				int cantEstudiantesInscritos = 0;
				double promedioCurso = 0.0;
				for(int j = 0; j < inscripciones.length; j++) {
					if(inscripciones[j] != null && inscripciones[j].getNrc().equals(cursos[i].getNrc())) {
						cantEstudiantesInscritos++;
						promedioCurso += inscripciones[j].getPromedio();
						
					}
				}
				
				System.out.println("Estudiantes inscritos: " + cantEstudiantesInscritos);
				System.out.println("Lista de estudiantes: ");
				for(int j = 0; j < inscripciones.length; j++) {
					if(inscripciones[j] != null && inscripciones[j].getNrc().equals(cursos[i].getNrc())) {
						System.out.println(inscripciones[j]);
					}
				}
				
				promedioCurso /= cantEstudiantesInscritos;
				System.out.print("Promedio del curso: " + promedioCurso);
				
				System.out.println("\n");
			}
			
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		leerArchivo();
	}
}
