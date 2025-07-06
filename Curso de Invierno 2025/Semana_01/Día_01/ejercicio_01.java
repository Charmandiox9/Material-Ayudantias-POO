import java.util.Scanner;

public class ejercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candidato1 = 0;
        int candidato2 = 0;
        int cantVotos = 0;

        System.out.println("Ingrese la cantidad de votantes: ");
        cantVotos = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < cantVotos; i++){
            System.out.println("Ingrese el voto del votante " + (i + 1) + " (candidato1 o candidadto2): ");
            String voto = scanner.next();
            if(voto.equalsIgnoreCase("candidato1")){
                candidato1++;
            } else if(voto.equalsIgnoreCase("candidato2")){
                candidato2++;
            } else {
                System.out.println("Voto inválido. Por favor, ingrese 'candidato1' o 'candidato2'.");
                i--;
            }
        }

        System.out.println("Votos:");
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        scanner.close();
    }
}