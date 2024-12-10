import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int min = 1;
        int max = 100;
        int intento;
        String respuesta;

       
        
        while (true) {
            intento = (min + max) / 2;  
            System.out.println("¿Es " + intento + " tu numero? (si/mas/menos)");

            respuesta = scanner.nextLine().toLowerCase();  

            if (respuesta.equals("si")) {
                System.out.println("El numero El número es " + intento + ".");
                break;  
            } else if (respuesta.equals("mas")) {
                min = intento + 1;  
            } else if (respuesta.equals("menos")) {
                max = intento - 1;  
            } else {
                System.out.println("Por favor responde con 'si', 'mas' o 'menos'.");
            }
        }

        scanner.close();
    }
}
