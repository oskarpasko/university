import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JComboBox comboBox1;

    public static void main(String[] args) {
        add setPanel = new add();
        setPanel.setVisible(true);
    }

    public add() {
        super("Wbór kursów!");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Cw cw = new Cw();
                cw.setVisible(true);
            }
        });
    }
}