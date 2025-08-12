import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };
        
        int respostasPositivas = 0;
        for(String pergunta : perguntas) {
            System.out.print(pergunta + " (S/N): ");
            if(scanner.next().equalsIgnoreCase("S")) respostasPositivas++;
        }
        
        String classificacao;
        if(respostasPositivas == 5) classificacao = "Assassino";
        else if(respostasPositivas >= 3) classificacao = "Cúmplice";
        else if(respostasPositivas >= 2) classificacao = "Suspeita";
        else classificacao = "Inocente";
        
        System.out.println("Classificação: " + classificacao);
        scanner.close();
    }
}