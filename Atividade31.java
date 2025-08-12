import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kg de morango: ");
        double kgMorangos = scanner.nextDouble();
        System.out.print("Kg de maçãs: ");
        double kgMacas = scanner.nextDouble();
        
        double precoMorangos = kgMorangos > 5 ? 2.20 : 2.50;
        double precoMacas = kgMacas > 5 ? 1.50 : 1.80;
        
        double total = (kgMorangos * precoMorangos) + (kgMacas * precoMacas);
        
        if((kgMorangos + kgMacas) > 8 || total > 25) {
            total *= 0.90; // 10% de desconto
        }
        
        System.out.printf("Valor a pagar: R$ %.2f", total);
        scanner.close();
    }
}