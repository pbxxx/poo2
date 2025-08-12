import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        char conceito;
        String situacao;
        
        if(media >= 9) conceito = 'A';
        else if(media >= 7.5) conceito = 'B';
        else if(media >= 6) conceito = 'C';
        else if(media >= 4) conceito = 'D';
        else conceito = 'E';
        
        situacao = (conceito == 'A' || conceito == 'B' || conceito == 'C') ? "APROVADO" : "REPROVADO";
        
        System.out.printf("\nNotas: %.1f e %.1f", nota1, nota2);
        System.out.printf("\nMédia: %.1f", media);
        System.out.printf("\nConceito: %c", conceito);
        System.out.printf("\nSituação: %s", situacao);
        scanner.close();
    }
}