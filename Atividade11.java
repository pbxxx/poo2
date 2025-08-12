import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Em qual turno você estuda? (M-Matutino, V-Vespertino, N-Noturno): ");
        char turno = scanner.next().charAt(0);
        
        switch(Character.toUpperCase(turno)) {
            case 'M': System.out.println("Bom Dia!"); break;
            case 'V': System.out.println("Boa Tarde!"); break;
            case 'N': System.out.println("Boa Noite!"); break;
            default: System.out.println("Turno inválido!");
        }
        scanner.close();
    }
}