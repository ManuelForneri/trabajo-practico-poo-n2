package manuel.forneri.Ejercicio3;

public class Programador extends Empleado {
    private String lenguaje;

    // Constructor
    public Programador(String nombre, double salarioBase, String lenguaje) {
        super(nombre, salarioBase);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Lenguaje de programación: " + lenguaje);
    }

    // Getter y setter
    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
