package UsuarioSeguro;

import java.util.Scanner;

public class PruebaUsuarioSeguro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioSeguro usuario = new UsuarioSeguro();

        // Ingreso de nombre de usuario
        System.out.print("Ingresa el nombre de usuario: ");
        String nombre = scanner.nextLine();
        usuario.setNombreUsuario(nombre);

        // Ingreso de contraseña
        System.out.print("Ingresa la contraseña: ");
        String password = scanner.nextLine();
        usuario.setPassword(password);

        // Validacion de inicializacion
        if (!usuario.estaInicializado()) {
            System.out.println("Error: El usuario no fue correctamente configurado. Terminando programa.");
            return;
        }

        // Pruebas de autenticacion
        System.out.println("\n Probando autenticacion...");

        System.out.print("Ingresa una contraseña para autenticar (prueba incorrecta): ");
        String intento1 = scanner.nextLine();
        if (usuario.autenticar(intento1)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        System.out.print("Ingresa la contraseña correcta: ");
        String intento2 = scanner.nextLine();
        if (usuario.autenticar(intento2)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        System.out.println("\n Codigos ASCII de la contraseña original:");
        for (char c : password.toCharArray()) {
            int ascii = (int) c;
            System.out.println("Caracter '" + c + "' → Código ASCII: " + ascii);
        }

        scanner.close();
    }
}