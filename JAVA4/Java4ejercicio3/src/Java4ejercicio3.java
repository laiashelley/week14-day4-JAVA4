

// 3- Se introduce una frase y se devuelve  el texto a la inversa. Ejemplo: olpmejE

import java.util.Scanner;

public class Java4ejercicio3 {
    public static void main(String[] args) throws Exception {

        System.out.println("Introduce una frase:");

        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        String fraseReves = "";
        
       for (int i = frase.length() - 1; i >= 0; i--){
        fraseReves += frase.charAt(i);
       }
        
        System.out.println("La frase al revés es:" + fraseReves);
        
        sc.close();

    }
}
