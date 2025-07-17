package manuel.forneri.Ejercicio2;

public class MascotaVirtual {
    private String nombre;
    private int hambre;
    private int felicidad;

    // Constructor
    public MascotaVirtual(String nombre) {
        this.nombre = nombre;
        this.hambre = 60;
        this.felicidad = 60;
    }

    public void alimentar() {
        this.hambre = Math.max(0, this.hambre - 20);
        this.felicidad = Math.min(100, this.felicidad + 10);
        System.out.println(nombre + " se ha alimentado.");
    }

    public void jugar() {
        this.hambre = Math.min(100, this.hambre + 15);
        this.felicidad = Math.min(100, this.felicidad + 20);
        System.out.println(nombre + " ha jugado contigo y ahora es mas feliz.");
    }

    public void mostrarEstado() {
        System.out.println("Estado de " + nombre);
        System.out.println("Hambre: " + this.hambre + "/100");
        System.out.println("Felicidad: " + this.felicidad + "/100");
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public int getFelicidad() {
        return felicidad;
    }
}
