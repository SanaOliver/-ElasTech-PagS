package elastech;

public class Funcionario {

    int salario;

    public static int informaValorImposto(int salario){
        if (salario > 5000){
            return 15;
        }else {
            return 5;
        }
    }

    public static void main(String[] args) {
     int imposto = informaValorImposto(2000);
        System.out.println(imposto);
    }
}
