import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lado 1: ");
        double a = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double b = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double c = scanner.nextDouble();
        
        if(a + b > c && a + c > b && b + c > a) {
            if(a == b && b == c) System.out.println("Triângulo Equilátero");
            else if(a == b || a == c || b == c) System.out.println("Triângulo Isósceles");
            else System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Não forma um triângulo!");
        }
        scanner.close();
    }
}