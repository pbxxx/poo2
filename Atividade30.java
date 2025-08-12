import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Litros vendidos: ");
        double litros = scanner.nextDouble();
        System.out.print("Tipo (A-Álcool, G-Gasolina): ");
        char tipo = scanner.next().charAt(0);
        
        double precoLitro, desconto;
        if(tipo == 'A' || tipo == 'a') {
            precoLitro = 1.90;
            desconto = litros <= 20 ? 0.03 : 0.05;
        } else {
            precoLitro = 2.50;
            desconto = litros <= 20 ? 0.04 : 0.06;
        }
        
        double valor = litros * precoLitro * (1 - desconto);
        System.out.printf("Valor a pagar: R$ %.2f", valor);
        scanner.close();
    }
}