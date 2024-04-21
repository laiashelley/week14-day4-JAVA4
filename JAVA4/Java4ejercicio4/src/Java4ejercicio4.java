// 4- Pides un numero de telefono y le quitas, si hay, los espacios, los guiones y los puntos:  456-453-78 quedaria como 45645378

import java.util.Scanner;

public class Java4ejercicio4 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero de telefono");

        String numeroTelefono = "";

        numeroTelefono = sc.nextLine();

        System.out.println(numeroTelefono.replaceAll("[\\s\\-.]",""));

        sc.close();

    }
}
