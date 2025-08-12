import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Idade 1: ");
        int idade1 = scanner.nextInt();
        System.out.print("Idade 2: ");
        int idade2 = scanner.nextInt();
        System.out.print("Idade 3: ");
        int idade3 = scanner.nextInt();
        
        double media = (idade1 + idade2 + idade3) / 3.0;
        String turma;
        
        if(media < 25) turma = "Turma Jovem";
        else if(media <= 40) turma = "Turma Adulta";
        else turma = "Turma Idosa";
        
        System.out.printf("Média: %.1f anos - %s", media, turma);
        scanner.close();
    }
}