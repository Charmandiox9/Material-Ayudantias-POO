package Ej3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio3 {
	static double[][]  matrizTemperatura = null;
	static int filas;
	static int columnas;
	
	public static void leerArchivo() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("sensores.txt"));
		
		if(scan.hasNextLine()) {
			String[] dimensiones = scan.nextLine().split(",");
			filas = Integer.parseInt(dimensiones[0]);
			columnas = Integer.parseInt(dimensiones[1]);
			matrizTemperatura = new double[filas][columnas];
			
		}
		
		for (int i = 0; i < filas && scan.hasNextLine(); i++) {
            String linea = scan.nextLine();
            String[] valores = linea.split(",");

            if (valores.length != columnas) {
                System.err.println("Error: la línea " + (i + 2) + " no tiene " + columnas + " valores.");
                continue;
            }

            for (int j = 0; j < columnas; j++) {
                matrizTemperatura[i][j] = Double.parseDouble(valores[j].trim());
            }
        }
		
		System.out.println("=== ANÁLISIS DE SENSORES DE TEMPERATURA ===\n");
		mostrarMatriz();
		analizarPorSensor();
		analizarPorHorario();
		mostrarEstadisticasGenerales();
		scan.close();
		
	}
	
	public static void mostrarMatriz() {
		for(int i = 0; i < filas; i++) {
			System.out.print("Sensor " + (i+1) + ": ");
			for(int j = 0; j < columnas; j++) {
				System.out.print(matrizTemperatura[i][j] + "C° ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void analizarPorSensor() {
		System.out.println("Promedio por sensor:");
		float[]  promedioSensor = new float[filas];
		
		for(int i = 0; i < filas; i++) {
			double suma = 0;
			for(int j = 0; j < columnas; j++) {
				suma += matrizTemperatura[i][j];
			}
			promedioSensor[i] = (float) (suma/columnas);
			String advertencia = promedioSensor[i] > 27.0 ? " - CRITICO" : "";
			double redondeado = Math.round((promedioSensor[i] * 10) / 10);
			System.out.println("Sensor: " + (i+1) + ": " + String.format("%.1f", redondeado) + "C° " + advertencia);
		}
		System.out.println();
	}
	
	public static void analizarPorHorario() {
		System.out.println("Promedio por horario:");
		float[] promedioHorario = new float[columnas];
		
		for(int j = 0; j < columnas; j++) {
			double suma = 0;
			for(int i = 0; i < filas; i++) {
				suma += matrizTemperatura[i][j];
			}
			promedioHorario[j] = (float) (suma/columnas);
			
			String advertencia = promedioHorario[j] > 27.0 ? " - CRITICO" : "";
			double redondeado = Math.round((promedioHorario[j] * 10) / 10);
			System.out.println("Sensor: " + (j+1) + ": " + String.format("%.1f", redondeado) + "C° " + advertencia);
		}
		System.out.println();
	}
	
	public static void mostrarEstadisticasGenerales() {
		double suma = 0.0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		int maxFila = 0, maxCol = 0;
		int minFila = 0, minCol = 0;
		
		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				double temp = matrizTemperatura[i][j];
				suma += temp;
				
				if(temp > max) {
					max = temp;
					maxFila = i;
					maxCol = j;
				}
				
				if(temp < min) {
					min = temp;
					minFila = i;
					minCol = j;
				}
			}
		}
		
		double promedio = suma / (filas*columnas);
		
		System.out.println("Temperatura promedio general: " + String.format("%.1f", promedio));
		System.out.println("Temperatura máxima: " + max + "°C (Sensor " + (maxFila+1) + ", Horario " + (maxCol+1) + ")");
		System.out.println("Temperatura minima: " + min + "°C (Sensor " + (minFila+1) + ", Horario " + (minCol+1) + ")");
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		leerArchivo();
	}
	
}
