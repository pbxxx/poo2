import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite F ou M: ");
        char sexo = scanner.next().charAt(0);
        
        if(sexo == 'F' || sexo == 'f') System.out.println("F - Feminino");
        else if(sexo == 'M' || sexo == 'm') System.out.println("M - Masculino");
        else System.out.println("Sexo inválido");
        scanner.close();
    }
}