package Banco;

public class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Víctor Cruz");

        System.out.println("Titular de la cuenta: " + cuenta.getTitular());

        cuenta.depositar(1000);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        boolean exito1 = cuenta.retirar(200);
        System.out.println("¿Retiro de 200 exitoso? " + exito1);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        boolean exito2 = cuenta.retirar(10000);
        System.out.println("¿Retiro de 10000 exitoso? " + exito2);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
    }
}
