import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] gabarito = {'a','a','b','b','c','c','d','d','e','e'};
        char[] respostas = new char[10];
        int acertos = 0;
        
        for(int i = 0; i < 10; i++) {
            System.out.printf("Resposta Q%d: ", i+1);
            respostas[i] = scanner.next().charAt(0);
        }
        
        System.out.println("\nRESULTADO:");
        for(int i = 0; i < 10; i++) {
            boolean correto = respostas[i] == gabarito[i];
            if(correto) acertos++;
            System.out.printf("Q%d: %c : %s%s\n", 
                i+1, 
                respostas[i],
                correto ? "Correto" : "Errada",
                correto ? "" : ", resposta correta (" + gabarito[i] + ")"
            );
        }
        
        System.out.println("Pontuação Final: " + acertos);
        scanner.close();
    }
}