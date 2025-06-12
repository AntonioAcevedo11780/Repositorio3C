import model.Computadora;
import javax.swing.JOptionPane;


public class MainComputadora {

    public static void main(String[] args) {

        Computadora computadora = new Computadora();

        computadora.setModelo("Dell Optiplex 4700");

        computadora.encender();
        computadora.encender();
        computadora.apagar();

    }

}
