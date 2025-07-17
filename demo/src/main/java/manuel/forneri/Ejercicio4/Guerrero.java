package manuel.forneri.Ejercicio4;

public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int vida, int nivel, int fuerza) {
        super(nombre, vida, nivel);
        this.fuerza = fuerza;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Fuerza: " + fuerza);
    }
}
