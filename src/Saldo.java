import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame{
    private JPanel saldoPanel;
    private JButton menuButton;

    public Saldo(){
        super("SALDO");
        setContentPane(saldoPanel);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Opciones ventana_opc1 = new Opciones();
                dispose();
                ventana_opc1.abrir();
            }
        });
    }

    public void abrir_Saldo(){
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
