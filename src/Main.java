public class Main {

    public static void main(String[] args) {
        funcion(1,2,3);
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.nPuertas);

    }
    public static void funcion(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

class Coche {
    public int nPuertas = 0;

    public void aumentarPuertas(){
        this.nPuertas ++;
    }

}