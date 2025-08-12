import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        String situacao;
        
        if(media == 10) situacao = "Aprovado com Distinção";
        else if(media >= 7) situacao = "Aprovado";
        else situacao = "Reprovado";
        
        System.out.printf("Média: %.1f - %s", media, situacao);
        scanner.close();
    }
}