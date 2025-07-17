package manuel.forneri.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        RobotDomestico robot = new RobotDomestico();
        robot.setModelo("Robot Tech");
        robot.setMarca("Samsung");
        robot.setPorcentaje_batería(100);
        robot.mostrarModelo();
        robot.mostrarMarca();
        robot.mostrarPorcentaje_batería();
        robot.mostrarTodo();
    }
}
