package exercicio1810;

public class ListaImpares {

        public static void listar(){
            int cont=1;
            while(cont<101){
                if (cont % 2 != 0){
                    System.out.println(cont);
                }
                cont++;
            }
        }

        public static void main(String[] args) {
            System.out.println("Os numeros impares entre 1 e 100 sao:");
            listar();
        }

    }


