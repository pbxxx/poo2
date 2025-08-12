import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        
        if(num > 0) System.out.println("Positivo");
        else if(num < 0) System.out.println("Negativo");
        else System.out.println("Zero");
        scanner.close();
    }
}