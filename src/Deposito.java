import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito extends JFrame {

    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton enterButton;
    private JButton MENUButton;
    private JPanel depositoPanel;
    private JTextField textFDeposito;
    private JButton deletButton;

    String val_deposito="";

    public Deposito(){
        super("DEPOSITO");
        setContentPane(depositoPanel);
        setUndecorated(true);

        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Opciones ventana_opc3 = new Opciones();
                dispose();
                ventana_opc3.abrir();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"1";
                textFDeposito.setText(val_deposito);
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"2";
                textFDeposito.setText(val_deposito);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"3";
                textFDeposito.setText(val_deposito);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"4";
                textFDeposito.setText(val_deposito);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"5";
                textFDeposito.setText(val_deposito);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"6";
                textFDeposito.setText(val_deposito);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"7";
                textFDeposito.setText(val_deposito);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"8";
                textFDeposito.setText(val_deposito);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"9";
                textFDeposito.setText(val_deposito);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito=val_deposito+"0";
                textFDeposito.setText(val_deposito);
            }
        });

        deletButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_deposito = val_deposito.substring(0,val_deposito.length()-1);
                textFDeposito.setText(val_deposito);
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(val_deposito);
                Saldo.deposito_saldo(valor);
                JOptionPane.showMessageDialog(null, "Se a realizado el deposito con exito");
            }
        });
    }

    public void abrir_Deposito(){
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
