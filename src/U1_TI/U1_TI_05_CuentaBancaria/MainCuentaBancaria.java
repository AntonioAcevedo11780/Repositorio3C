package main;

import model.CuentaBancaria;

public class MainCuentaBancaria {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.setTitular("Antonio Acevedo Osorio");

        cuenta.depositar(1000);
        cuenta.retirar(200);
        cuenta.retirar(10000);

    }
}
