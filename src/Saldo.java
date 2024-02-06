import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame{
    private JPanel saldoPanel;
    private JButton menuButton;
    private JLabel SaldoLabel;
    private static Double saldoActual = 250.0;

    public Saldo(){
        super("SALDO");
        setContentPane(saldoPanel);
        setUndecorated(true);

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
        SaldoLabel.setText("$"+String.valueOf(saldoActual));
    }

    public static void deposito_saldo(Double valorDeposito){
        saldoActual += valorDeposito;
    }

    public static void retiro_saldo(Double valorRertiro){
        if(valorRertiro>saldoActual) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }else{
            saldoActual -= valorRertiro;
            JOptionPane.showMessageDialog(null, "Se a realizado el retiro con exito");
        }
    }

}
