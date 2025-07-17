package manuel.forneri.Ejercicio1;

public class RobotDomestico {
    private String modelo;
    private String marca;
    private int porcentaje_batería;

    // getters
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getPorcentaje_batería() {
        return porcentaje_batería;
    }

    // setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPorcentaje_batería(int porcentaje_batería) {
        this.porcentaje_batería = porcentaje_batería;
    }

    public void mostrarModelo() {
        System.out.println("Modelo: " + modelo);
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }

    public void mostrarPorcentaje_batería() {
        System.out.println("Porcentaje de batería: " + porcentaje_batería);
    }

    public void mostrarTodo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Porcentaje de batería: " + porcentaje_batería);
    }
}
