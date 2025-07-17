package manuel.forneri.Ejercicio4;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int nivel, int mana) {
        super(nombre, vida, nivel);
        this.mana = mana;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Maná: " + mana);
    }
}
