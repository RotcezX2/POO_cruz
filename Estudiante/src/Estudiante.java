import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Get y Set para notas individuales
    public double getNota(int i) {
        return notas[i];
    }

    public void setNota(int i, double n) {
        notas[i] = n;
    }

    // Calcular promedio
    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    // Verificar si está aprobado
    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }

    // Método main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[5];

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();

            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            estudiantes[i].setNombre(sc.nextLine());

            System.out.println("Ingrese la matrícula del estudiante " + (i + 1) + ":");
            estudiantes[i].setMatricula(sc.nextLine());

            for (int j = 0; j < 5; j++) {
                double nota;
                do {
                    System.out.print("Ingrese la nota " + (j + 1) + " (0 - 100): ");
                    nota = sc.nextDouble();
                    if (nota < 0 || nota > 100) {
                        System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                    }
                } while (nota < 0 || nota > 100);

                estudiantes[i].setNota(j, nota);
            }

            sc.nextLine(); // Consumir salto de línea
            System.out.println();
        }

        // Mostrar resultados
        System.out.println("Resultados:");
        for (Estudiante e : estudiantes) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Matrícula: " + e.getMatricula());
            System.out.printf("Promedio: %.2f%n", e.calcularPromedio());
            System.out.println("¿Aprobado?: " + (e.aprobado() ? "Sí" : "No"));
            System.out.println("----------------------");
        }

        sc.close();
    }
}
