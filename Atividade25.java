import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do saque (10-600): ");
        int valor = scanner.nextInt();
        
        if(valor < 10 || valor > 600) {
            System.out.println("Valor inválido!");
            return;
        }
        
        int[] notas = {100, 50, 10, 5, 1};
        int[] qtdNotas = new int[5];
        
        for(int i = 0; i < notas.length; i++) {
            qtdNotas[i] = valor / notas[i];
            valor %= notas[i];
        }
        
        System.out.println("Notas fornecidas:");
        for(int i = 0; i < notas.length; i++) {
            if(qtdNotas[i] > 0) {
                System.out.printf("%d nota(s) de R$ %d\n", qtdNotas[i], notas[i]);
            }
        }
        scanner.close();
    }
}