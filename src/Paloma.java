public class Paloma extends Animal implements Volador{

    public Paloma() {
    }

    public Paloma(String nombre) {
        super(nombre);
    }

    public String hacerSonido () {
        return "purrr, puurr";
    }

    public String volar () {
        return "Volando...";
    }

}
