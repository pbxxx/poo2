import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] numeros = new Double[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }
        
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + Arrays.toString(numeros));
        scanner.close();
    }
}