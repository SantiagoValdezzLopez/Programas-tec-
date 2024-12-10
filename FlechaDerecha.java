import java.util.Scanner;

public class FlechaDerecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero:");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
