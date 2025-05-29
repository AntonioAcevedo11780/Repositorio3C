package model;

import javax.swing.JOptionPane;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

     public boolean autenticar(String intentPassword) {

        if (intentPassword.equals(password)) {

            JOptionPane.showMessageDialog(null, "<html><b>Acceso concedido<b></html>", "Login", JOptionPane.INFORMATION_MESSAGE);
            return true;

        } else {

            JOptionPane.showMessageDialog(null, "<html><b>Acceso denegado<b></html>", "Login", JOptionPane.INFORMATION_MESSAGE);
            return false;

        }

}
     public void setNombreUsuario(String nombreUsuario)
    {

        if (nombreUsuario != null && !nombreUsuario.isEmpty()) {

            this.nombreUsuario = nombreUsuario;

        } else {

            JOptionPane.showMessageDialog(null, "<html>El nombre de usuario no puede ser vacío</html>", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void setPassword(String password) {

        if (password.length() >= 8) {

            boolean tieneMayuscula = false;
            boolean tieneMinuscula = false;
            boolean tieneDigito = false;
            int ascii, i = 0;

            while (i < password.length()) {

                ascii = (int) password.charAt(i);
                if (ascii >= 65 && ascii <= 90) tieneMayuscula = true;
                if (ascii >= 97 && ascii <= 122) tieneMinuscula = true;
                if (ascii >= 48 && ascii <= 57) tieneDigito = true;
                i++;

            }

            if (!tieneMayuscula) {

                JOptionPane.showMessageDialog(null, "<html><b>Error:</b> La contraseña debe contener al menos una mayúscula.</html>", "Error", JOptionPane.ERROR_MESSAGE);

            }
            if (!tieneMinuscula) {

                JOptionPane.showMessageDialog(null, "<html><b>Error:</b> La contraseña debe contener al menos una minúscula.</html>", "Error", JOptionPane.ERROR_MESSAGE);

            }
            if (!tieneDigito) {

                JOptionPane.showMessageDialog(null, "<html><b>Error:</b> La contraseña debe contener al menos un número.</html>", "Error", JOptionPane.ERROR_MESSAGE);

            }

            if (tieneMayuscula && tieneMinuscula && tieneDigito) {

                this.password = password;

            }

        } else {

            JOptionPane.showMessageDialog(null, "<html>La contraseña debe tener al menos 8 caracteres.</html>", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }



}
