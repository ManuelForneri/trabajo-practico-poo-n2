package manuel.forneri.Ejercicio4;

public class Personaje {
    protected String nombre;
    protected int vida;
    protected int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void presentarse() {
        System.out.println("Soy " + nombre + ", nivel " + nivel);
    }
}
