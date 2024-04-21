// 5- Se pide un texto. Decir si está compuesto solo de minúsculas, solo de mayúsculas o si combina mayúsculas y minúsculas.

import java.util.Scanner;

public class Java4ejercicio5 {
    public static void main(String[] args) throws Exception {

        System.out.println("Introduce un texto");
        
        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();

        if (texto.matches("[A-Z]+")) {
            System.out.println("El texto incluye mayusculas solo");
        } else if (texto.matches("[a-z]+")){
            System.out.println("El texto incluye minusuclas solo");
        } else {
            System.out.println("El texto incluye de todo");
        }
    
        sc.close();

    }
}
