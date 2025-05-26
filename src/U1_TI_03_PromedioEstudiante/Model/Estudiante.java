package model;

public class Estudiante {

    private String nombre;
    private String matricula;
    private double[] notas = new double[5];


    public double calcularPromedio() {

        double suma = 0;
        for (double nota : notas) {

            suma += nota;

        }
        return suma / notas.length;

    }


    public boolean aprobado() {

        return calcularPromedio() >= 70;

    }


    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getMatricula() {

        return matricula;

    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;

    }

    public double getNota(int i) {

        if (i >= 0 && i < notas.length) {

            return notas[i];

        }
        return -1;

    }

    public void setNota(int i, double n) {

        if (i >= 0 && i < notas.length) {

            notas[i] = n;

        }

    }

}
