public class Curso {

    private String codigo;
    private String nombre;
    private Estudiante[] inscritos;

    public Curso(String codigo, String nombre, int capacidad) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.inscritos = new Estudiante[capacidad];

    }

    public boolean inscribir(Estudiante e) {

        for (int i = 0; i < inscritos.length; i++) {

            if (inscritos[i] == null) {

                inscritos[i] = e;
                return true;

            }
        }

        return false;
    }

    public double calcularPromedioGrupo() {

        double suma = 0;
        int contador = 0;

        for (Estudiante estudiante : inscritos) {

            if (estudiante != null) {

                suma += estudiante.getPromedio();
                contador++;

            }

        }

        if (contador == 0) {

            return 0;

        }

        return suma / contador;

    }

    public String getCodigo() {

        return codigo;

    }

    public String getNombre() {

        return nombre;

    }

}