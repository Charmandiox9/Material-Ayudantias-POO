import java.util.Scanner;


public class ejercicio_03 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menorTemperatura = Integer.MAX_VALUE;
        int mayorTemperatura = Integer.MIN_VALUE;
        int temperaturasFrias = 0;
        int temperaturasCalidas = 0;
        int temperaturasTempladas = 0;
        double temperaturaPromedio = 0;


        System.out.println("Ingrese la cantidad de días: ");
        int cantidadDias = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadDias; i++) {
            System.out.println("Ingrese la temperatura del día " + (i + 1) + ": ");
            int temperatura = scanner.nextInt();

            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }
            if (temperatura > mayorTemperatura) {
                mayorTemperatura = temperatura;
            }
            temperaturaPromedio += temperatura;

            if (temperatura < 5) {
                temperaturasFrias++;
            } else if (temperatura >= 5 && temperatura <= 25) {
                temperaturasTempladas++;
            } else {
                temperaturasCalidas++;
            }


        }

        temperaturaPromedio /= cantidadDias;

        System.out.println("Temperaturas frías: " + temperaturasFrias);
        System.out.println("Temperaturas templadas: " + temperaturasTempladas);
        System.out.println("Temperaturas cálidas: " + temperaturasCalidas);

        System.out.println("Temperatura promedio: " + temperaturaPromedio);
        System.out.println("Temperatura mínima: " + menorTemperatura);
        System.out.println("Temperatura máxima: " + mayorTemperatura);
        scanner.close();

    }

}
