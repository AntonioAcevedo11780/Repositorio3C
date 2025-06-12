package model;
import javax.swing.JOptionPane;


public class Computadora {

    private String marca;
    private String modelo;
    private boolean encendida;

    public void encender() {

        if (encendida != true) {

            encendida = true;
            JOptionPane.showMessageDialog(null, "Encendiendo...........", "Estado", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public void apagar() {

        if (encendida != false) {

            encendida = false;
            JOptionPane.showMessageDialog(null, "Apagando.............", "Estado", JOptionPane.WARNING_MESSAGE);

        }
        
    }

    public String getMarca() {

        return marca;

    }

    public String getModelo() {

        return modelo;

    }

    public void setModelo(String modelo) {

        this.modelo = modelo;

    }

}
