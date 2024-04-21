// 1- El usuario tiene que acertar un número del 1 al 5, generado aleatoriamente. Le vas preguntando hasta que acierte.

// Al final, decir en cuantos intentos lo ha conseguido.

import java.util.Scanner;

public class Java4ejercicio1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numeroAcierto = (int) (Math.floor(Math.random() * 5) + 1);
        int intentos = 0;
        int numeroUsuario;

        System.out.println("Adivina un número entre 1 y 5.");

        do {
            System.out.print("Introduce tu número:");
            numeroUsuario = sc.nextInt();
            intentos++;

            if (numeroUsuario != numeroAcierto) {
                System.out.println("Todo mal.");
            }

        } while (numeroUsuario != numeroAcierto);

        sc.close();

        System.out.println("Has adivinado el número. Tus intentos son: " + intentos);
    }
}
