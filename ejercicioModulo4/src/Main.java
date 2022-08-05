public class Main {
    public static void main(String[] args) {

        //Ejercicio if
        int n = 0;
        if (n > 0){
            System.out.println("Es un número positivo");
        }else{
            if (n < 0){
                System.out.println("Es un número negativo");
            }else{
                System.out.println("Es 0");
            }
        }

        //Ejercicio while
        int numeroWhile = 0;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }

        //Ejercicio do while
        int numerodoWhile = 5;
        do {
            System.out.println(numerodoWhile);
            numerodoWhile ++;
        }while (numerodoWhile<3);

        //Ejercicio for
        for(int numeroFor = 0;numeroFor <= 3 ;numeroFor++ ){
            System.out.println(numeroFor);
        }

        //Ejercicio switch
        var estacion = "VERANO";
        switch(estacion) {
            case ("VERANO"):
            case ("PRIMAVERA"):
            case ("OTOÑO"):
            case ("INVIERNO"):
                System.out.println("Estamos en " + estacion);
                break;
            default:
                System.out.println("Eso no es una estación");

        }


    }


}