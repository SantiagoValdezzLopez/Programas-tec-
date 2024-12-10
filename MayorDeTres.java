import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tres numeros enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El numero mayor es: " + mayor);
        
        scanner.close();
    }
}
