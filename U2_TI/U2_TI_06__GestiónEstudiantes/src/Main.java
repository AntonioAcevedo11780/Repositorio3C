public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("CS101", "Programación Orientada a Objetos", 3);


        Estudiante estudiante1 = new Estudiante("Antonio", "20243ds076@utez.edu.mx", 8.5);
        Estudiante estudiante2 = new Estudiante("Carlos", "20243ds085@utez.edu.mx", 9.2);
        Estudiante estudiante3 = new Estudiante("Dani", "20243ds075@utez.edu.mx", 7.8);


        curso.inscribir(estudiante1);
        curso.inscribir(estudiante2);
        curso.inscribir(estudiante3);


        double promedio = curso.calcularPromedioGrupo();
        System.out.println("Promedio del grupo: " + promedio);
    }
}