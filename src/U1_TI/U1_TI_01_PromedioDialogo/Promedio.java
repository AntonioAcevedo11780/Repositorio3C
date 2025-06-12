import javax.swing.*;

public class Promedio {
    public static void main(String[] args) {

        String x1 = JOptionPane.showInputDialog(null, "Dame un número", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        String x2 = JOptionPane.showInputDialog(null, "Dame otro número", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        String x3 = JOptionPane.showInputDialog(null, "Dame otro número", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);

        double resultado = (Double.parseDouble(x1) + Double.parseDouble(x2) + Double.parseDouble(x3)) / 3;

        JOptionPane.showMessageDialog(null, String.format("El promedio es: %.4f", resultado), "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
}
