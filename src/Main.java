import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame login_vt = new login();
                login_vt.setSize(400,400);
                login_vt.setVisible(true);
                login_vt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}