import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (1-7): ");
        int dia = scanner.nextInt();
        
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        if(dia >= 1 && dia <= 7) System.out.println(dias[dia-1]);
        else System.out.println("Valor inválido!");
        scanner.close();
    }
}