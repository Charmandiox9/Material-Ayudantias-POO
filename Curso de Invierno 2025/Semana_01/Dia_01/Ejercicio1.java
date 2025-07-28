package Ej1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double menorTemperatura = Integer.MAX_VALUE;
        double mayorTemperatura = Integer.MIN_VALUE;
        int temperaturasFrias = 0;
        int temperaturasCalidas = 0;
        int temperaturasTempladas = 0;
        double temperaturaPromedio = 0;
        
        
        System.out.println("Indique la cantidad de días: ");
        int cantDias = scan.nextInt();
        scan.nextLine();
        
        for(int i = 0; i < cantDias; i++) {
        	System.out.println("Ingrese la temperatura del día " + (i+1) + ": ");
        	double temperatura = scan.nextDouble();
        	scan.nextLine();
        	
        	if(temperatura < menorTemperatura) {
        		menorTemperatura = temperatura;
        	}
        	
        	if(temperatura > mayorTemperatura) {
        		mayorTemperatura = temperatura;
        	}
        	
        	temperaturaPromedio += temperatura;
        	
        	
        	if(temperatura < 5) {
        		temperaturasFrias++;
        	} else if(temperatura >= 5 && temperatura <= 25) {
        		temperaturasTempladas++;
        	} else if(temperatura > 25) {
        		temperaturasCalidas++;
        	}
        }
        
        temperaturaPromedio /= cantDias;
        
        System.out.println("Temperaturas frias: " + temperaturasFrias);
        System.out.println("Temperaturas templadas: " + temperaturasTempladas);
        System.out.println("Temperaturas cálidas: " + temperaturasCalidas);
        System.out.println("Temperatura promedio: " + temperaturaPromedio);
        System.out.println("Temperatura máxima: " + mayorTemperatura);
        System.out.println("Temperatura mínima: " + menorTemperatura);
        
	}
}
