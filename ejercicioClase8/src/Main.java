public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        persona.setNombre("Pedro");
        persona.setTelefono(4348120);
        System.out.println(persona.getEdad() +" "+ persona.getNombre() +" "+ persona.getTelefono());

    }
}

class Persona{
    //variables
    private int edad;
    private String nombre;
    private int telefono;

    //getters y setters
    //edad
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    //nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //telefono
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}