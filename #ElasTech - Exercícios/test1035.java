package introducaoajavaisidro;
import java.util.Scanner;

/*
Leia 4 valores inteiros A, B, C e D. Então se B
 for maior que C e D for maior que A e se a soma de C e
  D for maior que a soma de A e B e se C e D forem valores
  positivos e se A for par, escreva a mensagem “Valores aceitos” .
   Caso contrário, escreva a mensagem “Valores não aceitos”
   (Valores não aceitos).
 */

public class test1035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int A, B, C, D;
        System.out.println("Insera um valor:");
        A = scan.nextInt();
        System.out.println("Insera um valor:");
        B = scan.nextInt();
        System.out.println("Insera um valor:");
        C = scan.nextInt();
        System.out.println("Insera um valor:");
        D = scan.nextInt();
        if ((B>C) && (D>A) && ((C+D)>(A+B)) && C>0 && D>0 && (A%2 == 0)){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores não aceitos.");
        }


    }
}
