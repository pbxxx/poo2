import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        
        System.out.println("Número transformado: " + (num % 2 == 0 ? num + 1 : num - 1));
        scanner.close();
    }
}