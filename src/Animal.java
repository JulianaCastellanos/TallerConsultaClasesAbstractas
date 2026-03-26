public abstract class Animal {

    protected String nombre;

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Metodos

    public void dormir (){
        System.out.println("Durmiendo...");
    }
    public abstract String hacerSonido ();

}
