package manuel.forneri.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Programador programador = new Programador("Manuel", 2500.0, "C++");

        System.out.println("=== INFORMACIÓN DEL PROGRAMADOR ===");
        programador.mostrarDatos();

        System.out.println("\n=== ACTUALIZANDO DATOS ===");
        programador.setNombre("Manuel Forneri");
        programador.setSalarioBase(2800.0);
        programador.setLenguaje("Java");

        System.out.println("\n=== INFORMACIÓN ACTUALIZADA ===");
        programador.mostrarDatos();
    }
}
