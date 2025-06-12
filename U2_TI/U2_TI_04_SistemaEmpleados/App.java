package U2_TI.U2_TI_04_SistemaEmpleados;

public class App {

    public static void main(String[] args) {

        Empleado emp1 = new EmpleadoTiempoCompleto("001", "Dani", 5000.0, "Seguro Médico");
        Empleado emp2 = new EmpleadoPorHoras("002", "Carlos", 100.0, 40);

        System.out.println(emp1.getNombre() + " gana: $" + emp1.calcularSalario());
        System.out.println(emp2.getNombre() + " gana: $" + emp2.calcularSalario());
        
    }
}
