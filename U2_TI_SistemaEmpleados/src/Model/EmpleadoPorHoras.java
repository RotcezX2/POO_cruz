package Model;
public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;

    public EmpleadoPorHoras(String id, String nombre, Double salarioBase, int horasTrabajadas) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public Double calcularSalario(Double salarioBase) {
        return salarioBase*horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    

}
