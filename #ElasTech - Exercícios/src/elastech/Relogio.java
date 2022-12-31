package elastech;

public class Relogio {
    int hora;
    public static String verificaPeriodo(int hora){
        if (hora > 0 && hora<5){
            return "madrugada";
        }else{
            if (hora > 5 && hora<12){
                return "manha";
            }else{
                if (hora >= 12 && hora<18){
                    return "tarde";
                }else{
                    if (hora >= 18 && hora<25){
                    return "noite";}
                    else{
                        return "invalido";
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("O periodo do dia e "+verificaPeriodo(12));
    }


}
