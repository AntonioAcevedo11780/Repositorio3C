package main;
import model.UsuarioSeguro;
import javax.swing.JOptionPane;

public class MainUsuarioAsegurado
{

    public static void main(String[] args)
    {

        UsuarioSeguro usuarioseguro = new UsuarioSeguro();
        String nombreUsuario;

        do
        {
            nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
            usuarioseguro.setNombreUsuario(nombreUsuario);

        }
        while (nombreUsuario == null || nombreUsuario.isEmpty());
        String password;

        do
        {
            password = JOptionPane.showInputDialog("Ingrese una contraseña:");
            usuarioseguro.setPassword(password);

        }
        while (!usuarioseguro.autenticar(password));

    }

}
