package exercicio1910;

public class Tabuada {
    public static void escreveTabuada(){
        for (int x=0; x<10; x++){
            System.out.println("2 x "+x+"="+x*2);
        }
    }
    public static void imprimeTodasTabuadas(){
        for (int x=1; x<10; x++){
            for (int y=0; y<10; y++){
                System.out.println(x+"x"+y+"="+x*y);

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        //escreveTabuada();
        imprimeTodasTabuadas();
    }

}
