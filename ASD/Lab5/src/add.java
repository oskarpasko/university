import javax.swing.*;

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
    }
}