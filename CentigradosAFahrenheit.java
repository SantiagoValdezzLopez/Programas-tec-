import java.util.Scanner;

public class CentigradosAFahrenheit {
    
    public static double convertirAFahrenheit(double gradosCentigrados) {
        return 32 + (9 * gradosCentigrados / 5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa los grados centigrados:");
        double gradosCentigrados = scanner.nextDouble();
        
        double gradosFahrenheit = convertirAFahrenheit(gradosCentigrados);
        
        System.out.println(gradosCentigrados + " grados centigrados son " + gradosFahrenheit + " grados Fahrenheit.");
        
        scanner.close();
    }
}
