import Model.Curso;
import Model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("POO", "Introducción a la Programación", 3);

        Estudiante e1 = new Estudiante("Ana", "ana@email.com", 8.5);
        Estudiante e2 = new Estudiante("Luis", "luis@email.com", 9.2);
        Estudiante e3 = new Estudiante("Carla", "carla@email.com", 7.8);

        if (curso.inscribir(e1)) {
            System.out.println(e1.getNombre() + " se ha inscrito correctamente.");
        }
        if (curso.inscribir(e2)) {
            System.out.println(e2.getNombre() + " se ha inscrito correctamente.");
        }
        if (curso.inscribir(e3)) {
            System.out.println(e3.getNombre() + " se ha inscrito correctamente.");
        }

        System.out.println();

        curso.mostrarEstudiantes();

        System.out.println();


        System.out.println("Promedio del grupo: " + curso.calcularPromedioGrupo());
    }
}