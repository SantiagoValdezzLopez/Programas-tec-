import java.util.Scanner;

public class VolumenEsfera {
    
    public static double calcularVolumen(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el radio de la esfera:");
        double radio = scanner.nextDouble();
        
        double volumen = calcularVolumen(radio);
        
        System.out.println("El volumen de la esfera es: " + volumen);
        
        scanner.close();
    }
}
