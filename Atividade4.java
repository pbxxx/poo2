import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano com 4 dígitos: ");
        int ano = scanner.nextInt();
        
        boolean bissexto = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
        System.out.println(bissexto ? "Ano bissexto" : "Não é bissexto");
        scanner.close();
    }
}