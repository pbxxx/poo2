import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);
        
        if("AEIOUaeiou".indexOf(letra) != -1) System.out.println("Vogal");
        else System.out.println("Não é vogal");
        scanner.close();
    }
}