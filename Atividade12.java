import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual: R$ ");
        double salario = scanner.nextDouble();
        
        double percentual;
        if(salario <= 280) percentual = 20;
        else if(salario <= 700) percentual = 15;
        else if(salario <= 1500) percentual = 10;
        else percentual = 5;
        
        double aumento = salario * percentual / 100;
        double novoSalario = salario + aumento;
        
        System.out.printf("\nSalário antes do reajuste: R$ %.2f", salario);
        System.out.printf("\nPercentual de aumento: %.0f%%", percentual);
        System.out.printf("\nValor do aumento: R$ %.2f", aumento);
        System.out.printf("\nNovo salário: R$ %.2f", novoSalario);
        scanner.close();
    }
}