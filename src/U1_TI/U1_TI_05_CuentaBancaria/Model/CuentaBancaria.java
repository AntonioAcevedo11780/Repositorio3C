package model;

import javax.swing.JOptionPane;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public void depositar(double monto) {

        if (monto > 0) {

            double saldoAnterior = saldo;
            saldo += monto;

            JOptionPane.showMessageDialog(null, "<html><b>Saldo anterior:</b> " + saldoAnterior + "<br><br>" + "<b>Monto depositado:</b> " + monto + "<br><br>" + "<b>Saldo actual:</b> " + saldo + "</html>", "Depósito realizado", JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, "<html><b>Error:</b><br><br>El monto debe ser mayor a 0.</html>", "Depósito fallido", JOptionPane.ERROR_MESSAGE);

        }

    }

    public boolean retirar(double monto) {

        if (monto > 0 && saldo >= monto) {

            double saldoAnterior = saldo;
            saldo -= monto;

            JOptionPane.showMessageDialog(null, "<html><b>Monto retirado:</b> " + monto + "<br><br>" + "<b>Saldo anterior:</b> " + saldoAnterior + "<br><br>" + "<b>Saldo actual:</b> " + saldo + "<br><br>" + true + "</html>", "Retiro exitoso", JOptionPane.INFORMATION_MESSAGE);

            return true;

        } else {

            JOptionPane.showMessageDialog(null, "<html><b>Intento de retiro:</b> " + monto + "<br><br>" + "<b>No hay suficiente dinero</b> <br><br>" + false + "</html>", "Error", JOptionPane.ERROR_MESSAGE);

        }

        return false;

    }

    public String getTitular() {

        return titular;

    }

    public double getSaldo() {

        return saldo;

    }

    public void setTitular(String titular) {

        this.titular = titular;

    }
}
