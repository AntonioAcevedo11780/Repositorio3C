public class App {

    public static void main(String[] args) {

        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("001", "Dani", 5000.0, "Seguro Médico");
        EmpleadoPorHoras emp2 = new EmpleadoPorHoras("002", "Carlos", 100.0, 40);

        System.out.println(emp1.getNombre() + " (" + emp1.getId() + ") gana: $" + emp1.calcularSalario()
                + " con beneficios: " + emp1.getBeneficios());

        System.out.println(emp2.getNombre() + " (" + emp2.getId() + ") gana: $" + emp2.calcularSalario()
                + " con horas trabajadas: " + emp2.getHorasTrabajadas());

    }
}
