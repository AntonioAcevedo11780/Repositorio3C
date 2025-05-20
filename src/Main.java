import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {

        String x1 = JOptionPane.showInputDialog(null, "Dame un número", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);
        String x2 = JOptionPane.showInputDialog(null, "Dame otro número", "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);

        int resultado = Integer.parseInt(x1) + Integer.parseInt(x2);

        JOptionPane.showMessageDialog(null, "La suma es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
}