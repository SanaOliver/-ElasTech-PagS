package introducaoajavaisidro;
import java.util.Scanner;

public class DiversaLeituras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int codigo;
        double preco;
        System.out.print("Digite o nome do produto:");
        nome = scan.nextLine();
        System.out.print("Digite o codigo:");
        codigo = scan.nextInt();
        System.out.println("Digite o preco:");
        preco = scan.nextDouble();

    }
}
