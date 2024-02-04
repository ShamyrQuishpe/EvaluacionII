import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opciones extends JFrame {
    private JPanel opcionpane;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;

    public Opciones(){

        super("OPCIONES");
        setContentPane(opcionpane);
        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo ventana_saldo = new Saldo();
                dispose();
                ventana_saldo.abrir_Saldo();
            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retiro ventana_retiro = new Retiro();
                dispose();
                ventana_retiro.abrir_Retiro();
            }
        });

        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Deposito ventana_deposito = new Deposito();
                dispose();
                ventana_deposito.abrir_Deposito();
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema :D");
                dispose();
            }
        });
    }

    public void abrir(){
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
