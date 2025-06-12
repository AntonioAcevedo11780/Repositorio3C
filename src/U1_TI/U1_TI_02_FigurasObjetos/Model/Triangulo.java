package Model;

import javax.swing.*;

public class Triangulo {

    private double lado;
    private double base;
    private double altura;

    public double sacarPerimetro(){

        return (lado*2)*(base);

    }

    public void lado(double lado){

        this.lado = lado;

    }
    public void base(double base){

        this.base = base;

    }
    public void altura(double altura){

        this.altura = altura;

    }

    public double sacarArea(){

        return ((base)*(altura))/2;

    }



}

