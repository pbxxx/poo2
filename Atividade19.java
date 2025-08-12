import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor de a: ");
        double a = scanner.nextDouble();
        
        if(a == 0) {
            System.out.println("Não é equação do segundo grau!");
            return;
        }
        
        System.out.print("Valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Valor de c: ");
        double c = scanner.nextDouble();
        
        double delta = b*b - 4*a*c;
        
        if(delta < 0) System.out.println("Não possui raízes reais!");
        else if(delta == 0) System.out.println("Raiz única: " + (-b/(2*a)));
        else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("Raízes: %.2f e %.2f", x1, x2);
        }
        scanner.close();
    }
}