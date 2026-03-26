
public class Main {
    public static void main(String[] args) {

        // Juliana Castellanos Vanegas
        // Taller Consulta Clases Abstractas

        Gato a1 = new Gato("Kyle");
        System.out.println(a1.getNombre());
        a1.dormir();
        System.out.println(a1.hacerSonido());

        Paloma a2 = new Paloma("Palomino");
        System.out.println(a2.getNombre());
        a2.dormir();
        System.out.println(a2.hacerSonido());
        System.out.println(a2.volar());

    }
}