import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor por hora: R$ ");
        double valorHora = scanner.nextDouble();
        System.out.print("Horas trabalhadas no mês: ");
        double horas = scanner.nextDouble();
        
        double salarioBruto = valorHora * horas;
        double ir = 0, inss = salarioBruto * 0.10, fgts = salarioBruto * 0.11;
        
        if(salarioBruto > 2500) ir = salarioBruto * 0.20;
        else if(salarioBruto > 1500) ir = salarioBruto * 0.10;
        else if(salarioBruto > 900) ir = salarioBruto * 0.05;
        
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
        System.out.printf("\n(-) IR: R$ %.2f", ir);
        System.out.printf("\n(-) INSS: R$ %.2f", inss);
        System.out.printf("\nFGTS: R$ %.2f", fgts);
        System.out.printf("\nTotal de descontos: R$ %.2f", totalDescontos);
        System.out.printf("\nSalário Líquido: R$ %.2f", salarioLiquido);
        scanner.close();
    }
}