package ej2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ej2 {
	static CitaMedica[] citas = new CitaMedica[10];
	
	public static void leerArchivo() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("citas.txt"));
		int contador = 0;
		
		while(scan.hasNextLine()) {
			String[] partes = scan.nextLine().split(",");
			String np = partes[0];
			String nd = partes[1];
			String h = partes[2];
			String tp = partes[3];
			
			citas[contador++] = new CitaMedica(np, nd, h, tp);
		}
		
		encontrarCita();
		
	}
	
	public static void encontrarCita(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese el nombre del paciente: ");
		String paciente = scan.nextLine();
		
		for(int i = 0; i < citas.length; i++) {
			if(citas[i] != null) {
				if(citas[i].getNombrePaciente().equals(paciente)){
					System.out.println("Cita encontrada!");
					System.out.println(citas[i]);
				} 
			}
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		leerArchivo();
	}
}
