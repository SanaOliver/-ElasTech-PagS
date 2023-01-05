package introducaoajavaisidro;
import java.util.Scanner;

public class InverteNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroOriginal, c, d,u, resto;
        System.out.print("Digite o numero:");
        numeroOriginal = scan.nextInt();
        c = numeroOriginal/100;
        resto = numeroOriginal%100;
        d = resto/10;
        u = resto%10;
        System.out.println(""+u+d+c);


        scan.close();
    }
}
