package manuel.forneri.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        MascotaVirtual mascota1 = new MascotaVirtual("Lola");
        MascotaVirtual mascota2 = new MascotaVirtual("Mora");

        System.out.println("---BIENVENIDO AL SIMULADOR DE MASCOTAS VIRTUALES---");

        System.out.println("Estado inicial de las mascotas:");
        mascota1.mostrarEstado();
        System.out.println("");
        mascota2.mostrarEstado();
        System.out.println("");

        System.out.println("Interactuando con " + mascota1.getNombre());
        mascota1.alimentar();
        mascota1.jugar();
        mascota1.mostrarEstado();
        System.out.println("");

        System.out.println("Interactuando con " + mascota2.getNombre());
        mascota2.jugar();
        mascota2.alimentar();
        mascota2.mostrarEstado();
        System.out.println("");
    }
}
