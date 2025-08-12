import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        System.out.println(num % 2 == 0 ? "Par" : "Ímpar");
        scanner.close();
    }
}