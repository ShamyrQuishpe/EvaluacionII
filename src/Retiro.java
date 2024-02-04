import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame{
    private JPanel retiroPanel;
    private JTextField pantallita;
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
    private JButton deletButton;

    String val_retiro="";

    public Retiro(){
        super("RETIRO");
        setContentPane(retiroPanel);
        setUndecorated(true);

        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Opciones ventana_opc4 = new Opciones();
                dispose();
                ventana_opc4.abrir();
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"1";
                pantallita.setText(val_retiro);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"2";
                pantallita.setText(val_retiro);
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"3";
                pantallita.setText(val_retiro);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"4";
                pantallita.setText(val_retiro);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"5";
                pantallita.setText(val_retiro);
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"6";
                pantallita.setText(val_retiro);
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"8";
                pantallita.setText(val_retiro);
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"9";
                pantallita.setText(val_retiro);
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"0";
                pantallita.setText(val_retiro);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro+"7";
                pantallita.setText(val_retiro);
            }
        });
        deletButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                val_retiro=val_retiro.substring(0,val_retiro.length()-1);
                pantallita.setText(val_retiro);
            }
        });

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(val_retiro);
                Saldo.retiro_saldo(valor);
                JOptionPane.showMessageDialog(null, "Se a realizado el retiro con exito");
            }
        });
    }

    public void abrir_Retiro(){
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
