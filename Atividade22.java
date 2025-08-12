import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (0-999): ");
        int num = scanner.nextInt();
        
        int centenas = num / 100;
        int dezenas = (num % 100) / 10;
        int unidades = num % 10;
        
        String resultado = "";
        if(centenas > 0) resultado += centenas + " centena" + (centenas > 1 ? "s" : "") + ", ";
        if(dezenas > 0) resultado += dezenas + " dezena" + (dezenas > 1 ? "s" : "") + " e ";
        resultado += unidades + " unidade" + (unidades != 1 ? "s" : "");
        
        System.out.println(resultado);
        scanner.close();
    }
}