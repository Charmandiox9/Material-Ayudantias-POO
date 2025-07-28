package Ej2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Ejercicio2 {
	static int erroresEncontrados = 0;
    static int operacionesExitosas = 0;
    static int operacionesProcesadas = 0;
    
    public static void leerArchivo() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("operaciones.txt"));

        while(scanner.hasNextLine()) {
            procesarOperacion(scanner.nextLine());;
        }
        mostrarResumen();
        scanner.close();
    }
    
    public static void procesarOperacion(String linea) {
        String[] partes = linea.split(",");
        
        try {
            char operador = partes[0].trim().charAt(0);
            double num1 = Double.parseDouble(partes[1]);
            double num2 = Double.parseDouble(partes[2]);
            
            String resultado = calcular(operador, num1, num2);
            System.out.println(resultado);
            
        } catch (NumberFormatException e) {
            System.err.println("Error: Números inválidos en línea: " + linea);
            erroresEncontrados++;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            erroresEncontrados++;
        }
    }

    public static String calcular(char operador, double num1, double num2) {
        double resultado;
        String operacion;
        
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                operacion = num1 + " + " + num2 + " = " + resultado;
                break;
            case '-':
                resultado = num1 - num2;
                operacion = num1 + " - " + num2 + " = " + resultado;
                break;
            case '*':
                resultado = num1 * num2;
                operacion = num1 + " * " + num2 + " = " + resultado;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("División por cero detectada en " + num1 + " / " + num2);
                }
                resultado = num1 / num2;
                operacion = num1 + " / " + num2 + " = " + resultado;
                break;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
        
        operacionesExitosas++;
        return "Operación: " + operacion;
    }

    public static void mostrarResumen() {
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Operaciones procesadas: " + (operacionesExitosas + erroresEncontrados));
        System.out.println("Operaciones exitosas: " + operacionesExitosas);
        System.out.println("Errores encontrados: " + erroresEncontrados);
    }
    
	
	public static void main(String[] args) throws FileNotFoundException {
		leerArchivo();
	}
}
