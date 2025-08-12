import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Número 2: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Operação (+ - * /): ");
        char operacao = scanner.next().charAt(0);
        
        double resultado = 0;
        switch(operacao) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num1 / num2; break;
            default: System.out.println("Operação inválida!"); return;
        }
        
        System.out.printf("Resultado: %.2f\n", resultado);
        System.out.println("Classificações:");
        
        if(resultado == (int)resultado) {
            System.out.println(((int)resultado % 2 == 0 ? "Par" : "Ímpar"));
        } else {
            System.out.println("Decimal - não se aplica par/ímpar");
        }
        
        System.out.println(resultado >= 0 ? "Positivo" : "Negativo");
        
        System.out.println(resultado == (int)resultado ? "Inteiro" : "Decimal");
        
        scanner.close();
    }
}