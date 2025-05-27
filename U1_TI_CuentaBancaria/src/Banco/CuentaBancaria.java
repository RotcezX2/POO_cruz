package Banco;

public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito exitoso de $" + monto);
        } else {
            System.out.println("Monto invalido para depositar.");
        }
    }

    // Método para retirar dinero
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto);
            return true;
        } else {
            System.out.println("Retiro fallido de $" + monto);
            return false;
        }
    }

    // Getters y setter
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
