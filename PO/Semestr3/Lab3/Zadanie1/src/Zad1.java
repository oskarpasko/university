import javax.swing.*;

public class Zad1 extends JFrame{
    private JPanel panel1;
    private JButton saveExistingButton;
    private JButton saveNewButton;
    private JList personList;
    private JTextField nameTextField;
    private JTextField mailTextField;
    private JTextField numberTextField;
    private JTextField addressTextField;
    private JTextField dateTextField;
    private JLabel ageLabel;

    public static void main(String[] args) {
        Zad1 panel = new Zad1();
        panel.setVisible(true);
    }

    public Zad1(){
        super("Confirm Password");
        this.setContentPane(this.panel1); // wyswietlanie okienka na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
    }
}
