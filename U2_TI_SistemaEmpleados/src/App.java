import Model.Empleado;
import Model.EmpleadoPorHoras;
import Model.EmpleadoTiempoCompleto;

public class App {
    public static void main(String[] args) throws Exception {
        Empleado empleado = new EmpleadoTiempoCompleto("E01", "Juanito Alcachofa", 1160.0, "Pues para su vida en general :P");

        System.out.println();

        System.out.println("ID " + empleado.getId() +
            "\nNombre " + empleado.getNombre() +
            "\nSalario " + empleado.calcularSalario(empleado.getSalarioBase())) ;

        System.out.println();

        EmpleadoPorHoras empleadoh = new EmpleadoPorHoras("E02", "Cruz Antonio", 1500.0, 12);
        System.out.println("ID " + empleadoh.getId() +
            "\nNombre " + empleadoh.getNombre() +
            "\nSalario " + empleadoh.calcularSalario(empleadoh.getSalarioBase()) +
            "\nHoras Trabajadas " + empleadoh.getHorasTrabajadas());
    }
}
