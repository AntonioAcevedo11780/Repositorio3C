package Model;

import javax.swing.*;

public class Cuadrado {

    private double lado;
    private String mensaje = "Cuadrado";

    public double sacarPerimetro(){

    return lado * 4;

    }

    public void lado(double lado){

        this.lado = lado;

    }

   public double sacarArea(){

        if (!this.mensaje.isEmpty()){
            darMensajeSecreto();
        }

       System.out.println(this.mensaje);

        return lado * lado;

   }

   private void darMensajeSecreto(){

       System.out.println("Este metodo solo es accesible dentro de la clase, pero no desde afuera");

   }

}

