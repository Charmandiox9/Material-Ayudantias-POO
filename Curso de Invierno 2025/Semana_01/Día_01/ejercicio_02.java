import java.util.Random;
import java.util.Scanner;

public class ejercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinado = 0;
        int numeroRandom = -1;
        int intento = 1;

        while(numeroAdivinado != numeroRandom){
            if(numeroRandom == -1) {
                numeroRandom = random.nextInt(intento * 3);
            }
            System.out.println("Ingrese un número entre 1 y " + (intento*3) + ": ");
            numeroAdivinado = scanner.nextInt();

            if(numeroAdivinado != numeroRandom) {
                if(numeroAdivinado < 1 || numeroAdivinado > (intento * 3)) {
                    System.out.println("Número ingresado: " + numeroAdivinado + " no es válido. Debe estar entre 1 y " + (intento * 3) + ".");
                    System.out.println("El número aleatorio es: " + numeroRandom);
                    intento++;
                    numeroRandom = random.nextInt(intento * 3)+1;
                } else {
                    System.out.println("Número ingresado: " + numeroAdivinado + " no es correcto.");
                    System.out.println("El número aleatorio es: " + numeroRandom);
                    intento++;
                    numeroRandom = random.nextInt(intento * 3)+1;
                }
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
            }

        }

    }
}
