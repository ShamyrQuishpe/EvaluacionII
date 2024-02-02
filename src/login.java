import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

public class login extends JFrame{
    private JButton loginButton;
    private JTextField usuariotxt;
    private JTextField contrasenatxt;
    private JPanel loginpanel;

    public login(){
        super("LOGIN");
        setContentPane(loginpanel);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario1 = "matzha";
                String contrasena = "pepes";
                String vacio = "";


                    try {
                        if (usuario1.equals(usuariotxt.getText()) && contrasena.equals(contrasenatxt.getText())) {
                            JOptionPane.showMessageDialog(null, "SUCCES");
                            Opciones ventana_opc = new Opciones();
                            dispose();
                            ventana_opc.abrir();

                        } else {
                            JOptionPane.showMessageDialog(null, "Intentelo de nuevo");
                        }
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Error");
                    }

            }
        });
    }
}
