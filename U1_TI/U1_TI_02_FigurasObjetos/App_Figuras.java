import javax.swing.JOptionPane;
import Model.Cuadrado;
import Model.Circulo;
import Model.Triangulo;

public class App_Figuras {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.lado(20);
        double cuadradoPerimetro = cuadrado.sacarPerimetro();
        double cuadradoArea = cuadrado.sacarArea();
        JOptionPane.showMessageDialog(null, String.format("El perimetro del cuadrado es: %.2f", cuadradoPerimetro), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, String.format("El area del cuadrado es: %.2f", cuadradoArea), "Resultado", JOptionPane.INFORMATION_MESSAGE);

        Circulo circulo = new Circulo();
        circulo.radio(1);
        double circuloPerimetro = circulo.sacarPerimetro();
        double circuloArea = circulo.sacarArea();
        JOptionPane.showMessageDialog(null, String.format("El perimetro del circulo es: %.2f", circuloPerimetro), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, String.format("El area del circulo es: %.2f", circuloArea), "Resultado", JOptionPane.INFORMATION_MESSAGE);

        Triangulo triangulo = new Triangulo();
        triangulo.lado(2);
        triangulo.base(2);
        triangulo.altura(2);
        double trianguloPerimetro = triangulo.sacarPerimetro();
        double trianguloArea = triangulo.sacarArea();
        JOptionPane.showMessageDialog(null, String.format("El perimetro del triangulo es: %.2f", trianguloPerimetro), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, String.format("El area del triangulo es: %.2f", trianguloArea), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
