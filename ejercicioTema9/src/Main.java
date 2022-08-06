public class Main {
    public static void main(String[] args) {
        Cliente clienteNuevo = new Cliente();
        clienteNuevo.setEdad(26);
        clienteNuevo.setNombre("Pedro");
        clienteNuevo.setTelefono(4348120);
        clienteNuevo.setCredito(500);
        System.out.println("El cliente " + clienteNuevo.getNombre() + " tiene " + clienteNuevo.getEdad() +
                " años. Su teléfono es " + clienteNuevo.getTelefono() + " y posee $" + clienteNuevo.getCredito() +
                " de crédito");

        Trabajador trabajadorNuevo = new Trabajador();
        trabajadorNuevo.setEdad(32);
        trabajadorNuevo.setNombre("Juan");
        trabajadorNuevo.setTelefono(7719141);
        trabajadorNuevo.setSalario(1500);
        System.out.println("El trabajador " + trabajadorNuevo.getNombre() + " tiene " + trabajadorNuevo.getEdad()
                + " años. Su teléfono es " + trabajadorNuevo.getTelefono() + " y su salario es de $" +
                trabajadorNuevo.getSalario());
    }
}

class Persona{
    //atributos
    private int edad;
    private String nombre;
    private int telefono;

    //metodos
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    //atributos
    private int credito;
    //metodos
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    //atributos
    private int salario;
    //metodos
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}