import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data (dd/mm/aaaa): ");
        String[] partes = scanner.next().split("/");
        
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        
        boolean valida = false;
        if(mes >= 1 && mes <= 12) {
            int[] diasMes = {31, (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if(dia >= 1 && dia <= diasMes[mes-1]) valida = true;
        }
        
        System.out.println(valida ? "Data válida" : "Data inválida");
        scanner.close();
    }
}