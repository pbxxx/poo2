import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        System.out.println(num == (int)num ? "Inteiro" : "Decimal");
        scanner.close();
    }
}