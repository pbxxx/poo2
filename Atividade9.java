import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o peso atual (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        
        double pesoIdeal = (sexo == 'M' || sexo == 'm') ? (72.7 * altura) - 58 : (62.1 * altura) - 44.7;
        String situacao = peso > pesoIdeal ? "Acima" : peso < pesoIdeal ? "Abaixo" : "No peso ideal";
        
        System.out.printf("\nAltura: %.2fm\nPeso: %.2fkg\nSexo: %s\nPeso Ideal: %.2fkg\nSituação: %s\n",
                         altura, peso, (sexo == 'M' || sexo == 'm') ? "Masculino" : "Feminino", pesoIdeal, situacao);
        scanner.close();
    }
}