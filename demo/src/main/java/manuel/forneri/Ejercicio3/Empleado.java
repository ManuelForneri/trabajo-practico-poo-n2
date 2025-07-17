package manuel.forneri.Ejercicio3;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
