import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] nums = new double[3];
        
        for(int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            nums[i] = scanner.nextDouble();
        }
        
        double maior = Math.max(nums[0], Math.max(nums[1], nums[2]));
        double menor = Math.min(nums[0], Math.min(nums[1], nums[2]));
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        scanner.close();
    }
}