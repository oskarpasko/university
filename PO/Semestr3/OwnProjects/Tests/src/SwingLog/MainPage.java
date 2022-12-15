package SwingLog;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainPage extends JFrame{
    private JPanel panel1;
    public JLabel label1;
    private JTextField textField1;


    public static void main(String[] args) {
        MainPage panel = new MainPage();
        panel.setVisible(true);

    }

    public MainPage() {
        super("Main Page");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        try {
            label1.setText(Files.readAllLines(Paths.get("zalogowany.txt")).get(0));
            textField1.setText(Files.readAllLines(Paths.get("zalogowany.txt")).get(1));
        }catch (IOException f) {
            System.out.println("An error occurred.");
            f.printStackTrace();
        }

    }
}
