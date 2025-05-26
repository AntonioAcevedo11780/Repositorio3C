package Model;

import javax.swing.*;

public class Circulo {

    private double radio;

    public double sacarPerimetro(){

        return (3.1416*2)*(radio);

    }

    public void radio(double radio){

        this.radio = radio;

    }

    public double sacarArea(){


        return (3.1416)*(radio*radio);

    }

}

