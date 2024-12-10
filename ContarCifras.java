import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero positivo:");
        int numero = scanner.nextInt();
        
        int cifras = 0;
        if (numero == 0) {
            cifras = 1;
        } else {
            while (numero > 0) {
                numero /= 10;
                cifras++;
            }
        }
        
        System.out.println("El numero tiene " + cifras + " cifras.");
        
        scanner.close();
    }
}
