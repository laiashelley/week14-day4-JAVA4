// 2- Tienes un color preseleccionado, por ejemplo el rojo, y le preguntas al usuario un color a ver si lo acierta (solo le preguntas una vez).

import java.util.Scanner;

public class Java4ejercicio2 {
    public static void main(String[] args) throws Exception {

        System.out.println("Debes accertar el color que estoy pensando:");

        Scanner sc = new Scanner(System.in);
        String color = "rojo";
        String colorUsuario = sc.nextLine().toLowerCase();

        sc.close();

        if (colorUsuario.equals(color)){
            System.out.println("Felicidades, has acertado!");
        } else {
            System.out.println("No has acertado");
        }

    }
}
