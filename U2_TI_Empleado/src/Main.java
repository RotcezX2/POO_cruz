import Model.Empleado;
import Model.EmpleadoPorHoras;
import Model.EmpleadoTiempoCompleto;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto("001", "Ana López", 15000.0, "Seguro médico");
        Empleado empleado2 = new EmpleadoPorHoras("002", "Carlos Ruiz", 120.0, 80);

        System.out.println("Salario de " + empleado1.getNombre() + ": $" + empleado1.calcularSalario());
        System.out.println("Salario de " + empleado2.getNombre() + ": $" + empleado2.calcularSalario());
    }
}