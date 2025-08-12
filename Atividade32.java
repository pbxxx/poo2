import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tipo (F-Filé, A-Alcatra, P-Picanha): ");
        char tipo = scanner.next().charAt(0);
        System.out.print("Quantidade (kg): ");
        double kg = scanner.nextDouble();
        System.out.print("Cartão Tabajara? (S/N): ");
        boolean cartao = scanner.next().equalsIgnoreCase("S");
        
        String nomeCarne;
        double preco;
        if(tipo == 'F' || tipo == 'f') {
            nomeCarne = "Filé Duplo";
            preco = kg > 5 ? 5.80 : 4.90;
        } else if(tipo == 'A' || tipo == 'a') {
            nomeCarne = "Alcatra";
            preco = kg > 5 ? 6.80 : 5.90;
        } else {
            nomeCarne = "Picanha";
            preco = kg > 5 ? 7.80 : 6.90;
        }
        
        double total = kg * preco;
        double desconto = cartao ? total * 0.05 : 0;
        double aPagar = total - desconto;
        
        System.out.println("\nCUPOM FISCAL");
        System.out.printf("Carne: %s\n", nomeCarne);
        System.out.printf("Quantidade: %.2f kg\n", kg);
        System.out.printf("Preço total: R$ %.2f\n", total);
        System.out.printf("Pagamento: %s\n", cartao ? "Cartão Tabajara" : "Outro");
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f\n", aPagar);
        scanner.close();
    }
}