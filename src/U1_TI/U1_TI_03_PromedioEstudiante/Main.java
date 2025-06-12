import model.Estudiante;

public class Main {

    public static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[5];


        for (int i = 0; i < estudiantes.length; i++) {

            estudiantes[i] = new Estudiante();
            estudiantes[i].setNombre("Estudiante " + (i + 1));
            estudiantes[i].setMatricula(String.format("20243ds%02d", i + 1));

            for (int j = 0; j < 5; j++) {

                double nota = 60 + i * 2 + j;
                estudiantes[i].setNota(j, nota);

            }
        }

        for (Estudiante e : estudiantes) {

            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Matrícula: " + e.getMatricula());
            System.out.printf("Promedio: %.2f\n", e.calcularPromedio());
            System.out.println("¿Aprobado?: " + (e.aprobado() ? "Sí" : "No"));
            System.out.println("               ");

        }

    }

}
