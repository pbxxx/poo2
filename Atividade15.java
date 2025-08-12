import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Preço de custo: R$ ");
        double preco = scanner.nextDouble();
        System.out.print("Código de origem (1-8): ");
        int codigo = scanner.nextInt();
        
        String origem;
        switch(codigo) {
            case 1: origem = "Sul"; break;
            case 2: origem = "Norte"; break;
            case 3: origem = "Leste"; break;
            case 4: origem = "Oeste"; break;
            case 5: case 6: origem = "Nordeste"; break;
            case 7: case 8: origem = "Centro-oeste"; break;
            default: origem = "Importado";
        }
        
        System.out.printf("Preço: R$ %.2f - Procedência: %s", preco, origem);
        scanner.close();
    }
}