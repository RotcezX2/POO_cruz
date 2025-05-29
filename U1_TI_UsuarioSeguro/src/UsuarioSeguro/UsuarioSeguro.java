package UsuarioSeguro;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    // Setter para nombre de usuario
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
            System.out.println("Error: El nombre de usuario no puede estar vacío.");
        } else {
            this.nombreUsuario = nombreUsuario;
        }
    }

    // Setter para password con validaciones
    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Error: La contraseña debe tener por lo menos 8 caracteres.");
            return;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            if (Character.isLowerCase(c)) tieneMinuscula = true;
            if (Character.isDigit(c)) tieneDigito = true;
        }

        if (!tieneMayuscula) {
            System.out.println("Error: La contraseña debe contener al menos una letra mayúscula.");
        } else if (!tieneMinuscula) {
            System.out.println("Error: La contraseña debe contener al menos una letra minúscula.");
        } else if (!tieneDigito) {
            System.out.println("Error: La contraseña debe contener al menos un dígito.");
        } else {
            this.password = password;
        }
    }

    // Método de autenticación
    public boolean autenticar(String intentoPassword) {
        return this.password != null && this.password.equals(intentoPassword);
    }

    // Metodos opcionales para verificar si está correctamente configurado
    public boolean estaInicializado() {
        return nombreUsuario != null && password != null;
    }
}
