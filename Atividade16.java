import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a média do aluno: ");
        double media = scanner.nextDouble();
        
        if(media >= 7) System.out.println("Aprovado");
        else if(media >= 3) System.out.println("Em exame");
        else System.out.println("Reprovado");
        scanner.close();
    }
}