package manuel.forneri.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Garen", 100, 10, 15);
        Mago mago = new Mago("Ryze", 80, 15, 200);

        System.out.println("=== PRESENTACIÓN DE PERSONAJES ===");
        guerrero.presentarse();
        System.out.println();
        mago.presentarse();
    }
}
