package Model;

public class Curso {
    private String codigo;
    private String nombre;
    private Estudiante[] inscritos;

    public Curso(String codigo, String nombre, int capacidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.inscritos = new Estudiante[capacidad];
    }

    public boolean inscribir(Estudiante e) {
        for (int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] == null) {
                inscritos[i] = e;
                return true;
            }
        }
        return false; // No hay lugar
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes inscritos en el curso " + nombre + " (" + codigo + "):");
        for (Estudiante e : inscritos) {
            if (e != null) {
                System.out.println(e.getNombre() + " | Email: " + e.getEmail() + " | Promedio: " + e.getPromedio());
            }
        }
    }

    public double calcularPromedioGrupo() {
        double suma = 0;
        int contador = 0;
        for (Estudiante e : inscritos) {
            if (e != null) {
                suma += e.getPromedio();
                contador++;
            }
        }
        if (contador == 0) return 0;
        return suma / contador;
    }

}