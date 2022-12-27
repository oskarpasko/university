package SwingLog;

import javax.swing.*;

public class MainPage extends JFrame{
    private JPanel panel1;
    public  JLabel label1;
    private JTextField textField1;

    public MainPage(String str) {
        super("Main Page");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        String id = str;
        label1.setText(id);
    }
}
